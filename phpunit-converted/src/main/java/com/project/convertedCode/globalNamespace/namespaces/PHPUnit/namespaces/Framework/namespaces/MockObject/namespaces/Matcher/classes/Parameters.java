package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.StatelessInvocation;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsAnything;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Matcher/Parameters.php

*/

public class Parameters extends StatelessInvocation {

    public Object parameters = ZVal.newArray();

    public Object invocation = null;

    public Object parameterVerificationResult = null;

    public Parameters(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Parameters.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, null);
        Object parameter = null;
        for (ZPair zpairResult246 : ZVal.getIterable(parameters, env, true)) {
            parameter = ZVal.assign(zpairResult246.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            parameter,
                            Constraint.class,
                            "PHPUnit\\Framework\\Constraint\\Constraint"))) {
                parameter = new IsEqual(env, parameter);
            }

            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("parameters").value(), parameter);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object parameter = null;
        Object index = null;
        Object text = null;
        text = "with parameter";
        for (ZPair zpairResult247 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("parameters").value(),
                        env,
                        false)) {
            index = ZVal.assign(zpairResult247.getKey());
            parameter = ZVal.assign(zpairResult247.getValue());
            if (ZVal.isGreaterThan(index, '>', 0)) {
                text = toStringR(text, env) + " and";
            }

            text =
                    toStringR(text, env)
                            + " "
                            + toStringR(index, env)
                            + " "
                            + toStringR(
                                    env.callMethod(parameter, "toString", Parameters.class), env);
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        Object e = null;
        toObjectR(this).accessProp(this, env).name("invocation").set(invocation);
        toObjectR(this)
                .accessProp(this, env)
                .name("parameterVerificationResult")
                .set(ZVal.getNull());
        try {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("parameterVerificationResult")
                    .set(env.callMethod(this, "verify", Parameters.class));
            return ZVal.assign(
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("parameterVerificationResult")
                            .value());
        } catch (ConvertedException convertedException25) {
            if (convertedException25.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException25.getObject();
                toObjectR(this).accessProp(this, env).name("parameterVerificationResult").set(e);
                throw ZVal.getException(
                        env,
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("parameterVerificationResult")
                                .value());
            } else {
                throw convertedException25;
            }
        }
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object parameter = null;
        Object i = null;
        Object message = null;
        if (ZVal.isset(
                toObjectR(this)
                        .accessProp(this, env)
                        .name("parameterVerificationResult")
                        .value())) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "guardAgainstDuplicateEvaluationOfParameterConstraints",
                            Parameters.class));
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("invocation").value(),
                "===",
                ZVal.getNull())) {
            throw ZVal.getException(
                    env, new ExpectationFailedException(env, "Mocked method does not exist."));
        }

        if (ZVal.isLessThan(
                CRArrayF.count
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("invocation")
                                                .value(),
                                        "getParameters",
                                        Parameters.class))
                        .value(),
                '<',
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("parameters").value())
                        .value())) {
            message = "Parameter count for invocation %s is too low.";
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    CRArrayF.count
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("parameters")
                                                            .value())
                                            .value(),
                                    "===",
                                    1))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    function_get_class
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("parameters")
                                                                    .value(),
                                                            0))
                                            .value(),
                                    "===",
                                    IsAnything.CONST_class))) {
                message =
                        toStringR(message, env)
                                + "\nTo allow 0 or more parameters with any value, omit ->with() or use ->withAnyParameters() instead.";
            }

            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            message,
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("invocation")
                                                            .value(),
                                                    "toString",
                                                    Parameters.class))
                                    .value()));
        }

        for (ZPair zpairResult248 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("parameters").value(),
                        env,
                        false)) {
            i = ZVal.assign(zpairResult248.getKey());
            parameter = ZVal.assign(zpairResult248.getValue());
            env.callMethod(
                    parameter,
                    "evaluate",
                    Parameters.class,
                    ZVal.getElement(
                            env.callMethod(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("invocation")
                                            .value(),
                                    "getParameters",
                                    Parameters.class),
                            i),
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "Parameter %s for invocation %s does not match expected "
                                            + "value.",
                                    i,
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("invocation")
                                                    .value(),
                                            "toString",
                                            Parameters.class))
                            .value());
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    private Object guardAgainstDuplicateEvaluationOfParameterConstraints(
            RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("parameterVerificationResult")
                                .value(),
                        PHPException.class,
                        "Exception"))) {
            throw ZVal.getException(
                    env,
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("parameterVerificationResult")
                            .value());
        }

        return ZVal.assign(
                ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("parameterVerificationResult")
                                .value()));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Matcher\\Parameters";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StatelessInvocation.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\Parameters")
                    .setLookup(Parameters.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("invocation", "parameterVerificationResult", "parameters")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Matcher/Parameters.php")
                    .addInterface("Invocation")
                    .addInterface("SelfDescribing")
                    .addInterface("Verifiable")
                    .addExtendsClass("PHPUnit\\Framework\\MockObject\\Matcher\\StatelessInvocation")
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
