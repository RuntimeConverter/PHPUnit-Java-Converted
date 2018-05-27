package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Formatter.classes.PassthroughFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Description.php

*/

public class Description extends RuntimeClassBase {

    public Object bodyTemplate = null;

    public Object tags = null;

    public Description(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Description.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bodyTemplate")
    @ConvertedParameter(
        index = 1,
        name = "tags",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object bodyTemplate = assignParameter(args, 0, null);
        Object tags = assignParameter(args, 1, null);
        if (ZVal.isNull(tags)) {
            tags = ZVal.newArray();
        }
        Assert.runtimeStaticObject.string(env, bodyTemplate);
        toObjectR(this).accessProp(this, env).name("bodyTemplate").set(bodyTemplate);
        toObjectR(this).accessProp(this, env).name("tags").set(tags);
        return null;
    }

    @ConvertedMethod
    public Object getTags(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("tags").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object render(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, null);
        if (ZVal.isNull(formatter)) {
            formatter = ZVal.getNull();
        }
        Object tag = null;
        Object tags = ZVal.newArray();
        if (ZVal.strictEqualityCheck(formatter, "===", ZVal.getNull())) {
            formatter = new PassthroughFormatter(env);
        }

        tags = ZVal.newArray();
        for (ZPair zpairResult32 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("tags").value(), env, true)) {
            tag = ZVal.assign(zpairResult32.getValue());
            ZVal.addToArray(
                    tags,
                    "{"
                            + toStringR(
                                    env.callMethod(formatter, "format", Description.class, tag),
                                    env)
                            + "}");
        }

        return ZVal.assign(
                NamespaceGlobal.vsprintf
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("bodyTemplate").value(),
                                tags)
                        .value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "render", Description.class));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Description";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Description")
                    .setLookup(Description.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("bodyTemplate", "tags")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Description.php")
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
