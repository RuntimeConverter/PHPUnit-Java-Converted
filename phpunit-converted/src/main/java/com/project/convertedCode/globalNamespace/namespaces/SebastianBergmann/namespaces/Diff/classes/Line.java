package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Line.php

*/

public final class Line extends RuntimeClassBase {

    public Object type = null;

    public Object content = null;

    public Line(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Line.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "int")
    @ConvertedParameter(index = 1, name = "content", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        if (ZVal.isNull(type)) {
            type = CONST_UNCHANGED;
        }
        Object content = assignParameter(args, 1, null);
        if (ZVal.isNull(content)) {
            content = "";
        }
        toObjectR(this).accessProp(this, env).name("type").set(type);
        toObjectR(this).accessProp(this, env).name("content").set(content);
        return null;
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("content").value());
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("type").value());
    }

    public static final Object CONST_ADDED = 1;

    public static final Object CONST_REMOVED = 2;

    public static final Object CONST_UNCHANGED = 3;

    public static final Object CONST_class = "SebastianBergmann\\Diff\\Line";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Line")
                    .setLookup(Line.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("content", "type")
                    .setFilename("vendor/sebastian/diff/src/Line.php")
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
