package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/exceptions/InvalidApplicationNameException.php

*/

public class InvalidApplicationNameException extends InvalidArgumentException implements Exception {

    public InvalidApplicationNameException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvalidApplicationNameException.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_NotAString = 1;

    public static final Object CONST_InvalidFormat = 2;

    public static final Object CONST_class = "PharIo\\Manifest\\InvalidApplicationNameException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends InvalidArgumentException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\InvalidApplicationNameException")
                    .setLookup(
                            InvalidApplicationNameException.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phar-io/manifest/src/exceptions/InvalidApplicationNameException.php")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("InvalidArgumentException")
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
