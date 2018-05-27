package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_STRING;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_WHITESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_CURLY;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_EXTENDS;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_IMPLEMENTS;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_INTERFACE;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_CLASS extends PHP_Token_INTERFACE {

    public Object anonymous = false;

    public Object name = null;

    public PHP_Token_CLASS(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_CLASS.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        Object next = null;
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("name").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
        }

        next =
                ZVal.assign(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                                ZVal.add(
                                        toObjectR(this).accessProp(this, env).name("id").value(),
                                        1)));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(next, PHP_Token_WHITESPACE.class, "PHP_Token_WHITESPACE"))) {
            next =
                    ZVal.assign(
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("tokenStream")
                                            .value(),
                                    ZVal.add(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("id")
                                                    .value(),
                                            2)));
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(next, PHP_Token_STRING.class, "PHP_Token_STRING"))) {
            toObjectR(this).accessProp(this, env).name("name").set(toStringR(next, env));
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                next,
                                                PHP_Token_OPEN_CURLY.class,
                                                "PHP_Token_OPEN_CURLY"))
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                next,
                                                PHP_Token_EXTENDS.class,
                                                "PHP_Token_EXTENDS")))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                next, PHP_Token_IMPLEMENTS.class, "PHP_Token_IMPLEMENTS"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("name")
                    .set(
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "AnonymousClass:%s#%s",
                                            env.callMethod(this, "getLine", PHP_Token_CLASS.class),
                                            env.callMethod(this, "getId", PHP_Token_CLASS.class))
                                    .value());
            toObjectR(this).accessProp(this, env).name("anonymous").set(true);
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
        }

        return null;
    }

    @ConvertedMethod
    public Object isAnonymous(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("anonymous").value());
    }

    public static final Object CONST_class = "PHP_Token_CLASS";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_Token_INTERFACE.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_CLASS")
                    .setLookup(PHP_Token_CLASS.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "anonymous",
                            "endTokenId",
                            "id",
                            "interfaces",
                            "line",
                            "name",
                            "text",
                            "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
                    .addExtendsClass("PHP_Token_INTERFACE")
                    .addExtendsClass("PHP_TokenWithScopeAndVisibility")
                    .addExtendsClass("PHP_TokenWithScope")
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
