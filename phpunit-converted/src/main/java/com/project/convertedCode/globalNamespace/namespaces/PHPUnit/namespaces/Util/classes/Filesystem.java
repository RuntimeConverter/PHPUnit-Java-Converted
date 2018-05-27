package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Filesystem.php

*/

public final class Filesystem extends RuntimeClassBase {

    public Filesystem(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Filesystem";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        public Object classNameToFilename(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            return ZVal.assign(
                    toStringR(
                                    NamespaceGlobal.str_replace
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    ZVal.newArray(
                                                            new ZPair(0, "_"), new ZPair(1, "\\")),
                                                    "/",
                                                    className)
                                            .value(),
                                    env)
                            + ".php");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Filesystem")
                    .setLookup(Filesystem.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Filesystem.php")
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
