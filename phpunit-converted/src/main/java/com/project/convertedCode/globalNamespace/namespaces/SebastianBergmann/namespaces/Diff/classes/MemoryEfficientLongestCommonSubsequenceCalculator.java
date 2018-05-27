package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.LongestCommonSubsequenceCalculator;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/MemoryEfficientLongestCommonSubsequenceCalculator.php

*/

public final class MemoryEfficientLongestCommonSubsequenceCalculator extends RuntimeClassBase
        implements LongestCommonSubsequenceCalculator {

    public MemoryEfficientLongestCommonSubsequenceCalculator(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    public Object calculate(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, null);
        if (ZVal.isNull(from)) {
            from = ZVal.newArray();
        }
        Object to = assignParameter(args, 1, null);
        Object fromEnd = null;
        Object llB = ZVal.newArray();
        Object toStart = null;
        Object llE = ZVal.newArray();
        Object max = null;
        Object i = null;
        Object j = null;
        Object jMax = null;
        Object m = null;
        Object toEnd = null;
        Object cFrom = null;
        Object fromStart = null;
        Object cTo = null;
        cFrom = CRArrayF.count.env(env).call(from).value();
        cTo = CRArrayF.count.env(env).call(to).value();
        if (ZVal.strictEqualityCheck(cFrom, "===", 0)) {
            return ZVal.assign(ZVal.newArray());
        }

        if (ZVal.strictEqualityCheck(cFrom, "===", 1)) {
            if (CRArrayF.in_array.env(env).call(ZVal.getElement(from, 0), to, true).getBool()) {
                return ZVal.assign(ZVal.newArray(new ZPair(0, ZVal.getElement(from, 0))));
            }

            return ZVal.assign(ZVal.newArray());
        }

        i = ZVal.assign(ZVal.toLong(ZVal.divide(cFrom, 2)));
        fromStart = CRArrayF.array_slice.env(env).call(from, 0, i).value();
        fromEnd = CRArrayF.array_slice.env(env).call(from, i).value();
        llB =
                env.callMethod(
                        this,
                        "length",
                        MemoryEfficientLongestCommonSubsequenceCalculator.class,
                        fromStart,
                        to);
        llE =
                env.callMethod(
                        this,
                        "length",
                        MemoryEfficientLongestCommonSubsequenceCalculator.class,
                        CRArrayF.array_reverse.env(env).call(fromEnd).value(),
                        CRArrayF.array_reverse.env(env).call(to).value());
        jMax = 0;
        max = 0;
        for (j = 0; ZVal.isLessThanOrEqualTo(j, "<=", cTo); j = ZVal.increment(j)) {
            m = ZVal.add(ZVal.getElement(llB, j), ZVal.getElement(llE, ZVal.subtract(cTo, j)));
            if (ZVal.isGreaterThanOrEqualTo(m, ">=", max)) {
                max = ZVal.assign(m);
                jMax = ZVal.assign(j);
            }
        }

        toStart = CRArrayF.array_slice.env(env).call(to, 0, jMax).value();
        toEnd = CRArrayF.array_slice.env(env).call(to, jMax).value();
        return ZVal.assign(
                CRArrayF.array_merge
                        .env(env)
                        .call(
                                env.callMethod(
                                        this,
                                        "calculate",
                                        MemoryEfficientLongestCommonSubsequenceCalculator.class,
                                        fromStart,
                                        toStart),
                                env.callMethod(
                                        this,
                                        "calculate",
                                        MemoryEfficientLongestCommonSubsequenceCalculator.class,
                                        fromEnd,
                                        toEnd))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    private Object length(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, null);
        if (ZVal.isNull(from)) {
            from = ZVal.newArray();
        }
        Object to = assignParameter(args, 1, null);
        if (ZVal.isNull(to)) {
            to = ZVal.newArray();
        }
        Object current = ZVal.newArray();
        Object prev = ZVal.newArray();
        Object cFrom = null;
        Object i = null;
        Object j = null;
        Object cTo = null;
        current =
                CRArrayF.array_fill
                        .env(env)
                        .call(0, ZVal.add(CRArrayF.count.env(env).call(to).value(), 1), 0)
                        .value();
        cFrom = CRArrayF.count.env(env).call(from).value();
        cTo = CRArrayF.count.env(env).call(to).value();
        for (i = 0; ZVal.isLessThan(i, '<', cFrom); i = ZVal.increment(i)) {
            prev = ZVal.assign(current);
            for (j = 0; ZVal.isLessThan(j, '<', cTo); j = ZVal.increment(j)) {
                if (ZVal.strictEqualityCheck(
                        ZVal.getElement(from, i), "===", ZVal.getElement(to, j))) {
                    ZVal.putArrayElement(
                            current, ZVal.add(j, 1), ZVal.add(ZVal.getElement(prev, j), 1));

                } else {
                    ZVal.putArrayElement(
                            current,
                            ZVal.add(j, 1),
                            NamespaceGlobal.max
                                    .env(env)
                                    .call(
                                            ZVal.getElement(current, j),
                                            ZVal.getElement(prev, ZVal.add(j, 1)))
                                    .value());
                }
            }
        }

        return ZVal.assign(current);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\MemoryEfficientLongestCommonSubsequenceCalculator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "SebastianBergmann\\Diff\\MemoryEfficientLongestCommonSubsequenceCalculator")
                    .setLookup(
                            MemoryEfficientLongestCommonSubsequenceCalculator.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/sebastian/diff/src/MemoryEfficientLongestCommonSubsequenceCalculator.php")
                    .addInterface("LongestCommonSubsequenceCalculator")
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
