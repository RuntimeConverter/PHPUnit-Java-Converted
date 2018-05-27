package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestElement;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/ExtensionElement.php

*/

public class ExtensionElement extends ManifestElement {

    public ExtensionElement(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExtensionElement.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getFor(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getAttributeValue", ExtensionElement.class, "for"));
    }

    @ConvertedMethod
    public Object getCompatible(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getAttributeValue", ExtensionElement.class, "compatible"));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ExtensionElement";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ManifestElement.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ExtensionElement")
                    .setLookup(ExtensionElement.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("element")
                    .setFilename("vendor/phar-io/manifest/src/xml/ExtensionElement.php")
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
