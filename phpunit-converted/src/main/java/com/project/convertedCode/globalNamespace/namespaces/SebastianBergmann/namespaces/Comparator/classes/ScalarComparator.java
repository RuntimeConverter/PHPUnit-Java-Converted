package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Comparator;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/ScalarComparator.php

*/

public class ScalarComparator extends Comparator {

    public ScalarComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ScalarComparator.class) {
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
                                                                ZVal.toBool(
                                                                                NamespaceGlobal
                                                                                        .is_scalar
                                                                                        .env(env)
                                                                                        .call(
                                                                                                expected)
                                                                                        .value())
                                                                        ^ ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                ZVal
                                                                                                        .getNull(),
                                                                                                "===",
                                                                                                expected)))
                                                        && ZVal.toBool(
                                                                ZVal.toBool(
                                                                                NamespaceGlobal
                                                                                        .is_scalar
                                                                                        .env(env)
                                                                                        .call(
                                                                                                actual)
                                                                                        .value())
                                                                        ^ ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                ZVal
                                                                                                        .getNull(),
                                                                                                "===",
                                                                                                actual))))
                                        || ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                function_is_string
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                expected)
                                                                                        .value())
                                                                        && ZVal.toBool(
                                                                                function_is_object
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                actual)
                                                                                        .value()))
                                                        && ZVal.toBool(
                                                                function_method_exists
                                                                        .f
                                                                        .env(env)
                                                                        .call(actual, "__toString")
                                                                        .value())))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                function_is_object
                                                                        .f
                                                                        .env(env)
                                                                        .call(expected)
                                                                        .value())
                                                        && ZVal.toBool(
                                                                function_method_exists
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                expected,
                                                                                "__toString")
                                                                        .value()))
                                        && ZVal.toBool(
                                                function_is_string
                                                        .f
                                                        .env(env)
                                                        .call(actual)
                                                        .value())));
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
        Object expectedToCompare = null;
        Object actualToCompare = null;
        expectedToCompare = ZVal.assign(expected);
        actualToCompare = ZVal.assign(actual);
        if (ZVal.toBool(function_is_string.f.env(env).call(expected).value())
                || ZVal.toBool(function_is_string.f.env(env).call(actual).value())) {
            expectedToCompare = ZVal.assign(toStringR(expectedToCompare, env));
            actualToCompare = ZVal.assign(toStringR(actualToCompare, env));
            if (ZVal.isTrue(ignoreCase)) {
                expectedToCompare =
                        NamespaceGlobal.strtolower.env(env).call(expectedToCompare).value();
                actualToCompare = NamespaceGlobal.strtolower.env(env).call(actualToCompare).value();
            }
        }

        if (ZVal.notEqualityCheck(expectedToCompare, actualToCompare)) {
            if (ZVal.toBool(function_is_string.f.env(env).call(expected).value())
                    && ZVal.toBool(function_is_string.f.env(env).call(actual).value())) {
                throw ZVal.getException(
                        env,
                        new ComparisonFailure(
                                env,
                                expected,
                                actual,
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        ScalarComparator.class,
                                        expected),
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        ScalarComparator.class,
                                        actual),
                                false,
                                "Failed asserting that two strings are equal."));
            }

            throw ZVal.getException(
                    env,
                    new ComparisonFailure(
                            env,
                            expected,
                            actual,
                            "",
                            "",
                            false,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Failed asserting that %s matches expected %s.",
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("exporter")
                                                            .value(),
                                                    "export",
                                                    ScalarComparator.class,
                                                    actual),
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("exporter")
                                                            .value(),
                                                    "export",
                                                    ScalarComparator.class,
                                                    expected))
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\ScalarComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Comparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\ScalarComparator")
                    .setLookup(ScalarComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/ScalarComparator.php")
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
