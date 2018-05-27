package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes.Context;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
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
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/exporter/src/Exporter.php

*/

public class Exporter extends RuntimeClassBase {

    public Exporter(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "indentation",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object export(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, null));
        Object indentation = assignParameter(args, 1, null);
        if (ZVal.isNull(indentation)) {
            indentation = 0;
        }
        return ZVal.assign(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, value),
                        "recursiveExport",
                        Exporter.class,
                        value.getObject(),
                        indentation));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "SebastianBergmann\\RecursionContext\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shortenedRecursiveExport(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(data)) {
            data.setObject(ZVal.newArray());
        }
        Object context = assignParameter(args, 1, null);
        if (ZVal.isNull(context)) {
            context = ZVal.getNull();
        }
        Object result = ZVal.newArray();
        Object exporter = null;
        Object array = null;
        Object value = null;
        Object key = null;
        result = ZVal.newArray();
        exporter =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .SebastianBergmann
                        .namespaces
                        .Exporter
                        .classes
                        .Exporter(env);
        if (!ZVal.isTrue(context)) {
            context = new Context(env);
        }

        array = ZVal.assign(data.getObject());
        env.callMethod(
                context,
                new RuntimeArgsWithReferences().add(0, data),
                "add",
                Exporter.class,
                data.getObject());
        for (ZPair zpairResult456 : ZVal.getIterable(array, env, false)) {
            key = ZVal.assign(zpairResult456.getKey());
            value = ZVal.assign(zpairResult456.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                if (ZVal.strictNotEqualityCheck(
                        env.callMethod(
                                context,
                                new RuntimeArgsWithReferences()
                                        .add(0, new ArrayDimensionReference(data.getObject(), key)),
                                "contains",
                                Exporter.class,
                                ZVal.getElement(data.getObject(), key)),
                        "!==",
                        false)) {
                    ZVal.addToArray(result, "*RECURSION*");

                } else {
                    ZVal.addToArray(
                            result,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "array(%s)",
                                            env.callMethod(
                                                    this,
                                                    new RuntimeArgsWithReferences()
                                                            .add(
                                                                    0,
                                                                    new ArrayDimensionReference(
                                                                            data.getObject(), key)),
                                                    "shortenedRecursiveExport",
                                                    Exporter.class,
                                                    ZVal.getElement(data.getObject(), key),
                                                    context))
                                    .value());
                }

            } else {
                ZVal.addToArray(
                        result, env.callMethod(exporter, "shortenedExport", Exporter.class, value));
            }
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(", ", result).value());
    }

    public Object shortenedRecursiveExport(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object shortenedExport(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object string = null;
        if (function_is_string.f.env(env).call(value).getBool()) {
            string =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call("\n", "", env.callMethod(this, "export", Exporter.class, value))
                            .value();
            if (NamespaceGlobal.function_exists.env(env).call("mb_strlen").getBool()) {
                if (ZVal.isGreaterThan(
                        NamespaceGlobal.mb_strlen.env(env).call(string).value(), '>', 40)) {
                    string =
                            toStringR(
                                            NamespaceGlobal.mb_substr
                                                    .env(env)
                                                    .call(string, 0, 30)
                                                    .value(),
                                            env)
                                    + "..."
                                    + toStringR(
                                            NamespaceGlobal.mb_substr
                                                    .env(env)
                                                    .call(string, -7)
                                                    .value(),
                                            env);
                }

            } else {
                if (ZVal.isGreaterThan(
                        NamespaceGlobal.strlen.env(env).call(string).value(), '>', 40)) {
                    string =
                            toStringR(
                                            NamespaceGlobal.substr
                                                    .env(env)
                                                    .call(string, 0, 30)
                                                    .value(),
                                            env)
                                    + "..."
                                    + toStringR(
                                            NamespaceGlobal.substr
                                                    .env(env)
                                                    .call(string, -7)
                                                    .value(),
                                            env);
                }
            }

            return ZVal.assign(string);
        }

        if (function_is_object.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "%s Object (%s)",
                                    function_get_class.f.env(env).call(value).value(),
                                    ZVal.isGreaterThan(
                                                    CRArrayF.count
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            this,
                                                                            "toArray",
                                                                            Exporter.class,
                                                                            value))
                                                            .value(),
                                                    '>',
                                                    0)
                                            ? "..."
                                            : "")
                            .value());
        }

        if (function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "Array (%s)",
                                    ZVal.isGreaterThan(
                                                    CRArrayF.count.env(env).call(value).value(),
                                                    '>',
                                                    0)
                                            ? "..."
                                            : "")
                            .value());
        }

        return ZVal.assign(env.callMethod(this, "export", Exporter.class, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object toArray(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object value = assignParameter(args, 0, null);
        Object val = null;
        Object array = ZVal.newArray();
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        Object key = null;
        if (!function_is_object.f.env(env).call(value).getBool()) {
            return ZVal.assign(ZVal.toArray(value));
        }

        array = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult457 : ZVal.getIterable(ZVal.toArray(value), env, false)) {
            key = ZVal.assign(zpairResult457.getKey());
            val = ZVal.assign(zpairResult457.getValue());
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^\\0.+\\0(.+)$/", key, matches.getObject())
                    .getBool()) {
                key = ZVal.assign(ZVal.getElement(matches.getObject(), 1));
            }

            if (ZVal.strictEqualityCheck(key, "===", "\u0000gcdata")) {
                continue;
            }

            ZVal.putArrayElement(array, key, val);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(value, SplObjectStorage.class, "SplObjectStorage"))) {
            if (NamespaceGlobal.property_exists
                    .env(env)
                    .call("\\SplObjectStorage", "__storage")
                    .getBool()) {
                ZVal.unsetArrayElement(array, "__storage");

            } else if (NamespaceGlobal.property_exists
                    .env(env)
                    .call("\\SplObjectStorage", "storage")
                    .getBool()) {
                ZVal.unsetArrayElement(array, "storage");
            }

            if (NamespaceGlobal.property_exists
                    .env(env)
                    .call("\\SplObjectStorage", "__key")
                    .getBool()) {
                ZVal.unsetArrayElement(array, "__key");
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult458 : ZVal.getIterable(value, env, false)) {
                key = ZVal.assign(zpairResult458.getKey());
                val = ZVal.assign(zpairResult458.getValue());
                ZVal.putArrayElement(
                        array,
                        NamespaceGlobal.spl_object_hash.env(env).call(val).value(),
                        ZVal.newArray(
                                new ZPair("obj", val),
                                new ZPair(
                                        "inf", env.callMethod(value, "getInfo", Exporter.class))));
            }
        }

        return ZVal.assign(array);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "indentation")
    @ConvertedParameter(
        index = 2,
        name = "processed",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object recursiveExport(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer value = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(value)) {
            value.setObject(ZVal.newArray());
        }
        Object indentation = assignParameter(args, 1, null);
        Object processed = assignParameter(args, 2, null);
        if (ZVal.isNull(processed)) {
            processed = ZVal.getNull();
        }
        Object array = null;
        ReferenceContainer v = new BasicReferenceContainer(null);
        Object values = null;
        ReferenceContainer k = new BasicReferenceContainer(null);
        Object whitespace = null;
        Object _pClass = null;
        Object key = null;
        Object hash = null;
        if (ZVal.strictEqualityCheck(value.getObject(), "===", ZVal.getNull())) {
            return "null";
        }

        if (ZVal.strictEqualityCheck(value.getObject(), "===", true)) {
            return "true";
        }

        if (ZVal.strictEqualityCheck(value.getObject(), "===", false)) {
            return "false";
        }

        if (ZVal.toBool(NamespaceGlobal.is_float.env(env).call(value.getObject()).value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                NamespaceGlobal.floatval
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.intval
                                                        .env(env)
                                                        .call(value.getObject())
                                                        .value())
                                        .value(),
                                "===",
                                value.getObject()))) {
            return ZVal.assign(toStringR(value.getObject(), env) + ".0");
        }

        if (NamespaceGlobal.is_resource.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "resource(%d) of type (%s)",
                                    value.getObject(),
                                    NamespaceGlobal.get_resource_type
                                            .env(env)
                                            .call(value.getObject())
                                            .value())
                            .value());
        }

        if (function_is_string.f.env(env).call(value.getObject()).getBool()) {
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences())
                    .call("/[^\\x09-\\x0d\\x1b\\x20-\\xff]/", value.getObject())
                    .getBool()) {
                return ZVal.assign(
                        "Binary String: 0x"
                                + toStringR(
                                        NamespaceGlobal.bin2hex
                                                .env(env)
                                                .call(value.getObject())
                                                .value(),
                                        env));
            }

            return ZVal.assign(
                    "'"
                            + toStringR(
                                    NamespaceGlobal.str_replace
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    "<lf>",
                                                    "\n",
                                                    NamespaceGlobal.str_replace
                                                            .env(env)
                                                            .addReferneceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    ZVal.newArray(
                                                                            new ZPair(0, "\r\n"),
                                                                            new ZPair(1, "\n\r"),
                                                                            new ZPair(2, "\r"),
                                                                            new ZPair(3, "\n")),
                                                                    ZVal.newArray(
                                                                            new ZPair(
                                                                                    0,
                                                                                    "\\r\\n<lf>"),
                                                                            new ZPair(
                                                                                    1,
                                                                                    "\\n\\r<lf>"),
                                                                            new ZPair(2, "\\r<lf>"),
                                                                            new ZPair(
                                                                                    3, "\\n<lf>")),
                                                                    value.getObject())
                                                            .value())
                                            .value(),
                                    env)
                            + "'");
        }

        whitespace =
                NamespaceGlobal.str_repeat
                        .env(env)
                        .call(" ", ZVal.multiply(4, indentation))
                        .value();
        if (!ZVal.isTrue(processed)) {
            processed = new Context(env);
        }

        if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
            if (ZVal.strictNotEqualityCheck(
                    key =
                            env.callMethod(
                                    processed,
                                    new RuntimeArgsWithReferences().add(0, value),
                                    "contains",
                                    Exporter.class,
                                    value.getObject()),
                    "!==",
                    false)) {
                return ZVal.assign("Array &" + toStringR(key, env));
            }

            array = ZVal.assign(value.getObject());
            key =
                    env.callMethod(
                            processed,
                            new RuntimeArgsWithReferences().add(0, value),
                            "add",
                            Exporter.class,
                            value.getObject());
            values = "";
            if (ZVal.isGreaterThan(CRArrayF.count.env(env).call(array).value(), '>', 0)) {
                for (ZPair zpairResult459 : ZVal.getIterable(array, env, false)) {
                    k.setObject(ZVal.assign(zpairResult459.getKey()));
                    v.setObject(ZVal.assign(zpairResult459.getValue()));
                    values =
                            toStringR(values, env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "%s    %s => %s" + "\n",
                                                            whitespace,
                                                            env.callMethod(
                                                                    this,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, k),
                                                                    "recursiveExport",
                                                                    Exporter.class,
                                                                    k.getObject(),
                                                                    indentation),
                                                            env.callMethod(
                                                                    this,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(
                                                                                    0,
                                                                                    new ArrayDimensionReference(
                                                                                            value
                                                                                                    .getObject(),
                                                                                            k
                                                                                                    .getObject())),
                                                                    "recursiveExport",
                                                                    Exporter.class,
                                                                    ZVal.getElement(
                                                                            value.getObject(),
                                                                            k.getObject()),
                                                                    ZVal.add(indentation, 1),
                                                                    processed))
                                                    .value(),
                                            env);
                }

                values = "\n" + toStringR(values, env) + toStringR(whitespace, env);
            }

            return ZVal.assign(
                    NamespaceGlobal.sprintf.env(env).call("Array &%s (%s)", key, values).value());
        }

        if (function_is_object.f.env(env).call(value.getObject()).getBool()) {
            _pClass = function_get_class.f.env(env).call(value.getObject()).value();
            if (ZVal.isTrue(
                    hash =
                            env.callMethod(
                                    processed,
                                    new RuntimeArgsWithReferences().add(0, value),
                                    "contains",
                                    Exporter.class,
                                    value.getObject()))) {
                return ZVal.assign(
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call("%s Object &%s", _pClass, hash)
                                .value());
            }

            hash =
                    env.callMethod(
                            processed,
                            new RuntimeArgsWithReferences().add(0, value),
                            "add",
                            Exporter.class,
                            value.getObject());
            values = "";
            array = env.callMethod(this, "toArray", Exporter.class, value.getObject());
            if (ZVal.isGreaterThan(CRArrayF.count.env(env).call(array).value(), '>', 0)) {
                for (ZPair zpairResult460 : ZVal.getIterable(array, env, false)) {
                    k.setObject(ZVal.assign(zpairResult460.getKey()));
                    v.setObject(ZVal.assign(zpairResult460.getValue()));
                    values =
                            toStringR(values, env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "%s    %s => %s" + "\n",
                                                            whitespace,
                                                            env.callMethod(
                                                                    this,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, k),
                                                                    "recursiveExport",
                                                                    Exporter.class,
                                                                    k.getObject(),
                                                                    indentation),
                                                            env.callMethod(
                                                                    this,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, v),
                                                                    "recursiveExport",
                                                                    Exporter.class,
                                                                    v.getObject(),
                                                                    ZVal.add(indentation, 1),
                                                                    processed))
                                                    .value(),
                                            env);
                }

                values = "\n" + toStringR(values, env) + toStringR(whitespace, env);
            }

            return ZVal.assign(
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call("%s Object &%s (%s)", _pClass, hash, values)
                            .value());
        }

        return ZVal.assign(
                NamespaceGlobal.var_export.env(env).call(value.getObject(), true).value());
    }

    public Object recursiveExport(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "SebastianBergmann\\Exporter\\Exporter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Exporter\\Exporter")
                    .setLookup(Exporter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/exporter/src/Exporter.php")
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
