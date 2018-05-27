package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/TypeHintReference.php

*/

public final class TypeHintReference extends RuntimeClassBase {

    public TypeHintReference(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object isBuiltInParamTypeHint(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        SwitchEnumType4 switchVariable4 =
                ZVal.getEnum(
                        type,
                        SwitchEnumType4.DEFAULT_CASE,
                        SwitchEnumType4.STRING_self,
                        "self",
                        SwitchEnumType4.STRING_array,
                        "array",
                        SwitchEnumType4.STRING_callable,
                        "callable",
                        SwitchEnumType4.STRING_bool,
                        "bool",
                        SwitchEnumType4.STRING_float,
                        "float",
                        SwitchEnumType4.STRING_int,
                        "int",
                        SwitchEnumType4.STRING_string,
                        "string",
                        SwitchEnumType4.STRING_iterable,
                        "iterable",
                        SwitchEnumType4.STRING_object,
                        "object");
        switch (switchVariable4) {
            case STRING_self:
            case STRING_array:
                return ZVal.assign(true);
            case STRING_callable:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70116, ">=", 50400));
            case STRING_bool:
            case STRING_float:
            case STRING_int:
            case STRING_string:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70116, ">=", 70000));
            case STRING_iterable:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70116, ">=", 70100));
            case STRING_object:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70116, ">=", 70200));
            case DEFAULT_CASE:
                return ZVal.assign(false);
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object isBuiltInReturnTypeHint(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(type, "===", "void")) {
            return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70116, ">=", 70100));
        }

        return ZVal.assign(
                env.callMethod(this, "isBuiltInParamTypeHint", TypeHintReference.class, type));
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\TypeHintReference";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\TypeHintReference")
                    .setLookup(TypeHintReference.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/TypeHintReference.php")
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

    private enum SwitchEnumType4 {
        STRING_self,
        STRING_array,
        STRING_callable,
        STRING_bool,
        STRING_float,
        STRING_int,
        STRING_string,
        STRING_iterable,
        STRING_object,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
