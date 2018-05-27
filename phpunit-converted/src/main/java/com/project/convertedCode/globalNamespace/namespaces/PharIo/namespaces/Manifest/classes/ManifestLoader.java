package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestDocumentMapper;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestDocument;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestLoaderException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/ManifestLoader.php

*/

public class ManifestLoader extends RuntimeClassBase {

    public ManifestLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ManifestLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename")
        public Object fromFile(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, null);
            Object e = null;
            try {
                return ZVal.assign(
                        env.callMethod(
                                new ManifestDocumentMapper(env),
                                "map",
                                ManifestLoader.class,
                                ManifestDocument.runtimeStaticObject.fromFile(env, filename)));
            } catch (ConvertedException convertedException6) {
                if (convertedException6.instanceOf(
                        Exception.class, "PharIo\\Manifest\\Exception")) {
                    e = convertedException6.getObject();
                    throw ZVal.getException(
                            env,
                            new ManifestLoaderException(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call("Loading %s failed.", filename)
                                            .value(),
                                    env.callMethod(e, "getCode", ManifestLoader.class),
                                    e));
                } else {
                    throw convertedException6;
                }
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename")
        public Object fromPhar(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, null);
            return ZVal.assign(
                    runtimeStaticObject.fromFile(
                            env, "phar://" + toStringR(filename, env) + "/manifest.xml"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "manifest")
        public Object fromString(RuntimeEnv env, Object... args) {
            Object manifest = assignParameter(args, 0, null);
            Object e = null;
            try {
                return ZVal.assign(
                        env.callMethod(
                                new ManifestDocumentMapper(env),
                                "map",
                                ManifestLoader.class,
                                ManifestDocument.runtimeStaticObject.fromString(env, manifest)));
            } catch (ConvertedException convertedException7) {
                if (convertedException7.instanceOf(
                        Exception.class, "PharIo\\Manifest\\Exception")) {
                    e = convertedException7.getObject();
                    throw ZVal.getException(
                            env,
                            new ManifestLoaderException(
                                    env,
                                    "Processing string failed",
                                    env.callMethod(e, "getCode", ManifestLoader.class),
                                    e));
                } else {
                    throw convertedException7;
                }
            }
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ManifestLoader")
                    .setLookup(ManifestLoader.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phar-io/manifest/src/ManifestLoader.php")
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
