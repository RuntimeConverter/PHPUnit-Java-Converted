package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f008.classes;

import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f008.classes.A;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/fixtures/f008/B.php

*/

public class B extends A {

    public B(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == B.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class = "DeepCopy\\f008\\B";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends A.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\f008\\B")
                    .setLookup(B.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("foo")
                    .setFilename("vendor/myclabs/deep-copy/fixtures/f008/B.php")
                    .addExtendsClass("DeepCopy\\f008\\A")
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
