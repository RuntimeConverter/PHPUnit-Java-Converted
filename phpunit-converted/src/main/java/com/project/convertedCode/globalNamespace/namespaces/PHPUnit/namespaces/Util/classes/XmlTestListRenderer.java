package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.xml.XMLWriter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/XmlTestListRenderer.php

*/

public final class XmlTestListRenderer extends RuntimeClassBase {

    public XmlTestListRenderer(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object render(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object suite = assignParameter(args, 0, null);
        Object currentTestCase = null;
        Object test = null;
        Object writer = null;
        writer = new XMLWriter(env);
        env.callMethod(writer, "openMemory", XmlTestListRenderer.class);
        env.callMethod(writer, "setIndent", XmlTestListRenderer.class, true);
        env.callMethod(writer, "startDocument", XmlTestListRenderer.class);
        env.callMethod(writer, "startElement", XmlTestListRenderer.class, "tests");
        currentTestCase = ZVal.getNull();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult430 :
                ZVal.getIterable(
                        new RecursiveIteratorIterator(
                                env,
                                env.callMethod(suite, "getIterator", XmlTestListRenderer.class)),
                        env,
                        true)) {
            test = ZVal.assign(zpairResult430.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                if (ZVal.strictNotEqualityCheck(
                        function_get_class.f.env(env).call(test).value(), "!==", currentTestCase)) {
                    if (ZVal.strictNotEqualityCheck(currentTestCase, "!==", ZVal.getNull())) {
                        env.callMethod(writer, "endElement", XmlTestListRenderer.class);
                    }

                    env.callMethod(
                            writer, "startElement", XmlTestListRenderer.class, "testCaseClass");
                    env.callMethod(
                            writer,
                            "writeAttribute",
                            XmlTestListRenderer.class,
                            "name",
                            function_get_class.f.env(env).call(test).value());
                    currentTestCase = function_get_class.f.env(env).call(test).value();
                }

                env.callMethod(writer, "startElement", XmlTestListRenderer.class, "testCaseMethod");
                env.callMethod(
                        writer,
                        "writeAttribute",
                        XmlTestListRenderer.class,
                        "name",
                        env.callMethod(test, "getName", XmlTestListRenderer.class, false));
                env.callMethod(
                        writer,
                        "writeAttribute",
                        XmlTestListRenderer.class,
                        "groups",
                        NamespaceGlobal.implode
                                .env(env)
                                .call(
                                        ",",
                                        env.callMethod(
                                                test, "getGroups", XmlTestListRenderer.class))
                                .value());
                if (!ZVal.isEmpty(
                        env.callMethod(
                                test, "getDataSetAsString", XmlTestListRenderer.class, false))) {
                    env.callMethod(
                            writer,
                            "writeAttribute",
                            XmlTestListRenderer.class,
                            "dataSet",
                            NamespaceGlobal.str_replace
                                    .env(env)
                                    .addReferneceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            " with data set ",
                                            "",
                                            env.callMethod(
                                                    test,
                                                    "getDataSetAsString",
                                                    XmlTestListRenderer.class,
                                                    false))
                                    .value());
                }

                env.callMethod(writer, "endElement", XmlTestListRenderer.class);

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test, PhptTestCase.class, "PHPUnit\\Runner\\PhptTestCase"))) {
                if (ZVal.strictNotEqualityCheck(currentTestCase, "!==", ZVal.getNull())) {
                    env.callMethod(writer, "endElement", XmlTestListRenderer.class);
                    currentTestCase = ZVal.getNull();
                }

                env.callMethod(writer, "startElement", XmlTestListRenderer.class, "phptFile");
                env.callMethod(
                        writer,
                        "writeAttribute",
                        XmlTestListRenderer.class,
                        "path",
                        env.callMethod(test, "getName", XmlTestListRenderer.class));
                env.callMethod(writer, "endElement", XmlTestListRenderer.class);

            } else {
                continue;
            }
        }

        if (ZVal.strictNotEqualityCheck(currentTestCase, "!==", ZVal.getNull())) {
            env.callMethod(writer, "endElement", XmlTestListRenderer.class);
        }

        env.callMethod(writer, "endElement", XmlTestListRenderer.class);
        return ZVal.assign(env.callMethod(writer, "outputMemory", XmlTestListRenderer.class));
    }

    public static final Object CONST_class = "PHPUnit\\Util\\XmlTestListRenderer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\XmlTestListRenderer")
                    .setLookup(XmlTestListRenderer.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/XmlTestListRenderer.php")
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
