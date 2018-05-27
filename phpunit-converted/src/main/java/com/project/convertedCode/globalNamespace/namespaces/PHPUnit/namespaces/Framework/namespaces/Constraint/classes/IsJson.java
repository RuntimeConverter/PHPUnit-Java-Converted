package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.JsonMatchesErrorMessageProvider;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/IsJson.php

*/

public class IsJson extends Constraint {

    public IsJson(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsJson.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "is valid JSON";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(other, "===", "")) {
            return ZVal.assign(false);
        }

        NamespaceGlobal.json_decode.env(env).call(other);
        if (NamespaceGlobal.json_last_error.env(env).call().getBool()) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object error = null;
        if (ZVal.strictEqualityCheck(other, "===", "")) {
            return "an empty string is valid JSON";
        }

        NamespaceGlobal.json_decode.env(env).call(other);
        error =
                JsonMatchesErrorMessageProvider.runtimeStaticObject.determineJsonError(
                        env, NamespaceGlobal.json_last_error.env(env).call().value());
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s is valid JSON (%s)",
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "shortenedExport",
                                        IsJson.class,
                                        other),
                                error)
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\IsJson";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\IsJson")
                    .setLookup(IsJson.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/IsJson.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
