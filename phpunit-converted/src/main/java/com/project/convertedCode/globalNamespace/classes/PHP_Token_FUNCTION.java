package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_STRING;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_VARIABLE;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_SEMICOLON;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_WHITESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_CURLY;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NAMESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_BRACKET;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_AMPERSAND;
import com.project.convertedCode.globalNamespace.classes.PHP_TokenWithScopeAndVisibility;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLOSE_BRACKET;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_INTERFACE;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_FUNCTION extends PHP_TokenWithScopeAndVisibility {

    public Object arguments = null;

    public Object ccn = null;

    public Object name = null;

    public Object signature = null;

    public Object anonymous = false;

    public PHP_Token_FUNCTION(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_FUNCTION.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        Object i = null;
        Object tokens = ZVal.newArray();
        Object typeDeclaration = null;
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("arguments").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("arguments").value());
        }

        toObjectR(this).accessProp(this, env).name("arguments").set(ZVal.newArray());
        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_FUNCTION.class);
        typeDeclaration = ZVal.getNull();
        i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 2);
        while (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(tokens, ZVal.subtract(i, 1)),
                        PHP_Token_OPEN_BRACKET.class,
                        "PHP_Token_OPEN_BRACKET"))) {
            i = ZVal.increment(i);
        }

        while (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(tokens, i),
                        PHP_Token_CLOSE_BRACKET.class,
                        "PHP_Token_CLOSE_BRACKET"))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            ZVal.getElement(tokens, i),
                            PHP_Token_STRING.class,
                            "PHP_Token_STRING"))) {
                typeDeclaration = ZVal.assign(toStringR(ZVal.getElement(tokens, i), env));

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            ZVal.getElement(tokens, i),
                            PHP_Token_VARIABLE.class,
                            "PHP_Token_VARIABLE"))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        toStringR(ZVal.getElement(tokens, i), env),
                        typeDeclaration);
                typeDeclaration = ZVal.getNull();
            }

            i = ZVal.increment(i);
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("arguments").value());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object i = null;
        Object tokens = ZVal.newArray();
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("name").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
        }

        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_FUNCTION.class);
        i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 1);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(tokens, i),
                        PHP_Token_WHITESPACE.class,
                        "PHP_Token_WHITESPACE"))) {
            i = ZVal.increment(i);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(tokens, i),
                        PHP_Token_AMPERSAND.class,
                        "PHP_Token_AMPERSAND"))) {
            i = ZVal.increment(i);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(tokens, ZVal.add(i, 1)),
                        PHP_Token_OPEN_BRACKET.class,
                        "PHP_Token_OPEN_BRACKET"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("name")
                    .set(toStringR(ZVal.getElement(tokens, i), env));

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                ZVal.getElement(tokens, ZVal.add(i, 1)),
                                PHP_Token_WHITESPACE.class,
                                "PHP_Token_WHITESPACE"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                ZVal.getElement(tokens, ZVal.add(i, 2)),
                                PHP_Token_OPEN_BRACKET.class,
                                "PHP_Token_OPEN_BRACKET"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("name")
                    .set(toStringR(ZVal.getElement(tokens, i), env));

        } else {
            toObjectR(this).accessProp(this, env).name("anonymous").set(true);
            toObjectR(this)
                    .accessProp(this, env)
                    .name("name")
                    .set(
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "anonymousFunction:%s#%s",
                                            env.callMethod(
                                                    this, "getLine", PHP_Token_FUNCTION.class),
                                            env.callMethod(this, "getId", PHP_Token_FUNCTION.class))
                                    .value());
        }

        if (!ZVal.isTrue(env.callMethod(this, "isAnonymous", PHP_Token_FUNCTION.class))) {
            runtimeConverterBreakCount = 0;
            for (i = ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value());
                    ZVal.isTrue(i);
                    i = ZVal.decrement(i)) {
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                ZVal.getElement(tokens, i),
                                PHP_Token_NAMESPACE.class,
                                "PHP_Token_NAMESPACE"))) {
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("name")
                            .set(
                                    toStringR(
                                                    env.callMethod(
                                                            ZVal.getElement(tokens, i),
                                                            "getName",
                                                            PHP_Token_FUNCTION.class),
                                                    env)
                                            + "\\"
                                            + toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    env));
                    break;
                }

                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                ZVal.getElement(tokens, i),
                                PHP_Token_INTERFACE.class,
                                "PHP_Token_INTERFACE"))) {
                    break;
                }
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getCCN(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object i = null;
        Object end = null;
        Object tokens = ZVal.newArray();
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("ccn").value(), "!==", ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("ccn").value());
        }

        toObjectR(this).accessProp(this, env).name("ccn").set(1);
        end = env.callMethod(this, "getEndTokenId", PHP_Token_FUNCTION.class);
        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_FUNCTION.class);
        runtimeConverterBreakCount = 0;
        for (i = ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value());
                ZVal.isLessThanOrEqualTo(i, "<=", end);
                i = ZVal.increment(i)) {
            switch (toStringR(
                    function_get_class.f.env(env).call(ZVal.getElement(tokens, i)).value())) {
                case "PHP_Token_IF":
                case "PHP_Token_ELSEIF":
                case "PHP_Token_FOR":
                case "PHP_Token_FOREACH":
                case "PHP_Token_WHILE":
                case "PHP_Token_CASE":
                case "PHP_Token_CATCH":
                case "PHP_Token_BOOLEAN_AND":
                case "PHP_Token_LOGICAL_AND":
                case "PHP_Token_BOOLEAN_OR":
                case "PHP_Token_LOGICAL_OR":
                case "PHP_Token_QUESTION_MARK":
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("ccn")
                            .set(
                                    ZVal.increment(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("ccn")
                                                    .value()));
                    break;
            }
            ;
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("ccn").value());
    }

    @ConvertedMethod
    public Object getSignature(RuntimeEnv env, Object... args) {
        Object i = null;
        Object tokens = ZVal.newArray();
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("signature").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("signature").value());
        }

        if (ZVal.isTrue(env.callMethod(this, "isAnonymous", PHP_Token_FUNCTION.class))) {
            toObjectR(this).accessProp(this, env).name("signature").set("anonymousFunction");
            i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 1);

        } else {
            toObjectR(this).accessProp(this, env).name("signature").set("");
            i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 2);
        }

        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_FUNCTION.class);
        while (ZVal.toBool(
                        ZVal.toBool(ZVal.isset(ZVal.getElement(tokens, i)))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        ZVal.getElement(tokens, i),
                                                        PHP_Token_OPEN_CURLY.class,
                                                        "PHP_Token_OPEN_CURLY"))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        ZVal.getElement(tokens, i),
                                        PHP_Token_SEMICOLON.class,
                                        "PHP_Token_SEMICOLON")))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("signature")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("signature")
                                                    .value(),
                                            env)
                                    + toStringR(
                                            ZVal.getElement(
                                                    tokens, ((long) (i = ZVal.increment(i)) - 1)),
                                            env));
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("signature")
                .set(
                        NamespaceGlobal.trim
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("signature")
                                                .value())
                                .value());
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("signature").value());
    }

    @ConvertedMethod
    public Object isAnonymous(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("anonymous").value());
    }

    public static final Object CONST_class = "PHP_Token_FUNCTION";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends PHP_TokenWithScopeAndVisibility.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_FUNCTION")
                    .setLookup(PHP_Token_FUNCTION.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "anonymous",
                            "arguments",
                            "ccn",
                            "endTokenId",
                            "id",
                            "line",
                            "name",
                            "signature",
                            "text",
                            "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
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
