package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/NameGenerator.php

*/

public class NameGenerator extends RuntimeClassBase {

    public NameGenerator(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    public Object name(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        if (ZVal.isNull(_pClass)) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, null);
        Object parts = ZVal.newArray();
        Object _pInterface = null;
        parts = ZVal.newArray();
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pClass)) {
            ZVal.addToArray(parts, env.callMethod(_pClass, "getName", NameGenerator.class));

        } else {
            for (ZPair zpairResult69 : ZVal.getIterable(interfaces, env, true)) {
                _pInterface = ZVal.assign(zpairResult69.getValue());
                ZVal.addToArray(
                        parts, env.callMethod(_pInterface, "getShortName", NameGenerator.class));
            }
        }

        if (!CRArrayF.count.env(env).call(parts).getBool()) {
            ZVal.addToArray(parts, "stdClass");
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "Double\\%s\\P%d",
                                NamespaceGlobal.implode.env(env).call("\\", parts).value(),
                                ((long)
                                                (env.getRequestStaticProperties(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .Prophecy
                                                                                .namespaces
                                                                                .Doubler
                                                                                .classes
                                                                                .NameGenerator
                                                                                .RequestStaticProperties
                                                                                .class)
                                                                .counter =
                                                        ZVal.increment(
                                                                env.getRequestStaticProperties(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Prophecy
                                                                                        .namespaces
                                                                                        .Doubler
                                                                                        .classes
                                                                                        .NameGenerator
                                                                                        .RequestStaticProperties
                                                                                        .class)
                                                                        .counter))
                                        - 1))
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\NameGenerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object counter = 1;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\NameGenerator")
                    .setLookup(NameGenerator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Doubler/NameGenerator.php")
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
