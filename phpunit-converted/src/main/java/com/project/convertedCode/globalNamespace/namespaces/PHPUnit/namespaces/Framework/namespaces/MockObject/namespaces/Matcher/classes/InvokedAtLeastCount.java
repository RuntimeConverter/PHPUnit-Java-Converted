package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedRecorder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
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

 vendor/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtLeastCount.php

*/

public class InvokedAtLeastCount extends InvokedRecorder {

    public Object requiredInvocations = null;

    public InvokedAtLeastCount(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvokedAtLeastCount.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requiredInvocations")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object requiredInvocations = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("requiredInvocations").set(requiredInvocations);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "invoked at least "
                        + toStringR(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("requiredInvocations")
                                        .value(),
                                env)
                        + " times");
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object count = null;
        count = env.callMethod(this, "getInvocationCount", InvokedAtLeastCount.class);
        if (ZVal.isLessThan(
                count,
                '<',
                toObjectR(this).accessProp(this, env).name("requiredInvocations").value())) {
            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            "Expected invocation at least "
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("requiredInvocations")
                                                    .value(),
                                            env)
                                    + " times but it occurred "
                                    + toStringR(count, env)
                                    + " time(s)."));
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtLeastCount";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends InvokedRecorder.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtLeastCount")
                    .setLookup(InvokedAtLeastCount.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("invocations", "requiredInvocations")
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtLeastCount.php")
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
}
