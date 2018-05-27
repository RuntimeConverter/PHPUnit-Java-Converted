package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Method;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Unit.php

*/

public final class Unit extends RuntimeClassBase {

    public Object contextNode = null;

    public Unit(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Unit.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, null);
        Object name = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("contextNode").set(context);
        env.callMethod(this, "setName", Unit.class, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start", typeHint = "int")
    @ConvertedParameter(index = 1, name = "executable", typeHint = "int")
    @ConvertedParameter(index = 2, name = "executed", typeHint = "int")
    public Object setLines(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, null);
        Object executable = assignParameter(args, 1, null);
        Object executed = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Unit.class,
                "start",
                start);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Unit.class,
                "executable",
                executable);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Unit.class,
                "executed",
                executed);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "crap", typeHint = "float")
    public Object setCrap(RuntimeEnv env, Object... args) {
        Object crap = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Unit.class,
                "crap",
                crap);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "full", typeHint = "string")
    @ConvertedParameter(index = 1, name = "package", typeHint = "string")
    @ConvertedParameter(index = 2, name = "sub", typeHint = "string")
    @ConvertedParameter(index = 3, name = "category", typeHint = "string")
    public Object setPackage(RuntimeEnv env, Object... args) {
        Object full = assignParameter(args, 0, null);
        Object _pPackage = assignParameter(args, 1, null);
        Object sub = assignParameter(args, 2, null);
        Object category = assignParameter(args, 3, null);
        Object node = null;
        node =
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                                "getElementsByTagNameNS",
                                Unit.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "package"),
                        "item",
                        Unit.class,
                        0);
        if (!ZVal.isTrue(node)) {
            node =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("contextNode").value(),
                            "appendChild",
                            Unit.class,
                            env.callMethod(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("contextNode")
                                            .getObject()
                                            .accessProp(this, env)
                                            .name("ownerDocument")
                                            .value(),
                                    "createElementNS",
                                    Unit.class,
                                    "http://schema.phpunit.de/coverage/1.0",
                                    "package"));
        }

        env.callMethod(node, "setAttribute", Unit.class, "full", full);
        env.callMethod(node, "setAttribute", Unit.class, "name", _pPackage);
        env.callMethod(node, "setAttribute", Unit.class, "sub", sub);
        env.callMethod(node, "setAttribute", Unit.class, "category", category);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace", typeHint = "string")
    public Object setNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, null);
        Object node = null;
        node =
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                                "getElementsByTagNameNS",
                                Unit.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "namespace"),
                        "item",
                        Unit.class,
                        0);
        if (!ZVal.isTrue(node)) {
            node =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("contextNode").value(),
                            "appendChild",
                            Unit.class,
                            env.callMethod(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("contextNode")
                                            .getObject()
                                            .accessProp(this, env)
                                            .name("ownerDocument")
                                            .value(),
                                    "createElementNS",
                                    Unit.class,
                                    "http://schema.phpunit.de/coverage/1.0",
                                    "namespace"));
        }

        env.callMethod(node, "setAttribute", Unit.class, "name", namespace);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object addMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object node = null;
        node =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("contextNode").value(),
                        "appendChild",
                        Unit.class,
                        env.callMethod(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("contextNode")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("ownerDocument")
                                        .value(),
                                "createElementNS",
                                Unit.class,
                                "http://schema.phpunit.de/coverage/1.0",
                                "method"));
        return ZVal.assign(new Method(env, node, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    private Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Unit.class,
                "name",
                name);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Unit";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Unit")
                    .setLookup(Unit.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("contextNode")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Unit.php")
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
