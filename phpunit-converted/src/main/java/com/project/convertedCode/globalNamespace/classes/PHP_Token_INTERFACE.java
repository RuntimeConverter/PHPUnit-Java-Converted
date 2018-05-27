package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_STRING;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_WHITESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_CURLY;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_EXTENDS;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_IMPLEMENTS;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NAMESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_TokenWithScopeAndVisibility;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_INTERFACE extends PHP_TokenWithScopeAndVisibility {

    public Object interfaces = null;

    public PHP_Token_INTERFACE(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_INTERFACE.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                                ZVal.add(
                                        toObjectR(this).accessProp(this, env).name("id").value(),
                                        2)),
                        env));
    }

    @ConvertedMethod
    public Object hasParent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.checkInstanceType(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                                ZVal.add(
                                        toObjectR(this).accessProp(this, env).name("id").value(),
                                        4)),
                        PHP_Token_EXTENDS.class,
                        "PHP_Token_EXTENDS"));
    }

    @ConvertedMethod
    public Object getPackage(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object result = ZVal.newArray();
        Object docComment = null;
        Object i = null;
        Object className = null;
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        className = env.callMethod(this, "getName", PHP_Token_INTERFACE.class);
        docComment = env.callMethod(this, "getDocblock", PHP_Token_INTERFACE.class);
        result =
                ZVal.newArray(
                        new ZPair("namespace", ""),
                        new ZPair("fullPackage", ""),
                        new ZPair("category", ""),
                        new ZPair("package", ""),
                        new ZPair("subpackage", ""));
        runtimeConverterBreakCount = 0;
        for (i = ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value());
                ZVal.isTrue(i);
                i = ZVal.decrement(i)) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("tokenStream")
                                            .value(),
                                    i),
                            PHP_Token_NAMESPACE.class,
                            "PHP_Token_NAMESPACE"))) {
                ZVal.putArrayElement(
                        result,
                        "namespace",
                        env.callMethod(
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("tokenStream")
                                                .value(),
                                        i),
                                "getName",
                                PHP_Token_INTERFACE.class));
                break;
            }
        }

        if (NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/@category[\\s]+([\\.\\w]+)/", docComment, matches.getObject())
                .getBool()) {
            ZVal.putArrayElement(result, "category", ZVal.getElement(matches.getObject(), 1));
        }

        if (NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/@package[\\s]+([\\.\\w]+)/", docComment, matches.getObject())
                .getBool()) {
            ZVal.putArrayElement(result, "package", ZVal.getElement(matches.getObject(), 1));
            ZVal.putArrayElement(result, "fullPackage", ZVal.getElement(matches.getObject(), 1));
        }

        if (NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/@subpackage[\\s]+([\\.\\w]+)/", docComment, matches.getObject())
                .getBool()) {
            ZVal.putArrayElement(result, "subpackage", ZVal.getElement(matches.getObject(), 1));
            ZVal.putArrayElement(
                    result,
                    "fullPackage",
                    toStringR(ZVal.getElement(result, "fullPackage"), env)
                            + "."
                            + toStringR(ZVal.getElement(matches.getObject(), 1), env));
        }

        if (ZVal.isEmpty(ZVal.getElement(result, "fullPackage"))) {
            ZVal.putArrayElement(
                    result,
                    "fullPackage",
                    env.callMethod(
                            this,
                            "arrayToName",
                            PHP_Token_INTERFACE.class,
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(
                                            "_",
                                            NamespaceGlobal.str_replace
                                                    .env(env)
                                                    .addReferneceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call("\\", "_", className)
                                                    .value())
                                    .value(),
                            "."));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parts", typeHint = "array")
    @ConvertedParameter(index = 1, name = "join")
    protected Object arrayToName(RuntimeEnv env, Object... args) {
        Object parts = assignParameter(args, 0, null);
        Object join = assignParameter(args, 1, null);
        if (ZVal.isNull(join)) {
            join = "\\";
        }
        Object result = null;
        result = "";
        if (ZVal.isGreaterThan(CRArrayF.count.env(env).call(parts).value(), '>', 1)) {
            CRArrayF.array_pop.env(env).call(parts);
            result = NamespaceGlobal.implode.env(env).call(join, parts).value();
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getParent(RuntimeEnv env, Object... args) {
        Object i = null;
        Object tokens = ZVal.newArray();
        Object className = null;
        if (!ZVal.isTrue(env.callMethod(this, "hasParent", PHP_Token_INTERFACE.class))) {
            return ZVal.assign(false);
        }

        i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 6);
        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_INTERFACE.class);
        className = ZVal.assign(toStringR(ZVal.getElement(tokens, i), env));
        while (ZVal.toBool(ZVal.isset(ZVal.getElement(tokens, ZVal.add(i, 1))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        ZVal.getElement(tokens, ZVal.add(i, 1)),
                                        PHP_Token_WHITESPACE.class,
                                        "PHP_Token_WHITESPACE")))) {
            className =
                    toStringR(className, env)
                            + toStringR(
                                    toStringR(
                                            ZVal.getElement(
                                                    tokens, ((long) (i = ZVal.increment(i)))),
                                            env),
                                    env);
        }

        return ZVal.assign(className);
    }

    @ConvertedMethod
    public Object hasInterfaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.isset(
                                                        ZVal.getElement(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("tokenStream")
                                                                        .value(),
                                                                ZVal.add(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("id")
                                                                                .value(),
                                                                        4))))
                                        && ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        ZVal.getElement(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("tokenStream")
                                                                        .value(),
                                                                ZVal.add(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("id")
                                                                                .value(),
                                                                        4)),
                                                        PHP_Token_IMPLEMENTS.class,
                                                        "PHP_Token_IMPLEMENTS")))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.isset(
                                                        ZVal.getElement(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("tokenStream")
                                                                        .value(),
                                                                ZVal.add(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("id")
                                                                                .value(),
                                                                        8))))
                                        && ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        ZVal.getElement(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("tokenStream")
                                                                        .value(),
                                                                ZVal.add(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("id")
                                                                                .value(),
                                                                        8)),
                                                        PHP_Token_IMPLEMENTS.class,
                                                        "PHP_Token_IMPLEMENTS"))));
    }

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args) {
        Object i = null;
        Object tokens = ZVal.newArray();
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("interfaces").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("interfaces").value());
        }

        if (!ZVal.isTrue(env.callMethod(this, "hasInterfaces", PHP_Token_INTERFACE.class))) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("interfaces").set(false));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                                ZVal.add(
                                        toObjectR(this).accessProp(this, env).name("id").value(),
                                        4)),
                        PHP_Token_IMPLEMENTS.class,
                        "PHP_Token_IMPLEMENTS"))) {
            i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 3);

        } else {
            i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 7);
        }

        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_INTERFACE.class);
        while (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(tokens, ZVal.add(i, 1)),
                        PHP_Token_OPEN_CURLY.class,
                        "PHP_Token_OPEN_CURLY"))) {
            i = ZVal.increment(i);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            ZVal.getElement(tokens, i),
                            PHP_Token_STRING.class,
                            "PHP_Token_STRING"))) {
                ZVal.addToArray(
                        toObjectR(this).accessProp(this, env).name("interfaces").value(),
                        toStringR(ZVal.getElement(tokens, i), env));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("interfaces").value());
    }

    public static final Object CONST_class = "PHP_Token_INTERFACE";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends PHP_TokenWithScopeAndVisibility.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_INTERFACE")
                    .setLookup(PHP_Token_INTERFACE.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "endTokenId", "id", "interfaces", "line", "text", "tokenStream")
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
