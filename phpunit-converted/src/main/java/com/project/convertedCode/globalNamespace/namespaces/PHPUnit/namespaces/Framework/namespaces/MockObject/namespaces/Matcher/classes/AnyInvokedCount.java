package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedRecorder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Matcher/AnyInvokedCount.php

*/

public class AnyInvokedCount extends InvokedRecorder {

    public AnyInvokedCount(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "invoked zero or more times";
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\AnyInvokedCount";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends InvokedRecorder.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\AnyInvokedCount")
                    .setLookup(AnyInvokedCount.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("invocations")
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Matcher/AnyInvokedCount.php")
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
