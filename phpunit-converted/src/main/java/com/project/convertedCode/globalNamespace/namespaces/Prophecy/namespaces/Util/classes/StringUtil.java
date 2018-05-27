package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.ExportUtil;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Util/StringUtil.php

*/

public class StringUtil extends RuntimeClassBase {

    public StringUtil(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "exportObject",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object stringify(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object exportObject = assignParameter(args, 1, null);
        if (ZVal.isNull(exportObject)) {
            exportObject = true;
        }
        Object str = null;
        Object stringify = null;
        if (function_is_array.f.env(env).call(value).getBool()) {
            if (ZVal.strictEqualityCheck(
                    CRArrayF.range
                            .env(env)
                            .call(0, ZVal.subtract(CRArrayF.count.env(env).call(value).value(), 1))
                            .value(),
                    "===",
                    CRArrayF.array_keys.env(env).call(value).value())) {
                return ZVal.assign(
                        "["
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(
                                                        ", ",
                                                        CRArrayF.array_map
                                                                .env(env)
                                                                .call(
                                                                        ZVal.newArray(
                                                                                new ZPair(0, this),
                                                                                new ZPair(
                                                                                        1,
                                                                                        "stringify")),
                                                                        value)
                                                                .value())
                                                .value(),
                                        env)
                                + "]");
            }

            stringify = ZVal.newArray(new ZPair(0, this), new ZPair(1, "stringify"));
            return ZVal.assign(
                    "["
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    ", ",
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
                                                                            Object item =
                                                                                    assignParameter(
                                                                                            args, 0,
                                                                                            null);
                                                                            Object key =
                                                                                    assignParameter(
                                                                                            args, 1,
                                                                                            null);
                                                                            Object stringify = null;
                                                                            stringify =
                                                                                    this
                                                                                            .contextReferences
                                                                                            .getCapturedValue(
                                                                                                    "stringify");
                                                                            return ZVal.assign(
                                                                                    toStringR(
                                                                                                    NamespaceGlobal
                                                                                                                    .is_integer
                                                                                                                    .env(
                                                                                                                            env)
                                                                                                                    .call(
                                                                                                                            key)
                                                                                                                    .getBool()
                                                                                                            ? key
                                                                                                            : "\""
                                                                                                                    + toStringR(
                                                                                                                            key,
                                                                                                                            env)
                                                                                                                    + "\"",
                                                                                                    env)
                                                                                            + " => "
                                                                                            + toStringR(
                                                                                                    function_call_user_func
                                                                                                            .f
                                                                                                            .env(
                                                                                                                    env)
                                                                                                            .call(
                                                                                                                    stringify,
                                                                                                                    item)
                                                                                                            .value(),
                                                                                                    env));
                                                                        }
                                                                    }.use("stringify", stringify),
                                                                    value,
                                                                    CRArrayF.array_keys
                                                                            .env(env)
                                                                            .call(value)
                                                                            .value())
                                                            .value())
                                            .value(),
                                    env)
                            + "]");
        }

        if (NamespaceGlobal.is_resource.env(env).call(value).getBool()) {
            return ZVal.assign(
                    toStringR(NamespaceGlobal.get_resource_type.env(env).call(value).value(), env)
                            + ":"
                            + toStringR(value, env));
        }

        if (function_is_object.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    ZVal.isTrue(exportObject)
                            ? ExportUtil.runtimeStaticObject.export(env, value)
                            : NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "%s:%s",
                                            function_get_class.f.env(env).call(value).value(),
                                            NamespaceGlobal.spl_object_hash
                                                    .env(env)
                                                    .call(value)
                                                    .value())
                                    .value());
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(true, "===", value))
                || ZVal.toBool(ZVal.strictEqualityCheck(false, "===", value))) {
            return ZVal.assign(ZVal.isTrue(value) ? "true" : "false");
        }

        if (function_is_string.f.env(env).call(value).getBool()) {
            str =
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "\"%s\"",
                                    NamespaceGlobal.str_replace
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call("\n", "\\n", value)
                                            .value())
                            .value();
            if (ZVal.isLessThanOrEqualTo(
                    50, "<=", NamespaceGlobal.strlen.env(env).call(str).value())) {
                return ZVal.assign(
                        toStringR(NamespaceGlobal.substr.env(env).call(str, 0, 50).value(), env)
                                + "\"...");
            }

            return ZVal.assign(str);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
            return "null";
        }

        return ZVal.assign(toStringR(value, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "calls", typeHint = "array")
    public Object stringifyCalls(RuntimeEnv env, Object... args) {
        Object calls = assignParameter(args, 0, null);
        Object self = null;
        self = ZVal.assign(this);
        return ZVal.assign(
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
                                                        Object call =
                                                                assignParameter(args, 0, null);
                                                        Object self = null;
                                                        self =
                                                                this.contextReferences
                                                                        .getCapturedValue("self");
                                                        return ZVal.assign(
                                                                NamespaceGlobal.sprintf
                                                                        .env(env)
                                                                        .call(
                                                                                "  - %s(%s) @ %s",
                                                                                env.callMethod(
                                                                                        call,
                                                                                        "getMethodName",
                                                                                        StringUtil
                                                                                                .class),
                                                                                NamespaceGlobal
                                                                                        .implode
                                                                                        .env(env)
                                                                                        .call(
                                                                                                ", ",
                                                                                                CRArrayF
                                                                                                        .array_map
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                ZVal
                                                                                                                        .newArray(
                                                                                                                                new ZPair(
                                                                                                                                        0,
                                                                                                                                        self),
                                                                                                                                new ZPair(
                                                                                                                                        1,
                                                                                                                                        "stringify")),
                                                                                                                env
                                                                                                                        .callMethod(
                                                                                                                                call,
                                                                                                                                "getArguments",
                                                                                                                                StringUtil
                                                                                                                                        .class))
                                                                                                        .value())
                                                                                        .value(),
                                                                                NamespaceGlobal
                                                                                        .str_replace
                                                                                        .env(env)
                                                                                        .addReferneceArgs(
                                                                                                new RuntimeArgsWithReferences())
                                                                                        .call(
                                                                                                toStringR(
                                                                                                                com
                                                                                                                        .runtimeconverter
                                                                                                                        .runtime
                                                                                                                        .ZVal
                                                                                                                        .functionNotFound(
                                                                                                                                "GETCWD")
                                                                                                                        .env(
                                                                                                                                env)
                                                                                                                        .call()
                                                                                                                        .value(),
                                                                                                                env)
                                                                                                        + toStringR(
                                                                                                                "/",
                                                                                                                env),
                                                                                                "",
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                call,
                                                                                                                "getCallPlace",
                                                                                                                StringUtil
                                                                                                                        .class))
                                                                                        .value())
                                                                        .value());
                                                    }
                                                }.use("self", self),
                                                calls)
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Util\\StringUtil";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Util\\StringUtil")
                    .setLookup(StringUtil.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Util/StringUtil.php")
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
