package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.ObjectProphecyException;
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

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prophecy/MethodProphecyException.php

*/

public class MethodProphecyException extends ObjectProphecyException {

    public Object methodProphecy = null;

    public MethodProphecyException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodProphecyException.class) {
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
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        Object methodProphecy = assignParameter(args, 1, null);
        super.__construct(
                env,
                message,
                env.callMethod(methodProphecy, "getObjectProphecy", MethodProphecyException.class));
        toObjectR(this).accessProp(this, env).name("methodProphecy").set(methodProphecy);
        return null;
    }

    @ConvertedMethod
    public Object getMethodProphecy(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("methodProphecy").value());
    }

    public static final Object CONST_class =
            "Prophecy\\Exception\\Prophecy\\MethodProphecyException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends ObjectProphecyException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Prophecy\\MethodProphecyException")
                    .setLookup(
                            MethodProphecyException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("methodProphecy", "objectProphecy")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Prophecy/MethodProphecyException.php")
                    .addInterface("ProphecyException")
                    .addInterface("Exception")
                    .addInterface("Throwable")
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
