package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f002.classes;

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

 vendor/myclabs/deep-copy/fixtures/f002/A.php

*/

public class A extends RuntimeClassBase {

    public Object prop1 = null;

    public Object prop2 = null;

    public A(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getProp1(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("prop1").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prop")
    public Object setProp1(RuntimeEnv env, Object... args) {
        Object prop = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("prop1").set(prop);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getProp2(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("prop2").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prop")
    public Object setProp2(RuntimeEnv env, Object... args) {
        Object prop = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("prop2").set(prop);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "DeepCopy\\f002\\A";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\f002\\A")
                    .setLookup(A.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("prop1", "prop2")
                    .setFilename("vendor/myclabs/deep-copy/fixtures/f002/A.php")
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
