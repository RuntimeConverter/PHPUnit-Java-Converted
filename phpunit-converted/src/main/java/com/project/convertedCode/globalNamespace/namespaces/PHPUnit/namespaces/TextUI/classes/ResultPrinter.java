package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.InvalidArgumentHelper;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Console;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/TextUI/ResultPrinter.php

*/

public class ResultPrinter extends Printer implements TestListener {

    public Object column = 0;

    public Object maxColumn = null;

    public Object lastTestFailed = false;

    public Object numAssertions = 0;

    public Object numTests = -1;

    public Object numTestsRun = 0;

    public Object numTestsWidth = null;

    public Object colors = false;

    public Object debug = false;

    public Object verbose = false;

    public Object numberOfColumns = null;

    public Object reverse = null;

    public Object defectListPrinted = false;

    public ResultPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResultPrinter.class) {
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
        name = "verbose",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "colors")
    @ConvertedParameter(
        index = 3,
        name = "debug",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "numberOfColumns",
        defaultValue = "80",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 5,
        name = "reverse",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, null);
        if (ZVal.isNull(out)) {
            out = ZVal.getNull();
        }
        Object verbose = assignParameter(args, 1, null);
        if (ZVal.isNull(verbose)) {
            verbose = false;
        }
        Object colors = assignParameter(args, 2, null);
        if (ZVal.isNull(colors)) {
            colors = CONST_COLOR_DEFAULT;
        }
        Object debug = assignParameter(args, 3, null);
        if (ZVal.isNull(debug)) {
            debug = false;
        }
        Object numberOfColumns = assignParameter(args, 4, null);
        if (ZVal.isNull(numberOfColumns)) {
            numberOfColumns = 80;
        }
        Object reverse = assignParameter(args, 5, null);
        if (ZVal.isNull(reverse)) {
            reverse = false;
        }
        Object console = null;
        Object availableColors = null;
        Object maxNumberOfColumns = null;
        super.__construct(env, out);
        availableColors =
                ZVal.newArray(
                        new ZPair(0, CONST_COLOR_NEVER),
                        new ZPair(1, CONST_COLOR_AUTO),
                        new ZPair(2, CONST_COLOR_ALWAYS));
        if (!CRArrayF.in_array.env(env).call(colors, availableColors).getBool()) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(
                            env,
                            3,
                            NamespaceGlobal.vsprintf
                                    .env(env)
                                    .call("value from \"%s\", \"%s\" or \"%s\"", availableColors)
                                    .value()));
        }

        if (ZVal.toBool(!function_is_int.f.env(env).call(numberOfColumns).getBool())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(numberOfColumns, "!==", "max"))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(
                            env, 5, "integer or \"max\""));
        }

        console = new Console(env);
        maxNumberOfColumns = env.callMethod(console, "getNumberOfColumns", ResultPrinter.class);
        if (ZVal.toBool(ZVal.strictEqualityCheck(numberOfColumns, "===", "max"))
                || ZVal.toBool(
                        ZVal.toBool(ZVal.strictNotEqualityCheck(numberOfColumns, "!==", 80))
                                && ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                numberOfColumns, '>', maxNumberOfColumns)))) {
            numberOfColumns = ZVal.assign(maxNumberOfColumns);
        }

        toObjectR(this).accessProp(this, env).name("numberOfColumns").set(numberOfColumns);
        toObjectR(this).accessProp(this, env).name("verbose").set(verbose);
        toObjectR(this).accessProp(this, env).name("debug").set(debug);
        toObjectR(this).accessProp(this, env).name("reverse").set(reverse);
        if (ZVal.toBool(ZVal.strictEqualityCheck(colors, "===", CONST_COLOR_AUTO))
                && ZVal.toBool(env.callMethod(console, "hasColorSupport", ResultPrinter.class))) {
            toObjectR(this).accessProp(this, env).name("colors").set(true);

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("colors")
                    .set(ZVal.strictEqualityCheck(CONST_COLOR_ALWAYS, "===", colors));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object printResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(this, "printHeader", ResultPrinter.class);
        env.callMethod(this, "printErrors", ResultPrinter.class, result);
        env.callMethod(this, "printWarnings", ResultPrinter.class, result);
        env.callMethod(this, "printFailures", ResultPrinter.class, result);
        env.callMethod(this, "printRisky", ResultPrinter.class, result);
        if (toObjectR(this).accessProp(this, env).name("verbose").getBool()) {
            env.callMethod(this, "printIncompletes", ResultPrinter.class, result);
            env.callMethod(this, "printSkipped", ResultPrinter.class, result);
        }

        env.callMethod(this, "printFooter", ResultPrinter.class, result);
        return null;
    }

    @ConvertedMethod
    public Object printWaitPrompt(RuntimeEnv env, Object... args) {
        env.callMethod(this, "write", ResultPrinter.class, "\n<RETURN> to continue\n");
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
        env.callMethod(this, "writeProgressWithColor", ResultPrinter.class, "fg-red, bold", "E");
        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(true);
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
        env.callMethod(
                this, "writeProgressWithColor", ResultPrinter.class, "bg-red, fg-white", "F");
        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(true);
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
        env.callMethod(this, "writeProgressWithColor", ResultPrinter.class, "fg-yellow, bold", "W");
        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(true);
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
        env.callMethod(this, "writeProgressWithColor", ResultPrinter.class, "fg-yellow, bold", "I");
        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(true);
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
        env.callMethod(this, "writeProgressWithColor", ResultPrinter.class, "fg-yellow, bold", "R");
        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(true);
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
        env.callMethod(this, "writeProgressWithColor", ResultPrinter.class, "fg-cyan, bold", "S");
        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        if (ZVal.equalityCheck(
                toObjectR(this).accessProp(this, env).name("numTests").value(), -1)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("numTests")
                    .set(CRArrayF.count.env(env).call(suite).value());
            toObjectR(this)
                    .accessProp(this, env)
                    .name("numTestsWidth")
                    .set(
                            NamespaceGlobal.strlen
                                    .env(env)
                                    .call(
                                            toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("numTests")
                                                            .value(),
                                                    env))
                                    .value());
            toObjectR(this)
                    .accessProp(this, env)
                    .name("maxColumn")
                    .set(
                            ZVal.subtract(
                                    ZVal.subtract(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("numberOfColumns")
                                                    .value(),
                                            NamespaceGlobal.strlen
                                                    .env(env)
                                                    .call("  /  (XXX%)")
                                                    .value()),
                                    ZVal.multiply(
                                            2,
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("numTestsWidth")
                                                    .value())));
        }

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
        if (toObjectR(this).accessProp(this, env).name("debug").getBool()) {
            env.callMethod(
                    this,
                    "write",
                    ResultPrinter.class,
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "Test '%s' started\n",
                                    Test.runtimeStaticObject.describeAsString(env, test))
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object time = assignParameter(args, 1, null);
        if (toObjectR(this).accessProp(this, env).name("debug").getBool()) {
            env.callMethod(
                    this,
                    "write",
                    ResultPrinter.class,
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "Test '%s' ended\n",
                                    Test.runtimeStaticObject.describeAsString(env, test))
                            .value());
        }

        if (!toObjectR(this).accessProp(this, env).name("lastTestFailed").getBool()) {
            env.callMethod(this, "writeProgress", ResultPrinter.class, ".");
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("numAssertions")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("numAssertions")
                                            .value(),
                                    env.callMethod(test, "getNumAssertions", ResultPrinter.class)));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, PhptTestCase.class, "PHPUnit\\Runner\\PhptTestCase"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("numAssertions")
                    .set(
                            ZVal.increment(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("numAssertions")
                                            .value()));
        }

        toObjectR(this).accessProp(this, env).name("lastTestFailed").set(false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            if (!ZVal.isTrue(env.callMethod(test, "hasExpectationOnOutput", ResultPrinter.class))) {
                env.callMethod(
                        this,
                        "write",
                        ResultPrinter.class,
                        env.callMethod(test, "getActualOutput", ResultPrinter.class));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defects", typeHint = "array")
    @ConvertedParameter(index = 1, name = "type", typeHint = "string")
    protected Object printDefects(RuntimeEnv env, Object... args) {
        Object defects = assignParameter(args, 0, null);
        Object type = assignParameter(args, 1, null);
        Object defect = null;
        Object count = null;
        Object i = null;
        count = CRArrayF.count.env(env).call(defects).value();
        if (ZVal.equalityCheck(count, 0)) {
            return null;
        }

        if (toObjectR(this).accessProp(this, env).name("defectListPrinted").getBool()) {
            env.callMethod(this, "write", ResultPrinter.class, "\n--\n\n");
        }

        env.callMethod(
                this,
                "write",
                ResultPrinter.class,
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "There %s %d %s%s:\n",
                                ZVal.equalityCheck(count, 1) ? "was" : "were",
                                count,
                                type,
                                ZVal.equalityCheck(count, 1) ? "" : "s")
                        .value());
        i = 1;
        if (toObjectR(this).accessProp(this, env).name("reverse").getBool()) {
            defects = CRArrayF.array_reverse.env(env).call(defects).value();
        }

        for (ZPair zpairResult337 : ZVal.getIterable(defects, env, true)) {
            defect = ZVal.assign(zpairResult337.getValue());
            env.callMethod(
                    this,
                    "printDefect",
                    ResultPrinter.class,
                    defect,
                    ((long) (i = ZVal.increment(i)) - 1));
        }

        toObjectR(this).accessProp(this, env).name("defectListPrinted").set(true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defect", typeHint = "PHPUnit\\Framework\\TestFailure")
    @ConvertedParameter(index = 1, name = "count", typeHint = "int")
    protected Object printDefect(RuntimeEnv env, Object... args) {
        Object defect = assignParameter(args, 0, null);
        Object count = assignParameter(args, 1, null);
        env.callMethod(this, "printDefectHeader", ResultPrinter.class, defect, count);
        env.callMethod(this, "printDefectTrace", ResultPrinter.class, defect);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defect", typeHint = "PHPUnit\\Framework\\TestFailure")
    @ConvertedParameter(index = 1, name = "count", typeHint = "int")
    protected Object printDefectHeader(RuntimeEnv env, Object... args) {
        Object defect = assignParameter(args, 0, null);
        Object count = assignParameter(args, 1, null);
        env.callMethod(
                this,
                "write",
                ResultPrinter.class,
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "\n%d) %s\n",
                                count, env.callMethod(defect, "getTestName", ResultPrinter.class))
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defect", typeHint = "PHPUnit\\Framework\\TestFailure")
    protected Object printDefectTrace(RuntimeEnv env, Object... args) {
        Object defect = assignParameter(args, 0, null);
        Object e = null;
        e = env.callMethod(defect, "thrownException", ResultPrinter.class);
        env.callMethod(this, "write", ResultPrinter.class, toStringR(e, env));
        while (ZVal.isTrue(e = env.callMethod(e, "getPrevious", ResultPrinter.class))) {
            env.callMethod(this, "write", ResultPrinter.class, "\nCaused by\n" + toStringR(e, env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printErrors(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "printDefects",
                ResultPrinter.class,
                env.callMethod(result, "errors", ResultPrinter.class),
                "error");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printFailures(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "printDefects",
                ResultPrinter.class,
                env.callMethod(result, "failures", ResultPrinter.class),
                "failure");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printWarnings(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "printDefects",
                ResultPrinter.class,
                env.callMethod(result, "warnings", ResultPrinter.class),
                "warning");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printIncompletes(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "printDefects",
                ResultPrinter.class,
                env.callMethod(result, "notImplemented", ResultPrinter.class),
                "incomplete test");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printRisky(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "printDefects",
                ResultPrinter.class,
                env.callMethod(result, "risky", ResultPrinter.class),
                "risky test");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printSkipped(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "printDefects",
                ResultPrinter.class,
                env.callMethod(result, "skipped", ResultPrinter.class),
                "skipped test");
        return null;
    }

    @ConvertedMethod
    protected Object printHeader(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "write",
                ResultPrinter.class,
                "\n\n" + toStringR(Timer.runtimeStaticObject.resourceUsage(env), env) + "\n\n");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    protected Object printFooter(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        Object color = null;
        if (ZVal.strictEqualityCheck(CRArrayF.count.env(env).call(result).value(), "===", 0)) {
            env.callMethod(
                    this,
                    "writeWithColor",
                    ResultPrinter.class,
                    "fg-black, bg-yellow",
                    "No tests executed!");
            return null;
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        env.callMethod(
                                                                result,
                                                                "wasSuccessful",
                                                                ResultPrinter.class))
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                result,
                                                                "allHarmless",
                                                                ResultPrinter.class)))
                                && ZVal.toBool(
                                        env.callMethod(
                                                result,
                                                "allCompletelyImplemented",
                                                ResultPrinter.class)))
                && ZVal.toBool(env.callMethod(result, "noneSkipped", ResultPrinter.class))) {
            env.callMethod(
                    this,
                    "writeWithColor",
                    ResultPrinter.class,
                    "fg-black, bg-green",
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "OK (%d test%s, %d assertion%s)",
                                    CRArrayF.count.env(env).call(result).value(),
                                    ZVal.equalityCheck(
                                                    CRArrayF.count.env(env).call(result).value(), 1)
                                            ? ""
                                            : "s",
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("numAssertions")
                                            .value(),
                                    ZVal.equalityCheck(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("numAssertions")
                                                            .value(),
                                                    1)
                                            ? ""
                                            : "s")
                            .value());

        } else {
            if (ZVal.isTrue(env.callMethod(result, "wasSuccessful", ResultPrinter.class))) {
                color = "fg-black, bg-yellow";
                if (ZVal.toBool(toObjectR(this).accessProp(this, env).name("verbose").value())
                        || ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                result, "allHarmless", ResultPrinter.class)))) {
                    env.callMethod(this, "write", ResultPrinter.class, "\n");
                }

                env.callMethod(
                        this,
                        "writeWithColor",
                        ResultPrinter.class,
                        color,
                        "OK, but incomplete, skipped, or risky tests!");

            } else {
                env.callMethod(this, "write", ResultPrinter.class, "\n");
                if (ZVal.isTrue(env.callMethod(result, "errorCount", ResultPrinter.class))) {
                    color = "fg-white, bg-red";
                    env.callMethod(this, "writeWithColor", ResultPrinter.class, color, "ERRORS!");

                } else if (ZVal.isTrue(
                        env.callMethod(result, "failureCount", ResultPrinter.class))) {
                    color = "fg-white, bg-red";
                    env.callMethod(this, "writeWithColor", ResultPrinter.class, color, "FAILURES!");

                } else if (ZVal.isTrue(
                        env.callMethod(result, "warningCount", ResultPrinter.class))) {
                    color = "fg-black, bg-yellow";
                    env.callMethod(this, "writeWithColor", ResultPrinter.class, color, "WARNINGS!");
                }
            }

            env.callMethod(
                    this,
                    "writeCountString",
                    ResultPrinter.class,
                    CRArrayF.count.env(env).call(result).value(),
                    "Tests",
                    color,
                    true);
            env.callMethod(
                    this,
                    "writeCountString",
                    ResultPrinter.class,
                    toObjectR(this).accessProp(this, env).name("numAssertions").value(),
                    "Assertions",
                    color,
                    true);
            env.callMethod(
                    this,
                    "writeCountString",
                    ResultPrinter.class,
                    env.callMethod(result, "errorCount", ResultPrinter.class),
                    "Errors",
                    color);
            env.callMethod(
                    this,
                    "writeCountString",
                    ResultPrinter.class,
                    env.callMethod(result, "failureCount", ResultPrinter.class),
                    "Failures",
                    color);
            env.callMethod(
                    this,
                    "writeCountString",
                    ResultPrinter.class,
                    env.callMethod(result, "warningCount", ResultPrinter.class),
                    "Warnings",
                    color);
            env.callMethod(
                    this,
                    "writeCountString",
                    ResultPrinter.class,
                    env.callMethod(result, "skippedCount", ResultPrinter.class),
                    "Skipped",
                    color);
            env.callMethod(
                    this,
                    "writeCountString",
                    ResultPrinter.class,
                    env.callMethod(result, "notImplementedCount", ResultPrinter.class),
                    "Incomplete",
                    color);
            env.callMethod(
                    this,
                    "writeCountString",
                    ResultPrinter.class,
                    env.callMethod(result, "riskyCount", ResultPrinter.class),
                    "Risky",
                    color);
            env.callMethod(this, "writeWithColor", ResultPrinter.class, color, ".");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "progress", typeHint = "string")
    protected Object writeProgress(RuntimeEnv env, Object... args) {
        Object progress = assignParameter(args, 0, null);
        if (toObjectR(this).accessProp(this, env).name("debug").getBool()) {
            return null;
        }

        env.callMethod(this, "write", ResultPrinter.class, progress);
        toObjectR(this)
                .accessProp(this, env)
                .name("column")
                .set(ZVal.increment(toObjectR(this).accessProp(this, env).name("column").value()));
        toObjectR(this)
                .accessProp(this, env)
                .name("numTestsRun")
                .set(
                        ZVal.increment(
                                toObjectR(this).accessProp(this, env).name("numTestsRun").value()));
        if (ZVal.toBool(
                        ZVal.equalityCheck(
                                toObjectR(this).accessProp(this, env).name("column").value(),
                                toObjectR(this).accessProp(this, env).name("maxColumn").value()))
                || ZVal.toBool(
                        ZVal.equalityCheck(
                                toObjectR(this).accessProp(this, env).name("numTestsRun").value(),
                                toObjectR(this).accessProp(this, env).name("numTests").value()))) {
            if (ZVal.equalityCheck(
                    toObjectR(this).accessProp(this, env).name("numTestsRun").value(),
                    toObjectR(this).accessProp(this, env).name("numTests").value())) {
                env.callMethod(
                        this,
                        "write",
                        ResultPrinter.class,
                        NamespaceGlobal.str_repeat
                                .env(env)
                                .call(
                                        " ",
                                        ZVal.subtract(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("maxColumn")
                                                        .value(),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("column")
                                                        .value()))
                                .value());
            }

            env.callMethod(
                    this,
                    "write",
                    ResultPrinter.class,
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    " %"
                                            + toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("numTestsWidth")
                                                            .value(),
                                                    env)
                                            + "d / %"
                                            + toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("numTestsWidth")
                                                            .value(),
                                                    env)
                                            + "d (%3s%%)",
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("numTestsRun")
                                            .value(),
                                    toObjectR(this).accessProp(this, env).name("numTests").value(),
                                    NamespaceGlobal.floor
                                            .env(env)
                                            .call(
                                                    ZVal.multiply(
                                                            ZVal.divide(
                                                                    toObjectR(this)
                                                                            .accessProp(this, env)
                                                                            .name("numTestsRun")
                                                                            .value(),
                                                                    toObjectR(this)
                                                                            .accessProp(this, env)
                                                                            .name("numTests")
                                                                            .value()),
                                                            100))
                                            .value())
                            .value());
            if (ZVal.equalityCheck(
                    toObjectR(this).accessProp(this, env).name("column").value(),
                    toObjectR(this).accessProp(this, env).name("maxColumn").value())) {
                env.callMethod(this, "writeNewLine", ResultPrinter.class);
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object writeNewLine(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("column").set(0);
        env.callMethod(this, "write", ResultPrinter.class, "\n");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color", typeHint = "string")
    @ConvertedParameter(index = 1, name = "buffer", typeHint = "string")
    protected Object formatWithColor(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, null);
        Object buffer = assignParameter(args, 1, null);
        Object codes = null;
        Object padding = null;
        Object code = null;
        Object line = null;
        Object styledLines = ZVal.newArray();
        Object styles = ZVal.newArray();
        Object style = null;
        Object lines = null;
        if (!toObjectR(this).accessProp(this, env).name("colors").getBool()) {
            return ZVal.assign(buffer);
        }

        codes =
                CRArrayF.array_map
                        .env(env)
                        .call("\\trim", NamespaceGlobal.explode.env(env).call(",", color).value())
                        .value();
        lines = NamespaceGlobal.explode.env(env).call("\n", buffer).value();
        padding =
                NamespaceGlobal.max
                        .env(env)
                        .call(CRArrayF.array_map.env(env).call("\\strlen", lines).value())
                        .value();
        styles = ZVal.newArray();
        for (ZPair zpairResult338 : ZVal.getIterable(codes, env, true)) {
            code = ZVal.assign(zpairResult338.getValue());
            ZVal.addToArray(
                    styles,
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .TextUI
                                                    .classes
                                                    .ResultPrinter
                                                    .RequestStaticProperties
                                                    .class)
                                    .ansiCodes,
                            code));
        }

        style =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "\u001B[%sm",
                                NamespaceGlobal.implode.env(env).call(";", styles).value())
                        .value();
        styledLines = ZVal.newArray();
        for (ZPair zpairResult339 : ZVal.getIterable(lines, env, true)) {
            line = ZVal.assign(zpairResult339.getValue());
            ZVal.addToArray(
                    styledLines,
                    toStringR(style, env)
                            + toStringR(
                                    NamespaceGlobal.str_pad.env(env).call(line, padding).value(),
                                    env)
                            + "\u001B[0m");
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\n", styledLines).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color", typeHint = "string")
    @ConvertedParameter(index = 1, name = "buffer", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "lf",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object writeWithColor(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, null);
        Object buffer = assignParameter(args, 1, null);
        Object lf = assignParameter(args, 2, null);
        if (ZVal.isNull(lf)) {
            lf = true;
        }
        env.callMethod(
                this,
                "write",
                ResultPrinter.class,
                env.callMethod(this, "formatWithColor", ResultPrinter.class, color, buffer));
        if (ZVal.isTrue(lf)) {
            env.callMethod(this, "write", ResultPrinter.class, "\n");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color", typeHint = "string")
    @ConvertedParameter(index = 1, name = "buffer", typeHint = "string")
    protected Object writeProgressWithColor(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, null);
        Object buffer = assignParameter(args, 1, null);
        buffer = env.callMethod(this, "formatWithColor", ResultPrinter.class, color, buffer);
        env.callMethod(this, "writeProgress", ResultPrinter.class, buffer);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    @ConvertedParameter(index = 2, name = "color", typeHint = "string")
    @ConvertedParameter(
        index = 3,
        name = "always",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object writeCountString(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, null);
        Object name = assignParameter(args, 1, null);
        Object color = assignParameter(args, 2, null);
        Object always = assignParameter(args, 3, null);
        if (ZVal.isNull(always)) {
            always = false;
        }
        ReferenceContainer first = new BasicReferenceContainer(null);
        first = env.getInlineStatic(3, true);
        if (ZVal.toBool(always) || ZVal.toBool(ZVal.isGreaterThan(count, '>', 0))) {
            env.callMethod(
                    this,
                    "writeWithColor",
                    ResultPrinter.class,
                    color,
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "%s%s: %d",
                                    !ZVal.isTrue(first.getObject()) ? ", " : "", name, count)
                            .value(),
                    false);
            first.setObject(false);
        }

        return null;
    }

    public static final Object CONST_EVENT_TEST_START = 0;

    public static final Object CONST_EVENT_TEST_END = 1;

    public static final Object CONST_EVENT_TESTSUITE_START = 2;

    public static final Object CONST_EVENT_TESTSUITE_END = 3;

    public static final Object CONST_COLOR_NEVER = "never";

    public static final Object CONST_COLOR_AUTO = "auto";

    public static final Object CONST_COLOR_ALWAYS = "always";

    public static final Object CONST_COLOR_DEFAULT = CONST_COLOR_NEVER;

    public static final Object CONST_class = "PHPUnit\\TextUI\\ResultPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Printer.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object ansiCodes =
                ZVal.newArray(
                        new ZPair("bold", 1),
                        new ZPair("fg-black", 30),
                        new ZPair("fg-red", 31),
                        new ZPair("fg-green", 32),
                        new ZPair("fg-yellow", 33),
                        new ZPair("fg-blue", 34),
                        new ZPair("fg-magenta", 35),
                        new ZPair("fg-cyan", 36),
                        new ZPair("fg-white", 37),
                        new ZPair("bg-black", 40),
                        new ZPair("bg-red", 41),
                        new ZPair("bg-green", 42),
                        new ZPair("bg-yellow", 43),
                        new ZPair("bg-blue", 44),
                        new ZPair("bg-magenta", 45),
                        new ZPair("bg-cyan", 46),
                        new ZPair("bg-white", 47));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\TextUI\\ResultPrinter")
                    .setLookup(ResultPrinter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "autoFlush",
                            "colors",
                            "column",
                            "debug",
                            "defectListPrinted",
                            "lastTestFailed",
                            "maxColumn",
                            "numAssertions",
                            "numTests",
                            "numTestsRun",
                            "numTestsWidth",
                            "numberOfColumns",
                            "out",
                            "outTarget",
                            "reverse",
                            "verbose")
                    .setFilename("vendor/phpunit/phpunit/src/TextUI/ResultPrinter.php")
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
