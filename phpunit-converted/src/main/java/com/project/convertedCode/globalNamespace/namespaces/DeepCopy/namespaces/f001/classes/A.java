package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f001.classes;

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

 vendor/myclabs/deep-copy/fixtures/f001/A.php

*/

public class A extends RuntimeClassBase {

    public Object aProp = null;

    public A(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getAProp(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("aProp").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prop")
    public Object setAProp(RuntimeEnv env, Object... args) {
        Object prop = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("aProp").set(prop);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "DeepCopy\\f001\\A";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\f001\\A")
                    .setLookup(A.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("aProp")
                    .setFilename("vendor/myclabs/deep-copy/fixtures/f001/A.php")
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
