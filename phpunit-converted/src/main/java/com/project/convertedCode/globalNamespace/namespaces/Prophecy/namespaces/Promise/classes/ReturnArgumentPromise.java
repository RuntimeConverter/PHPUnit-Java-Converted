package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.PromiseInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Promise/ReturnArgumentPromise.php

*/

public class ReturnArgumentPromise extends RuntimeClassBase implements PromiseInterface {

    public Object index = null;

    public ReturnArgumentPromise(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnArgumentPromise.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index", defaultValue = "0", defaultValueType = "number")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, null);
        if (ZVal.isNull(index)) {
            index = 0;
        }
        if (ZVal.toBool(!function_is_int.f.env(env).call(index).getBool())
                || ZVal.toBool(ZVal.isLessThan(index, '<', 0))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Zero-based index expected as argument to ReturnArgumentPromise, but got %s.",
                                            index)
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("index").set(index);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    @ConvertedParameter(index = 1, name = "object", typeHint = "Prophecy\\Prophecy\\ObjectProphecy")
    @ConvertedParameter(index = 2, name = "method", typeHint = "Prophecy\\Prophecy\\MethodProphecy")
    public Object execute(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, null);
        if (ZVal.isNull(___args)) {
            ___args = ZVal.newArray();
        }
        Object _object = assignParameter(args, 1, null);
        Object method = assignParameter(args, 2, null);
        return ZVal.assign(
                ZVal.isGreaterThan(
                                CRArrayF.count.env(env).call(___args).value(),
                                '>',
                                toObjectR(this).accessProp(this, env).name("index").value())
                        ? ZVal.getElement(
                                ___args,
                                toObjectR(this).accessProp(this, env).name("index").value())
                        : ZVal.getNull());
    }

    public static final Object CONST_class = "Prophecy\\Promise\\ReturnArgumentPromise";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Promise\\ReturnArgumentPromise")
                    .setLookup(ReturnArgumentPromise.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("index")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Promise/ReturnArgumentPromise.php")
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
