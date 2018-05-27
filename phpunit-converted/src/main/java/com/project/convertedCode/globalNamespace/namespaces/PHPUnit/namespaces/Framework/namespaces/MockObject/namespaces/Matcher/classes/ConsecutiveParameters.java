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
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Matcher/ConsecutiveParameters.php

*/

public class ConsecutiveParameters extends StatelessInvocation {

    public Object parameterGroups = ZVal.newArray();

    public Object invocations = ZVal.newArray();

    public ConsecutiveParameters(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsecutiveParameters.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameterGroups", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parameterGroups = assignParameter(args, 0, null);
        Object parameter = null;
        Object index = null;
        Object parameters = null;
        for (ZPair zpairResult242 : ZVal.getIterable(parameterGroups, env, false)) {
            index = ZVal.assign(zpairResult242.getKey());
            parameters = ZVal.assign(zpairResult242.getValue());
            for (ZPair zpairResult243 : ZVal.getIterable(parameters, env, true)) {
                parameter = ZVal.assign(zpairResult243.getValue());
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(
                                parameter,
                                Constraint.class,
                                "PHPUnit\\Framework\\Constraint\\Constraint"))) {
                    parameter = new IsEqual(env, parameter);
                }

                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("parameterGroups").value(),
                        parameter,
                        index,
                        ZVal.addToArray);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "with consecutive parameters";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        Object callIndex = null;
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("invocations").value(), invocation);
        callIndex =
                ZVal.subtract(
                        CRArrayF.count
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("invocations")
                                                .value())
                                .value(),
                        1);
        env.callMethod(
                this, "verifyInvocation", ConsecutiveParameters.class, invocation, callIndex);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object invocation = null;
        Object callIndex = null;
        for (ZPair zpairResult244 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("invocations").value(),
                        env,
                        false)) {
            callIndex = ZVal.assign(zpairResult244.getKey());
            invocation = ZVal.assign(zpairResult244.getValue());
            env.callMethod(
                    this, "verifyInvocation", ConsecutiveParameters.class, invocation, callIndex);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    @ConvertedParameter(index = 1, name = "callIndex")
    private Object verifyInvocation(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        Object callIndex = assignParameter(args, 1, null);
        Object parameter = null;
        Object i = null;
        Object parameters = null;
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("parameterGroups").value(),
                        callIndex))) {
            parameters =
                    ZVal.assign(
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("parameterGroups")
                                            .value(),
                                    callIndex));

        } else {
            return null;
        }

        if (ZVal.strictEqualityCheck(invocation, "===", ZVal.getNull())) {
            throw ZVal.getException(
                    env, new ExpectationFailedException(env, "Mocked method does not exist."));
        }

        if (ZVal.isLessThan(
                CRArrayF.count
                        .env(env)
                        .call(
                                env.callMethod(
                                        invocation, "getParameters", ConsecutiveParameters.class))
                        .value(),
                '<',
                CRArrayF.count.env(env).call(parameters).value())) {
            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Parameter count for invocation %s is too low.",
                                            env.callMethod(
                                                    invocation,
                                                    "toString",
                                                    ConsecutiveParameters.class))
                                    .value()));
        }

        for (ZPair zpairResult245 : ZVal.getIterable(parameters, env, false)) {
            i = ZVal.assign(zpairResult245.getKey());
            parameter = ZVal.assign(zpairResult245.getValue());
            env.callMethod(
                    parameter,
                    "evaluate",
                    ConsecutiveParameters.class,
                    ZVal.getElement(
                            env.callMethod(
                                    invocation, "getParameters", ConsecutiveParameters.class),
                            i),
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "Parameter %s for invocation #%d %s does not match expected "
                                            + "value.",
                                    i,
                                    callIndex,
                                    env.callMethod(
                                            invocation, "toString", ConsecutiveParameters.class))
                            .value());
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\ConsecutiveParameters";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StatelessInvocation.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\ConsecutiveParameters")
                    .setLookup(ConsecutiveParameters.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("invocations", "parameterGroups")
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Matcher/ConsecutiveParameters.php")
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
