package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.RiskyTestError;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MissingCoversAnnotationException.php

*/

public class MissingCoversAnnotationException extends RiskyTestError {

    public MissingCoversAnnotationException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MissingCoversAnnotationException.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MissingCoversAnnotationException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RiskyTestError.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MissingCoversAnnotationException")
                    .setLookup(
                            MissingCoversAnnotationException.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("serializableTrace")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MissingCoversAnnotationException.php")
                    .addInterface("RiskyTest")
                    .addInterface("SelfDescribing")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("PHPUnit\\Framework\\RiskyTestError")
                    .addExtendsClass("PHPUnit\\Framework\\AssertionFailedError")
                    .addExtendsClass("PHPUnit\\Framework\\Exception")
                    .addExtendsClass("RuntimeException")
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
