package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.IncludeGroupFilterIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterLastTestHook;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Configuration;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.StandardTestSuiteLoader;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestHook;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Comparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Notice;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Version;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.HtmlResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes.Clover;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestResult;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.NameFilterIterator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.TextResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.CodeCoverage;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Warning;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Deprecated;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes.JUnit;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes.TeamCity;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes.PHP;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.XmlResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Hook;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BeforeFirstTestHook;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes.Text;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestListenerAdapter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Filter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.ExcludeGroupFilterIterator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes.Crap4j;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/TextUI/TestRunner.php

*/

public class TestRunner extends BaseTestRunner {

    public Object codeCoverageFilter = null;

    public Object loader = null;

    public Object printer = null;

    public Object runtime = null;

    public Object messagePrinted = false;

    public Object extensions = ZVal.newArray();

    public TestRunner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestRunner.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "loader",
        typeHint = "PHPUnit\\Runner\\TestSuiteLoader",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "filter",
        typeHint = "SebastianBergmann\\CodeCoverage\\Filter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object loader = assignParameter(args, 0, null);
        if (ZVal.isNull(loader)) {
            loader = ZVal.getNull();
        }
        Object filter = assignParameter(args, 1, null);
        if (ZVal.isNull(filter)) {
            filter = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(filter, "===", ZVal.getNull())) {
            filter = new Filter(env);
        }

