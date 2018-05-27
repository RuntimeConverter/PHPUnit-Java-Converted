package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Blacklist;
import com.runtimeconverter.runtime.modules.standard.serialization.function_serialize;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/GlobalState.php

*/

public final class GlobalState extends RuntimeClassBase {

    public GlobalState(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_SUPER_GLOBAL_ARRAYS =
            ZVal.newArray(
                    new ZPair(0, "_ENV"),
                    new ZPair(1, "_POST"),
                    new ZPair(2, "_GET"),
                    new ZPair(3, "_COOKIE"),
                    new ZPair(4, "_SERVER"),
                    new ZPair(5, "_FILES"),
                    new ZPair(6, "_REQUEST"));

    public static final Object CONST_class = "PHPUnit\\Util\\GlobalState";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        public Object getIncludedFilesAsString(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    runtimeStaticObject.processIncludedFilesAsString(
                            env, NamespaceGlobal.get_included_files.env(env).call().value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "files", typeHint = "array")
        public Object processIncludedFilesAsString(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object files = assignParameter(args, 0, null);
            if (ZVal.isNull(files)) {
                files = ZVal.newArray();
            }
            Object result = null;
            Object GLOBALS = env.getGlobal("GLOBALS");
            Object file = null;
            Object prefix = null;
            Object blacklist = null;
            Object i = null;
            blacklist = new Blacklist(env);
            prefix = false;
            result = "";
            if (function_defined.f.env(env).call("__PHPUNIT_PHAR__").getBool()) {
                prefix =
                        "phar://"
                                + toStringR(function_constant.f.call(env, "__PHPUNIT_PHAR__"), env)
                                + "/";
            }

            runtimeConverterContinueCount = 0;
            for (i = ZVal.subtract(CRArrayF.count.env(env).call(files).value(), 1);
                    ZVal.isGreaterThan(i, '>', 0);
                    i = ZVal.decrement(i)) {
                file = ZVal.assign(ZVal.getElement(files, i));
                if (ZVal.toBool(
                                !ZVal.isEmpty(
                                        ZVal.getElement(GLOBALS, "__PHPUNIT_ISOLATION_BLACKLIST")))
                        && ZVal.toBool(
                                CRArrayF.in_array
                                        .env(env)
                                        .call(
                                                file,
                                                ZVal.getElement(
                                                        GLOBALS, "__PHPUNIT_ISOLATION_BLACKLIST"))
                                        .value())) {
                    continue;
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(prefix, "!==", false))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.strpos.env(env).call(file, prefix).value(),
                                        "===",
                                        0))) {
                    continue;
                }

                if (NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call("/^(vfs|phpvfs[a-z0-9]+):/", file)
                        .getBool()) {
                    continue;
                }

                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                blacklist,
                                                "isBlacklisted",
                                                GlobalState.class,
                                                file)))
                        && ZVal.toBool(NamespaceGlobal.is_file.env(env).call(file).value())) {
                    result =
                            "require_once '"
                                    + toStringR(file, env)
                                    + "';\n"
                                    + toStringR(result, env);
                }
            }

            return env.returnWithGlobals(result, "GLOBALS", GLOBALS);
        }

        @ConvertedMethod
        public Object getIniSettingsAsString(RuntimeEnv env, Object... args) {
            Object result = null;
            Object iniSettings = null;
            Object value = null;
            Object key = null;
            result = "";
            iniSettings = NamespaceGlobal.ini_get_all.env(env).call(ZVal.getNull(), false).value();
            for (ZPair zpairResult383 : ZVal.getIterable(iniSettings, env, false)) {
                key = ZVal.assign(zpairResult383.getKey());
                value = ZVal.assign(zpairResult383.getValue());
                result =
                        toStringR(result, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "@ini_set(%s, %s);" + "\n",
                                                        runtimeStaticObject.exportVariable(
                                                                env, key),
                                                        runtimeStaticObject.exportVariable(
                                                                env, value))
                                                .value(),
                                        env);
            }

            return ZVal.assign(result);
        }

        @ConvertedMethod
        public Object getConstantsAsString(RuntimeEnv env, Object... args) {
            Object result = null;
            Object name = null;
            Object constants = ZVal.newArray();
            Object value = null;
            constants = NamespaceGlobal.get_defined_constants.env(env).call(true).value();
            result = "";
            if (ZVal.isset(ZVal.getElement(constants, "user"))) {
                for (ZPair zpairResult384 :
                        ZVal.getIterable(ZVal.getElement(constants, "user"), env, false)) {
                    name = ZVal.assign(zpairResult384.getKey());
                    value = ZVal.assign(zpairResult384.getValue());
                    result =
                            toStringR(result, env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "if (!defined('%s')) define('%s', %s);"
                                                                    + "\n",
                                                            name,
                                                            name,
                                                            runtimeStaticObject.exportVariable(
                                                                    env, value))
                                                    .value(),
                                            env);
                }
            }

            return ZVal.assign(result);
        }

        @ConvertedMethod
        public Object getGlobalsAsString(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object result = null;
            Object GLOBALS = env.getGlobal("GLOBALS");
            Object superGlobalArray = null;
            Object blacklist = ZVal.newArray();
            Object key = null;
            result = "";
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult385 : ZVal.getIterable(CONST_SUPER_GLOBAL_ARRAYS, env, true)) {
                superGlobalArray = ZVal.assign(zpairResult385.getValue());
                if (ZVal.toBool(ZVal.isset(ZVal.getElement(GLOBALS, superGlobalArray)))
                        && ZVal.toBool(
                                function_is_array
                                        .f
                                        .env(env)
                                        .call(ZVal.getElement(GLOBALS, superGlobalArray))
                                        .value())) {
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult386 :
                            ZVal.getIterable(
                                    CRArrayF.array_keys
                                            .env(env)
                                            .call(ZVal.getElement(GLOBALS, superGlobalArray))
                                            .value(),
                                    env,
                                    true)) {
                        key = ZVal.assign(zpairResult386.getValue());
                        if (ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        ZVal.getElementRecursive(GLOBALS, superGlobalArray, key),
                                        Closure.class,
                                        "Closure"))) {
                            continue;
                        }

                        result =
                                toStringR(result, env)
                                        + toStringR(
                                                NamespaceGlobal.sprintf
                                                        .env(env)
                                                        .call(
                                                                "$GLOBALS['%s']['%s'] = %s;" + "\n",
                                                                superGlobalArray,
                                                                key,
                                                                runtimeStaticObject.exportVariable(
                                                                        env,
                                                                        ZVal.getElementRecursive(
                                                                                GLOBALS,
                                                                                superGlobalArray,
                                                                                key)))
                                                        .value(),
                                                env);
                    }
                }
            }

            blacklist = ZVal.assign(CONST_SUPER_GLOBAL_ARRAYS);
            ZVal.addToArray(blacklist, "GLOBALS");
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult387 :
                    ZVal.getIterable(
                            CRArrayF.array_keys.env(env).call(GLOBALS).value(), env, true)) {
                key = ZVal.assign(zpairResult387.getValue());
                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                ZVal.getElement(GLOBALS, key),
                                                Closure.class,
                                                "Closure")))
                        && ZVal.toBool(
                                !CRArrayF.in_array.env(env).call(key, blacklist).getBool())) {
                    result =
                            toStringR(result, env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "$GLOBALS['%s'] = %s;" + "\n",
                                                            key,
                                                            runtimeStaticObject.exportVariable(
                                                                    env,
                                                                    ZVal.getElement(GLOBALS, key)))
                                                    .value(),
                                            env);
                }
            }

            return env.returnWithGlobals(result, "GLOBALS", GLOBALS);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "variable")
        private Object exportVariable(RuntimeEnv env, Object... args) {
            Object variable = assignParameter(args, 0, null);
            if (ZVal.toBool(
                            ZVal.toBool(NamespaceGlobal.is_scalar.env(env).call(variable).value())
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    variable, "===", ZVal.getNull())))
                    || ZVal.toBool(
                            ZVal.toBool(function_is_array.f.env(env).call(variable).value())
                                    && ZVal.toBool(
                                            runtimeStaticObject.arrayOnlyContainsScalars(
                                                    env, variable)))) {
                return ZVal.assign(
                        NamespaceGlobal.var_export.env(env).call(variable, true).value());
            }

            return ZVal.assign(
                    "unserialize("
                            + toStringR(
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(
                                                    function_serialize
                                                            .f
                                                            .env(env)
                                                            .call(variable)
                                                            .value(),
                                                    true)
                                            .value(),
                                    env)
                            + ")");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array", typeHint = "array")
        private Object arrayOnlyContainsScalars(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object array = assignParameter(args, 0, null);
            Object result = null;
            Object element = null;
            result = true;
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult388 : ZVal.getIterable(array, env, true)) {
                element = ZVal.assign(zpairResult388.getValue());
                if (function_is_array.f.env(env).call(element).getBool()) {
                    result = runtimeStaticObject.arrayOnlyContainsScalars(env, element);

                } else if (ZVal.toBool(!NamespaceGlobal.is_scalar.env(env).call(element).getBool())
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(element, "!==", ZVal.getNull()))) {
                    result = false;
                }

                if (ZVal.strictEqualityCheck(result, "===", false)) {
                    break;
                }
            }

            return ZVal.assign(result);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\GlobalState")
                    .setLookup(GlobalState.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/GlobalState.php")
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
