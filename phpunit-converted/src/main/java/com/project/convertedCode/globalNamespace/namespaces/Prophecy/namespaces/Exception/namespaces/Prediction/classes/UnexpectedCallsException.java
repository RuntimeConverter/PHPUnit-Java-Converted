package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.MethodProphecyException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/UnexpectedCallsException.php

*/

public class UnexpectedCallsException extends MethodProphecyException
        implements PredictionException {

    public Object calls = ZVal.newArray();

    public UnexpectedCallsException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnexpectedCallsException.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "methodProphecy",
        typeHint = "Prophecy\\Prophecy\\MethodProphecy"
    )
    @ConvertedParameter(index = 2, name = "calls", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        Object methodProphecy = assignParameter(args, 1, null);
        Object calls = assignParameter(args, 2, null);
        super.__construct(env, message, methodProphecy);
        toObjectR(this).accessProp(this, env).name("calls").set(calls);
        return null;
    }

    @ConvertedMethod
    public Object getCalls(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("calls").value());
    }

    public static final Object CONST_class =
            "Prophecy\\Exception\\Prediction\\UnexpectedCallsException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends MethodProphecyException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Prediction\\UnexpectedCallsException")
                    .setLookup(
                            UnexpectedCallsException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("calls", "methodProphecy", "objectProphecy")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/UnexpectedCallsException.php")
                    .addInterface("PredictionException")
                    .addInterface("Exception")
                    .addInterface("ProphecyException")
                    .addInterface("Throwable")
                    .addExtendsClass("Prophecy\\Exception\\Prophecy\\MethodProphecyException")
                    .addExtendsClass("Prophecy\\Exception\\Prophecy\\ObjectProphecyException")
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
