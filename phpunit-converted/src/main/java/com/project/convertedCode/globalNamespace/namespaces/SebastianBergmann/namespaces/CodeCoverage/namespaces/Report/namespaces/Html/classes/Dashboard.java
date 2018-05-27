package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.Renderer;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/Dashboard.php

*/

public final class Dashboard extends Renderer {

    public Dashboard(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Dashboard.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\Directory"
    )
    @ConvertedParameter(index = 1, name = "file", typeHint = "string")
    public Object render(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object file = assignParameter(args, 1, null);
        Object template = null;
        Object insufficientCoverage = ZVal.newArray();
        Object complexity = ZVal.newArray();
        Object classes = null;
        Object baseLink = null;
        Object coverageDistribution = ZVal.newArray();
        Object projectRisks = ZVal.newArray();
        classes = env.callMethod(node, "getClassesAndTraits", Dashboard.class);
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "dashboard.html",
                        "{{",
                        "}}");
        env.callMethod(this, "setCommonTemplateVariables", Dashboard.class, template, node);
        baseLink = toStringR(env.callMethod(node, "getId", Dashboard.class), env) + "/";
        complexity = env.callMethod(this, "complexity", Dashboard.class, classes, baseLink);
        coverageDistribution =
                env.callMethod(this, "coverageDistribution", Dashboard.class, classes);
        insufficientCoverage =
                env.callMethod(this, "insufficientCoverage", Dashboard.class, classes, baseLink);
        projectRisks = env.callMethod(this, "projectRisks", Dashboard.class, classes, baseLink);
        env.callMethod(
                template,
                "setVar",
                Dashboard.class,
                ZVal.newArray(
                        new ZPair(
                                "insufficient_coverage_classes",
                                ZVal.getElement(insufficientCoverage, "class")),
                        new ZPair(
                                "insufficient_coverage_methods",
                                ZVal.getElement(insufficientCoverage, "method")),
                        new ZPair("project_risks_classes", ZVal.getElement(projectRisks, "class")),
                        new ZPair("project_risks_methods", ZVal.getElement(projectRisks, "method")),
                        new ZPair("complexity_class", ZVal.getElement(complexity, "class")),
                        new ZPair("complexity_method", ZVal.getElement(complexity, "method")),
                        new ZPair(
                                "class_coverage_distribution",
                                ZVal.getElement(coverageDistribution, "class")),
                        new ZPair(
                                "method_coverage_distribution",
                                ZVal.getElement(coverageDistribution, "method"))));
        env.callMethod(template, "renderTo", Dashboard.class, file);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "baseLink", typeHint = "string")
    protected Object complexity(RuntimeEnv env, Object... args) {
        Object classes = assignParameter(args, 0, null);
        Object baseLink = assignParameter(args, 1, null);
        Object result = ZVal.newArray();
        Object method = ZVal.newArray();
        Object methodName = null;
        Object className = null;
        Object _pClass = ZVal.newArray();
        result =
                ZVal.newArray(
                        new ZPair("class", ZVal.newArray()), new ZPair("method", ZVal.newArray()));
        for (ZPair zpairResult175 : ZVal.getIterable(classes, env, false)) {
            className = ZVal.assign(zpairResult175.getKey());
            _pClass = ZVal.assign(zpairResult175.getValue());
            for (ZPair zpairResult176 :
                    ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult176.getKey());
                method = ZVal.assign(zpairResult176.getValue());
                if (ZVal.strictNotEqualityCheck(className, "!==", "*")) {
                    methodName = toStringR(className, env) + "::" + toStringR(methodName, env);
                }

                ZVal.setElementRecursive(
                        result,
                        ZVal.newArray(
                                new ZPair(0, ZVal.getElement(method, "coverage")),
                                new ZPair(1, ZVal.getElement(method, "ccn")),
                                new ZPair(
                                        2,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "<a href=\"%s\">%s</a>",
                                                        NamespaceGlobal.str_replace
                                                                .env(env)
                                                                .addReferneceArgs(
                                                                        new RuntimeArgsWithReferences())
                                                                .call(
                                                                        baseLink,
                                                                        "",
                                                                        ZVal.getElement(
                                                                                method, "link"))
                                                                .value(),
                                                        methodName)
                                                .value())),
                        "method",
                        ZVal.addToArray);
            }

            ZVal.setElementRecursive(
                    result,
                    ZVal.newArray(
                            new ZPair(0, ZVal.getElement(_pClass, "coverage")),
                            new ZPair(1, ZVal.getElement(_pClass, "ccn")),
                            new ZPair(
                                    2,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "<a href=\"%s\">%s</a>",
                                                    NamespaceGlobal.str_replace
                                                            .env(env)
                                                            .addReferneceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    baseLink,
                                                                    "",
                                                                    ZVal.getElement(
                                                                            _pClass, "link"))
                                                            .value(),
                                                    className)
                                            .value())),
                    "class",
                    ZVal.addToArray);
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "class",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(ZVal.getElement(result, "class"))
                                        .value()),
                        new ZPair(
                                "method",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(ZVal.getElement(result, "method"))
                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    protected Object coverageDistribution(RuntimeEnv env, Object... args) {
        Object classes = assignParameter(args, 0, null);
        Object result = ZVal.newArray();
        Object method = ZVal.newArray();
        Object methodName = null;
        Object _pClass = ZVal.newArray();
        Object key = null;
        result =
                ZVal.newArray(
                        new ZPair(
                                "class",
                                ZVal.newArray(
                                        new ZPair("0%", 0),
                                        new ZPair("0-10%", 0),
                                        new ZPair("10-20%", 0),
                                        new ZPair("20-30%", 0),
                                        new ZPair("30-40%", 0),
                                        new ZPair("40-50%", 0),
                                        new ZPair("50-60%", 0),
                                        new ZPair("60-70%", 0),
                                        new ZPair("70-80%", 0),
                                        new ZPair("80-90%", 0),
                                        new ZPair("90-100%", 0),
                                        new ZPair("100%", 0))),
                        new ZPair(
                                "method",
                                ZVal.newArray(
                                        new ZPair("0%", 0),
                                        new ZPair("0-10%", 0),
                                        new ZPair("10-20%", 0),
                                        new ZPair("20-30%", 0),
                                        new ZPair("30-40%", 0),
                                        new ZPair("40-50%", 0),
                                        new ZPair("50-60%", 0),
                                        new ZPair("60-70%", 0),
                                        new ZPair("70-80%", 0),
                                        new ZPair("80-90%", 0),
                                        new ZPair("90-100%", 0),
                                        new ZPair("100%", 0))));
        for (ZPair zpairResult177 : ZVal.getIterable(classes, env, true)) {
            _pClass = ZVal.assign(zpairResult177.getValue());
            for (ZPair zpairResult178 :
                    ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult178.getKey());
                method = ZVal.assign(zpairResult178.getValue());
                if (ZVal.strictEqualityCheck(ZVal.getElement(method, "coverage"), "===", 0)) {
                    ZVal.setElementRecursive(
                            result,
                            ZVal.increment(ZVal.getElementRecursive(result, "method", "0%")),
                            "method",
                            "0%");

                } else if (ZVal.strictEqualityCheck(
                        ZVal.getElement(method, "coverage"), "===", 100)) {
                    ZVal.setElementRecursive(
                            result,
                            ZVal.increment(ZVal.getElementRecursive(result, "method", "100%")),
                            "method",
                            "100%");

                } else {
                    key =
                            ZVal.multiply(
                                    NamespaceGlobal.floor
                                            .env(env)
                                            .call(
                                                    ZVal.divide(
                                                            ZVal.getElement(method, "coverage"),
                                                            10))
                                            .value(),
                                    10);
                    key = toStringR(key, env) + "-" + toStringR(ZVal.add(key, 10), env) + "%";
                    ZVal.setElementRecursive(
                            result,
                            ZVal.increment(ZVal.getElementRecursive(result, "method", key)),
                            "method",
                            key);
                }
            }

            if (ZVal.strictEqualityCheck(ZVal.getElement(_pClass, "coverage"), "===", 0)) {
                ZVal.setElementRecursive(
                        result,
                        ZVal.increment(ZVal.getElementRecursive(result, "class", "0%")),
                        "class",
                        "0%");

            } else if (ZVal.strictEqualityCheck(ZVal.getElement(_pClass, "coverage"), "===", 100)) {
                ZVal.setElementRecursive(
                        result,
                        ZVal.increment(ZVal.getElementRecursive(result, "class", "100%")),
                        "class",
                        "100%");

            } else {
                key =
                        ZVal.multiply(
                                NamespaceGlobal.floor
                                        .env(env)
                                        .call(ZVal.divide(ZVal.getElement(_pClass, "coverage"), 10))
                                        .value(),
                                10);
                key = toStringR(key, env) + "-" + toStringR(ZVal.add(key, 10), env) + "%";
                ZVal.setElementRecursive(
                        result,
                        ZVal.increment(ZVal.getElementRecursive(result, "class", key)),
                        "class",
                        key);
            }
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "class",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(
                                                CRArrayF.array_values
                                                        .env(env)
                                                        .call(ZVal.getElement(result, "class"))
                                                        .value())
                                        .value()),
                        new ZPair(
                                "method",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(
                                                CRArrayF.array_values
                                                        .env(env)
                                                        .call(ZVal.getElement(result, "method"))
                                                        .value())
                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "baseLink", typeHint = "string")
    protected Object insufficientCoverage(RuntimeEnv env, Object... args) {
        Object classes = assignParameter(args, 0, null);
        if (ZVal.isNull(classes)) {
            classes = ZVal.newArray();
        }
        Object baseLink = assignParameter(args, 1, null);
        Object leastTestedClasses = ZVal.newArray();
        Object coverage = null;
        Object method = ZVal.newArray();
        Object leastTestedMethods = ZVal.newArray();
        Object methodName = null;
        Object className = null;
        Object result = ZVal.newArray();
        Object runtimeTempArrayResult6 = null;
        Object _pClass = ZVal.newArray();
        Object key = null;
        leastTestedClasses = ZVal.newArray();
        leastTestedMethods = ZVal.newArray();
        result = ZVal.newArray(new ZPair("class", ""), new ZPair("method", ""));
        for (ZPair zpairResult179 : ZVal.getIterable(classes, env, false)) {
            className = ZVal.assign(zpairResult179.getKey());
            _pClass = ZVal.assign(zpairResult179.getValue());
            for (ZPair zpairResult180 :
                    ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult180.getKey());
                method = ZVal.assign(zpairResult180.getValue());
                if (ZVal.isLessThan(
                        ZVal.getElement(method, "coverage"),
                        '<',
                        toObjectR(this).accessProp(this, env).name("highLowerBound").value())) {
                    key = ZVal.assign(methodName);
                    if (ZVal.strictNotEqualityCheck(className, "!==", "*")) {
                        key = toStringR(className, env) + "::" + toStringR(methodName, env);
                    }

                    ZVal.putArrayElement(
                            leastTestedMethods, key, ZVal.getElement(method, "coverage"));
                }
            }

            if (ZVal.isLessThan(
                    ZVal.getElement(_pClass, "coverage"),
                    '<',
                    toObjectR(this).accessProp(this, env).name("highLowerBound").value())) {
                ZVal.putArrayElement(
                        leastTestedClasses, className, ZVal.getElement(_pClass, "coverage"));
            }
        }

        CRArrayF.asort.env(env).call(leastTestedClasses);
        CRArrayF.asort.env(env).call(leastTestedMethods);
        for (ZPair zpairResult181 : ZVal.getIterable(leastTestedClasses, env, false)) {
            className = ZVal.assign(zpairResult181.getKey());
            coverage = ZVal.assign(zpairResult181.getValue());
            ZVal.putArrayElement(
                    result,
                    "class",
                    toStringR(ZVal.getElement(result, "class"), env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "       <tr><td><a href=\"%s\">%s</a></td><td class=\"text-right\">%d%%</td></tr>"
                                                            + "\n",
                                                    NamespaceGlobal.str_replace
                                                            .env(env)
                                                            .addReferneceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    baseLink,
                                                                    "",
                                                                    ZVal.getElementRecursive(
                                                                            classes, className,
                                                                            "link"))
                                                            .value(),
                                                    className,
                                                    coverage)
                                            .value(),
                                    env));
        }

        for (ZPair zpairResult182 : ZVal.getIterable(leastTestedMethods, env, false)) {
            methodName = ZVal.assign(zpairResult182.getKey());
            coverage = ZVal.assign(zpairResult182.getValue());
            ZVal.list(
                    runtimeTempArrayResult6 =
                            NamespaceGlobal.explode.env(env).call("::", methodName).value(),
                    (_pClass = ZVal.assign(ZVal.getElement(runtimeTempArrayResult6, 0))),
                    (method = ZVal.assign(ZVal.getElement(runtimeTempArrayResult6, 1))));
            ZVal.putArrayElement(
                    result,
                    "method",
                    toStringR(ZVal.getElement(result, "method"), env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "       <tr><td><a href=\"%s\"><abbr title=\"%s\">%s</abbr></a></td><td class=\"text-right\">%d%%</td></tr>"
                                                            + "\n",
                                                    NamespaceGlobal.str_replace
                                                            .env(env)
                                                            .addReferneceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    baseLink,
                                                                    "",
                                                                    ZVal.getElementRecursive(
                                                                            classes, _pClass,
                                                                            "methods", method,
                                                                            "link"))
                                                            .value(),
                                                    methodName,
                                                    method,
                                                    coverage)
                                            .value(),
                                    env));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "baseLink", typeHint = "string")
    protected Object projectRisks(RuntimeEnv env, Object... args) {
        Object classes = assignParameter(args, 0, null);
        if (ZVal.isNull(classes)) {
            classes = ZVal.newArray();
        }
        Object baseLink = assignParameter(args, 1, null);
        Object methodRisks = ZVal.newArray();
        Object method = ZVal.newArray();
        Object methodName = null;
        Object className = null;
        Object result = ZVal.newArray();
        Object crap = null;
        Object runtimeTempArrayResult7 = null;
        Object classRisks = ZVal.newArray();
        Object _pClass = ZVal.newArray();
        Object key = null;
        classRisks = ZVal.newArray();
        methodRisks = ZVal.newArray();
        result = ZVal.newArray(new ZPair("class", ""), new ZPair("method", ""));
        for (ZPair zpairResult183 : ZVal.getIterable(classes, env, false)) {
            className = ZVal.assign(zpairResult183.getKey());
            _pClass = ZVal.assign(zpairResult183.getValue());
            for (ZPair zpairResult184 :
                    ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult184.getKey());
                method = ZVal.assign(zpairResult184.getValue());
                if (ZVal.toBool(
                                ZVal.isLessThan(
                                        ZVal.getElement(method, "coverage"),
                                        '<',
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("highLowerBound")
                                                .value()))
                        && ZVal.toBool(
                                ZVal.isGreaterThan(ZVal.getElement(method, "ccn"), '>', 1))) {
                    key = ZVal.assign(methodName);
                    if (ZVal.strictNotEqualityCheck(className, "!==", "*")) {
                        key = toStringR(className, env) + "::" + toStringR(methodName, env);
                    }

                    ZVal.putArrayElement(methodRisks, key, ZVal.getElement(method, "crap"));
                }
            }

            if (ZVal.toBool(
                            ZVal.isLessThan(
                                    ZVal.getElement(_pClass, "coverage"),
                                    '<',
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("highLowerBound")
                                            .value()))
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    ZVal.getElement(_pClass, "ccn"),
                                    '>',
                                    CRArrayF.count
                                            .env(env)
                                            .call(ZVal.getElement(_pClass, "methods"))
                                            .value()))) {
                ZVal.putArrayElement(classRisks, className, ZVal.getElement(_pClass, "crap"));
            }
        }

        CRArrayF.arsort.env(env).call(classRisks);
        CRArrayF.arsort.env(env).call(methodRisks);
        for (ZPair zpairResult185 : ZVal.getIterable(classRisks, env, false)) {
            className = ZVal.assign(zpairResult185.getKey());
            crap = ZVal.assign(zpairResult185.getValue());
            ZVal.putArrayElement(
                    result,
                    "class",
                    toStringR(ZVal.getElement(result, "class"), env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "       <tr><td><a href=\"%s\">%s</a></td><td class=\"text-right\">%d</td></tr>"
                                                            + "\n",
                                                    NamespaceGlobal.str_replace
                                                            .env(env)
                                                            .addReferneceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    baseLink,
                                                                    "",
                                                                    ZVal.getElementRecursive(
                                                                            classes, className,
                                                                            "link"))
                                                            .value(),
                                                    className,
                                                    crap)
                                            .value(),
                                    env));
        }

        for (ZPair zpairResult186 : ZVal.getIterable(methodRisks, env, false)) {
            methodName = ZVal.assign(zpairResult186.getKey());
            crap = ZVal.assign(zpairResult186.getValue());
            ZVal.list(
                    runtimeTempArrayResult7 =
                            NamespaceGlobal.explode.env(env).call("::", methodName).value(),
                    (_pClass = ZVal.assign(ZVal.getElement(runtimeTempArrayResult7, 0))),
                    (method = ZVal.assign(ZVal.getElement(runtimeTempArrayResult7, 1))));
            ZVal.putArrayElement(
                    result,
                    "method",
                    toStringR(ZVal.getElement(result, "method"), env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "       <tr><td><a href=\"%s\"><abbr title=\"%s\">%s</abbr></a></td><td class=\"text-right\">%d</td></tr>"
                                                            + "\n",
                                                    NamespaceGlobal.str_replace
                                                            .env(env)
                                                            .addReferneceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    baseLink,
                                                                    "",
                                                                    ZVal.getElementRecursive(
                                                                            classes, _pClass,
                                                                            "methods", method,
                                                                            "link"))
                                                            .value(),
                                                    methodName,
                                                    method,
                                                    crap)
                                            .value(),
                                    env));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object getActiveBreadcrumb(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "        <li><a href=\"index.html\">%s</a></li>"
                                        + "\n"
                                        + "        <li class=\"active\">(Dashboard)</li>"
                                        + "\n",
                                env.callMethod(node, "getName", Dashboard.class))
                        .value());
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Html\\Dashboard";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Renderer.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\Dashboard")
                    .setLookup(Dashboard.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "date",
                            "generator",
                            "highLowerBound",
                            "lowUpperBound",
                            "templatePath",
                            "version")
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/Dashboard.php")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer")
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
