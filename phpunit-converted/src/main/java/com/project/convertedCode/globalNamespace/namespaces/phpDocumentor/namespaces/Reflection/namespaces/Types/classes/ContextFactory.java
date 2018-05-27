package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/ContextFactory.php

*/

public final class ContextFactory extends RuntimeClassBase {

    public ContextFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
    public Object createFromReflector(RuntimeEnv env, Object... args) {
        Object reflector = assignParameter(args, 0, null);
        Object fileName = null;
        Object namespace = null;
        if (function_method_exists.f.env(env).call(reflector, "getDeclaringClass").getBool()) {
            reflector = env.callMethod(reflector, "getDeclaringClass", ContextFactory.class);
        }

        fileName = env.callMethod(reflector, "getFileName", ContextFactory.class);
        namespace = env.callMethod(reflector, "getNamespaceName", ContextFactory.class);
        if (NamespaceGlobal.file_exists.env(env).call(fileName).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "createForNamespace",
                            ContextFactory.class,
                            namespace,
                            function_file_get_contents.f.env(env).call(fileName).value()));
        }

        return ZVal.assign(new Context(env, namespace, ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "fileContents")
    public Object createForNamespace(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object namespace = assignParameter(args, 0, null);
        Object fileContents = assignParameter(args, 1, null);
        Object useStatements = null;
        Object currentNamespace = null;
        Object braceLevel = null;
        Object firstBraceFound = null;
        Object tokens = null;
        namespace = NamespaceGlobal.trim.env(env).call(namespace, "\\").value();
        useStatements = ZVal.newArray();
        currentNamespace = "";
        tokens =
                new ArrayIterator(
                        env, NamespaceGlobal.token_get_all.env(env).call(fileContents).value());
        runtimeConverterBreakCount = 0;
        while (ZVal.isTrue(env.callMethod(tokens, "valid", ContextFactory.class))) {
            SwitchEnumType3 switchVariable3 =
                    ZVal.getEnum(
                            ZVal.getElement(
                                    env.callMethod(tokens, "current", ContextFactory.class), 0),
                            SwitchEnumType3.DEFAULT_CASE,
                            SwitchEnumType3.DYNAMIC_TYPE_10,
                            388,
                            SwitchEnumType3.DYNAMIC_TYPE_11,
                            361,
                            SwitchEnumType3.DYNAMIC_TYPE_12,
                            353);
            switch (switchVariable3) {
                case DYNAMIC_TYPE_10:
                    currentNamespace =
                            env.callMethod(this, "parseNamespace", ContextFactory.class, tokens);
                    break;
                case DYNAMIC_TYPE_11:
                    braceLevel = 0;
                    firstBraceFound = false;
                    runtimeConverterBreakCount = 0;
                    while (ZVal.toBool(env.callMethod(tokens, "valid", ContextFactory.class))
                            && ZVal.toBool(
                                    ZVal.toBool(ZVal.isGreaterThan(braceLevel, '>', 0))
                                            || ZVal.toBool(!ZVal.isTrue(firstBraceFound)))) {
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                env.callMethod(
                                                                        tokens,
                                                                        "current",
                                                                        ContextFactory.class),
                                                                "===",
                                                                "{"))
                                                || ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                ZVal.getElement(
                                                                        env.callMethod(
                                                                                tokens,
                                                                                "current",
                                                                                ContextFactory
                                                                                        .class),
                                                                        0),
                                                                "===",
                                                                386)))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                ZVal.getElement(
                                                        env.callMethod(
                                                                tokens,
                                                                "current",
                                                                ContextFactory.class),
                                                        0),
                                                "===",
                                                385))) {
                            if (!ZVal.isTrue(firstBraceFound)) {
                                firstBraceFound = true;
                            }

                            braceLevel = ZVal.increment(braceLevel);
                        }

                        if (ZVal.strictEqualityCheck(
                                env.callMethod(tokens, "current", ContextFactory.class),
                                "===",
                                "}")) {
                            braceLevel = ZVal.decrement(braceLevel);
                        }

                        env.callMethod(tokens, "next", ContextFactory.class);
                    }

                    break;
                case DYNAMIC_TYPE_12:
                    if (ZVal.strictEqualityCheck(currentNamespace, "===", namespace)) {
                        useStatements =
                                CRArrayF.array_merge
                                        .env(env)
                                        .call(
                                                useStatements,
                                                env.callMethod(
                                                        this,
                                                        "parseUseStatement",
                                                        ContextFactory.class,
                                                        tokens))
                                        .value();
                    }

                    break;
            }
            ;
            env.callMethod(tokens, "next", ContextFactory.class);
        }

        return ZVal.assign(new Context(env, namespace, useStatements));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "ArrayIterator")
    private Object parseNamespace(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        Object name = null;
        env.callMethod(this, "skipToNextStringOrNamespaceSeparator", ContextFactory.class, tokens);
        name = "";
        while (ZVal.toBool(env.callMethod(tokens, "valid", ContextFactory.class))
                && ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                ZVal.getElement(
                                                        env.callMethod(
                                                                tokens,
                                                                "current",
                                                                ContextFactory.class),
                                                        0),
                                                "===",
                                                319))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                ZVal.getElement(
                                                        env.callMethod(
                                                                tokens,
                                                                "current",
                                                                ContextFactory.class),
                                                        0),
                                                "===",
                                                390)))) {
            name =
                    toStringR(name, env)
                            + toStringR(
                                    ZVal.getElement(
                                            env.callMethod(tokens, "current", ContextFactory.class),
                                            1),
                                    env);
            env.callMethod(tokens, "next", ContextFactory.class);
        }

        return ZVal.assign(name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "ArrayIterator")
    private Object parseUseStatement(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        Object _pContinue = null;
        Object runtimeTempArrayResult5 = null;
        Object alias = null;
        Object uses = ZVal.newArray();
        Object fqnn = null;
        uses = ZVal.newArray();
        _pContinue = true;
        while (ZVal.isTrue(_pContinue)) {
            env.callMethod(
                    this, "skipToNextStringOrNamespaceSeparator", ContextFactory.class, tokens);
            ZVal.list(
                    runtimeTempArrayResult5 =
                            env.callMethod(
                                    this, "extractUseStatement", ContextFactory.class, tokens),
                    (alias = ZVal.assign(ZVal.getElement(runtimeTempArrayResult5, 0))),
                    (fqnn = ZVal.assign(ZVal.getElement(runtimeTempArrayResult5, 1))));
            ZVal.putArrayElement(uses, alias, fqnn);
            if (ZVal.strictEqualityCheck(
                    ZVal.getElement(env.callMethod(tokens, "current", ContextFactory.class), 0),
                    "===",
                    CONST_T_LITERAL_END_OF_USE)) {
                _pContinue = false;
            }
        }

        return ZVal.assign(uses);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "ArrayIterator")
    private Object skipToNextStringOrNamespaceSeparator(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        while (ZVal.toBool(
                        ZVal.toBool(env.callMethod(tokens, "valid", ContextFactory.class))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                ZVal.getElement(
                                                        env.callMethod(
                                                                tokens,
                                                                "current",
                                                                ContextFactory.class),
                                                        0),
                                                "!==",
                                                319)))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getElement(
                                        env.callMethod(tokens, "current", ContextFactory.class), 0),
                                "!==",
                                390))) {
            env.callMethod(tokens, "next", ContextFactory.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "ArrayIterator")
    private Object extractUseStatement(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        Object result = ZVal.newArray();
        Object backslashPos = null;
        result = ZVal.newArray(new ZPair(0, ""));
        while (ZVal.toBool(
                        ZVal.toBool(env.callMethod(tokens, "valid", ContextFactory.class))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                ZVal.getElement(
                                                        env.callMethod(
                                                                tokens,
                                                                "current",
                                                                ContextFactory.class),
                                                        0),
                                                "!==",
                                                CONST_T_LITERAL_USE_SEPARATOR)))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getElement(
                                        env.callMethod(tokens, "current", ContextFactory.class), 0),
                                "!==",
                                CONST_T_LITERAL_END_OF_USE))) {
            if (ZVal.strictEqualityCheck(
                    ZVal.getElement(env.callMethod(tokens, "current", ContextFactory.class), 0),
                    "===",
                    338)) {
                ZVal.addToArray(result, "");
            }

            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    ZVal.getElement(
                                            env.callMethod(tokens, "current", ContextFactory.class),
                                            0),
                                    "===",
                                    319))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    ZVal.getElement(
                                            env.callMethod(tokens, "current", ContextFactory.class),
                                            0),
                                    "===",
                                    390))) {
                ZVal.putArrayElement(
                        result,
                        ZVal.subtract(CRArrayF.count.env(env).call(result).value(), 1),
                        toStringR(
                                        ZVal.getElement(
                                                result,
                                                ZVal.subtract(
                                                        CRArrayF.count
                                                                .env(env)
                                                                .call(result)
                                                                .value(),
                                                        1)),
                                        env)
                                + toStringR(
                                        ZVal.getElement(
                                                env.callMethod(
                                                        tokens, "current", ContextFactory.class),
                                                1),
                                        env));
            }

            env.callMethod(tokens, "next", ContextFactory.class);
        }

        if (ZVal.equalityCheck(CRArrayF.count.env(env).call(result).value(), 1)) {
            backslashPos =
                    NamespaceGlobal.strrpos.env(env).call(ZVal.getElement(result, 0), "\\").value();
            if (ZVal.strictNotEqualityCheck(false, "!==", backslashPos)) {
                ZVal.addToArray(
                        result,
                        NamespaceGlobal.substr
                                .env(env)
                                .call(ZVal.getElement(result, 0), ZVal.add(backslashPos, 1))
                                .value());

            } else {
                ZVal.addToArray(result, ZVal.getElement(result, 0));
            }
        }

        return ZVal.assign(CRArrayF.array_reverse.env(env).call(result).value());
    }

    public static final Object CONST_T_LITERAL_END_OF_USE = ";";

    public static final Object CONST_T_LITERAL_USE_SEPARATOR = ",";

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\ContextFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\Types\\ContextFactory")
                    .setLookup(ContextFactory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/ContextFactory.php")
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

    private enum SwitchEnumType3 {
        DYNAMIC_TYPE_10,
        DYNAMIC_TYPE_11,
        DYNAMIC_TYPE_12,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
