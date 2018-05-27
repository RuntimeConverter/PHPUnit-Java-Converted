package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/TestResult.php

*/

public final class TestResult extends RuntimeClassBase {

    public Object colorize = null;

    public Object testClass = null;

    public Object testMethod = null;

    public Object testSuccesful = null;

    public Object symbol = null;

    public Object additionalInformation = null;

    public Object additionalInformationVerbose = null;

    public Object runtime = null;

    public TestResult(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestResult.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "colorize", typeHint = "callable")
    @ConvertedParameter(index = 1, name = "testClass", typeHint = "string")
    @ConvertedParameter(index = 2, name = "testMethod", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object colorize = assignParameter(args, 0, null);
        Object testClass = assignParameter(args, 1, null);
        Object testMethod = assignParameter(args, 2, null);
        toObjectR(this).accessProp(this, env).name("colorize").set(colorize);
        toObjectR(this).accessProp(this, env).name("testClass").set(testClass);
        toObjectR(this).accessProp(this, env).name("testMethod").set(testMethod);
        toObjectR(this).accessProp(this, env).name("testSuccesful").set(true);
        toObjectR(this)
                .accessProp(this, env)
                .name("symbol")
                .set(
                        env.callFunctionDynamic(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("colorize")
                                                .value(),
                                        new RuntimeArgsWithReferences(),
                                        "fg-green",
                                        "\u2714")
                                .value());
        toObjectR(this).accessProp(this, env).name("additionalInformation").set("");
        return null;
    }

    @ConvertedMethod
    public Object isTestSuccessful(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("testSuccesful").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "symbol", typeHint = "string")
    @ConvertedParameter(index = 1, name = "additionalInformation", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "additionalInformationVerbose",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object fail(RuntimeEnv env, Object... args) {
        Object symbol = assignParameter(args, 0, null);
        Object additionalInformation = assignParameter(args, 1, null);
        Object additionalInformationVerbose = assignParameter(args, 2, null);
        if (ZVal.isNull(additionalInformationVerbose)) {
            additionalInformationVerbose = false;
        }
        toObjectR(this).accessProp(this, env).name("testSuccesful").set(false);
        toObjectR(this).accessProp(this, env).name("symbol").set(symbol);
        toObjectR(this)
                .accessProp(this, env)
                .name("additionalInformation")
                .set(additionalInformation);
        toObjectR(this)
                .accessProp(this, env)
                .name("additionalInformationVerbose")
                .set(additionalInformationVerbose);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runtime", typeHint = "float")
    public Object setRuntime(RuntimeEnv env, Object... args) {
        Object runtime = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("runtime").set(runtime);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "previousTestResult")
    @ConvertedParameter(
        index = 1,
        name = "verbose",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object toString(RuntimeEnv env, Object... args) {
        Object previousTestResult = assignParameter(args, 0, null);
        Object verbose = assignParameter(args, 1, null);
        if (ZVal.isNull(verbose)) {
            verbose = false;
        }
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s%s %s %s%s\n%s",
                                ZVal.toBool(previousTestResult)
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                previousTestResult,
                                                                "additionalInformationPrintable",
                                                                TestResult.class,
                                                                verbose))
                                        ? "\n"
                                        : "",
                                env.callMethod(
                                        this,
                                        "getClassNameHeader",
                                        TestResult.class,
                                        ZVal.isTrue(previousTestResult)
                                                ? toObjectR(previousTestResult)
                                                        .accessProp(this, env)
                                                        .name("testClass")
                                                        .value()
                                                : ZVal.getNull()),
                                toObjectR(this).accessProp(this, env).name("symbol").value(),
                                toObjectR(this).accessProp(this, env).name("testMethod").value(),
                                ZVal.isTrue(verbose)
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "getFormattedRuntime",
                                                                TestResult.class),
                                                        env)
                                        : "",
                                env.callMethod(
                                        this,
                                        "getFormattedAdditionalInformation",
                                        TestResult.class,
                                        verbose))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "previousTestClass")
    private Object getClassNameHeader(RuntimeEnv env, Object... args) {
        Object previousTestClass = assignParameter(args, 0, null);
        Object className = null;
        className = "";
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("testClass").value(),
                "!==",
                previousTestClass)) {
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", previousTestClass)) {
                className = "\n";
            }

            className =
                    toStringR(className, env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "%s\n",
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("testClass")
                                                            .value())
                                            .value(),
                                    env);
        }

        return ZVal.assign(className);
    }

    @ConvertedMethod
    private Object getFormattedRuntime(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThan(
                toObjectR(this).accessProp(this, env).name("runtime").value(), '>', 5)) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    toObjectR(this).accessProp(this, env).name("colorize").value(),
                                    new RuntimeArgsWithReferences(),
                                    "fg-red",
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "[%.2f ms]",
                                                    ZVal.multiply(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("runtime")
                                                                    .value(),
                                                            1000))
                                            .value())
                            .value());
        }

        if (ZVal.isGreaterThan(
                toObjectR(this).accessProp(this, env).name("runtime").value(), '>', 1)) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    toObjectR(this).accessProp(this, env).name("colorize").value(),
                                    new RuntimeArgsWithReferences(),
                                    "fg-yellow",
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "[%.2f ms]",
                                                    ZVal.multiply(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("runtime")
                                                                    .value(),
                                                            1000))
                                            .value())
                            .value());
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "[%.2f ms]",
                                ZVal.multiply(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("runtime")
                                                .value(),
                                        1000))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "verbose")
    private Object getFormattedAdditionalInformation(RuntimeEnv env, Object... args) {
        Object verbose = assignParameter(args, 0, null);
        if (!ZVal.isTrue(
                env.callMethod(
                        this, "additionalInformationPrintable", TestResult.class, verbose))) {
            return "";
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "   \u2502\n%s\n",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "\n",
                                                CRArrayF.array_map
                                                        .env(env)
                                                        .call(
                                                                new Closure(env) {
                                                                    @Override
                                                                    public Object run(
                                                                            RuntimeEnv env,
                                                                            Object thisvar,
                                                                            PassByReferenceArgs
                                                                                    runtimePassByReferenceArgs,
                                                                            Object... args) {
                                                                        Object text =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        null);
                                                                        return ZVal.assign(
                                                                                NamespaceGlobal
                                                                                        .sprintf
                                                                                        .env(env)
                                                                                        .call(
                                                                                                "   \u2502 %s",
                                                                                                text)
                                                                                        .value());
                                                                    }
                                                                },
                                                                NamespaceGlobal.explode
                                                                        .env(env)
                                                                        .call(
                                                                                "\n",
                                                                                toObjectR(this)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "additionalInformation")
                                                                                        .value())
                                                                        .value())
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "verbose", typeHint = "bool")
    private Object additionalInformationPrintable(RuntimeEnv env, Object... args) {
        Object verbose = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("additionalInformation").value(),
                "===",
                "")) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("additionalInformationVerbose")
                                .value())
                && ZVal.toBool(!ZVal.isTrue(verbose))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\TestResult";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\TestResult")
                    .setLookup(TestResult.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "additionalInformation",
                            "additionalInformationVerbose",
                            "colorize",
                            "runtime",
                            "symbol",
                            "testClass",
                            "testMethod",
                            "testSuccesful")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/TestResult.php")
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
