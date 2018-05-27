package com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.Token;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.TokenCollection;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/theseer/tokenizer/src/Tokenizer.php

*/

public class Tokenizer extends RuntimeClassBase {

    public Object map =
            ZVal.newArray(
                    new ZPair("(", "T_OPEN_BRACKET"),
                    new ZPair(")", "T_CLOSE_BRACKET"),
                    new ZPair("[", "T_OPEN_SQUARE"),
                    new ZPair("]", "T_CLOSE_SQUARE"),
                    new ZPair("{", "T_OPEN_CURLY"),
                    new ZPair("}", "T_CLOSE_CURLY"),
                    new ZPair(";", "T_SEMICOLON"),
                    new ZPair(".", "T_DOT"),
                    new ZPair(",", "T_COMMA"),
                    new ZPair("=", "T_EQUAL"),
                    new ZPair("<", "T_LT"),
                    new ZPair(">", "T_GT"),
                    new ZPair("+", "T_PLUS"),
                    new ZPair("-", "T_MINUS"),
                    new ZPair("*", "T_MULT"),
                    new ZPair("/", "T_DIV"),
                    new ZPair("?", "T_QUESTION_MARK"),
                    new ZPair("!", "T_EXCLAMATION_MARK"),
                    new ZPair(":", "T_COLON"),
                    new ZPair("\"", "T_DOUBLE_QUOTES"),
                    new ZPair("@", "T_AT"),
                    new ZPair("&", "T_AMPERSAND"),
                    new ZPair("%", "T_PERCENT"),
                    new ZPair("|", "T_PIPE"),
                    new ZPair("$", "T_DOLLAR"),
                    new ZPair("^", "T_CARET"),
                    new ZPair("~", "T_TILDE"),
                    new ZPair("`", "T_BACKTICK"));

    public Tokenizer(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "string")
    public Object parse(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object source = assignParameter(args, 0, null);
        Object result = null;
        Object lastToken = null;
        Object tok = ZVal.newArray();
        Object pos = null;
        Object line = null;
        Object v = null;
        Object values = null;
        Object tokens = ZVal.newArray();
        Object token = null;
        result = new TokenCollection(env);
        tokens = NamespaceGlobal.token_get_all.env(env).call(source).value();
        lastToken = new Token(env, ZVal.getElementRecursive(tokens, 0, 2), "Placeholder", "");
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult490 : ZVal.getIterable(tokens, env, false)) {
            pos = ZVal.assign(zpairResult490.getKey());
            tok = ZVal.assign(zpairResult490.getValue());
            if (function_is_string.f.env(env).call(tok).getBool()) {
                token =
                        new Token(
                                env,
                                env.callMethod(lastToken, "getLine", Tokenizer.class),
                                ZVal.getElement(
                                        toObjectR(this).accessProp(this, env).name("map").value(),
                                        tok),
                                tok);
                env.callMethod(result, "addToken", Tokenizer.class, token);
                lastToken = ZVal.assign(token);
                continue;
            }

            line = ZVal.assign(ZVal.getElement(tok, 2));
            values =
                    NamespaceGlobal.preg_split
                            .env(env)
                            .call("/\\R+/Uu", ZVal.getElement(tok, 1))
                            .value();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult491 : ZVal.getIterable(values, env, true)) {
                v = ZVal.assign(zpairResult491.getValue());
                token =
                        new Token(
                                env,
                                line,
                                NamespaceGlobal.token_name
                                        .env(env)
                                        .call(ZVal.getElement(tok, 0))
                                        .value(),
                                v);
                env.callMethod(result, "addToken", Tokenizer.class, token);
                line = ZVal.increment(line);
                lastToken = ZVal.assign(token);
            }
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_class = "TheSeer\\Tokenizer\\Tokenizer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("TheSeer\\Tokenizer\\Tokenizer")
                    .setLookup(Tokenizer.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("map")
                    .setFilename("vendor/theseer/tokenizer/src/Tokenizer.php")
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
