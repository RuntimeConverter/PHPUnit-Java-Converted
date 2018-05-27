package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.MatcherCollection;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes.NamespaceMatch;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.DeferredError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Invokable;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/InvocationMocker.php

*/

public class InvocationMocker extends RuntimeClassBase
        implements MatcherCollection, Invokable, NamespaceMatch {

    public Object matchers = ZVal.newArray();

    public Object builderMap = ZVal.newArray();

    public Object configurableMethods = ZVal.newArray();

    public Object returnValueGeneration = null;

    public InvocationMocker(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvocationMocker.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "configurableMethods", typeHint = "array")
    @ConvertedParameter(index = 1, name = "returnValueGeneration", typeHint = "bool")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object configurableMethods = assignParameter(args, 0, null);
        Object returnValueGeneration = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("configurableMethods").set(configurableMethods);
        toObjectR(this)
                .accessProp(this, env)
                .name("returnValueGeneration")
                .set(returnValueGeneration);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "matcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation"
    )
    public Object addMatcher(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, null);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("matchers").value(), matcher);
        return null;
    }

    @ConvertedMethod
    public Object hasMatchers(RuntimeEnv env, Object... args) {
        Object matcher = null;
        for (ZPair zpairResult238 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("matchers").value(),
                        env,
                        true)) {
            matcher = ZVal.assign(zpairResult238.getValue());
            if (ZVal.isTrue(env.callMethod(matcher, "hasMatchers", InvocationMocker.class))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object lookupId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, null);
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("builderMap").value(), id))) {
            return ZVal.assign(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("builderMap").value(), id));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "builder",
        typeHint = "PHPUnit\\Framework\\MockObject\\Builder\\Match"
    )
    public Object registerId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, null);
        Object builder = assignParameter(args, 1, null);
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("builderMap").value(), id))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Match builder with id <"
                                    + toStringR(id, env)
                                    + "> is already registered."));
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("builderMap").value(), id, builder);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "matcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation"
    )
    public Object expects(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, null);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PHPUnit
                        .namespaces
                        .Framework
                        .namespaces
                        .MockObject
                        .namespaces
                        .Builder
                        .classes
                        .InvocationMocker(
                        env,
                        this,
                        matcher,
                        toObjectR(this).accessProp(this, env).name("configurableMethods").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoke(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        Object exception = null;
        Object returnValue = null;
        Object e = null;
        Object match = null;
        Object value = null;
        Object hasReturnValue = null;
        exception = ZVal.getNull();
        hasReturnValue = false;
        returnValue = ZVal.getNull();
        for (ZPair zpairResult239 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("matchers").value(),
                        env,
                        true)) {
            match = ZVal.assign(zpairResult239.getValue());
            try {
                if (ZVal.isTrue(
                        env.callMethod(match, "matches", InvocationMocker.class, invocation))) {
                    value = env.callMethod(match, "invoked", InvocationMocker.class, invocation);
                    if (!ZVal.isTrue(hasReturnValue)) {
                        returnValue = ZVal.assign(value);
                        hasReturnValue = true;
                    }
                }

            } catch (ConvertedException convertedException21) {
                if (convertedException21.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException21.getObject();
                    exception = ZVal.assign(e);
                } else {
                    throw convertedException21;
                }
            }
        }

        if (ZVal.strictNotEqualityCheck(exception, "!==", ZVal.getNull())) {
            throw ZVal.getException(env, exception);
        }

        if (ZVal.isTrue(hasReturnValue)) {
            return ZVal.assign(returnValue);
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("returnValueGeneration").value(),
                "===",
                false)) {
            exception =
                    new ExpectationFailedException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Return value inference disabled and no expectation set up for %s::%s()",
                                            env.callMethod(
                                                    invocation,
                                                    "getClassName",
                                                    InvocationMocker.class),
                                            env.callMethod(
                                                    invocation,
                                                    "getMethodName",
                                                    InvocationMocker.class))
                                    .value());
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(
                                    env.callMethod(
                                            invocation, "getMethodName", InvocationMocker.class))
                            .value(),
                    "===",
                    "__tostring")) {
                env.callMethod(
                        this,
                        "addMatcher",
                        InvocationMocker.class,
                        new DeferredError(env, exception));
                return "";
            }

            throw ZVal.getException(env, exception);
        }

        return ZVal.assign(
                env.callMethod(invocation, "generateReturnValue", InvocationMocker.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        Object matcher = null;
        for (ZPair zpairResult240 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("matchers").value(),
                        env,
                        true)) {
            matcher = ZVal.assign(zpairResult240.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(matcher, "matches", InvocationMocker.class, invocation))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object matcher = null;
        for (ZPair zpairResult241 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("matchers").value(),
                        env,
                        true)) {
            matcher = ZVal.assign(zpairResult241.getValue());
            env.callMethod(matcher, "verify", InvocationMocker.class);
        }

        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\InvocationMocker";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\InvocationMocker")
                    .setLookup(InvocationMocker.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "builderMap",
                            "configurableMethods",
                            "matchers",
                            "returnValueGeneration")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/InvocationMocker.php")
                    .addInterface("MatcherCollection")
                    .addInterface("Invokable")
                    .addInterface("Verifiable")
                    .addInterface("NamespaceMatch")
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
