package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ClassPatchInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/HhvmExceptionPatch.php

*/

public class HhvmExceptionPatch extends RuntimeClassBase implements ClassPatchInterface {

    public HhvmExceptionPatch(RuntimeEnv env, Object... args) {
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
        if (!function_defined.f.env(env).call("HHVM_VERSION").getBool()) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "Exception",
                                        "===",
                                        env.callMethod(
                                                node, "getParentClass", HhvmExceptionPatch.class)))
                        || ZVal.toBool(
                                NamespaceGlobal.is_subclass_of
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        node,
                                                        "getParentClass",
                                                        HhvmExceptionPatch.class),
                                                "Exception")
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        if (ZVal.isTrue(
                env.callMethod(node, "hasMethod", HhvmExceptionPatch.class, "setTraceOptions"))) {
            env.callMethod(
                    env.callMethod(node, "getMethod", HhvmExceptionPatch.class, "setTraceOptions"),
                    "useParentCode",
                    HhvmExceptionPatch.class);
        }

        if (ZVal.isTrue(
                env.callMethod(node, "hasMethod", HhvmExceptionPatch.class, "getTraceOptions"))) {
            env.callMethod(
                    env.callMethod(node, "getMethod", HhvmExceptionPatch.class, "getTraceOptions"),
                    "useParentCode",
                    HhvmExceptionPatch.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        return ZVal.assign(-50);
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\ClassPatch\\HhvmExceptionPatch";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\ClassPatch\\HhvmExceptionPatch")
                    .setLookup(HhvmExceptionPatch.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/HhvmExceptionPatch.php")
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
