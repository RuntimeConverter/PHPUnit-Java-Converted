package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Warning.php

*/

public class Warning extends Exception implements SelfDescribing {

    public Warning(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Warning.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getMessage", Warning.class));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Warning";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Exception.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Warning")
                    .setLookup(Warning.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("serializableTrace")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Warning.php")
                    .addInterface("SelfDescribing")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("PHPUnit\\Framework\\Exception")
                    .addExtendsClass("RuntimeException")
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
