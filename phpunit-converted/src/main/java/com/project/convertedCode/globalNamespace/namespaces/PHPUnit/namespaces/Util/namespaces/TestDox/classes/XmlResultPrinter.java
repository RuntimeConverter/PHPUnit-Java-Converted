package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.NamePrettifier;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/XmlResultPrinter.php

*/

public class XmlResultPrinter extends Printer implements TestListener {

    public Object document = null;

    public Object root = null;

    public Object prettifier = null;

    public Object exception = null;

    public XmlResultPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == XmlResultPrinter.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "out",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, null);
        if (ZVal.isNull(out)) {
            out = ZVal.getNull();
        }
        toObjectR(this)
                .accessProp(this, env)
                .name("document")
                .set(new DOMDocument(env, "1.0", "UTF-8"));
        toObjectR(this)
                .accessProp(this, env)
                .name("document")
                .getObject()
                .accessProp(this, env)
                .name("formatOutput")
                .set(true);
        toObjectR(this)
                .accessProp(this, env)
                .name("root")
                .set(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("document").value(),
                                "createElement",
                                XmlResultPrinter.class,
                                "tests"));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("document").value(),
                "appendChild",
                XmlResultPrinter.class,
                toObjectR(this).accessProp(this, env).name("root").value());
        toObjectR(this).accessProp(this, env).name("prettifier").set(new NamePrettifier(env));
        super.__construct(env, out);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "write",
                XmlResultPrinter.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("document").value(),
                        "saveXML",
                        XmlResultPrinter.class));
        super.flush(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addError(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        toObjectR(this).accessProp(this, env).name("exception").set(t);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "e", typeHint = "PHPUnit\\Framework\\Warning")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addWarning(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object e = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(
        index = 1,
        name = "e",
        typeHint = "PHPUnit\\Framework\\AssertionFailedError"
    )
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addFailure(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object e = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        toObjectR(this).accessProp(this, env).name("exception").set(e);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addIncompleteTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addRiskyTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addSkippedTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("exception").set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object test = assignParameter(args, 0, null);
        Object time = assignParameter(args, 1, null);
        Object node = null;
        Object file = null;
        Object inlineAnnotations = ZVal.newArray();
        Object groups = null;
        Object step = ZVal.newArray();
        Object steps = null;
        Object _pClass = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            return null;
        }

        groups =
                CRArrayF.array_filter
                        .env(env)
                        .call(
                                env.callMethod(test, "getGroups", XmlResultPrinter.class),
                                new Closure(env) {
                                    @Override
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object group = assignParameter(args, 0, null);
                                        return ZVal.assign(
                                                !ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                group,
                                                                                                "===",
                                                                                                "small"))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                group,
                                                                                                "===",
                                                                                                "medium")))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        group, "===", "large")));
                                    }
                                })
                        .value();
        node =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("document").value(),
                        "createElement",
                        XmlResultPrinter.class,
                        "test");
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "className",
                function_get_class.f.env(env).call(test).value());
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "methodName",
                env.callMethod(test, "getName", XmlResultPrinter.class));
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "prettifiedClassName",
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("prettifier").value(),
                        "prettifyTestClass",
                        XmlResultPrinter.class,
                        function_get_class.f.env(env).call(test).value()));
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "prettifiedMethodName",
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("prettifier").value(),
                        "prettifyTestMethod",
                        XmlResultPrinter.class,
                        env.callMethod(test, "getName", XmlResultPrinter.class)));
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "status",
                env.callMethod(test, "getStatus", XmlResultPrinter.class));
        env.callMethod(node, "setAttribute", XmlResultPrinter.class, "time", time);
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "size",
                env.callMethod(test, "getSize", XmlResultPrinter.class));
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "groups",
                NamespaceGlobal.implode.env(env).call(",", groups).value());
        inlineAnnotations =
                Test.runtimeStaticObject.getInlineAnnotations(
                        env,
                        function_get_class.f.env(env).call(test).value(),
                        env.callMethod(test, "getName", XmlResultPrinter.class));
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.isset(ZVal.getElement(inlineAnnotations, "given")))
                                && ZVal.toBool(
                                        ZVal.isset(ZVal.getElement(inlineAnnotations, "when"))))
                && ZVal.toBool(ZVal.isset(ZVal.getElement(inlineAnnotations, "then")))) {
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "given",
                    ZVal.getElementRecursive(inlineAnnotations, "given", "value"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "givenStartLine",
                    ZVal.getElementRecursive(inlineAnnotations, "given", "line"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "when",
                    ZVal.getElementRecursive(inlineAnnotations, "when", "value"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "whenStartLine",
                    ZVal.getElementRecursive(inlineAnnotations, "when", "line"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "then",
                    ZVal.getElementRecursive(inlineAnnotations, "then", "value"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "thenStartLine",
                    ZVal.getElementRecursive(inlineAnnotations, "then", "line"));
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("exception").value(),
                "!==",
                ZVal.getNull())) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            toObjectR(this).accessProp(this, env).name("exception").value(),
                            Exception.class,
                            "PHPUnit\\Framework\\Exception"))) {
                steps =
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("exception").value(),
                                "getSerializableTrace",
                                XmlResultPrinter.class);

            } else {
                steps =
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("exception").value(),
                                "getTrace",
                                XmlResultPrinter.class);
            }

            _pClass = new ReflectionClass(env, test);
            file = env.callMethod(_pClass, "getFileName", XmlResultPrinter.class);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult425 : ZVal.getIterable(steps, env, true)) {
                step = ZVal.assign(zpairResult425.getValue());
                if (ZVal.toBool(ZVal.isset(ZVal.getElement(step, "file")))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        ZVal.getElement(step, "file"), "===", file))) {
                    env.callMethod(
                            node,
                            "setAttribute",
                            XmlResultPrinter.class,
                            "exceptionLine",
                            ZVal.getElement(step, "line"));
                    break;
                }
            }

            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "exceptionMessage",
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("exception").value(),
                            "getMessage",
                            XmlResultPrinter.class));
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("root").value(),
                "appendChild",
                XmlResultPrinter.class,
                node);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\XmlResultPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Printer.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\XmlResultPrinter")
                    .setLookup(XmlResultPrinter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "autoFlush",
                            "document",
                            "exception",
                            "out",
                            "outTarget",
                            "prettifier",
                            "root")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/XmlResultPrinter.php")
                    .addInterface("TestListener")
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
