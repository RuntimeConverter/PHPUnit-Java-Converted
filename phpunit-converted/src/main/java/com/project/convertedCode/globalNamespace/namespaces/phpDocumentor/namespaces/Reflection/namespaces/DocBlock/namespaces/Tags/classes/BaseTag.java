package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Formatter.classes.PassthroughFormatter;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Tag;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/BaseTag.php

*/

public abstract class BaseTag extends RuntimeClassBase implements Tag {

    public Object name = "";

    public Object description = null;

    public BaseTag(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("description").value());
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
        if (ZVal.strictEqualityCheck(formatter, "===", ZVal.getNull())) {
            formatter = new PassthroughFormatter(env);
        }

        return ZVal.assign(env.callMethod(formatter, "format", BaseTag.class, this));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\BaseTag";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\BaseTag")
                    .setLookup(BaseTag.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("description", "name")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/BaseTag.php")
                    .addInterface("Tag")
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
