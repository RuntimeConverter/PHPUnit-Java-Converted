package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.RiskyTest;
import com.runtimeconverter.runtime.modules.standard.other.function_set_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.runtimeconverter.runtime.nativeClasses.errors.AssertionError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Blacklist;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Invoker.classes.TimeoutException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.UnintentionallyCoveredCodeError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.ErrorHandler;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ResourceOperations.classes.ResourceOperations;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTest;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.UnintentionallyCoveredCodeException;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.OutputError;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExceptionWrapper;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.RiskyTestError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Warning;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Invoker.classes.Invoker;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.InvalidCoversTargetException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTest;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/TestResult.php

*/

public class TestResult extends RuntimeClassBase implements Countable {

    public Object passed = ZVal.newArray();

    public Object errors = ZVal.newArray();

    public Object failures = ZVal.newArray();

    public Object warnings = ZVal.newArray();

    public Object notImplemented = ZVal.newArray();

    public Object risky = ZVal.newArray();

    public Object skipped = ZVal.newArray();

    public Object listeners = ZVal.newArray();

    public Object runTests = 0;

    public Object time = 0;

    public Object topTestSuite = null;

    public Object codeCoverage = null;

    public Object convertErrorsToExceptions = true;

    public Object stop = false;

    public Object stopOnError = false;

    public Object stopOnFailure = false;

    public Object stopOnWarning = false;

    public Object beStrictAboutTestsThatDoNotTestAnything = true;

    public Object beStrictAboutOutputDuringTests = false;

    public Object beStrictAboutTodoAnnotatedTests = false;

    public Object beStrictAboutResourceUsageDuringSmallTests = false;

    public Object enforceTimeLimit = false;

    public Object timeoutForSmallTests = 1;

    public Object timeoutForMediumTests = 10;

    public Object timeoutForLargeTests = 60;

    public Object stopOnRisky = false;

    public Object stopOnIncomplete = false;

    public Object stopOnSkipped = false;

    public Object lastTestFailed = false;

    public Object registerMockObjectsFromTestArgumentsRecursively = false;

