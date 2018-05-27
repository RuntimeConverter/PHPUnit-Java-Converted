package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.TestResult;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.NamePrettifier;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/CliTestDoxPrinter.php

*/

public class CliTestDoxPrinter extends ResultPrinter {

    public Object currentTestResult = null;

    public Object previousTestResult = null;

    public Object nonSuccessfulTestResults = ZVal.newArray();

    public Object prettifier = null;

    public CliTestDoxPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CliTestDoxPrinter.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "out",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "verbose",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "colors")
    @ConvertedParameter(
        index = 3,
        name = "debug",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "numberOfColumns",
        defaultValue = "80",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 5,
        name = "reverse",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, null);
        if (ZVal.isNull(out)) {
            out = ZVal.getNull();
        }
        Object verbose = assignParameter(args, 1, null);
        if (ZVal.isNull(verbose)) {
            verbose = false;
        }
        Object colors = assignParameter(args, 2, null);
        if (ZVal.isNull(colors)) {
            colors = CONST_COLOR_DEFAULT;
        }
        Object debug = assignParameter(args, 3, null);
        if (ZVal.isNull(debug)) {
            debug = false;
        }
        Object numberOfColumns = assignParameter(args, 4, null);
        if (ZVal.isNull(numberOfColumns)) {
            numberOfColumns = 80;
        }
        Object reverse = assignParameter(args, 5, null);
        if (ZVal.isNull(reverse)) {
            reverse = false;
        }
        super.__construct(env, out, verbose, colors, debug, numberOfColumns, reverse);
        toObjectR(this).accessProp(this, env).name("prettifier").set(new NamePrettifier(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object testMethod = null;
        Object annotations = ZVal.newArray();
        Object className = null;
        Object _pClass = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        test, TestCase.class, "PHPUnit\\Framework\\TestCase")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        test,
                                        PhptTestCase.class,
                                        "PHPUnit\\Runner\\PhptTestCase")))) {
            return null;
        }

        _pClass = function_get_class.f.env(env).call(test).value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            annotations = env.callMethod(test, "getAnnotations", CliTestDoxPrinter.class);
            if (ZVal.isset(ZVal.getElementRecursive(annotations, "class", "testdox", 0))) {
                className =
                        ZVal.assign(ZVal.getElementRecursive(annotations, "class", "testdox", 0));

            } else {
                className =
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("prettifier").value(),
                                "prettifyTestClass",
                                CliTestDoxPrinter.class,
                                _pClass);
            }

            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", "testdox", 0))) {
                testMethod =
                        ZVal.assign(ZVal.getElementRecursive(annotations, "method", "testdox", 0));

            } else {
                testMethod =
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("prettifier").value(),
                                "prettifyTestMethod",
                                CliTestDoxPrinter.class,
                                env.callMethod(test, "getName", CliTestDoxPrinter.class, false));
            }

            testMethod =
                    toStringR(testMethod, env)
                            + toStringR(
                                    NamespaceGlobal.substr
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            test,
                                                            "getDataSetAsString",
                                                            CliTestDoxPrinter.class,
                                                            false),
                                                    5)
                                            .value(),
                                    env);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, PhptTestCase.class, "PHPUnit\\Runner\\PhptTestCase"))) {
            className = ZVal.assign(_pClass);
            testMethod = env.callMethod(test, "getName", CliTestDoxPrinter.class);
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("currentTestResult")
                .set(
                        new TestResult(
                                env,
                                new Closure(env) {
                                    @Override
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object color = assignParameter(args, 0, null);
                                        Object buffer = assignParameter(args, 1, null);
                                        return ZVal.assign(
                                                env.callMethod(
                                                        this,
                                                        "formatWithColor",
                                                        CliTestDoxPrinter.class,
                                                        color,
                                                        buffer));
                                    }
                                },
                                className,
                                testMethod));
        super.startTest(env, test);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object time = assignParameter(args, 1, null);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        test, TestCase.class, "PHPUnit\\Framework\\TestCase")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        test,
                                        PhptTestCase.class,
                                        "PHPUnit\\Runner\\PhptTestCase")))) {
            return null;
        }

        super.endTest(env, test, time);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                "setRuntime",
                CliTestDoxPrinter.class,
                time);
        env.callMethod(
                this,
                "write",
                CliTestDoxPrinter.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                        "toString",
                        CliTestDoxPrinter.class,
                        toObjectR(this).accessProp(this, env).name("previousTestResult").value(),
                        toObjectR(this).accessProp(this, env).name("verbose").value()));
        toObjectR(this)
                .accessProp(this, env)
                .name("previousTestResult")
                .set(toObjectR(this).accessProp(this, env).name("currentTestResult").value());
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                        "isTestSuccessful",
                        CliTestDoxPrinter.class))) {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("nonSuccessfulTestResults").value(),
                    toObjectR(this).accessProp(this, env).name("currentTestResult").value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addError(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2718"),
                toStringR(t, env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "e", typeHint = "PHPUnit\\Framework\\Warning")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addWarning(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object e = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2718"),
                toStringR(e, env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(
        index = 1,
        name = "e",
        typeHint = "PHPUnit\\Framework\\AssertionFailedError"
    )
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addFailure(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object e = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-red", "\u2718"),
                toStringR(e, env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addIncompleteTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2205"),
                toStringR(t, env),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addRiskyTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2622"),
                toStringR(t, env),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addSkippedTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestResult").value(),
                "fail",
                CliTestDoxPrinter.class,
                env.callMethod(
                        this, "formatWithColor", CliTestDoxPrinter.class, "fg-yellow", "\u2192"),
                toStringR(t, env),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "progress", typeHint = "string")
    public Object writeProgress(RuntimeEnv env, Object... args) {
        Object progress = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object printResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(this, "printHeader", CliTestDoxPrinter.class);
        env.callMethod(
                this,
                "printNonSuccessfulTestsSummary",
                CliTestDoxPrinter.class,
                env.callMethod(result, "count", CliTestDoxPrinter.class));
        env.callMethod(this, "printFooter", CliTestDoxPrinter.class, result);
        return null;
    }

    @ConvertedMethod
    protected Object printHeader(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "write",
                CliTestDoxPrinter.class,
                "\n" + toStringR(Timer.runtimeStaticObject.resourceUsage(env), env) + "\n\n");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "numberOfExecutedTests", typeHint = "int")
    private Object printNonSuccessfulTestsSummary(RuntimeEnv env, Object... args) {
        Object numberOfExecutedTests = assignParameter(args, 0, null);
        Object previousTestResult = null;
        Object testResult = null;
        Object numberOfNonSuccessfulTests = null;
        numberOfNonSuccessfulTests =
                CRArrayF.count
                        .env(env)
                        .call(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("nonSuccessfulTestResults")
                                        .value())
                        .value();
        if (ZVal.strictEqualityCheck(numberOfNonSuccessfulTests, "===", 0)) {
            return null;
        }

        if (ZVal.isGreaterThanOrEqualTo(
                ZVal.divide(numberOfNonSuccessfulTests, numberOfExecutedTests), ">=", 0.7)) {
            return null;
        }

        env.callMethod(
                this, "write", CliTestDoxPrinter.class, "Summary of non-successful tests:\n\n");
        previousTestResult = ZVal.getNull();
        for (ZPair zpairResult421 :
                ZVal.getIterable(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("nonSuccessfulTestResults")
                                .value(),
                        env,
                        true)) {
            testResult = ZVal.assign(zpairResult421.getValue());
            env.callMethod(
                    this,
                    "write",
                    CliTestDoxPrinter.class,
                    env.callMethod(
                            testResult,
                            "toString",
                            CliTestDoxPrinter.class,
                            previousTestResult,
                            toObjectR(this).accessProp(this, env).name("verbose").value()));
            previousTestResult = ZVal.assign(testResult);
        }

        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\CliTestDoxPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ResultPrinter.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\CliTestDoxPrinter")
                    .setLookup(CliTestDoxPrinter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "autoFlush",
                            "colors",
                            "column",
                            "currentTestResult",
                            "debug",
                            "defectListPrinted",
                            "lastTestFailed",
                            "maxColumn",
                            "nonSuccessfulTestResults",
                            "numAssertions",
                            "numTests",
                            "numTestsRun",
                            "numTestsWidth",
                            "numberOfColumns",
                            "out",
                            "outTarget",
                            "prettifier",
                            "previousTestResult",
                            "reverse",
                            "verbose")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/CliTestDoxPrinter.php")
                    .addInterface("TestListener")
                    .addExtendsClass("PHPUnit\\TextUI\\ResultPrinter")
                    .addExtendsClass("PHPUnit\\Util\\Printer")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
