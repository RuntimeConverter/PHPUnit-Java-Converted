package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.RequirementCollectionIterator;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/RequirementCollection.php

*/

public class RequirementCollection extends RuntimeClassBase
        implements Countable, IteratorAggregate {

    public Object requirements = ZVal.newArray();

    public RequirementCollection(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requirement", typeHint = "PharIo\\Manifest\\Requirement")
    public Object add(RuntimeEnv env, Object... args) {
        Object requirement = assignParameter(args, 0, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("requirements").value(), requirement);
        return null;
    }

    @ConvertedMethod
    public Object getRequirements(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("requirements").value());
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("requirements").value())
                        .value());
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new RequirementCollectionIterator(env, this));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\RequirementCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\RequirementCollection")
                    .setLookup(RequirementCollection.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("requirements")
                    .setFilename("vendor/phar-io/manifest/src/values/RequirementCollection.php")
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
