package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ElementCollection;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ComponentElement;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/ComponentElementCollection.php

*/

public class ComponentElementCollection extends ElementCollection {

    public ComponentElementCollection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ComponentElementCollection.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ComponentElement(
                        env,
                        env.callMethod(
                                this, "getCurrentElement", ComponentElementCollection.class)));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ComponentElementCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ElementCollection.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ComponentElementCollection")
                    .setLookup(
                            ComponentElementCollection.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("nodeList", "position")
                    .setFilename("vendor/phar-io/manifest/src/xml/ComponentElementCollection.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addExtendsClass("PharIo\\Manifest\\ElementCollection")
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
