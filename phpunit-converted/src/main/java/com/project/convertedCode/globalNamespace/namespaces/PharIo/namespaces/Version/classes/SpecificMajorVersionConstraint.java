package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.AbstractVersionConstraint;
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

 vendor/phar-io/version/src/SpecificMajorVersionConstraint.php

*/

public class SpecificMajorVersionConstraint extends AbstractVersionConstraint {

    public Object major = 0;

    public SpecificMajorVersionConstraint(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SpecificMajorVersionConstraint.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalValue")
    @ConvertedParameter(index = 1, name = "major")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object originalValue = assignParameter(args, 0, null);
        Object major = assignParameter(args, 1, null);
        super.__construct(env, originalValue);
        toObjectR(this).accessProp(this, env).name("major").set(major);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version", typeHint = "PharIo\\Version\\Version")
    public Object complies(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.equalityCheck(
                        env.callMethod(
                                env.callMethod(
                                        version, "getMajor", SpecificMajorVersionConstraint.class),
                                "getValue",
                                SpecificMajorVersionConstraint.class),
                        toObjectR(this).accessProp(this, env).name("major").value()));
    }

    public static final Object CONST_class = "PharIo\\Version\\SpecificMajorVersionConstraint";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractVersionConstraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Version\\SpecificMajorVersionConstraint")
                    .setLookup(
                            SpecificMajorVersionConstraint.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("major", "originalValue")
                    .setFilename("vendor/phar-io/version/src/SpecificMajorVersionConstraint.php")
                    .addInterface("VersionConstraint")
                    .addExtendsClass("PharIo\\Version\\AbstractVersionConstraint")
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
