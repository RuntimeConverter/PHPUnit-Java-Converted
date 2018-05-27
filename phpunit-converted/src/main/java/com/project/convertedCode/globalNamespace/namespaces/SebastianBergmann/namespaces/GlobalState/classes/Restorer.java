package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Snapshot;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.RuntimeException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/global-state/src/Restorer.php

*/

public class Restorer extends RuntimeClassBase {

    public Restorer(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object restoreFunctions(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, null);
        Object functions = ZVal.newArray();
        Object function = null;
        if (!NamespaceGlobal.function_exists.env(env).call("uopz_delete").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "The uopz_delete() function is required for this operation"));
        }

        functions = NamespaceGlobal.get_defined_functions.env(env).call().value();
        for (ZPair zpairResult468 :
                ZVal.getIterable(
                        CRArrayF.array_diff
                                .env(env)
                                .call(
                                        ZVal.getElement(functions, "user"),
                                        env.callMethod(snapshot, "functions", Restorer.class))
                                .value(),
                        env,
                        true)) {
            function = ZVal.assign(zpairResult468.getValue());
            com.runtimeconverter.runtime.ZVal.functionNotFound("uopz_delete")
                    .env(env)
                    .call(function);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object restoreGlobalVariables(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, null);
        Object globalVariables = ZVal.newArray();
        Object GLOBALS = env.getGlobal("GLOBALS");
        Object superGlobalArray = null;
        Object superGlobalArrays = null;
        Object key = null;
        superGlobalArrays = env.callMethod(snapshot, "superGlobalArrays", Restorer.class);
        for (ZPair zpairResult469 : ZVal.getIterable(superGlobalArrays, env, true)) {
            superGlobalArray = ZVal.assign(zpairResult469.getValue());
            env.callMethod(
                    this, "restoreSuperGlobalArray", Restorer.class, snapshot, superGlobalArray);
        }

        globalVariables = env.callMethod(snapshot, "globalVariables", Restorer.class);
        for (ZPair zpairResult470 :
                ZVal.getIterable(CRArrayF.array_keys.env(env).call(GLOBALS).value(), env, true)) {
            key = ZVal.assign(zpairResult470.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.notEqualityCheck(key, "GLOBALS"))
                                    && ZVal.toBool(
                                            !CRArrayF.in_array
                                                    .env(env)
                                                    .call(key, superGlobalArrays)
                                                    .getBool()))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            env.callMethod(snapshot, "blacklist", Restorer.class),
                                            "isGlobalVariableBlacklisted",
                                            Restorer.class,
                                            key)))) {
                if (CRArrayF.array_key_exists.env(env).call(key, globalVariables).getBool()) {
                    ZVal.putArrayElement(GLOBALS, key, ZVal.getElement(globalVariables, key));

                } else {
                    ZVal.unsetArrayElement(GLOBALS, key);
                }
            }
        }

        return env.returnWithGlobals(null, "GLOBALS", GLOBALS);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object restoreStaticAttributes(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object snapshot = assignParameter(args, 0, null);
        Object current = null;
        Object newClasses = null;
        Object defaults = ZVal.newArray();
        Object reflector = null;
        Object name = null;
        Object className = null;
        Object attribute = null;
        Object value = null;
        Object staticAttributes = null;
        Object _pClass = null;
        current =
                new Snapshot(
                        env,
                        env.callMethod(snapshot, "blacklist", Restorer.class),
                        false,
                        false,
                        false,
                        false,
                        true,
                        false,
                        false,
                        false,
                        false);
        newClasses =
                CRArrayF.array_diff
                        .env(env)
                        .call(
                                env.callMethod(current, "classes", Restorer.class),
                                env.callMethod(snapshot, "classes", Restorer.class))
                        .value();
        current = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult471 :
                ZVal.getIterable(
                        env.callMethod(snapshot, "staticAttributes", Restorer.class), env, false)) {
            className = ZVal.assign(zpairResult471.getKey());
            staticAttributes = ZVal.assign(zpairResult471.getValue());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult472 : ZVal.getIterable(staticAttributes, env, false)) {
                name = ZVal.assign(zpairResult472.getKey());
                value = ZVal.assign(zpairResult472.getValue());
                reflector = new ReflectionProperty(env, className, name);
                env.callMethod(reflector, "setAccessible", Restorer.class, true);
                env.callMethod(reflector, "setValue", Restorer.class, value);
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult473 : ZVal.getIterable(newClasses, env, true)) {
            className = ZVal.assign(zpairResult473.getValue());
            _pClass = new ReflectionClass(env, className);
            defaults = env.callMethod(_pClass, "getDefaultProperties", Restorer.class);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult474 :
                    ZVal.getIterable(
                            env.callMethod(_pClass, "getProperties", Restorer.class), env, true)) {
                attribute = ZVal.assign(zpairResult474.getValue());
                if (!ZVal.isTrue(env.callMethod(attribute, "isStatic", Restorer.class))) {
                    continue;
                }

                name = env.callMethod(attribute, "getName", Restorer.class);
                if (ZVal.isTrue(
                        env.callMethod(
                                env.callMethod(snapshot, "blacklist", Restorer.class),
                                "isStaticAttributeBlacklisted",
                                Restorer.class,
                                className,
                                name))) {
                    continue;
                }

                if (!ZVal.isset(ZVal.getElement(defaults, name))) {
                    continue;
                }

                env.callMethod(attribute, "setAccessible", Restorer.class, true);
                env.callMethod(
                        attribute, "setValue", Restorer.class, ZVal.getElement(defaults, name));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    @ConvertedParameter(index = 1, name = "superGlobalArray", typeHint = "string")
    private Object restoreSuperGlobalArray(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, null);
        Object superGlobalArray = assignParameter(args, 1, null);
        Object GLOBALS = env.getGlobal("GLOBALS");
        Object keys = null;
        Object key = null;
        Object superGlobalVariables = ZVal.newArray();
        superGlobalVariables = env.callMethod(snapshot, "superGlobalVariables", Restorer.class);
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.isset(ZVal.getElement(GLOBALS, superGlobalArray)))
                                && ZVal.toBool(
                                        function_is_array
                                                .f
                                                .env(env)
                                                .call(ZVal.getElement(GLOBALS, superGlobalArray))
                                                .value()))
                && ZVal.toBool(
                        ZVal.isset(ZVal.getElement(superGlobalVariables, superGlobalArray)))) {
            keys =
                    CRArrayF.array_keys
                            .env(env)
                            .call(
                                    CRArrayF.array_merge
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(GLOBALS, superGlobalArray),
                                                    ZVal.getElement(
                                                            superGlobalVariables, superGlobalArray))
                                            .value())
                            .value();
            for (ZPair zpairResult475 : ZVal.getIterable(keys, env, true)) {
                key = ZVal.assign(zpairResult475.getValue());
                if (ZVal.isset(
                        ZVal.getElementRecursive(superGlobalVariables, superGlobalArray, key))) {
                    ZVal.setElementRecursive(
                            GLOBALS,
                            ZVal.getElementRecursive(superGlobalVariables, superGlobalArray, key),
                            superGlobalArray,
                            key);

                } else {
                    ZVal.unsetElementRecursive(GLOBALS, superGlobalArray, key);
                }
            }
        }

        return env.returnWithGlobals(null, "GLOBALS", GLOBALS);
    }

    public static final Object CONST_class = "SebastianBergmann\\GlobalState\\Restorer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\GlobalState\\Restorer")
                    .setLookup(Restorer.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/global-state/src/Restorer.php")
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
