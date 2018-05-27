package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f005.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/fixtures/f005/Foo.php

*/

public class Foo extends RuntimeClassBase {

    public Object cloned = false;

    public Foo(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("cloned").set(true);
        return null;
    }

    public static final Object CONST_class = "DeepCopy\\f005\\Foo";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\f005\\Foo")
                    .setLookup(Foo.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("cloned")
                    .setFilename("vendor/myclabs/deep-copy/fixtures/f005/Foo.php")
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
