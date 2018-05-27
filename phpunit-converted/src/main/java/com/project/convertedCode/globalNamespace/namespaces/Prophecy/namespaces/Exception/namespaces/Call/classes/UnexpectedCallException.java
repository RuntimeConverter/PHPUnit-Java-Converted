package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Call.classes;

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

 vendor/phpspec/prophecy/src/Prophecy/Exception/Call/UnexpectedCallException.php

*/

public class UnexpectedCallException extends ObjectProphecyException {

    public Object methodName = null;

    public Object arguments = null;

    public UnexpectedCallException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnexpectedCallException.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "objectProphecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    @ConvertedParameter(index = 2, name = "methodName")
    @ConvertedParameter(index = 3, name = "arguments", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        Object objectProphecy = assignParameter(args, 1, null);
        Object methodName = assignParameter(args, 2, null);
        Object arguments = assignParameter(args, 3, null);
        super.__construct(env, message, objectProphecy);
        toObjectR(this).accessProp(this, env).name("methodName").set(methodName);
        toObjectR(this).accessProp(this, env).name("arguments").set(arguments);
        return null;
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("methodName").value());
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("arguments").value());
    }

    public static final Object CONST_class = "Prophecy\\Exception\\Call\\UnexpectedCallException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends ObjectProphecyException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Call\\UnexpectedCallException")
                    .setLookup(
                            UnexpectedCallException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("arguments", "methodName", "objectProphecy")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Call/UnexpectedCallException.php")
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
