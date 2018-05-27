package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Totals;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.File;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Directory;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Node.php

*/

public abstract class Node extends RuntimeClassBase {

    public Object dom = null;

    public Object contextNode = null;

    public Node(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Node.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, null);
        env.callMethod(this, "setContextNode", Node.class, context);
        return null;
    }

    @ConvertedMethod
    public Object getDom(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("dom").value());
    }

    @ConvertedMethod
    public Object getTotals(RuntimeEnv env, Object... args) {
        Object totalsContainer = null;
        totalsContainer =
                ZVal.assign(
                        toObjectR(env.callMethod(this, "getContextNode", Node.class))
                                .accessProp(this, env)
                                .name("firstChild")
                                .value());
        if (!ZVal.isTrue(totalsContainer)) {
            totalsContainer =
                    env.callMethod(
                            env.callMethod(this, "getContextNode", Node.class),
                            "appendChild",
                            Node.class,
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("dom").value(),
                                    "createElementNS",
                                    Node.class,
                                    "http://schema.phpunit.de/coverage/1.0",
                                    "totals"));
        }

        return ZVal.assign(new Totals(env, totalsContainer));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object addDirectory(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object dirNode = null;
        dirNode =
                env.callMethod(
                        env.callMethod(this, "getDom", Node.class),
                        "createElementNS",
                        Node.class,
                        "http://schema.phpunit.de/coverage/1.0",
                        "directory");
        env.callMethod(dirNode, "setAttribute", Node.class, "name", name);
        env.callMethod(
                env.callMethod(this, "getContextNode", Node.class),
                "appendChild",
                Node.class,
                dirNode);
        return ZVal.assign(new Directory(env, dirNode));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "href", typeHint = "string")
    public Object addFile(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object href = assignParameter(args, 1, null);
        Object fileNode = null;
        fileNode =
                env.callMethod(
                        env.callMethod(this, "getDom", Node.class),
                        "createElementNS",
                        Node.class,
                        "http://schema.phpunit.de/coverage/1.0",
                        "file");
        env.callMethod(fileNode, "setAttribute", Node.class, "name", name);
        env.callMethod(fileNode, "setAttribute", Node.class, "href", href);
        env.callMethod(
                env.callMethod(this, "getContextNode", Node.class),
                "appendChild",
                Node.class,
                fileNode);
        return ZVal.assign(new File(env, fileNode));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    protected Object setContextNode(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("dom")
                .set(toObjectR(context).accessProp(this, env).name("ownerDocument").value());
        toObjectR(this).accessProp(this, env).name("contextNode").set(context);
        return null;
    }

    @ConvertedMethod
    protected Object getContextNode(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("contextNode").value());
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Node";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Node")
                    .setLookup(Node.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("contextNode", "dom")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Node.php")
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
