package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
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

 vendor/phar-io/version/src/VersionNumber.php

*/

public class VersionNumber extends RuntimeClassBase {

    public Object value = null;

    public VersionNumber(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == VersionNumber.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        if (function_is_numeric.f.env(env).call(value).getBool()) {
            toObjectR(this).accessProp(this, env).name("value").set(value);
        }

        return null;
    }

    @ConvertedMethod
    public Object isAny(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("value").value(),
                        "===",
                        ZVal.getNull()));
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("value").value());
    }

    public static final Object CONST_class = "PharIo\\Version\\VersionNumber";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Version\\VersionNumber")
                    .setLookup(VersionNumber.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("value")
                    .setFilename("vendor/phar-io/version/src/VersionNumber.php")
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
