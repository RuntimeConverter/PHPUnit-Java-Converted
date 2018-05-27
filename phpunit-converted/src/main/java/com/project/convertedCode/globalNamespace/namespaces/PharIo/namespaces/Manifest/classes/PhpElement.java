package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestElement;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ExtElementCollection;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/PhpElement.php

*/

public class PhpElement extends ManifestElement {

    public PhpElement(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhpElement.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getAttributeValue", PhpElement.class, "version"));
    }

    @ConvertedMethod
    public Object hasExtElements(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "hasChild", PhpElement.class, "ext"));
    }

    @ConvertedMethod
    public Object getExtElements(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ExtElementCollection(
                        env, env.callMethod(this, "getChildrenByName", PhpElement.class, "ext")));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\PhpElement";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ManifestElement.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\PhpElement")
                    .setLookup(PhpElement.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("element")
                    .setFilename("vendor/phar-io/manifest/src/xml/PhpElement.php")
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
