package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.PHP_Token;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CURLY_OPEN;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_SEMICOLON;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLASS;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_WHITESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_CURLY;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NAMESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLOSE_CURLY;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_TRAIT;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_DOC_COMMENT;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_FUNCTION;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public abstract class PHP_TokenWithScope extends PHP_Token {

    public Object endTokenId = null;

    public PHP_TokenWithScope(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_TokenWithScope.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getDocblock(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object prevLineNumber = null;
        Object line = null;
        Object currentLineNumber = null;
        Object i = null;
        Object tokens = ZVal.newArray();
        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_TokenWithScope.class);
        currentLineNumber =
                env.callMethod(
                        ZVal.getElement(
                                tokens, toObjectR(this).accessProp(this, env).name("id").value()),
                        "getLine",
                        PHP_TokenWithScope.class);
        prevLineNumber = ZVal.subtract(currentLineNumber, 1);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i = ZVal.subtract(toObjectR(this).accessProp(this, env).name("id").value(), 1);
                ZVal.isTrue(i);
                i = ZVal.decrement(i)) {
            if (!ZVal.isset(ZVal.getElement(tokens, i))) {
                return null;
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    ZVal.getElement(tokens, i),
                                                    PHP_Token_FUNCTION.class,
                                                    "PHP_Token_FUNCTION"))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    ZVal.getElement(tokens, i),
                                                    PHP_Token_CLASS.class,
                                                    "PHP_Token_CLASS")))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    ZVal.getElement(tokens, i),
                                    PHP_Token_TRAIT.class,
                                    "PHP_Token_TRAIT"))) {
                break;
            }

            line = env.callMethod(ZVal.getElement(tokens, i), "getLine", PHP_TokenWithScope.class);
            if (ZVal.toBool(ZVal.equalityCheck(line, currentLineNumber))
                    || ZVal.toBool(
                            ZVal.toBool(ZVal.equalityCheck(line, prevLineNumber))
                                    && ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    ZVal.getElement(tokens, i),
                                                    PHP_Token_WHITESPACE.class,
                                                    "PHP_Token_WHITESPACE")))) {
                continue;
            }

            if (ZVal.toBool(ZVal.isLessThan(line, '<', currentLineNumber))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            ZVal.getElement(tokens, i),
                                            PHP_Token_DOC_COMMENT.class,
                                            "PHP_Token_DOC_COMMENT")))) {
                break;
            }

            return ZVal.assign(toStringR(ZVal.getElement(tokens, i), env));
        }

        return null;
    }

    @ConvertedMethod
    public Object getEndTokenId(RuntimeEnv env, Object... args) {
        Object i = null;
        Object block = null;
        Object tokens = ZVal.newArray();
        block = 0;
        i = ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value());
        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_TokenWithScope.class);
        while (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                toObjectR(this).accessProp(this, env).name("endTokenId").value(),
                                "===",
                                ZVal.getNull()))
                && ZVal.toBool(ZVal.isset(ZVal.getElement(tokens, i)))) {
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    ZVal.getElement(tokens, i),
                                    PHP_Token_OPEN_CURLY.class,
                                    "PHP_Token_OPEN_CURLY"))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    ZVal.getElement(tokens, i),
                                    PHP_Token_CURLY_OPEN.class,
                                    "PHP_Token_CURLY_OPEN"))) {
                block = ZVal.increment(block);

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            ZVal.getElement(tokens, i),
                            PHP_Token_CLOSE_CURLY.class,
                            "PHP_Token_CLOSE_CURLY"))) {
                block = ZVal.decrement(block);
                if (ZVal.strictEqualityCheck(block, "===", 0)) {
                    toObjectR(this).accessProp(this, env).name("endTokenId").set(i);
                }

            } else if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    this,
                                                    PHP_Token_FUNCTION.class,
                                                    "PHP_Token_FUNCTION"))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    this,
                                                    PHP_Token_NAMESPACE.class,
                                                    "PHP_Token_NAMESPACE")))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    ZVal.getElement(tokens, i),
                                    PHP_Token_SEMICOLON.class,
                                    "PHP_Token_SEMICOLON"))) {
                if (ZVal.strictEqualityCheck(block, "===", 0)) {
                    toObjectR(this).accessProp(this, env).name("endTokenId").set(i);
                }
            }

            i = ZVal.increment(i);
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("endTokenId").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("endTokenId")
                    .set(toObjectR(this).accessProp(this, env).name("id").value());
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("endTokenId").value());
    }

    @ConvertedMethod
    public Object getEndLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                                env.callMethod(this, "getEndTokenId", PHP_TokenWithScope.class)),
                        "getLine",
                        PHP_TokenWithScope.class));
    }

    public static final Object CONST_class = "PHP_TokenWithScope";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_Token.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_TokenWithScope")
                    .setLookup(PHP_TokenWithScope.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("endTokenId", "id", "line", "text", "tokenStream")
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
