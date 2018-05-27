package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Diff;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Chunk;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Line;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Parser.php

*/

public final class Parser extends RuntimeClassBase {

    public Parser(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    public Object parse(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object string = assignParameter(args, 0, null);
        ReferenceContainer fromMatch = new BasicReferenceContainer(ZVal.newArray());
        Object i = null;
        Object diff = null;
        Object collected = ZVal.newArray();
        Object lines = ZVal.newArray();
        Object diffs = ZVal.newArray();
        ReferenceContainer toMatch = new BasicReferenceContainer(ZVal.newArray());
        Object lineCount = null;
        lines = NamespaceGlobal.preg_split.env(env).call("(\\r\\n|\\r|\\n)", string).value();
        if (ZVal.toBool(!ZVal.isEmpty(lines))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getElement(
                                        lines,
                                        ZVal.subtract(
                                                CRArrayF.count.env(env).call(lines).value(), 1)),
                                "===",
                                ""))) {
            CRArrayF.array_pop.env(env).call(lines);
        }

        lineCount = CRArrayF.count.env(env).call(lines).value();
        diffs = ZVal.newArray();
        diff = ZVal.getNull();
        collected = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (i = 0; ZVal.isLessThan(i, '<', lineCount); i = ZVal.increment(i)) {
            if (ZVal.toBool(
                            NamespaceGlobal.preg_match
                                    .env(env)
                                    .addReferneceArgs(
                                            new RuntimeArgsWithReferences().add(2, fromMatch))
                                    .call(
                                            "(^---\\s+(?P<file>\\S+))",
                                            ZVal.getElement(lines, i),
                                            fromMatch.getObject())
                                    .value())
                    && ZVal.toBool(
                            NamespaceGlobal.preg_match
                                    .env(env)
                                    .addReferneceArgs(
                                            new RuntimeArgsWithReferences().add(2, toMatch))
                                    .call(
                                            "(^\\+\\+\\+\\s+(?P<file>\\S+))",
                                            ZVal.getElement(lines, ZVal.add(i, 1)),
                                            toMatch.getObject())
                                    .value())) {
                if (ZVal.strictNotEqualityCheck(diff, "!==", ZVal.getNull())) {
                    env.callMethod(this, "parseFileDiff", Parser.class, diff, collected);
                    ZVal.addToArray(diffs, diff);
                    collected = ZVal.newArray();
                }

                diff =
                        new Diff(
                                env,
                                ZVal.getElement(fromMatch.getObject(), "file"),
                                ZVal.getElement(toMatch.getObject(), "file"));
                i = ZVal.increment(i);

            } else {
                if (NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call(
                                "/^(?:diff --git |index [\\da-f\\.]+|[+-]{3} [ab])/",
                                ZVal.getElement(lines, i))
                        .getBool()) {
                    continue;
                }

                ZVal.addToArray(collected, ZVal.getElement(lines, i));
            }
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(diff, "!==", ZVal.getNull()))
                && ZVal.toBool(CRArrayF.count.env(env).call(collected).value())) {
            env.callMethod(this, "parseFileDiff", Parser.class, diff, collected);
            ZVal.addToArray(diffs, diff);
        }

        return ZVal.assign(diffs);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "SebastianBergmann\\Diff\\Diff")
    @ConvertedParameter(index = 1, name = "lines", typeHint = "array")
    private Object parseFileDiff(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object diff = assignParameter(args, 0, null);
        Object lines = assignParameter(args, 1, null);
        Object chunks = ZVal.newArray();
        Object line = null;
        ReferenceContainer match = new BasicReferenceContainer(ZVal.newArray());
        Object chunk = null;
        Object diffLines = ZVal.newArray();
        Object type = null;
        chunks = ZVal.newArray();
        chunk = ZVal.getNull();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult454 : ZVal.getIterable(lines, env, true)) {
            line = ZVal.assign(zpairResult454.getValue());
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call(
                            "/^@@\\s+-(?P<start>\\d+)(?:,\\s*(?P<startrange>\\d+))?\\s+\\+(?P<end>\\d+)(?:,\\s*(?P<endrange>\\d+))?\\s+@@/",
                            line,
                            match.getObject())
                    .getBool()) {
                chunk =
                        new Chunk(
                                env,
                                ZVal.toLong(ZVal.getElement(match.getObject(), "start")),
                                ZVal.isset(ZVal.getElement(match.getObject(), "startrange"))
                                        ? NamespaceGlobal.max
                                                .env(env)
                                                .call(
                                                        1,
                                                        ZVal.toLong(
                                                                ZVal.getElement(
                                                                        match.getObject(),
                                                                        "startrange")))
                                                .value()
                                        : 1,
                                ZVal.toLong(ZVal.getElement(match.getObject(), "end")),
                                ZVal.isset(ZVal.getElement(match.getObject(), "endrange"))
                                        ? NamespaceGlobal.max
                                                .env(env)
                                                .call(
                                                        1,
                                                        ZVal.toLong(
                                                                ZVal.getElement(
                                                                        match.getObject(),
                                                                        "endrange")))
                                                .value()
                                        : 1);
                ZVal.addToArray(chunks, chunk);
                diffLines = ZVal.newArray();
                continue;
            }

            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call("/^(?P<type>[+ -])?(?P<line>.*)/", line, match.getObject())
                    .getBool()) {
                type = ZVal.assign(Line.CONST_UNCHANGED);
                if (ZVal.strictEqualityCheck(
                        ZVal.getElement(match.getObject(), "type"), "===", "+")) {
                    type = ZVal.assign(Line.CONST_ADDED);

                } else if (ZVal.strictEqualityCheck(
                        ZVal.getElement(match.getObject(), "type"), "===", "-")) {
                    type = ZVal.assign(Line.CONST_REMOVED);
                }

                ZVal.addToArray(
                        diffLines, new Line(env, type, ZVal.getElement(match.getObject(), "line")));
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", chunk)) {
                    env.callMethod(chunk, "setLines", Parser.class, diffLines);
                }
            }
        }

        env.callMethod(diff, "setChunks", Parser.class, chunks);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Diff\\Parser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Parser")
                    .setLookup(Parser.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/diff/src/Parser.php")
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
