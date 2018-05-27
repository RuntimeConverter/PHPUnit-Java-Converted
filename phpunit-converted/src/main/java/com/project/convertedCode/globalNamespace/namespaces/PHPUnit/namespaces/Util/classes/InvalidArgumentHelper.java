package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/InvalidArgumentHelper.php

*/

public final class InvalidArgumentHelper extends RuntimeClassBase {

    public InvalidArgumentHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\InvalidArgumentHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument", typeHint = "int")
        @ConvertedParameter(index = 1, name = "type", typeHint = "string")
        @ConvertedParameter(
            index = 2,
            name = "value",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object factory(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, null);
            Object type = assignParameter(args, 1, null);
            Object value = assignParameter(args, 2, null);
            if (ZVal.isNull(value)) {
                value = ZVal.getNull();
            }
            Object stack = ZVal.newArray();
            stack = NamespaceGlobal.debug_backtrace.env(env).call().value();
            return ZVal.assign(
                    new Exception(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Argument #%d%sof %s::%s() must be a %s",
                                            argument,
                                            ZVal.strictNotEqualityCheck(
                                                            value, "!==", ZVal.getNull())
                                                    ? " ("
                                                            + toStringR(
                                                                    NamespaceGlobal.gettype
                                                                            .env(env)
                                                                            .call(value)
                                                                            .value(),
                                                                    env)
                                                            + "#"
                                                            + toStringR(value, env)
                                                            + ")"
                                                    : " (No Value) ",
                                            ZVal.getElementRecursive(stack, 1, "class"),
                                            ZVal.getElementRecursive(stack, 1, "function"),
                                            type)
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\InvalidArgumentHelper")
                    .setLookup(InvalidArgumentHelper.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/InvalidArgumentHelper.php")
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
