package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Json;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/JsonMatches.php

*/

public class JsonMatches extends Constraint {

    public Object value = null;

    public JsonMatches(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JsonMatches.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("value").set(value);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "matches JSON string \"%s\"",
                                toObjectR(this).accessProp(this, env).name("value").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object runtimeTempArrayResult9 = null;
        Object recodedOther = null;
        Object error = null;
        Object runtimeTempArrayResult10 = null;
        Object recodedValue = null;
        ZVal.list(
                runtimeTempArrayResult9 = Json.runtimeStaticObject.canonicalize(env, other),
                (error = ZVal.assign(ZVal.getElement(runtimeTempArrayResult9, 0))),
                (recodedOther = ZVal.assign(ZVal.getElement(runtimeTempArrayResult9, 1))));
        if (ZVal.isTrue(error)) {
            return ZVal.assign(false);
        }

        ZVal.list(
                runtimeTempArrayResult10 =
                        Json.runtimeStaticObject.canonicalize(
                                env, toObjectR(this).accessProp(this, env).name("value").value()),
                (error = ZVal.assign(ZVal.getElement(runtimeTempArrayResult10, 0))),
                (recodedValue = ZVal.assign(ZVal.getElement(runtimeTempArrayResult10, 1))));
        if (ZVal.isTrue(error)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(ZVal.equalityCheck(recodedOther, recodedValue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    @ConvertedParameter(index = 1, name = "description")
    @ConvertedParameter(
        index = 2,
        name = "comparisonFailure",
        typeHint = "SebastianBergmann\\Comparator\\ComparisonFailure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object fail(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object description = assignParameter(args, 1, null);
        Object comparisonFailure = assignParameter(args, 2, null);
        if (ZVal.isNull(comparisonFailure)) {
            comparisonFailure = ZVal.getNull();
        }
        Object error = null;
        Object runtimeTempArrayResult12 = null;
        Object runtimeTempArrayResult11 = null;
        if (ZVal.strictEqualityCheck(comparisonFailure, "===", ZVal.getNull())) {
            ZVal.list(
                    runtimeTempArrayResult11 = Json.runtimeStaticObject.canonicalize(env, other),
                    (error = ZVal.assign(ZVal.getElement(runtimeTempArrayResult11, 0))));
            if (ZVal.isTrue(error)) {
                super.fail(env, other, description);
                return null;
            }

            ZVal.list(
                    runtimeTempArrayResult12 =
                            Json.runtimeStaticObject.canonicalize(
                                    env,
                                    toObjectR(this).accessProp(this, env).name("value").value()),
                    (error = ZVal.assign(ZVal.getElement(runtimeTempArrayResult12, 0))));
            if (ZVal.isTrue(error)) {
                super.fail(env, other, description);
                return null;
            }

            comparisonFailure =
                    new ComparisonFailure(
                            env,
                            NamespaceGlobal.json_decode
                                    .env(env)
                                    .call(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("value")
                                                    .value())
                                    .value(),
                            NamespaceGlobal.json_decode.env(env).call(other).value(),
                            Json.runtimeStaticObject.prettify(
                                    env,
                                    toObjectR(this).accessProp(this, env).name("value").value()),
                            Json.runtimeStaticObject.prettify(env, other),
                            false,
                            "Failed asserting that two json values are equal.");
        }

        super.fail(env, other, description, comparisonFailure);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\JsonMatches";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\JsonMatches")
                    .setLookup(JsonMatches.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "value")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/JsonMatches.php")
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
