package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ClassPatchInterface;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.MethodNode;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/SplFileInfoPatch.php

*/

public class SplFileInfoPatch extends RuntimeClassBase implements ClassPatchInterface {

    public SplFileInfoPatch(RuntimeEnv env, Object... args) {
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
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.callMethod(node, "getParentClass", SplFileInfoPatch.class))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "SplFileInfo",
                                        "===",
                                        env.callMethod(
                                                node, "getParentClass", SplFileInfoPatch.class)))
                        || ZVal.toBool(
                                NamespaceGlobal.is_subclass_of
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        node,
                                                        "getParentClass",
                                                        SplFileInfoPatch.class),
                                                "SplFileInfo")
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
        Object filePath = null;
        Object constructor = null;
        if (ZVal.isTrue(env.callMethod(node, "hasMethod", SplFileInfoPatch.class, "__construct"))) {
            constructor = env.callMethod(node, "getMethod", SplFileInfoPatch.class, "__construct");

        } else {
            constructor = new MethodNode(env, "__construct");
            env.callMethod(node, "addMethod", SplFileInfoPatch.class, constructor);
        }

        if (ZVal.isTrue(
                env.callMethod(this, "nodeIsDirectoryIterator", SplFileInfoPatch.class, node))) {
            env.callMethod(
                    constructor,
                    "setCode",
                    SplFileInfoPatch.class,
                    "return parent::__construct(\""
                            + toStringR(
                                    env.addRootFilesystemPrefix(
                                            "/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch"),
                                    env)
                            + "\");");
            return null;
        }

        if (ZVal.isTrue(
                env.callMethod(this, "nodeIsSplFileObject", SplFileInfoPatch.class, node))) {
            filePath =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    "\\",
                                    "\\\\",
                                    env.addRootFilesystemPrefix(
                                            "/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/SplFileInfoPatch.php"))
                            .value();
            env.callMethod(
                    constructor,
                    "setCode",
                    SplFileInfoPatch.class,
                    "return parent::__construct(\"" + toStringR(filePath, env) + "\");");
            return null;
        }

        if (ZVal.isTrue(
                env.callMethod(this, "nodeIsSymfonySplFileInfo", SplFileInfoPatch.class, node))) {
            filePath =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    "\\",
                                    "\\\\",
                                    env.addRootFilesystemPrefix(
                                            "/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/SplFileInfoPatch.php"))
                            .value();
            env.callMethod(
                    constructor,
                    "setCode",
                    SplFileInfoPatch.class,
                    "return parent::__construct(\""
                            + toStringR(filePath, env)
                            + "\", \"\", \"\");");
            return null;
        }

        env.callMethod(constructor, "useParentCode", SplFileInfoPatch.class);
        return null;
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        return 50;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object nodeIsDirectoryIterator(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object parent = null;
        parent = env.callMethod(node, "getParentClass", SplFileInfoPatch.class);
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck("DirectoryIterator", "===", parent))
                        || ZVal.toBool(
                                NamespaceGlobal.is_subclass_of
                                        .env(env)
                                        .call(parent, "DirectoryIterator")
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object nodeIsSplFileObject(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object parent = null;
        parent = env.callMethod(node, "getParentClass", SplFileInfoPatch.class);
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck("SplFileObject", "===", parent))
                        || ZVal.toBool(
                                NamespaceGlobal.is_subclass_of
                                        .env(env)
                                        .call(parent, "SplFileObject")
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object nodeIsSymfonySplFileInfo(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object parent = null;
        parent = env.callMethod(node, "getParentClass", SplFileInfoPatch.class);
        return ZVal.assign(
                ZVal.strictEqualityCheck("Symfony\\Component\\Finder\\SplFileInfo", "===", parent));
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\ClassPatch\\SplFileInfoPatch";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\ClassPatch\\SplFileInfoPatch")
                    .setLookup(SplFileInfoPatch.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/SplFileInfoPatch.php")
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
