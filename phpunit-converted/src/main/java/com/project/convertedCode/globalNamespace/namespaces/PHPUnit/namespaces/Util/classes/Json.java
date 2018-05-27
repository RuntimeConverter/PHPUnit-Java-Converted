package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Json.php

*/

public final class Json extends RuntimeClassBase {

    public Json(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Json";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "json", typeHint = "string")
        public Object prettify(RuntimeEnv env, Object... args) {
            Object json = assignParameter(args, 0, null);
            Object decodedJson = null;
            decodedJson = NamespaceGlobal.json_decode.env(env).call(json, true).value();
            if (NamespaceGlobal.json_last_error.env(env).call().getBool()) {
                throw ZVal.getException(env, new Exception(env, "Cannot prettify invalid json"));
            }

            return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(decodedJson, 128).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "json", typeHint = "string")
        public Object canonicalize(RuntimeEnv env, Object... args) {
            Object json = assignParameter(args, 0, null);
            ReferenceContainer decodedJson = new BasicReferenceContainer(null);
            Object reencodedJson = null;
            decodedJson.setObject(NamespaceGlobal.json_decode.env(env).call(json).value());
            if (NamespaceGlobal.json_last_error.env(env).call().getBool()) {
                return ZVal.assign(ZVal.newArray(new ZPair(0, true), new ZPair(1, ZVal.getNull())));
            }

            runtimeStaticObject.recursiveSort(
                    env,
                    new RuntimeArgsWithReferences().add(0, decodedJson),
                    decodedJson.getObject());
            reencodedJson =
                    NamespaceGlobal.json_encode.env(env).call(decodedJson.getObject()).value();
            return ZVal.assign(ZVal.newArray(new ZPair(0, false), new ZPair(1, reencodedJson)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "json")
        private Object recursiveSort(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer json = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
            ReferenceContainer value = new BasicReferenceContainer(null);
            Object key = null;
            if (ZVal.strictEqualityCheck(
                    function_is_array.f.env(env).call(json.getObject()).value(), "===", false)) {
                if (ZVal.toBool(function_is_object.f.env(env).call(json.getObject()).value())
                        && ZVal.toBool(
                                ZVal.isGreaterThan(
                                        CRArrayF.count
                                                .env(env)
                                                .call(ZVal.toArray(json.getObject()))
                                                .value(),
                                        '>',
                                        0))) {
                    json.setObject(ZVal.assign(ZVal.toArray(json.getObject())));

                } else {
                    return null;
                }
            }

            CRArrayF.ksort.env(env).call(json.getObject());
            for (ZPair zpairResult389 : ZVal.getIterable(json.getObject(), env, false)) {
                key = ZVal.assign(zpairResult389.getKey());
                value = zpairResult389;
                runtimeStaticObject.recursiveSort(
                        env, new RuntimeArgsWithReferences().add(0, value), value.getObject());
            }

            return null;
        }

        public Object recursiveSort(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Json")
                    .setLookup(Json.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Json.php")
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
