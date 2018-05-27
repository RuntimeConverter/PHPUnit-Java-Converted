package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.StandardTagFactory;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.TypeResolver;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.DocBlockFactoryInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.FqsenResolver;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Tag;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.DocBlock;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.DescriptionFactory;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlockFactory.php

*/

public final class DocBlockFactory extends RuntimeClassBase implements DocBlockFactoryInterface {

    public Object descriptionFactory = null;

    public Object tagFactory = null;

    public DocBlockFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DocBlockFactory.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "descriptionFactory",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory"
    )
    @ConvertedParameter(
        index = 1,
        name = "tagFactory",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\TagFactory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object descriptionFactory = assignParameter(args, 0, null);
        Object tagFactory = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("descriptionFactory").set(descriptionFactory);
        toObjectR(this).accessProp(this, env).name("tagFactory").set(tagFactory);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "docblock")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "location",
        typeHint = "phpDocumentor\\Reflection\\Location",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object docblock = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        if (ZVal.isNull(context)) {
            context = ZVal.getNull();
        }
        Object location = assignParameter(args, 2, null);
        if (ZVal.isNull(location)) {
            location = ZVal.getNull();
        }
        Object summary = null;
        Object runtimeTempArrayResult4 = null;
        Object parts = null;
        Object description = null;
        Object exceptionMessage = null;
        Object templateMarker = null;
        Object tags = null;
        if (function_is_object.f.env(env).call(docblock).getBool()) {
            if (!function_method_exists.f.env(env).call(docblock, "getDocComment").getBool()) {
                exceptionMessage =
                        "Invalid object passed; the given object must support the getDocComment method";
                throw ZVal.getException(env, new InvalidArgumentException(env, exceptionMessage));
            }

            docblock = env.callMethod(docblock, "getDocComment", DocBlockFactory.class);
        }

        Assert.runtimeStaticObject.stringNotEmpty(env, docblock);
        if (ZVal.strictEqualityCheck(context, "===", ZVal.getNull())) {
            context = new Context(env, "");
        }

        parts =
                env.callMethod(
                        this,
                        "splitDocBlock",
                        DocBlockFactory.class,
                        env.callMethod(this, "stripDocComment", DocBlockFactory.class, docblock));
        ZVal.list(
                runtimeTempArrayResult4 = parts,
                (templateMarker = ZVal.assign(ZVal.getElement(runtimeTempArrayResult4, 0))),
                (summary = ZVal.assign(ZVal.getElement(runtimeTempArrayResult4, 1))),
                (description = ZVal.assign(ZVal.getElement(runtimeTempArrayResult4, 2))),
                (tags = ZVal.assign(ZVal.getElement(runtimeTempArrayResult4, 3))));
        return ZVal.assign(
                new DocBlock(
                        env,
                        summary,
                        ZVal.isTrue(description)
                                ? env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("descriptionFactory")
                                                .value(),
                                        "create",
                                        DocBlockFactory.class,
                                        description,
                                        context)
                                : ZVal.getNull(),
                        CRArrayF.array_filter
                                .env(env)
                                .call(
                                        env.callMethod(
                                                this,
                                                "parseTagBlock",
                                                DocBlockFactory.class,
                                                tags,
                                                context),
                                        new Closure(env) {
                                            @Override
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object tag = assignParameter(args, 0, null);
                                                return ZVal.assign(
                                                        ZVal.checkInstanceType(
                                                                tag,
                                                                Tag.class,
                                                                "phpDocumentor\\Reflection\\DocBlock\\Tag"));
                                            }
                                        })
                                .value(),
                        context,
                        location,
                        ZVal.strictEqualityCheck(templateMarker, "===", "#@+"),
                        ZVal.strictEqualityCheck(templateMarker, "===", "#@-")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagName")
    @ConvertedParameter(index = 1, name = "handler")
    public Object registerTagHandler(RuntimeEnv env, Object... args) {
        Object tagName = assignParameter(args, 0, null);
        Object handler = assignParameter(args, 1, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("tagFactory").value(),
                "registerTagHandler",
                DocBlockFactory.class,
                tagName,
                handler);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comment")
    private Object stripDocComment(RuntimeEnv env, Object... args) {
        Object comment = assignParameter(args, 0, null);
        comment =
                NamespaceGlobal.trim
                        .env(env)
                        .call(
                                NamespaceGlobal.preg_replace
                                        .env(env)
                                        .addReferneceArgs(new RuntimeArgsWithReferences())
                                        .call(
                                                "#[ \\t]*(?:\\/\\*\\*|\\*\\/|\\*)?[ \\t]{0,1}(.*)?#u",
                                                "$1",
                                                comment)
                                        .value())
                        .value();
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.substr.env(env).call(comment, -2).value(), "===", "*/")) {
            comment =
                    NamespaceGlobal.trim
                            .env(env)
                            .call(NamespaceGlobal.substr.env(env).call(comment, 0, -2).value())
                            .value();
        }

        return ZVal.assign(
                NamespaceGlobal.str_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call(
                                ZVal.newArray(new ZPair(0, "\r\n"), new ZPair(1, "\r")),
                                "\n",
                                comment)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comment")
    private Object splitDocBlock(RuntimeEnv env, Object... args) {
        Object comment = assignParameter(args, 0, null);
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(comment, "@").value(), "===", 0)) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, ""),
                            new ZPair(1, ""),
                            new ZPair(2, ""),
                            new ZPair(3, comment)));
        }

        comment =
                NamespaceGlobal.preg_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call("/\\h*$/Sum", "", comment)
                        .value();
        NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/\n            \\A\n            # 1. Extract the template marker\n            (?:(\\#\\@\\+|\\#\\@\\-)\\n?)?\n\n            # 2. Extract the summary\n            (?:\n              (?! @\\pL ) # The summary may not start with an @\n              (\n                [^\\n.]+\n                (?:\n                  (?! \\. \\n | \\n{2} )     # End summary upon a dot followed by newline or two newlines\n                  [\\n.] (?! [ \\t]* @\\pL ) # End summary when an @ is found as first character on a new line\n                  [^\\n.]+                 # Include anything else\n                )*\n                \\.?\n              )?\n            )\n\n            # 3. Extract the description\n            (?:\n              \\s*        # Some form of whitespace _must_ precede a description because a summary must be there\n              (?! @\\pL ) # The description may not start with an @\n              (\n                [^\\n]+\n                (?: \\n+\n                  (?! [ \\t]* @\\pL ) # End description when an @ is found as first character on a new line\n                  [^\\n]+            # Include anything else\n                )*\n              )\n            )?\n\n            # 4. Extract the tags (anything that follows)\n            (\\s+ [\\s\\S]*)? # everything that follows\n            /ux",
                        comment, matches.getObject());
        CRArrayF.array_shift.env(env).call(matches.getObject());
        while (ZVal.isLessThan(CRArrayF.count.env(env).call(matches.getObject()).value(), '<', 4)) {
            ZVal.addToArray(matches.getObject(), "");
        }

        return ZVal.assign(matches.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tags")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object parseTagBlock(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        Object result = ZVal.newArray();
        Object tagLine = null;
        Object key = null;
        tags = env.callMethod(this, "filterTagBlock", DocBlockFactory.class, tags);
        if (!ZVal.isTrue(tags)) {
            return ZVal.assign(ZVal.newArray());
        }

        result = env.callMethod(this, "splitTagBlockIntoTagLines", DocBlockFactory.class, tags);
        for (ZPair zpairResult41 : ZVal.getIterable(result, env, false)) {
            key = ZVal.assign(zpairResult41.getKey());
            tagLine = ZVal.assign(zpairResult41.getValue());
            ZVal.putArrayElement(
                    result,
                    key,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("tagFactory").value(),
                            "create",
                            DocBlockFactory.class,
                            NamespaceGlobal.trim.env(env).call(tagLine).value(),
                            context));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tags")
    private Object splitTagBlockIntoTagLines(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, null);
        Object result = ZVal.newArray();
        Object tag_line = ZVal.newArray();
        result = ZVal.newArray();
        for (ZPair zpairResult42 :
                ZVal.getIterable(
                        NamespaceGlobal.explode.env(env).call("\n", tags).value(), env, true)) {
            tag_line = ZVal.assign(zpairResult42.getValue());
            if (ZVal.toBool(ZVal.isset(ZVal.getElement(tag_line, 0)))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(ZVal.getElement(tag_line, 0), "===", "@"))) {
                ZVal.addToArray(result, tag_line);

            } else {
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
                                + "\n"
                                + toStringR(tag_line, env));
            }
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tags")
    private Object filterTagBlock(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, null);
        if (ZVal.isNull(tags)) {
            tags = ZVal.newArray();
        }
        tags = NamespaceGlobal.trim.env(env).call(tags).value();
        if (!ZVal.isTrue(tags)) {
            return ZVal.assign(ZVal.getNull());
        }

        if (ZVal.strictNotEqualityCheck("@", "!==", ZVal.getElement(tags, 0))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "A tag block started with text instead of an at-sign(@): "
                                    + toStringR(tags, env)));
        }

        return ZVal.assign(tags);
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlockFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "additionalTags",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object createInstance(RuntimeEnv env, Object... args) {
            Object additionalTags = assignParameter(args, 0, null);
            if (ZVal.isNull(additionalTags)) {
                additionalTags = ZVal.newArray();
            }
            Object docBlockFactory = null;
            Object tagFactory = null;
            Object tagHandler = null;
            Object descriptionFactory = null;
            Object fqsenResolver = null;
            Object tagName = null;
            fqsenResolver = new FqsenResolver(env);
            tagFactory = new StandardTagFactory(env, fqsenResolver);
            descriptionFactory = new DescriptionFactory(env, tagFactory);
            env.callMethod(tagFactory, "addService", DocBlockFactory.class, descriptionFactory);
            env.callMethod(
                    tagFactory,
                    "addService",
                    DocBlockFactory.class,
                    new TypeResolver(env, fqsenResolver));
            docBlockFactory =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .phpDocumentor
                            .namespaces
                            .Reflection
                            .classes
                            .DocBlockFactory(env, descriptionFactory, tagFactory);
            for (ZPair zpairResult40 : ZVal.getIterable(additionalTags, env, false)) {
                tagName = ZVal.assign(zpairResult40.getKey());
                tagHandler = ZVal.assign(zpairResult40.getValue());
                env.callMethod(
                        docBlockFactory,
                        "registerTagHandler",
                        DocBlockFactory.class,
                        tagName,
                        tagHandler);
            }

            return ZVal.assign(docBlockFactory);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlockFactory")
                    .setLookup(DocBlockFactory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("descriptionFactory", "tagFactory")
                    .setFilename("vendor/phpdocumentor/reflection-docblock/src/DocBlockFactory.php")
                    .addInterface("DocBlockFactoryInterface")
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
