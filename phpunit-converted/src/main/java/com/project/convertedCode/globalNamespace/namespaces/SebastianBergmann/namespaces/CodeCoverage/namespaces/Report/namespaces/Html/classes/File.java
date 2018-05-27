package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Util;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.Renderer;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/File.php

*/

public final class File extends Renderer {

    public Object htmlSpecialCharsFlags =
            ZVal.toLong(ZVal.toLong(2) | ZVal.toLong(0)) | ZVal.toLong(8);

    public File(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\File"
    )
    @ConvertedParameter(index = 1, name = "file", typeHint = "string")
    public Object render(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object file = assignParameter(args, 1, null);
        Object template = null;
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "file.html",
                        "{{",
                        "}}");
        env.callMethod(
                template,
                "setVar",
                File.class,
                ZVal.newArray(
                        new ZPair("items", env.callMethod(this, "renderItems", File.class, node)),
                        new ZPair(
                                "lines", env.callMethod(this, "renderSource", File.class, node))));
        env.callMethod(this, "setCommonTemplateVariables", File.class, template, node);
        env.callMethod(template, "renderTo", File.class, file);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\File"
    )
    protected Object renderItems(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object template = null;
        Object items = null;
        Object methodItemTemplate = null;
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "file_item.html",
                        "{{",
                        "}}");
        methodItemTemplate =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "method_item.html",
                        "{{",
                        "}}");
        items =
                env.callMethod(
                        this,
                        "renderItemTemplate",
                        File.class,
                        template,
                        ZVal.newArray(
                                new ZPair("name", "Total"),
                                new ZPair(
                                        "numClasses",
                                        env.callMethod(node, "getNumClassesAndTraits", File.class)),
                                new ZPair(
                                        "numTestedClasses",
                                        env.callMethod(
                                                node, "getNumTestedClassesAndTraits", File.class)),
                                new ZPair(
                                        "numMethods",
                                        env.callMethod(
                                                node, "getNumFunctionsAndMethods", File.class)),
                                new ZPair(
                                        "numTestedMethods",
                                        env.callMethod(
                                                node,
                                                "getNumTestedFunctionsAndMethods",
                                                File.class)),
                                new ZPair(
                                        "linesExecutedPercent",
                                        env.callMethod(
                                                node, "getLineExecutedPercent", File.class, false)),
                                new ZPair(
                                        "linesExecutedPercentAsString",
                                        env.callMethod(node, "getLineExecutedPercent", File.class)),
                                new ZPair(
                                        "numExecutedLines",
                                        env.callMethod(node, "getNumExecutedLines", File.class)),
                                new ZPair(
                                        "numExecutableLines",
                                        env.callMethod(node, "getNumExecutableLines", File.class)),
                                new ZPair(
                                        "testedMethodsPercent",
                                        env.callMethod(
                                                node,
                                                "getTestedFunctionsAndMethodsPercent",
                                                File.class,
                                                false)),
                                new ZPair(
                                        "testedMethodsPercentAsString",
                                        env.callMethod(
                                                node,
                                                "getTestedFunctionsAndMethodsPercent",
                                                File.class)),
                                new ZPair(
                                        "testedClassesPercent",
                                        env.callMethod(
                                                node,
                                                "getTestedClassesAndTraitsPercent",
                                                File.class,
                                                false)),
                                new ZPair(
                                        "testedClassesPercentAsString",
                                        env.callMethod(
                                                node,
                                                "getTestedClassesAndTraitsPercent",
                                                File.class)),
                                new ZPair(
                                        "crap",
                                        "<abbr title=\"Change Risk Anti-Patterns (CRAP) Index\">CRAP</abbr>")));
        items =
                toStringR(items, env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "renderFunctionItems",
                                        File.class,
                                        env.callMethod(node, "getFunctions", File.class),
                                        methodItemTemplate),
                                env);
        items =
                toStringR(items, env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "renderTraitOrClassItems",
                                        File.class,
                                        env.callMethod(node, "getTraits", File.class),
                                        template,
                                        methodItemTemplate),
                                env);
        items =
                toStringR(items, env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "renderTraitOrClassItems",
                                        File.class,
                                        env.callMethod(node, "getClasses", File.class),
                                        template,
                                        methodItemTemplate),
                                env);
        return ZVal.assign(items);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items", typeHint = "array")
    @ConvertedParameter(index = 1, name = "template", typeHint = "Text_Template")
    @ConvertedParameter(index = 2, name = "methodItemTemplate", typeHint = "Text_Template")
    protected Object renderTraitOrClassItems(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, null);
        Object template = assignParameter(args, 1, null);
        Object methodItemTemplate = assignParameter(args, 2, null);
        Object item = ZVal.newArray();
        Object method = ZVal.newArray();
        Object numTestedClasses = null;
        Object numTestedMethods = null;
        Object numMethods = null;
        Object numClasses = null;
        Object name = null;
        Object linesExecutedPercentAsString = null;
        Object buffer = null;
        buffer = "";
        if (ZVal.isEmpty(items)) {
            return ZVal.assign(buffer);
        }

        for (ZPair zpairResult189 : ZVal.getIterable(items, env, false)) {
            name = ZVal.assign(zpairResult189.getKey());
            item = ZVal.assign(zpairResult189.getValue());
            numMethods = 0;
            numTestedMethods = 0;
            for (ZPair zpairResult190 :
                    ZVal.getIterable(ZVal.getElement(item, "methods"), env, true)) {
                method = ZVal.assign(zpairResult190.getValue());
                if (ZVal.isGreaterThan(ZVal.getElement(method, "executableLines"), '>', 0)) {
                    numMethods = ZVal.increment(numMethods);
                    if (ZVal.strictEqualityCheck(
                            ZVal.getElement(method, "executedLines"),
                            "===",
                            ZVal.getElement(method, "executableLines"))) {
                        numTestedMethods = ZVal.increment(numTestedMethods);
                    }
                }
            }

            if (ZVal.isGreaterThan(ZVal.getElement(item, "executableLines"), '>', 0)) {
                numClasses = 1;
                numTestedClasses =
                        ZVal.assign(ZVal.equalityCheck(numTestedMethods, numMethods) ? 1 : 0);
                linesExecutedPercentAsString =
                        Util.runtimeStaticObject.percent(
                                env,
                                ZVal.getElement(item, "executedLines"),
                                ZVal.getElement(item, "executableLines"),
                                true);

            } else {
                numClasses = "n/a";
                numTestedClasses = "n/a";
                linesExecutedPercentAsString = "n/a";
            }

            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "renderItemTemplate",
                                            File.class,
                                            template,
                                            ZVal.newArray(
                                                    new ZPair("name", name),
                                                    new ZPair("numClasses", numClasses),
                                                    new ZPair("numTestedClasses", numTestedClasses),
                                                    new ZPair("numMethods", numMethods),
                                                    new ZPair("numTestedMethods", numTestedMethods),
                                                    new ZPair(
                                                            "linesExecutedPercent",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    ZVal.getElement(
                                                                            item, "executedLines"),
                                                                    ZVal.getElement(
                                                                            item,
                                                                            "executableLines"),
                                                                    false)),
                                                    new ZPair(
                                                            "linesExecutedPercentAsString",
                                                            linesExecutedPercentAsString),
                                                    new ZPair(
                                                            "numExecutedLines",
                                                            ZVal.getElement(item, "executedLines")),
                                                    new ZPair(
                                                            "numExecutableLines",
                                                            ZVal.getElement(
                                                                    item, "executableLines")),
                                                    new ZPair(
                                                            "testedMethodsPercent",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    numTestedMethods,
                                                                    numMethods)),
                                                    new ZPair(
                                                            "testedMethodsPercentAsString",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    numTestedMethods,
                                                                    numMethods,
                                                                    true)),
                                                    new ZPair(
                                                            "testedClassesPercent",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    ZVal.equalityCheck(
                                                                                    numTestedMethods,
                                                                                    numMethods)
                                                                            ? 1
                                                                            : 0,
                                                                    1)),
                                                    new ZPair(
                                                            "testedClassesPercentAsString",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    ZVal.equalityCheck(
                                                                                    numTestedMethods,
                                                                                    numMethods)
                                                                            ? 1
                                                                            : 0,
                                                                    1,
                                                                    true)),
                                                    new ZPair(
                                                            "crap",
                                                            ZVal.getElement(item, "crap")))),
                                    env);
            for (ZPair zpairResult191 :
                    ZVal.getIterable(ZVal.getElement(item, "methods"), env, true)) {
                method = ZVal.assign(zpairResult191.getValue());
                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                "renderFunctionOrMethodItem",
                                                File.class,
                                                methodItemTemplate,
                                                method,
                                                "&nbsp;"),
                                        env);
            }
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "functions", typeHint = "array")
    @ConvertedParameter(index = 1, name = "template", typeHint = "Text_Template")
    protected Object renderFunctionItems(RuntimeEnv env, Object... args) {
        Object functions = assignParameter(args, 0, null);
        Object template = assignParameter(args, 1, null);
        Object function = null;
        Object buffer = null;
        if (ZVal.isEmpty(functions)) {
            return "";
        }

        buffer = "";
        for (ZPair zpairResult192 : ZVal.getIterable(functions, env, true)) {
            function = ZVal.assign(zpairResult192.getValue());
            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "renderFunctionOrMethodItem",
                                            File.class,
                                            template,
                                            function),
                                    env);
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template", typeHint = "Text_Template")
    @ConvertedParameter(index = 1, name = "item", typeHint = "array")
    @ConvertedParameter(index = 2, name = "indent", typeHint = "string")
    protected Object renderFunctionOrMethodItem(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, null);
        Object item = assignParameter(args, 1, null);
        if (ZVal.isNull(item)) {
            item = ZVal.newArray();
        }
        Object indent = assignParameter(args, 2, null);
        if (ZVal.isNull(indent)) {
            indent = "";
        }
        Object numTestedMethods = null;
        Object numMethods = null;
        numMethods = 0;
        numTestedMethods = 0;
        if (ZVal.isGreaterThan(ZVal.getElement(item, "executableLines"), '>', 0)) {
            numMethods = 1;
            if (ZVal.strictEqualityCheck(
                    ZVal.getElement(item, "executedLines"),
                    "===",
                    ZVal.getElement(item, "executableLines"))) {
                numTestedMethods = 1;
            }
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "renderItemTemplate",
                        File.class,
                        template,
                        ZVal.newArray(
                                new ZPair(
                                        "name",
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "%s<a href=\"#%d\"><abbr title=\"%s\">%s</abbr></a>",
                                                        indent,
                                                        ZVal.getElement(item, "startLine"),
                                                        NamespaceGlobal.htmlspecialchars
                                                                .env(env)
                                                                .call(
                                                                        ZVal.getElement(
                                                                                item, "signature"),
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name(
                                                                                        "htmlSpecialCharsFlags")
                                                                                .value())
                                                                .value(),
                                                        ZVal.isTrue(
                                                                        ZVal.getElement(
                                                                                item,
                                                                                "functionName"))
                                                                ? ZVal.getElement(
                                                                        item, "functionName")
                                                                : ZVal.getElement(
                                                                        item, "methodName"))
                                                .value()),
                                new ZPair("numMethods", numMethods),
                                new ZPair("numTestedMethods", numTestedMethods),
                                new ZPair(
                                        "linesExecutedPercent",
                                        Util.runtimeStaticObject.percent(
                                                env,
                                                ZVal.getElement(item, "executedLines"),
                                                ZVal.getElement(item, "executableLines"))),
                                new ZPair(
                                        "linesExecutedPercentAsString",
                                        Util.runtimeStaticObject.percent(
                                                env,
                                                ZVal.getElement(item, "executedLines"),
                                                ZVal.getElement(item, "executableLines"),
                                                true)),
                                new ZPair(
                                        "numExecutedLines", ZVal.getElement(item, "executedLines")),
                                new ZPair(
                                        "numExecutableLines",
                                        ZVal.getElement(item, "executableLines")),
                                new ZPair(
                                        "testedMethodsPercent",
                                        Util.runtimeStaticObject.percent(env, numTestedMethods, 1)),
                                new ZPair(
                                        "testedMethodsPercentAsString",
                                        Util.runtimeStaticObject.percent(
                                                env, numTestedMethods, 1, true)),
                                new ZPair("crap", ZVal.getElement(item, "crap")))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\File"
    )
    protected Object renderSource(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object node = assignParameter(args, 0, null);
        Object testData = ZVal.newArray();
        Object trClass = null;
        Object test = null;
        Object lineCss = null;
        Object line = null;
        Object testCSS = null;
        Object popover = null;
        Object i = null;
        Object codeLines = null;
        Object numTests = null;
        Object coverageData = ZVal.newArray();
        Object popoverTitle = null;
        Object lines = null;
        Object popoverContent = null;
        coverageData = env.callMethod(node, "getCoverageData", File.class);
        testData = env.callMethod(node, "getTestData", File.class);
        codeLines =
                env.callMethod(
                        this, "loadFile", File.class, env.callMethod(node, "getPath", File.class));
        lines = "";
        i = 1;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult193 : ZVal.getIterable(codeLines, env, true)) {
            line = ZVal.assign(zpairResult193.getValue());
            trClass = "";
            popoverContent = "";
            popoverTitle = "";
            if (CRArrayF.array_key_exists.env(env).call(i, coverageData).getBool()) {
                numTests =
                        ZVal.assign(
                                ZVal.isTrue(ZVal.getElement(coverageData, i))
                                        ? CRArrayF.count
                                                .env(env)
                                                .call(ZVal.getElement(coverageData, i))
                                                .value()
                                        : 0);
                if (ZVal.strictEqualityCheck(
                        ZVal.getElement(coverageData, i), "===", ZVal.getNull())) {
                    trClass = " class=\"warning\"";

                } else if (ZVal.equalityCheck(numTests, 0)) {
                    trClass = " class=\"danger\"";

                } else {
                    lineCss = "covered-by-large-tests";
                    popoverContent = "<ul>";
                    if (ZVal.isGreaterThan(numTests, '>', 1)) {
                        popoverTitle =
                                toStringR(numTests, env) + " tests cover line " + toStringR(i, env);

                    } else {
                        popoverTitle = "1 test covers line " + toStringR(i, env);
                    }

                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult194 :
                            ZVal.getIterable(ZVal.getElement(coverageData, i), env, true)) {
                        test = ZVal.assign(zpairResult194.getValue());
                        if (ZVal.toBool(ZVal.equalityCheck(lineCss, "covered-by-large-tests"))
                                && ZVal.toBool(
                                        ZVal.equalityCheck(
                                                ZVal.getElementRecursive(testData, test, "size"),
                                                "medium"))) {
                            lineCss = "covered-by-medium-tests";

                        } else if (ZVal.equalityCheck(
                                ZVal.getElementRecursive(testData, test, "size"), "small")) {
                            lineCss = "covered-by-small-tests";
                        }

                        SwitchEnumType7 switchVariable7 =
                                ZVal.getEnum(
                                        ZVal.getElementRecursive(testData, test, "status"),
                                        SwitchEnumType7.DEFAULT_CASE,
                                        SwitchEnumType7.INTEGER_0,
                                        0,
                                        SwitchEnumType7.INTEGER_1,
                                        1,
                                        SwitchEnumType7.INTEGER_2,
                                        2,
                                        SwitchEnumType7.INTEGER_3,
                                        3,
                                        SwitchEnumType7.INTEGER_4,
                                        4);
                        switch (switchVariable7) {
                            case INTEGER_0:
                                SwitchEnumType8 switchVariable8 =
                                        ZVal.getEnum(
                                                ZVal.getElementRecursive(testData, test, "size"),
                                                SwitchEnumType8.DEFAULT_CASE,
                                                SwitchEnumType8.STRING_small,
                                                "small",
                                                SwitchEnumType8.STRING_medium,
                                                "medium");
                                switch (switchVariable8) {
                                    case STRING_small:
                                        testCSS = " class=\"covered-by-small-tests\"";
                                        break;
                                    case STRING_medium:
                                        testCSS = " class=\"covered-by-medium-tests\"";
                                        break;
                                    case DEFAULT_CASE:
                                        testCSS = " class=\"covered-by-large-tests\"";
                                        break;
                                }
                                ;
                                break;
                            case INTEGER_1:
                            case INTEGER_2:
                                testCSS = " class=\"warning\"";
                                break;
                            case INTEGER_3:
                                testCSS = " class=\"danger\"";
                                break;
                            case INTEGER_4:
                                testCSS = " class=\"danger\"";
                                break;
                            case DEFAULT_CASE:
                                testCSS = "";
                        }
                        ;
                        popoverContent =
                                toStringR(popoverContent, env)
                                        + toStringR(
                                                NamespaceGlobal.sprintf
                                                        .env(env)
                                                        .call(
                                                                "<li%s>%s</li>",
                                                                testCSS,
                                                                NamespaceGlobal.htmlspecialchars
                                                                        .env(env)
                                                                        .call(
                                                                                test,
                                                                                toObjectR(this)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "htmlSpecialCharsFlags")
                                                                                        .value())
                                                                        .value())
                                                        .value(),
                                                env);
                    }

                    popoverContent = toStringR(popoverContent, env) + "</ul>";
                    trClass = " class=\"" + toStringR(lineCss, env) + " popin\"";
                }
            }

            popover = "";
            if (!ZVal.isEmpty(popoverTitle)) {
                popover =
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        " data-title=\"%s\" data-content=\"%s\" data-placement=\"bottom\" data-html=\"true\"",
                                        popoverTitle,
                                        NamespaceGlobal.htmlspecialchars
                                                .env(env)
                                                .call(
                                                        popoverContent,
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("htmlSpecialCharsFlags")
                                                                .value())
                                                .value())
                                .value();
            }

            lines =
                    toStringR(lines, env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "     <tr%s%s><td><div align=\"right\"><a name=\"%d\"></a><a href=\"#%d\">%d</a></div></td><td class=\"codeLine\">%s</td></tr>"
                                                            + "\n",
                                                    trClass, popover, i, i, i, line)
                                            .value(),
                                    env);
            i = ZVal.increment(i);
        }

        return ZVal.assign(lines);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object loadFile(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object file = assignParameter(args, 0, null);
        Object jj = null;
        Object line = null;
        Object i = null;
        Object j = null;
        Object stringFlag = null;
        Object token = null;
        Object result = ZVal.newArray();
        Object colour = null;
        Object runtimeTempArrayResult8 = null;
        Object tokens = ZVal.newArray();
        Object fileEndsWithNewLine = null;
        Object buffer = null;
        Object lines = ZVal.newArray();
        Object value = null;
        buffer = function_file_get_contents.f.env(env).call(file).value();
        tokens = NamespaceGlobal.token_get_all.env(env).call(buffer).value();
        result = ZVal.newArray(new ZPair(0, ""));
        i = 0;
        stringFlag = false;
        fileEndsWithNewLine =
                ZVal.equalityCheck(NamespaceGlobal.substr.env(env).call(buffer, -1).value(), "\n");
        buffer = null;
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult195 : ZVal.getIterable(tokens, env, false)) {
            j = ZVal.assign(zpairResult195.getKey());
            token = ZVal.assign(zpairResult195.getValue());
            if (function_is_string.f.env(env).call(token).getBool()) {
                if (ZVal.toBool(ZVal.strictEqualityCheck(token, "===", "\""))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.getElement(tokens, ZVal.subtract(j, 1)),
                                        "!==",
                                        "\\"))) {
                    ZVal.putArrayElement(
                            result,
                            i,
                            toStringR(ZVal.getElement(result, i), env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "<span class=\"string\">%s</span>",
                                                            NamespaceGlobal.htmlspecialchars
                                                                    .env(env)
                                                                    .call(
                                                                            token,
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "htmlSpecialCharsFlags")
                                                                                    .value())
                                                                    .value())
                                                    .value(),
                                            env));
                    stringFlag = !ZVal.isTrue(stringFlag);

                } else {
                    ZVal.putArrayElement(
                            result,
                            i,
                            toStringR(ZVal.getElement(result, i), env)
                                    + toStringR(
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "<span class=\"keyword\">%s</span>",
                                                            NamespaceGlobal.htmlspecialchars
                                                                    .env(env)
                                                                    .call(
                                                                            token,
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "htmlSpecialCharsFlags")
                                                                                    .value())
                                                                    .value())
                                                    .value(),
                                            env));
                }

                continue;
            }

            ZVal.list(
                    runtimeTempArrayResult8 = token,
                    (token = ZVal.assign(ZVal.getElement(runtimeTempArrayResult8, 0))),
                    (value = ZVal.assign(ZVal.getElement(runtimeTempArrayResult8, 1))));
            value =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    ZVal.newArray(new ZPair(0, "\t"), new ZPair(1, " ")),
                                    ZVal.newArray(
                                            new ZPair(0, "&nbsp;&nbsp;&nbsp;&nbsp;"),
                                            new ZPair(1, "&nbsp;")),
                                    NamespaceGlobal.htmlspecialchars
                                            .env(env)
                                            .call(
                                                    value,
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("htmlSpecialCharsFlags")
                                                            .value())
                                            .value())
                            .value();
            if (ZVal.strictEqualityCheck(value, "===", "\n")) {
                ZVal.putArrayElement(result, ((long) (i = ZVal.increment(i))), "");

            } else {
                lines = NamespaceGlobal.explode.env(env).call("\n", value).value();
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult196 : ZVal.getIterable(lines, env, false)) {
                    jj = ZVal.assign(zpairResult196.getKey());
                    line = ZVal.assign(zpairResult196.getValue());
                    line = NamespaceGlobal.trim.env(env).call(line).value();
                    if (ZVal.strictNotEqualityCheck(line, "!==", "")) {
                        if (ZVal.isTrue(stringFlag)) {
                            colour = "string";

                        } else {
                            SwitchEnumType9 switchVariable9 =
                                    ZVal.getEnum(
                                            token,
                                            SwitchEnumType9.DEFAULT_CASE,
                                            SwitchEnumType9.DYNAMIC_TYPE_24,
                                            321,
                                            SwitchEnumType9.DYNAMIC_TYPE_25,
                                            377,
                                            SwitchEnumType9.DYNAMIC_TYPE_26,
                                            378,
                                            SwitchEnumType9.DYNAMIC_TYPE_27,
                                            312,
                                            SwitchEnumType9.DYNAMIC_TYPE_28,
                                            368,
                                            SwitchEnumType9.DYNAMIC_TYPE_29,
                                            338,
                                            SwitchEnumType9.DYNAMIC_TYPE_30,
                                            343,
                                            SwitchEnumType9.DYNAMIC_TYPE_31,
                                            369,
                                            SwitchEnumType9.DYNAMIC_TYPE_32,
                                            341,
                                            SwitchEnumType9.DYNAMIC_TYPE_33,
                                            350,
                                            SwitchEnumType9.DYNAMIC_TYPE_34,
                                            361,
                                            SwitchEnumType9.DYNAMIC_TYPE_35,
                                            306,
                                            SwitchEnumType9.DYNAMIC_TYPE_36,
                                            344,
                                            SwitchEnumType9.DYNAMIC_TYPE_37,
                                            342,
                                            SwitchEnumType9.DYNAMIC_TYPE_38,
                                            328,
                                            SwitchEnumType9.DYNAMIC_TYPE_39,
                                            309,
                                            SwitchEnumType9.DYNAMIC_TYPE_40,
                                            308,
                                            SwitchEnumType9.DYNAMIC_TYPE_41,
                                            359,
                                            SwitchEnumType9.DYNAMIC_TYPE_42,
                                            337,
                                            SwitchEnumType9.DYNAMIC_TYPE_43,
                                            333,
                                            SwitchEnumType9.DYNAMIC_TYPE_44,
                                            335,
                                            SwitchEnumType9.DYNAMIC_TYPE_45,
                                            310,
                                            SwitchEnumType9.DYNAMIC_TYPE_46,
                                            340,
                                            SwitchEnumType9.DYNAMIC_TYPE_47,
                                            331,
                                            SwitchEnumType9.DYNAMIC_TYPE_48,
                                            326,
                                            SwitchEnumType9.DYNAMIC_TYPE_49,
                                            364,
                                            SwitchEnumType9.DYNAMIC_TYPE_50,
                                            313,
                                            SwitchEnumType9.DYNAMIC_TYPE_51,
                                            351,
                                            SwitchEnumType9.DYNAMIC_TYPE_52,
                                            334,
                                            SwitchEnumType9.DYNAMIC_TYPE_53,
                                            346,
                                            SwitchEnumType9.DYNAMIC_TYPE_54,
                                            355,
                                            SwitchEnumType9.DYNAMIC_TYPE_55,
                                            327,
                                            SwitchEnumType9.DYNAMIC_TYPE_56,
                                            365,
                                            SwitchEnumType9.DYNAMIC_TYPE_57,
                                            258,
                                            SwitchEnumType9.DYNAMIC_TYPE_58,
                                            259,
                                            SwitchEnumType9.DYNAMIC_TYPE_59,
                                            294,
                                            SwitchEnumType9.DYNAMIC_TYPE_60,
                                            354,
                                            SwitchEnumType9.DYNAMIC_TYPE_61,
                                            363,
                                            SwitchEnumType9.DYNAMIC_TYPE_62,
                                            358,
                                            SwitchEnumType9.DYNAMIC_TYPE_63,
                                            265,
                                            SwitchEnumType9.DYNAMIC_TYPE_64,
                                            263,
                                            SwitchEnumType9.DYNAMIC_TYPE_65,
                                            264,
                                            SwitchEnumType9.DYNAMIC_TYPE_66,
                                            388,
                                            SwitchEnumType9.DYNAMIC_TYPE_67,
                                            305,
                                            SwitchEnumType9.DYNAMIC_TYPE_68,
                                            314,
                                            SwitchEnumType9.DYNAMIC_TYPE_69,
                                            315,
                                            SwitchEnumType9.DYNAMIC_TYPE_70,
                                            316,
                                            SwitchEnumType9.DYNAMIC_TYPE_71,
                                            261,
                                            SwitchEnumType9.DYNAMIC_TYPE_72,
                                            262,
                                            SwitchEnumType9.DYNAMIC_TYPE_73,
                                            348,
                                            SwitchEnumType9.DYNAMIC_TYPE_74,
                                            311,
                                            SwitchEnumType9.DYNAMIC_TYPE_75,
                                            352,
                                            SwitchEnumType9.DYNAMIC_TYPE_76,
                                            362,
                                            SwitchEnumType9.DYNAMIC_TYPE_77,
                                            349,
                                            SwitchEnumType9.DYNAMIC_TYPE_78,
                                            357,
                                            SwitchEnumType9.DYNAMIC_TYPE_79,
                                            353,
                                            SwitchEnumType9.DYNAMIC_TYPE_80,
                                            356,
                                            SwitchEnumType9.DYNAMIC_TYPE_81,
                                            330,
                                            SwitchEnumType9.DYNAMIC_TYPE_82,
                                            267);
                            switch (switchVariable9) {
                                case DYNAMIC_TYPE_24:
                                    colour = "html";
                                    break;
                                case DYNAMIC_TYPE_25:
                                case DYNAMIC_TYPE_26:
                                    colour = "comment";
                                    break;
                                case DYNAMIC_TYPE_27:
                                case DYNAMIC_TYPE_28:
                                case DYNAMIC_TYPE_29:
                                case DYNAMIC_TYPE_30:
                                case DYNAMIC_TYPE_31:
                                case DYNAMIC_TYPE_32:
                                case DYNAMIC_TYPE_33:
                                case DYNAMIC_TYPE_34:
                                case DYNAMIC_TYPE_35:
                                case DYNAMIC_TYPE_36:
                                case DYNAMIC_TYPE_37:
                                case DYNAMIC_TYPE_38:
                                case DYNAMIC_TYPE_39:
                                case DYNAMIC_TYPE_40:
                                case DYNAMIC_TYPE_41:
                                case DYNAMIC_TYPE_42:
                                case DYNAMIC_TYPE_43:
                                case DYNAMIC_TYPE_44:
                                case DYNAMIC_TYPE_45:
                                case DYNAMIC_TYPE_46:
                                case DYNAMIC_TYPE_47:
                                case DYNAMIC_TYPE_48:
                                case DYNAMIC_TYPE_49:
                                case DYNAMIC_TYPE_50:
                                case DYNAMIC_TYPE_51:
                                case DYNAMIC_TYPE_52:
                                case DYNAMIC_TYPE_53:
                                case DYNAMIC_TYPE_54:
                                case DYNAMIC_TYPE_55:
                                case DYNAMIC_TYPE_56:
                                case DYNAMIC_TYPE_57:
                                case DYNAMIC_TYPE_58:
                                case DYNAMIC_TYPE_59:
                                case DYNAMIC_TYPE_60:
                                case DYNAMIC_TYPE_61:
                                case DYNAMIC_TYPE_62:
                                case DYNAMIC_TYPE_63:
                                case DYNAMIC_TYPE_64:
                                case DYNAMIC_TYPE_65:
                                case DYNAMIC_TYPE_66:
                                case DYNAMIC_TYPE_67:
                                case DYNAMIC_TYPE_68:
                                case DYNAMIC_TYPE_69:
                                case DYNAMIC_TYPE_70:
                                case DYNAMIC_TYPE_71:
                                case DYNAMIC_TYPE_72:
                                case DYNAMIC_TYPE_73:
                                case DYNAMIC_TYPE_74:
                                case DYNAMIC_TYPE_75:
                                case DYNAMIC_TYPE_76:
                                case DYNAMIC_TYPE_77:
                                case DYNAMIC_TYPE_78:
                                case DYNAMIC_TYPE_79:
                                case DYNAMIC_TYPE_80:
                                case DYNAMIC_TYPE_81:
                                case DYNAMIC_TYPE_82:
                                    colour = "keyword";
                                    break;
                                case DEFAULT_CASE:
                                    colour = "default";
                            }
                            ;
                        }

                        ZVal.putArrayElement(
                                result,
                                i,
                                toStringR(ZVal.getElement(result, i), env)
                                        + toStringR(
                                                NamespaceGlobal.sprintf
                                                        .env(env)
                                                        .call(
                                                                "<span class=\"%s\">%s</span>",
                                                                colour, line)
                                                        .value(),
                                                env));
                    }

                    if (ZVal.isset(ZVal.getElement(lines, ZVal.add(jj, 1)))) {
                        ZVal.putArrayElement(result, ((long) (i = ZVal.increment(i))), "");
                    }
                }
            }
        }

        if (ZVal.isTrue(fileEndsWithNewLine)) {
            ZVal.unsetArrayElement(
                    result, ZVal.subtract(CRArrayF.count.env(env).call(result).value(), 1));
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Html\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Renderer.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\File")
                    .setLookup(File.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "date",
                            "generator",
                            "highLowerBound",
                            "htmlSpecialCharsFlags",
                            "lowUpperBound",
                            "templatePath",
                            "version")
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/File.php")
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

    private enum SwitchEnumType7 {
        INTEGER_0,
        INTEGER_1,
        INTEGER_2,
        INTEGER_3,
        INTEGER_4,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType8 {
        STRING_small,
        STRING_medium,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType9 {
        DYNAMIC_TYPE_24,
        DYNAMIC_TYPE_25,
        DYNAMIC_TYPE_26,
        DYNAMIC_TYPE_27,
        DYNAMIC_TYPE_28,
        DYNAMIC_TYPE_29,
        DYNAMIC_TYPE_30,
        DYNAMIC_TYPE_31,
        DYNAMIC_TYPE_32,
        DYNAMIC_TYPE_33,
        DYNAMIC_TYPE_34,
        DYNAMIC_TYPE_35,
        DYNAMIC_TYPE_36,
        DYNAMIC_TYPE_37,
        DYNAMIC_TYPE_38,
        DYNAMIC_TYPE_39,
        DYNAMIC_TYPE_40,
        DYNAMIC_TYPE_41,
        DYNAMIC_TYPE_42,
        DYNAMIC_TYPE_43,
        DYNAMIC_TYPE_44,
        DYNAMIC_TYPE_45,
        DYNAMIC_TYPE_46,
        DYNAMIC_TYPE_47,
        DYNAMIC_TYPE_48,
        DYNAMIC_TYPE_49,
        DYNAMIC_TYPE_50,
        DYNAMIC_TYPE_51,
        DYNAMIC_TYPE_52,
        DYNAMIC_TYPE_53,
        DYNAMIC_TYPE_54,
        DYNAMIC_TYPE_55,
        DYNAMIC_TYPE_56,
        DYNAMIC_TYPE_57,
        DYNAMIC_TYPE_58,
        DYNAMIC_TYPE_59,
        DYNAMIC_TYPE_60,
        DYNAMIC_TYPE_61,
        DYNAMIC_TYPE_62,
        DYNAMIC_TYPE_63,
        DYNAMIC_TYPE_64,
        DYNAMIC_TYPE_65,
        DYNAMIC_TYPE_66,
        DYNAMIC_TYPE_67,
        DYNAMIC_TYPE_68,
        DYNAMIC_TYPE_69,
        DYNAMIC_TYPE_70,
        DYNAMIC_TYPE_71,
        DYNAMIC_TYPE_72,
        DYNAMIC_TYPE_73,
        DYNAMIC_TYPE_74,
        DYNAMIC_TYPE_75,
        DYNAMIC_TYPE_76,
        DYNAMIC_TYPE_77,
        DYNAMIC_TYPE_78,
        DYNAMIC_TYPE_79,
        DYNAMIC_TYPE_80,
        DYNAMIC_TYPE_81,
        DYNAMIC_TYPE_82,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
