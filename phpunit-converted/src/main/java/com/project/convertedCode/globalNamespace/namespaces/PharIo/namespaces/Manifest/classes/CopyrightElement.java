package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestElement;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.AuthorElementCollection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.LicenseElement;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/CopyrightElement.php

*/

public class CopyrightElement extends ManifestElement {

    public CopyrightElement(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CopyrightElement.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getAuthorElements(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new AuthorElementCollection(
                        env,
                        env.callMethod(
                                this, "getChildrenByName", CopyrightElement.class, "author")));
    }

    @ConvertedMethod
    public Object getLicenseElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new LicenseElement(
                        env,
                        env.callMethod(this, "getChildByName", CopyrightElement.class, "license")));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\CopyrightElement";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ManifestElement.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\CopyrightElement")
                    .setLookup(CopyrightElement.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("element")
                    .setFilename("vendor/phar-io/manifest/src/xml/CopyrightElement.php")
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
