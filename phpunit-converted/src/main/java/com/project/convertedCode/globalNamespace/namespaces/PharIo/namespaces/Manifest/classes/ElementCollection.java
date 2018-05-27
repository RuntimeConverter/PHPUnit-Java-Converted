package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/ElementCollection.php

*/

public abstract class ElementCollection extends RuntimeClassBase implements Iterator {

    public Object nodeList = null;

    public Object position = null;

    public ElementCollection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ElementCollection.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodeList", typeHint = "DOMNodeList")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object nodeList = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("nodeList").set(nodeList);
        toObjectR(this).accessProp(this, env).name("position").set(0);
        return null;
    }

    @ConvertedMethod
    public abstract Object current(RuntimeEnv env, Object... args);

    @ConvertedMethod
    protected Object getCurrentElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("nodeList").value(),
                        "item",
                        ElementCollection.class,
                        toObjectR(this).accessProp(this, env).name("position").value()));
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("position")
                .set(
                        ZVal.increment(
                                toObjectR(this).accessProp(this, env).name("position").value()));
        return null;
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("position").value());
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(
                        toObjectR(this).accessProp(this, env).name("position").value(),
                        '<',
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("nodeList")
                                .getObject()
                                .accessProp(this, env)
                                .name("length")
                                .value()));
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("position").set(0);
        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ElementCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ElementCollection")
                    .setLookup(ElementCollection.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("nodeList", "position")
                    .setFilename("vendor/phar-io/manifest/src/xml/ElementCollection.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
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
