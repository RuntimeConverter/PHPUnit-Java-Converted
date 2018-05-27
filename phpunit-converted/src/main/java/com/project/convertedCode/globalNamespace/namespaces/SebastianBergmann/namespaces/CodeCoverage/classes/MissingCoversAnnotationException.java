package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Exception/MissingCoversAnnotationException.php

*/

public final class MissingCoversAnnotationException extends RuntimeException {

    public MissingCoversAnnotationException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MissingCoversAnnotationException.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\MissingCoversAnnotationException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\MissingCoversAnnotationException")
                    .setLookup(
                            MissingCoversAnnotationException.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Exception/MissingCoversAnnotationException.php")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\RuntimeException")
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
