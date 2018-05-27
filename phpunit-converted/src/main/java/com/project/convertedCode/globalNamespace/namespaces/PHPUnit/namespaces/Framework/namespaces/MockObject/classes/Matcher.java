package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.Invocation;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedCount;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.AnyParameters;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.AnyInvokedCount;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Matcher.php

*/

public class Matcher extends RuntimeClassBase implements Invocation {

    public Object invocationMatcher = null;

    public Object afterMatchBuilderId = null;

    public Object afterMatchBuilderIsInvoked = false;

    public Object methodNameMatcher = null;

    public Object parametersMatcher = null;

    public Object stub = null;

    public Matcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Matcher.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocationMatcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object invocationMatcher = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("invocationMatcher").set(invocationMatcher);
        return null;
    }

    @ConvertedMethod
    public Object hasMatchers(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("invocationMatcher")
                                                .value(),
                                        "!==",
                                        ZVal.getNull()))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("invocationMatcher")
                                                        .value(),
                                                AnyInvokedCount.class,
                                                "PHPUnit\\Framework\\MockObject\\Matcher\\AnyInvokedCount"))));
    }

    @ConvertedMethod
    public Object hasMethodNameMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("methodNameMatcher").value(),
                        "!==",
                        ZVal.getNull()));
    }

    @ConvertedMethod
    public Object getMethodNameMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("methodNameMatcher").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "matcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\MethodName"
    )
    public Object setMethodNameMatcher(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("methodNameMatcher").set(matcher);
        return null;
    }

    @ConvertedMethod
    public Object hasParametersMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("parametersMatcher").value(),
                        "!==",
                        ZVal.getNull()));
    }

    @ConvertedMethod
    public Object getParametersMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("parametersMatcher").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matcher")
    public Object setParametersMatcher(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("parametersMatcher").set(matcher);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stub")
    public Object setStub(RuntimeEnv env, Object... args) {
        Object stub = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stub").set(stub);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setAfterMatchBuilderId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("afterMatchBuilderId").set(id);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoked(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        Object e = null;
        Object builder = null;
        Object matcher = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("invocationMatcher").value(),
                "===",
                ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No invocation matcher is set"));
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("methodNameMatcher").value(),
                "===",
                ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No method matcher is set"));
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("afterMatchBuilderId").value(),
                "!==",
                ZVal.getNull())) {
            builder =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(invocation, "getObject", Matcher.class),
                                    "__phpunit_getInvocationMocker",
                                    Matcher.class),
                            "lookupId",
                            Matcher.class,
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("afterMatchBuilderId")
                                    .value());
            if (!ZVal.isTrue(builder)) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "No builder found for match builder identification <%s>",
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("afterMatchBuilderId")
                                                        .value())
                                        .value()));
            }

            matcher = env.callMethod(builder, "getMatcher", Matcher.class);
            if (ZVal.toBool(matcher)
                    && ZVal.toBool(
                            env.callMethod(
                                    toObjectR(matcher)
                                            .accessProp(this, env)
                                            .name("invocationMatcher")
                                            .value(),
                                    "hasBeenInvoked",
                                    Matcher.class))) {
                toObjectR(this).accessProp(this, env).name("afterMatchBuilderIsInvoked").set(true);
            }
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("invocationMatcher").value(),
                "invoked",
                Matcher.class,
                invocation);
        try {
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("parametersMatcher")
                                            .value(),
                                    "!==",
                                    ZVal.getNull()))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("parametersMatcher")
                                                    .value(),
                                            "matches",
                                            Matcher.class,
                                            invocation)))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parametersMatcher").value(),
                        "verify",
                        Matcher.class);
            }

        } catch (ConvertedException convertedException22) {
            if (convertedException22.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException22.getObject();
                throw ZVal.getException(
                        env,
                        new ExpectationFailedException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Expectation failed for %s when %s\n%s",
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("methodNameMatcher")
                                                                .value(),
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("invocationMatcher")
                                                                .value(),
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(e, "getMessage", Matcher.class))
                                        .value(),
                                env.callMethod(e, "getComparisonFailure", Matcher.class)));
            } else {
                throw convertedException22;
            }
        }

        if (toObjectR(this).accessProp(this, env).name("stub").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("stub").value(),
                            "invoke",
                            Matcher.class,
                            invocation));
        }

        return ZVal.assign(env.callMethod(invocation, "generateReturnValue", Matcher.class));
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
        Object builder = null;
        Object matcher = null;
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("afterMatchBuilderId").value(),
                "!==",
                ZVal.getNull())) {
            builder =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(invocation, "getObject", Matcher.class),
                                    "__phpunit_getInvocationMocker",
                                    Matcher.class),
                            "lookupId",
                            Matcher.class,
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("afterMatchBuilderId")
                                    .value());
            if (!ZVal.isTrue(builder)) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "No builder found for match builder identification <%s>",
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("afterMatchBuilderId")
                                                        .value())
                                        .value()));
            }

            matcher = env.callMethod(builder, "getMatcher", Matcher.class);
            if (!ZVal.isTrue(matcher)) {
                return ZVal.assign(false);
            }

            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(matcher)
                                    .accessProp(this, env)
                                    .name("invocationMatcher")
                                    .value(),
                            "hasBeenInvoked",
                            Matcher.class))) {
                return ZVal.assign(false);
            }
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("invocationMatcher").value(),
                "===",
                ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No invocation matcher is set"));
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("methodNameMatcher").value(),
                "===",
                ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No method matcher is set"));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("invocationMatcher").value(),
                        "matches",
                        Matcher.class,
                        invocation))) {
            return ZVal.assign(false);
        }

        try {
            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("methodNameMatcher").value(),
                            "matches",
                            Matcher.class,
                            invocation))) {
                return ZVal.assign(false);
            }

        } catch (ConvertedException convertedException23) {
            if (convertedException23.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException23.getObject();
                throw ZVal.getException(
                        env,
                        new ExpectationFailedException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Expectation failed for %s when %s\n%s",
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("methodNameMatcher")
                                                                .value(),
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("invocationMatcher")
                                                                .value(),
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(e, "getMessage", Matcher.class))
                                        .value(),
                                env.callMethod(e, "getComparisonFailure", Matcher.class)));
            } else {
                throw convertedException23;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object e = null;
        Object invocationIsNever = null;
        Object invocationIsAny = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("invocationMatcher").value(),
                "===",
                ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No invocation matcher is set"));
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("methodNameMatcher").value(),
                "===",
                ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No method matcher is set"));
        }

        try {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("invocationMatcher").value(),
                    "verify",
                    Matcher.class);
            if (ZVal.strictEqualityCheck(
                    toObjectR(this).accessProp(this, env).name("parametersMatcher").value(),
                    "===",
                    ZVal.getNull())) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("parametersMatcher")
                        .set(new AnyParameters(env));
            }

            invocationIsAny =
                    ZVal.assign(
                            ZVal.checkInstanceType(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("invocationMatcher")
                                            .value(),
                                    AnyInvokedCount.class,
                                    "PHPUnit\\Framework\\MockObject\\Matcher\\AnyInvokedCount"));
            invocationIsNever =
                    ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("invocationMatcher")
                                                    .value(),
                                            InvokedCount.class,
                                            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedCount"))
                            && ZVal.toBool(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("invocationMatcher")
                                                    .value(),
                                            "isNever",
                                            Matcher.class));
            if (ZVal.toBool(!ZVal.isTrue(invocationIsAny))
                    && ZVal.toBool(!ZVal.isTrue(invocationIsNever))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parametersMatcher").value(),
                        "verify",
                        Matcher.class);
            }

        } catch (ConvertedException convertedException24) {
            if (convertedException24.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException24.getObject();
                throw ZVal.getException(
                        env,
                        new ExpectationFailedException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Expectation failed for %s when %s.\n%s",
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("methodNameMatcher")
                                                                .value(),
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("invocationMatcher")
                                                                .value(),
                                                        "toString",
                                                        Matcher.class),
                                                TestFailure.runtimeStaticObject.exceptionToString(
                                                        env, e))
                                        .value()));
            } else {
                throw convertedException24;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object list = ZVal.newArray();
        list = ZVal.newArray();
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("invocationMatcher").value(),
                "!==",
                ZVal.getNull())) {
            ZVal.addToArray(
                    list,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("invocationMatcher").value(),
                            "toString",
                            Matcher.class));
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("methodNameMatcher").value(),
                "!==",
                ZVal.getNull())) {
            ZVal.addToArray(
                    list,
                    "where "
                            + toStringR(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("methodNameMatcher")
                                                    .value(),
                                            "toString",
                                            Matcher.class),
                                    env));
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("parametersMatcher").value(),
                "!==",
                ZVal.getNull())) {
            ZVal.addToArray(
                    list,
                    "and "
                            + toStringR(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("parametersMatcher")
                                                    .value(),
                                            "toString",
                                            Matcher.class),
                                    env));
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("afterMatchBuilderId").value(),
                "!==",
                ZVal.getNull())) {
            ZVal.addToArray(
                    list,
                    "after "
                            + toStringR(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("afterMatchBuilderId")
                                            .value(),
                                    env));
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("stub").value(),
                "!==",
                ZVal.getNull())) {
            ZVal.addToArray(
                    list,
                    "will "
                            + toStringR(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("stub")
                                                    .value(),
                                            "toString",
                                            Matcher.class),
                                    env));
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(" ", list).value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Matcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher")
                    .setLookup(Matcher.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "afterMatchBuilderId",
                            "afterMatchBuilderIsInvoked",
                            "invocationMatcher",
                            "methodNameMatcher",
                            "parametersMatcher",
                            "stub")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Matcher.php")
                    .addInterface("Invocation")
                    .addInterface("SelfDescribing")
                    .addInterface("Verifiable")
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
