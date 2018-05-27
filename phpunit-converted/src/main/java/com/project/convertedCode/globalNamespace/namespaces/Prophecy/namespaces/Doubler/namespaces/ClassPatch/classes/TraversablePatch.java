package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ClassPatchInterface;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.MethodNode;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/TraversablePatch.php

*/

public class TraversablePatch extends RuntimeClassBase implements ClassPatchInterface {

    public TraversablePatch(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object node = assignParameter(args, 0, null);
        Object _pInterface = null;
        if (CRArrayF.in_array
                .env(env)
                .call("Iterator", env.callMethod(node, "getInterfaces", TraversablePatch.class))
                .getBool()) {
            return ZVal.assign(false);
        }

        if (CRArrayF.in_array
                .env(env)
                .call(
                        "IteratorAggregate",
                        env.callMethod(node, "getInterfaces", TraversablePatch.class))
                .getBool()) {
            return ZVal.assign(false);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult59 :
                ZVal.getIterable(
                        env.callMethod(node, "getInterfaces", TraversablePatch.class), env, true)) {
            _pInterface = ZVal.assign(zpairResult59.getValue());
            if (ZVal.toBool(ZVal.strictNotEqualityCheck("Traversable", "!==", _pInterface))
                    && ZVal.toBool(
                            !NamespaceGlobal.is_subclass_of
                                    .env(env)
                                    .call(_pInterface, "Traversable")
                                    .getBool())) {
                continue;
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck("Iterator", "===", _pInterface))
                    || ZVal.toBool(
                            NamespaceGlobal.is_subclass_of
                                    .env(env)
                                    .call(_pInterface, "Iterator")
                                    .value())) {
                continue;
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck("IteratorAggregate", "===", _pInterface))
                    || ZVal.toBool(
                            NamespaceGlobal.is_subclass_of
                                    .env(env)
                                    .call(_pInterface, "IteratorAggregate")
                                    .value())) {
                continue;
            }

            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        env.callMethod(node, "addInterface", TraversablePatch.class, "Iterator");
        env.callMethod(node, "addMethod", TraversablePatch.class, new MethodNode(env, "current"));
        env.callMethod(node, "addMethod", TraversablePatch.class, new MethodNode(env, "key"));
        env.callMethod(node, "addMethod", TraversablePatch.class, new MethodNode(env, "next"));
        env.callMethod(node, "addMethod", TraversablePatch.class, new MethodNode(env, "rewind"));
        env.callMethod(node, "addMethod", TraversablePatch.class, new MethodNode(env, "valid"));
        return null;
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        return 100;
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\ClassPatch\\TraversablePatch";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\ClassPatch\\TraversablePatch")
                    .setLookup(TraversablePatch.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/TraversablePatch.php")
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
