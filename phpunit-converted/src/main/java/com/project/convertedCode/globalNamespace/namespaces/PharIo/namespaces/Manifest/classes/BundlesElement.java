package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestElement;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ComponentElementCollection;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/BundlesElement.php

*/

public class BundlesElement extends ManifestElement {

    public BundlesElement(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BundlesElement.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getComponentElements(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ComponentElementCollection(
                        env,
                        env.callMethod(
                                this, "getChildrenByName", BundlesElement.class, "component")));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\BundlesElement";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ManifestElement.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\BundlesElement")
                    .setLookup(BundlesElement.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("element")
                    .setFilename("vendor/phar-io/manifest/src/xml/BundlesElement.php")
                    .addExtendsClass("PharIo\\Manifest\\ManifestElement")
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
