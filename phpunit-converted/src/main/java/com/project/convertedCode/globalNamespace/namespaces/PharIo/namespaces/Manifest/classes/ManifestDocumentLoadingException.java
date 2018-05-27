package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/ManifestDocumentLoadingException.php

*/

public class ManifestDocumentLoadingException extends PHPException implements Exception {

    public Object libxmlErrors = null;

    public ManifestDocumentLoadingException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ManifestDocumentLoadingException.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "libxmlErrors", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object libxmlErrors = assignParameter(args, 0, null);
        Object first = null;
        toObjectR(this).accessProp(this, env).name("libxmlErrors").set(libxmlErrors);
        first =
                ZVal.assign(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("libxmlErrors").value(),
                                0));
        super.converterRuntimeCallExtended(
                env,
                "__construct",
                Object.class,
                null,
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s (Line: %d / Column: %d / File: %s)",
                                toObjectR(first).accessProp(this, env).name("message").value(),
                                toObjectR(first).accessProp(this, env).name("line").value(),
                                toObjectR(first).accessProp(this, env).name("column").value(),
                                toObjectR(first).accessProp(this, env).name("file").value())
                        .value(),
                toObjectR(first).accessProp(this, env).name("code").value());
        return null;
    }

    @ConvertedMethod
    public Object getLibxmlErrors(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("libxmlErrors").value());
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ManifestDocumentLoadingException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHPException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ManifestDocumentLoadingException")
                    .setLookup(
                            ManifestDocumentLoadingException.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("libxmlErrors")
                    .setFilename(
                            "vendor/phar-io/manifest/src/xml/ManifestDocumentLoadingException.php")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("Exception")
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
