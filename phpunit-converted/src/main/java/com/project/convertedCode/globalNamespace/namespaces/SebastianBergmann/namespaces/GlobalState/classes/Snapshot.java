package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_get_declared_classes;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeClasses.stdClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.modules.standard.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Blacklist;
import com.runtimeconverter.runtime.modules.standard.serialization.function_serialize;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/global-state/src/Snapshot.php

*/

public class Snapshot extends RuntimeClassBase {

    public Object blacklist = null;

    public Object globalVariables = ZVal.newArray();

    public Object superGlobalArrays = ZVal.newArray();

    public Object superGlobalVariables = ZVal.newArray();

    public Object staticAttributes = ZVal.newArray();

    public Object iniSettings = ZVal.newArray();

    public Object includedFiles = ZVal.newArray();

    public Object constants = ZVal.newArray();

    public Object functions = ZVal.newArray();

    public Object interfaces = ZVal.newArray();

    public Object classes = ZVal.newArray();

    public Object traits = ZVal.newArray();

    public Snapshot(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Snapshot.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blacklist",
        typeHint = "SebastianBergmann\\GlobalState\\Blacklist",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "includeGlobalVariables",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "includeStaticAttributes",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "includeConstants",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "includeFunctions",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "includeClasses",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "includeInterfaces",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "includeTraits",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "includeIniSettings",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 9,
        name = "includeIncludedFiles",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object blacklist = assignParameter(args, 0, null);
        if (ZVal.isNull(blacklist)) {
            blacklist = ZVal.getNull();
        }
        Object includeGlobalVariables = assignParameter(args, 1, null);
        if (ZVal.isNull(includeGlobalVariables)) {
            includeGlobalVariables = true;
        }
        Object includeStaticAttributes = assignParameter(args, 2, null);
        if (ZVal.isNull(includeStaticAttributes)) {
            includeStaticAttributes = true;
        }
        Object includeConstants = assignParameter(args, 3, null);
        if (ZVal.isNull(includeConstants)) {
            includeConstants = true;
        }
        Object includeFunctions = assignParameter(args, 4, null);
        if (ZVal.isNull(includeFunctions)) {
            includeFunctions = true;
        }
        Object includeClasses = assignParameter(args, 5, null);
        if (ZVal.isNull(includeClasses)) {
            includeClasses = true;
        }
        Object includeInterfaces = assignParameter(args, 6, null);
        if (ZVal.isNull(includeInterfaces)) {
            includeInterfaces = true;
        }
        Object includeTraits = assignParameter(args, 7, null);
        if (ZVal.isNull(includeTraits)) {
            includeTraits = true;
        }
        Object includeIniSettings = assignParameter(args, 8, null);
        if (ZVal.isNull(includeIniSettings)) {
            includeIniSettings = true;
        }
        Object includeIncludedFiles = assignParameter(args, 9, null);
        if (ZVal.isNull(includeIncludedFiles)) {
            includeIncludedFiles = true;
        }
        if (ZVal.strictEqualityCheck(blacklist, "===", ZVal.getNull())) {
            blacklist = new Blacklist(env);
        }

        toObjectR(this).accessProp(this, env).name("blacklist").set(blacklist);
        if (ZVal.isTrue(includeConstants)) {
            env.callMethod(this, "snapshotConstants", Snapshot.class);
        }

        if (ZVal.isTrue(includeFunctions)) {
            env.callMethod(this, "snapshotFunctions", Snapshot.class);
        }

        if (ZVal.toBool(includeClasses) || ZVal.toBool(includeStaticAttributes)) {
            env.callMethod(this, "snapshotClasses", Snapshot.class);
        }

        if (ZVal.isTrue(includeInterfaces)) {
            env.callMethod(this, "snapshotInterfaces", Snapshot.class);
        }

        if (ZVal.isTrue(includeGlobalVariables)) {
            env.callMethod(this, "setupSuperGlobalArrays", Snapshot.class);
            env.callMethod(this, "snapshotGlobals", Snapshot.class);
        }

        if (ZVal.isTrue(includeStaticAttributes)) {
            env.callMethod(this, "snapshotStaticAttributes", Snapshot.class);
        }

        if (ZVal.isTrue(includeIniSettings)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("iniSettings")
                    .set(NamespaceGlobal.ini_get_all.env(env).call(ZVal.getNull(), false).value());
        }

        if (ZVal.isTrue(includeIncludedFiles)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("includedFiles")
                    .set(NamespaceGlobal.get_included_files.env(env).call().value());
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("traits")
                .set(NamespaceGlobal.get_declared_traits.env(env).call().value());
        return null;
    }

    @ConvertedMethod
    public Object blacklist(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("blacklist").value());
    }

