package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes.Call;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Call.classes.UnexpectedCallException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prophecy.classes.MethodProphecyException;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func_array;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Call/CallCenter.php

*/

public class CallCenter extends RuntimeClassBase {

    public Object util = null;

    public Object recordedCalls = ZVal.newArray();

    public CallCenter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CallCenter.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "util",
        typeHint = "Prophecy\\Util\\StringUtil",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object util = assignParameter(args, 0, null);
        if (ZVal.isNull(util)) {
            util = ZVal.getNull();
        }
        toObjectR(this)
                .accessProp(this, env)
                .name("util")
                .set(ZVal.isTrue(util) ? util : new StringUtil(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prophecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    public Object makeCall(RuntimeEnv env, Object... args) {
        Object prophecy = assignParameter(args, 0, null);
        Object methodName = assignParameter(args, 1, null);
        Object arguments = assignParameter(args, 2, null);
        Object exception = null;
        Object returnValue = null;
        Object backtrace = ZVal.newArray();
        Object e = null;
        Object line = null;
        Object promise = null;
        Object matches = ZVal.newArray();
        Object score = null;
        Object file = null;
        Object methodProphecy = null;
        if (ZVal.isGreaterThanOrEqualTo(70116, ">=", 50400)) {
            backtrace = NamespaceGlobal.debug_backtrace.env(env).call(2, 3).value();

        } else if (function_defined.f.env(env).call("DEBUG_BACKTRACE_IGNORE_ARGS").getBool()) {
            backtrace = NamespaceGlobal.debug_backtrace.env(env).call(2).value();

        } else {
            backtrace = NamespaceGlobal.debug_backtrace.env(env).call().value();
        }

        file = ZVal.assign(line = ZVal.getNull());
        if (ZVal.toBool(ZVal.isset(ZVal.getElement(backtrace, 2)))
                && ZVal.toBool(ZVal.isset(ZVal.getElementRecursive(backtrace, 2, "file")))) {
            file = ZVal.assign(ZVal.getElementRecursive(backtrace, 2, "file"));
            line = ZVal.assign(ZVal.getElementRecursive(backtrace, 2, "line"));
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck("__destruct", "===", methodName))
                || ZVal.toBool(
                        ZVal.equalityCheck(
                                0,
                                CRArrayF.count
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        prophecy,
                                                        "getMethodProphecies",
                                                        CallCenter.class))
                                        .value()))) {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("recordedCalls").value(),
                    new Call(
                            env,
                            methodName,
                            arguments,
                            ZVal.getNull(),
                            ZVal.getNull(),
                            file,
                            line));
            return ZVal.assign(ZVal.getNull());
        }

        matches = ZVal.newArray();
        for (ZPair zpairResult51 :
                ZVal.getIterable(
                        env.callMethod(
                                prophecy, "getMethodProphecies", CallCenter.class, methodName),
                        env,
                        true)) {
            methodProphecy = ZVal.assign(zpairResult51.getValue());
            if (ZVal.isLessThan(
                    0,
                    '<',
                    score =
                            env.callMethod(
                                    env.callMethod(
                                            methodProphecy,
                                            "getArgumentsWildcard",
                                            CallCenter.class),
                                    "scoreArguments",
                                    CallCenter.class,
                                    arguments))) {
                ZVal.addToArray(
                        matches, ZVal.newArray(new ZPair(0, score), new ZPair(1, methodProphecy)));
            }
        }

        if (!CRArrayF.count.env(env).call(matches).getBool()) {
            throw ZVal.getException(
                    env,
                    env.callMethod(
                            this,
                            "createUnexpectedCallException",
                            CallCenter.class,
                            prophecy,
                            methodName,
                            arguments));
        }

        CRArrayF.usort
                .env(env)
                .call(
                        matches,
                        new Closure(env) {
                            @Override
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object match1 = assignParameter(args, 0, null);
                                if (ZVal.isNull(match1)) {
                                    match1 = ZVal.newArray();
                                }
                                Object match2 = assignParameter(args, 1, null);
                                if (ZVal.isNull(match2)) {
                                    match2 = ZVal.newArray();
                                }
                                return ZVal.assign(
                                        ZVal.subtract(
                                                ZVal.getElement(match2, 0),
                                                ZVal.getElement(match1, 0)));
                            }
                        })
                .value();
        methodProphecy = ZVal.assign(ZVal.getElementRecursive(matches, 0, 1));
        returnValue = ZVal.getNull();
        exception = ZVal.getNull();
        if (ZVal.isTrue(promise = env.callMethod(methodProphecy, "getPromise", CallCenter.class))) {
            try {
                returnValue =
                        env.callMethod(
                                promise,
                                "execute",
                                CallCenter.class,
                                arguments,
                                prophecy,
                                methodProphecy);
            } catch (ConvertedException convertedException10) {
                if (convertedException10.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException10.getObject();
                    exception = ZVal.assign(e);
                } else {
                    throw convertedException10;
                }
            }
        }

        if (ZVal.toBool(env.callMethod(methodProphecy, "hasReturnVoid", CallCenter.class))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(returnValue, "!==", ZVal.getNull()))) {
            throw ZVal.getException(
                    env,
                    new MethodProphecyException(
                            env,
                            "The method \""
                                    + toStringR(methodName, env)
                                    + "\" has a void return type, but the promise returned a value",
                            methodProphecy));
        }

        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("recordedCalls").value(),
                new Call(env, methodName, arguments, returnValue, exception, file, line));
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", exception)) {
            throw ZVal.getException(env, exception);
        }

        return ZVal.assign(returnValue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(
        index = 1,
        name = "wildcard",
        typeHint = "Prophecy\\Argument\\ArgumentsWildcard"
    )
    public Object findCalls(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        Object wildcard = assignParameter(args, 1, null);
        return ZVal.assign(
                CRArrayF.array_values
                        .env(env)
                        .call(
                                CRArrayF.array_filter
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("recordedCalls")
                                                        .value(),
                                                new Closure(env) {
                                                    @Override
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object call =
                                                                assignParameter(args, 0, null);
                                                        Object methodName = null;
                                                        Object wildcard = null;
                                                        methodName =
                                                                this.contextReferences
                                                                        .getCapturedValue(
                                                                                "methodName");
                                                        wildcard =
                                                                this.contextReferences
                                                                        .getCapturedValue(
                                                                                "wildcard");
                                                        return ZVal.assign(
                                                                ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                methodName,
                                                                                                "===",
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                call,
                                                                                                                "getMethodName",
                                                                                                                CallCenter
                                                                                                                        .class)))
                                                                        && ZVal.toBool(
                                                                                ZVal.isLessThan(
                                                                                        0,
                                                                                        '<',
                                                                                        env
                                                                                                .callMethod(
                                                                                                        wildcard,
                                                                                                        "scoreArguments",
                                                                                                        CallCenter
                                                                                                                .class,
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        call,
                                                                                                                        "getArguments",
                                                                                                                        CallCenter
                                                                                                                                .class)))));
                                                    }
                                                }.use("methodName", methodName)
                                                        .use("wildcard", wildcard))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prophecy",
        typeHint = "Prophecy\\Prophecy\\ObjectProphecy"
    )
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    private Object createUnexpectedCallException(RuntimeEnv env, Object... args) {
        Object prophecy = assignParameter(args, 0, null);
        Object methodName = assignParameter(args, 1, null);
        Object arguments = assignParameter(args, 2, null);
        Object classname = null;
        Object expected = null;
        Object argstring = null;
        classname =
                function_get_class
                        .f
                        .env(env)
                        .call(env.callMethod(prophecy, "reveal", CallCenter.class))
                        .value();
        argstring =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                ", ",
                                CRArrayF.array_map
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(
                                                                0,
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("util")
                                                                        .value()),
                                                        new ZPair(1, "stringify")),
                                                arguments)
                                        .value())
                        .value();
        expected =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "\n",
                                CRArrayF.array_map
                                        .env(env)
                                        .call(
                                                new Closure(env) {
                                                    @Override
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object methodProphecy =
                                                                assignParameter(args, 0, null);
                                                        return ZVal.assign(
                                                                NamespaceGlobal.sprintf
                                                                        .env(env)
                                                                        .call(
                                                                                "  - %s(%s)",
                                                                                env.callMethod(
                                                                                        methodProphecy,
                                                                                        "getMethodName",
                                                                                        CallCenter
                                                                                                .class),
                                                                                env.callMethod(
                                                                                        methodProphecy,
                                                                                        "getArgumentsWildcard",
                                                                                        CallCenter
                                                                                                .class))
                                                                        .value());
                                                    }
                                                },
                                                function_call_user_func_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "array_merge",
                                                                env.callMethod(
                                                                        prophecy,
                                                                        "getMethodProphecies",
                                                                        CallCenter.class))
                                                        .value())
                                        .value())
                        .value();
        return ZVal.assign(
                new UnexpectedCallException(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "Method call:\n"
                                                + "  - %s(%s)\n"
                                                + "on %s was not expected, expected calls were:\n%s",
                                        methodName, argstring, classname, expected)
                                .value(),
                        prophecy,
                        methodName,
                        arguments));
    }

    public static final Object CONST_class = "Prophecy\\Call\\CallCenter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Call\\CallCenter")
                    .setLookup(CallCenter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("recordedCalls", "util")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Call/CallCenter.php")
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
