package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ArrayComparator;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/ObjectComparator.php

*/

public class ObjectComparator extends ArrayComparator {

    public ObjectComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ObjectComparator.class) {
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
                ZVal.toBool(function_is_object.f.env(env).call(expected).value())
                        && ZVal.toBool(function_is_object.f.env(env).call(actual).value()));
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
        ReferenceContainer processed =
                assignParameterRef(runtimePassByReferenceArgs, args, 5, null);
        if (ZVal.isNull(processed)) {
            processed.setObject(ZVal.newArray());
        }
        Object e = null;
        if (ZVal.strictNotEqualityCheck(
                function_get_class.f.env(env).call(actual).value(),
                "!==",
                function_get_class.f.env(env).call(expected).value())) {
            throw ZVal.getException(
                    env,
                    new ComparisonFailure(
                            env,
                            expected,
                            actual,
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("exporter").value(),
                                    "export",
                                    ObjectComparator.class,
                                    expected),
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("exporter").value(),
                                    "export",
                                    ObjectComparator.class,
                                    actual),
                            false,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "%s is not instance of expected class \"%s\".",
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("exporter")
                                                            .value(),
                                                    "export",
                                                    ObjectComparator.class,
                                                    actual),
                                            function_get_class.f.env(env).call(expected).value())
                                    .value()));
        }

        if (ZVal.toBool(
                        CRArrayF.in_array
                                .env(env)
                                .call(
                                        ZVal.newArray(new ZPair(0, actual), new ZPair(1, expected)),
                                        processed.getObject(),
                                        true)
                                .value())
                || ZVal.toBool(
                        CRArrayF.in_array
                                .env(env)
                                .call(
                                        ZVal.newArray(new ZPair(0, expected), new ZPair(1, actual)),
                                        processed.getObject(),
                                        true)
                                .value())) {
            return null;
        }

        ZVal.addToArray(
                processed.getObject(), ZVal.newArray(new ZPair(0, actual), new ZPair(1, expected)));
        if (ZVal.strictNotEqualityCheck(actual, "!==", expected)) {
            try {
                super.assertEquals(
                        env,
                        env.callMethod(this, "toArray", ObjectComparator.class, expected),
                        env.callMethod(this, "toArray", ObjectComparator.class, actual),
                        delta,
                        canonicalize,
                        ignoreCase,
                        processed.getObject());
            } catch (ConvertedException convertedException66) {
                if (convertedException66.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    e = convertedException66.getObject();
                    throw ZVal.getException(
                            env,
                            new ComparisonFailure(
                                    env,
                                    expected,
                                    actual,
                                    NamespaceGlobal.substr_replace
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            e,
                                                            "getExpectedAsString",
                                                            ObjectComparator.class),
                                                    toStringR(
                                                                    function_get_class
                                                                            .f
                                                                            .env(env)
                                                                            .call(expected)
                                                                            .value(),
                                                                    env)
                                                            + " Object",
                                                    0,
                                                    5)
                                            .value(),
                                    NamespaceGlobal.substr_replace
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            e,
                                                            "getActualAsString",
                                                            ObjectComparator.class),
                                                    toStringR(
                                                                    function_get_class
                                                                            .f
                                                                            .env(env)
                                                                            .call(actual)
                                                                            .value(),
                                                                    env)
                                                            + " Object",
                                                    0,
                                                    5)
                                            .value(),
                                    false,
                                    "Failed asserting that two objects are equal."));
                } else {
                    throw convertedException66;
                }
            }
        }

        return null;
    }

    public Object assertEquals(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    protected Object toArray(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("exporter").value(),
                        "toArray",
                        ObjectComparator.class,
                        _object));
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\ObjectComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ArrayComparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\ObjectComparator")
                    .setLookup(ObjectComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/ObjectComparator.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ArrayComparator")
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
