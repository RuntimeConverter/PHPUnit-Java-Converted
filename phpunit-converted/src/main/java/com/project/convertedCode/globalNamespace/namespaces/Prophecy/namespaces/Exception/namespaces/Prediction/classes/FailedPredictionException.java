package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/FailedPredictionException.php

*/

public class FailedPredictionException extends RuntimeException implements PredictionException {

    public FailedPredictionException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FailedPredictionException.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class =
            "Prophecy\\Exception\\Prediction\\FailedPredictionException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Prediction\\FailedPredictionException")
                    .setLookup(
                            FailedPredictionException.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/FailedPredictionException.php")
                    .addInterface("PredictionException")
                    .addInterface("Exception")
                    .addInterface("Throwable")
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
