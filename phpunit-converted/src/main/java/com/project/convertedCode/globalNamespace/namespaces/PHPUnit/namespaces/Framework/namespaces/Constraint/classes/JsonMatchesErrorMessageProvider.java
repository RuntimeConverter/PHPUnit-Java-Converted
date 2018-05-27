package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/JsonMatchesErrorMessageProvider.php

*/

public class JsonMatchesErrorMessageProvider extends RuntimeClassBase {

    public JsonMatchesErrorMessageProvider(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\Constraint\\JsonMatchesErrorMessageProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "error", typeHint = "string")
        @ConvertedParameter(index = 1, name = "prefix", typeHint = "string")
        public Object determineJsonError(RuntimeEnv env, Object... args) {
            Object error = assignParameter(args, 0, null);
            Object prefix = assignParameter(args, 1, null);
            if (ZVal.isNull(prefix)) {
                prefix = "";
            }
            SwitchEnumType12 switchVariable12 =
                    ZVal.getEnum(
                            error,
                            SwitchEnumType12.DEFAULT_CASE,
                            SwitchEnumType12.DYNAMIC_TYPE_83,
                            0,
                            SwitchEnumType12.DYNAMIC_TYPE_84,
                            1,
                            SwitchEnumType12.DYNAMIC_TYPE_85,
                            2,
                            SwitchEnumType12.DYNAMIC_TYPE_86,
                            3,
                            SwitchEnumType12.DYNAMIC_TYPE_87,
                            4,
                            SwitchEnumType12.DYNAMIC_TYPE_88,
                            5);
            switch (switchVariable12) {
                case DYNAMIC_TYPE_83:
                    return ZVal.assign(ZVal.getNull());
                case DYNAMIC_TYPE_84:
                    return ZVal.assign(toStringR(prefix, env) + "Maximum stack depth exceeded");
                case DYNAMIC_TYPE_85:
                    return ZVal.assign(toStringR(prefix, env) + "Underflow or the modes mismatch");
                case DYNAMIC_TYPE_86:
                    return ZVal.assign(
                            toStringR(prefix, env) + "Unexpected control character found");
                case DYNAMIC_TYPE_87:
                    return ZVal.assign(toStringR(prefix, env) + "Syntax error, malformed JSON");
                case DYNAMIC_TYPE_88:
                    return ZVal.assign(
                            toStringR(prefix, env)
                                    + "Malformed UTF-8 characters, possibly incorrectly encoded");
                case DEFAULT_CASE:
                    return ZVal.assign(toStringR(prefix, env) + "Unknown error");
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        public Object translateTypeToPrefix(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object type = assignParameter(args, 0, null);
            Object prefix = null;
            SwitchEnumType13 switchVariable13 =
                    ZVal.getEnum(
                            NamespaceGlobal.strtolower.env(env).call(type).value(),
                            SwitchEnumType13.DEFAULT_CASE,
                            SwitchEnumType13.STRING_expected,
                            "expected",
                            SwitchEnumType13.STRING_actual,
                            "actual");
            switch (switchVariable13) {
                case STRING_expected:
                    prefix = "Expected value JSON decode error - ";
                    break;
                case STRING_actual:
                    prefix = "Actual value JSON decode error - ";
                    break;
                case DEFAULT_CASE:
                    prefix = "";
                    break;
            }
            ;
            return ZVal.assign(prefix);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\JsonMatchesErrorMessageProvider")
                    .setLookup(
                            JsonMatchesErrorMessageProvider.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/JsonMatchesErrorMessageProvider.php")
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

    private enum SwitchEnumType12 {
        DYNAMIC_TYPE_83,
        DYNAMIC_TYPE_84,
        DYNAMIC_TYPE_85,
        DYNAMIC_TYPE_86,
        DYNAMIC_TYPE_87,
        DYNAMIC_TYPE_88,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType13 {
        STRING_expected,
        STRING_actual,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
