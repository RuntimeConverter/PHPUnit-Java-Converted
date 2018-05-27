package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.BundledComponentCollectionIterator;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/BundledComponentCollection.php

*/

public class BundledComponentCollection extends RuntimeClassBase
        implements Countable, IteratorAggregate {

    public Object bundledComponents = ZVal.newArray();

    public BundledComponentCollection(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bundledComponent",
        typeHint = "PharIo\\Manifest\\BundledComponent"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object bundledComponent = assignParameter(args, 0, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("bundledComponents").value(),
                bundledComponent);
        return null;
    }

    @ConvertedMethod
    public Object getBundledComponents(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("bundledComponents").value());
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("bundledComponents")
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new BundledComponentCollectionIterator(env, this));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\BundledComponentCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\BundledComponentCollection")
                    .setLookup(
                            BundledComponentCollection.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("bundledComponents")
                    .setFilename(
                            "vendor/phar-io/manifest/src/values/BundledComponentCollection.php")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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
