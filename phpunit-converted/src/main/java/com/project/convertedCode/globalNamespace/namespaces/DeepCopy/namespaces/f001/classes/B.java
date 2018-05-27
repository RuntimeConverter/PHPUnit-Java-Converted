package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f001.classes;

import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f001.classes.A;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/myclabs/deep-copy/fixtures/f001/B.php

*/

public class B extends A {

    public Object bProp = null;

    public B(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getBProp(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("bProp").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prop")
    public Object setBProp(RuntimeEnv env, Object... args) {
        Object prop = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("bProp").set(prop);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "DeepCopy\\f001\\B";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends A.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\f001\\B")
                    .setLookup(B.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("aProp", "bProp")
                    .setFilename("vendor/myclabs/deep-copy/fixtures/f001/B.php")
                    .addExtendsClass("DeepCopy\\f001\\A")
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
