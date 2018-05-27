package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.DocBlock;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.MethodTagRetrieverInterface;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/LegacyClassTagRetriever.php

*/

public final class LegacyClassTagRetriever extends RuntimeClassBase
        implements MethodTagRetrieverInterface {

    public LegacyClassTagRetriever(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    public Object getTagList(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, null);
        Object phpdoc = null;
        phpdoc =
                new DocBlock(
                        env,
                        env.callMethod(
                                reflectionClass, "getDocComment", LegacyClassTagRetriever.class));
        return ZVal.assign(
                env.callMethod(phpdoc, "getTagsByName", LegacyClassTagRetriever.class, "method"));
    }

    public static final Object CONST_class = "Prophecy\\PhpDocumentor\\LegacyClassTagRetriever";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\PhpDocumentor\\LegacyClassTagRetriever")
                    .setLookup(
                            LegacyClassTagRetriever.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/LegacyClassTagRetriever.php")
                    .addInterface("MethodTagRetrieverInterface")
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
