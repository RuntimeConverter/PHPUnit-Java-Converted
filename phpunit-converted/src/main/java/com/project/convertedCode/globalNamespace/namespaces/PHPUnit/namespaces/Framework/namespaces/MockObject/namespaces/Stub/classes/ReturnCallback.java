package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Stub/ReturnCallback.php

*/

public class ReturnCallback extends RuntimeClassBase implements Stub {

    public Object callback = null;

    public ReturnCallback(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnCallback.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("callback").set(callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoke(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("callback").value(),
                                env.callMethod(invocation, "getParameters", ReturnCallback.class))
                        .value());
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object type = null;
        Object _pClass = null;
        if (function_is_array
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("callback").value())
                .getBool()) {
            if (function_is_object
                    .f
                    .env(env)
                    .call(
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("callback").value(),
                                    0))
                    .getBool()) {
                _pClass =
                        function_get_class
                                .f
                                .env(env)
                                .call(
                                        ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("callback")
                                                        .value(),
                                                0))
                                .value();
                type = "->";

            } else {
                _pClass =
                        ZVal.assign(
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("callback")
                                                .value(),
                                        0));
                type = "::";
            }

            return ZVal.assign(
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "return result of user defined callback %s%s%s() with the "
                                            + "passed arguments",
                                    _pClass,
                                    type,
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("callback")
                                                    .value(),
                                            1))
                            .value());
        }

        return ZVal.assign(
                "return result of user defined callback "
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("callback").value(), env)
                        + " with the passed arguments");
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Stub\\ReturnCallback";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Stub\\ReturnCallback")
                    .setLookup(ReturnCallback.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("callback")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Stub/ReturnCallback.php")
                    .addInterface("Stub")
                    .addInterface("SelfDescribing")
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
