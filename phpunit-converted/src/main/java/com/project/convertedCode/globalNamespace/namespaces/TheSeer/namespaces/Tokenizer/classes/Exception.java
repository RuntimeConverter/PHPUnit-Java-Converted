package com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/theseer/tokenizer/src/Exception.php

*/

public class Exception extends PHPException {

    public Exception(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Exception.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class = "TheSeer\\Tokenizer\\Exception";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHPException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("TheSeer\\Tokenizer\\Exception")
                    .setLookup(Exception.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/theseer/tokenizer/src/Exception.php")
                    .addInterface("Throwable")
                    .addExtendsClass("Exception")
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
