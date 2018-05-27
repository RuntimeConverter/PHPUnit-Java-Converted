package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/PHP.php

*/

public final class PHP extends RuntimeClassBase {

    public PHP(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    @ConvertedParameter(
        index = 1,
        name = "target",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object process(RuntimeEnv env, Object... args) {
        Object coverage = assignParameter(args, 0, null);
        Object target = assignParameter(args, 1, null);
        if (ZVal.isNull(target)) {
            target = ZVal.getNull();
        }
        Object filter = null;
        Object buffer = null;
        filter = env.callMethod(coverage, new RuntimeArgsWithReferences(), "filter", PHP.class);
        buffer =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "<?php\n$coverage = new SebastianBergmann\\CodeCoverage\\CodeCoverage;\n$coverage->setData(%s);\n$coverage->setTests(%s);\n\n$filter = $coverage->filter();\n$filter->setWhitelistedFiles(%s);\n\nreturn $coverage;",
                                NamespaceGlobal.var_export
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        coverage, "getData", PHP.class, true),
                                                1)
                                        .value(),
                                NamespaceGlobal.var_export
                                        .env(env)
                                        .call(env.callMethod(coverage, "getTests", PHP.class), 1)
                                        .value(),
                                NamespaceGlobal.var_export
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        filter, "getWhitelistedFiles", PHP.class),
                                                1)
                                        .value())
                        .value();
        if (ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull())) {
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.file_put_contents.env(env).call(target, buffer).value(),
                    "===",
                    false)) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Could not write to \"%s", target)
                                        .value()));
            }
        }

        return ZVal.assign(buffer);
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\PHP";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\PHP")
                    .setLookup(PHP.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/PHP.php")
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
