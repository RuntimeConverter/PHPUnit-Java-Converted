package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Method;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Unit;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Source;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.File;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Report.php

*/

public final class Report extends File {

    public Report(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Report.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object dom = null;
        Object contextNode = null;
        dom = new DOMDocument(env);
        env.callMethod(
                dom,
                "loadXML",
                Report.class,
                "<?xml version=\"1.0\" ?><phpunit xmlns=\"http://schema.phpunit.de/coverage/1.0\"><file /></phpunit>");
        contextNode =
                env.callMethod(
                        env.callMethod(
                                dom,
                                "getElementsByTagNameNS",
                                Report.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "file"),
                        "item",
                        Report.class,
                        0);
        super.__construct(env, contextNode);
        env.callMethod(this, "setName", Report.class, name);
        return null;
    }

    @ConvertedMethod
    public Object asDom(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getDomDocument", Report.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getFunctionObject(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object node = null;
        node =
                env.callMethod(
                        env.callMethod(this, "getContextNode", Report.class),
                        "appendChild",
                        Report.class,
                        env.callMethod(
                                env.callMethod(this, "getDomDocument", Report.class),
                                "createElementNS",
                                Report.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "function"));
        return ZVal.assign(new Method(env, node, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getClassObject(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return ZVal.assign(env.callMethod(this, "getUnitObject", Report.class, "class", name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getTraitObject(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return ZVal.assign(env.callMethod(this, "getUnitObject", Report.class, "trait", name));
    }

    @ConvertedMethod
    public Object getSource(RuntimeEnv env, Object... args) {
        Object source = null;
        source =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "getContextNode", Report.class),
                                "getElementsByTagNameNS",
                                Report.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "source"),
                        "item",
                        Report.class,
                        0);
        if (!ZVal.isTrue(source)) {
            source =
                    env.callMethod(
                            env.callMethod(this, "getContextNode", Report.class),
                            "appendChild",
                            Report.class,
                            env.callMethod(
                                    env.callMethod(this, "getDomDocument", Report.class),
                                    "createElementNS",
                                    Report.class,
                                    "http://schema.phpunit.de/coverage/1.0",
                                    "source"));
        }

        return ZVal.assign(new Source(env, source));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(
                env.callMethod(this, "getContextNode", Report.class),
                "setAttribute",
                Report.class,
                "name",
                NamespaceGlobal.basename.env(env).call(name).value());
        env.callMethod(
                env.callMethod(this, "getContextNode", Report.class),
                "setAttribute",
                Report.class,
                "path",
                NamespaceGlobal.dirname.env(env).call(name).value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagName")
    @ConvertedParameter(index = 1, name = "name")
    private Object getUnitObject(RuntimeEnv env, Object... args) {
        Object tagName = assignParameter(args, 0, null);
        Object name = assignParameter(args, 1, null);
        Object node = null;
        node =
                env.callMethod(
                        env.callMethod(this, "getContextNode", Report.class),
                        "appendChild",
                        Report.class,
                        env.callMethod(
                                env.callMethod(this, "getDomDocument", Report.class),
                                "createElementNS",
                                Report.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                tagName));
        return ZVal.assign(new Unit(env, node, name));
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Report";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends File.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Report")
                    .setLookup(Report.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("contextNode", "dom")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Report.php")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\Report\\Xml\\File")
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
