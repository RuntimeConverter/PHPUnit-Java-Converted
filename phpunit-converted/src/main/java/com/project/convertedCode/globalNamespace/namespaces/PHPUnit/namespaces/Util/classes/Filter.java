package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SyntheticError;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Blacklist;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Filter.php

*/

public final class Filter extends RuntimeClassBase {

    public Filter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Filter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
        public Object getFilteredStacktrace(RuntimeEnv env, Object... args) {
            Object t = assignParameter(args, 0, null);
            Object eFile = null;
            Object GLOBALS = env.getGlobal("GLOBALS");
            Object prefix = null;
            Object filteredStacktrace = null;
            Object blacklist = null;
            Object eLine = null;
            Object script = null;
            Object eTrace = null;
            Object frame = ZVal.newArray();
            prefix = false;
            script =
                    NamespaceGlobal.realpath
                            .env(env)
                            .call(ZVal.getElementRecursive(GLOBALS, "_SERVER", "SCRIPT_NAME"))
                            .value();
            if (function_defined.f.env(env).call("__PHPUNIT_PHAR_ROOT__").getBool()) {
                prefix = function_constant.f.call(env, "__PHPUNIT_PHAR_ROOT__");
            }

            filteredStacktrace = "";
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            t, SyntheticError.class, "PHPUnit\\Framework\\SyntheticError"))) {
                eTrace = env.callMethod(t, "getSyntheticTrace", Filter.class);
                eFile = env.callMethod(t, "getSyntheticFile", Filter.class);
                eLine = env.callMethod(t, "getSyntheticLine", Filter.class);

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(t, Exception.class, "PHPUnit\\Framework\\Exception"))) {
                eTrace = env.callMethod(t, "getSerializableTrace", Filter.class);
                eFile = env.callMethod(t, "getFile", Filter.class);
                eLine = env.callMethod(t, "getLine", Filter.class);

            } else {
                if (ZVal.isTrue(env.callMethod(t, "getPrevious", Filter.class))) {
                    t = env.callMethod(t, "getPrevious", Filter.class);
                }

                eTrace = env.callMethod(t, "getTrace", Filter.class);
                eFile = env.callMethod(t, "getFile", Filter.class);
                eLine = env.callMethod(t, "getLine", Filter.class);
            }

            if (!ZVal.isTrue(runtimeStaticObject.frameExists(env, eTrace, eFile, eLine))) {
                CRArrayF.array_unshift
                        .env(env)
                        .call(
                                eTrace,
                                ZVal.newArray(new ZPair("file", eFile), new ZPair("line", eLine)));
            }

            blacklist = new Blacklist(env);
            for (ZPair zpairResult381 : ZVal.getIterable(eTrace, env, true)) {
                frame = ZVal.assign(zpairResult381.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.isset(
                                                                                        ZVal
                                                                                                .getElement(
                                                                                                        frame,
                                                                                                        "file")))
                                                                        && ZVal.toBool(
                                                                                NamespaceGlobal
                                                                                        .is_file
                                                                                        .env(env)
                                                                                        .call(
                                                                                                ZVal
                                                                                                        .getElement(
                                                                                                                frame,
                                                                                                                "file"))
                                                                                        .value()))
                                                        && ZVal.toBool(
                                                                !ZVal.isTrue(
                                                                        env.callMethod(
                                                                                blacklist,
                                                                                "isBlacklisted",
                                                                                Filter.class,
                                                                                ZVal.getElement(
                                                                                        frame,
                                                                                        "file")))))
                                        && ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        prefix, "===", false))
                                                        || ZVal.toBool(
                                                                ZVal.strictNotEqualityCheck(
                                                                        NamespaceGlobal.strpos
                                                                                .env(env)
                                                                                .call(
                                                                                        ZVal
                                                                                                .getElement(
                                                                                                        frame,
                                                                                                        "file"),
                                                                                        prefix)
                                                                                .value(),
                                                                        "!==",
                                                                        0))))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.getElement(frame, "file"), "!==", script))) {
                    filteredStacktrace =
                            toStringR(filteredStacktrace, env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "%s:%s\n",
                                                            ZVal.getElement(frame, "file"),
                                                            ZVal.isTrue(
                                                                            ZVal.getElement(
                                                                                    frame, "line"))
                                                                    ? ZVal.getElement(frame, "line")
                                                                    : "?")
                                                    .value(),
                                            env);
                }
            }

            return env.returnWithGlobals(filteredStacktrace, "GLOBALS", GLOBALS);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "trace", typeHint = "array")
        @ConvertedParameter(index = 1, name = "file", typeHint = "string")
        @ConvertedParameter(index = 2, name = "line", typeHint = "int")
        private Object frameExists(RuntimeEnv env, Object... args) {
            Object trace = assignParameter(args, 0, null);
            Object file = assignParameter(args, 1, null);
            Object line = assignParameter(args, 2, null);
            Object frame = ZVal.newArray();
            for (ZPair zpairResult382 : ZVal.getIterable(trace, env, true)) {
                frame = ZVal.assign(zpairResult382.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.isset(
                                                                        ZVal.getElement(
                                                                                frame, "file")))
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        ZVal.getElement(
                                                                                frame, "file"),
                                                                        "===",
                                                                        file)))
                                        && ZVal.toBool(ZVal.isset(ZVal.getElement(frame, "line"))))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        ZVal.getElement(frame, "line"), "===", line))) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Filter")
                    .setLookup(Filter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Filter.php")
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
