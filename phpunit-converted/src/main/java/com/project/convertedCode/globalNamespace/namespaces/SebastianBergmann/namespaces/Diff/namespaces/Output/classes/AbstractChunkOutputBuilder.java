package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.DiffOutputBuilderInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Output/AbstractChunkOutputBuilder.php

*/

public abstract class AbstractChunkOutputBuilder extends RuntimeClassBase
        implements DiffOutputBuilderInterface {

    public AbstractChunkOutputBuilder(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "lineThreshold",
        typeHint = "int",
        defaultValue = "5",
        defaultValueType = "number"
    )
    protected Object getCommonChunks(RuntimeEnv env, Object... args) {
        Object diff = assignParameter(args, 0, null);
        if (ZVal.isNull(diff)) {
            diff = ZVal.newArray();
        }
        Object lineThreshold = assignParameter(args, 1, null);
        if (ZVal.isNull(lineThreshold)) {
            lineThreshold = 5;
        }
        Object diffSize = null;
        Object chunkSize = null;
        Object capturing = null;
        Object commonChunks = ZVal.newArray();
        Object i = null;
        Object chunkStart = null;
        diffSize = CRArrayF.count.env(env).call(diff).value();
        capturing = false;
        chunkStart = 0;
        chunkSize = 0;
        commonChunks = ZVal.newArray();
        for (i = 0; ZVal.isLessThan(i, '<', diffSize); i = ZVal.increment(i)) {
            if (ZVal.strictEqualityCheck(ZVal.getElementRecursive(diff, i, 1), "===", 0)) {
                if (ZVal.strictEqualityCheck(capturing, "===", false)) {
                    capturing = true;
                    chunkStart = ZVal.assign(i);
                    chunkSize = 0;

                } else {
                    chunkSize = ZVal.increment(chunkSize);
                }

            } else if (ZVal.strictNotEqualityCheck(capturing, "!==", false)) {
                if (ZVal.isGreaterThanOrEqualTo(chunkSize, ">=", lineThreshold)) {
                    ZVal.putArrayElement(commonChunks, chunkStart, ZVal.add(chunkStart, chunkSize));
                }

                capturing = false;
            }
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(capturing, "!==", false))
                && ZVal.toBool(ZVal.isGreaterThanOrEqualTo(chunkSize, ">=", lineThreshold))) {
            ZVal.putArrayElement(commonChunks, chunkStart, ZVal.add(chunkStart, chunkSize));
        }

        return ZVal.assign(commonChunks);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\AbstractChunkOutputBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Output\\AbstractChunkOutputBuilder")
                    .setLookup(
                            AbstractChunkOutputBuilder.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/diff/src/Output/AbstractChunkOutputBuilder.php")
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
