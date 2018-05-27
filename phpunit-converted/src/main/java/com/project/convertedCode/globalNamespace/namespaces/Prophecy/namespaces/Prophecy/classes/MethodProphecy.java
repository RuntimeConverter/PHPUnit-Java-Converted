package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.PromiseInterface;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.CallPrediction;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.MethodProphecyException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.CallbackPrediction;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.NoCallsPrediction;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.CallbackPromise;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.PredictionInterface;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.classes.ArgumentsWildcard;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.ReturnPromise;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.ReturnArgumentPromise;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.CallTimesPrediction;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.ThrowPromise;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.MethodNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.classes.Prophet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/MethodProphecy.php

*/

public class MethodProphecy extends RuntimeClassBase {

    public Object objectProphecy = null;

    public Object methodName = null;

    public Object argumentsWildcard = null;

    public Object promise = null;

    public Object prediction = null;

    public Object checkedPredictions = ZVal.newArray();

    public Object bound = false;

    public Object voidReturnType = false;

    public MethodProphecy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodProphecy.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "objectProphecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(
        index = 2,
        name = "arguments",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object objectProphecy = assignParameter(args, 0, null);
        Object methodName = assignParameter(args, 1, null);
        Object arguments = assignParameter(args, 2, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.getNull();
        }
        Object _pDouble = null;
        Object type = null;
        Object reflectedMethod = null;
        _pDouble = env.callMethod(objectProphecy, "reveal", MethodProphecy.class);
        if (!function_method_exists.f.env(env).call(_pDouble, methodName).getBool()) {
            throw ZVal.getException(
                    env,
                    new MethodNotFoundException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Method `%s::%s()` is not defined.",
                                            function_get_class.f.env(env).call(_pDouble).value(),
                                            methodName)
                                    .value(),
                            function_get_class.f.env(env).call(_pDouble).value(),
                            methodName,
                            arguments));
        }

        toObjectR(this).accessProp(this, env).name("objectProphecy").set(objectProphecy);
        toObjectR(this).accessProp(this, env).name("methodName").set(methodName);
        reflectedMethod = new ReflectionMethod(env, _pDouble, methodName);
        if (ZVal.isTrue(env.callMethod(reflectedMethod, "isFinal", MethodProphecy.class))) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Can not add prophecy for a method `%s::%s()`\n"
                                                    + "as it is a final method.",
                                            function_get_class.f.env(env).call(_pDouble).value(),
                                            methodName)
                                    .value(),
                            this));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", arguments)) {
            env.callMethod(this, "withArguments", MethodProphecy.class, arguments);
        }

        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.1.16", "7.0", ">=")
                                .value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                true,
                                "===",
                                env.callMethod(
                                        reflectedMethod, "hasReturnType", MethodProphecy.class)))) {
            type =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            reflectedMethod, "getReturnType", MethodProphecy.class),
                                    env));
            if (ZVal.strictEqualityCheck("void", "===", type)) {
                toObjectR(this).accessProp(this, env).name("voidReturnType").set(true);
                return null;
            }

            env.callMethod(
                    this,
                    "will",
                    MethodProphecy.class,
                    new Closure(env) {
                        @Override
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object prophet = null;
                            Object generator = null;
                            Object type = null;
                            type = this.contextReferences.getCapturedValue("type");
                            SwitchEnumType5 switchVariable5 =
                                    ZVal.getEnum(
                                            type,
                                            SwitchEnumType5.DEFAULT_CASE,
                                            SwitchEnumType5.STRING_string,
                                            "string",
                                            SwitchEnumType5.STRING_float,
                                            "float",
                                            SwitchEnumType5.STRING_int,
                                            "int",
                                            SwitchEnumType5.STRING_bool,
                                            "bool",
                                            SwitchEnumType5.STRING_array,
                                            "array",
                                            SwitchEnumType5.STRING_callable,
                                            "callable",
                                            SwitchEnumType5.STRING_Closure,
                                            "Closure",
                                            SwitchEnumType5.STRING_Traversable,
                                            "Traversable",
                                            SwitchEnumType5.STRING_Generator,
                                            "Generator");
                            switch (switchVariable5) {
                                case STRING_string:
                                    return "";
                                case STRING_float:
                                    return 0.0;
                                case STRING_int:
                                    return 0;
                                case STRING_bool:
                                    return ZVal.assign(false);
                                case STRING_array:
                                    return ZVal.assign(ZVal.newArray());
                                case STRING_callable:
                                case STRING_Closure:
                                    return ZVal.assign(
                                            new Closure(env) {
                                                @Override
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    return null;
                                                }
                                            });
                                case STRING_Traversable:
                                case STRING_Generator:
                                    generator =
                                            com.runtimeconverter.runtime.ZVal.functionNotFound(
                                                            "eval222")
                                                    .env(env)
                                                    .call("return function () { yield; };")
                                                    .value();
                                    return ZVal.assign(
                                            env.callFunctionDynamic(
                                                            generator,
                                                            new RuntimeArgsWithReferences())
                                                    .value());
                                case DEFAULT_CASE:
                                    prophet = new Prophet(env);
                                    return ZVal.assign(
                                            env.callMethod(
                                                    env.callMethod(
                                                            prophet,
                                                            "prophesize",
                                                            MethodProphecy.class,
                                                            type),
                                                    "reveal",
                                                    MethodProphecy.class));
                            }
                            ;
                            return null;
                        }
                    }.use("type", type));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    public Object withArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        if (function_is_array.f.env(env).call(arguments).getBool()) {
            arguments = new ArgumentsWildcard(env, arguments);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        arguments,
                        ArgumentsWildcard.class,
                        "Prophecy\\Argument\\ArgumentsWildcard"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Either an array or an instance of ArgumentsWildcard expected as\n"
                                                    + "a `MethodProphecy::withArguments()` argument, but got %s.",
                                            NamespaceGlobal.gettype
                                                    .env(env)
                                                    .call(arguments)
                                                    .value())
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("argumentsWildcard").set(arguments);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "promise")
    public Object will(RuntimeEnv env, Object... args) {
        Object promise = assignParameter(args, 0, null);
        if (NamespaceGlobal.is_callable
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences())
                .call(promise)
                .getBool()) {
            promise = new CallbackPromise(env, promise);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        promise, PromiseInterface.class, "Prophecy\\Promise\\PromiseInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Expected callable or instance of PromiseInterface, but got %s.",
                                            NamespaceGlobal.gettype.env(env).call(promise).value())
                                    .value()));
        }

        env.callMethod(this, "bindToObjectProphecy", MethodProphecy.class);
        toObjectR(this).accessProp(this, env).name("promise").set(promise);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object willReturn(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("voidReturnType").getBool()) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            "The method \""
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("methodName")
                                                    .value(),
                                            env)
                                    + "\" has a void return type, and so cannot return anything",
                            this));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "will",
                        MethodProphecy.class,
                        new ReturnPromise(
                                env, NamespaceGlobal.func_get_args.env(env).call().value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index", defaultValue = "0", defaultValueType = "number")
    public Object willReturnArgument(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, null);
        if (ZVal.isNull(index)) {
            index = 0;
        }
        if (toObjectR(this).accessProp(this, env).name("voidReturnType").getBool()) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            "The method \""
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("methodName")
                                                    .value(),
                                            env)
                                    + "\" has a void return type",
                            this));
        }

        return ZVal.assign(
                env.callMethod(
                        this, "will", MethodProphecy.class, new ReturnArgumentPromise(env, index)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object willThrow(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, null);
        return ZVal.assign(
                env.callMethod(
                        this, "will", MethodProphecy.class, new ThrowPromise(env, exception)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prediction")
    public Object should(RuntimeEnv env, Object... args) {
        Object prediction = assignParameter(args, 0, null);
        if (NamespaceGlobal.is_callable
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences())
                .call(prediction)
                .getBool()) {
            prediction = new CallbackPrediction(env, prediction);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        prediction,
                        PredictionInterface.class,
                        "Prophecy\\Prediction\\PredictionInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Expected callable or instance of PredictionInterface, but got %s.",
                                            NamespaceGlobal.gettype
                                                    .env(env)
                                                    .call(prediction)
                                                    .value())
                                    .value()));
        }

        env.callMethod(this, "bindToObjectProphecy", MethodProphecy.class);
        toObjectR(this).accessProp(this, env).name("prediction").set(prediction);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object shouldBeCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "should", MethodProphecy.class, new CallPrediction(env)));
    }

    @ConvertedMethod
    public Object shouldNotBeCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "should", MethodProphecy.class, new NoCallsPrediction(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    public Object shouldBeCalledTimes(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, null);
        return ZVal.assign(
                env.callMethod(
                        this, "should", MethodProphecy.class, new CallTimesPrediction(env, count)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prediction")
    public Object shouldHave(RuntimeEnv env, Object... args) {
        Object prediction = assignParameter(args, 0, null);
        Object calls = null;
        Object e = null;
        if (NamespaceGlobal.is_callable
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences())
                .call(prediction)
                .getBool()) {
            prediction = new CallbackPrediction(env, prediction);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        prediction,
                        PredictionInterface.class,
                        "Prophecy\\Prediction\\PredictionInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Expected callable or instance of PredictionInterface, but got %s.",
                                            NamespaceGlobal.gettype
                                                    .env(env)
                                                    .call(prediction)
                                                    .value())
                                    .value()));
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                toObjectR(this).accessProp(this, env).name("promise").value()))
                && ZVal.toBool(
                        !toObjectR(this).accessProp(this, env).name("voidReturnType").getBool())) {
            env.callMethod(this, "willReturn", MethodProphecy.class);
        }

        calls =
                env.callMethod(
                        env.callMethod(this, "getObjectProphecy", MethodProphecy.class),
                        "findProphecyMethodCalls",
                        MethodProphecy.class,
                        env.callMethod(this, "getMethodName", MethodProphecy.class),
                        env.callMethod(this, "getArgumentsWildcard", MethodProphecy.class));
        try {
            env.callMethod(
                    prediction,
                    "check",
                    MethodProphecy.class,
                    calls,
                    env.callMethod(this, "getObjectProphecy", MethodProphecy.class),
                    this);
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("checkedPredictions").value(),
                    prediction);
        } catch (ConvertedException convertedException13) {
            if (convertedException13.instanceOf(PHPException.class, "Exception")) {
                e = convertedException13.getObject();
                ZVal.addToArray(
                        toObjectR(this).accessProp(this, env).name("checkedPredictions").value(),
                        prediction);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException13;
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object shouldHaveBeenCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "shouldHave", MethodProphecy.class, new CallPrediction(env)));
    }

    @ConvertedMethod
    public Object shouldNotHaveBeenCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this, "shouldHave", MethodProphecy.class, new NoCallsPrediction(env)));
    }

    @ConvertedMethod
    public Object shouldNotBeenCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "shouldNotHaveBeenCalled", MethodProphecy.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    public Object shouldHaveBeenCalledTimes(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, null);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "shouldHave",
                        MethodProphecy.class,
                        new CallTimesPrediction(env, count)));
    }

    @ConvertedMethod
    public Object checkPrediction(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                toObjectR(this).accessProp(this, env).name("prediction").value())) {
            return null;
        }

        env.callMethod(
                this,
                "shouldHave",
                MethodProphecy.class,
                toObjectR(this).accessProp(this, env).name("prediction").value());
        return null;
    }

    @ConvertedMethod
    public Object getPromise(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("promise").value());
    }

    @ConvertedMethod
    public Object getPrediction(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("prediction").value());
    }

    @ConvertedMethod
    public Object getCheckedPredictions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("checkedPredictions").value());
    }

    @ConvertedMethod
    public Object getObjectProphecy(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("objectProphecy").value());
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("methodName").value());
    }

    @ConvertedMethod
    public Object getArgumentsWildcard(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("argumentsWildcard").value());
    }

    @ConvertedMethod
    public Object hasReturnVoid(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("voidReturnType").value());
    }

    @ConvertedMethod
    private Object bindToObjectProphecy(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("bound").getBool()) {
            return null;
        }

        env.callMethod(
                env.callMethod(this, "getObjectProphecy", MethodProphecy.class),
                "addMethodProphecy",
                MethodProphecy.class,
                this);
        toObjectR(this).accessProp(this, env).name("bound").set(true);
        return null;
    }

    public static final Object CONST_class = "Prophecy\\Prophecy\\MethodProphecy";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Prophecy\\MethodProphecy")
                    .setLookup(MethodProphecy.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "argumentsWildcard",
                            "bound",
                            "checkedPredictions",
                            "methodName",
                            "objectProphecy",
                            "prediction",
                            "promise",
                            "voidReturnType")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Prophecy/MethodProphecy.php")
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

    private enum SwitchEnumType5 {
        STRING_string,
        STRING_float,
        STRING_int,
        STRING_bool,
        STRING_array,
        STRING_callable,
        STRING_Closure,
        STRING_Traversable,
        STRING_Generator,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
