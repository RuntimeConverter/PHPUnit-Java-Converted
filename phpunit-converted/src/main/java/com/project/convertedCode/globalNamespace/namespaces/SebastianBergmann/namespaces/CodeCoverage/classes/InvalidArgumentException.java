package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Exception/InvalidArgumentException.php

*/

public final class InvalidArgumentException
        extends com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException
        implements Exception {

    public InvalidArgumentException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvalidArgumentException.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\InvalidArgumentException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .spl
                    .exceptions
                    .InvalidArgumentException
                    .RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument")
        @ConvertedParameter(index = 1, name = "type")
        @ConvertedParameter(
            index = 2,
            name = "value",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, null);
            Object type = assignParameter(args, 1, null);
            Object value = assignParameter(args, 2, null);
            if (ZVal.isNull(value)) {
                value = ZVal.getNull();
            }
            Object stack = ZVal.newArray();
            stack = NamespaceGlobal.debug_backtrace.env(env).call(0).value();
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .SebastianBergmann
                            .namespaces
                            .CodeCoverage
                            .classes
                            .InvalidArgumentException(
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
                    .setName("SebastianBergmann\\CodeCoverage\\InvalidArgumentException")
                    .setLookup(
                            InvalidArgumentException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Exception/InvalidArgumentException.php")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("InvalidArgumentException")
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
