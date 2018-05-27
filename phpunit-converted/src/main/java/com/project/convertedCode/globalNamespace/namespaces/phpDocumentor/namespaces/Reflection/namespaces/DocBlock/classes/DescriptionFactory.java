package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Description;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/DescriptionFactory.php

*/

public class DescriptionFactory extends RuntimeClassBase {

    public Object tagFactory = null;

    public DescriptionFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DescriptionFactory.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tagFactory",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\TagFactory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tagFactory = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("tagFactory").set(tagFactory);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contents")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object contents = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        if (ZVal.isNull(context)) {
            context = ZVal.getNull();
        }
        Object runtimeTempArrayResult1 = null;
        Object text = null;
        Object tags = null;
        ZVal.list(
                runtimeTempArrayResult1 =
                        env.callMethod(
                                this,
                                "parse",
                                DescriptionFactory.class,
                                env.callMethod(this, "lex", DescriptionFactory.class, contents),
                                context),
                (text = ZVal.assign(ZVal.getElement(runtimeTempArrayResult1, 0))),
                (tags = ZVal.assign(ZVal.getElement(runtimeTempArrayResult1, 1))));
        return ZVal.assign(new Description(env, text, tags));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contents")
    private Object lex(RuntimeEnv env, Object... args) {
        Object contents = assignParameter(args, 0, null);
        contents =
                env.callMethod(
                        this,
                        "removeSuperfluousStartingWhitespace",
                        DescriptionFactory.class,
                        contents);
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(contents, "{@").value(), "===", false)) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, contents)));
        }

        return ZVal.assign(
                NamespaceGlobal.preg_split
                        .env(env)
                        .call(
                                "/\\{\n                # \"{@}\" is not a valid inline tag. This ensures that we do not treat it as one, but treat it literally.\n                (?!@\\})\n                # We want to capture the whole tag line, but without the inline tag delimiters.\n                (\\@\n                    # Match everything up to the next delimiter.\n                    [^{}]*\n                    # Nested inline tag content should not be captured, or it will appear in the result separately.\n                    (?:\n                        # Match nested inline tags.\n                        (?:\n                            # Because we did not catch the tag delimiters earlier, we must be explicit with them here.\n                            # Notice that this also matches \"{}\", as a way to later introduce it as an escape sequence.\n                            \\{(?1)?\\}\n                            |\n                            # Make sure we match hanging \"{\".\n                            \\{\n                        )\n                        # Match content after the nested inline tag.\n                        [^{}]*\n                    )* # If there are more inline tags, match them as well. We use \"*\" since there may not be any\n                       # nested inline tags.\n                )\n            \\}/Sux",
                                contents,
                                ZVal.getNull(),
                                2)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object parse(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        if (ZVal.isNull(tokens)) {
            tokens = ZVal.newArray();
        }
        Object context = assignParameter(args, 1, null);
        Object count = null;
        Object tagCount = null;
        Object i = null;
        Object tags = ZVal.newArray();
        count = CRArrayF.count.env(env).call(tokens).value();
        tagCount = 0;
        tags = ZVal.newArray();
        for (i = 1; ZVal.isLessThan(i, '<', count); i = ZAssignment.add("+=", i, 2)) {
            ZVal.addToArray(
                    tags,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("tagFactory").value(),
                            "create",
                            DescriptionFactory.class,
                            ZVal.getElement(tokens, i),
                            context));
            ZVal.putArrayElement(
                    tokens,
                    i,
                    "%" + toStringR(((long) (tagCount = ZVal.increment(tagCount))), env) + "$s");
        }

        for (i = 0; ZVal.isLessThan(i, '<', count); i = ZAssignment.add("+=", i, 2)) {
            ZVal.putArrayElement(
                    tokens,
                    i,
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, "{@}"),
                                            new ZPair(1, "{}"),
                                            new ZPair(2, "%")),
                                    ZVal.newArray(
                                            new ZPair(0, "@"),
                                            new ZPair(1, "}"),
                                            new ZPair(2, "%%")),
                                    ZVal.getElement(tokens, i))
                            .value());
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, NamespaceGlobal.implode.env(env).call("", tokens).value()),
                        new ZPair(1, tags)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contents")
    private Object removeSuperfluousStartingWhitespace(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object contents = assignParameter(args, 0, null);
        Object startingSpaceCount = null;
        Object i = null;
        Object lines = ZVal.newArray();
        lines = NamespaceGlobal.explode.env(env).call("\n", contents).value();
        if (ZVal.isLessThanOrEqualTo(CRArrayF.count.env(env).call(lines).value(), "<=", 1)) {
            return ZVal.assign(contents);
        }

        startingSpaceCount = 9999999;
        runtimeConverterContinueCount = 0;
        for (i = 1;
                ZVal.isLessThan(i, '<', CRArrayF.count.env(env).call(lines).value());
                i = ZVal.increment(i)) {
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strlen
                            .env(env)
                            .call(
                                    NamespaceGlobal.trim
                                            .env(env)
                                            .call(ZVal.getElement(lines, i))
                                            .value())
                            .value(),
                    "===",
                    0)) {
                continue;
            }

            startingSpaceCount =
                    NamespaceGlobal.min
                            .env(env)
                            .call(
                                    startingSpaceCount,
                                    ZVal.subtract(
                                            NamespaceGlobal.strlen
                                                    .env(env)
                                                    .call(ZVal.getElement(lines, i))
                                                    .value(),
                                            NamespaceGlobal.strlen
                                                    .env(env)
                                                    .call(
                                                            NamespaceGlobal.ltrim
                                                                    .env(env)
                                                                    .call(ZVal.getElement(lines, i))
                                                                    .value())
                                                    .value()))
                            .value();
        }

        if (ZVal.isGreaterThan(startingSpaceCount, '>', 0)) {
            runtimeConverterContinueCount = 0;
            for (i = 1;
                    ZVal.isLessThan(i, '<', CRArrayF.count.env(env).call(lines).value());
                    i = ZVal.increment(i)) {
                ZVal.putArrayElement(
                        lines,
                        i,
                        NamespaceGlobal.substr
                                .env(env)
                                .call(ZVal.getElement(lines, i), startingSpaceCount)
                                .value());
            }
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\n", lines).value());
    }

    public static final Object CONST_class =
            "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory")
                    .setLookup(DescriptionFactory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("tagFactory")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/DescriptionFactory.php")
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
