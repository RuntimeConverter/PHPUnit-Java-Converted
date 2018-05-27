package com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func_array;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/webmozart/assert/src/Assert.php

*/

public class Assert extends RuntimeClassBase {

    public Assert(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Assert.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    private Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Webmozart\\Assert\\Assert";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object string(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!function_is_string.f.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a string. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object stringNotEmpty(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            runtimeStaticObject.string(env, value, message);
            runtimeStaticObject.notEq(env, value, "", message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object integer(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!function_is_int.f.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an integer. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object integerish(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.toBool(!function_is_numeric.f.env(env).call(value).getBool())
                    || ZVal.toBool(ZVal.notEqualityCheck(value, ZVal.toLong(value)))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an integerish value. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod(name = "float")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _pFloat(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.is_float.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a float. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object numeric(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!function_is_numeric.f.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a numeric. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object natural(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.toBool(!function_is_int.f.env(env).call(value).getBool())
                    || ZVal.toBool(ZVal.isLessThan(value, '<', 0))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a non-negative integer. Got %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod(name = "boolean")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _pBoolean(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.is_bool.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a boolean. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object scalar(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.is_scalar.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a scalar. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod(name = "object")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _object(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!function_is_object.f.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an object. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "type",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 2, name = "message")
        public Object resource(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object type = assignParameter(args, 1, null);
            if (ZVal.isNull(type)) {
                type = ZVal.getNull();
            }
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.is_resource.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a resource. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            if (ZVal.toBool(type)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    type,
                                    "!==",
                                    NamespaceGlobal.get_resource_type
                                            .env(env)
                                            .call(value)
                                            .value()))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a resource of type %2$s. Got: %s",
                                        runtimeStaticObject.typeToString(env, value),
                                        type)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isCallable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.is_callable
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences())
                    .call(value)
                    .getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a callable. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isArray(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!function_is_array.f.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an array. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isTraversable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "The \"%s\" assertion is deprecated. You should stop using it, as it will soon be removed in 2.0 version. Use \"isIterable\" or \"isInstanceOf\" instead.",
                                            "Assert::isTraversable")
                                    .value(),
                            16384)
                    .value();
            if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            value, Traversable.class, "Traversable")))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a traversable. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isArrayAccessible(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            value, ArrayAccess.class, "ArrayAccess")))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an array accessible. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isCountable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(value, Countable.class, "Countable")))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a countable. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isIterable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            value, Traversable.class, "Traversable")))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an iterable. Got: %s",
                                        runtimeStaticObject.typeToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "message")
        public Object isInstanceOf(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object _pClass = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!ZVal.isTrue(ZVal.checkInstanceTypeMatch(value, _pClass))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an instance of %2$s. Got: %s",
                                        runtimeStaticObject.typeToString(env, value),
                                        _pClass)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "message")
        public Object notInstanceOf(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object _pClass = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(value, _pClass))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an instance other than %2$s. Got: %s",
                                        runtimeStaticObject.typeToString(env, value),
                                        _pClass)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "classes", typeHint = "array")
        @ConvertedParameter(index = 2, name = "message")
        public Object isInstanceOfAny(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object classes = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object _pClass = null;
            for (ZPair zpairResult493 : ZVal.getIterable(classes, env, true)) {
                _pClass = ZVal.assign(zpairResult493.getValue());
                if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(value, _pClass))) {
                    return null;
                }
            }

            runtimeStaticObject.reportInvalidArgument(
                    env,
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    ZVal.isTrue(message)
                                            ? message
                                            : "Expected an instance of any of %2$s. Got: %s",
                                    runtimeStaticObject.typeToString(env, value),
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    ", ",
                                                    CRArrayF.array_map
                                                            .env(env)
                                                            .call(
                                                                    ZVal.newArray(
                                                                            new ZPair(0, "static"),
                                                                            new ZPair(
                                                                                    1,
                                                                                    "valueToString")),
                                                                    classes)
                                                            .value())
                                            .value())
                            .value());
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isEmpty(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!ZVal.isEmpty(value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an empty value. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object notEmpty(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isEmpty(value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a non-empty value. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod(name = "null")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _null(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message) ? message : "Expected null. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object notNull(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env, ZVal.isTrue(message) ? message : "Expected a value other than null.");
            }

            return null;
        }

        @ConvertedMethod(name = "true")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _true(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictNotEqualityCheck(true, "!==", value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to be true. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod(name = "false")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _false(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictNotEqualityCheck(false, "!==", value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to be false. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "value2")
        @ConvertedParameter(index = 2, name = "message")
        public Object eq(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object value2 = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.notEqualityCheck(value2, value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value equal to %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, value2))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "value2")
        @ConvertedParameter(index = 2, name = "message")
        public Object notEq(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object value2 = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.equalityCheck(value2, value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a different value than %s.",
                                        runtimeStaticObject.valueToString(env, value2))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "value2")
        @ConvertedParameter(index = 2, name = "message")
        public Object same(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object value2 = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictNotEqualityCheck(value2, "!==", value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value identical to %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, value2))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "value2")
        @ConvertedParameter(index = 2, name = "message")
        public Object notSame(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object value2 = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictEqualityCheck(value2, "===", value)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value not identical to %s.",
                                        runtimeStaticObject.valueToString(env, value2))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "limit")
        @ConvertedParameter(index = 2, name = "message")
        public Object greaterThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object limit = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isLessThanOrEqualTo(value, "<=", limit)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value greater than %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, limit))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "limit")
        @ConvertedParameter(index = 2, name = "message")
        public Object greaterThanEq(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object limit = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isLessThan(value, '<', limit)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value greater than or equal to %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, limit))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "limit")
        @ConvertedParameter(index = 2, name = "message")
        public Object lessThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object limit = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isGreaterThanOrEqualTo(value, ">=", limit)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value less than %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, limit))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "limit")
        @ConvertedParameter(index = 2, name = "message")
        public Object lessThanEq(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object limit = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isGreaterThan(value, '>', limit)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value less than or equal to %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, limit))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "max")
        @ConvertedParameter(index = 3, name = "message")
        public Object range(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object min = assignParameter(args, 1, null);
            Object max = assignParameter(args, 2, null);
            Object message = assignParameter(args, 3, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.toBool(ZVal.isLessThan(value, '<', min))
                    || ZVal.toBool(ZVal.isGreaterThan(value, '>', max))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value between %2$s and %3$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, min),
                                        runtimeStaticObject.valueToString(env, max))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "values", typeHint = "array")
        @ConvertedParameter(index = 2, name = "message")
        public Object oneOf(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object values = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!CRArrayF.in_array.env(env).call(value, values, true).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected one of: %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
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
                                                                                        "static"),
                                                                                new ZPair(
                                                                                        1,
                                                                                        "valueToString")),
                                                                        values)
                                                                .value())
                                                .value())
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "subString")
        @ConvertedParameter(index = 2, name = "message")
        public Object contains(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object subString = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictEqualityCheck(
                    false, "===", NamespaceGlobal.strpos.env(env).call(value, subString).value())) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, subString))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "subString")
        @ConvertedParameter(index = 2, name = "message")
        public Object notContains(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object subString = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictNotEqualityCheck(
                    false, "!==", NamespaceGlobal.strpos.env(env).call(value, subString).value())) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "%2$s was not expected to be contained in a value. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, subString))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object notWhitespaceOnly(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences())
                    .call("/^\\s*$/", value)
                    .getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a non-whitespace string. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "prefix")
        @ConvertedParameter(index = 2, name = "message")
        public Object startsWith(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object prefix = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictNotEqualityCheck(
                    0, "!==", NamespaceGlobal.strpos.env(env).call(value, prefix).value())) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to start with %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, prefix))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object startsWithLetter(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            if (ZVal.isNull(value)) {
                value = ZVal.newArray();
            }
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object valid = null;
            Object locale = null;
            valid = ZVal.assign(ZVal.isset(ZVal.getElement(value, 0)));
            if (ZVal.isTrue(valid)) {
                locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
                NamespaceGlobal.setlocale.env(env).call(0, "C");
                valid =
                        NamespaceGlobal.ctype_alpha
                                .env(env)
                                .call(ZVal.getElement(value, 0))
                                .value();
                NamespaceGlobal.setlocale.env(env).call(0, locale);
            }

            if (!ZVal.isTrue(valid)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to start with a letter. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "suffix")
        @ConvertedParameter(index = 2, name = "message")
        public Object endsWith(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object suffix = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictNotEqualityCheck(
                    suffix,
                    "!==",
                    NamespaceGlobal.substr
                            .env(env)
                            .call(value, ZVal.minusSign(runtimeStaticObject.strlen(env, suffix)))
                            .value())) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to end with %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, suffix))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "pattern")
        @ConvertedParameter(index = 2, name = "message")
        public Object regex(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object pattern = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences())
                    .call(pattern, value)
                    .getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "The value %s does not match the expected pattern.",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object alpha(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object valid = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_alpha.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain only letters. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object digits(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object valid = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_digit.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain digits only. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object alnum(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object valid = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_alnum.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain letters and digits only. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object lower(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object valid = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_lower.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain lowercase characters only. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object upper(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object valid = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_upper.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain uppercase characters only. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "length")
        @ConvertedParameter(index = 2, name = "message")
        public Object length(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object length = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.strictNotEqualityCheck(
                    length, "!==", runtimeStaticObject.strlen(env, value))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain %2$s characters. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        length)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "message")
        public Object minLength(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object min = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isLessThan(runtimeStaticObject.strlen(env, value), '<', min)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain at least %2$s characters. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        min)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "max")
        @ConvertedParameter(index = 2, name = "message")
        public Object maxLength(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object max = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isGreaterThan(runtimeStaticObject.strlen(env, value), '>', max)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain at most %2$s characters. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        max)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "max")
        @ConvertedParameter(index = 3, name = "message")
        public Object lengthBetween(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object min = assignParameter(args, 1, null);
            Object max = assignParameter(args, 2, null);
            Object message = assignParameter(args, 3, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object length = null;
            length = runtimeStaticObject.strlen(env, value);
            if (ZVal.toBool(ZVal.isLessThan(length, '<', min))
                    || ZVal.toBool(ZVal.isGreaterThan(length, '>', max))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a value to contain between %2$s and %3$s characters. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        min,
                                        max)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object fileExists(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            runtimeStaticObject.string(env, value);
            if (!NamespaceGlobal.file_exists.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "The file %s does not exist.",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object file(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            runtimeStaticObject.fileExists(env, value, message);
            if (!NamespaceGlobal.is_file.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "The path %s is not a file.",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object directory(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            runtimeStaticObject.fileExists(env, value, message);
            if (!NamespaceGlobal.is_dir.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "The path %s is no directory.",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object readable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.is_readable.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "The path %s is not readable.",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object writable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.is_writable.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "The path %s is not writable.",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object classExists(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!function_class_exists.f.env(env).call(value).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an existing class name. Got: %s",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "message")
        public Object subclassOf(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object _pClass = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.is_subclass_of.env(env).call(value, _pClass).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected a sub-class of %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, _pClass))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "interface")
        @ConvertedParameter(index = 2, name = "message")
        public Object implementsInterface(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object _pInterface = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!CRArrayF.in_array
                    .env(env)
                    .call(
                            _pInterface,
                            NamespaceGlobal.class_implements.env(env).call(value).value())
                    .getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an implementation of %2$s. Got: %s",
                                        runtimeStaticObject.valueToString(env, value),
                                        runtimeStaticObject.valueToString(env, _pInterface))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "property")
        @ConvertedParameter(index = 2, name = "message")
        public Object propertyExists(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, null);
            Object property = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!NamespaceGlobal.property_exists.env(env).call(classOrObject, property).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected the property %s to exist.",
                                        runtimeStaticObject.valueToString(env, property))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "property")
        @ConvertedParameter(index = 2, name = "message")
        public Object propertyNotExists(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, null);
            Object property = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (NamespaceGlobal.property_exists.env(env).call(classOrObject, property).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected the property %s to not exist.",
                                        runtimeStaticObject.valueToString(env, property))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "method")
        @ConvertedParameter(index = 2, name = "message")
        public Object methodExists(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, null);
            Object method = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!function_method_exists.f.env(env).call(classOrObject, method).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected the method %s to exist.",
                                        runtimeStaticObject.valueToString(env, method))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "method")
        @ConvertedParameter(index = 2, name = "message")
        public Object methodNotExists(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, null);
            Object method = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (function_method_exists.f.env(env).call(classOrObject, method).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected the method %s to not exist.",
                                        runtimeStaticObject.valueToString(env, method))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(index = 2, name = "message")
        public Object keyExists(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, null);
            Object key = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (!CRArrayF.array_key_exists.env(env).call(key, array).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected the key %s to exist.",
                                        runtimeStaticObject.valueToString(env, key))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(index = 2, name = "message")
        public Object keyNotExists(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, null);
            Object key = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (CRArrayF.array_key_exists.env(env).call(key, array).getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected the key %s to not exist.",
                                        runtimeStaticObject.valueToString(env, key))
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "number")
        @ConvertedParameter(index = 2, name = "message")
        public Object count(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, null);
            Object number = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            runtimeStaticObject.eq(
                    env,
                    CRArrayF.count.env(env).call(array).value(),
                    number,
                    ZVal.isTrue(message)
                            ? message
                            : NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Expected an array to contain %d elements. Got: %d.",
                                            number, CRArrayF.count.env(env).call(array).value())
                                    .value());
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "message")
        public Object minCount(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, null);
            Object min = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isLessThan(CRArrayF.count.env(env).call(array).value(), '<', min)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an array to contain at least %2$d elements. Got: %d",
                                        CRArrayF.count.env(env).call(array).value(),
                                        min)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "max")
        @ConvertedParameter(index = 2, name = "message")
        public Object maxCount(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, null);
            Object max = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            if (ZVal.isGreaterThan(CRArrayF.count.env(env).call(array).value(), '>', max)) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an array to contain at most %2$d elements. Got: %d",
                                        CRArrayF.count.env(env).call(array).value(),
                                        max)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "max")
        @ConvertedParameter(index = 3, name = "message")
        public Object countBetween(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, null);
            Object min = assignParameter(args, 1, null);
            Object max = assignParameter(args, 2, null);
            Object message = assignParameter(args, 3, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object count = null;
            count = CRArrayF.count.env(env).call(array).value();
            if (ZVal.toBool(ZVal.isLessThan(count, '<', min))
                    || ZVal.toBool(ZVal.isGreaterThan(count, '>', max))) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Expected an array to contain between %2$d and %3$d elements. Got: %d",
                                        count,
                                        min,
                                        max)
                                .value());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object uuid(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object message = assignParameter(args, 1, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            value =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, "urn:"),
                                            new ZPair(1, "uuid:"),
                                            new ZPair(2, "{"),
                                            new ZPair(3, "}")),
                                    "",
                                    value)
                            .value();
            if (ZVal.strictEqualityCheck("00000000-0000-0000-0000-000000000000", "===", value)) {
                return null;
            }

            if (!NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences())
                    .call(
                            "/^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$/",
                            value)
                    .getBool()) {
                runtimeStaticObject.reportInvalidArgument(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        ZVal.isTrue(message)
                                                ? message
                                                : "Value %s is not a valid UUID.",
                                        runtimeStaticObject.valueToString(env, value))
                                .value());
            }

            return null;
        }

        @ConvertedMethod(name = "throws")
        @ConvertedParameter(index = 0, name = "expression", typeHint = "Closure")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "message")
        public Object _pThrows(RuntimeEnv env, Object... args) {
            Object expression = assignParameter(args, 0, null);
            Object _pClass = assignParameter(args, 1, null);
            if (ZVal.isNull(_pClass)) {
                _pClass = "Exception";
            }
            Object message = assignParameter(args, 2, null);
            if (ZVal.isNull(message)) {
                message = "";
            }
            Object actual = null;
            Object e = null;
            runtimeStaticObject.string(env, _pClass);
            actual = "none";
            try {
                env.callFunctionDynamic(expression, new RuntimeArgsWithReferences());
            } catch (ConvertedException convertedException67) {
                if (convertedException67.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException67.getObject();
                    actual = function_get_class.f.env(env).call(e).value();
                    if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(e, _pClass))) {
                        return null;
                    }

                } else if (convertedException67.instanceOf(Throwable.class, "Throwable")) {
                    e = convertedException67.getObject();
                    actual = function_get_class.f.env(env).call(e).value();
                    if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(e, _pClass))) {
                        return null;
                    }

                } else {
                    throw convertedException67;
                }
            }

            runtimeStaticObject.reportInvalidArgument(
                    env,
                    ZVal.isTrue(message)
                            ? message
                            : NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Expected to throw \"%s\", got \"%s\"", _pClass, actual)
                                    .value());
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "arguments")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, null);
            Object arguments = assignParameter(args, 1, null);
            if (ZVal.isNull(arguments)) {
                arguments = ZVal.newArray();
            }
            Object ___args = ZVal.newArray();
            Object entry = null;
            Object method = null;
            if (ZVal.strictEqualityCheck(
                    "nullOr", "===", NamespaceGlobal.substr.env(env).call(name, 0, 6).value())) {
                if (ZVal.strictNotEqualityCheck(
                        ZVal.getNull(), "!==", ZVal.getElement(arguments, 0))) {
                    method =
                            NamespaceGlobal.lcfirst
                                    .env(env)
                                    .call(NamespaceGlobal.substr.env(env).call(name, 6).value())
                                    .value();
                    function_call_user_func_array
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(new ZPair(0, "static"), new ZPair(1, method)),
                                    arguments);
                }

                return null;
            }

            if (ZVal.strictEqualityCheck(
                    "all", "===", NamespaceGlobal.substr.env(env).call(name, 0, 3).value())) {
                runtimeStaticObject.isIterable(env, ZVal.getElement(arguments, 0));
                method =
                        NamespaceGlobal.lcfirst
                                .env(env)
                                .call(NamespaceGlobal.substr.env(env).call(name, 3).value())
                                .value();
                ___args = ZVal.assign(arguments);
                for (ZPair zpairResult494 :
                        ZVal.getIterable(ZVal.getElement(arguments, 0), env, true)) {
                    entry = ZVal.assign(zpairResult494.getValue());
                    ZVal.putArrayElement(___args, 0, entry);
                    function_call_user_func_array
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(new ZPair(0, "static"), new ZPair(1, method)),
                                    ___args);
                }

                return null;
            }

            throw ZVal.getException(
                    env,
                    new BadMethodCallException(env, "No such method: " + toStringR(name, env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        protected Object valueToString(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
                return "null";
            }

            if (ZVal.strictEqualityCheck(true, "===", value)) {
                return "true";
            }

            if (ZVal.strictEqualityCheck(false, "===", value)) {
                return "false";
            }

            if (function_is_array.f.env(env).call(value).getBool()) {
                return "array";
            }

            if (function_is_object.f.env(env).call(value).getBool()) {
                return ZVal.assign(function_get_class.f.env(env).call(value).value());
            }

            if (NamespaceGlobal.is_resource.env(env).call(value).getBool()) {
                return "resource";
            }

            if (function_is_string.f.env(env).call(value).getBool()) {
                return ZVal.assign("\"" + toStringR(value, env) + "\"");
            }

            return ZVal.assign(toStringR(value, env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        protected Object typeToString(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(
                    function_is_object.f.env(env).call(value).getBool()
                            ? function_get_class.f.env(env).call(value).value()
                            : NamespaceGlobal.gettype.env(env).call(value).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        protected Object strlen(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object encoding = null;
            if (!NamespaceGlobal.function_exists.env(env).call("mb_detect_encoding").getBool()) {
                return ZVal.assign(NamespaceGlobal.strlen.env(env).call(value).value());
            }

            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    encoding = NamespaceGlobal.mb_detect_encoding.env(env).call(value).value())) {
                return ZVal.assign(NamespaceGlobal.strlen.env(env).call(value).value());
            }

            return ZVal.assign(NamespaceGlobal.mb_strwidth.env(env).call(value, encoding).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message")
        protected Object reportInvalidArgument(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, null);
            throw ZVal.getException(env, new InvalidArgumentException(env, message));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Webmozart\\Assert\\Assert")
                    .setLookup(Assert.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/webmozart/assert/src/Assert.php")
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
