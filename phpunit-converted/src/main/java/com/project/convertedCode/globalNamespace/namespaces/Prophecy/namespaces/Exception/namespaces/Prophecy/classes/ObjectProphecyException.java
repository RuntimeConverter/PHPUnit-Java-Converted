package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.ProphecyException;
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

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prophecy/ObjectProphecyException.php

*/

public class ObjectProphecyException extends RuntimeException implements ProphecyException {

    public Object objectProphecy = null;

    public ObjectProphecyException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ObjectProphecyException.class) {
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
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        Object objectProphecy = assignParameter(args, 1, null);
        super.converterRuntimeCallExtended(env, "__construct", Object.class, null, message);
        toObjectR(this).accessProp(this, env).name("objectProphecy").set(objectProphecy);
        return null;
    }

    @ConvertedMethod
    public Object getObjectProphecy(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("objectProphecy").value());
    }

    public static final Object CONST_class =
            "Prophecy\\Exception\\Prophecy\\ObjectProphecyException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Prophecy\\ObjectProphecyException")
                    .setLookup(
                            ObjectProphecyException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("objectProphecy")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Prophecy/ObjectProphecyException.php")
                    .addInterface("ProphecyException")
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
