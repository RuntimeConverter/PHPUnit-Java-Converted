package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.ConfigurationException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.DiffOutputBuilderInterface;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Output/StrictUnifiedDiffOutputBuilder.php

*/

public final class StrictUnifiedDiffOutputBuilder extends RuntimeClassBase
        implements DiffOutputBuilderInterface {

    public Object changed = null;

    public Object collapseRanges = null;

    public Object commonLineThreshold = null;

    public Object header = null;

    public Object contextLines = null;

    public StrictUnifiedDiffOutputBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StrictUnifiedDiffOutputBuilder.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, null);
        if (ZVal.isNull(options)) {
            options = ZVal.newArray();
        }
        Object option = null;
        options =
                CRArrayF.array_merge
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .SebastianBergmann
                                                        .namespaces
                                                        .Diff
                                                        .namespaces
                                                        .Output
                                                        .classes
                                                        .StrictUnifiedDiffOutputBuilder
                                                        .RequestStaticProperties
                                                        .class)
                                        ._pDefault,
                                options)
                        .value();
        if (!NamespaceGlobal.is_bool
                .env(env)
                .call(ZVal.getElement(options, "collapseRanges"))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new ConfigurationException(
                            env,
                            "collapseRanges",
                            "a bool",
                            ZVal.getElement(options, "collapseRanges")));
        }

        if (ZVal.toBool(
                        !function_is_int
                                .f
                                .env(env)
                                .call(ZVal.getElement(options, "contextLines"))
                                .getBool())
                || ZVal.toBool(ZVal.isLessThan(ZVal.getElement(options, "contextLines"), '<', 0))) {
            throw ZVal.getException(
                    env,
                    new ConfigurationException(
                            env,
                            "contextLines",
                            "an int >= 0",
                            ZVal.getElement(options, "contextLines")));
        }

        if (ZVal.toBool(
                        !function_is_int
                                .f
                                .env(env)
                                .call(ZVal.getElement(options, "commonLineThreshold"))
                                .getBool())
                || ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(
                                ZVal.getElement(options, "commonLineThreshold"), "<=", 0))) {
            throw ZVal.getException(
                    env,
                    new ConfigurationException(
                            env,
                            "commonLineThreshold",
                            "an int > 0",
                            ZVal.getElement(options, "commonLineThreshold")));
        }

        for (ZPair zpairResult450 :
                ZVal.getIterable(
                        ZVal.newArray(new ZPair(0, "fromFile"), new ZPair(1, "toFile")),
                        env,
                        true)) {
            option = ZVal.assign(zpairResult450.getValue());
            if (!function_is_string.f.env(env).call(ZVal.getElement(options, option)).getBool()) {
                throw ZVal.getException(
                        env,
                        new ConfigurationException(
                                env, option, "a string", ZVal.getElement(options, option)));
            }
        }

        for (ZPair zpairResult451 :
                ZVal.getIterable(
                        ZVal.newArray(new ZPair(0, "fromFileDate"), new ZPair(1, "toFileDate")),
                        env,
                        true)) {
            option = ZVal.assign(zpairResult451.getValue());
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    ZVal.getNull(), "!==", ZVal.getElement(options, option)))
                    && ZVal.toBool(
                            !function_is_string
                                    .f
                                    .env(env)
                                    .call(ZVal.getElement(options, option))
                                    .getBool())) {
                throw ZVal.getException(
                        env,
                        new ConfigurationException(
                                env,
                                option,
                                "a string or <null>",
                                ZVal.getElement(options, option)));
            }
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("header")
                .set(
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "--- %s%s\n+++ %s%s\n",
                                        ZVal.getElement(options, "fromFile"),
                                        ZVal.strictEqualityCheck(
                                                        ZVal.getNull(),
                                                        "===",
                                                        ZVal.getElement(options, "fromFileDate"))
                                                ? ""
                                                : "\t"
                                                        + toStringR(
                                                                ZVal.getElement(
                                                                        options, "fromFileDate"),
                                                                env),
                                        ZVal.getElement(options, "toFile"),
                                        ZVal.strictEqualityCheck(
                                                        ZVal.getNull(),
                                                        "===",
                                                        ZVal.getElement(options, "toFileDate"))
                                                ? ""
                                                : "\t"
                                                        + toStringR(
                                                                ZVal.getElement(
                                                                        options, "toFileDate"),
                                                                env))
                                .value());
        toObjectR(this)
                .accessProp(this, env)
                .name("collapseRanges")
                .set(ZVal.getElement(options, "collapseRanges"));
        toObjectR(this)
                .accessProp(this, env)
                .name("commonLineThreshold")
                .set(ZVal.getElement(options, "commonLineThreshold"));
        toObjectR(this)
                .accessProp(this, env)
                .name("contextLines")
                .set(ZVal.getElement(options, "contextLines"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    public Object getDiff(RuntimeEnv env, Object... args) {
        Object diff = assignParameter(args, 0, null);
        Object last = null;
        Object buffer = null;
        if (ZVal.strictEqualityCheck(0, "===", CRArrayF.count.env(env).call(diff).value())) {
            return "";
        }

        toObjectR(this).accessProp(this, env).name("changed").set(false);
        buffer = NamespaceGlobal.fopen.env(env).call("php://memory", "r+b").value();
        NamespaceGlobal.fwrite
                .env(env)
                .call(buffer, toObjectR(this).accessProp(this, env).name("header").value());
        env.callMethod(this, "writeDiffHunks", StrictUnifiedDiffOutputBuilder.class, buffer, diff);
        if (!toObjectR(this).accessProp(this, env).name("changed").getBool()) {
            NamespaceGlobal.fclose.env(env).call(buffer);
            return "";
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
        for (ZPair zpairResult452 : ZVal.getIterable(diff, env, false)) {
            i = ZVal.assign(zpairResult452.getKey());
            entry = ZVal.assign(zpairResult452.getValue());
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
                            StrictUnifiedDiffOutputBuilder.class,
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

            toObjectR(this).accessProp(this, env).name("changed").set(true);
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
                StrictUnifiedDiffOutputBuilder.class,
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
        for (i = ZVal.assign(diffStartIndex);
                ZVal.isLessThan(i, '<', diffEndIndex);
                i = ZVal.increment(i)) {
            if (ZVal.strictEqualityCheck(
                    ZVal.getElementRecursive(diff, i, 1), "===", Differ.CONST_ADDED)) {
                toObjectR(this).accessProp(this, env).name("changed").set(true);
                NamespaceGlobal.fwrite
                        .env(env)
                        .call(output, "+" + toStringR(ZVal.getElementRecursive(diff, i, 0), env));

            } else if (ZVal.strictEqualityCheck(
                    ZVal.getElementRecursive(diff, i, 1), "===", Differ.CONST_REMOVED)) {
                toObjectR(this).accessProp(this, env).name("changed").set(true);
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
                toObjectR(this).accessProp(this, env).name("changed").set(true);
                NamespaceGlobal.fwrite.env(env).call(output, ZVal.getElementRecursive(diff, i, 0));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\StrictUnifiedDiffOutputBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object _pDefault =
                ZVal.newArray(
                        new ZPair("collapseRanges", true),
                        new ZPair("commonLineThreshold", 6),
                        new ZPair("contextLines", 3),
                        new ZPair("fromFile", ZVal.getNull()),
                        new ZPair("fromFileDate", ZVal.getNull()),
                        new ZPair("toFile", ZVal.getNull()),
                        new ZPair("toFileDate", ZVal.getNull()));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Output\\StrictUnifiedDiffOutputBuilder")
                    .setLookup(
                            StrictUnifiedDiffOutputBuilder.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "changed",
                            "collapseRanges",
                            "commonLineThreshold",
                            "contextLines",
                            "header")
                    .setFilename(
                            "vendor/sebastian/diff/src/Output/StrictUnifiedDiffOutputBuilder.php")
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
