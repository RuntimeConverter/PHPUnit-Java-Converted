package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.Driver;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Driver/PHPDBG.php

*/

public final class PHPDBG extends RuntimeClassBase implements Driver {

    public PHPDBG(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHPDBG.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck("cli", "!==", "phpdbg")) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "This driver requires the PHPDBG SAPI"));
        }

        if (!NamespaceGlobal.function_exists.env(env).call("phpdbg_start_oplog").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "This build of PHPDBG does not support code coverage"));
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
        com.runtimeconverter.runtime.ZVal.functionNotFound(
                        "___error23423346_namespace_function_not_found__(identifier:phpdbg_start_oplog)_(namespace:\\)(source:phpdbg_start_oplog)______")
                .env(env)
                .call();
        return null;
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        ReferenceContainer fetchedLines = new BasicReferenceContainer(null);
        Object lineNo = null;
        Object file = null;
        Object newFiles = null;
        Object dbgData = null;
        Object sourceLines = ZVal.newArray();
        Object lines = null;
        Object numExecuted = null;
        fetchedLines = env.getInlineStatic(1, ZVal.newArray());
        dbgData =
                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                "___error23423346_namespace_function_not_found__(identifier:phpdbg_end_oplog)_(namespace:\\)(source:phpdbg_end_oplog)______")
                        .env(env)
                        .call()
                        .value();
        if (ZVal.equalityCheck(fetchedLines.getObject(), ZVal.newArray())) {
            sourceLines =
                    com.runtimeconverter.runtime.ZVal.functionNotFound(
                                    "___error23423346_namespace_function_not_found__(identifier:phpdbg_get_executable)_(namespace:\\)(source:phpdbg_get_executable)______")
                            .env(env)
                            .call()
                            .value();

        } else {
            newFiles =
                    CRArrayF.array_diff
                            .env(env)
                            .call(
                                    NamespaceGlobal.get_included_files.env(env).call().value(),
                                    CRArrayF.array_keys
                                            .env(env)
                                            .call(fetchedLines.getObject())
                                            .value())
                            .value();
            sourceLines = ZVal.newArray();
            if (ZVal.isTrue(newFiles)) {
                sourceLines =
                        com.runtimeconverter.runtime.ZVal.functionNotFound("phpdbg_get_executable")
                                .env(env)
                                .call(ZVal.newArray(new ZPair("files", newFiles)))
                                .value();
            }
        }

        for (ZPair zpairResult114 : ZVal.getIterable(sourceLines, env, false)) {
            file = ZVal.assign(zpairResult114.getKey());
            lines = ZVal.assign(zpairResult114.getValue());
            for (ZPair zpairResult115 : ZVal.getIterable(lines, env, false)) {
                lineNo = ZVal.assign(zpairResult115.getKey());
                numExecuted = ZVal.assign(zpairResult115.getValue());
                ZVal.setElementRecursive(sourceLines, CONST_LINE_NOT_EXECUTED, file, lineNo);
            }
        }

        fetchedLines.setObject(
                CRArrayF.array_merge.env(env).call(fetchedLines.getObject(), sourceLines).value());
        return ZVal.assign(
                env.callMethod(
                        this,
                        "detectExecutedLines",
                        PHPDBG.class,
                        fetchedLines.getObject(),
                        dbgData));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sourceLines", typeHint = "array")
    @ConvertedParameter(index = 1, name = "dbgData", typeHint = "array")
    private Object detectExecutedLines(RuntimeEnv env, Object... args) {
        Object sourceLines = assignParameter(args, 0, null);
        if (ZVal.isNull(sourceLines)) {
            sourceLines = ZVal.newArray();
        }
        Object dbgData = assignParameter(args, 1, null);
        Object lineNo = null;
        Object file = null;
        Object numExecuted = null;
        Object coveredLines = null;
        for (ZPair zpairResult116 : ZVal.getIterable(dbgData, env, false)) {
            file = ZVal.assign(zpairResult116.getKey());
            coveredLines = ZVal.assign(zpairResult116.getValue());
            for (ZPair zpairResult117 : ZVal.getIterable(coveredLines, env, false)) {
                lineNo = ZVal.assign(zpairResult117.getKey());
                numExecuted = ZVal.assign(zpairResult117.getValue());
                if (ZVal.isset(ZVal.getElementRecursive(sourceLines, file, lineNo))) {
                    ZVal.setElementRecursive(sourceLines, CONST_LINE_EXECUTED, file, lineNo);
                }
            }
        }

        return ZVal.assign(sourceLines);
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Driver\\PHPDBG";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Driver\\PHPDBG")
                    .setLookup(PHPDBG.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Driver/PHPDBG.php")
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
