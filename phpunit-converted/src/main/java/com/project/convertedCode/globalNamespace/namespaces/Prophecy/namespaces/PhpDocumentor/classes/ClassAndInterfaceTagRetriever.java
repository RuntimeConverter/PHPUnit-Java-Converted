package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.ClassTagRetriever;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.LegacyClassTagRetriever;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.MethodTagRetrieverInterface;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/ClassAndInterfaceTagRetriever.php

*/

public final class ClassAndInterfaceTagRetriever extends RuntimeClassBase
        implements MethodTagRetrieverInterface {

    public Object classRetriever = null;

    public ClassAndInterfaceTagRetriever(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassAndInterfaceTagRetriever.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "classRetriever",
        typeHint = "Prophecy\\PhpDocumentor\\MethodTagRetrieverInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object classRetriever = assignParameter(args, 0, null);
        if (ZVal.isNull(classRetriever)) {
            classRetriever = ZVal.getNull();
        }
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", classRetriever)) {
            toObjectR(this).accessProp(this, env).name("classRetriever").set(classRetriever);
            return null;
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("classRetriever")
                .set(
                        ZVal.toBool(
                                                function_class_exists
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "phpDocumentor\\Reflection\\DocBlockFactory")
                                                        .value())
                                        && ZVal.toBool(
                                                function_class_exists
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "phpDocumentor\\Reflection\\Types\\ContextFactory")
                                                        .value())
                                ? new ClassTagRetriever(env)
                                : new LegacyClassTagRetriever(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    public Object getTagList(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, null);
        return ZVal.assign(
                CRArrayF.array_merge
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("classRetriever")
                                                .value(),
                                        "getTagList",
                                        ClassAndInterfaceTagRetriever.class,
                                        reflectionClass),
                                env.callMethod(
                                        this,
                                        "getInterfacesTagList",
                                        ClassAndInterfaceTagRetriever.class,
                                        reflectionClass))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    private Object getInterfacesTagList(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, null);
        Object tagList = null;
        Object interfaces = null;
        Object _pInterface = null;
        interfaces =
                env.callMethod(
                        reflectionClass, "getInterfaces", ClassAndInterfaceTagRetriever.class);
        tagList = ZVal.newArray();
        for (ZPair zpairResult70 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult70.getValue());
            tagList =
                    CRArrayF.array_merge
                            .env(env)
                            .call(
                                    tagList,
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("classRetriever")
                                                    .value(),
                                            "getTagList",
                                            ClassAndInterfaceTagRetriever.class,
                                            _pInterface))
                            .value();
        }

        return ZVal.assign(tagList);
    }

    public static final Object CONST_class =
            "Prophecy\\PhpDocumentor\\ClassAndInterfaceTagRetriever";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\PhpDocumentor\\ClassAndInterfaceTagRetriever")
                    .setLookup(
                            ClassAndInterfaceTagRetriever.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("classRetriever")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/ClassAndInterfaceTagRetriever.php")
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
