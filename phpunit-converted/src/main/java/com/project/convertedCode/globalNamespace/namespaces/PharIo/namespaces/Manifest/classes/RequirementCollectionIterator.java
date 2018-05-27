package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
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

 vendor/phar-io/manifest/src/values/RequirementCollectionIterator.php

*/

public class RequirementCollectionIterator extends RuntimeClassBase implements Iterator {

    public Object requirements = ZVal.newArray();

    public Object position = null;

    public RequirementCollectionIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RequirementCollectionIterator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "requirements",
        typeHint = "PharIo\\Manifest\\RequirementCollection"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object requirements = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("requirements")
                .set(
                        env.callMethod(
                                requirements,
                                "getRequirements",
                                RequirementCollectionIterator.class));
        return null;
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("position").set(0);
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(
                        toObjectR(this).accessProp(this, env).name("position").value(),
                        '<',
                        CRArrayF.count
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("requirements")
                                                .value())
                                .value()));
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("position").value());
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("requirements").value(),
                        toObjectR(this).accessProp(this, env).name("position").value()));
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("position")
                .set(
                        ZVal.increment(
                                toObjectR(this).accessProp(this, env).name("position").value()));
        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\RequirementCollectionIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\RequirementCollectionIterator")
                    .setLookup(
                            RequirementCollectionIterator.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("position", "requirements")
                    .setFilename(
                            "vendor/phar-io/manifest/src/values/RequirementCollectionIterator.php")
                    .addInterface("Iterator")
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
