package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Version;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.File;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Directory;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Renderer.php

*/

public abstract class Renderer extends RuntimeClassBase {

    public Object templatePath = null;

    public Object generator = null;

    public Object date = null;

    public Object lowUpperBound = null;

    public Object highLowerBound = null;

    public Object version = null;

    public Renderer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Renderer.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "templatePath", typeHint = "string")
    @ConvertedParameter(index = 1, name = "generator", typeHint = "string")
    @ConvertedParameter(index = 2, name = "date", typeHint = "string")
    @ConvertedParameter(index = 3, name = "lowUpperBound", typeHint = "int")
    @ConvertedParameter(index = 4, name = "highLowerBound", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object templatePath = assignParameter(args, 0, null);
        Object generator = assignParameter(args, 1, null);
        Object date = assignParameter(args, 2, null);
        Object lowUpperBound = assignParameter(args, 3, null);
        Object highLowerBound = assignParameter(args, 4, null);
        toObjectR(this).accessProp(this, env).name("templatePath").set(templatePath);
        toObjectR(this).accessProp(this, env).name("generator").set(generator);
        toObjectR(this).accessProp(this, env).name("date").set(date);
        toObjectR(this).accessProp(this, env).name("lowUpperBound").set(lowUpperBound);
        toObjectR(this).accessProp(this, env).name("highLowerBound").set(highLowerBound);
        toObjectR(this)
                .accessProp(this, env)
                .name("version")
                .set(Version.runtimeStaticObject.id(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template", typeHint = "Text_Template")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    protected Object renderItemTemplate(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, null);
        Object data = assignParameter(args, 1, null);
        if (ZVal.isNull(data)) {
            data = ZVal.newArray();
        }
        Object numSeparator = null;
        Object classesLevel = null;
        Object classesBar = null;
        Object linesNumber = null;
        Object methodsLevel = null;
        Object classesNumber = null;
        Object linesBar = null;
        Object methodsBar = null;
        Object methodsNumber = null;
        Object linesLevel = null;
        numSeparator = "&nbsp;/&nbsp;";
        if (ZVal.toBool(ZVal.isset(ZVal.getElement(data, "numClasses")))
                && ZVal.toBool(ZVal.isGreaterThan(ZVal.getElement(data, "numClasses"), '>', 0))) {
            classesLevel =
                    env.callMethod(
                            this,
                            "getColorLevel",
                            Renderer.class,
                            ZVal.getElement(data, "testedClassesPercent"));
            classesNumber =
                    toStringR(ZVal.getElement(data, "numTestedClasses"), env)
                            + toStringR(numSeparator, env)
                            + toStringR(ZVal.getElement(data, "numClasses"), env);
            classesBar =
                    env.callMethod(
                            this,
                            "getCoverageBar",
                            Renderer.class,
                            ZVal.getElement(data, "testedClassesPercent"));

        } else {
            classesLevel = "";
            classesNumber = "0" + toStringR(numSeparator, env) + "0";
            classesBar = "";
            ZVal.putArrayElement(data, "testedClassesPercentAsString", "n/a");
        }

        if (ZVal.isGreaterThan(ZVal.getElement(data, "numMethods"), '>', 0)) {
            methodsLevel =
                    env.callMethod(
                            this,
                            "getColorLevel",
                            Renderer.class,
                            ZVal.getElement(data, "testedMethodsPercent"));
            methodsNumber =
                    toStringR(ZVal.getElement(data, "numTestedMethods"), env)
                            + toStringR(numSeparator, env)
                            + toStringR(ZVal.getElement(data, "numMethods"), env);
            methodsBar =
                    env.callMethod(
                            this,
                            "getCoverageBar",
                            Renderer.class,
                            ZVal.getElement(data, "testedMethodsPercent"));

        } else {
            methodsLevel = "";
            methodsNumber = "0" + toStringR(numSeparator, env) + "0";
            methodsBar = "";
            ZVal.putArrayElement(data, "testedMethodsPercentAsString", "n/a");
        }

        if (ZVal.isGreaterThan(ZVal.getElement(data, "numExecutableLines"), '>', 0)) {
            linesLevel =
                    env.callMethod(
                            this,
                            "getColorLevel",
                            Renderer.class,
                            ZVal.getElement(data, "linesExecutedPercent"));
            linesNumber =
                    toStringR(ZVal.getElement(data, "numExecutedLines"), env)
                            + toStringR(numSeparator, env)
                            + toStringR(ZVal.getElement(data, "numExecutableLines"), env);
            linesBar =
                    env.callMethod(
                            this,
                            "getCoverageBar",
                            Renderer.class,
                            ZVal.getElement(data, "linesExecutedPercent"));

        } else {
            linesLevel = "";
            linesNumber = "0" + toStringR(numSeparator, env) + "0";
            linesBar = "";
            ZVal.putArrayElement(data, "linesExecutedPercentAsString", "n/a");
        }

        env.callMethod(
                template,
                "setVar",
                Renderer.class,
                ZVal.newArray(
                        new ZPair(
                                "icon",
                                ZVal.isTrue(ZVal.getElement(data, "icon"))
                                        ? ZVal.getElement(data, "icon")
                                        : ""),
                        new ZPair(
                                "crap",
                                ZVal.isTrue(ZVal.getElement(data, "crap"))
                                        ? ZVal.getElement(data, "crap")
                                        : ""),
                        new ZPair("name", ZVal.getElement(data, "name")),
                        new ZPair("lines_bar", linesBar),
                        new ZPair(
                                "lines_executed_percent",
                                ZVal.getElement(data, "linesExecutedPercentAsString")),
                        new ZPair("lines_level", linesLevel),
                        new ZPair("lines_number", linesNumber),
                        new ZPair("methods_bar", methodsBar),
                        new ZPair(
                                "methods_tested_percent",
                                ZVal.getElement(data, "testedMethodsPercentAsString")),
                        new ZPair("methods_level", methodsLevel),
                        new ZPair("methods_number", methodsNumber),
                        new ZPair("classes_bar", classesBar),
                        new ZPair(
                                "classes_tested_percent",
                                ZVal.isTrue(ZVal.getElement(data, "testedClassesPercentAsString"))
                                        ? ZVal.getElement(data, "testedClassesPercentAsString")
                                        : ""),
                        new ZPair("classes_level", classesLevel),
                        new ZPair("classes_number", classesNumber)));
        return ZVal.assign(env.callMethod(template, "render", Renderer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template", typeHint = "Text_Template")
    @ConvertedParameter(
        index = 1,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object setCommonTemplateVariables(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, null);
        Object node = assignParameter(args, 1, null);
        env.callMethod(
                template,
                "setVar",
                Renderer.class,
                ZVal.newArray(
                        new ZPair("id", env.callMethod(node, "getId", Renderer.class)),
                        new ZPair("full_path", env.callMethod(node, "getPath", Renderer.class)),
                        new ZPair(
                                "path_to_root",
                                env.callMethod(this, "getPathToRoot", Renderer.class, node)),
                        new ZPair(
                                "breadcrumbs",
                                env.callMethod(this, "getBreadcrumbs", Renderer.class, node)),
                        new ZPair(
                                "date", toObjectR(this).accessProp(this, env).name("date").value()),
                        new ZPair(
                                "version",
                                toObjectR(this).accessProp(this, env).name("version").value()),
                        new ZPair(
                                "runtime",
                                env.callMethod(this, "getRuntimeString", Renderer.class)),
                        new ZPair(
                                "generator",
                                toObjectR(this).accessProp(this, env).name("generator").value()),
                        new ZPair(
                                "low_upper_bound",
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("lowUpperBound")
                                        .value()),
                        new ZPair(
                                "high_lower_bound",
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("highLowerBound")
                                        .value())));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object getBreadcrumbs(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object path = null;
        Object max = null;
        Object pathToRoot = ZVal.newArray();
        Object i = null;
        Object step = null;
        Object breadcrumbs = null;
        breadcrumbs = "";
        path = env.callMethod(node, "getPathAsArray", Renderer.class);
        pathToRoot = ZVal.newArray();
        max = CRArrayF.count.env(env).call(path).value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, File.class, "SebastianBergmann\\CodeCoverage\\Node\\File"))) {
            max = ZVal.decrement(max);
        }

        for (i = 0; ZVal.isLessThan(i, '<', max); i = ZVal.increment(i)) {
            ZVal.addToArray(pathToRoot, NamespaceGlobal.str_repeat.env(env).call("../", i).value());
        }

        for (ZPair zpairResult174 : ZVal.getIterable(path, env, true)) {
            step = ZVal.assign(zpairResult174.getValue());
            if (ZVal.strictNotEqualityCheck(step, "!==", node)) {
                breadcrumbs =
                        toStringR(breadcrumbs, env)
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                "getInactiveBreadcrumb",
                                                Renderer.class,
                                                step,
                                                CRArrayF.array_pop
                                                        .env(env)
                                                        .call(pathToRoot)
                                                        .value()),
                                        env);

            } else {
                breadcrumbs =
                        toStringR(breadcrumbs, env)
                                + toStringR(
                                        env.callMethod(
                                                this, "getActiveBreadcrumb", Renderer.class, step),
                                        env);
            }
        }

        return ZVal.assign(breadcrumbs);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object getActiveBreadcrumb(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object buffer = null;
        buffer =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "        <li class=\"active\">%s</li>" + "\n",
                                env.callMethod(node, "getName", Renderer.class))
                        .value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node,
                        Directory.class,
                        "SebastianBergmann\\CodeCoverage\\Node\\Directory"))) {
            buffer =
                    toStringR(buffer, env)
                            + "        <li>(<a href=\"dashboard.html\">Dashboard</a>)</li>"
                            + "\n";
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    @ConvertedParameter(index = 1, name = "pathToRoot", typeHint = "string")
    protected Object getInactiveBreadcrumb(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object pathToRoot = assignParameter(args, 1, null);
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "        <li><a href=\"%sindex.html\">%s</a></li>" + "\n",
                                pathToRoot, env.callMethod(node, "getName", Renderer.class))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object getPathToRoot(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object depth = null;
        Object id = null;
        id = env.callMethod(node, "getId", Renderer.class);
        depth = NamespaceGlobal.substr_count.env(env).call(id, "/").value();
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(id, "!==", "index"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                node,
                                Directory.class,
                                "SebastianBergmann\\CodeCoverage\\Node\\Directory"))) {
            depth = ZVal.increment(depth);
        }

        return ZVal.assign(NamespaceGlobal.str_repeat.env(env).call("../", depth).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "percent", typeHint = "float")
    protected Object getCoverageBar(RuntimeEnv env, Object... args) {
        Object percent = assignParameter(args, 0, null);
        Object template = null;
        Object level = null;
        level = env.callMethod(this, "getColorLevel", Renderer.class, percent);
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "coverage_bar.html",
                        "{{",
                        "}}");
        env.callMethod(
                template,
                "setVar",
                Renderer.class,
                ZVal.newArray(
                        new ZPair("level", level),
                        new ZPair(
                                "percent",
                                NamespaceGlobal.sprintf.env(env).call("%.2F", percent).value())));
        return ZVal.assign(env.callMethod(template, "render", Renderer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "percent", typeHint = "float")
    protected Object getColorLevel(RuntimeEnv env, Object... args) {
        Object percent = assignParameter(args, 0, null);
        if (ZVal.isLessThanOrEqualTo(
                percent,
                "<=",
                toObjectR(this).accessProp(this, env).name("lowUpperBound").value())) {
            return "danger";
        }

        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                percent,
                                '>',
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("lowUpperBound")
                                        .value()))
                && ZVal.toBool(
                        ZVal.isLessThan(
                                percent,
                                '<',
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("highLowerBound")
                                        .value()))) {
            return "warning";
        }

        return "success";
    }

    @ConvertedMethod
    private Object getRuntimeString(RuntimeEnv env, Object... args) {
        Object runtime = null;
        Object buffer = null;
        runtime = new Runtime(env);
        buffer =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "<a href=\"%s\" target=\"_top\">%s %s</a>",
                                env.callMethod(runtime, "getVendorUrl", Renderer.class),
                                env.callMethod(runtime, "getName", Renderer.class),
                                env.callMethod(runtime, "getVersion", Renderer.class))
                        .value();
        if (ZVal.toBool(env.callMethod(runtime, "hasXdebug", Renderer.class))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        runtime, "hasPHPDBGCodeCoverage", Renderer.class)))) {
            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    " with <a href=\"https://xdebug.org/\">Xdebug %s</a>",
                                                    NamespaceGlobal.phpversion
                                                            .env(env)
                                                            .call("xdebug")
                                                            .value())
                                            .value(),
                                    env);
        }

        return ZVal.assign(buffer);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer")
                    .setLookup(Renderer.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "date",
                            "generator",
                            "highLowerBound",
                            "lowUpperBound",
                            "templatePath",
                            "version")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Html/Renderer.php")
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
