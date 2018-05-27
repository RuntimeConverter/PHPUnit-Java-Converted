package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.File_Iterator_Facade;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Filter.php

*/

public final class Filter extends RuntimeClassBase {

    public Object whitelistedFiles = ZVal.newArray();

    public Filter(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suffix", typeHint = "string")
    @ConvertedParameter(index = 2, name = "prefix", typeHint = "string")
    public Object addDirectoryToWhitelist(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, null);
        Object suffix = assignParameter(args, 1, null);
        if (ZVal.isNull(suffix)) {
            suffix = ".php";
        }
        Object prefix = assignParameter(args, 2, null);
        if (ZVal.isNull(prefix)) {
            prefix = "";
        }
        Object file = null;
        Object facade = null;
        Object files = null;
        facade = new File_Iterator_Facade(env);
        files = env.callMethod(facade, "getFilesAsArray", Filter.class, directory, suffix, prefix);
        for (ZPair zpairResult121 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult121.getValue());
            env.callMethod(this, "addFileToWhitelist", Filter.class, file);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object addFileToWhitelist(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("whitelistedFiles").value(),
                NamespaceGlobal.realpath.env(env).call(filename).value(),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    public Object addFilesToWhitelist(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, null);
        Object file = null;
        for (ZPair zpairResult122 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult122.getValue());
            env.callMethod(this, "addFileToWhitelist", Filter.class, file);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suffix", typeHint = "string")
    @ConvertedParameter(index = 2, name = "prefix", typeHint = "string")
    public Object removeDirectoryFromWhitelist(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, null);
        Object suffix = assignParameter(args, 1, null);
        if (ZVal.isNull(suffix)) {
            suffix = ".php";
        }
        Object prefix = assignParameter(args, 2, null);
        if (ZVal.isNull(prefix)) {
            prefix = "";
        }
        Object file = null;
        Object facade = null;
        Object files = null;
        facade = new File_Iterator_Facade(env);
        files = env.callMethod(facade, "getFilesAsArray", Filter.class, directory, suffix, prefix);
        for (ZPair zpairResult123 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult123.getValue());
            env.callMethod(this, "removeFileFromWhitelist", Filter.class, file);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object removeFileFromWhitelist(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        filename = NamespaceGlobal.realpath.env(env).call(filename).value();
        ZVal.unsetArrayElement(
                toObjectR(this).accessProp(this, env).name("whitelistedFiles").value(), filename);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object isFile(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.toBool(
                                                                                        ZVal.toBool(
                                                                                                        ZVal
                                                                                                                        .toBool(
                                                                                                                                ZVal
                                                                                                                                        .strictEqualityCheck(
                                                                                                                                                filename,
                                                                                                                                                "===",
                                                                                                                                                "-"))
                                                                                                                || ZVal
                                                                                                                        .toBool(
                                                                                                                                ZVal
                                                                                                                                        .strictEqualityCheck(
                                                                                                                                                NamespaceGlobal
                                                                                                                                                        .strpos
                                                                                                                                                        .env(
                                                                                                                                                                env)
                                                                                                                                                        .call(
                                                                                                                                                                filename,
                                                                                                                                                                "vfs://")
                                                                                                                                                        .value(),
                                                                                                                                                "===",
                                                                                                                                                0)))
                                                                                                || ZVal
                                                                                                        .toBool(
                                                                                                                ZVal
                                                                                                                        .strictNotEqualityCheck(
                                                                                                                                NamespaceGlobal
                                                                                                                                        .strpos
                                                                                                                                        .env(
                                                                                                                                                env)
                                                                                                                                        .call(
                                                                                                                                                filename,
                                                                                                                                                "xdebug://debug-eval")
                                                                                                                                        .value(),
                                                                                                                                "!==",
                                                                                                                                false)))
                                                                                || ZVal.toBool(
                                                                                        ZVal
                                                                                                .strictNotEqualityCheck(
                                                                                                        NamespaceGlobal
                                                                                                                .strpos
                                                                                                                .env(
                                                                                                                        env)
                                                                                                                .call(
                                                                                                                        filename,
                                                                                                                        "eval()'d code")
                                                                                                                .value(),
                                                                                                        "!==",
                                                                                                        false)))
                                                                || ZVal.toBool(
                                                                        ZVal.strictNotEqualityCheck(
                                                                                NamespaceGlobal
                                                                                        .strpos
                                                                                        .env(env)
                                                                                        .call(
                                                                                                filename,
                                                                                                "runtime-created function")
                                                                                        .value(),
                                                                                "!==",
                                                                                false)))
                                                || ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                NamespaceGlobal.strpos
                                                                        .env(env)
                                                                        .call(
                                                                                filename,
                                                                                "runkit created function")
                                                                        .value(),
                                                                "!==",
                                                                false)))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                NamespaceGlobal.strpos
                                                        .env(env)
                                                        .call(filename, "assert code")
                                                        .value(),
                                                "!==",
                                                false)))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                NamespaceGlobal.strpos
                                        .env(env)
                                        .call(filename, "regexp code")
                                        .value(),
                                "!==",
                                false))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(NamespaceGlobal.file_exists.env(env).call(filename).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object isFiltered(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        if (!ZVal.isTrue(env.callMethod(this, "isFile", Filter.class, filename))) {
            return ZVal.assign(true);
        }

        filename = NamespaceGlobal.realpath.env(env).call(filename).value();
        return ZVal.assign(
                !ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("whitelistedFiles")
                                        .value(),
                                filename)));
    }

    @ConvertedMethod
    public Object getWhitelist(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.array_keys
                        .env(env)
                        .call(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("whitelistedFiles")
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object hasWhitelist(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                !ZVal.isEmpty(
                        toObjectR(this).accessProp(this, env).name("whitelistedFiles").value()));
    }

    @ConvertedMethod
    public Object getWhitelistedFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("whitelistedFiles").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whitelistedFiles", typeHint = "array")
    public Object setWhitelistedFiles(RuntimeEnv env, Object... args) {
        Object whitelistedFiles = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("whitelistedFiles").set(whitelistedFiles);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Filter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Filter")
                    .setLookup(Filter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("whitelistedFiles")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Filter.php")
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
