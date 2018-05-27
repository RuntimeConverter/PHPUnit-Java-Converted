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

 vendor/phar-io/version/src/GreaterThanOrEqualToVersionConstraint.php

*/

public class GreaterThanOrEqualToVersionConstraint extends AbstractVersionConstraint {

    public Object minimalVersion = null;

    public GreaterThanOrEqualToVersionConstraint(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GreaterThanOrEqualToVersionConstraint.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalValue")
    @ConvertedParameter(index = 1, name = "minimalVersion", typeHint = "PharIo\\Version\\Version")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object originalValue = assignParameter(args, 0, null);
        Object minimalVersion = assignParameter(args, 1, null);
        super.__construct(env, originalValue);
        toObjectR(this).accessProp(this, env).name("minimalVersion").set(minimalVersion);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version", typeHint = "PharIo\\Version\\Version")
    public Object complies(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.equalityCheck(
                                        env.callMethod(
                                                version,
                                                "getVersionString",
                                                GreaterThanOrEqualToVersionConstraint.class),
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("minimalVersion")
                                                        .value(),
                                                "getVersionString",
                                                GreaterThanOrEqualToVersionConstraint.class)))
                        || ZVal.toBool(
                                env.callMethod(
                                        version,
                                        "isGreaterThan",
                                        GreaterThanOrEqualToVersionConstraint.class,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("minimalVersion")
                                                .value())));
    }

    public static final Object CONST_class =
            "PharIo\\Version\\GreaterThanOrEqualToVersionConstraint";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractVersionConstraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Version\\GreaterThanOrEqualToVersionConstraint")
                    .setLookup(
                            GreaterThanOrEqualToVersionConstraint.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("minimalVersion", "originalValue")
                    .setFilename(
                            "vendor/phar-io/version/src/GreaterThanOrEqualToVersionConstraint.php")
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
