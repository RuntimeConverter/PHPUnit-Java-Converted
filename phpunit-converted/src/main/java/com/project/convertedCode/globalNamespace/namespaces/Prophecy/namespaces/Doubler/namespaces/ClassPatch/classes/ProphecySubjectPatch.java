package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.ArgumentNode;
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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/ProphecySubjectPatch.php

*/

public class ProphecySubjectPatch extends RuntimeClassBase implements ClassPatchInterface {

    public ProphecySubjectPatch(RuntimeEnv env, Object... args) {
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
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object node = assignParameter(args, 0, null);
        Object prophecyArgument = null;
        Object method = null;
        Object name = null;
        Object __call = null;
        Object prophecyGetter = null;
        Object prophecySetter = null;
        env.callMethod(
                node,
                "addInterface",
                ProphecySubjectPatch.class,
                "Prophecy\\Prophecy\\ProphecySubjectInterface");
        env.callMethod(
                node, "addProperty", ProphecySubjectPatch.class, "objectProphecy", "private");
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult57 :
                ZVal.getIterable(
                        env.callMethod(node, "getMethods", ProphecySubjectPatch.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult57.getKey());
            method = ZVal.assign(zpairResult57.getValue());
            if (ZVal.strictEqualityCheck(
                    "__construct", "===", NamespaceGlobal.strtolower.env(env).call(name).value())) {
                continue;
            }

            if (ZVal.strictEqualityCheck(
                    env.callMethod(method, "getReturnType", ProphecySubjectPatch.class),
                    "===",
                    "void")) {
                env.callMethod(
                        method,
                        "setCode",
                        ProphecySubjectPatch.class,
                        "$this->getProphecy()->makeProphecyMethodCall(__FUNCTION__, func_get_args());");

            } else {
                env.callMethod(
                        method,
                        "setCode",
                        ProphecySubjectPatch.class,
                        "return $this->getProphecy()->makeProphecyMethodCall(__FUNCTION__, func_get_args());");
            }
        }

        prophecySetter = new MethodNode(env, "setProphecy");
        prophecyArgument = new ArgumentNode(env, "prophecy");
        env.callMethod(
                prophecyArgument,
                "setTypeHint",
                ProphecySubjectPatch.class,
                "Prophecy\\Prophecy\\ProphecyInterface");
        env.callMethod(prophecySetter, "addArgument", ProphecySubjectPatch.class, prophecyArgument);
        env.callMethod(
                prophecySetter,
                "setCode",
                ProphecySubjectPatch.class,
                "$this->objectProphecy = $prophecy;");
        prophecyGetter = new MethodNode(env, "getProphecy");
        env.callMethod(
                prophecyGetter,
                "setCode",
                ProphecySubjectPatch.class,
                "return $this->objectProphecy;");
        if (ZVal.isTrue(env.callMethod(node, "hasMethod", ProphecySubjectPatch.class, "__call"))) {
            __call = env.callMethod(node, "getMethod", ProphecySubjectPatch.class, "__call");

        } else {
            __call = new MethodNode(env, "__call");
            env.callMethod(
                    __call,
                    "addArgument",
                    ProphecySubjectPatch.class,
                    new ArgumentNode(env, "name"));
            env.callMethod(
                    __call,
                    "addArgument",
                    ProphecySubjectPatch.class,
                    new ArgumentNode(env, "arguments"));
            env.callMethod(node, "addMethod", ProphecySubjectPatch.class, __call);
        }

        env.callMethod(
                __call,
                "setCode",
                ProphecySubjectPatch.class,
                "throw new \\Prophecy\\Exception\\Doubler\\MethodNotFoundException(\n    sprintf('Method `%s::%s()` not found.', get_class($this), func_get_arg(0)),\n    $this->getProphecy(), func_get_arg(0)\n);");
        env.callMethod(node, "addMethod", ProphecySubjectPatch.class, prophecySetter);
        env.callMethod(node, "addMethod", ProphecySubjectPatch.class, prophecyGetter);
        return null;
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        return 0;
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\ClassPatch\\ProphecySubjectPatch";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\ClassPatch\\ProphecySubjectPatch")
                    .setLookup(ProphecySubjectPatch.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/ProphecySubjectPatch.php")
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