        toObjectR(this).accessProp(this, env).name("codeCoverageFilter").set(filter);
        toObjectR(this).accessProp(this, env).name("loader").set(loader);
        toObjectR(this).accessProp(this, env).name("runtime").set(new Runtime(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "exit",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object doRun(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        ReferenceContainer arguments = new BasicReferenceContainer(assignParameter(args, 1, null));
        if (ZVal.isNull(arguments)) {
            arguments.setObject(ZVal.newArray());
        }
        Object exit = assignParameter(args, 2, null);
        if (ZVal.isNull(exit)) {
            exit = true;
        }
        ReferenceContainer extension = new BasicReferenceContainer(null);
        Object listener = null;
        Object dir = ZVal.newArray();
        Object colors = null;
        Object result = null;
        Object GLOBALS = env.getGlobal("GLOBALS");
        Object file = null;
        Object whitelistFromOption = null;
        Object codeCoverage = null;
        Object outputStream = null;
        Object listenerNeeded = null;
        Object _pClass = null;
        Object _suite = null;
        Object printerClass = null;
        Object e = null;
        Object runtime = null;
        Object codeCoverageReports = null;
        Object processor = null;
        Object step = null;
        Object writer = null;
        Object filterConfiguration = ZVal.newArray();
        Object whitelistFromConfigurationFile = null;
        if (ZVal.isset(ZVal.getElement(arguments.getObject(), "configuration"))) {
            ZVal.putArrayElement(
                    GLOBALS,
                    "__PHPUNIT_CONFIGURATION_FILE",
                    ZVal.getElement(arguments.getObject(), "configuration"));
        }

        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, arguments),
                "handleConfiguration",
                TestRunner.class,
                arguments.getObject());
        env.callMethod(this, "processSuiteFilters", TestRunner.class, suite, arguments.getObject());
        if (ZVal.isset(ZVal.getElement(arguments.getObject(), "bootstrap"))) {
            ZVal.putArrayElement(
                    GLOBALS,
                    "__PHPUNIT_BOOTSTRAP",
                    ZVal.getElement(arguments.getObject(), "bootstrap"));
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getElement(arguments.getObject(), "backupGlobals"), "===", true)) {
            env.callMethod(suite, "setBackupGlobals", TestRunner.class, true);
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getElement(arguments.getObject(), "backupStaticAttributes"), "===", true)) {
            env.callMethod(suite, "setBackupStaticAttributes", TestRunner.class, true);
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getElement(arguments.getObject(), "beStrictAboutChangesToGlobalState"),
                "===",
                true)) {
            env.callMethod(suite, "setBeStrictAboutChangesToGlobalState", TestRunner.class, true);
        }

        if (ZVal.toBool(
                        function_is_int
                                .f
                                .env(env)
                                .call(ZVal.getElement(arguments.getObject(), "repeat"))
                                .value())
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                ZVal.getElement(arguments.getObject(), "repeat"), '>', 0))) {
            _suite = new TestSuite(env);
            for (ZPair zpairResult340 :
                    ZVal.getIterable(
                            CRArrayF.range
                                    .env(env)
                                    .call(1, ZVal.getElement(arguments.getObject(), "repeat"))
                                    .value(),
                            env,
                            true)) {
                step = ZVal.assign(zpairResult340.getValue());
                env.callMethod(_suite, "addTest", TestRunner.class, suite);
            }

            suite = ZVal.assign(_suite);
            _suite = null;
        }

        result = env.callMethod(this, "createTestResult", TestRunner.class);
        listener = new TestListenerAdapter(env);
        listenerNeeded = false;
        for (ZPair zpairResult341 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("extensions").value(),
                        env,
                        true)) {
            extension.setObject(ZVal.assign(zpairResult341.getValue()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            extension.getObject(), TestHook.class, "PHPUnit\\Runner\\TestHook"))) {
                env.callMethod(
                        listener,
                        new RuntimeArgsWithReferences().add(0, extension),
                        "add",
                        TestRunner.class,
                        extension.getObject());
                listenerNeeded = true;
            }
        }

        if (ZVal.isTrue(listenerNeeded)) {
            env.callMethod(result, "addListener", TestRunner.class, listener);
        }

        listener = null;
        listenerNeeded = null;
        if (!ZVal.isTrue(ZVal.getElement(arguments.getObject(), "convertErrorsToExceptions"))) {
            env.callMethod(result, "convertErrorsToExceptions", TestRunner.class, false);
        }

        if (!ZVal.isTrue(
                ZVal.getElement(arguments.getObject(), "convertDeprecationsToExceptions"))) {
            env.getRequestStaticProperties(Deprecated.RequestStaticProperties.class).enabled =
                    false;
        }

        if (!ZVal.isTrue(ZVal.getElement(arguments.getObject(), "convertNoticesToExceptions"))) {
            env.getRequestStaticProperties(Notice.RequestStaticProperties.class).enabled = false;
        }

        if (!ZVal.isTrue(ZVal.getElement(arguments.getObject(), "convertWarningsToExceptions"))) {
            env.getRequestStaticProperties(Warning.RequestStaticProperties.class).enabled = false;
        }

        if (ZVal.isTrue(ZVal.getElement(arguments.getObject(), "stopOnError"))) {
            env.callMethod(result, "stopOnError", TestRunner.class, true);
        }

        if (ZVal.isTrue(ZVal.getElement(arguments.getObject(), "stopOnFailure"))) {
            env.callMethod(result, "stopOnFailure", TestRunner.class, true);
        }

        if (ZVal.isTrue(ZVal.getElement(arguments.getObject(), "stopOnWarning"))) {
            env.callMethod(result, "stopOnWarning", TestRunner.class, true);
        }

        if (ZVal.isTrue(ZVal.getElement(arguments.getObject(), "stopOnIncomplete"))) {
            env.callMethod(result, "stopOnIncomplete", TestRunner.class, true);
        }

        if (ZVal.isTrue(ZVal.getElement(arguments.getObject(), "stopOnRisky"))) {
            env.callMethod(result, "stopOnRisky", TestRunner.class, true);
        }

        if (ZVal.isTrue(ZVal.getElement(arguments.getObject(), "stopOnSkipped"))) {
            env.callMethod(result, "stopOnSkipped", TestRunner.class, true);
        }

        if (ZVal.isTrue(
                ZVal.getElement(
                        arguments.getObject(),
                        "registerMockObjectsFromTestArgumentsRecursively"))) {
            env.callMethod(
                    result,
                    "setRegisterMockObjectsFromTestArgumentsRecursively",
                    TestRunner.class,
                    true);
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("printer").value(),
                "===",
                ZVal.getNull())) {
            if (ZVal.toBool(ZVal.isset(ZVal.getElement(arguments.getObject(), "printer")))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    ZVal.getElement(arguments.getObject(), "printer"),
                                    Printer.class,
                                    "PHPUnit\\Util\\Printer"))) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("printer")
                        .set(ZVal.getElement(arguments.getObject(), "printer"));

            } else {
                printerClass = ZVal.assign(ResultPrinter.CONST_class);
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.isset(
                                                        ZVal.getElement(
                                                                arguments.getObject(), "printer")))
                                        && ZVal.toBool(
                                                function_is_string
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.getElement(
                                                                        arguments.getObject(),
                                                                        "printer"))
                                                        .value()))
                        && ZVal.toBool(
                                function_class_exists
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.getElement(arguments.getObject(), "printer"),
                                                false)
                                        .value())) {
                    _pClass =
                            new ReflectionClass(
                                    env, ZVal.getElement(arguments.getObject(), "printer"));
                    if (ZVal.isTrue(
                            env.callMethod(
                                    _pClass,
                                    "isSubclassOf",
                                    TestRunner.class,
                                    ResultPrinter.CONST_class))) {
                        printerClass =
                                ZVal.assign(ZVal.getElement(arguments.getObject(), "printer"));
                    }
                }

                toObjectR(this)
                        .accessProp(this, env)
                        .name("printer")
                        .set(
                                env.createNew(
                                        printerClass,
                                        ZVal.toBool(
                                                                ZVal.isset(
                                                                        ZVal.getElement(
                                                                                arguments
                                                                                        .getObject(),
                                                                                "stderr")))
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        ZVal.getElement(
                                                                                arguments
                                                                                        .getObject(),
                                                                                "stderr"),
                                                                        "===",
                                                                        true))
                                                ? "php://stderr"
                                                : ZVal.getNull(),
                                        ZVal.getElement(arguments.getObject(), "verbose"),
                                        ZVal.getElement(arguments.getObject(), "colors"),
                                        ZVal.getElement(arguments.getObject(), "debug"),
                                        ZVal.getElement(arguments.getObject(), "columns"),
                                        ZVal.getElement(arguments.getObject(), "reverseList")));
            }
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("printer").value(),
                "write",
                TestRunner.class,
                toStringR(Version.runtimeStaticObject.getVersionString(env), env) + "\n");
        env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .TextUI
                                        .classes
                                        .TestRunner
                                        .RequestStaticProperties
                                        .class)
                        .versionStringPrinted =
                true;
        if (ZVal.isTrue(ZVal.getElement(arguments.getObject(), "verbose"))) {
            runtime =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("runtime").value(),
                            "getNameWithVersion",
                            TestRunner.class);
            if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("runtime").value(),
                            "hasXdebug",
                            TestRunner.class))) {
                runtime =
                        toStringR(runtime, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        " with Xdebug %s",
                                                        NamespaceGlobal.phpversion
                                                                .env(env)
                                                                .call("xdebug")
                                                                .value())
                                                .value(),
                                        env);
            }

            env.callMethod(this, "writeMessage", TestRunner.class, "Runtime", runtime);
            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "configuration"))) {
                env.callMethod(
                        this,
                        "writeMessage",
                        TestRunner.class,
                        "Configuration",
                        env.callMethod(
                                ZVal.getElement(arguments.getObject(), "configuration"),
                                "getFilename",
                                TestRunner.class));
            }

            for (ZPair zpairResult342 :
                    ZVal.getIterable(
                            ZVal.getElement(arguments.getObject(), "loadedExtensions"),
                            env,
                            true)) {
                extension.setObject(ZVal.assign(zpairResult342.getValue()));
                env.callMethod(
                        this, "writeMessage", TestRunner.class, "Extension", extension.getObject());
            }

            for (ZPair zpairResult343 :
                    ZVal.getIterable(
                            ZVal.getElement(arguments.getObject(), "notLoadedExtensions"),
                            env,
                            true)) {
                extension.setObject(ZVal.assign(zpairResult343.getValue()));
                env.callMethod(
                        this, "writeMessage", TestRunner.class, "Extension", extension.getObject());
            }
        }

        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("runtime").value(),
                        "discardsComments",
                        TestRunner.class))) {
            env.callMethod(
                    this,
                    "writeMessage",
                    TestRunner.class,
                    "Warning",
                    "opcache.save_comments=0 set; annotations will not work");
        }

        for (ZPair zpairResult344 :
                ZVal.getIterable(ZVal.getElement(arguments.getObject(), "listeners"), env, true)) {
            listener = ZVal.assign(zpairResult344.getValue());
            env.callMethod(result, "addListener", TestRunner.class, listener);
        }

        env.callMethod(
                result,
                "addListener",
                TestRunner.class,
                toObjectR(this).accessProp(this, env).name("printer").value());
        codeCoverageReports = 0;
        if (!ZVal.isset(ZVal.getElement(arguments.getObject(), "noLogging"))) {
            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "testdoxHTMLFile"))) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new HtmlResultPrinter(
                                env,
                                ZVal.getElement(arguments.getObject(), "testdoxHTMLFile"),
                                ZVal.getElement(arguments.getObject(), "testdoxGroups"),
                                ZVal.getElement(arguments.getObject(), "testdoxExcludeGroups")));
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "testdoxTextFile"))) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new TextResultPrinter(
                                env,
                                ZVal.getElement(arguments.getObject(), "testdoxTextFile"),
                                ZVal.getElement(arguments.getObject(), "testdoxGroups"),
                                ZVal.getElement(arguments.getObject(), "testdoxExcludeGroups")));
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "testdoxXMLFile"))) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new XmlResultPrinter(
                                env, ZVal.getElement(arguments.getObject(), "testdoxXMLFile")));
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "teamcityLogfile"))) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new TeamCity(
                                env, ZVal.getElement(arguments.getObject(), "teamcityLogfile")));
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "junitLogfile"))) {
                env.callMethod(
                        result,
                        "addListener",
                        TestRunner.class,
                        new JUnit(
                                env,
                                ZVal.getElement(arguments.getObject(), "junitLogfile"),
                                ZVal.getElement(arguments.getObject(), "reportUselessTests")));
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageClover"))) {
                codeCoverageReports = ZVal.increment(codeCoverageReports);
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageCrap4J"))) {
                codeCoverageReports = ZVal.increment(codeCoverageReports);
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageHtml"))) {
                codeCoverageReports = ZVal.increment(codeCoverageReports);
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coveragePHP"))) {
                codeCoverageReports = ZVal.increment(codeCoverageReports);
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageText"))) {
                codeCoverageReports = ZVal.increment(codeCoverageReports);
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageXml"))) {
                codeCoverageReports = ZVal.increment(codeCoverageReports);
            }
        }

        if (ZVal.isset(ZVal.getElement(arguments.getObject(), "noCoverage"))) {
            codeCoverageReports = 0;
        }

        if (ZVal.toBool(ZVal.isGreaterThan(codeCoverageReports, '>', 0))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("runtime")
                                                .value(),
                                        "canCollectCodeCoverage",
                                        TestRunner.class)))) {
            env.callMethod(
                    this,
                    "writeMessage",
                    TestRunner.class,
                    "Error",
                    "No code coverage driver is available");
            codeCoverageReports = 0;
        }

        if (ZVal.isGreaterThan(codeCoverageReports, '>', 0)) {
            codeCoverage =
                    new CodeCoverage(
                            env,
                            ZVal.getNull(),
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("codeCoverageFilter")
                                    .value());
            env.callMethod(
                    codeCoverage,
                    "setUnintentionallyCoveredSubclassesWhitelist",
                    TestRunner.class,
                    ZVal.newArray(new ZPair(0, Comparator.CONST_class)));
            env.callMethod(
                    codeCoverage,
                    "setCheckForUnintentionallyCoveredCode",
                    TestRunner.class,
                    ZVal.getElement(arguments.getObject(), "strictCoverage"));
            env.callMethod(
                    codeCoverage,
                    "setCheckForMissingCoversAnnotation",
                    TestRunner.class,
                    ZVal.getElement(arguments.getObject(), "strictCoverage"));
            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "forceCoversAnnotation"))) {
                env.callMethod(
                        codeCoverage,
                        "setForceCoversAnnotation",
                        TestRunner.class,
                        ZVal.getElement(arguments.getObject(), "forceCoversAnnotation"));
            }

            if (ZVal.isset(
                    ZVal.getElement(
                            arguments.getObject(), "ignoreDeprecatedCodeUnitsFromCodeCoverage"))) {
                env.callMethod(
                        codeCoverage,
                        "setIgnoreDeprecatedCode",
                        TestRunner.class,
                        ZVal.getElement(
                                arguments.getObject(),
                                "ignoreDeprecatedCodeUnitsFromCodeCoverage"));
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "disableCodeCoverageIgnore"))) {
                env.callMethod(codeCoverage, "setDisableIgnoredLines", TestRunner.class, true);
            }

            whitelistFromConfigurationFile = false;
            whitelistFromOption = false;
            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "whitelist"))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("codeCoverageFilter").value(),
                        "addDirectoryToWhitelist",
                        TestRunner.class,
                        ZVal.getElement(arguments.getObject(), "whitelist"));
                whitelistFromOption = true;
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "configuration"))) {
                filterConfiguration =
                        env.callMethod(
                                ZVal.getElement(arguments.getObject(), "configuration"),
                                "getFilterConfiguration",
                                TestRunner.class);
                if (!ZVal.isEmpty(ZVal.getElement(filterConfiguration, "whitelist"))) {
                    whitelistFromConfigurationFile = true;
                }

                if (!ZVal.isEmpty(ZVal.getElement(filterConfiguration, "whitelist"))) {
                    env.callMethod(
                            codeCoverage,
                            "setAddUncoveredFilesFromWhitelist",
                            TestRunner.class,
                            ZVal.getElementRecursive(
                                    filterConfiguration,
                                    "whitelist",
                                    "addUncoveredFilesFromWhitelist"));
                    env.callMethod(
                            codeCoverage,
                            "setProcessUncoveredFilesFromWhitelist",
                            TestRunner.class,
                            ZVal.getElementRecursive(
                                    filterConfiguration,
                                    "whitelist",
                                    "processUncoveredFilesFromWhitelist"));
                    for (ZPair zpairResult345 :
                            ZVal.getIterable(
                                    ZVal.getElementRecursive(
                                            filterConfiguration,
                                            "whitelist",
                                            "include",
                                            "directory"),
                                    env,
                                    true)) {
                        dir = ZVal.assign(zpairResult345.getValue());
                        env.callMethod(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("codeCoverageFilter")
                                        .value(),
                                "addDirectoryToWhitelist",
                                TestRunner.class,
                                ZVal.getElement(dir, "path"),
                                ZVal.getElement(dir, "suffix"),
                                ZVal.getElement(dir, "prefix"));
                    }

                    for (ZPair zpairResult346 :
                            ZVal.getIterable(
                                    ZVal.getElementRecursive(
                                            filterConfiguration, "whitelist", "include", "file"),
                                    env,
                                    true)) {
                        file = ZVal.assign(zpairResult346.getValue());
                        env.callMethod(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("codeCoverageFilter")
                                        .value(),
                                "addFileToWhitelist",
                                TestRunner.class,
                                file);
                    }

                    for (ZPair zpairResult347 :
                            ZVal.getIterable(
                                    ZVal.getElementRecursive(
                                            filterConfiguration,
                                            "whitelist",
                                            "exclude",
                                            "directory"),
                                    env,
                                    true)) {
                        dir = ZVal.assign(zpairResult347.getValue());
                        env.callMethod(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("codeCoverageFilter")
                                        .value(),
                                "removeDirectoryFromWhitelist",
                                TestRunner.class,
                                ZVal.getElement(dir, "path"),
                                ZVal.getElement(dir, "suffix"),
                                ZVal.getElement(dir, "prefix"));
                    }

                    for (ZPair zpairResult348 :
                            ZVal.getIterable(
                                    ZVal.getElementRecursive(
                                            filterConfiguration, "whitelist", "exclude", "file"),
                                    env,
                                    true)) {
                        file = ZVal.assign(zpairResult348.getValue());
                        env.callMethod(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("codeCoverageFilter")
                                        .value(),
                                "removeFileFromWhitelist",
                                TestRunner.class,
                                file);
                    }
                }
            }

            if (ZVal.toBool(ZVal.isset(codeCoverage))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("codeCoverageFilter")
                                                    .value(),
                                            "hasWhitelist",
                                            TestRunner.class)))) {
                if (ZVal.toBool(!ZVal.isTrue(whitelistFromConfigurationFile))
                        && ZVal.toBool(!ZVal.isTrue(whitelistFromOption))) {
                    env.callMethod(
                            this,
                            "writeMessage",
                            TestRunner.class,
                            "Error",
                            "No whitelist is configured, no code coverage will be generated.");

                } else {
                    env.callMethod(
                            this,
                            "writeMessage",
                            TestRunner.class,
                            "Error",
                            "Incorrect whitelist config, no code coverage will be generated.");
                }

                codeCoverageReports = 0;
                codeCoverage = null;
            }
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("printer").value(),
                "write",
                TestRunner.class,
                "\n");
        if (ZVal.isset(codeCoverage)) {
            env.callMethod(result, "setCodeCoverage", TestRunner.class, codeCoverage);
            if (ZVal.toBool(ZVal.isGreaterThan(codeCoverageReports, '>', 1))
                    && ZVal.toBool(
                            ZVal.isset(ZVal.getElement(arguments.getObject(), "cacheTokens")))) {
                env.callMethod(
                        codeCoverage,
                        "setCacheTokens",
                        TestRunner.class,
                        ZVal.getElement(arguments.getObject(), "cacheTokens"));
            }
        }

        env.callMethod(
                result,
                "beStrictAboutTestsThatDoNotTestAnything",
                TestRunner.class,
                ZVal.getElement(arguments.getObject(), "reportUselessTests"));
        env.callMethod(
                result,
                "beStrictAboutOutputDuringTests",
                TestRunner.class,
                ZVal.getElement(arguments.getObject(), "disallowTestOutput"));
        env.callMethod(
                result,
                "beStrictAboutTodoAnnotatedTests",
                TestRunner.class,
                ZVal.getElement(arguments.getObject(), "disallowTodoAnnotatedTests"));
        env.callMethod(
                result,
                "beStrictAboutResourceUsageDuringSmallTests",
                TestRunner.class,
                ZVal.getElement(
                        arguments.getObject(), "beStrictAboutResourceUsageDuringSmallTests"));
        env.callMethod(
                result,
                "enforceTimeLimit",
                TestRunner.class,
                ZVal.getElement(arguments.getObject(), "enforceTimeLimit"));
        env.callMethod(
                result,
                "setTimeoutForSmallTests",
                TestRunner.class,
                ZVal.getElement(arguments.getObject(), "timeoutForSmallTests"));
        env.callMethod(
                result,
                "setTimeoutForMediumTests",
                TestRunner.class,
                ZVal.getElement(arguments.getObject(), "timeoutForMediumTests"));
        env.callMethod(
                result,
                "setTimeoutForLargeTests",
                TestRunner.class,
                ZVal.getElement(arguments.getObject(), "timeoutForLargeTests"));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(suite, TestSuite.class, "PHPUnit\\Framework\\TestSuite"))) {
            env.callMethod(
                    suite,
                    "setRunTestInSeparateProcess",
                    TestRunner.class,
                    ZVal.getElement(arguments.getObject(), "processIsolation"));
        }

        for (ZPair zpairResult349 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("extensions").value(),
                        env,
                        true)) {
            extension.setObject(ZVal.assign(zpairResult349.getValue()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            extension.getObject(),
                            BeforeFirstTestHook.class,
                            "PHPUnit\\Runner\\BeforeFirstTestHook"))) {
                env.callMethod(extension.getObject(), "executeBeforeFirstTest", TestRunner.class);
            }
        }

        env.callMethod(suite, "run", TestRunner.class, result);
        for (ZPair zpairResult350 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("extensions").value(),
                        env,
                        true)) {
            extension.setObject(ZVal.assign(zpairResult350.getValue()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            extension.getObject(),
                            AfterLastTestHook.class,
                            "PHPUnit\\Runner\\AfterLastTestHook"))) {
                env.callMethod(extension.getObject(), "executeAfterLastTest", TestRunner.class);
            }
        }

        env.callMethod(result, "flushListeners", TestRunner.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(this).accessProp(this, env).name("printer").value(),
                        ResultPrinter.class,
                        "PHPUnit\\TextUI\\ResultPrinter"))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("printer").value(),
                    "printResult",
                    TestRunner.class,
                    result);
        }

        if (ZVal.isset(codeCoverage)) {
            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageClover"))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("printer").value(),
                        "write",
                        TestRunner.class,
                        "\nGenerating code coverage report in Clover XML format ...");
                try {
                    writer = new Clover(env);
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            ZVal.getElement(arguments.getObject(), "coverageClover"));
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("printer").value(),
                            "write",
                            TestRunner.class,
                            " done\n");
                    writer = null;
                } catch (ConvertedException convertedException55) {
                    if (convertedException55.instanceOf(
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
                        e = convertedException55.getObject();
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("printer").value(),
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException55;
                    }
                }
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageCrap4J"))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("printer").value(),
                        "write",
                        TestRunner.class,
                        "\nGenerating Crap4J report XML file ...");
                try {
                    writer =
                            new Crap4j(
                                    env, ZVal.getElement(arguments.getObject(), "crap4jThreshold"));
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            ZVal.getElement(arguments.getObject(), "coverageCrap4J"));
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("printer").value(),
                            "write",
                            TestRunner.class,
                            " done\n");
                    writer = null;
                } catch (ConvertedException convertedException56) {
                    if (convertedException56.instanceOf(
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
                        e = convertedException56.getObject();
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("printer").value(),
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException56;
                    }
                }
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageHtml"))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("printer").value(),
                        "write",
                        TestRunner.class,
                        "\nGenerating code coverage report in HTML format ...");
                try {
                    writer =
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .namespaces
                                    .Report
                                    .namespaces
                                    .Html
                                    .classes
                                    .Facade(
                                    env,
                                    ZVal.getElement(arguments.getObject(), "reportLowUpperBound"),
                                    ZVal.getElement(arguments.getObject(), "reportHighLowerBound"),
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    " and <a href=\"https://phpunit.de/\">PHPUnit %s</a>",
                                                    Version.runtimeStaticObject.id(env))
                                            .value());
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            ZVal.getElement(arguments.getObject(), "coverageHtml"));
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("printer").value(),
                            "write",
                            TestRunner.class,
                            " done\n");
                    writer = null;
                } catch (ConvertedException convertedException57) {
                    if (convertedException57.instanceOf(
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
                        e = convertedException57.getObject();
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("printer").value(),
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException57;
                    }
                }
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coveragePHP"))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("printer").value(),
                        "write",
                        TestRunner.class,
                        "\nGenerating code coverage report in PHP format ...");
                try {
                    writer = new PHP(env);
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            ZVal.getElement(arguments.getObject(), "coveragePHP"));
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("printer").value(),
                            "write",
                            TestRunner.class,
                            " done\n");
                    writer = null;
                } catch (ConvertedException convertedException58) {
                    if (convertedException58.instanceOf(
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
                        e = convertedException58.getObject();
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("printer").value(),
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException58;
                    }
                }
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageText"))) {
                if (ZVal.equalityCheck(
                        ZVal.getElement(arguments.getObject(), "coverageText"), "php://stdout")) {
                    outputStream =
                            ZVal.assign(
                                    toObjectR(this).accessProp(this, env).name("printer").value());
                    colors =
                            ZVal.toBool(ZVal.getElement(arguments.getObject(), "colors"))
                                    && ZVal.toBool(
                                            ZVal.notEqualityCheck(
                                                    ZVal.getElement(
                                                            arguments.getObject(), "colors"),
                                                    ResultPrinter.CONST_COLOR_NEVER));

                } else {
                    outputStream =
                            new Printer(
                                    env, ZVal.getElement(arguments.getObject(), "coverageText"));
                    colors = false;
                }

                processor =
                        new Text(
                                env,
                                ZVal.getElement(arguments.getObject(), "reportLowUpperBound"),
                                ZVal.getElement(arguments.getObject(), "reportHighLowerBound"),
                                ZVal.getElement(
                                        arguments.getObject(), "coverageTextShowUncoveredFiles"),
                                ZVal.getElement(
                                        arguments.getObject(), "coverageTextShowOnlySummary"));
                env.callMethod(
                        outputStream,
                        "write",
                        TestRunner.class,
                        env.callMethod(
                                processor, "process", TestRunner.class, codeCoverage, colors));
            }

            if (ZVal.isset(ZVal.getElement(arguments.getObject(), "coverageXml"))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("printer").value(),
                        "write",
                        TestRunner.class,
                        "\nGenerating code coverage report in PHPUnit XML format ...");
                try {
                    writer =
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .namespaces
                                    .Report
                                    .namespaces
                                    .Xml
                                    .classes
                                    .Facade(env, Version.runtimeStaticObject.id(env));
                    env.callMethod(
                            writer,
                            "process",
                            TestRunner.class,
                            codeCoverage,
                            ZVal.getElement(arguments.getObject(), "coverageXml"));
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("printer").value(),
                            "write",
                            TestRunner.class,
                            " done\n");
                    writer = null;
                } catch (ConvertedException convertedException59) {
                    if (convertedException59.instanceOf(
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
                        e = convertedException59.getObject();
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("printer").value(),
                                "write",
                                TestRunner.class,
                                " failed\n"
                                        + toStringR(
                                                env.callMethod(e, "getMessage", TestRunner.class),
                                                env)
                                        + "\n");
                    } else {
                        throw convertedException59;
                    }
                }
            }
        }

        if (ZVal.isTrue(exit)) {
            if (ZVal.isTrue(env.callMethod(result, "wasSuccessful", TestRunner.class))) {
                if (ZVal.toBool(ZVal.getElement(arguments.getObject(), "failOnRisky"))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(result, "allHarmless", TestRunner.class)))) {
                    env.exit(CONST_FAILURE_EXIT);
                }

                if (ZVal.toBool(ZVal.getElement(arguments.getObject(), "failOnWarning"))
                        && ZVal.toBool(
                                ZVal.isGreaterThan(
                                        env.callMethod(result, "warningCount", TestRunner.class),
                                        '>',
                                        0))) {
                    env.exit(CONST_FAILURE_EXIT);
                }

                env.exit(CONST_SUCCESS_EXIT);
            }

            if (ZVal.isGreaterThan(
                    env.callMethod(result, "errorCount", TestRunner.class), '>', 0)) {
                env.exit(CONST_EXCEPTION_EXIT);
            }

            if (ZVal.isGreaterThan(
                    env.callMethod(result, "failureCount", TestRunner.class), '>', 0)) {
                env.exit(CONST_FAILURE_EXIT);
            }
        }

        return env.returnWithGlobals(result, "GLOBALS", GLOBALS);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resultPrinter",
        typeHint = "PHPUnit\\TextUI\\ResultPrinter"
    )
    public Object setPrinter(RuntimeEnv env, Object... args) {
        Object resultPrinter = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("printer").set(resultPrinter);
        return null;
    }

    @ConvertedMethod
    public Object getLoader(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("loader").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("loader")
                    .set(new StandardTestSuiteLoader(env));
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("loader").value());
    }

    @ConvertedMethod
    protected Object createTestResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(new TestResult(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    protected Object runFailed(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        env.callMethod(
                this, "write", TestRunner.class, toStringR(message, env) + toStringR("\n", env));
        env.exit(CONST_FAILURE_EXIT);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buffer", typeHint = "string")
    protected Object write(RuntimeEnv env, Object... args) {
        Object buffer = assignParameter(args, 0, null);
        if (ZVal.toBool(ZVal.notEqualityCheck("cli", "cli"))
                && ZVal.toBool(ZVal.notEqualityCheck("cli", "phpdbg"))) {
            buffer = NamespaceGlobal.htmlspecialchars.env(env).call(buffer).value();
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("printer").value(),
                "!==",
                ZVal.getNull())) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("printer").value(),
                    "write",
                    TestRunner.class,
                    buffer);

        } else {
            env.echo(buffer);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    protected Object handleConfiguration(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/TextUI")
                        .setFile("/vendor/phpunit/phpunit/src/TextUI/TestRunner.php");
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope14 scope = new Scope14();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            scope.arguments = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
            if (ZVal.isNull(scope.arguments)) {
                scope.arguments.setObject(ZVal.newArray());
            }
            scope.extensionClass = null;
            scope.phpunitConfiguration = ZVal.newArray();
            scope.extension = ZVal.newArray();
            scope.testdoxGroupConfiguration = ZVal.newArray();
            scope.listener = ZVal.newArray();
            scope.groupCliArgs = null;
            scope.listenerClass = null;
            scope.loggingConfiguration = ZVal.newArray();
            scope.groupConfiguration = ZVal.newArray();
            if (ZVal.toBool(
                            ZVal.isset(
                                    ZVal.getElement(scope.arguments.getObject(), "configuration")))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            ZVal.getElement(
                                                    scope.arguments.getObject(), "configuration"),
                                            Configuration.class,
                                            "PHPUnit\\Util\\Configuration")))) {
                ZVal.putArrayElement(
                        scope.arguments.getObject(),
                        "configuration",
                        Configuration.runtimeStaticObject.getInstance(
                                env,
                                ZVal.getElement(scope.arguments.getObject(), "configuration")));
            }

            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "debug",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "debug"))
                            ? ZVal.getElement(scope.arguments.getObject(), "debug")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "filter",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "filter"))
                            ? ZVal.getElement(scope.arguments.getObject(), "filter")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "listeners",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "listeners"))
                            ? ZVal.getElement(scope.arguments.getObject(), "listeners")
                            : ZVal.newArray());
            if (ZVal.isset(ZVal.getElement(scope.arguments.getObject(), "configuration"))) {
                env.callMethod(
                        ZVal.getElement(scope.arguments.getObject(), "configuration"),
                        "handlePHPConfiguration",
                        TestRunner.class);
                scope.phpunitConfiguration =
                        env.callMethod(
                                ZVal.getElement(scope.arguments.getObject(), "configuration"),
                                "getPHPUnitConfiguration",
                                TestRunner.class);
                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "backupGlobals")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "backupGlobals")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "backupGlobals",
                            ZVal.getElement(scope.phpunitConfiguration, "backupGlobals"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "backupStaticAttributes")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "backupStaticAttributes")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "backupStaticAttributes",
                            ZVal.getElement(scope.phpunitConfiguration, "backupStaticAttributes"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "beStrictAboutChangesToGlobalState")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "beStrictAboutChangesToGlobalState")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "beStrictAboutChangesToGlobalState",
                            ZVal.getElement(
                                    scope.phpunitConfiguration,
                                    "beStrictAboutChangesToGlobalState"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(scope.phpunitConfiguration, "bootstrap")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "bootstrap")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "bootstrap",
                            ZVal.getElement(scope.phpunitConfiguration, "bootstrap"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(scope.phpunitConfiguration, "cacheTokens")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "cacheTokens")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "cacheTokens",
                            ZVal.getElement(scope.phpunitConfiguration, "cacheTokens"));
                }

                if (ZVal.toBool(ZVal.isset(ZVal.getElement(scope.phpunitConfiguration, "colors")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(scope.arguments.getObject(), "colors")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "colors",
                            ZVal.getElement(scope.phpunitConfiguration, "colors"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "convertDeprecationsToExceptions")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "convertDeprecationsToExceptions")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "convertDeprecationsToExceptions",
                            ZVal.getElement(
                                    scope.phpunitConfiguration, "convertDeprecationsToExceptions"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "convertErrorsToExceptions")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "convertErrorsToExceptions")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "convertErrorsToExceptions",
                            ZVal.getElement(
                                    scope.phpunitConfiguration, "convertErrorsToExceptions"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "convertNoticesToExceptions")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "convertNoticesToExceptions")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "convertNoticesToExceptions",
                            ZVal.getElement(
                                    scope.phpunitConfiguration, "convertNoticesToExceptions"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "convertWarningsToExceptions")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "convertWarningsToExceptions")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "convertWarningsToExceptions",
                            ZVal.getElement(
                                    scope.phpunitConfiguration, "convertWarningsToExceptions"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "processIsolation")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "processIsolation")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "processIsolation",
                            ZVal.getElement(scope.phpunitConfiguration, "processIsolation"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(scope.phpunitConfiguration, "stopOnError")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "stopOnError")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "stopOnError",
                            ZVal.getElement(scope.phpunitConfiguration, "stopOnError"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "stopOnFailure")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "stopOnFailure")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "stopOnFailure",
                            ZVal.getElement(scope.phpunitConfiguration, "stopOnFailure"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "stopOnWarning")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "stopOnWarning")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "stopOnWarning",
                            ZVal.getElement(scope.phpunitConfiguration, "stopOnWarning"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "stopOnIncomplete")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "stopOnIncomplete")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "stopOnIncomplete",
                            ZVal.getElement(scope.phpunitConfiguration, "stopOnIncomplete"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(scope.phpunitConfiguration, "stopOnRisky")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "stopOnRisky")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "stopOnRisky",
                            ZVal.getElement(scope.phpunitConfiguration, "stopOnRisky"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "stopOnSkipped")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "stopOnSkipped")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "stopOnSkipped",
                            ZVal.getElement(scope.phpunitConfiguration, "stopOnSkipped"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "failOnWarning")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "failOnWarning")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "failOnWarning",
                            ZVal.getElement(scope.phpunitConfiguration, "failOnWarning"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(scope.phpunitConfiguration, "failOnRisky")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "failOnRisky")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "failOnRisky",
                            ZVal.getElement(scope.phpunitConfiguration, "failOnRisky"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "timeoutForSmallTests")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "timeoutForSmallTests")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "timeoutForSmallTests",
                            ZVal.getElement(scope.phpunitConfiguration, "timeoutForSmallTests"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "timeoutForMediumTests")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "timeoutForMediumTests")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "timeoutForMediumTests",
                            ZVal.getElement(scope.phpunitConfiguration, "timeoutForMediumTests"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "timeoutForLargeTests")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "timeoutForLargeTests")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "timeoutForLargeTests",
                            ZVal.getElement(scope.phpunitConfiguration, "timeoutForLargeTests"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "reportUselessTests")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "reportUselessTests")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "reportUselessTests",
                            ZVal.getElement(scope.phpunitConfiguration, "reportUselessTests"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "strictCoverage")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "strictCoverage")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "strictCoverage",
                            ZVal.getElement(scope.phpunitConfiguration, "strictCoverage"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "ignoreDeprecatedCodeUnitsFromCodeCoverage")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "ignoreDeprecatedCodeUnitsFromCodeCoverage")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "ignoreDeprecatedCodeUnitsFromCodeCoverage",
                            ZVal.getElement(
                                    scope.phpunitConfiguration,
                                    "ignoreDeprecatedCodeUnitsFromCodeCoverage"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "disallowTestOutput")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "disallowTestOutput")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "disallowTestOutput",
                            ZVal.getElement(scope.phpunitConfiguration, "disallowTestOutput"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "enforceTimeLimit")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "enforceTimeLimit")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "enforceTimeLimit",
                            ZVal.getElement(scope.phpunitConfiguration, "enforceTimeLimit"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "disallowTodoAnnotatedTests")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "disallowTodoAnnotatedTests")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "disallowTodoAnnotatedTests",
                            ZVal.getElement(
                                    scope.phpunitConfiguration, "disallowTodoAnnotatedTests"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "beStrictAboutResourceUsageDuringSmallTests")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "beStrictAboutResourceUsageDuringSmallTests")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "beStrictAboutResourceUsageDuringSmallTests",
                            ZVal.getElement(
                                    scope.phpunitConfiguration,
                                    "beStrictAboutResourceUsageDuringSmallTests"));
                }

                if (ZVal.toBool(ZVal.isset(ZVal.getElement(scope.phpunitConfiguration, "verbose")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(scope.arguments.getObject(), "verbose")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "verbose",
                            ZVal.getElement(scope.phpunitConfiguration, "verbose"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration, "reverseDefectList")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "reverseList")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "reverseList",
                            ZVal.getElement(scope.phpunitConfiguration, "reverseDefectList"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "forceCoversAnnotation")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "forceCoversAnnotation")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "forceCoversAnnotation",
                            ZVal.getElement(scope.phpunitConfiguration, "forceCoversAnnotation"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "disableCodeCoverageIgnore")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "disableCodeCoverageIgnore")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "disableCodeCoverageIgnore",
                            ZVal.getElement(
                                    scope.phpunitConfiguration, "disableCodeCoverageIgnore"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.phpunitConfiguration,
                                                "registerMockObjectsFromTestArgumentsRecursively")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "registerMockObjectsFromTestArgumentsRecursively")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "registerMockObjectsFromTestArgumentsRecursively",
                            ZVal.getElement(
                                    scope.phpunitConfiguration,
                                    "registerMockObjectsFromTestArgumentsRecursively"));
                }

                scope.groupCliArgs = ZVal.newArray();
                if (!ZVal.isEmpty(ZVal.getElement(scope.arguments.getObject(), "groups"))) {
                    scope.groupCliArgs =
                            ZVal.assign(ZVal.getElement(scope.arguments.getObject(), "groups"));
                }

                scope.groupConfiguration =
                        env.callMethod(
                                ZVal.getElement(scope.arguments.getObject(), "configuration"),
                                "getGroupConfiguration",
                                TestRunner.class);
                if (ZVal.toBool(!ZVal.isEmpty(ZVal.getElement(scope.groupConfiguration, "include")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(scope.arguments.getObject(), "groups")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "groups",
                            ZVal.getElement(scope.groupConfiguration, "include"));
                }

                if (ZVal.toBool(!ZVal.isEmpty(ZVal.getElement(scope.groupConfiguration, "exclude")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "excludeGroups")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "excludeGroups",
                            CRArrayF.array_diff
                                    .env(env)
                                    .call(
                                            ZVal.getElement(scope.groupConfiguration, "exclude"),
                                            scope.groupCliArgs)
                                    .value());
                }

                for (ZPair zpairResult351 :
                        ZVal.getIterable(
                                env.callMethod(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "configuration"),
                                        "getExtensionConfiguration",
                                        TestRunner.class),
                                env,
                                true)) {
                    scope.extension = ZVal.assign(zpairResult351.getValue());
                    if (ZVal.toBool(
                                    !function_class_exists
                                            .f
                                            .env(env)
                                            .call(ZVal.getElement(scope.extension, "class"), false)
                                            .getBool())
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            ZVal.getElement(scope.extension, "file"), "!==", ""))) {
                        env.include(
                                toStringR(ZVal.getElement(scope.extension, "file"), env),
                                stack,
                                runtimeConverterFunctionClassConstants,
                                true,
                                true);
                    }

                    if (!function_class_exists
                            .f
                            .env(env)
                            .call(ZVal.getElement(scope.extension, "class"))
                            .getBool()) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Class \"%s\" does not exist",
                                                        ZVal.getElement(scope.extension, "class"))
                                                .value()));
                    }

                    scope.extensionClass =
                            new ReflectionClass(env, ZVal.getElement(scope.extension, "class"));
                    if (!ZVal.isTrue(
                            env.callMethod(
                                    scope.extensionClass,
                                    "implementsInterface",
                                    TestRunner.class,
                                    Hook.CONST_class))) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Class \"%s\" does not implement a PHPUnit\\Runner\\Hook interface",
                                                        ZVal.getElement(scope.extension, "class"))
                                                .value()));
                    }

                    ZVal.addToArray(
                            toObjectR(scope._thisVarAlias)
                                    .accessProp(this, env)
                                    .name("extensions")
                                    .value(),
                            env.callMethod(scope.extensionClass, "newInstance", TestRunner.class));
                }

                for (ZPair zpairResult352 :
                        ZVal.getIterable(
                                env.callMethod(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "configuration"),
                                        "getListenerConfiguration",
                                        TestRunner.class),
                                env,
                                true)) {
                    scope.listener = ZVal.assign(zpairResult352.getValue());
                    if (ZVal.toBool(
                                    !function_class_exists
                                            .f
                                            .env(env)
                                            .call(ZVal.getElement(scope.listener, "class"), false)
                                            .getBool())
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            ZVal.getElement(scope.listener, "file"), "!==", ""))) {
                        env.include(
                                toStringR(ZVal.getElement(scope.listener, "file"), env),
                                stack,
                                runtimeConverterFunctionClassConstants,
                                true,
                                true);
                    }

                    if (!function_class_exists
                            .f
                            .env(env)
                            .call(ZVal.getElement(scope.listener, "class"))
                            .getBool()) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Class \"%s\" does not exist",
                                                        ZVal.getElement(scope.listener, "class"))
                                                .value()));
                    }

                    scope.listenerClass =
                            new ReflectionClass(env, ZVal.getElement(scope.listener, "class"));
                    if (!ZVal.isTrue(
                            env.callMethod(
                                    scope.listenerClass,
                                    "implementsInterface",
                                    TestRunner.class,
                                    TestListener.CONST_class))) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Class \"%s\" does not implement the PHPUnit\\Framework\\TestListener interface",
                                                        ZVal.getElement(scope.listener, "class"))
                                                .value()));
                    }

                    if (ZVal.equalityCheck(
                            CRArrayF.count
                                    .env(env)
                                    .call(ZVal.getElement(scope.listener, "arguments"))
                                    .value(),
                            0)) {
                        scope.listener = env.createNew(ZVal.getElement(scope.listener, "class"));

                    } else {
                        scope.listener =
                                env.callMethod(
                                        scope.listenerClass,
                                        "newInstanceArgs",
                                        TestRunner.class,
                                        ZVal.getElement(scope.listener, "arguments"));
                    }

                    ZVal.setElementRecursive(
                            scope.arguments.getObject(),
                            scope.listener,
                            "listeners",
                            ZVal.addToArray);
                }

                scope.loggingConfiguration =
                        env.callMethod(
                                ZVal.getElement(scope.arguments.getObject(), "configuration"),
                                "getLoggingConfiguration",
                                TestRunner.class);
                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.loggingConfiguration, "coverage-clover")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "coverageClover")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "coverageClover",
                            ZVal.getElement(scope.loggingConfiguration, "coverage-clover"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.loggingConfiguration, "coverage-crap4j")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "coverageCrap4J")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "coverageCrap4J",
                            ZVal.getElement(scope.loggingConfiguration, "coverage-crap4j"));
                    if (ZVal.toBool(
                                    ZVal.isset(
                                            ZVal.getElement(
                                                    scope.loggingConfiguration, "crap4jThreshold")))
                            && ZVal.toBool(
                                    !ZVal.isset(
                                            ZVal.getElement(
                                                    scope.arguments.getObject(),
                                                    "crap4jThreshold")))) {
                        ZVal.putArrayElement(
                                scope.arguments.getObject(),
                                "crap4jThreshold",
                                ZVal.getElement(scope.loggingConfiguration, "crap4jThreshold"));
                    }
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.loggingConfiguration, "coverage-html")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "coverageHtml")))) {
                    if (ZVal.toBool(
                                    ZVal.isset(
                                            ZVal.getElement(
                                                    scope.loggingConfiguration, "lowUpperBound")))
                            && ZVal.toBool(
                                    !ZVal.isset(
                                            ZVal.getElement(
                                                    scope.arguments.getObject(),
                                                    "reportLowUpperBound")))) {
                        ZVal.putArrayElement(
                                scope.arguments.getObject(),
                                "reportLowUpperBound",
                                ZVal.getElement(scope.loggingConfiguration, "lowUpperBound"));
                    }

                    if (ZVal.toBool(
                                    ZVal.isset(
                                            ZVal.getElement(
                                                    scope.loggingConfiguration, "highLowerBound")))
                            && ZVal.toBool(
                                    !ZVal.isset(
                                            ZVal.getElement(
                                                    scope.arguments.getObject(),
                                                    "reportHighLowerBound")))) {
                        ZVal.putArrayElement(
                                scope.arguments.getObject(),
                                "reportHighLowerBound",
                                ZVal.getElement(scope.loggingConfiguration, "highLowerBound"));
                    }

                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "coverageHtml",
                            ZVal.getElement(scope.loggingConfiguration, "coverage-html"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.loggingConfiguration, "coverage-php")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "coveragePHP")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "coveragePHP",
                            ZVal.getElement(scope.loggingConfiguration, "coverage-php"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.loggingConfiguration, "coverage-text")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "coverageText")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "coverageText",
                            ZVal.getElement(scope.loggingConfiguration, "coverage-text"));
                    if (ZVal.isset(
                            ZVal.getElement(
                                    scope.loggingConfiguration,
                                    "coverageTextShowUncoveredFiles"))) {
                        ZVal.putArrayElement(
                                scope.arguments.getObject(),
                                "coverageTextShowUncoveredFiles",
                                ZVal.getElement(
                                        scope.loggingConfiguration,
                                        "coverageTextShowUncoveredFiles"));

                    } else {
                        ZVal.putArrayElement(
                                scope.arguments.getObject(),
                                "coverageTextShowUncoveredFiles",
                                false);
                    }

                    if (ZVal.isset(
                            ZVal.getElement(
                                    scope.loggingConfiguration, "coverageTextShowOnlySummary"))) {
                        ZVal.putArrayElement(
                                scope.arguments.getObject(),
                                "coverageTextShowOnlySummary",
                                ZVal.getElement(
                                        scope.loggingConfiguration, "coverageTextShowOnlySummary"));

                    } else {
                        ZVal.putArrayElement(
                                scope.arguments.getObject(), "coverageTextShowOnlySummary", false);
                    }
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.loggingConfiguration, "coverage-xml")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "coverageXml")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "coverageXml",
                            ZVal.getElement(scope.loggingConfiguration, "coverage-xml"));
                }

                if (ZVal.isset(ZVal.getElement(scope.loggingConfiguration, "plain"))) {
                    ZVal.setElementRecursive(
                            scope.arguments.getObject(),
                            new ResultPrinter(
                                    env,
                                    ZVal.getElement(scope.loggingConfiguration, "plain"),
                                    true),
                            "listeners",
                            ZVal.addToArray);
                }

                if (ZVal.toBool(ZVal.isset(ZVal.getElement(scope.loggingConfiguration, "teamcity")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "teamcityLogfile")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "teamcityLogfile",
                            ZVal.getElement(scope.loggingConfiguration, "teamcity"));
                }

                if (ZVal.toBool(ZVal.isset(ZVal.getElement(scope.loggingConfiguration, "junit")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "junitLogfile")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "junitLogfile",
                            ZVal.getElement(scope.loggingConfiguration, "junit"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.loggingConfiguration, "testdox-html")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "testdoxHTMLFile")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "testdoxHTMLFile",
                            ZVal.getElement(scope.loggingConfiguration, "testdox-html"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.loggingConfiguration, "testdox-text")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "testdoxTextFile")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "testdoxTextFile",
                            ZVal.getElement(scope.loggingConfiguration, "testdox-text"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(scope.loggingConfiguration, "testdox-xml")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "testdoxXMLFile")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "testdoxXMLFile",
                            ZVal.getElement(scope.loggingConfiguration, "testdox-xml"));
                }

                scope.testdoxGroupConfiguration =
                        env.callMethod(
                                ZVal.getElement(scope.arguments.getObject(), "configuration"),
                                "getTestdoxGroupConfiguration",
                                TestRunner.class);
                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.testdoxGroupConfiguration, "include")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(), "testdoxGroups")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "testdoxGroups",
                            ZVal.getElement(scope.testdoxGroupConfiguration, "include"));
                }

                if (ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                scope.testdoxGroupConfiguration, "exclude")))
                        && ZVal.toBool(
                                !ZVal.isset(
                                        ZVal.getElement(
                                                scope.arguments.getObject(),
                                                "testdoxExcludeGroups")))) {
                    ZVal.putArrayElement(
                            scope.arguments.getObject(),
                            "testdoxExcludeGroups",
                            ZVal.getElement(scope.testdoxGroupConfiguration, "exclude"));
                }
            }

            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "addUncoveredFilesFromWhitelist",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "addUncoveredFilesFromWhitelist"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(), "addUncoveredFilesFromWhitelist")
                            : true);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "backupGlobals",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "backupGlobals"))
                            ? ZVal.getElement(scope.arguments.getObject(), "backupGlobals")
                            : ZVal.getNull());
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "backupStaticAttributes",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(), "backupStaticAttributes"))
                            ? ZVal.getElement(scope.arguments.getObject(), "backupStaticAttributes")
                            : ZVal.getNull());
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "beStrictAboutChangesToGlobalState",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "beStrictAboutChangesToGlobalState"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(),
                                    "beStrictAboutChangesToGlobalState")
                            : ZVal.getNull());
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "beStrictAboutResourceUsageDuringSmallTests",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "beStrictAboutResourceUsageDuringSmallTests"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(),
                                    "beStrictAboutResourceUsageDuringSmallTests")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "cacheTokens",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "cacheTokens"))
                            ? ZVal.getElement(scope.arguments.getObject(), "cacheTokens")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "colors",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "colors"))
                            ? ZVal.getElement(scope.arguments.getObject(), "colors")
                            : ResultPrinter.CONST_COLOR_DEFAULT);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "columns",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "columns"))
                            ? ZVal.getElement(scope.arguments.getObject(), "columns")
                            : 80);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "convertDeprecationsToExceptions",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "convertDeprecationsToExceptions"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(), "convertDeprecationsToExceptions")
                            : true);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "convertErrorsToExceptions",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "convertErrorsToExceptions"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(), "convertErrorsToExceptions")
                            : true);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "convertNoticesToExceptions",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "convertNoticesToExceptions"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(), "convertNoticesToExceptions")
                            : true);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "convertWarningsToExceptions",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "convertWarningsToExceptions"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(), "convertWarningsToExceptions")
                            : true);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "crap4jThreshold",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "crap4jThreshold"))
                            ? ZVal.getElement(scope.arguments.getObject(), "crap4jThreshold")
                            : 30);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "disallowTestOutput",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "disallowTestOutput"))
                            ? ZVal.getElement(scope.arguments.getObject(), "disallowTestOutput")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "disallowTodoAnnotatedTests",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "disallowTodoAnnotatedTests"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(), "disallowTodoAnnotatedTests")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "enforceTimeLimit",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "enforceTimeLimit"))
                            ? ZVal.getElement(scope.arguments.getObject(), "enforceTimeLimit")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "excludeGroups",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "excludeGroups"))
                            ? ZVal.getElement(scope.arguments.getObject(), "excludeGroups")
                            : ZVal.newArray());
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "failOnRisky",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "failOnRisky"))
                            ? ZVal.getElement(scope.arguments.getObject(), "failOnRisky")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "failOnWarning",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "failOnWarning"))
                            ? ZVal.getElement(scope.arguments.getObject(), "failOnWarning")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "groups",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "groups"))
                            ? ZVal.getElement(scope.arguments.getObject(), "groups")
                            : ZVal.newArray());
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "processIsolation",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "processIsolation"))
                            ? ZVal.getElement(scope.arguments.getObject(), "processIsolation")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "processUncoveredFilesFromWhitelist",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "processUncoveredFilesFromWhitelist"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(),
                                    "processUncoveredFilesFromWhitelist")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "registerMockObjectsFromTestArgumentsRecursively",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(),
                                            "registerMockObjectsFromTestArgumentsRecursively"))
                            ? ZVal.getElement(
                                    scope.arguments.getObject(),
                                    "registerMockObjectsFromTestArgumentsRecursively")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "repeat",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "repeat"))
                            ? ZVal.getElement(scope.arguments.getObject(), "repeat")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "reportHighLowerBound",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(), "reportHighLowerBound"))
                            ? ZVal.getElement(scope.arguments.getObject(), "reportHighLowerBound")
                            : 90);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "reportLowUpperBound",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "reportLowUpperBound"))
                            ? ZVal.getElement(scope.arguments.getObject(), "reportLowUpperBound")
                            : 50);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "reportUselessTests",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "reportUselessTests"))
                            ? ZVal.getElement(scope.arguments.getObject(), "reportUselessTests")
                            : true);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "reverseList",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "reverseList"))
                            ? ZVal.getElement(scope.arguments.getObject(), "reverseList")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "stopOnError",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "stopOnError"))
                            ? ZVal.getElement(scope.arguments.getObject(), "stopOnError")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "stopOnFailure",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "stopOnFailure"))
                            ? ZVal.getElement(scope.arguments.getObject(), "stopOnFailure")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "stopOnIncomplete",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "stopOnIncomplete"))
                            ? ZVal.getElement(scope.arguments.getObject(), "stopOnIncomplete")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "stopOnRisky",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "stopOnRisky"))
                            ? ZVal.getElement(scope.arguments.getObject(), "stopOnRisky")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "stopOnSkipped",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "stopOnSkipped"))
                            ? ZVal.getElement(scope.arguments.getObject(), "stopOnSkipped")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "stopOnWarning",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "stopOnWarning"))
                            ? ZVal.getElement(scope.arguments.getObject(), "stopOnWarning")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "strictCoverage",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "strictCoverage"))
                            ? ZVal.getElement(scope.arguments.getObject(), "strictCoverage")
                            : false);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "testdoxExcludeGroups",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(), "testdoxExcludeGroups"))
                            ? ZVal.getElement(scope.arguments.getObject(), "testdoxExcludeGroups")
                            : ZVal.newArray());
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "testdoxGroups",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "testdoxGroups"))
                            ? ZVal.getElement(scope.arguments.getObject(), "testdoxGroups")
                            : ZVal.newArray());
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "timeoutForLargeTests",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(), "timeoutForLargeTests"))
                            ? ZVal.getElement(scope.arguments.getObject(), "timeoutForLargeTests")
                            : 60);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "timeoutForMediumTests",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(), "timeoutForMediumTests"))
                            ? ZVal.getElement(scope.arguments.getObject(), "timeoutForMediumTests")
                            : 10);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "timeoutForSmallTests",
                    ZVal.isTrue(
                                    ZVal.getElement(
                                            scope.arguments.getObject(), "timeoutForSmallTests"))
                            ? ZVal.getElement(scope.arguments.getObject(), "timeoutForSmallTests")
                            : 1);
            ZVal.putArrayElement(
                    scope.arguments.getObject(),
                    "verbose",
                    ZVal.isTrue(ZVal.getElement(scope.arguments.getObject(), "verbose"))
                            ? ZVal.getElement(scope.arguments.getObject(), "verbose")
                            : false);
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    public Object handleConfiguration(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    private Object processSuiteFilters(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object filterFactory = null;
        if (ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(ZVal.getElement(arguments, "filter")))
                                && ZVal.toBool(ZVal.isEmpty(ZVal.getElement(arguments, "groups"))))
                && ZVal.toBool(ZVal.isEmpty(ZVal.getElement(arguments, "excludeGroups")))) {
            return null;
        }

        filterFactory = new Factory(env);
        if (!ZVal.isEmpty(ZVal.getElement(arguments, "excludeGroups"))) {
            env.callMethod(
                    filterFactory,
                    "addFilter",
                    TestRunner.class,
                    new ReflectionClass(env, ExcludeGroupFilterIterator.CONST_class),
                    ZVal.getElement(arguments, "excludeGroups"));
        }

        if (!ZVal.isEmpty(ZVal.getElement(arguments, "groups"))) {
            env.callMethod(
                    filterFactory,
                    "addFilter",
                    TestRunner.class,
                    new ReflectionClass(env, IncludeGroupFilterIterator.CONST_class),
                    ZVal.getElement(arguments, "groups"));
        }

        if (ZVal.isTrue(ZVal.getElement(arguments, "filter"))) {
            env.callMethod(
                    filterFactory,
                    "addFilter",
                    TestRunner.class,
                    new ReflectionClass(env, NameFilterIterator.CONST_class),
                    ZVal.getElement(arguments, "filter"));
        }

        env.callMethod(suite, "injectFilter", TestRunner.class, filterFactory);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "string")
    @ConvertedParameter(index = 1, name = "message", typeHint = "string")
    private Object writeMessage(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object message = assignParameter(args, 1, null);
        if (!toObjectR(this).accessProp(this, env).name("messagePrinted").getBool()) {
            env.callMethod(this, "write", TestRunner.class, "\n");
        }

        env.callMethod(
                this,
                "write",
                TestRunner.class,
                NamespaceGlobal.sprintf
                        .env(env)
                        .call("%-15s%s\n", toStringR(type, env) + ":", message)
                        .value());
        toObjectR(this).accessProp(this, env).name("messagePrinted").set(true);
        return null;
    }

    public static final Object CONST_SUCCESS_EXIT = 0;

    public static final Object CONST_FAILURE_EXIT = 1;

    public static final Object CONST_EXCEPTION_EXIT = 2;

    public static final Object CONST_class = "PHPUnit\\TextUI\\TestRunner";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTestRunner.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "test")
        @ConvertedParameter(
            index = 1,
            name = "arguments",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 2,
            name = "exit",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object run(RuntimeEnv env, Object... args) {
            Object test = assignParameter(args, 0, null);
            Object arguments = assignParameter(args, 1, null);
            if (ZVal.isNull(arguments)) {
                arguments = ZVal.newArray();
            }
            Object exit = assignParameter(args, 2, null);
            if (ZVal.isNull(exit)) {
                exit = true;
            }
            Object aTestRunner = null;
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, ReflectionClass.class, "ReflectionClass"))) {
                test = new TestSuite(env, test);
            }

            if (ZVal.isTrue(ZVal.checkInstanceType(test, Test.class, "PHPUnit\\Framework\\Test"))) {
                aTestRunner =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .TextUI
                                .classes
                                .TestRunner(env);
                return ZVal.assign(
                        env.callMethod(
                                aTestRunner, "doRun", TestRunner.class, test, arguments, exit));
            }

            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .classes
                            .Exception(env, "No test case or test suite found."));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object versionStringPrinted = false;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\TextUI\\TestRunner")
                    .setLookup(TestRunner.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "codeCoverageFilter",
                            "extensions",
                            "loader",
                            "messagePrinted",
                            "printer",
                            "runtime")
                    .setFilename("vendor/phpunit/phpunit/src/TextUI/TestRunner.php")
                    .addExtendsClass("PHPUnit\\Runner\\BaseTestRunner")
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

    private static class Scope13 implements UpdateRuntimeScopeInterface {

        Object extensionClass;
        Object phpunitConfiguration;
        Object extension;
        Object testdoxGroupConfiguration;
        Object _thisVarAlias;
        Object listener;
        Object groupCliArgs;
        ReferenceContainer arguments;
        Object listenerClass;
        Object loggingConfiguration;
        Object groupConfiguration;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("extensionClass", this.extensionClass);
            stack.setVariable("phpunitConfiguration", this.phpunitConfiguration);
            stack.setVariable("extension", this.extension);
            stack.setVariable("testdoxGroupConfiguration", this.testdoxGroupConfiguration);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("listener", this.listener);
            stack.setVariable("groupCliArgs", this.groupCliArgs);
            stack.setVariable("arguments", this.arguments);
            stack.setVariable("listenerClass", this.listenerClass);
            stack.setVariable("loggingConfiguration", this.loggingConfiguration);
            stack.setVariable("groupConfiguration", this.groupConfiguration);
        }

        public void updateScope(RuntimeStack stack) {

            this.extensionClass = stack.getVariable("extensionClass");
            this.phpunitConfiguration = stack.getVariable("phpunitConfiguration");
            this.extension = stack.getVariable("extension");
            this.testdoxGroupConfiguration = stack.getVariable("testdoxGroupConfiguration");
            this._thisVarAlias = stack.getVariable("this");
            this.listener = stack.getVariable("listener");
            this.groupCliArgs = stack.getVariable("groupCliArgs");
            this.arguments = ZVal.getStackReference(stack.getVariable("arguments"));
            this.listenerClass = stack.getVariable("listenerClass");
            this.loggingConfiguration = stack.getVariable("loggingConfiguration");
            this.groupConfiguration = stack.getVariable("groupConfiguration");
        }
    }

    private static class Scope14 implements UpdateRuntimeScopeInterface {

        Object extensionClass;
        Object phpunitConfiguration;
        Object extension;
        Object testdoxGroupConfiguration;
        Object _thisVarAlias;
        Object listener;
        Object groupCliArgs;
        ReferenceContainer arguments;
        Object listenerClass;
        Object loggingConfiguration;
        Object groupConfiguration;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("extensionClass", this.extensionClass);
            stack.setVariable("phpunitConfiguration", this.phpunitConfiguration);
            stack.setVariable("extension", this.extension);
            stack.setVariable("testdoxGroupConfiguration", this.testdoxGroupConfiguration);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("listener", this.listener);
            stack.setVariable("groupCliArgs", this.groupCliArgs);
            stack.setVariable("arguments", this.arguments);
            stack.setVariable("listenerClass", this.listenerClass);
            stack.setVariable("loggingConfiguration", this.loggingConfiguration);
            stack.setVariable("groupConfiguration", this.groupConfiguration);
        }

        public void updateScope(RuntimeStack stack) {

            this.extensionClass = stack.getVariable("extensionClass");
            this.phpunitConfiguration = stack.getVariable("phpunitConfiguration");
            this.extension = stack.getVariable("extension");
            this.testdoxGroupConfiguration = stack.getVariable("testdoxGroupConfiguration");
            this._thisVarAlias = stack.getVariable("this");
            this.listener = stack.getVariable("listener");
            this.groupCliArgs = stack.getVariable("groupCliArgs");
            this.arguments = ZVal.getStackReference(stack.getVariable("arguments"));
            this.listenerClass = stack.getVariable("listenerClass");
            this.loggingConfiguration = stack.getVariable("loggingConfiguration");
            this.groupConfiguration = stack.getVariable("groupConfiguration");
        }
    }
}
