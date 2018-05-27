package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.StatelessInvocation;
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

 vendor/phpunit/phpunit-mock-objects/src/Matcher/DeferredError.php

*/

public class DeferredError extends StatelessInvocation {

    public Object exception = null;

    public DeferredError(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DeferredError.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Throwable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("exception").set(exception);
        return null;
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env, toObjectR(this).accessProp(this, env).name("exception").value());
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "";
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
            "PHPUnit\\Framework\\MockObject\\Matcher\\DeferredError";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StatelessInvocation.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\DeferredError")
                    .setLookup(DeferredError.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exception")
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Matcher/DeferredError.php")
                    .addInterface("Invocation")
                    .addInterface("SelfDescribing")
                    .addInterface("Verifiable")
                    .addExtendsClass("PHPUnit\\Framework\\MockObject\\Matcher\\StatelessInvocation")
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
