package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.PromiseInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Promise/CallbackPromise.php

*/

public class CallbackPromise extends RuntimeClassBase implements PromiseInterface {

    public Object callback = null;

    public CallbackPromise(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CallbackPromise.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, null);
        if (!NamespaceGlobal.is_callable
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences())
                .call(callback)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Callable expected as an argument to CallbackPromise, but got %s.",
                                            NamespaceGlobal.gettype.env(env).call(callback).value())
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("callback").set(callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    @ConvertedParameter(index = 1, name = "object", typeHint = "Prophecy\\Prophecy\\ObjectProphecy")
    @ConvertedParameter(index = 2, name = "method", typeHint = "Prophecy\\Prophecy\\MethodProphecy")
    public Object execute(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, null);
        Object _object = assignParameter(args, 1, null);
        Object method = assignParameter(args, 2, null);
        Object callback = null;
        callback = ZVal.assign(toObjectR(this).accessProp(this, env).name("callback").value());
        if (ZVal.toBool(ZVal.checkInstanceType(callback, Closure.class, "Closure"))
                && ZVal.toBool(function_method_exists.f.env(env).call("Closure", "bind").value())) {
            callback = Closure.runtimeStaticObject.bind(env, callback, _object);
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .call(callback, ___args, _object, method)
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Promise\\CallbackPromise";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Promise\\CallbackPromise")
                    .setLookup(CallbackPromise.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("callback")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Promise/CallbackPromise.php")
                    .addInterface("PromiseInterface")
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
