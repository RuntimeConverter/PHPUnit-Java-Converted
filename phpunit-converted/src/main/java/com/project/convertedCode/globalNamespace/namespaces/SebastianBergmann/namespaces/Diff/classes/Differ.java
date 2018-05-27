package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.TimeEfficientLongestCommonSubsequenceCalculator;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import java.lang.Math;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.UnifiedDiffOutputBuilder;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.MemoryEfficientLongestCommonSubsequenceCalculator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.DiffOutputBuilderInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Differ.php

*/

public final class Differ extends RuntimeClassBase {

    public Object outputBuilder = null;

    public Differ(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Differ.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "outputBuilder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object outputBuilder = assignParameter(args, 0, null);
        if (ZVal.isNull(outputBuilder)) {
            outputBuilder = ZVal.getNull();
        }
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        outputBuilder,
                        DiffOutputBuilderInterface.class,
                        "SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface"))) {
            toObjectR(this).accessProp(this, env).name("outputBuilder").set(outputBuilder);

        } else if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", outputBuilder)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("outputBuilder")
                    .set(new UnifiedDiffOutputBuilder(env));

        } else if (function_is_string.f.env(env).call(outputBuilder).getBool()) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("outputBuilder")
                    .set(new UnifiedDiffOutputBuilder(env, outputBuilder));

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Expected builder to be an instance of DiffOutputBuilderInterface, <null> or a string, got %s.",
                                            function_is_object
                                                            .f
                                                            .env(env)
                                                            .call(outputBuilder)
                                                            .getBool()
                                                    ? "instance of \""
                                                            + toStringR(
                                                                    function_get_class
                                                                            .f
                                                                            .env(env)
                                                                            .call(outputBuilder)
                                                                            .value(),
                                                                    env)
                                                            + "\""
                                                    : toStringR(
                                                                    NamespaceGlobal.gettype
                                                                            .env(env)
                                                                            .call(outputBuilder)
                                                                            .value(),
                                                                    env)
                                                            + " \""
                                                            + toStringR(outputBuilder, env)
                                                            + "\"")
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    @ConvertedParameter(
        index = 2,
        name = "lcs",
        typeHint = "SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object diff(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, null);
        Object to = assignParameter(args, 1, null);
        Object lcs = assignParameter(args, 2, null);
        if (ZVal.isNull(lcs)) {
            lcs = ZVal.getNull();
        }
        Object diff = null;
        diff =
                env.callMethod(
                        this,
                        "diffToArray",
                        Differ.class,
                        env.callMethod(this, "normalizeDiffInput", Differ.class, from),
                        env.callMethod(this, "normalizeDiffInput", Differ.class, to),
                        lcs);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("outputBuilder").value(),
                        "getDiff",
                        Differ.class,
                        diff));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    @ConvertedParameter(
        index = 2,
        name = "lcs",
        typeHint = "SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object diffToArray(RuntimeEnv env, Object... args) {
        ReferenceContainer from = new BasicReferenceContainer(assignParameter(args, 0, null));
        ReferenceContainer to = new BasicReferenceContainer(assignParameter(args, 1, null));
        Object lcs = assignParameter(args, 2, null);
        if (ZVal.isNull(lcs)) {
            lcs = ZVal.getNull();
        }
        Object common = null;
        Object start = null;
        Object end = null;
        Object runtimeTempArrayResult16 = null;
        Object diff = ZVal.newArray();
        Object fromToken = null;
        Object toToken = null;
        Object token = null;
        if (function_is_string.f.env(env).call(from.getObject()).getBool()) {
            from.setObject(
                    env.callMethod(this, "splitStringByLines", Differ.class, from.getObject()));

        } else if (!function_is_array.f.env(env).call(from.getObject()).getBool()) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "\"from\" must be an array or string."));
        }

        if (function_is_string.f.env(env).call(to.getObject()).getBool()) {
            to.setObject(env.callMethod(this, "splitStringByLines", Differ.class, to.getObject()));

        } else if (!function_is_array.f.env(env).call(to.getObject()).getBool()) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "\"to\" must be an array or string."));
        }

        ZVal.list(
                runtimeTempArrayResult16 =
                        runtimeStaticObject.getArrayDiffParted(
                                env,
                                new RuntimeArgsWithReferences().add(0, from).add(1, to),
                                from.getObject(),
                                to.getObject()),
                (from.setObject(ZVal.assign(ZVal.getElement(runtimeTempArrayResult16, 0)))),
                (to.setObject(ZVal.assign(ZVal.getElement(runtimeTempArrayResult16, 1)))),
                (start = ZVal.assign(ZVal.getElement(runtimeTempArrayResult16, 2))),
                (end = ZVal.assign(ZVal.getElement(runtimeTempArrayResult16, 3))));
        if (ZVal.strictEqualityCheck(lcs, "===", ZVal.getNull())) {
            lcs =
                    env.callMethod(
                            this,
                            "selectLcsImplementation",
                            Differ.class,
                            from.getObject(),
                            to.getObject());
        }

        common =
                env.callMethod(
                        lcs,
                        "calculate",
                        Differ.class,
                        CRArrayF.array_values.env(env).call(from.getObject()).value(),
                        CRArrayF.array_values.env(env).call(to.getObject()).value());
        diff = ZVal.newArray();
        for (ZPair zpairResult442 : ZVal.getIterable(start, env, true)) {
            token = ZVal.assign(zpairResult442.getValue());
            ZVal.addToArray(diff, ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_OLD)));
        }

        CRArrayF.reset.env(env).call(from.getObject());
        CRArrayF.reset.env(env).call(to.getObject());
        for (ZPair zpairResult443 : ZVal.getIterable(common, env, true)) {
            token = ZVal.assign(zpairResult443.getValue());
            while (ZVal.strictNotEqualityCheck(
                    fromToken = CRArrayF.reset.env(env).call(from.getObject()).value(),
                    "!==",
                    token)) {
                ZVal.addToArray(
                        diff,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        CRArrayF.array_shift
                                                .env(env)
                                                .call(from.getObject())
                                                .value()),
                                new ZPair(1, CONST_REMOVED)));
            }

            while (ZVal.strictNotEqualityCheck(
                    toToken = CRArrayF.reset.env(env).call(to.getObject()).value(), "!==", token)) {
                ZVal.addToArray(
                        diff,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        CRArrayF.array_shift.env(env).call(to.getObject()).value()),
                                new ZPair(1, CONST_ADDED)));
            }

            ZVal.addToArray(diff, ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_OLD)));
            CRArrayF.array_shift.env(env).call(from.getObject());
            CRArrayF.array_shift.env(env).call(to.getObject());
        }

        while (ZVal.strictNotEqualityCheck(
                token = CRArrayF.array_shift.env(env).call(from.getObject()).value(),
                "!==",
                ZVal.getNull())) {
            ZVal.addToArray(diff, ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_REMOVED)));
        }

        while (ZVal.strictNotEqualityCheck(
                token = CRArrayF.array_shift.env(env).call(to.getObject()).value(),
                "!==",
                ZVal.getNull())) {
            ZVal.addToArray(diff, ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_ADDED)));
        }

        for (ZPair zpairResult444 : ZVal.getIterable(end, env, true)) {
            token = ZVal.assign(zpairResult444.getValue());
            ZVal.addToArray(diff, ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_OLD)));
        }

        if (ZVal.isTrue(env.callMethod(this, "detectUnmatchedLineEndings", Differ.class, diff))) {
            CRArrayF.array_unshift
                    .env(env)
                    .call(
                            diff,
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            "#Warning: Strings contain different line endings!\n"),
                                    new ZPair(1, CONST_DIFF_LINE_END_WARNING)));
        }

        return ZVal.assign(diff);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    private Object normalizeDiffInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, null);
        if (ZVal.toBool(!function_is_array.f.env(env).call(input).getBool())
                && ZVal.toBool(!function_is_string.f.env(env).call(input).getBool())) {
            return ZVal.assign(toStringR(input, env));
        }

        return ZVal.assign(input);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input", typeHint = "string")
    private Object splitStringByLines(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.preg_split
                        .env(env)
                        .call("/(.*\\R)/", input, -1, ZVal.toLong(2) | ZVal.toLong(1))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    private Object selectLcsImplementation(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, null);
        Object to = assignParameter(args, 1, null);
        Object memoryLimit = null;
        memoryLimit = ZVal.multiply(ZVal.multiply(100, 1024), 1024);
        if (ZVal.isGreaterThan(
                env.callMethod(this, "calculateEstimatedFootprint", Differ.class, from, to),
                '>',
                memoryLimit)) {
            return ZVal.assign(new MemoryEfficientLongestCommonSubsequenceCalculator(env));
        }

        return ZVal.assign(new TimeEfficientLongestCommonSubsequenceCalculator(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    private Object calculateEstimatedFootprint(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, null);
        Object to = assignParameter(args, 1, null);
        Object itemSize = null;
        itemSize = ZVal.assign(ZVal.strictEqualityCheck(8, "===", 4) ? 76 : 144);
        return ZVal.assign(
                ZVal.multiply(
                        itemSize,
                        Math.pow(
                                ZVal.toDouble(
                                        NamespaceGlobal.min
                                                .env(env)
                                                .call(
                                                        CRArrayF.count.env(env).call(from).value(),
                                                        CRArrayF.count.env(env).call(to).value())
                                                .value()),
                                ZVal.toDouble(2))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    private Object detectUnmatchedLineEndings(RuntimeEnv env, Object... args) {
        Object diff = assignParameter(args, 0, null);
        Object entry = ZVal.newArray();
        Object ln = null;
        Object set = null;
        Object newLineBreaks = ZVal.newArray();
        Object _pBreak = null;
        Object oldLineBreaks = ZVal.newArray();
        newLineBreaks = ZVal.newArray(new ZPair("", true));
        oldLineBreaks = ZVal.newArray(new ZPair("", true));
        for (ZPair zpairResult445 : ZVal.getIterable(diff, env, true)) {
            entry = ZVal.assign(zpairResult445.getValue());
            if (ZVal.strictEqualityCheck(CONST_OLD, "===", ZVal.getElement(entry, 1))) {
                ln = env.callMethod(this, "getLinebreak", Differ.class, ZVal.getElement(entry, 0));
                ZVal.putArrayElement(oldLineBreaks, ln, true);
                ZVal.putArrayElement(newLineBreaks, ln, true);

            } else if (ZVal.strictEqualityCheck(CONST_ADDED, "===", ZVal.getElement(entry, 1))) {
                ZVal.putArrayElement(
                        newLineBreaks,
                        env.callMethod(
                                this, "getLinebreak", Differ.class, ZVal.getElement(entry, 0)),
                        true);

            } else if (ZVal.strictEqualityCheck(CONST_REMOVED, "===", ZVal.getElement(entry, 1))) {
                ZVal.putArrayElement(
                        oldLineBreaks,
                        env.callMethod(
                                this, "getLinebreak", Differ.class, ZVal.getElement(entry, 0)),
                        true);
            }
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.newArray(new ZPair("", true)), "===", newLineBreaks))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.newArray(new ZPair("", true)), "===", oldLineBreaks))) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult446 : ZVal.getIterable(newLineBreaks, env, false)) {
            _pBreak = ZVal.assign(zpairResult446.getKey());
            set = ZVal.assign(zpairResult446.getValue());
            if (!ZVal.isset(ZVal.getElement(oldLineBreaks, _pBreak))) {
                return ZVal.assign(true);
            }
        }

        for (ZPair zpairResult447 : ZVal.getIterable(oldLineBreaks, env, false)) {
            _pBreak = ZVal.assign(zpairResult447.getKey());
            set = ZVal.assign(zpairResult447.getValue());
            if (!ZVal.isset(ZVal.getElement(newLineBreaks, _pBreak))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    private Object getLinebreak(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, null);
        Object lc = null;
        if (!function_is_string.f.env(env).call(line).getBool()) {
            return "";
        }

        lc = NamespaceGlobal.substr.env(env).call(line, -1).value();
        if (ZVal.strictEqualityCheck("\r", "===", lc)) {
            return "\r";
        }

        if (ZVal.strictNotEqualityCheck("\n", "!==", lc)) {
            return "";
        }

        if (ZVal.strictEqualityCheck(
                "\r\n", "===", NamespaceGlobal.substr.env(env).call(line, -2).value())) {
            return "\r\n";
        }

        return "\n";
    }

    public static final Object CONST_OLD = 0;

    public static final Object CONST_ADDED = 1;

    public static final Object CONST_REMOVED = 2;

    public static final Object CONST_DIFF_LINE_END_WARNING = 3;

    public static final Object CONST_NO_LINE_END_EOF_WARNING = 4;

    public static final Object CONST_class = "SebastianBergmann\\Diff\\Differ";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "from", typeHint = "array")
        @ConvertedParameter(index = 1, name = "to", typeHint = "array")
        private Object getArrayDiffParted(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer from = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
            if (ZVal.isNull(from)) {
                from.setObject(ZVal.newArray());
            }
            ReferenceContainer to = assignParameterRef(runtimePassByReferenceArgs, args, 1, null);
            if (ZVal.isNull(to)) {
                to.setObject(ZVal.newArray());
            }
            Object toK = null;
            Object fromK = null;
            Object v = null;
            Object start = ZVal.newArray();
            Object end = null;
            Object k = null;
            start = ZVal.newArray();
            end = ZVal.newArray();
            CRArrayF.reset.env(env).call(to.getObject());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult448 : ZVal.getIterable(from.getObject(), env, false)) {
                k = ZVal.assign(zpairResult448.getKey());
                v = ZVal.assign(zpairResult448.getValue());
                toK = CRArrayF.key.env(env).call(to.getObject()).value();
                if (ZVal.toBool(ZVal.strictEqualityCheck(toK, "===", k))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        v, "===", ZVal.getElement(to.getObject(), k)))) {
                    ZVal.putArrayElement(start, k, v);
                    ZVal.unsetArrayElement(from.getObject(), k);
                    ZVal.unsetArrayElement(to.getObject(), k);

                } else {
                    break;
                }
            }

            CRArrayF.end.env(env).call(from.getObject());
            CRArrayF.end.env(env).call(to.getObject());
            runtimeConverterBreakCount = 0;
            do {
                fromK = CRArrayF.key.env(env).call(from.getObject()).value();
                toK = CRArrayF.key.env(env).call(to.getObject()).value();
                if (ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", fromK))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        ZVal.getNull(), "===", toK)))
                        || ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        CRArrayF.current.env(env).call(from.getObject()).value(),
                                        "!==",
                                        CRArrayF.current.env(env).call(to.getObject()).value()))) {
                    break;
                }

                CRArrayF.prev.env(env).call(from.getObject());
                CRArrayF.prev.env(env).call(to.getObject());
                end =
                        ZVal.add(
                                ZVal.newArray(
                                        new ZPair(fromK, ZVal.getElement(from.getObject(), fromK))),
                                end);
                ZVal.unsetArrayElement(from.getObject(), fromK);
                ZVal.unsetArrayElement(to.getObject(), toK);

            } while (ZVal.isTrue(true));

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, from.getObject()),
                            new ZPair(1, to.getObject()),
                            new ZPair(2, start),
                            new ZPair(3, end)));
        }

        public Object getArrayDiffParted(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Differ")
                    .setLookup(Differ.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("outputBuilder")
                    .setFilename("vendor/sebastian/diff/src/Differ.php")
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
