package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Report;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Project;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Version;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Facade.php

*/

public final class Facade extends RuntimeClassBase {

    public Object target = null;

    public Object project = null;

    public Object phpUnitVersion = null;

    public Facade(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Facade.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("phpUnitVersion").set(version);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    @ConvertedParameter(index = 1, name = "target", typeHint = "string")
    public Object process(RuntimeEnv env, Object... args) {
        Object coverage = assignParameter(args, 0, null);
        Object target = assignParameter(args, 1, null);
        Object report = null;
        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.substr.env(env).call(target, -1, 1).value(), "!==", "/")) {
            target = toStringR(target, env) + toStringR("/", env);
        }

        toObjectR(this).accessProp(this, env).name("target").set(target);
        env.callMethod(this, "initTargetDirectory", Facade.class, target);
        report = env.callMethod(coverage, "getReport", Facade.class);
        toObjectR(this)
                .accessProp(this, env)
                .name("project")
                .set(
                        new Project(
                                env,
                                env.callMethod(
                                        env.callMethod(coverage, "getReport", Facade.class),
                                        "getName",
                                        Facade.class)));
        env.callMethod(this, "setBuildInformation", Facade.class);
        env.callMethod(
                this,
                "processTests",
                Facade.class,
                env.callMethod(coverage, "getTests", Facade.class));
        env.callMethod(
                this,
                "processDirectory",
                Facade.class,
                report,
                toObjectR(this).accessProp(this, env).name("project").value());
        env.callMethod(
                this,
                "saveDocument",
                Facade.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("project").value(),
                        "asDom",
                        Facade.class),
                "index");
        return null;
    }

    @ConvertedMethod
    private Object setBuildInformation(RuntimeEnv env, Object... args) {
        Object _SERVER = env.getGlobal("_SERVER");
        Object buildNode = null;
        buildNode =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("project").value(),
                        "getBuildInformation",
                        Facade.class);
        env.callMethod(buildNode, "setRuntimeInformation", Facade.class, new Runtime(env));
        env.callMethod(
                buildNode,
                "setBuildTime",
                Facade.class,
                DateTime.runtimeStaticObject.createFromFormat(
                        env, "U", ZVal.getElement(_SERVER, "REQUEST_TIME")));
        env.callMethod(
                buildNode,
                "setGeneratorVersions",
                Facade.class,
                toObjectR(this).accessProp(this, env).name("phpUnitVersion").value(),
                Version.runtimeStaticObject.id(env));
        return env.returnWithGlobals(null, "_SERVER", _SERVER);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    private Object initTargetDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, null);
        if (NamespaceGlobal.file_exists.env(env).call(directory).getBool()) {
            if (!NamespaceGlobal.is_dir.env(env).call(directory).getBool()) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "'"
                                        + toStringR(directory, env)
                                        + "' exists but is not a directory."));
            }

            if (!NamespaceGlobal.is_writable.env(env).call(directory).getBool()) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "'" + toStringR(directory, env) + "' exists but is not writable."));
            }

        } else if (!ZVal.isTrue(
                NamespaceGlobal.mkdir.env(env).call(directory, 511, true).value())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "'" + toStringR(directory, env) + "' could not be created."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "directory",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\Directory"
    )
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Node"
    )
    private Object processDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        Object node = null;
        Object directoryObject = null;
        Object directoryName = null;
        directoryName = env.callMethod(directory, "getName", Facade.class);
        if (ZVal.strictEqualityCheck(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("project").value(),
                        "getProjectSourceDirectory",
                        Facade.class),
                "===",
                directoryName)) {
            directoryName = "/";
        }

        directoryObject = env.callMethod(context, "addDirectory", Facade.class, directoryName);
        env.callMethod(
                this,
                "setTotals",
                Facade.class,
                directory,
                env.callMethod(directoryObject, "getTotals", Facade.class));
        for (ZPair zpairResult201 :
                ZVal.getIterable(
                        env.callMethod(directory, "getDirectories", Facade.class), env, true)) {
            node = ZVal.assign(zpairResult201.getValue());
            env.callMethod(this, "processDirectory", Facade.class, node, directoryObject);
        }

        for (ZPair zpairResult202 :
                ZVal.getIterable(env.callMethod(directory, "getFiles", Facade.class), env, true)) {
            node = ZVal.assign(zpairResult202.getValue());
            env.callMethod(this, "processFile", Facade.class, node, directoryObject);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "file",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\File"
    )
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Directory"
    )
    private Object processFile(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object file = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        Object coverage = null;
        Object path = null;
        Object unit = null;
        Object tests = null;
        Object test = null;
        Object fileObject = null;
        Object line = null;
        Object function = null;
        Object fileReport = null;
        fileObject =
                env.callMethod(
                        context,
                        "addFile",
                        Facade.class,
                        env.callMethod(file, "getName", Facade.class),
                        toStringR(env.callMethod(file, "getId", Facade.class), env) + ".xml");
        env.callMethod(
                this,
                "setTotals",
                Facade.class,
                file,
                env.callMethod(fileObject, "getTotals", Facade.class));
        path =
                NamespaceGlobal.substr
                        .env(env)
                        .call(
                                env.callMethod(file, "getPath", Facade.class),
                                NamespaceGlobal.strlen
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("project")
                                                                .value(),
                                                        "getProjectSourceDirectory",
                                                        Facade.class))
                                        .value())
                        .value();
        fileReport = new Report(env, path);
        env.callMethod(
                this,
                "setTotals",
                Facade.class,
                file,
                env.callMethod(fileReport, "getTotals", Facade.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult203 :
                ZVal.getIterable(
                        env.callMethod(file, "getClassesAndTraits", Facade.class), env, true)) {
            unit = ZVal.assign(zpairResult203.getValue());
            env.callMethod(this, "processUnit", Facade.class, unit, fileReport);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult204 :
                ZVal.getIterable(env.callMethod(file, "getFunctions", Facade.class), env, true)) {
            function = ZVal.assign(zpairResult204.getValue());
            env.callMethod(this, "processFunction", Facade.class, function, fileReport);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult205 :
                ZVal.getIterable(
                        env.callMethod(file, "getCoverageData", Facade.class), env, false)) {
            line = ZVal.assign(zpairResult205.getKey());
            tests = ZVal.assign(zpairResult205.getValue());
            if (ZVal.toBool(!function_is_array.f.env(env).call(tests).getBool())
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    CRArrayF.count.env(env).call(tests).value(), "===", 0))) {
                continue;
            }

            coverage = env.callMethod(fileReport, "getLineCoverage", Facade.class, line);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult206 : ZVal.getIterable(tests, env, true)) {
                test = ZVal.assign(zpairResult206.getValue());
                env.callMethod(coverage, "addTest", Facade.class, test);
            }

            env.callMethod(coverage, "finalize", Facade.class);
        }

        env.callMethod(
                env.callMethod(fileReport, "getSource", Facade.class),
                "setSourceCode",
                Facade.class,
                function_file_get_contents
                        .f
                        .env(env)
                        .call(env.callMethod(file, "getPath", Facade.class))
                        .value());
        env.callMethod(
                this,
                "saveDocument",
                Facade.class,
                env.callMethod(fileReport, "asDom", Facade.class),
                env.callMethod(file, "getId", Facade.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unit", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "report",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Report"
    )
    private Object processUnit(RuntimeEnv env, Object... args) {
        Object unit = assignParameter(args, 0, null);
        if (ZVal.isNull(unit)) {
            unit = ZVal.newArray();
        }
        Object report = assignParameter(args, 1, null);
        Object method = ZVal.newArray();
        Object methodObject = null;
        Object unitObject = null;
        if (ZVal.isset(ZVal.getElement(unit, "className"))) {
            unitObject =
                    env.callMethod(
                            report,
                            "getClassObject",
                            Facade.class,
                            ZVal.getElement(unit, "className"));

        } else {
            unitObject =
                    env.callMethod(
                            report,
                            "getTraitObject",
                            Facade.class,
                            ZVal.getElement(unit, "traitName"));
        }

        env.callMethod(
                unitObject,
                "setLines",
                Facade.class,
                ZVal.getElement(unit, "startLine"),
                ZVal.getElement(unit, "executableLines"),
                ZVal.getElement(unit, "executedLines"));
        env.callMethod(unitObject, "setCrap", Facade.class, ZVal.getElement(unit, "crap"));
        env.callMethod(
                unitObject,
                "setPackage",
                Facade.class,
                ZVal.getElementRecursive(unit, "package", "fullPackage"),
                ZVal.getElementRecursive(unit, "package", "package"),
                ZVal.getElementRecursive(unit, "package", "subpackage"),
                ZVal.getElementRecursive(unit, "package", "category"));
        env.callMethod(
                unitObject,
                "setNamespace",
                Facade.class,
                ZVal.getElementRecursive(unit, "package", "namespace"));
        for (ZPair zpairResult207 : ZVal.getIterable(ZVal.getElement(unit, "methods"), env, true)) {
            method = ZVal.assign(zpairResult207.getValue());
            methodObject =
                    env.callMethod(
                            unitObject,
                            "addMethod",
                            Facade.class,
                            ZVal.getElement(method, "methodName"));
            env.callMethod(
                    methodObject,
                    "setSignature",
                    Facade.class,
                    ZVal.getElement(method, "signature"));
            env.callMethod(
                    methodObject,
                    "setLines",
                    Facade.class,
                    ZVal.getElement(method, "startLine"),
                    ZVal.getElement(method, "endLine"));
            env.callMethod(methodObject, "setCrap", Facade.class, ZVal.getElement(method, "crap"));
            env.callMethod(
                    methodObject,
                    "setTotals",
                    Facade.class,
                    ZVal.getElement(method, "executableLines"),
                    ZVal.getElement(method, "executedLines"),
                    ZVal.getElement(method, "coverage"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "function", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "report",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Report"
    )
    private Object processFunction(RuntimeEnv env, Object... args) {
        Object function = assignParameter(args, 0, null);
        if (ZVal.isNull(function)) {
            function = ZVal.newArray();
        }
        Object report = assignParameter(args, 1, null);
        Object functionObject = null;
        functionObject =
                env.callMethod(
                        report,
                        "getFunctionObject",
                        Facade.class,
                        ZVal.getElement(function, "functionName"));
        env.callMethod(
                functionObject,
                "setSignature",
                Facade.class,
                ZVal.getElement(function, "signature"));
        env.callMethod(
                functionObject, "setLines", Facade.class, ZVal.getElement(function, "startLine"));
        env.callMethod(functionObject, "setCrap", Facade.class, ZVal.getElement(function, "crap"));
        env.callMethod(
                functionObject,
                "setTotals",
                Facade.class,
                ZVal.getElement(function, "executableLines"),
                ZVal.getElement(function, "executedLines"),
                ZVal.getElement(function, "coverage"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tests", typeHint = "array")
    private Object processTests(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object tests = assignParameter(args, 0, null);
        Object result = null;
        Object testsObject = null;
        Object test = null;
        testsObject =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("project").value(),
                        "getTests",
                        Facade.class);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult208 : ZVal.getIterable(tests, env, false)) {
            test = ZVal.assign(zpairResult208.getKey());
            result = ZVal.assign(zpairResult208.getValue());
            if (ZVal.strictEqualityCheck(test, "===", "UNCOVERED_FILES_FROM_WHITELIST")) {
                continue;
            }

            env.callMethod(testsObject, "addTest", Facade.class, test, result);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "totals",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Totals"
    )
    private Object setTotals(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object totals = assignParameter(args, 1, null);
        Object loc = ZVal.newArray();
        loc = env.callMethod(node, "getLinesOfCode", Facade.class);
        env.callMethod(
                totals,
                "setNumLines",
                Facade.class,
                ZVal.getElement(loc, "loc"),
                ZVal.getElement(loc, "cloc"),
                ZVal.getElement(loc, "ncloc"),
                env.callMethod(node, "getNumExecutableLines", Facade.class),
                env.callMethod(node, "getNumExecutedLines", Facade.class));
        env.callMethod(
                totals,
                "setNumClasses",
                Facade.class,
                env.callMethod(node, "getNumClasses", Facade.class),
                env.callMethod(node, "getNumTestedClasses", Facade.class));
        env.callMethod(
                totals,
                "setNumTraits",
                Facade.class,
                env.callMethod(node, "getNumTraits", Facade.class),
                env.callMethod(node, "getNumTestedTraits", Facade.class));
        env.callMethod(
                totals,
                "setNumMethods",
                Facade.class,
                env.callMethod(node, "getNumMethods", Facade.class),
                env.callMethod(node, "getNumTestedMethods", Facade.class));
        env.callMethod(
                totals,
                "setNumFunctions",
                Facade.class,
                env.callMethod(node, "getNumFunctions", Facade.class),
                env.callMethod(node, "getNumTestedFunctions", Facade.class));
        return null;
    }

    @ConvertedMethod
    private Object getTargetDirectory(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("target").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "document", typeHint = "DOMDocument")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    private Object saveDocument(RuntimeEnv env, Object... args) {
        Object document = assignParameter(args, 0, null);
        Object name = assignParameter(args, 1, null);
        Object filename = null;
        filename =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s/%s.xml",
                                env.callMethod(this, "getTargetDirectory", Facade.class), name)
                        .value();
        toObjectR(document).accessProp(this, env).name("formatOutput").set(true);
        toObjectR(document).accessProp(this, env).name("preserveWhiteSpace").set(false);
        env.callMethod(
                this,
                "initTargetDirectory",
                Facade.class,
                NamespaceGlobal.dirname.env(env).call(filename).value());
        env.callMethod(document, "save", Facade.class, filename);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Facade";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Facade")
                    .setLookup(Facade.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("phpUnitVersion", "project", "target")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Facade.php")
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