    @ConvertedMethod
    public Object globalVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("globalVariables").value());
    }

    @ConvertedMethod
    public Object superGlobalVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("superGlobalVariables").value());
    }

    @ConvertedMethod
    public Object superGlobalArrays(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("superGlobalArrays").value());
    }

    @ConvertedMethod
    public Object staticAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("staticAttributes").value());
    }

    @ConvertedMethod
    public Object iniSettings(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("iniSettings").value());
    }

    @ConvertedMethod
    public Object includedFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("includedFiles").value());
    }

    @ConvertedMethod
    public Object constants(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("constants").value());
    }

    @ConvertedMethod
    public Object functions(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("functions").value());
    }

    @ConvertedMethod
    public Object interfaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("interfaces").value());
    }

    @ConvertedMethod
    public Object classes(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("classes").value());
    }

    @ConvertedMethod
    public Object traits(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("traits").value());
    }

    @ConvertedMethod
    private Object snapshotConstants(RuntimeEnv env, Object... args) {
        Object constants = ZVal.newArray();
        constants = NamespaceGlobal.get_defined_constants.env(env).call(true).value();
        if (ZVal.isset(ZVal.getElement(constants, "user"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("constants")
                    .set(ZVal.getElement(constants, "user"));
        }

        return null;
    }

    @ConvertedMethod
    private Object snapshotFunctions(RuntimeEnv env, Object... args) {
        Object functions = ZVal.newArray();
        functions = NamespaceGlobal.get_defined_functions.env(env).call().value();
        toObjectR(this)
                .accessProp(this, env)
                .name("functions")
                .set(ZVal.getElement(functions, "user"));
        return null;
    }

    @ConvertedMethod
    private Object snapshotClasses(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object className = null;
        Object _pClass = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult476 :
                ZVal.getIterable(
                        CRArrayF.array_reverse
                                .env(env)
                                .call(function_get_declared_classes.f.env(env).call().value())
                                .value(),
                        env,
                        true)) {
            className = ZVal.assign(zpairResult476.getValue());
            _pClass = new ReflectionClass(env, className);
            if (!ZVal.isTrue(env.callMethod(_pClass, "isUserDefined", Snapshot.class))) {
                break;
            }

            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("classes").value(), className);
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("classes")
                .set(
                        CRArrayF.array_reverse
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("classes").value())
                                .value());
        return null;
    }

    @ConvertedMethod
    private Object snapshotInterfaces(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object interfaceName = null;
        Object _pClass = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult477 :
                ZVal.getIterable(
                        CRArrayF.array_reverse
                                .env(env)
                                .call(
                                        NamespaceGlobal.get_declared_interfaces
                                                .env(env)
                                                .call()
                                                .value())
                                .value(),
                        env,
                        true)) {
            interfaceName = ZVal.assign(zpairResult477.getValue());
            _pClass = new ReflectionClass(env, interfaceName);
            if (!ZVal.isTrue(env.callMethod(_pClass, "isUserDefined", Snapshot.class))) {
                break;
            }

            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("interfaces").value(),
                    interfaceName);
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("interfaces")
                .set(
                        CRArrayF.array_reverse
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("interfaces")
                                                .value())
                                .value());
        return null;
    }

    @ConvertedMethod
    private Object snapshotGlobals(RuntimeEnv env, Object... args) {
        Object GLOBALS = env.getGlobal("GLOBALS");
        Object superGlobalArray = null;
        Object superGlobalArrays = null;
        Object key = null;
        superGlobalArrays = env.callMethod(this, "superGlobalArrays", Snapshot.class);
        for (ZPair zpairResult478 : ZVal.getIterable(superGlobalArrays, env, true)) {
            superGlobalArray = ZVal.assign(zpairResult478.getValue());
            env.callMethod(this, "snapshotSuperGlobalArray", Snapshot.class, superGlobalArray);
        }

        for (ZPair zpairResult479 :
                ZVal.getIterable(CRArrayF.array_keys.env(env).call(GLOBALS).value(), env, true)) {
            key = ZVal.assign(zpairResult479.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(ZVal.notEqualityCheck(key, "GLOBALS"))
                                                    && ZVal.toBool(
                                                            !CRArrayF.in_array
                                                                    .env(env)
                                                                    .call(key, superGlobalArrays)
                                                                    .getBool()))
                                    && ZVal.toBool(
                                            env.callMethod(
                                                    this,
                                                    "canBeSerialized",
                                                    Snapshot.class,
                                                    ZVal.getElement(GLOBALS, key))))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("blacklist")
                                                    .value(),
                                            "isGlobalVariableBlacklisted",
                                            Snapshot.class,
                                            key)))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("globalVariables").value(),
                        key,
                        function_unserialize
                                .f
                                .env(env)
                                .call(
                                        function_serialize
                                                .f
                                                .env(env)
                                                .call(ZVal.getElement(GLOBALS, key))
                                                .value())
                                .value());
            }
        }

        return env.returnWithGlobals(null, "GLOBALS", GLOBALS);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "superGlobalArray", typeHint = "string")
    private Object snapshotSuperGlobalArray(RuntimeEnv env, Object... args) {
        Object superGlobalArray = assignParameter(args, 0, null);
        Object GLOBALS = env.getGlobal("GLOBALS");
        Object value = null;
        Object key = null;
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("superGlobalVariables").value(),
                superGlobalArray,
                ZVal.newArray());
        if (ZVal.toBool(ZVal.isset(ZVal.getElement(GLOBALS, superGlobalArray)))
                && ZVal.toBool(
                        function_is_array
                                .f
                                .env(env)
                                .call(ZVal.getElement(GLOBALS, superGlobalArray))
                                .value())) {
            for (ZPair zpairResult480 :
                    ZVal.getIterable(ZVal.getElement(GLOBALS, superGlobalArray), env, false)) {
                key = ZVal.assign(zpairResult480.getKey());
                value = ZVal.assign(zpairResult480.getValue());
                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("superGlobalVariables").value(),
                        function_unserialize
                                .f
                                .env(env)
                                .call(function_serialize.f.env(env).call(value).value())
                                .value(),
                        superGlobalArray,
                        key);
            }
        }

        return env.returnWithGlobals(null, "GLOBALS", GLOBALS);
    }

    @ConvertedMethod
    private Object snapshotStaticAttributes(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object name = null;
        Object className = null;
        Object attribute = null;
        Object _pClass = null;
        Object value = null;
        Object snapshot = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult481 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("classes").value(), env, true)) {
            className = ZVal.assign(zpairResult481.getValue());
            _pClass = new ReflectionClass(env, className);
            snapshot = ZVal.newArray();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult482 :
                    ZVal.getIterable(
                            env.callMethod(_pClass, "getProperties", Snapshot.class), env, true)) {
                attribute = ZVal.assign(zpairResult482.getValue());
                if (ZVal.isTrue(env.callMethod(attribute, "isStatic", Snapshot.class))) {
                    name = env.callMethod(attribute, "getName", Snapshot.class);
                    if (ZVal.isTrue(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("blacklist").value(),
                                    "isStaticAttributeBlacklisted",
                                    Snapshot.class,
                                    className,
                                    name))) {
                        continue;
                    }

                    env.callMethod(attribute, "setAccessible", Snapshot.class, true);
                    value = env.callMethod(attribute, "getValue", Snapshot.class);
                    if (ZVal.isTrue(
                            env.callMethod(this, "canBeSerialized", Snapshot.class, value))) {
                        ZVal.putArrayElement(
                                snapshot,
                                name,
                                function_unserialize
                                        .f
                                        .env(env)
                                        .call(function_serialize.f.env(env).call(value).value())
                                        .value());
                    }
                }
            }

            if (!ZVal.isEmpty(snapshot)) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("staticAttributes").value(),
                        className,
                        snapshot);
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object setupSuperGlobalArrays(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("superGlobalArrays")
                .set(
                        ZVal.newArray(
                                new ZPair(0, "_ENV"),
                                new ZPair(1, "_POST"),
                                new ZPair(2, "_GET"),
                                new ZPair(3, "_COOKIE"),
                                new ZPair(4, "_SERVER"),
                                new ZPair(5, "_FILES"),
                                new ZPair(6, "_REQUEST")));
        if (ZVal.equalityCheck(
                NamespaceGlobal.ini_get.env(env).call("register_long_arrays").value(), "1")) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("superGlobalArrays")
                    .set(
                            CRArrayF.array_merge
                                    .env(env)
                                    .call(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("superGlobalArrays")
                                                    .value(),
                                            ZVal.newArray(
                                                    new ZPair(0, "HTTP_ENV_VARS"),
                                                    new ZPair(1, "HTTP_POST_VARS"),
                                                    new ZPair(2, "HTTP_GET_VARS"),
                                                    new ZPair(3, "HTTP_COOKIE_VARS"),
                                                    new ZPair(4, "HTTP_SERVER_VARS"),
                                                    new ZPair(5, "HTTP_POST_FILES")))
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variable")
    private Object canBeSerialized(RuntimeEnv env, Object... args) {
        Object variable = assignParameter(args, 0, null);
        Object _pClass = null;
        if (!function_is_object.f.env(env).call(variable).getBool()) {
            return ZVal.assign(!NamespaceGlobal.is_resource.env(env).call(variable).getBool());
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(variable, stdClass.class, "stdClass"))) {
            return ZVal.assign(true);
        }

        _pClass = new ReflectionClass(env, variable);
        do {
            if (ZVal.isTrue(env.callMethod(_pClass, "isInternal", Snapshot.class))) {
                return ZVal.assign(
                        ZVal.checkInstanceType(variable, Serializable.class, "Serializable"));
            }

        } while (ZVal.isTrue(_pClass = env.callMethod(_pClass, "getParentClass", Snapshot.class)));

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "SebastianBergmann\\GlobalState\\Snapshot";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\GlobalState\\Snapshot")
                    .setLookup(Snapshot.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "blacklist",
                            "classes",
                            "constants",
                            "functions",
                            "globalVariables",
                            "includedFiles",
                            "iniSettings",
                            "interfaces",
                            "staticAttributes",
                            "superGlobalArrays",
                            "superGlobalVariables",
                            "traits")
                    .setFilename("vendor/sebastian/global-state/src/Snapshot.php")
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
