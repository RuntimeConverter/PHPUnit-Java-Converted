package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.File;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Text.php

*/

public final class Text extends RuntimeClassBase {

    public Object lowUpperBound = null;

    public Object highLowerBound = null;

    public Object showUncoveredFiles = null;

    public Object showOnlySummary = null;

    public Text(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Text.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "lowUpperBound",
        typeHint = "int",
        defaultValue = "50",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "highLowerBound",
        typeHint = "int",
        defaultValue = "90",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "showUncoveredFiles",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "showOnlySummary",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lowUpperBound = assignParameter(args, 0, null);
        if (ZVal.isNull(lowUpperBound)) {
            lowUpperBound = 50;
        }
        Object highLowerBound = assignParameter(args, 1, null);
        if (ZVal.isNull(highLowerBound)) {
            highLowerBound = 90;
        }
        Object showUncoveredFiles = assignParameter(args, 2, null);
        if (ZVal.isNull(showUncoveredFiles)) {
            showUncoveredFiles = false;
        }
        Object showOnlySummary = assignParameter(args, 3, null);
        if (ZVal.isNull(showOnlySummary)) {
            showOnlySummary = false;
        }
        toObjectR(this).accessProp(this, env).name("lowUpperBound").set(lowUpperBound);
        toObjectR(this).accessProp(this, env).name("highLowerBound").set(highLowerBound);
        toObjectR(this).accessProp(this, env).name("showUncoveredFiles").set(showUncoveredFiles);
        toObjectR(this).accessProp(this, env).name("showOnlySummary").set(showOnlySummary);
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
        name = "showColors",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object process(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object coverage = assignParameter(args, 0, null);
        Object showColors = assignParameter(args, 1, null);
        if (ZVal.isNull(showColors)) {
            showColors = false;
        }
        Object date = null;
        Object methods = null;
        Object classes = null;
        Object className = null;
        Object title = null;
        Object colors = ZVal.newArray();
        Object classMethods = null;
        Object output = null;
        Object resetColor = null;
        Object lines = null;
        Object _pClass = ZVal.newArray();
        Object padding = null;
        Object linesColor = null;
        Object classInfo = ZVal.newArray();
        Object item = null;
        Object classCoverage = ZVal.newArray();
        Object method = ZVal.newArray();
        Object classStatements = null;
        Object _SERVER = env.getGlobal("_SERVER");
        Object fullQualifiedPath = null;
        Object methodColor = null;
        Object coveredMethods = null;
        Object report = null;
        Object namespace = null;
        Object coveredClassStatements = null;
        output = toStringR("\n", env) + toStringR("\n", env);
        report = env.callMethod(coverage, "getReport", Text.class);
        colors =
                ZVal.newArray(
                        new ZPair("header", ""),
                        new ZPair("classes", ""),
                        new ZPair("methods", ""),
                        new ZPair("lines", ""),
                        new ZPair("reset", ""),
                        new ZPair("eol", ""));
        if (ZVal.isTrue(showColors)) {
            ZVal.putArrayElement(
                    colors,
                    "classes",
                    env.callMethod(
                            this,
                            "getCoverageColor",
                            Text.class,
                            env.callMethod(report, "getNumTestedClassesAndTraits", Text.class),
                            env.callMethod(report, "getNumClassesAndTraits", Text.class)));
            ZVal.putArrayElement(
                    colors,
                    "methods",
                    env.callMethod(
                            this,
                            "getCoverageColor",
                            Text.class,
                            env.callMethod(report, "getNumTestedMethods", Text.class),
                            env.callMethod(report, "getNumMethods", Text.class)));
            ZVal.putArrayElement(
                    colors,
                    "lines",
                    env.callMethod(
                            this,
                            "getCoverageColor",
                            Text.class,
                            env.callMethod(report, "getNumExecutedLines", Text.class),
                            env.callMethod(report, "getNumExecutableLines", Text.class)));
            ZVal.putArrayElement(colors, "reset", CONST_COLOR_RESET);
            ZVal.putArrayElement(colors, "header", CONST_COLOR_HEADER);
            ZVal.putArrayElement(colors, "eol", CONST_COLOR_EOL);
        }

        classes =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "  Classes: %6s (%d/%d)",
                                Util.runtimeStaticObject.percent(
                                        env,
                                        env.callMethod(
                                                report, "getNumTestedClassesAndTraits", Text.class),
                                        env.callMethod(
                                                report, "getNumClassesAndTraits", Text.class),
                                        true),
                                env.callMethod(report, "getNumTestedClassesAndTraits", Text.class),
                                env.callMethod(report, "getNumClassesAndTraits", Text.class))
                        .value();
        methods =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "  Methods: %6s (%d/%d)",
                                Util.runtimeStaticObject.percent(
                                        env,
                                        env.callMethod(report, "getNumTestedMethods", Text.class),
                                        env.callMethod(report, "getNumMethods", Text.class),
                                        true),
                                env.callMethod(report, "getNumTestedMethods", Text.class),
                                env.callMethod(report, "getNumMethods", Text.class))
                        .value();
        lines =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "  Lines:   %6s (%d/%d)",
                                Util.runtimeStaticObject.percent(
                                        env,
                                        env.callMethod(report, "getNumExecutedLines", Text.class),
                                        env.callMethod(report, "getNumExecutableLines", Text.class),
                                        true),
                                env.callMethod(report, "getNumExecutedLines", Text.class),
                                env.callMethod(report, "getNumExecutableLines", Text.class))
                        .value();
        padding =
                NamespaceGlobal.max
                        .env(env)
                        .call(
                                CRArrayF.array_map
                                        .env(env)
                                        .call(
                                                "strlen",
                                                ZVal.newArray(
                                                        new ZPair(0, classes),
                                                        new ZPair(1, methods),
                                                        new ZPair(2, lines)))
                                        .value())
                        .value();
        if (toObjectR(this).accessProp(this, env).name("showOnlySummary").getBool()) {
            title = "Code Coverage Report Summary:";
            padding =
                    NamespaceGlobal.max
                            .env(env)
                            .call(padding, NamespaceGlobal.strlen.env(env).call(title).value())
                            .value();
            output =
                    toStringR(output, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "format",
                                            Text.class,
                                            ZVal.getElement(colors, "header"),
                                            padding,
                                            title),
                                    env);

        } else {
            date =
                    NamespaceGlobal.date
                            .env(env)
                            .call("  Y-m-d H:i:s", ZVal.getElement(_SERVER, "REQUEST_TIME"))
                            .value();
            title = "Code Coverage Report:";
            output =
                    toStringR(output, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "format",
                                            Text.class,
                                            ZVal.getElement(colors, "header"),
                                            padding,
                                            title),
                                    env);
            output =
                    toStringR(output, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "format",
                                            Text.class,
                                            ZVal.getElement(colors, "header"),
                                            padding,
                                            date),
                                    env);
            output =
                    toStringR(output, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "format",
                                            Text.class,
                                            ZVal.getElement(colors, "header"),
                                            padding,
                                            ""),
                                    env);
            output =
                    toStringR(output, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "format",
                                            Text.class,
                                            ZVal.getElement(colors, "header"),
                                            padding,
                                            " Summary:"),
                                    env);
        }

        output =
                toStringR(output, env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "format",
                                        Text.class,
                                        ZVal.getElement(colors, "classes"),
                                        padding,
                                        classes),
                                env);
        output =
                toStringR(output, env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "format",
                                        Text.class,
                                        ZVal.getElement(colors, "methods"),
                                        padding,
                                        methods),
                                env);
        output =
                toStringR(output, env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "format",
                                        Text.class,
                                        ZVal.getElement(colors, "lines"),
                                        padding,
                                        lines),
                                env);
        if (toObjectR(this).accessProp(this, env).name("showOnlySummary").getBool()) {
            return env.returnWithGlobals(
                    toStringR(output, env) + toStringR("\n", env), "_SERVER", _SERVER);
        }

        classCoverage = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult197 : ZVal.getIterable(report, env, true)) {
            item = ZVal.assign(zpairResult197.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            item, File.class, "SebastianBergmann\\CodeCoverage\\Node\\File"))) {
                continue;
            }

            classes = env.callMethod(item, "getClassesAndTraits", Text.class);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult198 : ZVal.getIterable(classes, env, false)) {
                className = ZVal.assign(zpairResult198.getKey());
                _pClass = ZVal.assign(zpairResult198.getValue());
                classStatements = 0;
                coveredClassStatements = 0;
                coveredMethods = 0;
                classMethods = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult199 :
                        ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, true)) {
                    method = ZVal.assign(zpairResult199.getValue());
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
                }

                namespace = "";
                if (!ZVal.isEmpty(ZVal.getElementRecursive(_pClass, "package", "namespace"))) {
                    namespace =
                            "\\"
                                    + toStringR(
                                            ZVal.getElementRecursive(
                                                    _pClass, "package", "namespace"),
                                            env)
                                    + "::";

                } else if (!ZVal.isEmpty(
                        ZVal.getElementRecursive(_pClass, "package", "fullPackage"))) {
                    namespace =
                            "@"
                                    + toStringR(
                                            ZVal.getElementRecursive(
                                                    _pClass, "package", "fullPackage"),
                                            env)
                                    + "::";
                }

                ZVal.putArrayElement(
                        classCoverage,
                        toStringR(namespace, env) + toStringR(className, env),
                        ZVal.newArray(
                                new ZPair("namespace", namespace),
                                new ZPair("className ", className),
                                new ZPair("methodsCovered", coveredMethods),
                                new ZPair("methodCount", classMethods),
                                new ZPair("statementsCovered", coveredClassStatements),
                                new ZPair("statementCount", classStatements)));
            }
        }

        CRArrayF.ksort.env(env).call(classCoverage);
        methodColor = "";
        linesColor = "";
        resetColor = "";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult200 : ZVal.getIterable(classCoverage, env, false)) {
            fullQualifiedPath = ZVal.assign(zpairResult200.getKey());
            classInfo = ZVal.assign(zpairResult200.getValue());
            if (ZVal.toBool(
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("showUncoveredFiles")
                                    .value())
                    || ZVal.toBool(
                            ZVal.notEqualityCheck(
                                    ZVal.getElement(classInfo, "statementsCovered"), 0))) {
                if (ZVal.isTrue(showColors)) {
                    methodColor =
                            env.callMethod(
                                    this,
                                    "getCoverageColor",
                                    Text.class,
                                    ZVal.getElement(classInfo, "methodsCovered"),
                                    ZVal.getElement(classInfo, "methodCount"));
                    linesColor =
                            env.callMethod(
                                    this,
                                    "getCoverageColor",
                                    Text.class,
                                    ZVal.getElement(classInfo, "statementsCovered"),
                                    ZVal.getElement(classInfo, "statementCount"));
                    resetColor = ZVal.assign(ZVal.getElement(colors, "reset"));
                }

                output =
                        toStringR(output, env)
                                + toStringR("\n", env)
                                + toStringR(fullQualifiedPath, env)
                                + toStringR("\n", env)
                                + "  "
                                + toStringR(methodColor, env)
                                + "Methods: "
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                "printCoverageCounts",
                                                Text.class,
                                                ZVal.getElement(classInfo, "methodsCovered"),
                                                ZVal.getElement(classInfo, "methodCount"),
                                                2),
                                        env)
                                + toStringR(resetColor, env)
                                + " "
                                + "  "
                                + toStringR(linesColor, env)
                                + "Lines: "
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                "printCoverageCounts",
                                                Text.class,
                                                ZVal.getElement(classInfo, "statementsCovered"),
                                                ZVal.getElement(classInfo, "statementCount"),
                                                3),
                                        env)
                                + toStringR(resetColor, env);
            }
        }

        return env.returnWithGlobals(
                toStringR(output, env) + toStringR("\n", env), "_SERVER", _SERVER);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "numberOfCoveredElements", typeHint = "int")
    @ConvertedParameter(index = 1, name = "totalNumberOfElements", typeHint = "int")
    private Object getCoverageColor(RuntimeEnv env, Object... args) {
        Object numberOfCoveredElements = assignParameter(args, 0, null);
        Object totalNumberOfElements = assignParameter(args, 1, null);
        Object coverage = null;
        coverage =
                Util.runtimeStaticObject.percent(
                        env, numberOfCoveredElements, totalNumberOfElements);
        if (ZVal.isGreaterThanOrEqualTo(
                coverage,
                ">=",
                toObjectR(this).accessProp(this, env).name("highLowerBound").value())) {
            return ZVal.assign(CONST_COLOR_GREEN);
        }

        if (ZVal.isGreaterThan(
                coverage,
                '>',
                toObjectR(this).accessProp(this, env).name("lowUpperBound").value())) {
            return ZVal.assign(CONST_COLOR_YELLOW);
        }

        return ZVal.assign(CONST_COLOR_RED);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "numberOfCoveredElements", typeHint = "int")
    @ConvertedParameter(index = 1, name = "totalNumberOfElements", typeHint = "int")
    @ConvertedParameter(index = 2, name = "precision", typeHint = "int")
    private Object printCoverageCounts(RuntimeEnv env, Object... args) {
        Object numberOfCoveredElements = assignParameter(args, 0, null);
        Object totalNumberOfElements = assignParameter(args, 1, null);
        Object precision = assignParameter(args, 2, null);
        Object format = null;
        format = "%" + toStringR(precision, env) + "s";
        return ZVal.assign(
                toStringR(
                                Util.runtimeStaticObject.percent(
                                        env,
                                        numberOfCoveredElements,
                                        totalNumberOfElements,
                                        true,
                                        true),
                                env)
                        + " ("
                        + toStringR(
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(format, numberOfCoveredElements)
                                        .value(),
                                env)
                        + "/"
                        + toStringR(
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(format, totalNumberOfElements)
                                        .value(),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color")
    @ConvertedParameter(index = 1, name = "padding")
    @ConvertedParameter(index = 2, name = "string")
    private Object format(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, null);
        Object padding = assignParameter(args, 1, null);
        Object string = assignParameter(args, 2, null);
        Object reset = null;
        reset = ZVal.assign(ZVal.isTrue(color) ? CONST_COLOR_RESET : "");
        return ZVal.assign(
                toStringR(color, env)
                        + toStringR(
                                NamespaceGlobal.str_pad.env(env).call(string, padding).value(), env)
                        + toStringR(reset, env)
                        + toStringR("\n", env));
    }

    public static final Object CONST_COLOR_GREEN = "\u001B[30;42m";

    public static final Object CONST_COLOR_YELLOW = "\u001B[30;43m";

    public static final Object CONST_COLOR_RED = "\u001B[37;41m";

    public static final Object CONST_COLOR_HEADER = "\u001B[1;37;40m";

    public static final Object CONST_COLOR_RESET = "\u001B[0m";

    public static final Object CONST_COLOR_EOL = "\u001B[2K";

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Text";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Text")
                    .setLookup(Text.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "highLowerBound",
                            "lowUpperBound",
                            "showOnlySummary",
                            "showUncoveredFiles")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Text.php")
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
