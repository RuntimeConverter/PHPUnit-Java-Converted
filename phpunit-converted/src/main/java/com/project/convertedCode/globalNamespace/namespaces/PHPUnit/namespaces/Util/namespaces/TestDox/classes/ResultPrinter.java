package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.NamePrettifier;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/ResultPrinter.php

*/

public abstract class ResultPrinter extends Printer implements TestListener {

    public Object prettifier = null;

    public Object testClass = "";

    public Object testStatus = null;

    public Object tests = ZVal.newArray();

    public Object successful = 0;

    public Object warned = 0;

    public Object failed = 0;

    public Object risky = 0;

    public Object skipped = 0;

    public Object incomplete = 0;

    public Object currentTestClassPrettified = null;

    public Object currentTestMethodPrettified = null;

    public Object groups = null;

    public Object excludeGroups = null;

    public ResultPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResultPrinter.class) {
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
        name = "groups",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "excludeGroups",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, null);
        if (ZVal.isNull(out)) {
            out = ZVal.getNull();
        }
        Object groups = assignParameter(args, 1, null);
        if (ZVal.isNull(groups)) {
            groups = ZVal.newArray();
        }
        Object excludeGroups = assignParameter(args, 2, null);
        if (ZVal.isNull(excludeGroups)) {
            excludeGroups = ZVal.newArray();
        }
        super.__construct(env, out);
        toObjectR(this).accessProp(this, env).name("groups").set(groups);
        toObjectR(this).accessProp(this, env).name("excludeGroups").set(excludeGroups);
        toObjectR(this).accessProp(this, env).name("prettifier").set(new NamePrettifier(env));
        env.callMethod(this, "startRun", ResultPrinter.class);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        env.callMethod(this, "doEndClass", ResultPrinter.class);
        env.callMethod(this, "endRun", ResultPrinter.class);
        super.flush(env);
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
        if (!ZVal.isTrue(env.callMethod(this, "isOfInterest", ResultPrinter.class, test))) {
            return null;
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testStatus")
                .set(BaseTestRunner.CONST_STATUS_ERROR);
        toObjectR(this)
                .accessProp(this, env)
                .name("failed")
                .set(ZVal.increment(toObjectR(this).accessProp(this, env).name("failed").value()));
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
        if (!ZVal.isTrue(env.callMethod(this, "isOfInterest", ResultPrinter.class, test))) {
            return null;
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testStatus")
                .set(BaseTestRunner.CONST_STATUS_WARNING);
        toObjectR(this)
                .accessProp(this, env)
                .name("warned")
                .set(ZVal.increment(toObjectR(this).accessProp(this, env).name("warned").value()));
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
        if (!ZVal.isTrue(env.callMethod(this, "isOfInterest", ResultPrinter.class, test))) {
            return null;
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testStatus")
                .set(BaseTestRunner.CONST_STATUS_FAILURE);
        toObjectR(this)
                .accessProp(this, env)
                .name("failed")
                .set(ZVal.increment(toObjectR(this).accessProp(this, env).name("failed").value()));
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
        if (!ZVal.isTrue(env.callMethod(this, "isOfInterest", ResultPrinter.class, test))) {
            return null;
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testStatus")
                .set(BaseTestRunner.CONST_STATUS_INCOMPLETE);
        toObjectR(this)
                .accessProp(this, env)
                .name("incomplete")
                .set(
                        ZVal.increment(
                                toObjectR(this).accessProp(this, env).name("incomplete").value()));
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
        if (!ZVal.isTrue(env.callMethod(this, "isOfInterest", ResultPrinter.class, test))) {
            return null;
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testStatus")
                .set(BaseTestRunner.CONST_STATUS_RISKY);
        toObjectR(this)
                .accessProp(this, env)
                .name("risky")
                .set(ZVal.increment(toObjectR(this).accessProp(this, env).name("risky").value()));
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
        if (!ZVal.isTrue(env.callMethod(this, "isOfInterest", ResultPrinter.class, test))) {
            return null;
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testStatus")
                .set(BaseTestRunner.CONST_STATUS_SKIPPED);
        toObjectR(this)
                .accessProp(this, env)
                .name("skipped")
                .set(ZVal.increment(toObjectR(this).accessProp(this, env).name("skipped").value()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object annotations = ZVal.newArray();
        Object _pClass = null;
        Object classAnnotations = ZVal.newArray();
        if (!ZVal.isTrue(env.callMethod(this, "isOfInterest", ResultPrinter.class, test))) {
            return null;
        }

        _pClass = function_get_class.f.env(env).call(test).value();
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("testClass").value(), "!==", _pClass)) {
            if (ZVal.strictNotEqualityCheck(
                    toObjectR(this).accessProp(this, env).name("testClass").value(), "!==", "")) {
                env.callMethod(this, "doEndClass", ResultPrinter.class);
            }

            classAnnotations = Test.runtimeStaticObject.parseTestMethodAnnotations(env, _pClass);
            if (ZVal.isset(ZVal.getElementRecursive(classAnnotations, "class", "testdox", 0))) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("currentTestClassPrettified")
                        .set(ZVal.getElementRecursive(classAnnotations, "class", "testdox", 0));

            } else {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("currentTestClassPrettified")
                        .set(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("prettifier")
                                                .value(),
                                        "prettifyTestClass",
                                        ResultPrinter.class,
                                        _pClass));
            }

            env.callMethod(this, "startClass", ResultPrinter.class, _pClass);
            toObjectR(this).accessProp(this, env).name("testClass").set(_pClass);
            toObjectR(this).accessProp(this, env).name("tests").set(ZVal.newArray());
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            annotations = env.callMethod(test, "getAnnotations", ResultPrinter.class);
            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", "testdox", 0))) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("currentTestMethodPrettified")
                        .set(ZVal.getElementRecursive(annotations, "method", "testdox", 0));

            } else {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("currentTestMethodPrettified")
                        .set(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("prettifier")
                                                .value(),
                                        "prettifyTestMethod",
                                        ResultPrinter.class,
                                        env.callMethod(
                                                test, "getName", ResultPrinter.class, false)));
            }

            if (ZVal.isTrue(env.callMethod(test, "usesDataProvider", ResultPrinter.class))) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("currentTestMethodPrettified")
                        .set(
                                toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("currentTestMethodPrettified")
                                                        .value(),
                                                env)
                                        + " "
                                        + toStringR(
                                                env.callMethod(
                                                        test,
                                                        "dataDescription",
                                                        ResultPrinter.class),
                                                env));
            }
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testStatus")
                .set(BaseTestRunner.CONST_STATUS_PASSED);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object time = assignParameter(args, 1, null);
        if (!ZVal.isTrue(env.callMethod(this, "isOfInterest", ResultPrinter.class, test))) {
            return null;
        }

        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("tests").value(),
                ZVal.newArray(
                        new ZPair(
                                0,
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("currentTestMethodPrettified")
                                        .value()),
                        new ZPair(
                                1,
                                toObjectR(this).accessProp(this, env).name("testStatus").value())));
        toObjectR(this)
                .accessProp(this, env)
                .name("currentTestClassPrettified")
                .set(ZVal.getNull());
        toObjectR(this)
                .accessProp(this, env)
                .name("currentTestMethodPrettified")
                .set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    protected Object doEndClass(RuntimeEnv env, Object... args) {
        Object test = ZVal.newArray();
        for (ZPair zpairResult422 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("tests").value(), env, true)) {
            test = ZVal.assign(zpairResult422.getValue());
            env.callMethod(
                    this,
                    "onTest",
                    ResultPrinter.class,
                    ZVal.getElement(test, 0),
                    ZVal.strictEqualityCheck(
                            ZVal.getElement(test, 1), "===", BaseTestRunner.CONST_STATUS_PASSED));
        }

        env.callMethod(
                this,
                "endClass",
                ResultPrinter.class,
                toObjectR(this).accessProp(this, env).name("testClass").value());
        return null;
    }

    @ConvertedMethod
    protected Object startRun(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    protected Object startClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "success",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object onTest(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object success = assignParameter(args, 1, null);
        if (ZVal.isNull(success)) {
            success = true;
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    protected Object endClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    protected Object endRun(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    private Object isOfInterest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object group = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, WarningTestCase.class, "PHPUnit\\Framework\\WarningTestCase"))) {
            return ZVal.assign(false);
        }

        if (!ZVal.isEmpty(toObjectR(this).accessProp(this, env).name("groups").value())) {
            for (ZPair zpairResult423 :
                    ZVal.getIterable(
                            env.callMethod(test, "getGroups", ResultPrinter.class), env, true)) {
                group = ZVal.assign(zpairResult423.getValue());
                if (CRArrayF.in_array
                        .env(env)
                        .call(group, toObjectR(this).accessProp(this, env).name("groups").value())
                        .getBool()) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        if (!ZVal.isEmpty(toObjectR(this).accessProp(this, env).name("excludeGroups").value())) {
            for (ZPair zpairResult424 :
                    ZVal.getIterable(
                            env.callMethod(test, "getGroups", ResultPrinter.class), env, true)) {
                group = ZVal.assign(zpairResult424.getValue());
                if (CRArrayF.in_array
                        .env(env)
                        .call(
                                group,
                                toObjectR(this).accessProp(this, env).name("excludeGroups").value())
                        .getBool()) {
                    return ZVal.assign(false);
                }
            }

            return ZVal.assign(true);
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\ResultPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Printer.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\ResultPrinter")
                    .setLookup(ResultPrinter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "autoFlush",
                            "currentTestClassPrettified",
                            "currentTestMethodPrettified",
                            "excludeGroups",
                            "failed",
                            "groups",
                            "incomplete",
                            "out",
                            "outTarget",
                            "prettifier",
                            "risky",
                            "skipped",
                            "successful",
                            "testClass",
                            "testStatus",
                            "tests",
                            "warned")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/ResultPrinter.php")
                    .addInterface("TestListener")
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
