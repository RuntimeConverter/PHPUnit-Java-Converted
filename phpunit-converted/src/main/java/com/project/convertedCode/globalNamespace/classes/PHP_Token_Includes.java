package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CONSTANT_ENCAPSED_STRING;
import com.project.convertedCode.globalNamespace.classes.PHP_Token;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public abstract class PHP_Token_Includes extends PHP_Token {

    public Object name = null;

    public Object type = null;

    public PHP_Token_Includes(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_Includes.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("name").value(),
                "===",
                ZVal.getNull())) {
            env.callMethod(this, "process", PHP_Token_Includes.class);
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("type").value(),
                "===",
                ZVal.getNull())) {
            env.callMethod(this, "process", PHP_Token_Includes.class);
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("type").value());
    }

    @ConvertedMethod
    private Object process(RuntimeEnv env, Object... args) {
        Object tokens = ZVal.newArray();
        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_Includes.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(
                                tokens,
                                ZVal.add(
                                        toObjectR(this).accessProp(this, env).name("id").value(),
                                        2)),
                        PHP_Token_CONSTANT_ENCAPSED_STRING.class,
                        "PHP_Token_CONSTANT_ENCAPSED_STRING"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("name")
                    .set(
                            NamespaceGlobal.trim
                                    .env(env)
                                    .call(
                                            ZVal.getElement(
                                                    tokens,
                                                    ZVal.add(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("id")
                                                                    .value(),
                                                            2)),
                                            "'\"")
                                    .value());
            toObjectR(this)
                    .accessProp(this, env)
                    .name("type")
                    .set(
                            NamespaceGlobal.strtolower
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.str_replace
                                                    .env(env)
                                                    .addReferneceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(
                                                            "PHP_Token_",
                                                            "",
                                                            function_get_class
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            ZVal.getElement(
                                                                                    tokens,
                                                                                    toObjectR(this)
                                                                                            .accessProp(
                                                                                                    this,
                                                                                                    env)
                                                                                            .name(
                                                                                                    "id")
                                                                                            .value()))
                                                                    .value())
                                                    .value())
                                    .value());
        }

        return null;
    }

    public static final Object CONST_class = "PHP_Token_Includes";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_Token.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_Includes")
                    .setLookup(PHP_Token_Includes.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("id", "line", "name", "text", "tokenStream", "type")
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
