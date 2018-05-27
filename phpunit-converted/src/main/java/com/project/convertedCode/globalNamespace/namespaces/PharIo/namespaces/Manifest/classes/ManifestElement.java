package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMElement;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestElementException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/ManifestElement.php

*/

public class ManifestElement extends RuntimeClassBase {

    public Object element = null;

    public ManifestElement(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ManifestElement.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("element").set(element);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getAttributeValue(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("element").value(),
                        "hasAttribute",
                        ManifestElement.class,
                        name))) {
            throw ZVal.getException(
                    env,
                    new ManifestElementException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Attribute %s not set on element %s",
                                            name,
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("element")
                                                    .getObject()
                                                    .accessProp(this, env)
                                                    .name("localName")
                                                    .value())
                                    .value()));
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("element").value(),
                        "getAttribute",
                        ManifestElement.class,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elementName")
    protected Object getChildByName(RuntimeEnv env, Object... args) {
        Object elementName = assignParameter(args, 0, null);
        Object element = null;
        element =
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("element").value(),
                                "getElementsByTagNameNS",
                                ManifestElement.class,
                                CONST_XMLNS,
                                elementName),
                        "item",
                        ManifestElement.class,
                        0);
        if (!ZVal.isTrue(ZVal.checkInstanceType(element, DOMElement.class, "DOMElement"))) {
            throw ZVal.getException(
                    env,
                    new ManifestElementException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Element %s missing", elementName)
                                    .value()));
        }

        return ZVal.assign(element);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elementName")
    protected Object getChildrenByName(RuntimeEnv env, Object... args) {
        Object elementName = assignParameter(args, 0, null);
        Object elementList = null;
        elementList =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("element").value(),
                        "getElementsByTagNameNS",
                        ManifestElement.class,
                        CONST_XMLNS,
                        elementName);
        if (ZVal.strictEqualityCheck(
                toObjectR(elementList).accessProp(this, env).name("length").value(), "===", 0)) {
            throw ZVal.getException(
                    env,
                    new ManifestElementException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Element(s) %s missing", elementName)
                                    .value()));
        }

        return ZVal.assign(elementList);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elementName")
    protected Object hasChild(RuntimeEnv env, Object... args) {
        Object elementName = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        toObjectR(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("element")
                                                        .value(),
                                                "getElementsByTagNameNS",
                                                ManifestElement.class,
                                                CONST_XMLNS,
                                                elementName))
                                .accessProp(this, env)
                                .name("length")
                                .value(),
                        "!==",
                        0));
    }

    public static final Object CONST_XMLNS = "https://phar.io/xml/manifest/1.0";

    public static final Object CONST_class = "PharIo\\Manifest\\ManifestElement";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ManifestElement")
                    .setLookup(ManifestElement.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("element")
                    .setFilename("vendor/phar-io/manifest/src/xml/ManifestElement.php")
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
