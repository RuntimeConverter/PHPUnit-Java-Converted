package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExceptionWrapper;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Log/TeamCity.php

*/

public class TeamCity extends ResultPrinter {

    public Object isSummaryTestCountPrinted = false;

    public Object startedTestName = null;

    public Object flowId = null;

    public TeamCity(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TeamCity.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object printResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(this, "printHeader", TeamCity.class);
        env.callMethod(this, "printFooter", TeamCity.class, result);
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
                this,
                "printEvent",
                TeamCity.class,
                "testFailed",
                ZVal.newArray(
                        new ZPair("name", env.callMethod(test, "getName", TeamCity.class)),
                        new ZPair("message", runtimeStaticObject.getMessage(env, t)),
                        new ZPair("details", runtimeStaticObject.getDetails(env, t))));
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
                this,
                "printEvent",
                TeamCity.class,
                "testFailed",
                ZVal.newArray(
                        new ZPair("name", env.callMethod(test, "getName", TeamCity.class)),
                        new ZPair("message", runtimeStaticObject.getMessage(env, e)),
                        new ZPair("details", runtimeStaticObject.getDetails(env, e))));
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
        Object comparisonFailure = null;
        Object actualString = null;
        Object parameters = ZVal.newArray();
        Object expectedString = null;
        parameters =
                ZVal.newArray(
                        new ZPair("name", env.callMethod(test, "getName", TeamCity.class)),
                        new ZPair("message", runtimeStaticObject.getMessage(env, e)),
                        new ZPair("details", runtimeStaticObject.getDetails(env, e)));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        ExpectationFailedException.class,
                        "PHPUnit\\Framework\\ExpectationFailedException"))) {
            comparisonFailure = env.callMethod(e, "getComparisonFailure", TeamCity.class);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            comparisonFailure,
                            ComparisonFailure.class,
                            "SebastianBergmann\\Comparator\\ComparisonFailure"))) {
                expectedString =
                        env.callMethod(comparisonFailure, "getExpectedAsString", TeamCity.class);
                if (ZVal.toBool(ZVal.strictEqualityCheck(expectedString, "===", ZVal.getNull()))
                        || ZVal.toBool(ZVal.isEmpty(expectedString))) {
                    expectedString =
                            runtimeStaticObject.getPrimitiveValueAsString(
                                    env,
                                    env.callMethod(
                                            comparisonFailure, "getExpected", TeamCity.class));
                }

                actualString =
                        env.callMethod(comparisonFailure, "getActualAsString", TeamCity.class);
                if (ZVal.toBool(ZVal.strictEqualityCheck(actualString, "===", ZVal.getNull()))
                        || ZVal.toBool(ZVal.isEmpty(actualString))) {
                    actualString =
                            runtimeStaticObject.getPrimitiveValueAsString(
                                    env,
                                    env.callMethod(comparisonFailure, "getActual", TeamCity.class));
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(actualString, "!==", ZVal.getNull()))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        expectedString, "!==", ZVal.getNull()))) {
                    ZVal.putArrayElement(parameters, "type", "comparisonFailure");
                    ZVal.putArrayElement(parameters, "actual", actualString);
                    ZVal.putArrayElement(parameters, "expected", expectedString);
                }
            }
        }

        env.callMethod(this, "printEvent", TeamCity.class, "testFailed", parameters);
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
                this,
                "printIgnoredTest",
                TeamCity.class,
                env.callMethod(test, "getName", TeamCity.class),
                t);
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
        env.callMethod(this, "addError", TeamCity.class, test, t, time);
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
        Object testName = null;
        testName = env.callMethod(test, "getName", TeamCity.class);
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("startedTestName").value(),
                "!==",
                testName)) {
            env.callMethod(this, "startTest", TeamCity.class, test);
            env.callMethod(this, "printIgnoredTest", TeamCity.class, testName, t);
            env.callMethod(this, "endTest", TeamCity.class, test, time);

        } else {
            env.callMethod(this, "printIgnoredTest", TeamCity.class, testName, t);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testName")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    public Object printIgnoredTest(RuntimeEnv env, Object... args) {
        Object testName = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        env.callMethod(
                this,
                "printEvent",
                TeamCity.class,
                "testIgnored",
                ZVal.newArray(
                        new ZPair("name", testName),
                        new ZPair("message", runtimeStaticObject.getMessage(env, t)),
                        new ZPair("details", runtimeStaticObject.getDetails(env, t))));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object fileName = null;
        Object split = ZVal.newArray();
        Object parameters = ZVal.newArray();
        Object suiteName = null;
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.stripos
                        .env(env)
                        .call(
                                NamespaceGlobal.ini_get.env(env).call("disable_functions").value(),
                                "getmypid")
                        .value(),
                "===",
                false)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("flowId")
                    .set(NamespaceGlobal.getmypid.env(env).call().value());

        } else {
            toObjectR(this).accessProp(this, env).name("flowId").set(false);
        }

        if (!toObjectR(this).accessProp(this, env).name("isSummaryTestCountPrinted").getBool()) {
            toObjectR(this).accessProp(this, env).name("isSummaryTestCountPrinted").set(true);
            env.callMethod(
                    this,
                    "printEvent",
                    TeamCity.class,
                    "testCount",
                    ZVal.newArray(new ZPair("count", CRArrayF.count.env(env).call(suite).value())));
        }

        suiteName = env.callMethod(suite, "getName", TeamCity.class);
        if (ZVal.isEmpty(suiteName)) {
            return null;
        }

        parameters = ZVal.newArray(new ZPair("name", suiteName));
        if (function_class_exists.f.env(env).call(suiteName, false).getBool()) {
            fileName = runtimeStaticObject.getFileName(env, suiteName);
            ZVal.putArrayElement(
                    parameters,
                    "locationHint",
                    "php_qn://" + toStringR(fileName, env) + "::\\" + toStringR(suiteName, env));

        } else {
            split = NamespaceGlobal.explode.env(env).call("::", suiteName).value();
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    CRArrayF.count.env(env).call(split).value(), "===", 2))
                    && ZVal.toBool(
                            function_method_exists
                                    .f
                                    .env(env)
                                    .call(ZVal.getElement(split, 0), ZVal.getElement(split, 1))
                                    .value())) {
                fileName = runtimeStaticObject.getFileName(env, ZVal.getElement(split, 0));
                ZVal.putArrayElement(
                        parameters,
                        "locationHint",
                        "php_qn://"
                                + toStringR(fileName, env)
                                + "::\\"
                                + toStringR(suiteName, env));
                ZVal.putArrayElement(parameters, "name", ZVal.getElement(split, 1));
            }
        }

        env.callMethod(this, "printEvent", TeamCity.class, "testSuiteStarted", parameters);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object split = ZVal.newArray();
        Object parameters = ZVal.newArray();
        Object suiteName = null;
        suiteName = env.callMethod(suite, "getName", TeamCity.class);
        if (ZVal.isEmpty(suiteName)) {
            return null;
        }

        parameters = ZVal.newArray(new ZPair("name", suiteName));
        if (!function_class_exists.f.env(env).call(suiteName, false).getBool()) {
            split = NamespaceGlobal.explode.env(env).call("::", suiteName).value();
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    CRArrayF.count.env(env).call(split).value(), "===", 2))
                    && ZVal.toBool(
                            function_method_exists
                                    .f
                                    .env(env)
                                    .call(ZVal.getElement(split, 0), ZVal.getElement(split, 1))
                                    .value())) {
                ZVal.putArrayElement(parameters, "name", ZVal.getElement(split, 1));
            }
        }

        env.callMethod(this, "printEvent", TeamCity.class, "testSuiteFinished", parameters);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object fileName = null;
        Object className = null;
        Object params = ZVal.newArray();
        Object testName = null;
        testName = env.callMethod(test, "getName", TeamCity.class);
        toObjectR(this).accessProp(this, env).name("startedTestName").set(testName);
        params = ZVal.newArray(new ZPair("name", testName));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            className = function_get_class.f.env(env).call(test).value();
            fileName = runtimeStaticObject.getFileName(env, className);
            ZVal.putArrayElement(
                    params,
                    "locationHint",
                    "php_qn://"
                            + toStringR(fileName, env)
                            + "::\\"
                            + toStringR(className, env)
                            + "::"
                            + toStringR(testName, env));
        }

        env.callMethod(this, "printEvent", TeamCity.class, "testStarted", params);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object time = assignParameter(args, 1, null);
        super.endTest(env, test, time);
        env.callMethod(
                this,
                "printEvent",
                TeamCity.class,
                "testFinished",
                ZVal.newArray(
                        new ZPair("name", env.callMethod(test, "getName", TeamCity.class)),
                        new ZPair(
                                "duration",
                                ZVal.toLong(
                                        ZVal.multiply(
                                                NamespaceGlobal.round
                                                        .env(env)
                                                        .call(time, 2)
                                                        .value(),
                                                1000)))));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "progress", typeHint = "string")
    protected Object writeProgress(RuntimeEnv env, Object... args) {
        Object progress = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "params", defaultValue = "", defaultValueType = "array")
    private Object printEvent(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, null);
        Object params = assignParameter(args, 1, null);
        if (ZVal.isNull(params)) {
            params = ZVal.newArray();
        }
        Object escapedValue = null;
        Object value = null;
        Object key = null;
        env.callMethod(this, "write", TeamCity.class, "\n##teamcity[" + toStringR(eventName, env));
        if (toObjectR(this).accessProp(this, env).name("flowId").getBool()) {
            ZVal.putArrayElement(
                    params, "flowId", toObjectR(this).accessProp(this, env).name("flowId").value());
        }

        for (ZPair zpairResult390 : ZVal.getIterable(params, env, false)) {
            key = ZVal.assign(zpairResult390.getKey());
            value = ZVal.assign(zpairResult390.getValue());
            escapedValue = runtimeStaticObject.escapeValue(env, value);
            env.callMethod(
                    this,
                    "write",
                    TeamCity.class,
                    " " + toStringR(key, env) + "='" + toStringR(escapedValue, env) + "'");
        }

        env.callMethod(this, "write", TeamCity.class, "]\n");
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Log\\TeamCity";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ResultPrinter.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
        private Object getMessage(RuntimeEnv env, Object... args) {
            Object t = assignParameter(args, 0, null);
            Object message = null;
            message = "";
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            t, ExceptionWrapper.class, "PHPUnit\\Framework\\ExceptionWrapper"))) {
                if (ZVal.strictNotEqualityCheck(
                        env.callMethod(t, "getClassName", TeamCity.class), "!==", "")) {
                    message =
                            toStringR(message, env)
                                    + toStringR(
                                            env.callMethod(t, "getClassName", TeamCity.class), env);
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(message, "!==", ""))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        env.callMethod(t, "getMessage", TeamCity.class),
                                        "!==",
                                        ""))) {
                    message = toStringR(message, env) + " : ";
                }
            }

            return ZVal.assign(
                    toStringR(message, env)
                            + toStringR(env.callMethod(t, "getMessage", TeamCity.class), env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
        private Object getDetails(RuntimeEnv env, Object... args) {
            Object t = assignParameter(args, 0, null);
            Object previous = null;
            Object stackTrace = null;
            stackTrace = Filter.runtimeStaticObject.getFilteredStacktrace(env, t);
            previous =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    t,
                                                    ExceptionWrapper.class,
                                                    "PHPUnit\\Framework\\ExceptionWrapper"))
                                    ? env.callMethod(t, "getPreviousWrapped", TeamCity.class)
                                    : env.callMethod(t, "getPrevious", TeamCity.class));
            while (ZVal.isTrue(previous)) {
                stackTrace =
                        toStringR(stackTrace, env)
                                + "\nCaused by\n"
                                + toStringR(
                                        TestFailure.runtimeStaticObject.exceptionToString(
                                                env, previous),
                                        env)
                                + "\n"
                                + toStringR(
                                        Filter.runtimeStaticObject.getFilteredStacktrace(
                                                env, previous),
                                        env);
                previous =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        previous,
                                                        ExceptionWrapper.class,
                                                        "PHPUnit\\Framework\\ExceptionWrapper"))
                                        ? env.callMethod(
                                                previous, "getPreviousWrapped", TeamCity.class)
                                        : env.callMethod(previous, "getPrevious", TeamCity.class));
            }

            return ZVal.assign(
                    " "
                            + toStringR(
                                    NamespaceGlobal.str_replace
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call("\n", "\n ", stackTrace)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        private Object getPrimitiveValueAsString(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            if (ZVal.strictEqualityCheck(value, "===", ZVal.getNull())) {
                return "null";
            }

            if (NamespaceGlobal.is_bool.env(env).call(value).getBool()) {
                return ZVal.assign(ZVal.strictEqualityCheck(value, "===", true) ? "true" : "false");
            }

            if (NamespaceGlobal.is_scalar.env(env).call(value).getBool()) {
                return ZVal.assign(NamespaceGlobal.print_r.env(env).call(value, true).value());
            }

            return ZVal.assign(ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text", typeHint = "string")
        private Object escapeValue(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, null);
            return ZVal.assign(
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, "|"),
                                            new ZPair(1, "'"),
                                            new ZPair(2, "\n"),
                                            new ZPair(3, "\r"),
                                            new ZPair(4, "]"),
                                            new ZPair(5, "[")),
                                    ZVal.newArray(
                                            new ZPair(0, "||"),
                                            new ZPair(1, "|'"),
                                            new ZPair(2, "|n"),
                                            new ZPair(3, "|r"),
                                            new ZPair(4, "|]"),
                                            new ZPair(5, "|[")),
                                    text)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className")
        private Object getFileName(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object reflectionClass = null;
            reflectionClass = new ReflectionClass(env, className);
            return ZVal.assign(env.callMethod(reflectionClass, "getFileName", TeamCity.class));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Log\\TeamCity")
                    .setLookup(TeamCity.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "autoFlush",
                            "colors",
                            "column",
                            "debug",
                            "defectListPrinted",
                            "flowId",
                            "isSummaryTestCountPrinted",
                            "lastTestFailed",
                            "maxColumn",
                            "numAssertions",
                            "numTests",
                            "numTestsRun",
                            "numTestsWidth",
                            "numberOfColumns",
                            "out",
                            "outTarget",
                            "reverse",
                            "startedTestName",
                            "verbose")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Log/TeamCity.php")
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
