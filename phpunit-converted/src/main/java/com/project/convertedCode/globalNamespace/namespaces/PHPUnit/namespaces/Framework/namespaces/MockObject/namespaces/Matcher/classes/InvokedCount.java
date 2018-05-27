package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedRecorder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Matcher/InvokedCount.php

*/

public class InvokedCount extends InvokedRecorder {

    public Object expectedCount = null;

    public InvokedCount(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvokedCount.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedCount")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expectedCount = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("expectedCount").set(expectedCount);
        return null;
    }

    @ConvertedMethod
    public Object isNever(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("expectedCount").value(),
                        "===",
                        0));
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "invoked "
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("expectedCount").value(),
                                env)
                        + " time(s)");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoked(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object invocation = assignParameter(args, 0, null);
        Object count = null;
        Object message = null;
        super.invoked(env, invocation);
        count = env.callMethod(this, "getInvocationCount", InvokedCount.class);
        if (ZVal.isGreaterThan(
                count, '>', toObjectR(this).accessProp(this, env).name("expectedCount").value())) {
            message =
                    toStringR(env.callMethod(invocation, "toString", InvokedCount.class), env)
                            + " ";
            SwitchEnumType11 switchVariable11 =
                    ZVal.getEnum(
                            toObjectR(this).accessProp(this, env).name("expectedCount").value(),
                            SwitchEnumType11.DEFAULT_CASE,
                            SwitchEnumType11.INTEGER_0,
                            0,
                            SwitchEnumType11.INTEGER_1,
                            1);
            switch (switchVariable11) {
                case INTEGER_0:
                    message = toStringR(message, env) + "was not expected to be called.";
                    break;
                case INTEGER_1:
                    message =
                            toStringR(message, env)
                                    + "was not expected to be called more than once.";
                    break;
                case DEFAULT_CASE:
                    message =
                            toStringR(message, env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "was not expected to be called more than %d times.",
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("expectedCount")
                                                                    .value())
                                                    .value(),
                                            env);
            }
            ;
            throw ZVal.getException(env, new ExpectationFailedException(env, message));
        }

        return null;
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object count = null;
        count = env.callMethod(this, "getInvocationCount", InvokedCount.class);
        if (ZVal.strictNotEqualityCheck(
                count,
                "!==",
                toObjectR(this).accessProp(this, env).name("expectedCount").value())) {
            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Method was expected to be called %d times, "
                                                    + "actually called %d times.",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("expectedCount")
                                                    .value(),
                                            count)
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedCount";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends InvokedRecorder.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedCount")
                    .setLookup(InvokedCount.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("expectedCount", "invocations")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Matcher/InvokedCount.php")
                    .addInterface("Invocation")
                    .addInterface("SelfDescribing")
                    .addInterface("Verifiable")
                    .addExtendsClass("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedRecorder")
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

    private enum SwitchEnumType11 {
        INTEGER_0,
        INTEGER_1,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
