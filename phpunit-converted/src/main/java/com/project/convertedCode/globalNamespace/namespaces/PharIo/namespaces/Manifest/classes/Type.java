package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Extension;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Library;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Application;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/Type.php

*/

public abstract class Type extends RuntimeClassBase {

    public Type(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object isApplication(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isLibrary(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isExtension(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "PharIo\\Manifest\\Type";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        public Object application(RuntimeEnv env, Object... args) {
            return ZVal.assign(new Application(env));
        }

        @ConvertedMethod
        public Object library(RuntimeEnv env, Object... args) {
            return ZVal.assign(new Library(env));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "application",
            typeHint = "PharIo\\Manifest\\ApplicationName"
        )
        @ConvertedParameter(
            index = 1,
            name = "versionConstraint",
            typeHint = "PharIo\\Version\\VersionConstraint"
        )
        public Object extension(RuntimeEnv env, Object... args) {
            Object application = assignParameter(args, 0, null);
            Object versionConstraint = assignParameter(args, 1, null);
            return ZVal.assign(new Extension(env, application, versionConstraint));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\Type")
                    .setLookup(Type.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phar-io/manifest/src/values/Type.php")
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
