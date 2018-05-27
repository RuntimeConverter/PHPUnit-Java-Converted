package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Type;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/Boolean.php

*/

public final class Boolean extends RuntimeClassBase implements Type {

    public Boolean(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return "bool";
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\Boolean";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\Types\\Boolean")
                    .setLookup(Boolean.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/Boolean.php")
                    .addInterface("Type")
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
