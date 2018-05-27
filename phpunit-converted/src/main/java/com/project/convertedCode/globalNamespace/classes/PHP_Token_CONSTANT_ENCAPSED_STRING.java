package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.PHP_Token;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_CONSTANT_ENCAPSED_STRING extends PHP_Token {

    public PHP_Token_CONSTANT_ENCAPSED_STRING(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_CONSTANT_ENCAPSED_STRING.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class = "PHP_Token_CONSTANT_ENCAPSED_STRING";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_Token.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_CONSTANT_ENCAPSED_STRING")
                    .setLookup(
                            PHP_Token_CONSTANT_ENCAPSED_STRING.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("id", "line", "text", "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
                    .addExtendsClass("PHP_Token")
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
