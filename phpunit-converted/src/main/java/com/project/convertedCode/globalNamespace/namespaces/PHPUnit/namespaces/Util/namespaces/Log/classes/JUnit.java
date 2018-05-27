package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Xml;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExceptionWrapper;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Log/JUnit.php

*/

public class JUnit extends Printer implements TestListener {

    public Object document = null;

    public Object root = null;

    public Object reportUselessTests = false;

    public Object writeDocument = true;

    public Object testSuites = ZVal.newArray();

    public Object testSuiteTests = ZVal.newArray(new ZPair(0, 0));

    public Object testSuiteAssertions = ZVal.newArray(new ZPair(0, 0));

    public Object testSuiteErrors = ZVal.newArray(new ZPair(0, 0));

    public Object testSuiteFailures = ZVal.newArray(new ZPair(0, 0));

    public Object testSuiteSkipped = ZVal.newArray(new ZPair(0, 0));

    public Object testSuiteTimes = ZVal.newArray(new ZPair(0, 0));

    public Object testSuiteLevel = 0;

    public Object currentTestCase = null;

    public JUnit(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JUnit.class) {
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
    @ConvertedParameter(
        index = 1,
        name = "reportUselessTests",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, null);
        if (ZVal.isNull(out)) {
            out = ZVal.getNull();
        }
        Object reportUselessTests = assignParameter(args, 1, null);
        if (ZVal.isNull(reportUselessTests)) {
            reportUselessTests = false;
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
                                JUnit.class,
                                "testsuites"));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("document").value(),
                "appendChild",
                JUnit.class,
                toObjectR(this).accessProp(this, env).name("root").value());
        super.__construct(env, out);
        toObjectR(this).accessProp(this, env).name("reportUselessTests").set(reportUselessTests);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("writeDocument").value(), "===", true)) {
            env.callMethod(this, "write", JUnit.class, env.callMethod(this, "getXML", JUnit.class));
        }

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
        env.callMethod(this, "doAddFault", JUnit.class, test, t, time, "error");
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteErrors").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                ZVal.increment(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteErrors")
                                        .value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value())));
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
        env.callMethod(this, "doAddFault", JUnit.class, test, e, time, "warning");
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteFailures").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                ZVal.increment(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteFailures")
                                        .value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value())));
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
        env.callMethod(this, "doAddFault", JUnit.class, test, e, time, "failure");
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteFailures").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                ZVal.increment(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteFailures")
                                        .value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value())));
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
        env.callMethod(this, "doAddSkipped", JUnit.class, test);
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
        Object error = null;
        if (ZVal.toBool(!toObjectR(this).accessProp(this, env).name("reportUselessTests").getBool())
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("currentTestCase")
                                        .value(),
                                "===",
                                ZVal.getNull()))) {
            return null;
        }

        error =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("document").value(),
                        "createElement",
                        JUnit.class,
                        "error",
                        Xml.runtimeStaticObject.prepareString(
                                env,
                                "Risky Test\n"
                                        + toStringR(
                                                Filter.runtimeStaticObject.getFilteredStacktrace(
                                                        env, t),
                                                env)));
        env.callMethod(
                error,
                "setAttribute",
                JUnit.class,
                "type",
                function_get_class.f.env(env).call(t).value());
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestCase").value(),
                "appendChild",
                JUnit.class,
                error);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteErrors").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                ZVal.increment(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteErrors")
                                        .value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value())));
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
        env.callMethod(this, "doAddSkipped", JUnit.class, test);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object e = null;
        Object testSuite = null;
        Object _pClass = null;
        testSuite =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("document").value(),
                        "createElement",
                        JUnit.class,
                        "testsuite");
        env.callMethod(
                testSuite,
                "setAttribute",
                JUnit.class,
                "name",
                env.callMethod(suite, "getName", JUnit.class));
        if (function_class_exists
                .f
                .env(env)
                .call(env.callMethod(suite, "getName", JUnit.class), false)
                .getBool()) {
            try {
                _pClass = new ReflectionClass(env, env.callMethod(suite, "getName", JUnit.class));
                env.callMethod(
                        testSuite,
                        "setAttribute",
                        JUnit.class,
                        "file",
                        env.callMethod(_pClass, "getFileName", JUnit.class));
            } catch (ConvertedException convertedException60) {
                if (convertedException60.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException60.getObject();
                } else {
                    throw convertedException60;
                }
            }
        }

        if (ZVal.isGreaterThan(
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(), '>', 0)) {
            env.callMethod(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("testSuites").value(),
                            toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()),
                    "appendChild",
                    JUnit.class,
                    testSuite);

        } else {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("root").value(),
                    "appendChild",
                    JUnit.class,
                    testSuite);
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testSuiteLevel")
                .set(
                        ZVal.increment(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value()));
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuites").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                testSuite);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteTests").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                0);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteAssertions").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                0);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteErrors").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                0);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteFailures").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                0);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteSkipped").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                0);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteTimes").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                0);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        env.callMethod(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuites").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()),
                "setAttribute",
                JUnit.class,
                "tests",
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuiteTests").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()));
        env.callMethod(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuites").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()),
                "setAttribute",
                JUnit.class,
                "assertions",
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuiteAssertions").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()));
        env.callMethod(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuites").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()),
                "setAttribute",
                JUnit.class,
                "errors",
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuiteErrors").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()));
        env.callMethod(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuites").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()),
                "setAttribute",
                JUnit.class,
                "failures",
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuiteFailures").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()));
        env.callMethod(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuites").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()),
                "setAttribute",
                JUnit.class,
                "skipped",
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuiteSkipped").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()));
        env.callMethod(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuites").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()),
                "setAttribute",
                JUnit.class,
                "time",
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%F",
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("testSuiteTimes")
                                                .value(),
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("testSuiteLevel")
                                                .value()))
                        .value());
        if (ZVal.isGreaterThan(
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(), '>', 1)) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("testSuiteTests").value(),
                    ZVal.subtract(
                            toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                            1),
                    ZAssignment.add(
                            "+=",
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteTests")
                                            .value(),
                                    ZVal.subtract(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("testSuiteLevel")
                                                    .value(),
                                            1)),
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteTests")
                                            .value(),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteLevel")
                                            .value())));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("testSuiteAssertions").value(),
                    ZVal.subtract(
                            toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                            1),
                    ZAssignment.add(
                            "+=",
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteAssertions")
                                            .value(),
                                    ZVal.subtract(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("testSuiteLevel")
                                                    .value(),
                                            1)),
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteAssertions")
                                            .value(),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteLevel")
                                            .value())));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("testSuiteErrors").value(),
                    ZVal.subtract(
                            toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                            1),
                    ZAssignment.add(
                            "+=",
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteErrors")
                                            .value(),
                                    ZVal.subtract(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("testSuiteLevel")
                                                    .value(),
                                            1)),
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteErrors")
                                            .value(),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteLevel")
                                            .value())));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("testSuiteFailures").value(),
                    ZVal.subtract(
                            toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                            1),
                    ZAssignment.add(
                            "+=",
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteFailures")
                                            .value(),
                                    ZVal.subtract(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("testSuiteLevel")
                                                    .value(),
                                            1)),
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteFailures")
                                            .value(),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteLevel")
                                            .value())));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("testSuiteSkipped").value(),
                    ZVal.subtract(
                            toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                            1),
                    ZAssignment.add(
                            "+=",
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteSkipped")
                                            .value(),
                                    ZVal.subtract(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("testSuiteLevel")
                                                    .value(),
                                            1)),
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteSkipped")
                                            .value(),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteLevel")
                                            .value())));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("testSuiteTimes").value(),
                    ZVal.subtract(
                            toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                            1),
                    ZAssignment.add(
                            "+=",
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteTimes")
                                            .value(),
                                    ZVal.subtract(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("testSuiteLevel")
                                                    .value(),
                                            1)),
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteTimes")
                                            .value(),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteLevel")
                                            .value())));
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("testSuiteLevel")
                .set(
                        ZVal.decrement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object method = null;
        Object methodName = null;
        Object _pClass = null;
        Object testCase = null;
        testCase =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("document").value(),
                        "createElement",
                        JUnit.class,
                        "testcase");
        env.callMethod(
                testCase,
                "setAttribute",
                JUnit.class,
                "name",
                env.callMethod(test, "getName", JUnit.class));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            _pClass = new ReflectionClass(env, test);
            methodName =
                    env.callMethod(
                            test,
                            "getName",
                            JUnit.class,
                            !ZVal.isTrue(env.callMethod(test, "usesDataProvider", JUnit.class)));
            if (ZVal.isTrue(env.callMethod(_pClass, "hasMethod", JUnit.class, methodName))) {
                method = env.callMethod(_pClass, "getMethod", JUnit.class, methodName);
                env.callMethod(
                        testCase,
                        "setAttribute",
                        JUnit.class,
                        "class",
                        env.callMethod(_pClass, "getName", JUnit.class));
                env.callMethod(
                        testCase,
                        "setAttribute",
                        JUnit.class,
                        "classname",
                        NamespaceGlobal.str_replace
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call("\\", ".", env.callMethod(_pClass, "getName", JUnit.class))
                                .value());
                env.callMethod(
                        testCase,
                        "setAttribute",
                        JUnit.class,
                        "file",
                        env.callMethod(_pClass, "getFileName", JUnit.class));
                env.callMethod(
                        testCase,
                        "setAttribute",
                        JUnit.class,
                        "line",
                        env.callMethod(method, "getStartLine", JUnit.class));
            }
        }

        toObjectR(this).accessProp(this, env).name("currentTestCase").set(testCase);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object time = assignParameter(args, 1, null);
        Object systemOut = null;
        Object numAssertions = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            numAssertions = env.callMethod(test, "getNumAssertions", JUnit.class);
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("testSuiteAssertions").value(),
                    toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                    ZAssignment.add(
                            "+=",
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteAssertions")
                                            .value(),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("testSuiteLevel")
                                            .value()),
                            numAssertions));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("currentTestCase").value(),
                    "setAttribute",
                    JUnit.class,
                    "assertions",
                    numAssertions);
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestCase").value(),
                "setAttribute",
                JUnit.class,
                "time",
                NamespaceGlobal.sprintf.env(env).call("%F", time).value());
        env.callMethod(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("testSuites").value(),
                        toObjectR(this).accessProp(this, env).name("testSuiteLevel").value()),
                "appendChild",
                JUnit.class,
                toObjectR(this).accessProp(this, env).name("currentTestCase").value());
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteTests").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                ZVal.increment(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteTests")
                                        .value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value())));
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteTimes").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                ZAssignment.add(
                        "+=",
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteTimes")
                                        .value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value()),
                        time));
        if (ZVal.toBool(function_method_exists.f.env(env).call(test, "hasOutput").value())
                && ZVal.toBool(env.callMethod(test, "hasOutput", JUnit.class))) {
            systemOut =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("document").value(),
                            "createElement",
                            JUnit.class,
                            "system-out",
                            Xml.runtimeStaticObject.prepareString(
                                    env, env.callMethod(test, "getActualOutput", JUnit.class)));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("currentTestCase").value(),
                    "appendChild",
                    JUnit.class,
                    systemOut);
        }

        toObjectR(this).accessProp(this, env).name("currentTestCase").set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    public Object getXML(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("document").value(),
                        "saveXML",
                        JUnit.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag")
    public Object setWriteDocument(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        if (NamespaceGlobal.is_bool.env(env).call(flag).getBool()) {
            toObjectR(this).accessProp(this, env).name("writeDocument").set(flag);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    @ConvertedParameter(index = 3, name = "type")
    private Object doAddFault(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object t = assignParameter(args, 1, null);
        Object time = assignParameter(args, 2, null);
        Object type = assignParameter(args, 3, null);
        Object fault = null;
        Object buffer = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("currentTestCase").value(),
                "===",
                ZVal.getNull())) {
            return null;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, SelfDescribing.class, "PHPUnit\\Framework\\SelfDescribing"))) {
            buffer = toStringR(env.callMethod(test, "toString", JUnit.class), env) + "\n";

        } else {
            buffer = "";
        }

        buffer =
                toStringR(buffer, env)
                        + toStringR(TestFailure.runtimeStaticObject.exceptionToString(env, t), env)
                        + "\n"
                        + toStringR(Filter.runtimeStaticObject.getFilteredStacktrace(env, t), env);
        fault =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("document").value(),
                        "createElement",
                        JUnit.class,
                        type,
                        Xml.runtimeStaticObject.prepareString(env, buffer));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        t, ExceptionWrapper.class, "PHPUnit\\Framework\\ExceptionWrapper"))) {
            env.callMethod(
                    fault,
                    "setAttribute",
                    JUnit.class,
                    "type",
                    env.callMethod(t, "getClassName", JUnit.class));

        } else {
            env.callMethod(
                    fault,
                    "setAttribute",
                    JUnit.class,
                    "type",
                    function_get_class.f.env(env).call(t).value());
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestCase").value(),
                "appendChild",
                JUnit.class,
                fault);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    private Object doAddSkipped(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object skipped = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("currentTestCase").value(),
                "===",
                ZVal.getNull())) {
            return null;
        }

        skipped =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("document").value(),
                        "createElement",
                        JUnit.class,
                        "skipped");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("currentTestCase").value(),
                "appendChild",
                JUnit.class,
                skipped);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("testSuiteSkipped").value(),
                toObjectR(this).accessProp(this, env).name("testSuiteLevel").value(),
                ZVal.increment(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteSkipped")
                                        .value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("testSuiteLevel")
                                        .value())));
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Log\\JUnit";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Printer.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Log\\JUnit")
                    .setLookup(JUnit.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "autoFlush",
                            "currentTestCase",
                            "document",
                            "out",
                            "outTarget",
                            "reportUselessTests",
                            "root",
                            "testSuiteAssertions",
                            "testSuiteErrors",
                            "testSuiteFailures",
                            "testSuiteLevel",
                            "testSuiteSkipped",
                            "testSuiteTests",
                            "testSuiteTimes",
                            "testSuites",
                            "writeDocument")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Log/JUnit.php")
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
