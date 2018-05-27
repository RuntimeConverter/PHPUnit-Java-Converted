package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Source.php

*/

public final class Source extends BaseTag implements StaticMethod {

    public Object name = "source";

    public Object startingLine = 1;

    public Object lineCount = ZVal.getNull();

    public Source(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Source.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "startingLine")
    @ConvertedParameter(
        index = 1,
        name = "lineCount",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object startingLine = assignParameter(args, 0, null);
        Object lineCount = assignParameter(args, 1, null);
        if (ZVal.isNull(lineCount)) {
            lineCount = ZVal.getNull();
        }
        Object description = assignParameter(args, 2, null);
        if (ZVal.isNull(description)) {
            description = ZVal.getNull();
        }
        Assert.runtimeStaticObject.integerish(env, startingLine);
        Assert.runtimeStaticObject.__callStatic(
                env, "nullOrIntegerish", ZVal.indexedArray(lineCount));
        toObjectR(this).accessProp(this, env).name("startingLine").set(ZVal.toLong(startingLine));
        toObjectR(this)
                .accessProp(this, env)
                .name("lineCount")
                .set(
                        ZVal.strictNotEqualityCheck(lineCount, "!==", ZVal.getNull())
                                ? ZVal.toLong(lineCount)
                                : ZVal.getNull());
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getStartingLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("startingLine").value());
    }

    @ConvertedMethod
    public Object getLineCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("lineCount").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("startingLine").value(), env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("lineCount")
                                                        .value(),
                                                "!==",
                                                ZVal.getNull())
                                        ? " "
                                                + toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("lineCount")
                                                                .value(),
                                                        env)
                                        : "",
                                env)
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("description").getBool()
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("description")
                                                                        .value(),
                                                                "render",
                                                                Source.class),
                                                        env)
                                        : "",
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Source";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        @ConvertedParameter(
            index = 1,
            name = "descriptionFactory",
            typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "context",
            typeHint = "phpDocumentor\\Reflection\\Types\\Context",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, null);
            Object descriptionFactory = assignParameter(args, 1, null);
            if (ZVal.isNull(descriptionFactory)) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 2, null);
            if (ZVal.isNull(context)) {
                context = ZVal.getNull();
            }
            Object startingLine = null;
            Object description = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Object lineCount = null;
            Assert.runtimeStaticObject.stringNotEmpty(env, body);
            Assert.runtimeStaticObject.notNull(env, descriptionFactory);
            startingLine = 1;
            lineCount = ZVal.getNull();
            description = ZVal.getNull();
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^([1-9]\\d*)\\s*(?:((?1))\\s+)?(.*)$/sux", body, matches.getObject())
                    .getBool()) {
                startingLine = ZVal.assign(ZVal.toLong(ZVal.getElement(matches.getObject(), 1)));
                if (ZVal.toBool(ZVal.isset(ZVal.getElement(matches.getObject(), 2)))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.getElement(matches.getObject(), 2), "!==", ""))) {
                    lineCount = ZVal.assign(ZVal.toLong(ZVal.getElement(matches.getObject(), 2)));
                }

                description = ZVal.assign(ZVal.getElement(matches.getObject(), 3));
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            startingLine,
                            lineCount,
                            env.callMethod(
                                    descriptionFactory,
                                    "create",
                                    Source.class,
                                    description,
                                    context)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Source")
                    .setLookup(Source.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("description", "lineCount", "name", "name", "startingLine")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Source.php")
                    .addInterface("StaticMethod")
                    .addInterface("Tag")
                    .addExtendsClass("phpDocumentor\\Reflection\\DocBlock\\Tags\\BaseTag")
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
