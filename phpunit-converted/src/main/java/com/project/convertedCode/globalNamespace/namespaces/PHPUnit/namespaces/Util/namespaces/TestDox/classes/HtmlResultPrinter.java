package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.ResultPrinter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/HtmlResultPrinter.php

*/

public final class HtmlResultPrinter extends ResultPrinter {

    public HtmlResultPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HtmlResultPrinter.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    protected Object startRun(RuntimeEnv env, Object... args) {
        env.callMethod(this, "write", HtmlResultPrinter.class, CONST_PAGE_HEADER);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    protected Object startClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "write",
                HtmlResultPrinter.class,
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                CONST_CLASS_HEADER,
                                name,
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("currentTestClassPrettified")
                                        .value())
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "success",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object onTest(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object success = assignParameter(args, 1, null);
        if (ZVal.isNull(success)) {
            success = true;
        }
        env.callMethod(
                this,
                "write",
                HtmlResultPrinter.class,
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "            <li style=\"color: %s;\">%s %s</li>\n",
                                ZVal.isTrue(success) ? "#555753" : "#ef2929",
                                ZVal.isTrue(success) ? "\u2713" : "\u274C",
                                name)
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    protected Object endClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(this, "write", HtmlResultPrinter.class, CONST_CLASS_FOOTER);
        return null;
    }

    @ConvertedMethod
    protected Object endRun(RuntimeEnv env, Object... args) {
        env.callMethod(this, "write", HtmlResultPrinter.class, CONST_PAGE_FOOTER);
        return null;
    }

    public static final Object CONST_PAGE_HEADER =
            "<!doctype html>\n<html lang=\"en\">\n    <head>\n        <meta charset=\"utf-8\"/>\n        <title>Test Documentation</title>\n        <style>\n            body {\n                text-rendering: optimizeLegibility;\n                font-variant-ligatures: common-ligatures;\n                font-kerning: normal;\n                margin-left: 2em;\n            }\n\n            body > ul > li {\n                font-family: Source Serif Pro, PT Sans, Trebuchet MS, Helvetica, Arial;\n                font-size: 2em;\n            }\n\n            h2 {\n                font-family: Tahoma, Helvetica, Arial;\n                font-size: 3em;\n            }\n\n            ul {\n                list-style: none;\n                margin-bottom: 1em;\n            }\n        </style>\n    </head>\n    <body>";

    public static final Object CONST_CLASS_HEADER =
            "\n        <h2 id=\"%s\">%s</h2>\n        <ul>\n";

    public static final Object CONST_CLASS_FOOTER = "        </ul>";

    public static final Object CONST_PAGE_FOOTER = "\n    </body>\n</html>";

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\HtmlResultPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ResultPrinter.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\HtmlResultPrinter")
                    .setLookup(HtmlResultPrinter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "autoFlush",
                            "currentTestClassPrettified",
                            "currentTestMethodPrettified",
                            "excludeGroups",
                            "failed",
                            "groups",
                            "incomplete",
                            "out",
                            "outTarget",
                            "prettifier",
                            "risky",
                            "skipped",
                            "successful",
                            "testClass",
                            "testStatus",
                            "tests",
                            "warned")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/HtmlResultPrinter.php")
                    .addInterface("TestListener")
                    .addExtendsClass("PHPUnit\\Util\\TestDox\\ResultPrinter")
                    .addExtendsClass("PHPUnit\\Util\\Printer")
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
