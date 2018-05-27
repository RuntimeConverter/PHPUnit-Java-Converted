package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Node;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.BuildInformation;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Tests;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Project.php

*/

public final class Project extends Node {

    public Project(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Project.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, null);
        env.callMethod(this, "init", Project.class);
        env.callMethod(this, "setProjectSourceDirectory", Project.class, directory);
        return null;
    }

    @ConvertedMethod
    public Object getProjectSourceDirectory(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "getContextNode", Project.class),
                        "getAttribute",
                        Project.class,
                        "source"));
    }

    @ConvertedMethod
    public Object getBuildInformation(RuntimeEnv env, Object... args) {
        Object buildNode = null;
        buildNode =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "getDom", Project.class),
                                "getElementsByTagNameNS",
                                Project.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "build"),
                        "item",
                        Project.class,
                        0);
        if (!ZVal.isTrue(buildNode)) {
            buildNode =
                    env.callMethod(
                            toObjectR(env.callMethod(this, "getDom", Project.class))
                                    .accessProp(this, env)
                                    .name("documentElement")
                                    .value(),
                            "appendChild",
                            Project.class,
                            env.callMethod(
                                    env.callMethod(this, "getDom", Project.class),
                                    "createElementNS",
                                    Project.class,
                                    "http://schema.phpunit.de/coverage/1.0",
                                    "build"));
        }

        return ZVal.assign(new BuildInformation(env, buildNode));
    }

    @ConvertedMethod
    public Object getTests(RuntimeEnv env, Object... args) {
        Object testsNode = null;
        testsNode =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "getContextNode", Project.class),
                                "getElementsByTagNameNS",
                                Project.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "tests"),
                        "item",
                        Project.class,
                        0);
        if (!ZVal.isTrue(testsNode)) {
            testsNode =
                    env.callMethod(
                            env.callMethod(this, "getContextNode", Project.class),
                            "appendChild",
                            Project.class,
                            env.callMethod(
                                    env.callMethod(this, "getDom", Project.class),
                                    "createElementNS",
                                    Project.class,
                                    "http://schema.phpunit.de/coverage/1.0",
                                    "tests"));
        }

        return ZVal.assign(new Tests(env, testsNode));
    }

    @ConvertedMethod
    public Object asDom(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getDom", Project.class));
    }

    @ConvertedMethod
    private Object init(RuntimeEnv env, Object... args) {
        Object dom = null;
        dom = new DOMDocument(env);
        env.callMethod(
                dom,
                "loadXML",
                Project.class,
                "<?xml version=\"1.0\" ?><phpunit xmlns=\"http://schema.phpunit.de/coverage/1.0\"><build/><project/></phpunit>");
        env.callMethod(
                this,
                "setContextNode",
                Project.class,
                env.callMethod(
                        env.callMethod(
                                dom,
                                "getElementsByTagNameNS",
                                Project.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "project"),
                        "item",
                        Project.class,
                        0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    private Object setProjectSourceDirectory(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(
                env.callMethod(this, "getContextNode", Project.class),
                "setAttribute",
                Project.class,
                "source",
                name);
        return null;
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Project";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Node.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Project")
                    .setLookup(Project.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("contextNode", "dom")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Project.php")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Node")
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
