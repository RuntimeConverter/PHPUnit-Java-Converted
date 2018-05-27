package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Formatter.classes.PassthroughFormatter;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Serializer.php

*/

public class Serializer extends RuntimeClassBase {

    public Object indentString = " ";

    public Object indent = 0;

    public Object isFirstLineIndented = true;

    public Object lineLength = ZVal.getNull();

    public Object tagFormatter = ZVal.getNull();

    public Serializer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Serializer.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "indent", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(index = 1, name = "indentString")
    @ConvertedParameter(
        index = 2,
        name = "indentFirstLine",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "lineLength",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "tagFormatter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object indent = assignParameter(args, 0, null);
        if (ZVal.isNull(indent)) {
            indent = 0;
        }
        Object indentString = assignParameter(args, 1, null);
        if (ZVal.isNull(indentString)) {
            indentString = " ";
        }
        Object indentFirstLine = assignParameter(args, 2, null);
        if (ZVal.isNull(indentFirstLine)) {
            indentFirstLine = true;
        }
        Object lineLength = assignParameter(args, 3, null);
        if (ZVal.isNull(lineLength)) {
            lineLength = ZVal.getNull();
        }
        Object tagFormatter = assignParameter(args, 4, null);
        if (ZVal.isNull(tagFormatter)) {
            tagFormatter = ZVal.getNull();
        }
        Assert.runtimeStaticObject.integer(env, indent);
        Assert.runtimeStaticObject.string(env, indentString);
        Assert.runtimeStaticObject._pBoolean(env, indentFirstLine);
        Assert.runtimeStaticObject.__callStatic(
                env, "nullOrInteger", ZVal.indexedArray(lineLength));
        Assert.runtimeStaticObject.__callStatic(
                env,
                "nullOrIsInstanceOf",
                ZVal.indexedArray(
                        tagFormatter, "phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter"));
        toObjectR(this).accessProp(this, env).name("indent").set(indent);
        toObjectR(this).accessProp(this, env).name("indentString").set(indentString);
        toObjectR(this).accessProp(this, env).name("isFirstLineIndented").set(indentFirstLine);
        toObjectR(this).accessProp(this, env).name("lineLength").set(lineLength);
        toObjectR(this)
                .accessProp(this, env)
                .name("tagFormatter")
                .set(ZVal.isTrue(tagFormatter) ? tagFormatter : new PassthroughFormatter(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "docblock",
        typeHint = "phpDocumentor\\Reflection\\DocBlock"
    )
    public Object getDocComment(RuntimeEnv env, Object... args) {
        Object docblock = assignParameter(args, 0, null);
        Object indent = null;
        Object comment = null;
        Object text = null;
        Object firstIndent = null;
        Object wrapLength = null;
        indent =
                NamespaceGlobal.str_repeat
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("indentString").value(),
                                toObjectR(this).accessProp(this, env).name("indent").value())
                        .value();
        firstIndent =
                ZVal.assign(
                        toObjectR(this).accessProp(this, env).name("isFirstLineIndented").getBool()
                                ? indent
                                : "");
        wrapLength =
                ZVal.assign(
                        toObjectR(this).accessProp(this, env).name("lineLength").getBool()
                                ? ZVal.subtract(
                                        ZVal.subtract(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("lineLength")
                                                        .value(),
                                                NamespaceGlobal.strlen
                                                        .env(env)
                                                        .call(indent)
                                                        .value()),
                                        3)
                                : ZVal.getNull());
        text =
                env.callMethod(
                        this,
                        "removeTrailingSpaces",
                        Serializer.class,
                        indent,
                        env.callMethod(
                                this,
                                "addAsterisksForEachLine",
                                Serializer.class,
                                indent,
                                env.callMethod(
                                        this,
                                        "getSummaryAndDescriptionTextBlock",
                                        Serializer.class,
                                        docblock,
                                        wrapLength)));
        comment = ZVal.assign(toStringR(firstIndent, env) + "/**\n");
        if (ZVal.isTrue(text)) {
            comment =
                    toStringR(comment, env)
                            + toStringR(
                                    toStringR(indent, env) + " * " + toStringR(text, env) + "\n",
                                    env);
            comment = toStringR(comment, env) + toStringR(toStringR(indent, env) + " *\n", env);
        }

        comment =
                env.callMethod(
                        this,
                        "addTagBlock",
                        Serializer.class,
                        docblock,
                        wrapLength,
                        indent,
                        comment);
        comment = toStringR(comment, env) + toStringR(indent, env) + " */";
        return ZVal.assign(comment);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "indent")
    @ConvertedParameter(index = 1, name = "text")
    private Object removeTrailingSpaces(RuntimeEnv env, Object... args) {
        Object indent = assignParameter(args, 0, null);
        Object text = assignParameter(args, 1, null);
        return ZVal.assign(
                NamespaceGlobal.str_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call(
                                "\n" + toStringR(indent, env) + " * \n",
                                "\n" + toStringR(indent, env) + " *\n",
                                text)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "indent")
    @ConvertedParameter(index = 1, name = "text")
    private Object addAsterisksForEachLine(RuntimeEnv env, Object... args) {
        Object indent = assignParameter(args, 0, null);
        Object text = assignParameter(args, 1, null);
        return ZVal.assign(
                NamespaceGlobal.str_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call("\n", "\n" + toStringR(indent, env) + " * ", text)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "docblock",
        typeHint = "phpDocumentor\\Reflection\\DocBlock"
    )
    @ConvertedParameter(index = 1, name = "wrapLength")
    private Object getSummaryAndDescriptionTextBlock(RuntimeEnv env, Object... args) {
        Object docblock = assignParameter(args, 0, null);
        Object wrapLength = assignParameter(args, 1, null);
        Object text = null;
        text =
                toStringR(env.callMethod(docblock, "getSummary", Serializer.class), env)
                        + toStringR(
                                ZVal.isTrue(
                                                toStringR(
                                                        env.callMethod(
                                                                docblock,
                                                                "getDescription",
                                                                Serializer.class),
                                                        env))
                                        ? "\n\n"
                                                + toStringR(
                                                        env.callMethod(
                                                                docblock,
                                                                "getDescription",
                                                                Serializer.class),
                                                        env)
                                        : "",
                                env);
        if (ZVal.strictNotEqualityCheck(wrapLength, "!==", ZVal.getNull())) {
            text = NamespaceGlobal.wordwrap.env(env).call(text, wrapLength).value();
            return ZVal.assign(text);
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "docblock",
        typeHint = "phpDocumentor\\Reflection\\DocBlock"
    )
    @ConvertedParameter(index = 1, name = "wrapLength")
    @ConvertedParameter(index = 2, name = "indent")
    @ConvertedParameter(index = 3, name = "comment")
    private Object addTagBlock(RuntimeEnv env, Object... args) {
        Object docblock = assignParameter(args, 0, null);
        Object wrapLength = assignParameter(args, 1, null);
        Object indent = assignParameter(args, 2, null);
        Object comment = assignParameter(args, 3, null);
        Object tagText = null;
        Object tag = null;
        for (ZPair zpairResult34 :
                ZVal.getIterable(
                        env.callMethod(docblock, "getTags", Serializer.class), env, true)) {
            tag = ZVal.assign(zpairResult34.getValue());
            tagText =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("tagFormatter").value(),
                            "format",
                            Serializer.class,
                            tag);
            if (ZVal.strictNotEqualityCheck(wrapLength, "!==", ZVal.getNull())) {
                tagText = NamespaceGlobal.wordwrap.env(env).call(tagText, wrapLength).value();
            }

            tagText =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call("\n", "\n" + toStringR(indent, env) + " * ", tagText)
                            .value();
            comment =
                    toStringR(comment, env)
                            + toStringR(
                                    toStringR(indent, env) + " * " + toStringR(tagText, env) + "\n",
                                    env);
        }

        return ZVal.assign(comment);
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Serializer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Serializer")
                    .setLookup(Serializer.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "indent",
                            "indentString",
                            "isFirstLineIndented",
                            "lineLength",
                            "tagFormatter")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Serializer.php")
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
