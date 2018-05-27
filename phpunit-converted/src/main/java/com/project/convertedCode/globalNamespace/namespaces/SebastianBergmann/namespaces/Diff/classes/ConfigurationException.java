package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Exception/ConfigurationException.php

*/

public final class ConfigurationException extends InvalidArgumentException {

    public ConfigurationException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConfigurationException.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "option", typeHint = "string")
    @ConvertedParameter(index = 1, name = "expected", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    @ConvertedParameter(
        index = 3,
        name = "code",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 4,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, null);
        Object expected = assignParameter(args, 1, null);
        Object value = assignParameter(args, 2, null);
        Object code = assignParameter(args, 3, null);
        if (ZVal.isNull(code)) {
            code = 0;
        }
        Object previous = assignParameter(args, 4, null);
        if (ZVal.isNull(previous)) {
            previous = ZVal.getNull();
        }
        super.__construct(
                env,
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "Option \"%s\" must be %s, got \"%s\".",
                                option,
                                expected,
                                function_is_object.f.env(env).call(value).getBool()
                                        ? function_get_class.f.env(env).call(value).value()
                                        : ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)
                                                ? "<null>"
                                                : toStringR(
                                                                NamespaceGlobal.gettype
                                                                        .env(env)
                                                                        .call(value)
                                                                        .value(),
                                                                env)
                                                        + "#"
                                                        + toStringR(value, env))
                        .value(),
                code,
                previous);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Diff\\ConfigurationException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends InvalidArgumentException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\ConfigurationException")
                    .setLookup(
                            ConfigurationException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/diff/src/Exception/ConfigurationException.php")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("SebastianBergmann\\Diff\\InvalidArgumentException")
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
