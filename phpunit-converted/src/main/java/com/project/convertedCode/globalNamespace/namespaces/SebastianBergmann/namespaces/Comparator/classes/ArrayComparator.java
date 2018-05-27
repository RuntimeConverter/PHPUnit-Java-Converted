package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Comparator;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/ArrayComparator.php

*/

public class ArrayComparator extends Comparator {

    public ArrayComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayComparator.class) {
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
                ZVal.toBool(function_is_array.f.env(env).call(expected).value())
                        && ZVal.toBool(function_is_array.f.env(env).call(actual).value()));
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
    @ConvertedParameter(
        index = 5,
        name = "processed",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object assertEquals(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterContinueCount;
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        if (ZVal.isNull(actual)) {
            actual = ZVal.newArray();
        }
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
        ReferenceContainer processed =
                assignParameterRef(runtimePassByReferenceArgs, args, 5, null);
        if (ZVal.isNull(processed)) {
            processed.setObject(ZVal.newArray());
        }
        Object e = null;
        Object expectedAsString = null;
        Object remaining = ZVal.newArray();
        Object actualAsString = null;
        Object equal = null;
        Object comparator = null;
        Object value = null;
        Object key = null;
        if (ZVal.isTrue(canonicalize)) {
            CRArrayF.sort.env(env).call(expected);
            CRArrayF.sort.env(env).call(actual);
        }

        remaining = ZVal.assign(actual);
        actualAsString = "Array (\n";
        expectedAsString = "Array (\n";
        equal = true;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult435 : ZVal.getIterable(expected, env, false)) {
            key = ZVal.assign(zpairResult435.getKey());
            value = ZVal.assign(zpairResult435.getValue());
            ZVal.unsetArrayElement(remaining, key);
            if (!CRArrayF.array_key_exists.env(env).call(key, actual).getBool()) {
                expectedAsString =
                        toStringR(expectedAsString, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "    %s => %s\n",
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "export",
                                                                ArrayComparator.class,
                                                                key),
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "shortenedExport",
                                                                ArrayComparator.class,
                                                                value))
                                                .value(),
                                        env);
                equal = false;
                continue;
            }

            try {
                comparator =
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("factory").value(),
                                "getComparatorFor",
                                ArrayComparator.class,
                                value,
                                ZVal.getElement(actual, key));
                env.callMethod(
                        comparator,
                        new RuntimeArgsWithReferences().add(5, processed),
                        "assertEquals",
                        ArrayComparator.class,
                        value,
                        ZVal.getElement(actual, key),
                        delta,
                        canonicalize,
                        ignoreCase,
                        processed.getObject());
                expectedAsString =
                        toStringR(expectedAsString, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "    %s => %s\n",
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "export",
                                                                ArrayComparator.class,
                                                                key),
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "shortenedExport",
                                                                ArrayComparator.class,
                                                                value))
                                                .value(),
                                        env);
                actualAsString =
                        toStringR(actualAsString, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "    %s => %s\n",
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "export",
                                                                ArrayComparator.class,
                                                                key),
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "shortenedExport",
                                                                ArrayComparator.class,
                                                                ZVal.getElement(actual, key)))
                                                .value(),
                                        env);
            } catch (ConvertedException convertedException65) {
                if (convertedException65.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    e = convertedException65.getObject();
                    expectedAsString =
                            toStringR(expectedAsString, env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "    %s => %s\n",
                                                            env.callMethod(
                                                                    toObjectR(this)
                                                                            .accessProp(this, env)
                                                                            .name("exporter")
                                                                            .value(),
                                                                    "export",
                                                                    ArrayComparator.class,
                                                                    key),
                                                            ZVal.isTrue(
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getExpectedAsString",
                                                                                    ArrayComparator
                                                                                            .class))
                                                                    ? env.callMethod(
                                                                            this,
                                                                            "indent",
                                                                            ArrayComparator.class,
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getExpectedAsString",
                                                                                    ArrayComparator
                                                                                            .class))
                                                                    : env.callMethod(
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "exporter")
                                                                                    .value(),
                                                                            "shortenedExport",
                                                                            ArrayComparator.class,
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getExpected",
                                                                                    ArrayComparator
                                                                                            .class)))
                                                    .value(),
                                            env);
                    actualAsString =
                            toStringR(actualAsString, env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "    %s => %s\n",
                                                            env.callMethod(
                                                                    toObjectR(this)
                                                                            .accessProp(this, env)
                                                                            .name("exporter")
                                                                            .value(),
                                                                    "export",
                                                                    ArrayComparator.class,
                                                                    key),
                                                            ZVal.isTrue(
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getActualAsString",
                                                                                    ArrayComparator
                                                                                            .class))
                                                                    ? env.callMethod(
                                                                            this,
                                                                            "indent",
                                                                            ArrayComparator.class,
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getActualAsString",
                                                                                    ArrayComparator
                                                                                            .class))
                                                                    : env.callMethod(
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "exporter")
                                                                                    .value(),
                                                                            "shortenedExport",
                                                                            ArrayComparator.class,
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getActual",
                                                                                    ArrayComparator
                                                                                            .class)))
                                                    .value(),
                                            env);
                    equal = false;
                } else {
                    throw convertedException65;
                }
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult436 : ZVal.getIterable(remaining, env, false)) {
            key = ZVal.assign(zpairResult436.getKey());
            value = ZVal.assign(zpairResult436.getValue());
            actualAsString =
                    toStringR(actualAsString, env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "    %s => %s\n",
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("exporter")
                                                                    .value(),
                                                            "export",
                                                            ArrayComparator.class,
                                                            key),
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("exporter")
                                                                    .value(),
                                                            "shortenedExport",
                                                            ArrayComparator.class,
                                                            value))
                                            .value(),
                                    env);
            equal = false;
        }

        expectedAsString = toStringR(expectedAsString, env) + ")";
        actualAsString = toStringR(actualAsString, env) + ")";
        if (!ZVal.isTrue(equal)) {
            throw ZVal.getException(
                    env,
                    new ComparisonFailure(
                            env,
                            expected,
                            actual,
                            expectedAsString,
                            actualAsString,
                            false,
                            "Failed asserting that two arrays are equal."));
        }

        return null;
    }

    public Object assertEquals(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines")
    protected Object indent(RuntimeEnv env, Object... args) {
        Object lines = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.trim
                        .env(env)
                        .call(
                                NamespaceGlobal.str_replace
                                        .env(env)
                                        .addReferneceArgs(new RuntimeArgsWithReferences())
                                        .call("\n", "\n    ", lines)
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\ArrayComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Comparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\ArrayComparator")
                    .setLookup(ArrayComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/ArrayComparator.php")
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
