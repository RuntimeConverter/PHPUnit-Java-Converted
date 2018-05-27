package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.AbstractChunkOutputBuilder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Output/UnifiedDiffOutputBuilder.php

*/

public final class UnifiedDiffOutputBuilder extends AbstractChunkOutputBuilder {

    public Object collapseRanges = true;

    public Object commonLineThreshold = 6;

    public Object contextLines = 3;

    public Object header = null;

    public Object addLineNumbers = null;

    public UnifiedDiffOutputBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnifiedDiffOutputBuilder.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "addLineNumbers",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, null);
        if (ZVal.isNull(header)) {
            header = "--- Original\n+++ New\n";
        }
        Object addLineNumbers = assignParameter(args, 1, null);
        if (ZVal.isNull(addLineNumbers)) {
            addLineNumbers = false;
        }
        toObjectR(this).accessProp(this, env).name("header").set(header);
        toObjectR(this).accessProp(this, env).name("addLineNumbers").set(addLineNumbers);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    public Object getDiff(RuntimeEnv env, Object... args) {
        Object diff = assignParameter(args, 0, null);
        Object last = null;
        Object buffer = null;
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

        if (ZVal.strictNotEqualityCheck(0, "!==", CRArrayF.count.env(env).call(diff).value())) {
            env.callMethod(this, "writeDiffHunks", UnifiedDiffOutputBuilder.class, buffer, diff);
        }

        diff = NamespaceGlobal.stream_get_contents.env(env).call(buffer, -1, 0).value();
        NamespaceGlobal.fclose.env(env).call(buffer);
        last = NamespaceGlobal.substr.env(env).call(diff, -1).value();
        return ZVal.assign(
                ZVal.toBool(ZVal.strictNotEqualityCheck("\n", "!==", last))
                                && ZVal.toBool(ZVal.strictNotEqualityCheck("\r", "!==", last))
                        ? toStringR(diff, env) + "\n"
                        : diff);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    @ConvertedParameter(index = 1, name = "diff", typeHint = "array")
    private Object writeDiffHunks(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object output = assignParameter(args, 0, null);
        Object diff = assignParameter(args, 1, null);
        if (ZVal.isNull(diff)) {
            diff = ZVal.newArray();
        }
        Object contextStartOffset = null;
        Object toStart = null;
        Object i = null;
        Object toRange = null;
        Object entry = ZVal.newArray();
        Object lc = null;
        Object contextEndOffset = null;
        Object upperLimit = null;
        Object toFind = ZVal.newArray();
        Object cutOff = null;
        Object hunkCapture = null;
        Object fromRange = null;
        Object sameCount = null;
        Object fromStart = null;
        upperLimit = CRArrayF.count.env(env).call(diff).value();
        if (ZVal.strictEqualityCheck(
                0, "===", ZVal.getElementRecursive(diff, ZVal.subtract(upperLimit, 1), 1))) {
            lc =
                    NamespaceGlobal.substr
                            .env(env)
                            .call(
                                    ZVal.getElementRecursive(diff, ZVal.subtract(upperLimit, 1), 0),
                                    -1)
                            .value();
            if (ZVal.strictNotEqualityCheck("\n", "!==", lc)) {
                CRArrayF.array_splice
                        .env(env)
                        .call(
                                diff,
                                upperLimit,
                                0,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                ZVal.newArray(
                                                        new ZPair(
                                                                0,
                                                                "\n\\ No newline at end of file\n"),
                                                        new ZPair(
                                                                1,
                                                                Differ
                                                                        .CONST_NO_LINE_END_EOF_WARNING)))));
            }

        } else {
            toFind = ZVal.newArray(new ZPair(1, true), new ZPair(2, true));
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (i = ZVal.subtract(upperLimit, 1);
                    ZVal.isGreaterThanOrEqualTo(i, ">=", 0);
                    i = ZVal.decrement(i)) {
                if (ZVal.isset(ZVal.getElement(toFind, ZVal.getElementRecursive(diff, i, 1)))) {
                    ZVal.unsetArrayElement(toFind, ZVal.getElementRecursive(diff, i, 1));
                    lc =
                            NamespaceGlobal.substr
                                    .env(env)
                                    .call(ZVal.getElementRecursive(diff, i, 0), -1)
                                    .value();
                    if (ZVal.strictNotEqualityCheck("\n", "!==", lc)) {
                        CRArrayF.array_splice
                                .env(env)
                                .call(
                                        diff,
                                        ZVal.add(i, 1),
                                        0,
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        "\n\\ No newline at end of file\n"),
                                                                new ZPair(
                                                                        1,
                                                                        Differ
                                                                                .CONST_NO_LINE_END_EOF_WARNING)))));
                    }

                    if (!CRArrayF.count.env(env).call(toFind).getBool()) {
                        break;
                    }
                }
            }
        }

        cutOff =
                NamespaceGlobal.max
                        .env(env)
                        .call(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("commonLineThreshold")
                                        .value(),
                                toObjectR(this).accessProp(this, env).name("contextLines").value())
                        .value();
        hunkCapture = false;
        sameCount = ZVal.assign(toRange = ZVal.assign(fromRange = 0));
        toStart = ZVal.assign(fromStart = 1);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult453 : ZVal.getIterable(diff, env, false)) {
            i = ZVal.assign(zpairResult453.getKey());
            entry = ZVal.assign(zpairResult453.getValue());
            if (ZVal.strictEqualityCheck(0, "===", ZVal.getElement(entry, 1))) {
                if (ZVal.strictEqualityCheck(false, "===", hunkCapture)) {
                    fromStart = ZVal.increment(fromStart);
                    toStart = ZVal.increment(toStart);
                    continue;
                }

                sameCount = ZVal.increment(sameCount);
                toRange = ZVal.increment(toRange);
                fromRange = ZVal.increment(fromRange);
                if (ZVal.strictEqualityCheck(sameCount, "===", cutOff)) {
                    contextStartOffset =
                            ZVal.assign(
                                    ZVal.isLessThan(
                                                    ZVal.subtract(
                                                            hunkCapture,
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("contextLines")
                                                                    .value()),
                                                    '<',
                                                    0)
                                            ? hunkCapture
                                            : toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("contextLines")
                                                    .value());
                    env.callMethod(
                            this,
                            "writeHunk",
                            UnifiedDiffOutputBuilder.class,
                            diff,
                            ZVal.subtract(hunkCapture, contextStartOffset),
                            ZVal.add(
                                    ZVal.add(
                                            ZVal.subtract(i, cutOff),
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("contextLines")
                                                    .value()),
                                    1),
                            ZVal.subtract(fromStart, contextStartOffset),
                            ZVal.add(
                                    ZVal.add(ZVal.subtract(fromRange, cutOff), contextStartOffset),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("contextLines")
                                            .value()),
                            ZVal.subtract(toStart, contextStartOffset),
                            ZVal.add(
                                    ZVal.add(ZVal.subtract(toRange, cutOff), contextStartOffset),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("contextLines")
                                            .value()),
                            output);
                    fromStart = ZAssignment.add("+=", fromStart, fromRange);
                    toStart = ZAssignment.add("+=", toStart, toRange);
                    hunkCapture = false;
                    sameCount = ZVal.assign(toRange = ZVal.assign(fromRange = 0));
                }

                continue;
            }

            sameCount = 0;
            if (ZVal.strictEqualityCheck(
                    ZVal.getElement(entry, 1), "===", Differ.CONST_NO_LINE_END_EOF_WARNING)) {
                continue;
            }

            if (ZVal.strictEqualityCheck(false, "===", hunkCapture)) {
                hunkCapture = ZVal.assign(i);
            }

            if (ZVal.strictEqualityCheck(Differ.CONST_ADDED, "===", ZVal.getElement(entry, 1))) {
                toRange = ZVal.increment(toRange);
            }

            if (ZVal.strictEqualityCheck(Differ.CONST_REMOVED, "===", ZVal.getElement(entry, 1))) {
                fromRange = ZVal.increment(fromRange);
            }
        }

        if (ZVal.strictEqualityCheck(false, "===", hunkCapture)) {
            return null;
        }

        contextStartOffset =
                ZVal.assign(
                        ZVal.isLessThan(
                                        ZVal.subtract(
                                                hunkCapture,
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("contextLines")
                                                        .value()),
                                        '<',
                                        0)
                                ? hunkCapture
                                : toObjectR(this)
                                        .accessProp(this, env)
                                        .name("contextLines")
                                        .value());
        contextEndOffset =
                NamespaceGlobal.min
                        .env(env)
                        .call(
                                sameCount,
                                toObjectR(this).accessProp(this, env).name("contextLines").value())
                        .value();
        fromRange = ZAssignment.subtract("-=", fromRange, sameCount);
        toRange = ZAssignment.subtract("-=", toRange, sameCount);
        env.callMethod(
                this,
                "writeHunk",
                UnifiedDiffOutputBuilder.class,
                diff,
                ZVal.subtract(hunkCapture, contextStartOffset),
                ZVal.add(ZVal.add(ZVal.subtract(i, sameCount), contextEndOffset), 1),
                ZVal.subtract(fromStart, contextStartOffset),
                ZVal.add(ZVal.add(fromRange, contextStartOffset), contextEndOffset),
                ZVal.subtract(toStart, contextStartOffset),
                ZVal.add(ZVal.add(toRange, contextStartOffset), contextEndOffset),
                output);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    @ConvertedParameter(index = 1, name = "diffStartIndex", typeHint = "int")
    @ConvertedParameter(index = 2, name = "diffEndIndex", typeHint = "int")
    @ConvertedParameter(index = 3, name = "fromStart", typeHint = "int")
    @ConvertedParameter(index = 4, name = "fromRange", typeHint = "int")
    @ConvertedParameter(index = 5, name = "toStart", typeHint = "int")
    @ConvertedParameter(index = 6, name = "toRange", typeHint = "int")
    @ConvertedParameter(index = 7, name = "output")
    private Object writeHunk(RuntimeEnv env, Object... args) {
        Object diff = assignParameter(args, 0, null);
        if (ZVal.isNull(diff)) {
            diff = ZVal.newArray();
        }
        Object diffStartIndex = assignParameter(args, 1, null);
        Object diffEndIndex = assignParameter(args, 2, null);
        Object fromStart = assignParameter(args, 3, null);
        Object fromRange = assignParameter(args, 4, null);
        Object toStart = assignParameter(args, 5, null);
        Object toRange = assignParameter(args, 6, null);
        Object output = assignParameter(args, 7, null);
        Object i = null;
        if (toObjectR(this).accessProp(this, env).name("addLineNumbers").getBool()) {
            NamespaceGlobal.fwrite.env(env).call(output, "@@ -" + toStringR(fromStart, env));
            if (ZVal.toBool(!toObjectR(this).accessProp(this, env).name("collapseRanges").getBool())
                    || ZVal.toBool(ZVal.strictNotEqualityCheck(1, "!==", fromRange))) {
                NamespaceGlobal.fwrite.env(env).call(output, "," + toStringR(fromRange, env));
            }

            NamespaceGlobal.fwrite.env(env).call(output, " +" + toStringR(toStart, env));
            if (ZVal.toBool(!toObjectR(this).accessProp(this, env).name("collapseRanges").getBool())
                    || ZVal.toBool(ZVal.strictNotEqualityCheck(1, "!==", toRange))) {
                NamespaceGlobal.fwrite.env(env).call(output, "," + toStringR(toRange, env));
            }

            NamespaceGlobal.fwrite.env(env).call(output, " @@\n");

        } else {
            NamespaceGlobal.fwrite.env(env).call(output, "@@ @@\n");
        }

        for (i = ZVal.assign(diffStartIndex);
                ZVal.isLessThan(i, '<', diffEndIndex);
                i = ZVal.increment(i)) {
            if (ZVal.strictEqualityCheck(
                    ZVal.getElementRecursive(diff, i, 1), "===", Differ.CONST_ADDED)) {
                NamespaceGlobal.fwrite
                        .env(env)
                        .call(output, "+" + toStringR(ZVal.getElementRecursive(diff, i, 0), env));

            } else if (ZVal.strictEqualityCheck(
                    ZVal.getElementRecursive(diff, i, 1), "===", Differ.CONST_REMOVED)) {
                NamespaceGlobal.fwrite
                        .env(env)
                        .call(output, "-" + toStringR(ZVal.getElementRecursive(diff, i, 0), env));

            } else if (ZVal.strictEqualityCheck(
                    ZVal.getElementRecursive(diff, i, 1), "===", Differ.CONST_OLD)) {
                NamespaceGlobal.fwrite
                        .env(env)
                        .call(output, " " + toStringR(ZVal.getElementRecursive(diff, i, 0), env));

            } else if (ZVal.strictEqualityCheck(
                    ZVal.getElementRecursive(diff, i, 1),
                    "===",
                    Differ.CONST_NO_LINE_END_EOF_WARNING)) {
                NamespaceGlobal.fwrite.env(env).call(output, "\n");

            } else {
                NamespaceGlobal.fwrite
                        .env(env)
                        .call(output, " " + toStringR(ZVal.getElementRecursive(diff, i, 0), env));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\UnifiedDiffOutputBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractChunkOutputBuilder.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Output\\UnifiedDiffOutputBuilder")
                    .setLookup(
                            UnifiedDiffOutputBuilder.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "addLineNumbers",
                            "collapseRanges",
                            "commonLineThreshold",
                            "contextLines",
                            "header")
                    .setFilename("vendor/sebastian/diff/src/Output/UnifiedDiffOutputBuilder.php")
                    .addInterface("DiffOutputBuilderInterface")
                    .addExtendsClass("SebastianBergmann\\Diff\\Output\\AbstractChunkOutputBuilder")
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
