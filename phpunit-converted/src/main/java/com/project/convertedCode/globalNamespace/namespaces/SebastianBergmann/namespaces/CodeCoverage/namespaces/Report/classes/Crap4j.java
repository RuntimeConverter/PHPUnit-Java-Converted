package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.File;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Crap4j.php

*/

public final class Crap4j extends RuntimeClassBase {

    public Object threshold = null;

    public Crap4j(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Crap4j.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "threshold",
        typeHint = "int",
        defaultValue = "30",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object threshold = assignParameter(args, 0, null);
        if (ZVal.isNull(threshold)) {
            threshold = 30;
        }
        toObjectR(this).accessProp(this, env).name("threshold").set(threshold);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    @ConvertedParameter(
        index = 1,
        name = "target",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object process(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object coverage = assignParameter(args, 0, null);
        Object target = assignParameter(args, 1, null);
        if (ZVal.isNull(target)) {
            target = ZVal.getNull();
        }
        Object name = assignParameter(args, 2, null);
        if (ZVal.isNull(name)) {
            name = ZVal.getNull();
        }
        Object fullMethodCount = null;
        Object fullCrap = null;
        Object document = null;
        Object classes = null;
        Object project = null;
        Object className = null;
        Object crapLoad = null;
        Object fullCrapMethodCount = null;
        Object crapMethodPercent = null;
        Object file = null;
        Object stats = null;
        Object root = null;
        Object buffer = null;
        Object methodsNode = null;
        Object _pClass = ZVal.newArray();
        Object fullCrapLoad = null;
        Object item = null;
        Object method = ZVal.newArray();
        Object methodNode = null;
        Object _SERVER = env.getGlobal("_SERVER");
        Object methodName = null;
        Object report = null;
        Object namespace = null;
        document = new DOMDocument(env, "1.0", "UTF-8");
        toObjectR(document).accessProp(this, env).name("formatOutput").set(true);
        root = env.callMethod(document, "createElement", Crap4j.class, "crap_result");
        env.callMethod(document, "appendChild", Crap4j.class, root);
        project =
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "project",
                        function_is_string.f.env(env).call(name).getBool() ? name : "");
        env.callMethod(root, "appendChild", Crap4j.class, project);
        env.callMethod(
                root,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "timestamp",
                        NamespaceGlobal.date
                                .env(env)
                                .call(
                                        "Y-m-d H:i:s",
                                        ZVal.toLong(ZVal.getElement(_SERVER, "REQUEST_TIME")))
                                .value()));
        stats = env.callMethod(document, "createElement", Crap4j.class, "stats");
        methodsNode = env.callMethod(document, "createElement", Crap4j.class, "methods");
        report = env.callMethod(coverage, "getReport", Crap4j.class);
        coverage = null;
        fullMethodCount = 0;
        fullCrapMethodCount = 0;
        fullCrapLoad = 0;
        fullCrap = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult170 : ZVal.getIterable(report, env, true)) {
            item = ZVal.assign(zpairResult170.getValue());
            namespace = "global";
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            item, File.class, "SebastianBergmann\\CodeCoverage\\Node\\File"))) {
                continue;
            }

            file = env.callMethod(document, "createElement", Crap4j.class, "file");
            env.callMethod(
                    file,
                    "setAttribute",
                    Crap4j.class,
                    "name",
                    env.callMethod(item, "getPath", Crap4j.class));
            classes = env.callMethod(item, "getClassesAndTraits", Crap4j.class);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult171 : ZVal.getIterable(classes, env, false)) {
                className = ZVal.assign(zpairResult171.getKey());
                _pClass = ZVal.assign(zpairResult171.getValue());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult172 :
                        ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, false)) {
                    methodName = ZVal.assign(zpairResult172.getKey());
                    method = ZVal.assign(zpairResult172.getValue());
                    crapLoad =
                            env.callMethod(
                                    this,
                                    "getCrapLoad",
                                    Crap4j.class,
                                    ZVal.getElement(method, "crap"),
                                    ZVal.getElement(method, "ccn"),
                                    ZVal.getElement(method, "coverage"));
                    fullCrap = ZAssignment.add("+=", fullCrap, ZVal.getElement(method, "crap"));
                    fullCrapLoad = ZAssignment.add("+=", fullCrapLoad, crapLoad);
                    fullMethodCount = ZVal.increment(fullMethodCount);
                    if (ZVal.isGreaterThanOrEqualTo(
                            ZVal.getElement(method, "crap"),
                            ">=",
                            toObjectR(this).accessProp(this, env).name("threshold").value())) {
                        fullCrapMethodCount = ZVal.increment(fullCrapMethodCount);
                    }

                    methodNode = env.callMethod(document, "createElement", Crap4j.class, "method");
                    if (!ZVal.isEmpty(ZVal.getElementRecursive(_pClass, "package", "namespace"))) {
                        namespace =
                                ZVal.assign(
                                        ZVal.getElementRecursive(_pClass, "package", "namespace"));
                    }

                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document, "createElement", Crap4j.class, "package", namespace));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "className",
                                    className));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "methodName",
                                    methodName));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "methodSignature",
                                    NamespaceGlobal.htmlspecialchars
                                            .env(env)
                                            .call(ZVal.getElement(method, "signature"))
                                            .value()));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "fullMethod",
                                    NamespaceGlobal.htmlspecialchars
                                            .env(env)
                                            .call(ZVal.getElement(method, "signature"))
                                            .value()));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "crap",
                                    env.callMethod(
                                            this,
                                            "roundValue",
                                            Crap4j.class,
                                            ZVal.getElement(method, "crap"))));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "complexity",
                                    ZVal.getElement(method, "ccn")));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "coverage",
                                    env.callMethod(
                                            this,
                                            "roundValue",
                                            Crap4j.class,
                                            ZVal.getElement(method, "coverage"))));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "crapLoad",
                                    NamespaceGlobal.round.env(env).call(crapLoad).value()));
                    env.callMethod(methodsNode, "appendChild", Crap4j.class, methodNode);
                }
            }
        }

        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document, "createElement", Crap4j.class, "name", "Method Crap Stats"));
        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document, "createElement", Crap4j.class, "methodCount", fullMethodCount));
        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "crapMethodCount",
                        fullCrapMethodCount));
        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "crapLoad",
                        NamespaceGlobal.round.env(env).call(fullCrapLoad).value()));
        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(document, "createElement", Crap4j.class, "totalCrap", fullCrap));
        crapMethodPercent = 0;
        if (ZVal.isGreaterThan(fullMethodCount, '>', 0)) {
            crapMethodPercent =
                    env.callMethod(
                            this,
                            "roundValue",
                            Crap4j.class,
                            ZVal.divide(ZVal.multiply(100, fullCrapMethodCount), fullMethodCount));
        }

        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "crapMethodPercent",
                        crapMethodPercent));
        env.callMethod(root, "appendChild", Crap4j.class, stats);
        env.callMethod(root, "appendChild", Crap4j.class, methodsNode);
        buffer = env.callMethod(document, "saveXML", Crap4j.class);
        if (ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull())) {
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    NamespaceGlobal.mkdir
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.dirname
                                                            .env(env)
                                                            .call(target)
                                                            .value(),
                                                    511,
                                                    true)
                                            .value()))
                    && ZVal.toBool(
                            !NamespaceGlobal.is_dir
                                    .env(env)
                                    .call(NamespaceGlobal.dirname.env(env).call(target).value())
                                    .getBool())) {
                throw ZVal.getException(
                        env,
                        new com.runtimeconverter
                                .runtime
                                .nativeClasses
                                .spl
                                .exceptions
                                .RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Directory \"%s\" was not created",
                                                NamespaceGlobal.dirname
                                                        .env(env)
                                                        .call(target)
                                                        .value())
                                        .value()));
            }

            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.file_put_contents.env(env).call(target, buffer).value(),
                    "===",
                    false)) {
                throw ZVal.getException(
                        env,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .namespaces
                                .CodeCoverage
                                .classes
                                .RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Could not write to \"%s", target)
                                        .value()));
            }
        }

        return env.returnWithGlobals(buffer, "_SERVER", _SERVER);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "crapValue")
    @ConvertedParameter(index = 1, name = "cyclomaticComplexity")
    @ConvertedParameter(index = 2, name = "coveragePercent")
    private Object getCrapLoad(RuntimeEnv env, Object... args) {
        Object crapValue = assignParameter(args, 0, null);
        Object cyclomaticComplexity = assignParameter(args, 1, null);
        Object coveragePercent = assignParameter(args, 2, null);
        Object crapLoad = null;
        crapLoad = 0;
        if (ZVal.isGreaterThanOrEqualTo(
                crapValue, ">=", toObjectR(this).accessProp(this, env).name("threshold").value())) {
            crapLoad =
                    ZAssignment.add(
                            "+=",
                            crapLoad,
                            ZVal.multiply(
                                    cyclomaticComplexity,
                                    ZVal.subtract(1.0, ZVal.divide(coveragePercent, 100))));
            crapLoad =
                    ZAssignment.add(
                            "+=",
                            crapLoad,
                            ZVal.divide(
                                    cyclomaticComplexity,
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("threshold")
                                            .value()));
        }

        return ZVal.assign(crapLoad);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object roundValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        return ZVal.assign(NamespaceGlobal.round.env(env).call(value, 2).value());
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Crap4j";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Crap4j")
                    .setLookup(Crap4j.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("threshold")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Crap4j.php")
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
