package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ElementCollection;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.AuthorElement;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/AuthorElementCollection.php

*/

public class AuthorElementCollection extends ElementCollection {

    public AuthorElementCollection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AuthorElementCollection.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new AuthorElement(
                        env,
                        env.callMethod(this, "getCurrentElement", AuthorElementCollection.class)));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\AuthorElementCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ElementCollection.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\AuthorElementCollection")
                    .setLookup(
                            AuthorElementCollection.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("nodeList", "position")
                    .setFilename("vendor/phar-io/manifest/src/xml/AuthorElementCollection.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addExtendsClass("PharIo\\Manifest\\ElementCollection")
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
