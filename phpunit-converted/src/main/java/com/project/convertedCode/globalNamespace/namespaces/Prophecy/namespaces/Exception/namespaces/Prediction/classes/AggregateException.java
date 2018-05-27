package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/AggregateException.php

*/

public class AggregateException extends RuntimeException implements PredictionException {

    public Object exceptions = ZVal.newArray();

    public Object objectProphecy = null;

    public AggregateException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AggregateException.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exception",
        typeHint = "Prophecy\\Exception\\Prediction\\PredictionException"
    )
    public Object append(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, null);
        Object message = null;
        message = env.callMethod(exception, "getMessage", AggregateException.class);
        message =
                "  "
                        + toStringR(
                                NamespaceGlobal.strtr
                                        .env(env)
                                        .call(message, ZVal.newArray(new ZPair("\n", "\n  ")))
                                        .value(),
                                env)
                        + "\n";
        toObjectR(this)
                .accessProp(this, env)
                .name("message")
                .set(
                        NamespaceGlobal.rtrim
                                .env(env)
                                .call(
                                        toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("message")
                                                                .value(),
                                                        env)
                                                + toStringR(message, env))
                                .value());
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("exceptions").value(), exception);
        return null;
    }

    @ConvertedMethod
    public Object getExceptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("exceptions").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "objectProphecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    public Object setObjectProphecy(RuntimeEnv env, Object... args) {
        Object objectProphecy = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("objectProphecy").set(objectProphecy);
        return null;
    }

    @ConvertedMethod
    public Object getObjectProphecy(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("objectProphecy").value());
    }

    public static final Object CONST_class = "Prophecy\\Exception\\Prediction\\AggregateException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Prediction\\AggregateException")
                    .setLookup(AggregateException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exceptions", "objectProphecy")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/AggregateException.php")
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
