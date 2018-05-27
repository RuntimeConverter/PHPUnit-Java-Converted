package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Matcher;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnCallback;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.AnyParameters;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnReference;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.RuntimeException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnStub;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnArgument;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.MethodName;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes.MethodNameMatch;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.Parameters;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ConsecutiveCalls;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.Exception;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnValueMap;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnSelf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.ConsecutiveParameters;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Builder/InvocationMocker.php

*/

public class InvocationMocker extends RuntimeClassBase implements MethodNameMatch {

    public Object collection = null;

    public Object matcher = null;

    public Object configurableMethods = ZVal.newArray();

    public InvocationMocker(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvocationMocker.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "PHPUnit\\Framework\\MockObject\\Stub\\MatcherCollection"
    )
    @ConvertedParameter(
        index = 1,
        name = "invocationMatcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation"
    )
    @ConvertedParameter(index = 2, name = "configurableMethods", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, null);
        Object invocationMatcher = assignParameter(args, 1, null);
        Object configurableMethods = assignParameter(args, 2, null);
        toObjectR(this).accessProp(this, env).name("collection").set(collection);
        toObjectR(this)
                .accessProp(this, env)
                .name("matcher")
                .set(new Matcher(env, invocationMatcher));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("collection").value(),
                "addMatcher",
                InvocationMocker.class,
                toObjectR(this).accessProp(this, env).name("matcher").value());
        toObjectR(this).accessProp(this, env).name("configurableMethods").set(configurableMethods);
        return null;
    }

    @ConvertedMethod
    public Object getMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("matcher").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object id(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("collection").value(),
                "registerId",
                InvocationMocker.class,
                id,
                this);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stub", typeHint = "PHPUnit\\Framework\\MockObject\\Stub")
    public Object will(RuntimeEnv env, Object... args) {
        Object stub = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("matcher").value(),
                "setStub",
                InvocationMocker.class,
                stub);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "nextValues")
    public Object willReturn(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object nextValues = assignParameter(args, 1, null);
        Object stub = null;
        if (ZVal.strictEqualityCheck(CRArrayF.count.env(env).call(nextValues).value(), "===", 0)) {
            stub = new ReturnStub(env, value);

        } else {
            stub =
                    new ConsecutiveCalls(
                            env,
                            CRArrayF.array_merge
                                    .env(env)
                                    .call(ZVal.newArray(new ZPair(0, value)), nextValues)
                                    .value());
        }

        return ZVal.assign(env.callMethod(this, "will", InvocationMocker.class, stub));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reference")
    public Object willReturnReference(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer reference =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        Object stub = null;
        stub = new ReturnReference(env, reference.getObject());
        return ZVal.assign(env.callMethod(this, "will", InvocationMocker.class, stub));
    }

    public Object willReturnReference(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "valueMap", typeHint = "array")
    public Object willReturnMap(RuntimeEnv env, Object... args) {
        Object valueMap = assignParameter(args, 0, null);
        Object stub = null;
        stub = new ReturnValueMap(env, valueMap);
        return ZVal.assign(env.callMethod(this, "will", InvocationMocker.class, stub));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argumentIndex")
    public Object willReturnArgument(RuntimeEnv env, Object... args) {
        Object argumentIndex = assignParameter(args, 0, null);
        Object stub = null;
        stub = new ReturnArgument(env, argumentIndex);
        return ZVal.assign(env.callMethod(this, "will", InvocationMocker.class, stub));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object willReturnCallback(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, null);
        Object stub = null;
        stub = new ReturnCallback(env, callback);
        return ZVal.assign(env.callMethod(this, "will", InvocationMocker.class, stub));
    }

    @ConvertedMethod
    public Object willReturnSelf(RuntimeEnv env, Object... args) {
        Object stub = null;
        stub = new ReturnSelf(env);
        return ZVal.assign(env.callMethod(this, "will", InvocationMocker.class, stub));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    public Object willReturnOnConsecutiveCalls(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, null);
        Object stub = null;
        stub = new ConsecutiveCalls(env, values);
        return ZVal.assign(env.callMethod(this, "will", InvocationMocker.class, stub));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    public Object willThrowException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, null);
        Object stub = null;
        stub = new Exception(env, exception);
        return ZVal.assign(env.callMethod(this, "will", InvocationMocker.class, stub));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object after(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("matcher").value(),
                "setAfterMatchBuilderId",
                InvocationMocker.class,
                id);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    public Object with(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        env.callMethod(this, "canDefineParameters", InvocationMocker.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("matcher").value(),
                "setParametersMatcher",
                InvocationMocker.class,
                new Parameters(env, arguments));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    public Object withConsecutive(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        env.callMethod(this, "canDefineParameters", InvocationMocker.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("matcher").value(),
                "setParametersMatcher",
                InvocationMocker.class,
                new ConsecutiveParameters(env, arguments));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object withAnyParameters(RuntimeEnv env, Object... args) {
        env.callMethod(this, "canDefineParameters", InvocationMocker.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("matcher").value(),
                "setParametersMatcher",
                InvocationMocker.class,
                new AnyParameters(env));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constraint")
    public Object method(RuntimeEnv env, Object... args) {
        Object constraint = assignParameter(args, 0, null);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("matcher").value(),
                        "hasMethodNameMatcher",
                        InvocationMocker.class))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Method name matcher is already defined, cannot redefine"));
        }

        if (ZVal.toBool(function_is_string.f.env(env).call(constraint).value())
                && ZVal.toBool(
                        !CRArrayF.in_array
                                .env(env)
                                .call(
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(constraint)
                                                .value(),
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("configurableMethods")
                                                .value())
                                .getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Trying to configure method \"%s\" which cannot be configured because it does not exist, has not been specified, is final, or is static",
                                            constraint)
                                    .value()));
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("matcher").value(),
                "setMethodNameMatcher",
                InvocationMocker.class,
                new MethodName(env, constraint));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    private Object canDefineParameters(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("matcher").value(),
                        "hasMethodNameMatcher",
                        InvocationMocker.class))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Method name matcher is not defined, cannot define parameter "
                                    + "matcher without one"));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("matcher").value(),
                        "hasParametersMatcher",
                        InvocationMocker.class))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Parameter matcher is already defined, cannot redefine"));
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Builder\\InvocationMocker";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Builder\\InvocationMocker")
                    .setLookup(InvocationMocker.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("collection", "configurableMethods", "matcher")
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Builder/InvocationMocker.php")
                    .addInterface("MethodNameMatch")
                    .addInterface("ParametersMatch")
                    .addInterface("Match")
                    .addInterface("Stub")
                    .addInterface("Identity")
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
