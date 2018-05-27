package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestElement;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ExtensionElement;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/ContainsElement.php

*/

public class ContainsElement extends ManifestElement {

    public ContainsElement(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ContainsElement.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getAttributeValue", ContainsElement.class, "name"));
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getAttributeValue", ContainsElement.class, "version"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getAttributeValue", ContainsElement.class, "type"));
    }

    @ConvertedMethod
    public Object getExtensionElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ExtensionElement(
                        env,
                        env.callMethod(
                                this, "getChildByName", ContainsElement.class, "extension")));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ContainsElement";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ManifestElement.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ContainsElement")
                    .setLookup(ContainsElement.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("element")
                    .setFilename("vendor/phar-io/manifest/src/xml/ContainsElement.php")
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
