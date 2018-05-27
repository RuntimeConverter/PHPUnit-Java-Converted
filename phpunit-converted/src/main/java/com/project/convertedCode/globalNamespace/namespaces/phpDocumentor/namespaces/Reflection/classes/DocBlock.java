package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Description;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Tag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock.php

*/

public final class DocBlock extends RuntimeClassBase {

    public Object summary = "";

    public Object description = ZVal.getNull();

    public Object tags = ZVal.newArray();

    public Object context = ZVal.getNull();

    public Object location = ZVal.getNull();

    public Object isTemplateStart = false;

    public Object isTemplateEnd = false;

    public DocBlock(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DocBlock.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "summary")
    @ConvertedParameter(
        index = 1,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "tags",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "location",
        typeHint = "phpDocumentor\\Reflection\\Location",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "isTemplateStart",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "isTemplateEnd",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object summary = assignParameter(args, 0, null);
        if (ZVal.isNull(summary)) {
            summary = "";
        }
        Object description = assignParameter(args, 1, null);
        if (ZVal.isNull(description)) {
            description = ZVal.getNull();
        }
        Object tags = assignParameter(args, 2, null);
        if (ZVal.isNull(tags)) {
            tags = ZVal.newArray();
        }
        Object context = assignParameter(args, 3, null);
        if (ZVal.isNull(context)) {
            context = ZVal.getNull();
        }
        Object location = assignParameter(args, 4, null);
        if (ZVal.isNull(location)) {
            location = ZVal.getNull();
        }
        Object isTemplateStart = assignParameter(args, 5, null);
        if (ZVal.isNull(isTemplateStart)) {
            isTemplateStart = false;
        }
        Object isTemplateEnd = assignParameter(args, 6, null);
        if (ZVal.isNull(isTemplateEnd)) {
            isTemplateEnd = false;
        }
        Object tag = null;
        Assert.runtimeStaticObject.string(env, summary);
        Assert.runtimeStaticObject._pBoolean(env, isTemplateStart);
        Assert.runtimeStaticObject._pBoolean(env, isTemplateEnd);
        Assert.runtimeStaticObject.__callStatic(
                env, "allIsInstanceOf", ZVal.indexedArray(tags, Tag.CONST_class));
        toObjectR(this).accessProp(this, env).name("summary").set(summary);
        toObjectR(this)
                .accessProp(this, env)
                .name("description")
                .set(ZVal.isTrue(description) ? description : new Description(env, ""));
        for (ZPair zpairResult28 : ZVal.getIterable(tags, env, true)) {
            tag = ZVal.assign(zpairResult28.getValue());
            env.callMethod(this, "addTag", DocBlock.class, tag);
        }

        toObjectR(this).accessProp(this, env).name("context").set(context);
        toObjectR(this).accessProp(this, env).name("location").set(location);
        toObjectR(this).accessProp(this, env).name("isTemplateEnd").set(isTemplateEnd);
        toObjectR(this).accessProp(this, env).name("isTemplateStart").set(isTemplateStart);
        return null;
    }

    @ConvertedMethod
    public Object getSummary(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("summary").value());
    }

    @ConvertedMethod
    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("description").value());
    }

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("context").value());
    }

    @ConvertedMethod
    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("location").value());
    }

    @ConvertedMethod
    public Object isTemplateStart(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("isTemplateStart").value());
    }

    @ConvertedMethod
    public Object isTemplateEnd(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("isTemplateEnd").value());
    }

    @ConvertedMethod
    public Object getTags(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("tags").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getTagsByName(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object name = assignParameter(args, 0, null);
        Object result = ZVal.newArray();
        Object tag = null;
        Assert.runtimeStaticObject.string(env, name);
        result = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult29 :
                ZVal.getIterable(env.callMethod(this, "getTags", DocBlock.class), env, true)) {
            tag = ZVal.assign(zpairResult29.getValue());
            if (ZVal.strictNotEqualityCheck(
                    env.callMethod(tag, "getName", DocBlock.class), "!==", name)) {
                continue;
            }

            ZVal.addToArray(result, tag);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasTag(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object tag = null;
        Assert.runtimeStaticObject.string(env, name);
        for (ZPair zpairResult30 :
                ZVal.getIterable(env.callMethod(this, "getTags", DocBlock.class), env, true)) {
            tag = ZVal.assign(zpairResult30.getValue());
            if (ZVal.strictEqualityCheck(
                    env.callMethod(tag, "getName", DocBlock.class), "===", name)) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tagToRemove",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tag"
    )
    public Object removeTag(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object tagToRemove = assignParameter(args, 0, null);
        Object tag = null;
        Object key = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult31 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("tags").value(), env, false)) {
            key = ZVal.assign(zpairResult31.getKey());
            tag = ZVal.assign(zpairResult31.getValue());
            if (ZVal.strictEqualityCheck(tag, "===", tagToRemove)) {
                ZVal.unsetArrayElement(
                        toObjectR(this).accessProp(this, env).name("tags").value(), key);
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tag",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tag"
    )
    private Object addTag(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, null);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("tags").value(), tag);
        return null;
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock")
                    .setLookup(DocBlock.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "context",
                            "description",
                            "isTemplateEnd",
                            "isTemplateStart",
                            "location",
                            "summary",
                            "tags")
                    .setFilename("vendor/phpdocumentor/reflection-docblock/src/DocBlock.php")
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
