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

 vendor/sebastian/diff/src/Chunk.php

*/

public final class Chunk extends RuntimeClassBase {

    public Object start = null;

    public Object startRange = null;

    public Object end = null;

    public Object endRange = null;

    public Object lines = null;

    public Chunk(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Chunk.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "start",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "startRange",
        typeHint = "int",
        defaultValue = "1",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "end",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "endRange",
        typeHint = "int",
        defaultValue = "1",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 4,
        name = "lines",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, null);
        if (ZVal.isNull(start)) {
            start = 0;
        }
        Object startRange = assignParameter(args, 1, null);
        if (ZVal.isNull(startRange)) {
            startRange = 1;
        }
        Object end = assignParameter(args, 2, null);
        if (ZVal.isNull(end)) {
            end = 0;
        }
        Object endRange = assignParameter(args, 3, null);
        if (ZVal.isNull(endRange)) {
            endRange = 1;
        }
        Object lines = assignParameter(args, 4, null);
        if (ZVal.isNull(lines)) {
            lines = ZVal.newArray();
        }
        toObjectR(this).accessProp(this, env).name("start").set(start);
        toObjectR(this).accessProp(this, env).name("startRange").set(startRange);
        toObjectR(this).accessProp(this, env).name("end").set(end);
        toObjectR(this).accessProp(this, env).name("endRange").set(endRange);
        toObjectR(this).accessProp(this, env).name("lines").set(lines);
        return null;
    }

    @ConvertedMethod
    public Object getStart(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("start").value());
    }

    @ConvertedMethod
    public Object getStartRange(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("startRange").value());
    }

    @ConvertedMethod
    public Object getEnd(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("end").value());
    }

    @ConvertedMethod
    public Object getEndRange(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("endRange").value());
    }

    @ConvertedMethod
    public Object getLines(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("lines").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines", typeHint = "array")
    public Object setLines(RuntimeEnv env, Object... args) {
        Object lines = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("lines").set(lines);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Diff\\Chunk";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Chunk")
                    .setLookup(Chunk.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("end", "endRange", "lines", "start", "startRange")
                    .setFilename("vendor/sebastian/diff/src/Chunk.php")
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
