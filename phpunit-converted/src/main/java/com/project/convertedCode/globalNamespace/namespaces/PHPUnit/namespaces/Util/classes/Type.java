package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

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

 vendor/phpunit/phpunit/src/Util/Type.php

*/

public final class Type extends RuntimeClassBase {

    public Type(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Type";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        public Object isType(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, null);
            SwitchEnumType19 switchVariable19 =
                    ZVal.getEnum(
                            type,
                            SwitchEnumType19.DEFAULT_CASE,
                            SwitchEnumType19.STRING_numeric,
                            "numeric",
                            SwitchEnumType19.STRING_integer,
                            "integer",
                            SwitchEnumType19.STRING_int,
                            "int",
                            SwitchEnumType19.STRING_iterable,
                            "iterable",
                            SwitchEnumType19.STRING_float,
                            "float",
                            SwitchEnumType19.STRING_string,
                            "string",
                            SwitchEnumType19.STRING_boolean,
                            "boolean",
                            SwitchEnumType19.STRING_bool,
                            "bool",
                            SwitchEnumType19.STRING_null,
                            "null",
                            SwitchEnumType19.STRING_array,
                            "array",
                            SwitchEnumType19.STRING_object,
                            "object",
                            SwitchEnumType19.STRING_resource,
                            "resource",
                            SwitchEnumType19.STRING_scalar,
                            "scalar");
            switch (switchVariable19) {
                case STRING_numeric:
                case STRING_integer:
                case STRING_int:
                case STRING_iterable:
                case STRING_float:
                case STRING_string:
                case STRING_boolean:
                case STRING_bool:
                case STRING_null:
                case STRING_array:
                case STRING_object:
                case STRING_resource:
                case STRING_scalar:
                    return ZVal.assign(true);
                case DEFAULT_CASE:
                    return ZVal.assign(false);
            }
            ;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Type")
                    .setLookup(Type.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Type.php")
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

    private enum SwitchEnumType19 {
        STRING_numeric,
        STRING_integer,
        STRING_int,
        STRING_iterable,
        STRING_float,
        STRING_string,
        STRING_boolean,
        STRING_bool,
        STRING_null,
        STRING_array,
        STRING_object,
        STRING_resource,
        STRING_scalar,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
