package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExceptionWrapper;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/TestFailure.php

*/

public class TestFailure extends RuntimeClassBase {

    public Object failedTest = null;

    public Object thrownException = null;

    public Object testName = null;

    public TestFailure(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestFailure.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "failedTest", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object failedTest = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        failedTest, SelfDescribing.class, "PHPUnit\\Framework\\SelfDescribing"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("testName")
                    .set(env.callMethod(failedTest, "toString", TestFailure.class));

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("testName")
                    .set(function_get_class.f.env(env).call(failedTest).value());
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        failedTest,
                                        TestCase.class,
                                        "PHPUnit\\Framework\\TestCase")))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(failedTest, "isInIsolation", TestFailure.class)))) {
            toObjectR(this).accessProp(this, env).name("failedTest").set(failedTest);
        }

        toObjectR(this).accessProp(this, env).name("thrownException").set(t);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s: %s",
                                toObjectR(this).accessProp(this, env).name("testName").value(),
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("thrownException")
                                                .value(),
                                        "getMessage",
                                        TestFailure.class))
                        .value());
    }

    @ConvertedMethod
    public Object getExceptionAsString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                runtimeStaticObject.exceptionToString(
                        env,
                        toObjectR(this).accessProp(this, env).name("thrownException").value()));
    }

    @ConvertedMethod
    public Object getTestName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("testName").value());
    }

    @ConvertedMethod
    public Object failedTest(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("failedTest").value());
    }

    @ConvertedMethod
    public Object thrownException(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("thrownException").value());
    }

    @ConvertedMethod
    public Object exceptionMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "thrownException", TestFailure.class),
                        "getMessage",
                        TestFailure.class));
    }

    @ConvertedMethod
    public Object isFailure(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.checkInstanceType(
                        env.callMethod(this, "thrownException", TestFailure.class),
                        AssertionFailedError.class,
                        "PHPUnit\\Framework\\AssertionFailedError"));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\TestFailure";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "e", typeHint = "Throwable")
        public Object exceptionToString(RuntimeEnv env, Object... args) {
            Object e = assignParameter(args, 0, null);
            Object buffer = null;
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            e, SelfDescribing.class, "PHPUnit\\Framework\\SelfDescribing"))) {
                buffer = env.callMethod(e, "toString", TestFailure.class);
                if (ZVal.toBool(
                                ZVal.checkInstanceType(
                                        e,
                                        ExpectationFailedException.class,
                                        "PHPUnit\\Framework\\ExpectationFailedException"))
                        && ZVal.toBool(
                                env.callMethod(e, "getComparisonFailure", TestFailure.class))) {
                    buffer =
                            toStringR(buffer, env)
                                    + toStringR(
                                            env.callMethod(
                                                    env.callMethod(
                                                            e,
                                                            "getComparisonFailure",
                                                            TestFailure.class),
                                                    "getDiff",
                                                    TestFailure.class),
                                            env);
                }

                if (!ZVal.isEmpty(buffer)) {
                    buffer =
                            toStringR(NamespaceGlobal.trim.env(env).call(buffer).value(), env)
                                    + "\n";
                }

                return ZVal.assign(buffer);
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(e, Error.class, "PHPUnit\\Framework\\Error\\Error"))) {
                return ZVal.assign(
                        toStringR(env.callMethod(e, "getMessage", TestFailure.class), env) + "\n");
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            e, ExceptionWrapper.class, "PHPUnit\\Framework\\ExceptionWrapper"))) {
                return ZVal.assign(
                        toStringR(env.callMethod(e, "getClassName", TestFailure.class), env)
                                + ": "
                                + toStringR(env.callMethod(e, "getMessage", TestFailure.class), env)
                                + "\n");
            }

            return ZVal.assign(
                    toStringR(function_get_class.f.env(env).call(e).value(), env)
                            + ": "
                            + toStringR(env.callMethod(e, "getMessage", TestFailure.class), env)
                            + "\n");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\TestFailure")
                    .setLookup(TestFailure.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("failedTest", "testName", "thrownException")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/TestFailure.php")
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
