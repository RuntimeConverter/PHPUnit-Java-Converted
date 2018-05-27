package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/IsEqual.php

*/

public class IsEqual extends Constraint {

    public Object value = null;

    public Object delta = 0.0;

    public Object maxDepth = 10;

    public Object canonicalize = false;

    public Object ignoreCase = false;

    public Object lastFailure = null;

    public IsEqual(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsEqual.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "delta",
        typeHint = "float",
        defaultValue = "0.0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "maxDepth",
        typeHint = "int",
        defaultValue = "10",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "canonicalize",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object delta = assignParameter(args, 1, null);
        if (ZVal.isNull(delta)) {
            delta = 0.0;
        }
        Object maxDepth = assignParameter(args, 2, null);
        if (ZVal.isNull(maxDepth)) {
            maxDepth = 10;
        }
        Object canonicalize = assignParameter(args, 3, null);
        if (ZVal.isNull(canonicalize)) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 4, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("value").set(value);
        toObjectR(this).accessProp(this, env).name("delta").set(delta);
        toObjectR(this).accessProp(this, env).name("maxDepth").set(maxDepth);
        toObjectR(this).accessProp(this, env).name("canonicalize").set(canonicalize);
        toObjectR(this).accessProp(this, env).name("ignoreCase").set(ignoreCase);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    @ConvertedParameter(index = 1, name = "description")
    @ConvertedParameter(
        index = 2,
        name = "returnResult",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object evaluate(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object description = assignParameter(args, 1, null);
        if (ZVal.isNull(description)) {
            description = "";
        }
        Object returnResult = assignParameter(args, 2, null);
        if (ZVal.isNull(returnResult)) {
            returnResult = false;
        }
        Object comparator = null;
        Object f = null;
        Object comparatorFactory = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("value").value(), "===", other)) {
            return ZVal.assign(true);
        }

        comparatorFactory = Factory.runtimeStaticObject.getInstance(env);
        try {
            comparator =
                    env.callMethod(
                            comparatorFactory,
                            "getComparatorFor",
                            IsEqual.class,
                            toObjectR(this).accessProp(this, env).name("value").value(),
                            other);
            env.callMethod(
                    comparator,
                    new RuntimeArgsWithReferences(),
                    "assertEquals",
                    IsEqual.class,
                    toObjectR(this).accessProp(this, env).name("value").value(),
                    other,
                    toObjectR(this).accessProp(this, env).name("delta").value(),
                    toObjectR(this).accessProp(this, env).name("canonicalize").value(),
                    toObjectR(this).accessProp(this, env).name("ignoreCase").value());
        } catch (ConvertedException convertedException29) {
            if (convertedException29.instanceOf(
                    ComparisonFailure.class, "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                f = convertedException29.getObject();
                if (ZVal.isTrue(returnResult)) {
                    return ZVal.assign(false);
                }

                throw ZVal.getException(
                        env,
                        new ExpectationFailedException(
                                env,
                                NamespaceGlobal.trim
                                        .env(env)
                                        .call(
                                                toStringR(description, env)
                                                        + "\n"
                                                        + toStringR(
                                                                env.callMethod(
                                                                        f,
                                                                        "getMessage",
                                                                        IsEqual.class),
                                                                env))
                                        .value(),
                                f));
            } else {
                throw convertedException29;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object delta = null;
        delta = "";
        if (function_is_string
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("value").value())
                .getBool()) {
            if (ZVal.strictNotEqualityCheck(
                    NamespaceGlobal.strpos
                            .env(env)
                            .call(toObjectR(this).accessProp(this, env).name("value").value(), "\n")
                            .value(),
                    "!==",
                    false)) {
                return "is equal to <text>";
            }

            return ZVal.assign(
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "is equal to \"%s\"",
                                    toObjectR(this).accessProp(this, env).name("value").value())
                            .value());
        }

        if (ZVal.notEqualityCheck(toObjectR(this).accessProp(this, env).name("delta").value(), 0)) {
            delta =
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    " with delta <%F>",
                                    toObjectR(this).accessProp(this, env).name("delta").value())
                            .value();
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "is equal to %s%s",
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        IsEqual.class,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()),
                                delta)
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\IsEqual";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\IsEqual")
                    .setLookup(IsEqual.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "canonicalize",
                            "delta",
                            "exporter",
                            "ignoreCase",
                            "lastFailure",
                            "maxDepth",
                            "value")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/IsEqual.php")
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
