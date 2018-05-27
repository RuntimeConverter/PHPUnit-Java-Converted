package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes.Exporter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/Constraint.php

*/

public abstract class Constraint extends RuntimeClassBase implements Countable, SelfDescribing {

    public Object exporter = null;

    public Constraint(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Constraint.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("exporter").set(new Exporter(env));
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
        Object success = null;
        success = false;
        if (ZVal.isTrue(env.callMethod(this, "matches", Constraint.class, other))) {
            success = true;
        }

        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(success);
        }

        if (!ZVal.isTrue(success)) {
            env.callMethod(this, "fail", Constraint.class, other, description);
        }

        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return 1;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(false);
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
        Object additionalFailureDescription = null;
        Object failureDescription = null;
        failureDescription =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "Failed asserting that %s.",
                                env.callMethod(this, "failureDescription", Constraint.class, other))
                        .value();
        additionalFailureDescription =
                env.callMethod(this, "additionalFailureDescription", Constraint.class, other);
        if (ZVal.isTrue(additionalFailureDescription)) {
            failureDescription =
                    toStringR(failureDescription, env)
                            + "\n"
                            + toStringR(additionalFailureDescription, env);
        }

        if (!ZVal.isEmpty(description)) {
            failureDescription =
                    toStringR(description, env) + "\n" + toStringR(failureDescription, env);
        }

        throw ZVal.getException(
                env, new ExpectationFailedException(env, failureDescription, comparisonFailure));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object additionalFailureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        Constraint.class,
                                        other),
                                env)
                        + " "
                        + toStringR(env.callMethod(this, "toString", Constraint.class), env));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\Constraint";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\Constraint")
                    .setLookup(Constraint.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/Constraint.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
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
