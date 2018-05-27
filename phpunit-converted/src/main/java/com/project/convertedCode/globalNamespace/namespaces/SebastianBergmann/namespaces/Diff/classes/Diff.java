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

 vendor/sebastian/diff/src/Diff.php

*/

public final class Diff extends RuntimeClassBase {

    public Object from = null;

    public Object to = null;

    public Object chunks = null;

    public Diff(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Diff.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "string")
    @ConvertedParameter(index = 1, name = "to", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "chunks",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, null);
        Object to = assignParameter(args, 1, null);
        Object chunks = assignParameter(args, 2, null);
        if (ZVal.isNull(chunks)) {
            chunks = ZVal.newArray();
        }
        toObjectR(this).accessProp(this, env).name("from").set(from);
        toObjectR(this).accessProp(this, env).name("to").set(to);
        toObjectR(this).accessProp(this, env).name("chunks").set(chunks);
        return null;
    }

    @ConvertedMethod
    public Object getFrom(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("from").value());
    }

    @ConvertedMethod
    public Object getTo(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("to").value());
    }

    @ConvertedMethod
    public Object getChunks(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("chunks").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "chunks", typeHint = "array")
    public Object setChunks(RuntimeEnv env, Object... args) {
        Object chunks = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("chunks").set(chunks);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Diff\\Diff";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Diff")
                    .setLookup(Diff.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("chunks", "from", "to")
                    .setFilename("vendor/sebastian/diff/src/Diff.php")
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
