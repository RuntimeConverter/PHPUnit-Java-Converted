package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.DocBlockFactory;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.ContextFactory;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.MethodTagRetrieverInterface;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/ClassTagRetriever.php

*/

public final class ClassTagRetriever extends RuntimeClassBase
        implements MethodTagRetrieverInterface {

    public Object docBlockFactory = null;

    public Object contextFactory = null;

    public ClassTagRetriever(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassTagRetriever.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("docBlockFactory")
                .set(DocBlockFactory.runtimeStaticObject.createInstance(env));
        toObjectR(this).accessProp(this, env).name("contextFactory").set(new ContextFactory(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    public Object getTagList(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, null);
        Object e = null;
        Object phpdoc = null;
        try {
            phpdoc =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("docBlockFactory").value(),
                            "create",
                            ClassTagRetriever.class,
                            reflectionClass,
                            env.callMethod(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("contextFactory")
                                            .value(),
                                    "createFromReflector",
                                    ClassTagRetriever.class,
                                    reflectionClass));
            return ZVal.assign(
                    env.callMethod(phpdoc, "getTagsByName", ClassTagRetriever.class, "method"));
        } catch (ConvertedException convertedException12) {
            if (convertedException12.instanceOf(
                    InvalidArgumentException.class, "InvalidArgumentException")) {
                e = convertedException12.getObject();
                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException12;
            }
        }
    }

    public static final Object CONST_class = "Prophecy\\PhpDocumentor\\ClassTagRetriever";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\PhpDocumentor\\ClassTagRetriever")
                    .setLookup(ClassTagRetriever.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("contextFactory", "docBlockFactory")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/ClassTagRetriever.php")
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
