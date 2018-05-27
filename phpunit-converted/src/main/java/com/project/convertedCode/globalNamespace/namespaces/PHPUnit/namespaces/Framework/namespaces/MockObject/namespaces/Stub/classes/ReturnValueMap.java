package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Stub;
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

 vendor/phpunit/phpunit-mock-objects/src/Stub/ReturnValueMap.php

*/

public class ReturnValueMap extends RuntimeClassBase implements Stub {

    public Object valueMap = null;

    public ReturnValueMap(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnValueMap.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "valueMap", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object valueMap = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("valueMap").set(valueMap);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoke(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object invocation = assignParameter(args, 0, null);
        Object parameterCount = null;
        Object map = null;
        Object _pReturn = null;
        parameterCount =
                CRArrayF.count
                        .env(env)
                        .call(env.callMethod(invocation, "getParameters", ReturnValueMap.class))
                        .value();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult249 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("valueMap").value(),
                        env,
                        true)) {
            map = ZVal.assign(zpairResult249.getValue());
            if (ZVal.toBool(!function_is_array.f.env(env).call(map).getBool())
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    parameterCount,
                                    "!==",
                                    ZVal.subtract(CRArrayF.count.env(env).call(map).value(), 1)))) {
                continue;
            }

            _pReturn = CRArrayF.array_pop.env(env).call(map).value();
            if (ZVal.strictEqualityCheck(
                    env.callMethod(invocation, "getParameters", ReturnValueMap.class),
                    "===",
                    map)) {
                return ZVal.assign(_pReturn);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "return value from a map";
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Stub\\ReturnValueMap";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Stub\\ReturnValueMap")
                    .setLookup(ReturnValueMap.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("valueMap")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Stub/ReturnValueMap.php")
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
