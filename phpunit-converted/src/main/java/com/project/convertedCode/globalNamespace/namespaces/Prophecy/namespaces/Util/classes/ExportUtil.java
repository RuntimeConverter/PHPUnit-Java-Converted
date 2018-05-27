package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes.Context;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
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
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ProphecyInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Util/ExportUtil.php

*/

public class ExportUtil extends RuntimeClassBase {

    public ExportUtil(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "Prophecy\\Util\\ExportUtil";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

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
                    runtimeStaticObject.recursiveExport(
                            env,
                            new RuntimeArgsWithReferences().add(0, value),
                            value.getObject(),
                            indentation));
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
            for (ZPair zpairResult75 : ZVal.getIterable(ZVal.toArray(value), env, false)) {
                key = ZVal.assign(zpairResult75.getKey());
                val = ZVal.assign(zpairResult75.getValue());
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
                for (ZPair zpairResult76 : ZVal.getIterable(value, env, false)) {
                    key = ZVal.assign(zpairResult76.getKey());
                    val = ZVal.assign(zpairResult76.getValue());
                    ZVal.putArrayElement(
                            array,
                            NamespaceGlobal.spl_object_hash.env(env).call(val).value(),
                            ZVal.newArray(
                                    new ZPair("obj", val),
                                    new ZPair(
                                            "inf",
                                            env.callMethod(value, "getInfo", ExportUtil.class))));
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
            ReferenceContainer value =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
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
                        .call("/[^\\x09-\\x0d\\x20-\\xff]/", value.getObject())
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
                                                        ZVal.newArray(
                                                                new ZPair(0, "\r\n"),
                                                                new ZPair(1, "\n\r"),
                                                                new ZPair(2, "\r")),
                                                        ZVal.newArray(
                                                                new ZPair(0, "\n"),
                                                                new ZPair(1, "\n"),
                                                                new ZPair(2, "\n")),
                                                        value.getObject())
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
                                        ExportUtil.class,
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
                                ExportUtil.class,
                                value.getObject());
                values = "";
                if (ZVal.isGreaterThan(CRArrayF.count.env(env).call(array).value(), '>', 0)) {
                    for (ZPair zpairResult77 : ZVal.getIterable(array, env, false)) {
                        k.setObject(ZVal.assign(zpairResult77.getKey()));
                        v.setObject(ZVal.assign(zpairResult77.getValue()));
                        values =
                                toStringR(values, env)
                                        + toStringR(
                                                NamespaceGlobal.sprintf
                                                        .env(env)
                                                        .call(
                                                                "%s    %s => %s" + "\n",
                                                                whitespace,
                                                                runtimeStaticObject.recursiveExport(
                                                                        env,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, k),
                                                                        k.getObject(),
                                                                        indentation),
                                                                runtimeStaticObject.recursiveExport(
                                                                        env,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(
                                                                                        0,
                                                                                        new ArrayDimensionReference(
                                                                                                value
                                                                                                        .getObject(),
                                                                                                k
                                                                                                        .getObject())),
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
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call("Array &%s (%s)", key, values)
                                .value());
            }

            if (function_is_object.f.env(env).call(value.getObject()).getBool()) {
                _pClass = function_get_class.f.env(env).call(value.getObject()).value();
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                value.getObject(),
                                ProphecyInterface.class,
                                "Prophecy\\Prophecy\\ProphecyInterface"))) {
                    return ZVal.assign(
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("%s Object (*Prophecy*)", _pClass)
                                    .value());

                } else if (ZVal.isTrue(
                        hash =
                                env.callMethod(
                                        processed,
                                        new RuntimeArgsWithReferences().add(0, value),
                                        "contains",
                                        ExportUtil.class,
                                        value.getObject()))) {
                    return ZVal.assign(
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("%s:%s Object", _pClass, hash)
                                    .value());
                }

                hash =
                        env.callMethod(
                                processed,
                                new RuntimeArgsWithReferences().add(0, value),
                                "add",
                                ExportUtil.class,
                                value.getObject());
                values = "";
                array = runtimeStaticObject.toArray(env, value.getObject());
                if (ZVal.isGreaterThan(CRArrayF.count.env(env).call(array).value(), '>', 0)) {
                    for (ZPair zpairResult78 : ZVal.getIterable(array, env, false)) {
                        k.setObject(ZVal.assign(zpairResult78.getKey()));
                        v.setObject(ZVal.assign(zpairResult78.getValue()));
                        values =
                                toStringR(values, env)
                                        + toStringR(
                                                NamespaceGlobal.sprintf
                                                        .env(env)
                                                        .call(
                                                                "%s    %s => %s" + "\n",
                                                                whitespace,
                                                                runtimeStaticObject.recursiveExport(
                                                                        env,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, k),
                                                                        k.getObject(),
                                                                        indentation),
                                                                runtimeStaticObject.recursiveExport(
                                                                        env,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, v),
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
                                .call("%s:%s Object (%s)", _pClass, hash, values)
                                .value());
            }

            return ZVal.assign(
                    NamespaceGlobal.var_export.env(env).call(value.getObject(), true).value());
        }

        public Object recursiveExport(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Util\\ExportUtil")
                    .setLookup(ExportUtil.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Util/ExportUtil.php")
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
