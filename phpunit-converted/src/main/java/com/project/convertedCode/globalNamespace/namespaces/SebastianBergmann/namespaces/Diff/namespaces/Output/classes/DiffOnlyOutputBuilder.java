package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.DiffOutputBuilderInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Output/DiffOnlyOutputBuilder.php

*/

public final class DiffOnlyOutputBuilder extends RuntimeClassBase
        implements DiffOutputBuilderInterface {

    public Object header = null;

    public DiffOnlyOutputBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DiffOnlyOutputBuilder.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, null);
        if (ZVal.isNull(header)) {
            header = "--- Original\n+++ New\n";
        }
        toObjectR(this).accessProp(this, env).name("header").set(header);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    public Object getDiff(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object diff = assignParameter(args, 0, null);
        Object lc = null;
        Object buffer = null;
        Object diffEntry = ZVal.newArray();
        buffer = NamespaceGlobal.fopen.env(env).call("php://memory", "r+b").value();
        if (ZVal.strictNotEqualityCheck(
                "", "!==", toObjectR(this).accessProp(this, env).name("header").value())) {
            NamespaceGlobal.fwrite
                    .env(env)
                    .call(buffer, toObjectR(this).accessProp(this, env).name("header").value());
            if (ZVal.strictNotEqualityCheck(
                    "\n",
                    "!==",
                    NamespaceGlobal.substr
                            .env(env)
                            .call(
                                    toObjectR(this).accessProp(this, env).name("header").value(),
                                    -1,
                                    1)
                            .value())) {
                NamespaceGlobal.fwrite.env(env).call(buffer, "\n");
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult449 : ZVal.getIterable(diff, env, true)) {
            diffEntry = ZVal.assign(zpairResult449.getValue());
            if (ZVal.strictEqualityCheck(
                    ZVal.getElement(diffEntry, 1), "===", Differ.CONST_ADDED)) {
                NamespaceGlobal.fwrite
                        .env(env)
                        .call(buffer, "+" + toStringR(ZVal.getElement(diffEntry, 0), env));

            } else if (ZVal.strictEqualityCheck(
                    ZVal.getElement(diffEntry, 1), "===", Differ.CONST_REMOVED)) {
                NamespaceGlobal.fwrite
                        .env(env)
                        .call(buffer, "-" + toStringR(ZVal.getElement(diffEntry, 0), env));

            } else if (ZVal.strictEqualityCheck(
                    ZVal.getElement(diffEntry, 1), "===", Differ.CONST_DIFF_LINE_END_WARNING)) {
                NamespaceGlobal.fwrite
                        .env(env)
                        .call(buffer, " " + toStringR(ZVal.getElement(diffEntry, 0), env));
                continue;

            } else {
                continue;
            }

            lc = NamespaceGlobal.substr.env(env).call(ZVal.getElement(diffEntry, 0), -1).value();
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(lc, "!==", "\n"))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(lc, "!==", "\r"))) {
                NamespaceGlobal.fwrite.env(env).call(buffer, "\n");
            }
        }

        diff = NamespaceGlobal.stream_get_contents.env(env).call(buffer, -1, 0).value();
        NamespaceGlobal.fclose.env(env).call(buffer);
        return ZVal.assign(diff);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\DiffOnlyOutputBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Output\\DiffOnlyOutputBuilder")
                    .setLookup(DiffOnlyOutputBuilder.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("header")
                    .setFilename("vendor/sebastian/diff/src/Output/DiffOnlyOutputBuilder.php")
                    .addInterface("DiffOutputBuilderInterface")
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
