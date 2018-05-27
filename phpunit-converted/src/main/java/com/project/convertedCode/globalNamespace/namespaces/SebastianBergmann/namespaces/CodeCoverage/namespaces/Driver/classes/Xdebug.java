package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.Driver;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Driver/Xdebug.php

*/

public final class Xdebug extends RuntimeClassBase implements Driver {

    public Object cacheNumLines = ZVal.newArray();

    public Xdebug(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Xdebug.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        if (!NamespaceGlobal.extension_loaded.env(env).call("xdebug").getBool()) {
            throw ZVal.getException(env, new RuntimeException(env, "This driver requires Xdebug"));
        }

        if (!NamespaceGlobal.ini_get.env(env).call("xdebug.coverage_enable").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "xdebug.coverage_enable=On has to be set in php.ini"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "determineUnusedAndDead",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object start(RuntimeEnv env, Object... args) {
        Object determineUnusedAndDead = assignParameter(args, 0, null);
        if (ZVal.isNull(determineUnusedAndDead)) {
            determineUnusedAndDead = true;
        }
        if (ZVal.isTrue(determineUnusedAndDead)) {
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:xdebug_start_code_coverage)_(namespace:\\)(source:xdebug_start_code_coverage)______")
                    .env(env)
                    .call(
                            ZVal.toLong(function_constant.f.call(env, "XDEBUG_CC_UNUSED"))
                                    | ZVal.toLong(
                                            function_constant.f.call(env, "XDEBUG_CC_DEAD_CODE")));

        } else {
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:xdebug_start_code_coverage)_(namespace:\\)(source:xdebug_start_code_coverage)______")
                    .env(env)
                    .call();
        }

        return null;
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        Object data = null;
        data =
                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                "___error23423346_namespace_function_not_found__(identifier:xdebug_get_code_coverage)_(namespace:\\)(source:xdebug_get_code_coverage)______")
                        .env(env)
                        .call()
                        .value();
        com.runtimeconverter.runtime.ZVal.functionNotFound(
                        "___error23423346_namespace_function_not_found__(identifier:xdebug_stop_code_coverage)_(namespace:\\)(source:xdebug_stop_code_coverage)______")
                .env(env)
                .call();
        return ZVal.assign(env.callMethod(this, "cleanup", Xdebug.class, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object cleanup(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, null);
        if (ZVal.isNull(data)) {
            data = ZVal.newArray();
        }
        Object file = null;
        Object numLines = null;
        Object line = null;
        for (ZPair zpairResult118 :
                ZVal.getIterable(CRArrayF.array_keys.env(env).call(data).value(), env, true)) {
            file = ZVal.assign(zpairResult118.getValue());
            ZVal.unsetElementRecursive(data, file, 0);
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    NamespaceGlobal.strpos
                                            .env(env)
                                            .call(file, "xdebug://debug-eval")
                                            .value(),
                                    "!==",
                                    0))
                    && ZVal.toBool(NamespaceGlobal.file_exists.env(env).call(file).value())) {
                numLines = env.callMethod(this, "getNumberOfLinesInFile", Xdebug.class, file);
                for (ZPair zpairResult119 :
                        ZVal.getIterable(
                                CRArrayF.array_keys
                                        .env(env)
                                        .call(ZVal.getElement(data, file))
                                        .value(),
                                env,
                                true)) {
                    line = ZVal.assign(zpairResult119.getValue());
                    if (ZVal.isGreaterThan(line, '>', numLines)) {
                        ZVal.unsetElementRecursive(data, file, line);
                    }
                }
            }
        }

        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileName", typeHint = "string")
    private Object getNumberOfLinesInFile(RuntimeEnv env, Object... args) {
        Object fileName = assignParameter(args, 0, null);
        Object buffer = null;
        Object lines = null;
        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("cacheNumLines").value(),
                        fileName))) {
            buffer = function_file_get_contents.f.env(env).call(fileName).value();
            lines = NamespaceGlobal.substr_count.env(env).call(buffer, "\n").value();
            if (ZVal.strictNotEqualityCheck(
                    NamespaceGlobal.substr.env(env).call(buffer, -1).value(), "!==", "\n")) {
                lines = ZVal.increment(lines);
            }

            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("cacheNumLines").value(),
                    fileName,
                    lines);
        }

        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("cacheNumLines").value(),
                        fileName));
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Driver\\Xdebug";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Driver\\Xdebug")
                    .setLookup(Xdebug.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("cacheNumLines")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Driver/Xdebug.php")
                    .addInterface("Driver")
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
