package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.Renderer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/Directory.php

*/

public final class Directory extends Renderer {

    public Directory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Directory.class) {
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
        Object item = null;
        Object items = null;
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "directory.html",
                        "{{",
                        "}}");
        env.callMethod(this, "setCommonTemplateVariables", Directory.class, template, node);
        items = env.callMethod(this, "renderItem", Directory.class, node, true);
        for (ZPair zpairResult187 :
                ZVal.getIterable(
                        env.callMethod(node, "getDirectories", Directory.class), env, true)) {
            item = ZVal.assign(zpairResult187.getValue());
            items =
                    toStringR(items, env)
                            + toStringR(
                                    env.callMethod(this, "renderItem", Directory.class, item), env);
        }

        for (ZPair zpairResult188 :
                ZVal.getIterable(env.callMethod(node, "getFiles", Directory.class), env, true)) {
            item = ZVal.assign(zpairResult188.getValue());
            items =
                    toStringR(items, env)
                            + toStringR(
                                    env.callMethod(this, "renderItem", Directory.class, item), env);
        }

        env.callMethod(
                template,
                "setVar",
                Directory.class,
                ZVal.newArray(
                        new ZPair("id", env.callMethod(node, "getId", Directory.class)),
                        new ZPair("items", items)));
        env.callMethod(template, "renderTo", Directory.class, file);
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
        name = "total",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object renderItem(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object total = assignParameter(args, 1, null);
        if (ZVal.isNull(total)) {
            total = false;
        }
        Object data = ZVal.newArray();
        data =
                ZVal.newArray(
                        new ZPair(
                                "numClasses",
                                env.callMethod(node, "getNumClassesAndTraits", Directory.class)),
                        new ZPair(
                                "numTestedClasses",
                                env.callMethod(
                                        node, "getNumTestedClassesAndTraits", Directory.class)),
                        new ZPair(
                                "numMethods",
                                env.callMethod(node, "getNumFunctionsAndMethods", Directory.class)),
                        new ZPair(
                                "numTestedMethods",
                                env.callMethod(
                                        node, "getNumTestedFunctionsAndMethods", Directory.class)),
                        new ZPair(
                                "linesExecutedPercent",
                                env.callMethod(
                                        node, "getLineExecutedPercent", Directory.class, false)),
                        new ZPair(
                                "linesExecutedPercentAsString",
                                env.callMethod(node, "getLineExecutedPercent", Directory.class)),
                        new ZPair(
                                "numExecutedLines",
                                env.callMethod(node, "getNumExecutedLines", Directory.class)),
                        new ZPair(
                                "numExecutableLines",
                                env.callMethod(node, "getNumExecutableLines", Directory.class)),
                        new ZPair(
                                "testedMethodsPercent",
                                env.callMethod(
                                        node,
                                        "getTestedFunctionsAndMethodsPercent",
                                        Directory.class,
                                        false)),
                        new ZPair(
                                "testedMethodsPercentAsString",
                                env.callMethod(
                                        node,
                                        "getTestedFunctionsAndMethodsPercent",
                                        Directory.class)),
                        new ZPair(
                                "testedClassesPercent",
                                env.callMethod(
                                        node,
                                        "getTestedClassesAndTraitsPercent",
                                        Directory.class,
                                        false)),
                        new ZPair(
                                "testedClassesPercentAsString",
                                env.callMethod(
                                        node,
                                        "getTestedClassesAndTraitsPercent",
                                        Directory.class)));
        if (ZVal.isTrue(total)) {
            ZVal.putArrayElement(data, "name", "Total");

        } else {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            node,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .namespaces
                                    .Node
                                    .classes
                                    .Directory
                                    .class,
                            "SebastianBergmann\\CodeCoverage\\Node\\Directory"))) {
                ZVal.putArrayElement(
                        data,
                        "name",
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "<a href=\"%s/index.html\">%s</a>",
                                        env.callMethod(node, "getName", Directory.class),
                                        env.callMethod(node, "getName", Directory.class))
                                .value());
                ZVal.putArrayElement(
                        data, "icon", "<span class=\"glyphicon glyphicon-folder-open\"></span> ");

            } else {
                ZVal.putArrayElement(
                        data,
                        "name",
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "<a href=\"%s.html\">%s</a>",
                                        env.callMethod(node, "getName", Directory.class),
                                        env.callMethod(node, "getName", Directory.class))
                                .value());
                ZVal.putArrayElement(
                        data, "icon", "<span class=\"glyphicon glyphicon-file\"></span> ");
            }
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "renderItemTemplate",
                        Directory.class,
                        new Text_Template(
                                env,
                                toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("templatePath")
                                                        .value(),
                                                env)
                                        + "directory_item.html",
                                "{{",
                                "}}"),
                        data));
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Html\\Directory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Renderer.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\Directory")
                    .setLookup(Directory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "date",
                            "generator",
                            "highLowerBound",
                            "lowUpperBound",
                            "templatePath",
                            "version")
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/Directory.php")
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
