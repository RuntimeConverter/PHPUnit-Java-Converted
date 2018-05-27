package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.LongestCommonSubsequenceCalculator;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplFixedArray;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/TimeEfficientLongestCommonSubsequenceCalculator.php

*/

public final class TimeEfficientLongestCommonSubsequenceCalculator extends RuntimeClassBase
        implements LongestCommonSubsequenceCalculator {

    public TimeEfficientLongestCommonSubsequenceCalculator(RuntimeEnv env, Object... args) {
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
        if (ZVal.isNull(to)) {
            to = ZVal.newArray();
        }
        Object common = ZVal.newArray();
        Object width = null;
        Object fromLength = null;
        Object i = null;
        Object j = null;
        Object matrix = ZVal.newArray();
        Object toLength = null;
        Object o = null;
        common = ZVal.newArray();
        fromLength = CRArrayF.count.env(env).call(from).value();
        toLength = CRArrayF.count.env(env).call(to).value();
        width = ZVal.add(fromLength, 1);
        matrix = new SplFixedArray(env, ZVal.multiply(width, ZVal.add(toLength, 1)));
        for (i = 0; ZVal.isLessThanOrEqualTo(i, "<=", fromLength); i = ZVal.increment(i)) {
            ZVal.putArrayElement(matrix, i, 0);
        }

        for (j = 0; ZVal.isLessThanOrEqualTo(j, "<=", toLength); j = ZVal.increment(j)) {
            ZVal.putArrayElement(matrix, ZVal.multiply(j, width), 0);
        }

        for (i = 1; ZVal.isLessThanOrEqualTo(i, "<=", fromLength); i = ZVal.increment(i)) {
            for (j = 1; ZVal.isLessThanOrEqualTo(j, "<=", toLength); j = ZVal.increment(j)) {
                o = ZVal.add(ZVal.multiply(j, width), i);
                ZVal.putArrayElement(
                        matrix,
                        o,
                        NamespaceGlobal.max
                                .env(env)
                                .call(
                                        ZVal.getElement(matrix, ZVal.subtract(o, 1)),
                                        ZVal.getElement(matrix, ZVal.subtract(o, width)),
                                        ZVal.strictEqualityCheck(
                                                        ZVal.getElement(from, ZVal.subtract(i, 1)),
                                                        "===",
                                                        ZVal.getElement(to, ZVal.subtract(j, 1)))
                                                ? ZVal.add(
                                                        ZVal.getElement(
                                                                matrix,
                                                                ZVal.subtract(
                                                                        ZVal.subtract(o, width),
                                                                        1)),
                                                        1)
                                                : 0)
                                .value());
            }
        }

        i = ZVal.assign(fromLength);
        j = ZVal.assign(toLength);
        while (ZVal.toBool(ZVal.isGreaterThan(i, '>', 0))
                && ZVal.toBool(ZVal.isGreaterThan(j, '>', 0))) {
            if (ZVal.strictEqualityCheck(
                    ZVal.getElement(from, ZVal.subtract(i, 1)),
                    "===",
                    ZVal.getElement(to, ZVal.subtract(j, 1)))) {
                ZVal.addToArray(common, ZVal.getElement(from, ZVal.subtract(i, 1)));
                i = ZVal.decrement(i);
                j = ZVal.decrement(j);

            } else {
                o = ZVal.add(ZVal.multiply(j, width), i);
                if (ZVal.isGreaterThan(
                        ZVal.getElement(matrix, ZVal.subtract(o, width)),
                        '>',
                        ZVal.getElement(matrix, ZVal.subtract(o, 1)))) {
                    j = ZVal.decrement(j);

                } else {
                    i = ZVal.decrement(i);
                }
            }
        }

        return ZVal.assign(CRArrayF.array_reverse.env(env).call(common).value());
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\TimeEfficientLongestCommonSubsequenceCalculator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "SebastianBergmann\\Diff\\TimeEfficientLongestCommonSubsequenceCalculator")
                    .setLookup(
                            TimeEfficientLongestCommonSubsequenceCalculator.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/sebastian/diff/src/TimeEfficientLongestCommonSubsequenceCalculator.php")
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