    public TestResult(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener", typeHint = "PHPUnit\\Framework\\TestListener")
    public Object addListener(RuntimeEnv env, Object... args) {
        Object listener = assignParameter(args, 0, null);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("listeners").value(), listener);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener", typeHint = "PHPUnit\\Framework\\TestListener")
    public Object removeListener(RuntimeEnv env, Object... args) {
        Object listener = assignParameter(args, 0, null);
        Object _listener = null;
        Object key = null;
        for (ZPair zpairResult289 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult289.getKey());
            _listener = ZVal.assign(zpairResult289.getValue());
            if (ZVal.strictEqualityCheck(listener, "===", _listener)) {
                ZVal.unsetArrayElement(
                        toObjectR(this).accessProp(this, env).name("listeners").value(), key);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object flushListeners(RuntimeEnv env, Object... args) {
        Object listener = null;
        for (ZPair zpairResult290 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult290.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(listener, Printer.class, "PHPUnit\\Util\\Printer"))) {
                env.callMethod(listener, "flush", TestResult.class);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addError(RuntimeEnv env, Object... args) {
        ReferenceContainer test = new BasicReferenceContainer(assignParameter(args, 0, null));
        ReferenceContainer t = new BasicReferenceContainer(assignParameter(args, 1, null));
        ReferenceContainer time = new BasicReferenceContainer(assignParameter(args, 2, null));
        Object notifyMethod = null;
        Object listener = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        t.getObject(), RiskyTest.class, "PHPUnit\\Framework\\RiskyTest"))) {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("risky").value(),
                    new TestFailure(env, test.getObject(), t.getObject()));
            notifyMethod = "addRiskyTest";
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test.getObject(), TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                env.callMethod(test.getObject(), "markAsRisky", TestResult.class);
            }

            if (toObjectR(this).accessProp(this, env).name("stopOnRisky").getBool()) {
                env.callMethod(this, "stop", TestResult.class);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        t.getObject(),
                        IncompleteTest.class,
                        "PHPUnit\\Framework\\IncompleteTest"))) {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("notImplemented").value(),
                    new TestFailure(env, test.getObject(), t.getObject()));
            notifyMethod = "addIncompleteTest";
            if (toObjectR(this).accessProp(this, env).name("stopOnIncomplete").getBool()) {
                env.callMethod(this, "stop", TestResult.class);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        t.getObject(), SkippedTest.class, "PHPUnit\\Framework\\SkippedTest"))) {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("skipped").value(),
                    new TestFailure(env, test.getObject(), t.getObject()));
            notifyMethod = "addSkippedTest";
            if (toObjectR(this).accessProp(this, env).name("stopOnSkipped").getBool()) {
                env.callMethod(this, "stop", TestResult.class);
            }

        } else {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("errors").value(),
                    new TestFailure(env, test.getObject(), t.getObject()));
            notifyMethod = "addError";
            if (ZVal.toBool(toObjectR(this).accessProp(this, env).name("stopOnError").value())
                    || ZVal.toBool(
                            toObjectR(this).accessProp(this, env).name("stopOnFailure").value())) {
                env.callMethod(this, "stop", TestResult.class);
            }
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(t.getObject(), PHPError.class, "Error"))) {
            t.setObject(new ExceptionWrapper(env, t.getObject()));
        }

        for (ZPair zpairResult291 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult291.getValue());
            env.callMethod(
                    listener,
                    new RuntimeArgsWithReferences().add(0, test).add(1, t).add(2, time),
                    toStringR(notifyMethod, env),
                    TestResult.class,
                    test.getObject(),
                    t.getObject(),
                    time.getObject());
        }

        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(true);
        toObjectR(this)
                .accessProp(this, env)
                .name("time")
                .set(
                        ZAssignment.add(
                                "+=",
                                toObjectR(this).accessProp(this, env).name("time").value(),
                                time.getObject()));
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
        Object listener = null;
        if (toObjectR(this).accessProp(this, env).name("stopOnWarning").getBool()) {
            env.callMethod(this, "stop", TestResult.class);
        }

        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("warnings").value(),
                new TestFailure(env, test, e));
        for (ZPair zpairResult292 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult292.getValue());
            env.callMethod(listener, "addWarning", TestResult.class, test, e, time);
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("time")
                .set(
                        ZAssignment.add(
                                "+=",
                                toObjectR(this).accessProp(this, env).name("time").value(),
                                time));
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
        ReferenceContainer test = new BasicReferenceContainer(assignParameter(args, 0, null));
        ReferenceContainer e = new BasicReferenceContainer(assignParameter(args, 1, null));
        ReferenceContainer time = new BasicReferenceContainer(assignParameter(args, 2, null));
        Object notifyMethod = null;
        Object listener = null;
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                e.getObject(), RiskyTest.class, "PHPUnit\\Framework\\RiskyTest"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                e.getObject(),
                                OutputError.class,
                                "PHPUnit\\Framework\\OutputError"))) {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("risky").value(),
                    new TestFailure(env, test.getObject(), e.getObject()));
            notifyMethod = "addRiskyTest";
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test.getObject(), TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                env.callMethod(test.getObject(), "markAsRisky", TestResult.class);
            }

            if (toObjectR(this).accessProp(this, env).name("stopOnRisky").getBool()) {
                env.callMethod(this, "stop", TestResult.class);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e.getObject(),
                        IncompleteTest.class,
                        "PHPUnit\\Framework\\IncompleteTest"))) {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("notImplemented").value(),
                    new TestFailure(env, test.getObject(), e.getObject()));
            notifyMethod = "addIncompleteTest";
            if (toObjectR(this).accessProp(this, env).name("stopOnIncomplete").getBool()) {
                env.callMethod(this, "stop", TestResult.class);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e.getObject(), SkippedTest.class, "PHPUnit\\Framework\\SkippedTest"))) {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("skipped").value(),
                    new TestFailure(env, test.getObject(), e.getObject()));
            notifyMethod = "addSkippedTest";
            if (toObjectR(this).accessProp(this, env).name("stopOnSkipped").getBool()) {
                env.callMethod(this, "stop", TestResult.class);
            }

        } else {
            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("failures").value(),
                    new TestFailure(env, test.getObject(), e.getObject()));
            notifyMethod = "addFailure";
            if (toObjectR(this).accessProp(this, env).name("stopOnFailure").getBool()) {
                env.callMethod(this, "stop", TestResult.class);
            }
        }

        for (ZPair zpairResult293 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult293.getValue());
            env.callMethod(
                    listener,
                    new RuntimeArgsWithReferences().add(0, test).add(1, e).add(2, time),
                    toStringR(notifyMethod, env),
                    TestResult.class,
                    test.getObject(),
                    e.getObject(),
                    time.getObject());
        }

        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(true);
        toObjectR(this)
                .accessProp(this, env)
                .name("time")
                .set(
                        ZAssignment.add(
                                "+=",
                                toObjectR(this).accessProp(this, env).name("time").value(),
                                time.getObject()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object listener = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("topTestSuite").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("topTestSuite").set(suite);
        }

        for (ZPair zpairResult294 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult294.getValue());
            env.callMethod(listener, "startTestSuite", TestResult.class, suite);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object listener = null;
        for (ZPair zpairResult295 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult295.getValue());
            env.callMethod(listener, "endTestSuite", TestResult.class, suite);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object listener = null;
        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(false);
        toObjectR(this)
                .accessProp(this, env)
                .name("runTests")
                .set(
                        ZAssignment.add(
                                "+=",
                                toObjectR(this).accessProp(this, env).name("runTests").value(),
                                CRArrayF.count.env(env).call(test).value()));
        for (ZPair zpairResult296 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult296.getValue());
            env.callMethod(listener, "startTest", TestResult.class, test);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object time = assignParameter(args, 1, null);
        Object listener = null;
        Object _pClass = null;
        Object key = null;
        for (ZPair zpairResult297 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("listeners").value(),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult297.getValue());
            env.callMethod(listener, "endTest", TestResult.class, test, time);
        }

        if (ZVal.toBool(!toObjectR(this).accessProp(this, env).name("lastTestFailed").getBool())
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            _pClass = function_get_class.f.env(env).call(test).value();
            key =
                    toStringR(_pClass, env)
                            + "::"
                            + toStringR(env.callMethod(test, "getName", TestResult.class), env);
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("passed").value(),
                    key,
                    ZVal.newArray(
                            new ZPair(
                                    "result", env.callMethod(test, "getResult", TestResult.class)),
                            new ZPair(
                                    "size",
                                    Test.runtimeStaticObject.getSize(
                                            env,
                                            _pClass,
                                            env.callMethod(
                                                    test, "getName", TestResult.class, false)))));
            toObjectR(this)
                    .accessProp(this, env)
                    .name("time")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this).accessProp(this, env).name("time").value(),
                                    time));
        }

        return null;
    }

    @ConvertedMethod
    public Object allHarmless(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.equalityCheck(env.callMethod(this, "riskyCount", TestResult.class), 0));
    }

    @ConvertedMethod
    public Object riskyCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("risky").value())
                        .value());
    }

    @ConvertedMethod
    public Object allCompletelyImplemented(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.equalityCheck(
                        env.callMethod(this, "notImplementedCount", TestResult.class), 0));
    }

    @ConvertedMethod
    public Object notImplementedCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("notImplemented").value())
                        .value());
    }

    @ConvertedMethod
    public Object risky(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("risky").value());
    }

    @ConvertedMethod
    public Object notImplemented(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("notImplemented").value());
    }

    @ConvertedMethod
    public Object noneSkipped(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.equalityCheck(env.callMethod(this, "skippedCount", TestResult.class), 0));
    }

    @ConvertedMethod
    public Object skippedCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("skipped").value())
                        .value());
    }

    @ConvertedMethod
    public Object skipped(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("skipped").value());
    }

    @ConvertedMethod
    public Object errorCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("errors").value())
                        .value());
    }

    @ConvertedMethod
    public Object errors(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("errors").value());
    }

    @ConvertedMethod
    public Object failureCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("failures").value())
                        .value());
    }

    @ConvertedMethod
    public Object failures(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("failures").value());
    }

    @ConvertedMethod
    public Object warningCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("warnings").value())
                        .value());
    }

    @ConvertedMethod
    public Object warnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("warnings").value());
    }

    @ConvertedMethod
    public Object passed(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("passed").value());
    }

    @ConvertedMethod
    public Object topTestSuite(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("topTestSuite").value());
    }

    @ConvertedMethod
    public Object getCollectCodeCoverageInformation(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("codeCoverage").value(),
                        "!==",
                        ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object run(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object test = assignParameter(args, 0, null);
        Object errorHandlerSet = null;
        Object functions = null;
        Object cce = null;
        Object annotations = ZVal.newArray();
        Object coversNothing = null;
        Object error = null;
        Object skipped = null;
        Object incomplete = null;
        Object linesToBeCovered = null;
        Object monitorFunctions = null;
        Object function = ZVal.newArray();
        Object warning = null;
        Object _timeout = null;
        Object e = null;
        Object blacklist = null;
        Object invoker = null;
        Object oldErrorHandler = null;
        Object failure = null;
        Object linesToBeUsed = null;
        Object collectCodeCoverage = null;
        Object time = null;
        Object risky = null;
        Object append = null;
        Object frame = ZVal.newArray();
        Assert.runtimeStaticObject.resetCount(env);
        coversNothing = false;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            env.callMethod(
                    test,
                    "setRegisterMockObjectsFromTestArgumentsRecursively",
                    TestResult.class,
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("registerMockObjectsFromTestArgumentsRecursively")
                            .value());
            annotations = env.callMethod(test, "getAnnotations", TestResult.class);
            if (ZVal.toBool(
                            ZVal.isset(
                                    ZVal.getElementRecursive(
                                            annotations, "class", "coversNothing")))
                    || ZVal.toBool(
                            ZVal.isset(
                                    ZVal.getElementRecursive(
                                            annotations, "method", "coversNothing")))) {
                coversNothing = true;
            }
        }

        error = false;
        failure = false;
        warning = false;
        incomplete = false;
        risky = false;
        skipped = false;
        env.callMethod(this, "startTest", TestResult.class, test);
        errorHandlerSet = false;
        if (toObjectR(this).accessProp(this, env).name("convertErrorsToExceptions").getBool()) {
            oldErrorHandler =
                    function_set_error_handler
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, ErrorHandler.CONST_class),
                                            new ZPair(1, "handleError")),
                                    ZVal.toLong(32767) | ZVal.toLong(2048))
                            .value();
            if (ZVal.strictEqualityCheck(oldErrorHandler, "===", ZVal.getNull())) {
                errorHandlerSet = true;

            } else {
                NamespaceGlobal.restore_error_handler.env(env).call();
            }
        }

        collectCodeCoverage =
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("codeCoverage")
                                                                .value(),
                                                        "!==",
                                                        ZVal.getNull()))
                                        && ZVal.toBool(
                                                !ZVal.isTrue(
                                                        ZVal.checkInstanceType(
                                                                test,
                                                                WarningTestCase.class,
                                                                "PHPUnit\\Framework\\WarningTestCase"))))
                        && ZVal.toBool(!ZVal.isTrue(coversNothing));
        if (ZVal.isTrue(collectCodeCoverage)) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("codeCoverage").value(),
                    "start",
                    TestResult.class,
                    test);
        }

        monitorFunctions =
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name(
                                                                                "beStrictAboutResourceUsageDuringSmallTests")
                                                                        .value())
                                                        && ZVal.toBool(
                                                                !ZVal.isTrue(
                                                                        ZVal.checkInstanceType(
                                                                                test,
                                                                                WarningTestCase
                                                                                        .class,
                                                                                "PHPUnit\\Framework\\WarningTestCase"))))
                                        && ZVal.toBool(
                                                ZVal.equalityCheck(
                                                        env.callMethod(
                                                                test, "getSize", TestResult.class),
                                                        Test.CONST_SMALL)))
                        && ZVal.toBool(
                                NamespaceGlobal.function_exists
                                        .env(env)
                                        .call("xdebug_start_function_monitor")
                                        .value());
        if (ZVal.isTrue(monitorFunctions)) {
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:xdebug_start_function_monitor)_(namespace:\\)(source:xdebug_start_function_monitor)______")
                    .env(env)
                    .call(ResourceOperations.runtimeStaticObject.getFunctions(env));
        }

        Timer.runtimeStaticObject.start(env);
        try {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.toBool(
                                                                            !ZVal.isTrue(
                                                                                    ZVal
                                                                                            .checkInstanceType(
                                                                                                    test,
                                                                                                    WarningTestCase
                                                                                                            .class,
                                                                                                    "PHPUnit\\Framework\\WarningTestCase")))
                                                                    && ZVal.toBool(
                                                                            ZVal.notEqualityCheck(
                                                                                    env.callMethod(
                                                                                            test,
                                                                                            "getSize",
                                                                                            TestResult
                                                                                                    .class),
                                                                                    Test
                                                                                            .CONST_UNKNOWN)))
                                                    && ZVal.toBool(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("enforceTimeLimit")
                                                                    .value()))
                                    && ZVal.toBool(
                                            NamespaceGlobal.extension_loaded
                                                    .env(env)
                                                    .call("pcntl")
                                                    .value()))
                    && ZVal.toBool(
                            function_class_exists.f.env(env).call(Invoker.CONST_class).value())) {
                SwitchEnumType16 switchVariable16 =
                        ZVal.getEnum(
                                env.callMethod(test, "getSize", TestResult.class),
                                SwitchEnumType16.DEFAULT_CASE,
                                SwitchEnumType16.DYNAMIC_TYPE_95,
                                Test.CONST_SMALL,
                                SwitchEnumType16.DYNAMIC_TYPE_96,
                                Test.CONST_MEDIUM,
                                SwitchEnumType16.DYNAMIC_TYPE_97,
                                Test.CONST_LARGE);
                switch (switchVariable16) {
                    case DYNAMIC_TYPE_95:
                        _timeout =
                                ZVal.assign(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("timeoutForSmallTests")
                                                .value());
                        break;
                    case DYNAMIC_TYPE_96:
                        _timeout =
                                ZVal.assign(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("timeoutForMediumTests")
                                                .value());
                        break;
                    case DYNAMIC_TYPE_97:
                        _timeout =
                                ZVal.assign(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("timeoutForLargeTests")
                                                .value());
                        break;
                }
                ;
                invoker = new Invoker(env);
                env.callMethod(
                        invoker,
                        "invoke",
                        TestResult.class,
                        ZVal.newArray(new ZPair(0, test), new ZPair(1, "runBare")),
                        ZVal.newArray(),
                        _timeout);

            } else {
                env.callMethod(test, "runBare", TestResult.class);
            }

        } catch (ConvertedException convertedException40) {
            if (convertedException40.instanceOf(
                    TimeoutException.class, "SebastianBergmann\\Invoker\\TimeoutException")) {
                e = convertedException40.getObject();
                env.callMethod(
                        this,
                        "addFailure",
                        TestResult.class,
                        test,
                        new RiskyTestError(env, env.callMethod(e, "getMessage", TestResult.class)),
                        _timeout);
                risky = true;
            } else if (convertedException40.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .namespaces
                            .MockObject
                            .classes
                            .Exception
                            .class,
                    "PHPUnit\\Framework\\MockObject\\Exception")) {
                e = convertedException40.getObject();
                e = new Warning(env, env.callMethod(e, "getMessage", TestResult.class));
                warning = true;
            } else if (convertedException40.instanceOf(
                    AssertionFailedError.class, "PHPUnit\\Framework\\AssertionFailedError")) {
                e = convertedException40.getObject();
                failure = true;
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                e, RiskyTestError.class, "PHPUnit\\Framework\\RiskyTestError"))) {
                    risky = true;

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                e,
                                IncompleteTestError.class,
                                "PHPUnit\\Framework\\IncompleteTestError"))) {
                    incomplete = true;

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                e,
                                SkippedTestError.class,
                                "PHPUnit\\Framework\\SkippedTestError"))) {
                    skipped = true;
                }

            } else if (convertedException40.instanceOf(AssertionError.class, "AssertionError")) {
                e = convertedException40.getObject();
                env.callMethod(test, "addToAssertionCount", TestResult.class, 1);
                failure = true;
                frame =
                        ZVal.assign(
                                ZVal.getElement(
                                        env.callMethod(e, "getTrace", TestResult.class), 0));
                e =
                        new AssertionFailedError(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "%s in %s:%s",
                                                env.callMethod(e, "getMessage", TestResult.class),
                                                ZVal.getElement(frame, "file"),
                                                ZVal.getElement(frame, "line"))
                                        .value());
            } else if (convertedException40.instanceOf(
                    Warning.class, "PHPUnit\\Framework\\Warning")) {
                e = convertedException40.getObject();
                warning = true;
            } else if (convertedException40.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .classes
                            .Exception
                            .class,
                    "PHPUnit\\Framework\\Exception")) {
                e = convertedException40.getObject();
                error = true;
            } else if (convertedException40.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException40.getObject();
                e = new ExceptionWrapper(env, e);
                error = true;
            } else {
                throw convertedException40;
            }
        }

        time = Timer.runtimeStaticObject.stop(env);
        env.callMethod(
                test,
                "addToAssertionCount",
                TestResult.class,
                Assert.runtimeStaticObject.getCount(env));
        if (ZVal.isTrue(monitorFunctions)) {
            blacklist = new Blacklist(env);
            functions =
                    com.runtimeconverter.runtime.ZVal.functionNotFound(
                                    "___error23423346_namespace_function_not_found__(identifier:xdebug_get_monitored_functions)_(namespace:\\)(source:xdebug_get_monitored_functions)______")
                            .env(env)
                            .call()
                            .value();
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:xdebug_stop_function_monitor)_(namespace:\\)(source:xdebug_stop_function_monitor)______")
                    .env(env)
                    .call();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult298 : ZVal.getIterable(functions, env, true)) {
                function = ZVal.assign(zpairResult298.getValue());
                if (!ZVal.isTrue(
                        env.callMethod(
                                blacklist,
                                "isBlacklisted",
                                TestResult.class,
                                ZVal.getElement(function, "filename")))) {
                    env.callMethod(
                            this,
                            "addFailure",
                            TestResult.class,
                            test,
                            new RiskyTestError(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "%s() used in %s:%s",
                                                    ZVal.getElement(function, "function"),
                                                    ZVal.getElement(function, "filename"),
                                                    ZVal.getElement(function, "lineno"))
                                            .value()),
                            time);
                }
            }
        }

        if (ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("beStrictAboutTestsThatDoNotTestAnything")
                                .value())
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                env.callMethod(test, "getNumAssertions", TestResult.class), 0))) {
            risky = true;
        }

        if (ZVal.isTrue(collectCodeCoverage)) {
            append =
                    ZVal.toBool(
                                    ZVal.toBool(!ZVal.isTrue(risky))
                                            && ZVal.toBool(!ZVal.isTrue(incomplete)))
                            && ZVal.toBool(!ZVal.isTrue(skipped));
            linesToBeCovered = ZVal.newArray();
            linesToBeUsed = ZVal.newArray();
            if (ZVal.toBool(append)
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                try {
                    linesToBeCovered =
                            Test.runtimeStaticObject.getLinesToBeCovered(
                                    env,
                                    function_get_class.f.env(env).call(test).value(),
                                    env.callMethod(test, "getName", TestResult.class, false));
                    linesToBeUsed =
                            Test.runtimeStaticObject.getLinesToBeUsed(
                                    env,
                                    function_get_class.f.env(env).call(test).value(),
                                    env.callMethod(test, "getName", TestResult.class, false));
                } catch (ConvertedException convertedException41) {
                    if (convertedException41.instanceOf(
                            InvalidCoversTargetException.class,
                            "PHPUnit\\Framework\\InvalidCoversTargetException")) {
                        cce = convertedException41.getObject();
                        env.callMethod(
                                this,
                                "addWarning",
                                TestResult.class,
                                test,
                                new Warning(
                                        env, env.callMethod(cce, "getMessage", TestResult.class)),
                                time);
                    } else {
                        throw convertedException41;
                    }
                }
            }

            try {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("codeCoverage").value(),
                        "stop",
                        TestResult.class,
                        append,
                        linesToBeCovered,
                        linesToBeUsed);
            } catch (ConvertedException convertedException42) {
                if (convertedException42.instanceOf(
                        UnintentionallyCoveredCodeException.class,
                        "SebastianBergmann\\CodeCoverage\\UnintentionallyCoveredCodeException")) {
                    cce = convertedException42.getObject();
                    env.callMethod(
                            this,
                            "addFailure",
                            TestResult.class,
                            test,
                            new UnintentionallyCoveredCodeError(
                                    env,
                                    "This test executed code that is not listed as code to be covered or used:"
                                            + toStringR("\n", env)
                                            + toStringR(
                                                    env.callMethod(
                                                            cce, "getMessage", TestResult.class),
                                                    env)),
                            time);
                } else if (convertedException42.instanceOf(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .namespaces
                                .CodeCoverage
                                .classes
                                .CoveredCodeNotExecutedException
                                .class,
                        "SebastianBergmann\\CodeCoverage\\CoveredCodeNotExecutedException")) {
                    cce = convertedException42.getObject();
                    env.callMethod(
                            this,
                            "addFailure",
                            TestResult.class,
                            test,
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .classes
                                    .CoveredCodeNotExecutedException(
                                    env,
                                    "This test did not execute all the code that is listed as code to be covered:"
                                            + toStringR("\n", env)
                                            + toStringR(
                                                    env.callMethod(
                                                            cce, "getMessage", TestResult.class),
                                                    env)),
                            time);
                } else if (convertedException42.instanceOf(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .namespaces
                                .CodeCoverage
                                .classes
                                .MissingCoversAnnotationException
                                .class,
                        "SebastianBergmann\\CodeCoverage\\MissingCoversAnnotationException")) {
                    cce = convertedException42.getObject();
                    if (ZVal.strictNotEqualityCheck(linesToBeCovered, "!==", false)) {
                        env.callMethod(
                                this,
                                "addFailure",
                                TestResult.class,
                                test,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .MissingCoversAnnotationException(
                                        env,
                                        "This test does not have a @covers annotation but is expected to have one"),
                                time);
                    }

                } else if (convertedException42.instanceOf(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .namespaces
                                .CodeCoverage
                                .classes
                                .Exception
                                .class,
                        "SebastianBergmann\\CodeCoverage\\Exception")) {
                    cce = convertedException42.getObject();
                    error = true;
                    if (!ZVal.isset(e)) {
                        e = ZVal.assign(cce);
                    }

                } else {
                    throw convertedException42;
                }
            }
        }

        if (ZVal.strictEqualityCheck(errorHandlerSet, "===", true)) {
            NamespaceGlobal.restore_error_handler.env(env).call();
        }

        if (ZVal.strictEqualityCheck(error, "===", true)) {
            env.callMethod(this, "addError", TestResult.class, test, e, time);

        } else if (ZVal.strictEqualityCheck(failure, "===", true)) {
            env.callMethod(this, "addFailure", TestResult.class, test, e, time);

        } else if (ZVal.strictEqualityCheck(warning, "===", true)) {
            env.callMethod(this, "addWarning", TestResult.class, test, e, time);

        } else if (ZVal.toBool(
                        ZVal.toBool(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("beStrictAboutTestsThatDoNotTestAnything")
                                                .value())
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        test,
                                                        "doesNotPerformAssertions",
                                                        TestResult.class))))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                env.callMethod(test, "getNumAssertions", TestResult.class), 0))) {
            env.callMethod(
                    this,
                    "addFailure",
                    TestResult.class,
                    test,
                    new RiskyTestError(env, "This test did not perform any assertions"),
                    time);

        } else if (ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("beStrictAboutOutputDuringTests")
                                .value())
                && ZVal.toBool(env.callMethod(test, "hasOutput", TestResult.class))) {
            env.callMethod(
                    this,
                    "addFailure",
                    TestResult.class,
                    test,
                    new OutputError(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "This test printed output: %s",
                                            env.callMethod(
                                                    test, "getActualOutput", TestResult.class))
                                    .value()),
                    time);

        } else if (ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("beStrictAboutTodoAnnotatedTests")
                                .value())
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            annotations = env.callMethod(test, "getAnnotations", TestResult.class);
            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", "todo"))) {
                env.callMethod(
                        this,
                        "addFailure",
                        TestResult.class,
                        test,
                        new RiskyTestError(env, "Test method is annotated with @todo"),
                        time);
            }
        }

        env.callMethod(this, "endTest", TestResult.class, test, time);
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("runTests").value());
    }

    @ConvertedMethod
    public Object shouldStop(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("stop").value());
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("stop").set(true);
        return null;
    }

    @ConvertedMethod
    public Object getCodeCoverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("codeCoverage").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "codeCoverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    public Object setCodeCoverage(RuntimeEnv env, Object... args) {
        Object codeCoverage = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("codeCoverage").set(codeCoverage);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object convertErrorsToExceptions(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("convertErrorsToExceptions").set(flag);
        return null;
    }

    @ConvertedMethod
    public Object getConvertErrorsToExceptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("convertErrorsToExceptions").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnError(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stopOnError").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnFailure(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stopOnFailure").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnWarning(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stopOnWarning").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object beStrictAboutTestsThatDoNotTestAnything(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("beStrictAboutTestsThatDoNotTestAnything")
                .set(flag);
        return null;
    }

    @ConvertedMethod
    public Object isStrictAboutTestsThatDoNotTestAnything(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this)
                        .accessProp(this, env)
                        .name("beStrictAboutTestsThatDoNotTestAnything")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object beStrictAboutOutputDuringTests(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("beStrictAboutOutputDuringTests").set(flag);
        return null;
    }

    @ConvertedMethod
    public Object isStrictAboutOutputDuringTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this)
                        .accessProp(this, env)
                        .name("beStrictAboutOutputDuringTests")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object beStrictAboutResourceUsageDuringSmallTests(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("beStrictAboutResourceUsageDuringSmallTests")
                .set(flag);
        return null;
    }

    @ConvertedMethod
    public Object isStrictAboutResourceUsageDuringSmallTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this)
                        .accessProp(this, env)
                        .name("beStrictAboutResourceUsageDuringSmallTests")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object enforceTimeLimit(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("enforceTimeLimit").set(flag);
        return null;
    }

    @ConvertedMethod
    public Object enforcesTimeLimit(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("enforceTimeLimit").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object beStrictAboutTodoAnnotatedTests(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("beStrictAboutTodoAnnotatedTests").set(flag);
        return null;
    }

    @ConvertedMethod
    public Object isStrictAboutTodoAnnotatedTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this)
                        .accessProp(this, env)
                        .name("beStrictAboutTodoAnnotatedTests")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnRisky(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stopOnRisky").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnIncomplete(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stopOnIncomplete").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object stopOnSkipped(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stopOnSkipped").set(flag);
        return null;
    }

    @ConvertedMethod
    public Object time(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("time").value());
    }

    @ConvertedMethod
    public Object wasSuccessful(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.isEmpty(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("errors")
                                                                .value()))
                                        && ZVal.toBool(
                                                ZVal.isEmpty(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("failures")
                                                                .value())))
                        && ZVal.toBool(
                                ZVal.isEmpty(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("warnings")
                                                .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout", typeHint = "int")
    public Object setTimeoutForSmallTests(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("timeoutForSmallTests").set(timeout);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout", typeHint = "int")
    public Object setTimeoutForMediumTests(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("timeoutForMediumTests").set(timeout);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout", typeHint = "int")
    public Object setTimeoutForLargeTests(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("timeoutForLargeTests").set(timeout);
        return null;
    }

    @ConvertedMethod
    public Object getTimeoutForLargeTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("timeoutForLargeTests").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setRegisterMockObjectsFromTestArgumentsRecursively(
            RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("registerMockObjectsFromTestArgumentsRecursively")
                .set(flag);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\TestResult";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\TestResult")
                    .setLookup(TestResult.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "beStrictAboutOutputDuringTests",
                            "beStrictAboutResourceUsageDuringSmallTests",
                            "beStrictAboutTestsThatDoNotTestAnything",
                            "beStrictAboutTodoAnnotatedTests",
                            "codeCoverage",
                            "convertErrorsToExceptions",
                            "enforceTimeLimit",
                            "errors",
                            "failures",
                            "lastTestFailed",
                            "listeners",
                            "notImplemented",
                            "passed",
                            "registerMockObjectsFromTestArgumentsRecursively",
                            "risky",
                            "runTests",
                            "skipped",
                            "stop",
                            "stopOnError",
                            "stopOnFailure",
                            "stopOnIncomplete",
                            "stopOnRisky",
                            "stopOnSkipped",
                            "stopOnWarning",
                            "time",
                            "timeoutForLargeTests",
                            "timeoutForMediumTests",
                            "timeoutForSmallTests",
                            "topTestSuite",
                            "warnings")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/TestResult.php")
                    .addInterface("Countable")
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

    private enum SwitchEnumType16 {
        DYNAMIC_TYPE_95,
        DYNAMIC_TYPE_96,
        DYNAMIC_TYPE_97,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
