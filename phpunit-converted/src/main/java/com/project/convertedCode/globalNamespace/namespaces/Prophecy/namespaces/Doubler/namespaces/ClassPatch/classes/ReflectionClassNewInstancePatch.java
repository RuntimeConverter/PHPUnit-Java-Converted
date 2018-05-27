package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ClassPatchInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/ReflectionClassNewInstancePatch.php

*/

public class ReflectionClassNewInstancePatch extends RuntimeClassBase
        implements ClassPatchInterface {

    public ReflectionClassNewInstancePatch(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        "ReflectionClass",
                        "===",
                        env.callMethod(
                                node, "getParentClass", ReflectionClassNewInstancePatch.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object argument = null;
        for (ZPair zpairResult58 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(
                                        node,
                                        "getMethod",
                                        ReflectionClassNewInstancePatch.class,
                                        "newInstance"),
                                "getArguments",
                                ReflectionClassNewInstancePatch.class),
                        env,
                        true)) {
            argument = ZVal.assign(zpairResult58.getValue());
            env.callMethod(
                    argument, "setDefault", ReflectionClassNewInstancePatch.class, ZVal.getNull());
        }

        return null;
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        return 50;
    }

    public static final Object CONST_class =
            "Prophecy\\Doubler\\ClassPatch\\ReflectionClassNewInstancePatch";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\ClassPatch\\ReflectionClassNewInstancePatch")
                    .setLookup(
                            ReflectionClassNewInstancePatch.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/ReflectionClassNewInstancePatch.php")
                    .addInterface("ClassPatchInterface")
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
