package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.xml.XMLWriter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Coverage.php

*/

public final class Coverage extends RuntimeClassBase {

    public Object writer = null;

    public Object contextNode = null;

    public Object finalized = false;

    public Coverage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Coverage.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "line", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, null);
        Object line = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("contextNode").set(context);
        toObjectR(this).accessProp(this, env).name("writer").set(new XMLWriter(env));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "openMemory",
                Coverage.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "startElementNS",
                Coverage.class,
                ZVal.getNull(),
                toObjectR(context).accessProp(this, env).name("nodeName").value(),
                "http://schema.phpunit.de/coverage/1.0");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "writeAttribute",
                Coverage.class,
                "nr",
                line);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "string")
    public Object addTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        if (toObjectR(this).accessProp(this, env).name("finalized").getBool()) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Coverage Report already finalized"));
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "startElement",
                Coverage.class,
                "covered");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "writeAttribute",
                Coverage.class,
                "by",
                test);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "endElement",
                Coverage.class);
        return null;
    }

    @ConvertedMethod
    public Object finalize(RuntimeEnv env, Object... args) {
        Object fragment = null;
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "endElement",
                Coverage.class);
        fragment =
                env.callMethod(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("contextNode")
                                .getObject()
                                .accessProp(this, env)
                                .name("ownerDocument")
                                .value(),
                        "createDocumentFragment",
                        Coverage.class);
        env.callMethod(
                fragment,
                "appendXML",
                Coverage.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("writer").value(),
                        "outputMemory",
                        Coverage.class));
        env.callMethod(
                toObjectR(this)
                        .accessProp(this, env)
                        .name("contextNode")
                        .getObject()
                        .accessProp(this, env)
                        .name("parentNode")
                        .value(),
                "replaceChild",
                Coverage.class,
                fragment,
                toObjectR(this).accessProp(this, env).name("contextNode").value());
        toObjectR(this).accessProp(this, env).name("finalized").set(true);
        return null;
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Coverage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Coverage")
                    .setLookup(Coverage.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("contextNode", "finalized", "writer")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Coverage.php")
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
