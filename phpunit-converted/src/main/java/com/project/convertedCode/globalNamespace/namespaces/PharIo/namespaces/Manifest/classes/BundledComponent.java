package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/BundledComponent.php

*/

public class BundledComponent extends RuntimeClassBase {

    public Object name = null;

    public Object version = null;

    public BundledComponent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BundledComponent.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "version", typeHint = "PharIo\\Version\\Version")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object version = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("name").set(name);
        toObjectR(this).accessProp(this, env).name("version").set(version);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("version").value());
    }

    public static final Object CONST_class = "PharIo\\Manifest\\BundledComponent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\BundledComponent")
                    .setLookup(BundledComponent.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("name", "version")
                    .setFilename("vendor/phar-io/manifest/src/values/BundledComponent.php")
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
