package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
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

 vendor/phpunit/php-code-coverage/src/Report/Clover.php

*/

public final class Clover extends RuntimeClassBase {

    public Clover(RuntimeEnv env, Object... args) {
        super(env);
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
        Object data = ZVal.newArray();
        Object line = null;
        Object classes = null;
        Object className = null;
        Object xmlFile = null;
        Object classMethods = null;
        Object linesOfCode = ZVal.newArray();
        Object coverageData = ZVal.newArray();
        Object xmlProject = null;
        Object buffer = null;
        Object xmlDocument = null;
        Object lines = ZVal.newArray();
        Object methodCount = null;
        Object _pClass = ZVal.newArray();
        Object item = null;
        Object xmlClass = null;
        Object method = ZVal.newArray();
        Object xmlCoverage = null;
        Object classStatements = null;
        Object _SERVER = env.getGlobal("_SERVER");
        Object methodName = null;
        Object xmlLine = null;
        Object packages = ZVal.newArray();
        Object xmlMetrics = null;
        Object coveredMethods = null;
        Object report = null;
        Object namespace = null;
        Object coveredClassStatements = null;
        xmlDocument = new DOMDocument(env, "1.0", "UTF-8");
        toObjectR(xmlDocument).accessProp(this, env).name("formatOutput").set(true);
        xmlCoverage = env.callMethod(xmlDocument, "createElement", Clover.class, "coverage");
        env.callMethod(
                xmlCoverage,
                "setAttribute",
                Clover.class,
                "generated",
                ZVal.toLong(ZVal.getElement(_SERVER, "REQUEST_TIME")));
        env.callMethod(xmlDocument, "appendChild", Clover.class, xmlCoverage);
        xmlProject = env.callMethod(xmlDocument, "createElement", Clover.class, "project");
        env.callMethod(
                xmlProject,
                "setAttribute",
                Clover.class,
                "timestamp",
                ZVal.toLong(ZVal.getElement(_SERVER, "REQUEST_TIME")));
        if (function_is_string.f.env(env).call(name).getBool()) {
            env.callMethod(xmlProject, "setAttribute", Clover.class, "name", name);
        }

        env.callMethod(xmlCoverage, "appendChild", Clover.class, xmlProject);
        packages = ZVal.newArray();
        report = env.callMethod(coverage, "getReport", Clover.class);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult164 : ZVal.getIterable(report, env, true)) {
            item = ZVal.assign(zpairResult164.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            item, File.class, "SebastianBergmann\\CodeCoverage\\Node\\File"))) {
                continue;
            }

            xmlFile = env.callMethod(xmlDocument, "createElement", Clover.class, "file");
            env.callMethod(
                    xmlFile,
                    "setAttribute",
                    Clover.class,
                    "name",
                    env.callMethod(item, "getPath", Clover.class));
            classes = env.callMethod(item, "getClassesAndTraits", Clover.class);
            coverageData = env.callMethod(item, "getCoverageData", Clover.class);
            lines = ZVal.newArray();
            namespace = "global";
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult165 : ZVal.getIterable(classes, env, false)) {
                className = ZVal.assign(zpairResult165.getKey());
                _pClass = ZVal.assign(zpairResult165.getValue());
                classStatements = 0;
                coveredClassStatements = 0;
                coveredMethods = 0;
                classMethods = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult166 :
                        ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, false)) {
                    methodName = ZVal.assign(zpairResult166.getKey());
                    method = ZVal.assign(zpairResult166.getValue());
                    if (ZVal.equalityCheck(ZVal.getElement(method, "executableLines"), 0)) {
                        continue;
                    }

                    classMethods = ZVal.increment(classMethods);
                    classStatements =
                            ZAssignment.add(
                                    "+=",
                                    classStatements,
                                    ZVal.getElement(method, "executableLines"));
                    coveredClassStatements =
                            ZAssignment.add(
                                    "+=",
                                    coveredClassStatements,
                                    ZVal.getElement(method, "executedLines"));
                    if (ZVal.equalityCheck(ZVal.getElement(method, "coverage"), 100)) {
                        coveredMethods = ZVal.increment(coveredMethods);
                    }

                    methodCount = 0;
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult167 :
                            ZVal.getIterable(
                                    CRArrayF.range
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(method, "startLine"),
                                                    ZVal.getElement(method, "endLine"))
                                            .value(),
                                    env,
                                    true)) {
                        line = ZVal.assign(zpairResult167.getValue());
                        if (ZVal.toBool(ZVal.isset(ZVal.getElement(coverageData, line)))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                ZVal.getElement(coverageData, line),
                                                "!==",
                                                ZVal.getNull()))) {
                            methodCount =
                                    NamespaceGlobal.max
                                            .env(env)
                                            .call(
                                                    methodCount,
                                                    CRArrayF.count
                                                            .env(env)
                                                            .call(
                                                                    ZVal.getElement(
                                                                            coverageData, line))
                                                            .value())
                                            .value();
                        }
                    }

                    ZVal.putArrayElement(
                            lines,
                            ZVal.getElement(method, "startLine"),
                            ZVal.newArray(
                                    new ZPair("ccn", ZVal.getElement(method, "ccn")),
                                    new ZPair("count", methodCount),
                                    new ZPair("crap", ZVal.getElement(method, "crap")),
                                    new ZPair("type", "method"),
                                    new ZPair("visibility", ZVal.getElement(method, "visibility")),
                                    new ZPair("name", methodName)));
                }

                if (!ZVal.isEmpty(ZVal.getElementRecursive(_pClass, "package", "namespace"))) {
                    namespace =
                            ZVal.assign(ZVal.getElementRecursive(_pClass, "package", "namespace"));
                }

                xmlClass = env.callMethod(xmlDocument, "createElement", Clover.class, "class");
                env.callMethod(xmlClass, "setAttribute", Clover.class, "name", className);
                env.callMethod(xmlClass, "setAttribute", Clover.class, "namespace", namespace);
                if (!ZVal.isEmpty(ZVal.getElementRecursive(_pClass, "package", "fullPackage"))) {
                    env.callMethod(
                            xmlClass,
                            "setAttribute",
                            Clover.class,
                            "fullPackage",
                            ZVal.getElementRecursive(_pClass, "package", "fullPackage"));
                }

                if (!ZVal.isEmpty(ZVal.getElementRecursive(_pClass, "package", "category"))) {
                    env.callMethod(
                            xmlClass,
                            "setAttribute",
                            Clover.class,
                            "category",
                            ZVal.getElementRecursive(_pClass, "package", "category"));
                }

                if (!ZVal.isEmpty(ZVal.getElementRecursive(_pClass, "package", "package"))) {
                    env.callMethod(
                            xmlClass,
                            "setAttribute",
                            Clover.class,
                            "package",
                            ZVal.getElementRecursive(_pClass, "package", "package"));
                }

                if (!ZVal.isEmpty(ZVal.getElementRecursive(_pClass, "package", "subpackage"))) {
                    env.callMethod(
                            xmlClass,
                            "setAttribute",
                            Clover.class,
                            "subpackage",
                            ZVal.getElementRecursive(_pClass, "package", "subpackage"));
                }

                env.callMethod(xmlFile, "appendChild", Clover.class, xmlClass);
                xmlMetrics = env.callMethod(xmlDocument, "createElement", Clover.class, "metrics");
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "complexity",
                        ZVal.getElement(_pClass, "ccn"));
                env.callMethod(xmlMetrics, "setAttribute", Clover.class, "methods", classMethods);
                env.callMethod(
                        xmlMetrics, "setAttribute", Clover.class, "coveredmethods", coveredMethods);
                env.callMethod(xmlMetrics, "setAttribute", Clover.class, "conditionals", 0);
                env.callMethod(xmlMetrics, "setAttribute", Clover.class, "coveredconditionals", 0);
                env.callMethod(
                        xmlMetrics, "setAttribute", Clover.class, "statements", classStatements);
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "coveredstatements",
                        coveredClassStatements);
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "elements",
                        ZVal.add(classMethods, classStatements));
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "coveredelements",
                        ZVal.add(coveredMethods, coveredClassStatements));
                env.callMethod(xmlClass, "appendChild", Clover.class, xmlMetrics);
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult168 : ZVal.getIterable(coverageData, env, false)) {
                line = ZVal.assign(zpairResult168.getKey());
                data = ZVal.assign(zpairResult168.getValue());
                if (ZVal.toBool(ZVal.strictEqualityCheck(data, "===", ZVal.getNull()))
                        || ZVal.toBool(ZVal.isset(ZVal.getElement(lines, line)))) {
                    continue;
                }

                ZVal.putArrayElement(
                        lines,
                        line,
                        ZVal.newArray(
                                new ZPair("count", CRArrayF.count.env(env).call(data).value()),
                                new ZPair("type", "stmt")));
            }

            CRArrayF.ksort.env(env).call(lines);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult169 : ZVal.getIterable(lines, env, false)) {
                line = ZVal.assign(zpairResult169.getKey());
                data = ZVal.assign(zpairResult169.getValue());
                xmlLine = env.callMethod(xmlDocument, "createElement", Clover.class, "line");
                env.callMethod(xmlLine, "setAttribute", Clover.class, "num", line);
                env.callMethod(
                        xmlLine,
                        "setAttribute",
                        Clover.class,
                        "type",
                        ZVal.getElement(data, "type"));
                if (ZVal.isset(ZVal.getElement(data, "name"))) {
                    env.callMethod(
                            xmlLine,
                            "setAttribute",
                            Clover.class,
                            "name",
                            ZVal.getElement(data, "name"));
                }

                if (ZVal.isset(ZVal.getElement(data, "visibility"))) {
                    env.callMethod(
                            xmlLine,
                            "setAttribute",
                            Clover.class,
                            "visibility",
                            ZVal.getElement(data, "visibility"));
                }

                if (ZVal.isset(ZVal.getElement(data, "ccn"))) {
                    env.callMethod(
                            xmlLine,
                            "setAttribute",
                            Clover.class,
                            "complexity",
                            ZVal.getElement(data, "ccn"));
                }

                if (ZVal.isset(ZVal.getElement(data, "crap"))) {
                    env.callMethod(
                            xmlLine,
                            "setAttribute",
                            Clover.class,
                            "crap",
                            ZVal.getElement(data, "crap"));
                }

                env.callMethod(
                        xmlLine,
                        "setAttribute",
                        Clover.class,
                        "count",
                        ZVal.getElement(data, "count"));
                env.callMethod(xmlFile, "appendChild", Clover.class, xmlLine);
            }

            linesOfCode = env.callMethod(item, "getLinesOfCode", Clover.class);
            xmlMetrics = env.callMethod(xmlDocument, "createElement", Clover.class, "metrics");
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "loc",
                    ZVal.getElement(linesOfCode, "loc"));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "ncloc",
                    ZVal.getElement(linesOfCode, "ncloc"));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "classes",
                    env.callMethod(item, "getNumClassesAndTraits", Clover.class));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "methods",
                    env.callMethod(item, "getNumMethods", Clover.class));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "coveredmethods",
                    env.callMethod(item, "getNumTestedMethods", Clover.class));
            env.callMethod(xmlMetrics, "setAttribute", Clover.class, "conditionals", 0);
            env.callMethod(xmlMetrics, "setAttribute", Clover.class, "coveredconditionals", 0);
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "statements",
                    env.callMethod(item, "getNumExecutableLines", Clover.class));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "coveredstatements",
                    env.callMethod(item, "getNumExecutedLines", Clover.class));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "elements",
                    ZVal.add(
                            env.callMethod(item, "getNumMethods", Clover.class),
                            env.callMethod(item, "getNumExecutableLines", Clover.class)));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "coveredelements",
                    ZVal.add(
                            env.callMethod(item, "getNumTestedMethods", Clover.class),
                            env.callMethod(item, "getNumExecutedLines", Clover.class)));
            env.callMethod(xmlFile, "appendChild", Clover.class, xmlMetrics);
            if (ZVal.strictEqualityCheck(namespace, "===", "global")) {
                env.callMethod(xmlProject, "appendChild", Clover.class, xmlFile);

            } else {
                if (!ZVal.isset(ZVal.getElement(packages, namespace))) {
                    ZVal.putArrayElement(
                            packages,
                            namespace,
                            env.callMethod(xmlDocument, "createElement", Clover.class, "package"));
                    env.callMethod(
                            ZVal.getElement(packages, namespace),
                            "setAttribute",
                            Clover.class,
                            "name",
                            namespace);
                    env.callMethod(
                            xmlProject,
                            "appendChild",
                            Clover.class,
                            ZVal.getElement(packages, namespace));
                }

                env.callMethod(
                        ZVal.getElement(packages, namespace), "appendChild", Clover.class, xmlFile);
            }
        }

        linesOfCode = env.callMethod(report, "getLinesOfCode", Clover.class);
        xmlMetrics = env.callMethod(xmlDocument, "createElement", Clover.class, "metrics");
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "files",
                CRArrayF.count.env(env).call(report).value());
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "loc",
                ZVal.getElement(linesOfCode, "loc"));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "ncloc",
                ZVal.getElement(linesOfCode, "ncloc"));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "classes",
                env.callMethod(report, "getNumClassesAndTraits", Clover.class));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "methods",
                env.callMethod(report, "getNumMethods", Clover.class));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "coveredmethods",
                env.callMethod(report, "getNumTestedMethods", Clover.class));
        env.callMethod(xmlMetrics, "setAttribute", Clover.class, "conditionals", 0);
        env.callMethod(xmlMetrics, "setAttribute", Clover.class, "coveredconditionals", 0);
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "statements",
                env.callMethod(report, "getNumExecutableLines", Clover.class));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "coveredstatements",
                env.callMethod(report, "getNumExecutedLines", Clover.class));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "elements",
                ZVal.add(
                        env.callMethod(report, "getNumMethods", Clover.class),
                        env.callMethod(report, "getNumExecutableLines", Clover.class)));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "coveredelements",
                ZVal.add(
                        env.callMethod(report, "getNumTestedMethods", Clover.class),
                        env.callMethod(report, "getNumExecutedLines", Clover.class)));
        env.callMethod(xmlProject, "appendChild", Clover.class, xmlMetrics);
        buffer = env.callMethod(xmlDocument, "saveXML", Clover.class);
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

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Clover";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Clover")
                    .setLookup(Clover.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Clover.php")
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
