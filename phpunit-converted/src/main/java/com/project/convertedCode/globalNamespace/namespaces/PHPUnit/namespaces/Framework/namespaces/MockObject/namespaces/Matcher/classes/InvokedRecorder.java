package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.Invocation;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Matcher/InvokedRecorder.php

*/

public abstract class InvokedRecorder extends RuntimeClassBase implements Invocation {

    public Object invocations = ZVal.newArray();

    public InvokedRecorder(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getInvocationCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("invocations").value())
                        .value());
    }

    @ConvertedMethod
    public Object getInvocations(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("invocations").value());
    }

    @ConvertedMethod
    public Object hasBeenInvoked(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(
                        CRArrayF.count
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("invocations")
                                                .value())
                                .value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoked(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("invocations").value(), invocation);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedRecorder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedRecorder")
                    .setLookup(InvokedRecorder.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("invocations")
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Matcher/InvokedRecorder.php")
                    .addInterface("Invocation")
                    .addInterface("SelfDescribing")
                    .addInterface("Verifiable")
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
