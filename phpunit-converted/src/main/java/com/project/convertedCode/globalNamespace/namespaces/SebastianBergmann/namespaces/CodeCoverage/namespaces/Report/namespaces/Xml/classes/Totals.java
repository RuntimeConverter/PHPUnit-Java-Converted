package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Util;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Totals.php

*/

public final class Totals extends RuntimeClassBase {

    public Object container = null;

    public Object linesNode = null;

    public Object methodsNode = null;

    public Object functionsNode = null;

    public Object classesNode = null;

    public Object traitsNode = null;

    public Totals(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Totals.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "container", typeHint = "DOMElement")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, null);
        Object dom = null;
        toObjectR(this).accessProp(this, env).name("container").set(container);
        dom = ZVal.assign(toObjectR(container).accessProp(this, env).name("ownerDocument").value());
        toObjectR(this)
                .accessProp(this, env)
                .name("linesNode")
                .set(
                        env.callMethod(
                                dom,
                                "createElementNS",
                                Totals.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "lines"));
        toObjectR(this)
                .accessProp(this, env)
                .name("methodsNode")
                .set(
                        env.callMethod(
                                dom,
                                "createElementNS",
                                Totals.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "methods"));
        toObjectR(this)
                .accessProp(this, env)
                .name("functionsNode")
                .set(
                        env.callMethod(
                                dom,
                                "createElementNS",
                                Totals.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "functions"));
        toObjectR(this)
                .accessProp(this, env)
                .name("classesNode")
                .set(
                        env.callMethod(
                                dom,
                                "createElementNS",
                                Totals.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "classes"));
        toObjectR(this)
                .accessProp(this, env)
                .name("traitsNode")
                .set(
                        env.callMethod(
                                dom,
                                "createElementNS",
                                Totals.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "traits"));
        env.callMethod(
                container,
                "appendChild",
                Totals.class,
                toObjectR(this).accessProp(this, env).name("linesNode").value());
        env.callMethod(
                container,
                "appendChild",
                Totals.class,
                toObjectR(this).accessProp(this, env).name("methodsNode").value());
        env.callMethod(
                container,
                "appendChild",
                Totals.class,
                toObjectR(this).accessProp(this, env).name("functionsNode").value());
        env.callMethod(
                container,
                "appendChild",
                Totals.class,
                toObjectR(this).accessProp(this, env).name("classesNode").value());
        env.callMethod(
                container,
                "appendChild",
                Totals.class,
                toObjectR(this).accessProp(this, env).name("traitsNode").value());
        return null;
    }

    @ConvertedMethod
    public Object getContainer(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("container").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "loc", typeHint = "int")
    @ConvertedParameter(index = 1, name = "cloc", typeHint = "int")
    @ConvertedParameter(index = 2, name = "ncloc", typeHint = "int")
    @ConvertedParameter(index = 3, name = "executable", typeHint = "int")
    @ConvertedParameter(index = 4, name = "executed", typeHint = "int")
    public Object setNumLines(RuntimeEnv env, Object... args) {
        Object loc = assignParameter(args, 0, null);
        Object cloc = assignParameter(args, 1, null);
        Object ncloc = assignParameter(args, 2, null);
        Object executable = assignParameter(args, 3, null);
        Object executed = assignParameter(args, 4, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("linesNode").value(),
                "setAttribute",
                Totals.class,
                "total",
                loc);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("linesNode").value(),
                "setAttribute",
                Totals.class,
                "comments",
                cloc);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("linesNode").value(),
                "setAttribute",
                Totals.class,
                "code",
                ncloc);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("linesNode").value(),
                "setAttribute",
                Totals.class,
                "executable",
                executable);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("linesNode").value(),
                "setAttribute",
                Totals.class,
                "executed",
                executed);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("linesNode").value(),
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(executable, "===", 0)
                        ? 0
                        : NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, executed, executable))
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "tested", typeHint = "int")
    public Object setNumClasses(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, null);
        Object tested = assignParameter(args, 1, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("classesNode").value(),
                "setAttribute",
                Totals.class,
                "count",
                count);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("classesNode").value(),
                "setAttribute",
                Totals.class,
                "tested",
                tested);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("classesNode").value(),
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(count, "===", 0)
                        ? 0
                        : NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, tested, count))
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "tested", typeHint = "int")
    public Object setNumTraits(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, null);
        Object tested = assignParameter(args, 1, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("traitsNode").value(),
                "setAttribute",
                Totals.class,
                "count",
                count);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("traitsNode").value(),
                "setAttribute",
                Totals.class,
                "tested",
                tested);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("traitsNode").value(),
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(count, "===", 0)
                        ? 0
                        : NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, tested, count))
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "tested", typeHint = "int")
    public Object setNumMethods(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, null);
        Object tested = assignParameter(args, 1, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("methodsNode").value(),
                "setAttribute",
                Totals.class,
                "count",
                count);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("methodsNode").value(),
                "setAttribute",
                Totals.class,
                "tested",
                tested);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("methodsNode").value(),
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(count, "===", 0)
                        ? 0
                        : NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, tested, count))
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "tested", typeHint = "int")
    public Object setNumFunctions(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, null);
        Object tested = assignParameter(args, 1, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("functionsNode").value(),
                "setAttribute",
                Totals.class,
                "count",
                count);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("functionsNode").value(),
                "setAttribute",
                Totals.class,
                "tested",
                tested);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("functionsNode").value(),
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(count, "===", 0)
                        ? 0
                        : NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, tested, count))
                                .value());
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Totals";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Totals")
                    .setLookup(Totals.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "classesNode",
                            "container",
                            "functionsNode",
                            "linesNode",
                            "methodsNode",
                            "traitsNode")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Totals.php")
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
