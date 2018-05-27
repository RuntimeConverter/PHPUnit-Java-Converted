package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ObjectComparator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ProphecyInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Comparator/ProphecyComparator.php

*/

public class ProphecyComparator extends ObjectComparator {

    public ProphecyComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProphecyComparator.class) {
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
                                ZVal.toBool(function_is_object.f.env(env).call(expected).value())
                                        && ZVal.toBool(
                                                function_is_object.f.env(env).call(actual).value()))
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        actual,
                                        ProphecyInterface.class,
                                        "Prophecy\\Prophecy\\ProphecyInterface")));
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
        super.assertEquals(
                env,
                expected,
                env.callMethod(actual, "reveal", ProphecyComparator.class),
                delta,
                canonicalize,
                ignoreCase,
                processed.getObject());
        return null;
    }

    public Object assertEquals(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Prophecy\\Comparator\\ProphecyComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ObjectComparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Comparator\\ProphecyComparator")
                    .setLookup(ProphecyComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Comparator/ProphecyComparator.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ObjectComparator")
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
