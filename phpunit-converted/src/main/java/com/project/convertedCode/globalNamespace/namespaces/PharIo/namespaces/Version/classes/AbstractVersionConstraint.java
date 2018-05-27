package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionConstraint;
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

 vendor/phar-io/version/src/AbstractVersionConstraint.php

*/

public abstract class AbstractVersionConstraint extends RuntimeClassBase
        implements VersionConstraint {

    public Object originalValue = "";

    public AbstractVersionConstraint(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractVersionConstraint.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalValue")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object originalValue = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("originalValue").set(originalValue);
        return null;
    }

    @ConvertedMethod
    public Object asString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("originalValue").value());
    }

    public static final Object CONST_class = "PharIo\\Version\\AbstractVersionConstraint";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Version\\AbstractVersionConstraint")
                    .setLookup(
                            AbstractVersionConstraint.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("originalValue")
                    .setFilename("vendor/phar-io/version/src/AbstractVersionConstraint.php")
                    .addInterface("VersionConstraint")
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
