package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Exception/BadMethodCallException.php

*/

public class BadMethodCallException
        extends com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException
        implements Exception {

    public BadMethodCallException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BadMethodCallException.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\BadMethodCallException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .spl
                    .exceptions
                    .BadMethodCallException
                    .RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\BadMethodCallException")
                    .setLookup(
                            BadMethodCallException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Exception/BadMethodCallException.php")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("BadMethodCallException")
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
