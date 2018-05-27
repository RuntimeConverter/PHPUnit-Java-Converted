package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/MockBuilder.php

*/

public class MockBuilder extends RuntimeClassBase {

    public Object testCase = null;

    public Object type = null;

    public Object methods = ZVal.newArray();

    public Object methodsExcept = ZVal.newArray();

    public Object mockClassName = "";

    public Object constructorArgs = ZVal.newArray();

    public Object originalConstructor = true;

    public Object originalClone = true;

    public Object autoload = true;

    public Object cloneArguments = false;

    public Object callOriginalMethods = false;

    public Object proxyTarget = null;

    public Object allowMockingUnknownTypes = true;

    public Object returnValueGeneration = true;

    public Object generator = null;

    public MockBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockBuilder.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testCase", typeHint = "PHPUnit\\Framework\\TestCase")
    @ConvertedParameter(index = 1, name = "type")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object testCase = assignParameter(args, 0, null);
        Object type = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("testCase").set(testCase);
        toObjectR(this).accessProp(this, env).name("type").set(type);
        toObjectR(this).accessProp(this, env).name("generator").set(new Generator(env));
        return null;
    }

    @ConvertedMethod
    public Object getMock(RuntimeEnv env, Object... args) {
        Object _object = null;
        _object =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "getMock",
                        MockBuilder.class,
                        toObjectR(this).accessProp(this, env).name("type").value(),
                        toObjectR(this).accessProp(this, env).name("methods").value(),
                        toObjectR(this).accessProp(this, env).name("constructorArgs").value(),
                        toObjectR(this).accessProp(this, env).name("mockClassName").value(),
                        toObjectR(this).accessProp(this, env).name("originalConstructor").value(),
                        toObjectR(this).accessProp(this, env).name("originalClone").value(),
                        toObjectR(this).accessProp(this, env).name("autoload").value(),
                        toObjectR(this).accessProp(this, env).name("cloneArguments").value(),
                        toObjectR(this).accessProp(this, env).name("callOriginalMethods").value(),
                        toObjectR(this).accessProp(this, env).name("proxyTarget").value(),
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("allowMockingUnknownTypes")
                                .value(),
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("returnValueGeneration")
                                .value());
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("testCase").value(),
                "registerMockObject",
                MockBuilder.class,
                _object);
        return ZVal.assign(_object);
    }

    @ConvertedMethod
    public Object getMockForAbstractClass(RuntimeEnv env, Object... args) {
        Object _object = null;
        _object =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "getMockForAbstractClass",
                        MockBuilder.class,
                        toObjectR(this).accessProp(this, env).name("type").value(),
                        toObjectR(this).accessProp(this, env).name("constructorArgs").value(),
                        toObjectR(this).accessProp(this, env).name("mockClassName").value(),
                        toObjectR(this).accessProp(this, env).name("originalConstructor").value(),
                        toObjectR(this).accessProp(this, env).name("originalClone").value(),
                        toObjectR(this).accessProp(this, env).name("autoload").value(),
                        toObjectR(this).accessProp(this, env).name("methods").value(),
                        toObjectR(this).accessProp(this, env).name("cloneArguments").value());
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("testCase").value(),
                "registerMockObject",
                MockBuilder.class,
                _object);
        return ZVal.assign(_object);
    }

    @ConvertedMethod
    public Object getMockForTrait(RuntimeEnv env, Object... args) {
        Object _object = null;
        _object =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "getMockForTrait",
                        MockBuilder.class,
                        toObjectR(this).accessProp(this, env).name("type").value(),
                        toObjectR(this).accessProp(this, env).name("constructorArgs").value(),
                        toObjectR(this).accessProp(this, env).name("mockClassName").value(),
                        toObjectR(this).accessProp(this, env).name("originalConstructor").value(),
                        toObjectR(this).accessProp(this, env).name("originalClone").value(),
                        toObjectR(this).accessProp(this, env).name("autoload").value(),
                        toObjectR(this).accessProp(this, env).name("methods").value(),
                        toObjectR(this).accessProp(this, env).name("cloneArguments").value());
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("testCase").value(),
                "registerMockObject",
                MockBuilder.class,
                _object);
        return ZVal.assign(_object);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "methods",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setMethods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, null);
        if (ZVal.isNull(methods)) {
            methods = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("methods").set(methods);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "methods",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object setMethodsExcept(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, null);
        if (ZVal.isNull(methods)) {
            methods = ZVal.newArray();
        }
        toObjectR(this).accessProp(this, env).name("methodsExcept").set(methods);
        env.callMethod(
                this,
                "setMethods",
                MockBuilder.class,
                CRArrayF.array_diff
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("generator")
                                                .value(),
                                        "getClassMethods",
                                        MockBuilder.class,
                                        toObjectR(this).accessProp(this, env).name("type").value()),
                                toObjectR(this).accessProp(this, env).name("methodsExcept").value())
                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    public Object setConstructorArgs(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("constructorArgs").set(___args);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setMockClassName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("mockClassName").set(name);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableOriginalConstructor(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("originalConstructor").set(false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableOriginalConstructor(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("originalConstructor").set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableOriginalClone(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("originalClone").set(false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableOriginalClone(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("originalClone").set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableAutoload(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("autoload").set(false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableAutoload(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("autoload").set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableArgumentCloning(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("cloneArguments").set(false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableArgumentCloning(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("cloneArguments").set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableProxyingToOriginalMethods(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("callOriginalMethods").set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableProxyingToOriginalMethods(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("callOriginalMethods").set(false);
        toObjectR(this).accessProp(this, env).name("proxyTarget").set(ZVal.getNull());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    public Object setProxyTarget(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("proxyTarget").set(_object);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object allowMockingUnknownTypes(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("allowMockingUnknownTypes").set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disallowMockingUnknownTypes(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("allowMockingUnknownTypes").set(false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableAutoReturnValueGeneration(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("returnValueGeneration").set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableAutoReturnValueGeneration(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("returnValueGeneration").set(false);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\MockBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\MockBuilder")
                    .setLookup(MockBuilder.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "allowMockingUnknownTypes",
                            "autoload",
                            "callOriginalMethods",
                            "cloneArguments",
                            "constructorArgs",
                            "generator",
                            "methods",
                            "methodsExcept",
                            "mockClassName",
                            "originalClone",
                            "originalConstructor",
                            "proxyTarget",
                            "returnValueGeneration",
                            "testCase",
                            "type")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/MockBuilder.php")
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
