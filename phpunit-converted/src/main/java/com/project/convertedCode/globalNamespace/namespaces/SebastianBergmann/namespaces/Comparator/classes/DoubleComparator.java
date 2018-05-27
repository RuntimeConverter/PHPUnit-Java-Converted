package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.NumericComparator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/DoubleComparator.php

*/

public class DoubleComparator extends NumericComparator {

    public DoubleComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DoubleComparator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object accepts(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                NamespaceGlobal.is_float
                                                                        .env(env)
                                                                        .call(expected)
                                                                        .value())
                                                        || ZVal.toBool(
                                                                NamespaceGlobal.is_float
                                                                        .env(env)
                                                                        .call(actual)
                                                                        .value()))
                                        && ZVal.toBool(
                                                function_is_numeric
                                                        .f
                                                        .env(env)
                                                        .call(expected)
                                                        .value()))
                        && ZVal.toBool(function_is_numeric.f.env(env).call(actual).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    @ConvertedParameter(
        index = 2,
        name = "delta",
        defaultValue = "0.0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "canonicalize",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "ignoreCase",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object assertEquals(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        Object delta = assignParameter(args, 2, null);
        if (ZVal.isNull(delta)) {
            delta = 0.0;
        }
        Object canonicalize = assignParameter(args, 3, null);
        if (ZVal.isNull(canonicalize)) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 4, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        if (ZVal.equalityCheck(delta, 0)) {
            delta = ZVal.assign(CONST_EPSILON);
        }

        super.assertEquals(env, expected, actual, delta, canonicalize, ignoreCase);
        return null;
    }

    public static final Object CONST_EPSILON = 1.0E-10;

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\DoubleComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NumericComparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\DoubleComparator")
                    .setLookup(DoubleComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/DoubleComparator.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\NumericComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ScalarComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\Comparator")
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
