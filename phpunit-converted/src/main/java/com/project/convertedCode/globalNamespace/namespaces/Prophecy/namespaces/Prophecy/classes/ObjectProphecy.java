package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Comparator.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.MethodProphecyException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.Revealer;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ProphecySubjectInterface;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.AggregateException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.classes.ArgumentsWildcard;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.ObjectProphecyException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes.CallCenter;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ProphecyInterface;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.MethodProphecy;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/ObjectProphecy.php

*/

public class ObjectProphecy extends RuntimeClassBase implements ProphecyInterface {

    public Object lazyDouble = null;

    public Object callCenter = null;

    public Object revealer = null;

    public Object comparatorFactory = null;

    public Object methodProphecies = ZVal.newArray();

    public ObjectProphecy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ObjectProphecy.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lazyDouble", typeHint = "Prophecy\\Doubler\\LazyDouble")
    @ConvertedParameter(
        index = 1,
        name = "callCenter",
        typeHint = "Prophecy\\Call\\CallCenter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "revealer",
        typeHint = "Prophecy\\Prophecy\\RevealerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "comparatorFactory",
        typeHint = "Prophecy\\Comparator\\Factory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lazyDouble = assignParameter(args, 0, null);
        Object callCenter = assignParameter(args, 1, null);
        if (ZVal.isNull(callCenter)) {
            callCenter = ZVal.getNull();
        }
        Object revealer = assignParameter(args, 2, null);
        if (ZVal.isNull(revealer)) {
            revealer = ZVal.getNull();
        }
        Object comparatorFactory = assignParameter(args, 3, null);
        if (ZVal.isNull(comparatorFactory)) {
            comparatorFactory = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("lazyDouble").set(lazyDouble);
        toObjectR(this)
                .accessProp(this, env)
                .name("callCenter")
                .set(ZVal.isTrue(callCenter) ? callCenter : new CallCenter(env));
        toObjectR(this)
                .accessProp(this, env)
                .name("revealer")
                .set(ZVal.isTrue(revealer) ? revealer : new Revealer(env));
        toObjectR(this)
                .accessProp(this, env)
                .name("comparatorFactory")
                .set(
                        ZVal.isTrue(comparatorFactory)
                                ? comparatorFactory
                                : Factory.runtimeStaticObject.getInstance(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object willExtend(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("lazyDouble").value(),
                "setParentClass",
                ObjectProphecy.class,
                _pClass);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object willImplement(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("lazyDouble").value(),
                "addInterface",
                ObjectProphecy.class,
                _pInterface);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "arguments",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object willBeConstructedWith(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.getNull();
        }
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("lazyDouble").value(),
                "setArguments",
                ObjectProphecy.class,
                arguments);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object reveal(RuntimeEnv env, Object... args) {
        Object _pDouble = null;
        _pDouble =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lazyDouble").value(),
                        "getInstance",
                        ObjectProphecy.class);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", _pDouble))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        _pDouble,
                                        ProphecySubjectInterface.class,
                                        "Prophecy\\Prophecy\\ProphecySubjectInterface")))) {
            throw ZVal.getException(
                    env,
                    new ObjectProphecyException(
                            env,
                            "Generated double must implement ProphecySubjectInterface, but it does not.\n"
                                    + "It seems you have wrongly configured doubler without required ClassPatch.",
                            this));
        }

        env.callMethod(_pDouble, "setProphecy", ObjectProphecy.class, this);
        return ZVal.assign(_pDouble);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "methodProphecy",
        typeHint = "Prophecy\\Prophecy\\MethodProphecy"
    )
    public Object addMethodProphecy(RuntimeEnv env, Object... args) {
        Object methodProphecy = assignParameter(args, 0, null);
        Object argumentsWildcard = null;
        Object methodName = null;
        argumentsWildcard =
                env.callMethod(methodProphecy, "getArgumentsWildcard", ObjectProphecy.class);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", argumentsWildcard)) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Can not add prophecy for a method `%s::%s()`\n"
                                                    + "as you did not specify arguments wildcard for it.",
                                            function_get_class
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    this,
                                                                    "reveal",
                                                                    ObjectProphecy.class))
                                                    .value(),
                                            env.callMethod(
                                                    methodProphecy,
                                                    "getMethodName",
                                                    ObjectProphecy.class))
                                    .value(),
                            methodProphecy));
        }

        methodName = env.callMethod(methodProphecy, "getMethodName", ObjectProphecy.class);
        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("methodProphecies").value(),
                        methodName))) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("methodProphecies").value(),
                    methodName,
                    ZVal.newArray());
        }

        ZVal.setElementRecursive(
                toObjectR(this).accessProp(this, env).name("methodProphecies").value(),
                methodProphecy,
                methodName,
                ZVal.addToArray);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "methodName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getMethodProphecies(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        if (ZVal.isNull(methodName)) {
            methodName = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", methodName)) {
            return ZVal.assign(
                    toObjectR(this).accessProp(this, env).name("methodProphecies").value());
        }

        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("methodProphecies").value(),
                        methodName))) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("methodProphecies").value(),
                        methodName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    public Object makeProphecyMethodCall(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        Object _pReturn = null;
        arguments =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("revealer").value(),
                        "reveal",
                        ObjectProphecy.class,
                        arguments);
        _pReturn =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("callCenter").value(),
                        "makeCall",
                        ObjectProphecy.class,
                        this,
                        methodName,
                        arguments);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("revealer").value(),
                        "reveal",
                        ObjectProphecy.class,
                        _pReturn));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(
        index = 1,
        name = "wildcard",
        typeHint = "Prophecy\\Argument\\ArgumentsWildcard"
    )
    public Object findProphecyMethodCalls(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        Object wildcard = assignParameter(args, 1, null);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("callCenter").value(),
                        "findCalls",
                        ObjectProphecy.class,
                        methodName,
                        wildcard));
    }

    @ConvertedMethod
    public Object checkProphecyMethodsPredictions(RuntimeEnv env, Object... args) {
        Object exception = null;
        Object e = null;
        Object prophecy = null;
        Object prophecies = null;
        exception =
                new AggregateException(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%s:\n",
                                        function_get_class
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                this,
                                                                "reveal",
                                                                ObjectProphecy.class))
                                                .value())
                                .value());
        env.callMethod(exception, "setObjectProphecy", ObjectProphecy.class, this);
        for (ZPair zpairResult71 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("methodProphecies").value(),
                        env,
                        true)) {
            prophecies = ZVal.assign(zpairResult71.getValue());
            for (ZPair zpairResult72 : ZVal.getIterable(prophecies, env, true)) {
                prophecy = ZVal.assign(zpairResult72.getValue());
                try {
                    env.callMethod(prophecy, "checkPrediction", ObjectProphecy.class);
                } catch (ConvertedException convertedException14) {
                    if (convertedException14.instanceOf(
                            PredictionException.class,
                            "Prophecy\\Exception\\Prediction\\PredictionException")) {
                        e = convertedException14.getObject();
                        env.callMethod(exception, "append", ObjectProphecy.class, e);
                    } else {
                        throw convertedException14;
                    }
                }
            }
        }

        if (CRArrayF.count
                .env(env)
                .call(env.callMethod(exception, "getExceptions", ObjectProphecy.class))
                .getBool()) {
            throw ZVal.getException(env, exception);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    public Object __call(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        Object argumentsWildcard = null;
        Object comparator = null;
        Object failure = null;
        Object prophecy = null;
        arguments =
                new ArgumentsWildcard(
                        env,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("revealer").value(),
                                "reveal",
                                ObjectProphecy.class,
                                arguments));
        for (ZPair zpairResult73 :
                ZVal.getIterable(
                        env.callMethod(
                                this, "getMethodProphecies", ObjectProphecy.class, methodName),
                        env,
                        true)) {
            prophecy = ZVal.assign(zpairResult73.getValue());
            argumentsWildcard =
                    env.callMethod(prophecy, "getArgumentsWildcard", ObjectProphecy.class);
            comparator =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("comparatorFactory").value(),
                            "getComparatorFor",
                            ObjectProphecy.class,
                            argumentsWildcard,
                            arguments);
            try {
                env.callMethod(
                        comparator,
                        new RuntimeArgsWithReferences(),
                        "assertEquals",
                        ObjectProphecy.class,
                        argumentsWildcard,
                        arguments);
                return ZVal.assign(prophecy);
            } catch (ConvertedException convertedException15) {
                if (convertedException15.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    failure = convertedException15.getObject();
                } else {
                    throw convertedException15;
                }
            }
        }

        return ZVal.assign(new MethodProphecy(env, this, methodName, arguments));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return ZVal.assign(
                toObjectR(env.callMethod(this, "reveal", ObjectProphecy.class))
                        .accessProp(this, env)
                        .name(name)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object value = assignParameter(args, 1, null);
        toObjectR(env.callMethod(this, "reveal", ObjectProphecy.class))
                .accessProp(this, env)
                .name(name)
                .set(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("revealer").value(),
                                "reveal",
                                ObjectProphecy.class,
                                value));
        return null;
    }

    public static final Object CONST_class = "Prophecy\\Prophecy\\ObjectProphecy";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Prophecy\\ObjectProphecy")
                    .setLookup(ObjectProphecy.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "callCenter",
                            "comparatorFactory",
                            "lazyDouble",
                            "methodProphecies",
                            "revealer")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Prophecy/ObjectProphecy.php")
                    .addInterface("ProphecyInterface")
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
