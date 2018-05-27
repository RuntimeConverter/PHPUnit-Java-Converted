package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Configuration;
import com.runtimeconverter.runtime.modules.standard.stream.function_stream_resolve_include_path;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.StandardTestSuiteLoader;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.classes.File_Iterator_Facade;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.TextTestListRenderer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.TestRunner;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.FileLoader;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.ConfigurationGenerator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.CliTestDoxPrinter;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Getopt;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.Log.classes.TeamCity;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filesystem;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestSuiteLoader;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ApplicationName;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.XmlTestListRenderer;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestLoader;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/TextUI/Command.php

*/

public class Command extends RuntimeClassBase {

    public Object arguments =
            ZVal.newArray(
                    new ZPair("listGroups", false),
                    new ZPair("listSuites", false),
                    new ZPair("listTests", false),
                    new ZPair("listTestsXml", false),
                    new ZPair("loader", ZVal.getNull()),
                    new ZPair("useDefaultConfiguration", true),
                    new ZPair("loadedExtensions", ZVal.newArray()),
                    new ZPair("notLoadedExtensions", ZVal.newArray()));

    public Object options = ZVal.newArray();

    public Object longOptions =
            ZVal.newArray(
                    new ZPair("atleast-version=", ZVal.getNull()),
                    new ZPair("bootstrap=", ZVal.getNull()),
                    new ZPair("check-version", ZVal.getNull()),
                    new ZPair("colors==", ZVal.getNull()),
                    new ZPair("columns=", ZVal.getNull()),
                    new ZPair("configuration=", ZVal.getNull()),
                    new ZPair("coverage-clover=", ZVal.getNull()),
                    new ZPair("coverage-crap4j=", ZVal.getNull()),
                    new ZPair("coverage-html=", ZVal.getNull()),
                    new ZPair("coverage-php=", ZVal.getNull()),
                    new ZPair("coverage-text==", ZVal.getNull()),
                    new ZPair("coverage-xml=", ZVal.getNull()),
                    new ZPair("debug", ZVal.getNull()),
                    new ZPair("disallow-test-output", ZVal.getNull()),
                    new ZPair("disallow-resource-usage", ZVal.getNull()),
                    new ZPair("disallow-todo-tests", ZVal.getNull()),
                    new ZPair("enforce-time-limit", ZVal.getNull()),
                    new ZPair("exclude-group=", ZVal.getNull()),
                    new ZPair("filter=", ZVal.getNull()),
                    new ZPair("generate-configuration", ZVal.getNull()),
                    new ZPair("globals-backup", ZVal.getNull()),
                    new ZPair("group=", ZVal.getNull()),
                    new ZPair("help", ZVal.getNull()),
                    new ZPair("include-path=", ZVal.getNull()),
                    new ZPair("list-groups", ZVal.getNull()),
                    new ZPair("list-suites", ZVal.getNull()),
                    new ZPair("list-tests", ZVal.getNull()),
                    new ZPair("list-tests-xml=", ZVal.getNull()),
                    new ZPair("loader=", ZVal.getNull()),
                    new ZPair("log-junit=", ZVal.getNull()),
                    new ZPair("log-teamcity=", ZVal.getNull()),
                    new ZPair("no-configuration", ZVal.getNull()),
                    new ZPair("no-coverage", ZVal.getNull()),
                    new ZPair("no-logging", ZVal.getNull()),
                    new ZPair("no-extensions", ZVal.getNull()),
                    new ZPair("printer=", ZVal.getNull()),
                    new ZPair("process-isolation", ZVal.getNull()),
                    new ZPair("repeat=", ZVal.getNull()),
                    new ZPair("dont-report-useless-tests", ZVal.getNull()),
                    new ZPair("reverse-list", ZVal.getNull()),
                    new ZPair("static-backup", ZVal.getNull()),
                    new ZPair("stderr", ZVal.getNull()),
                    new ZPair("stop-on-error", ZVal.getNull()),
                    new ZPair("stop-on-failure", ZVal.getNull()),
                    new ZPair("stop-on-warning", ZVal.getNull()),
                    new ZPair("stop-on-incomplete", ZVal.getNull()),
                    new ZPair("stop-on-risky", ZVal.getNull()),
                    new ZPair("stop-on-skipped", ZVal.getNull()),
                    new ZPair("fail-on-warning", ZVal.getNull()),
                    new ZPair("fail-on-risky", ZVal.getNull()),
                    new ZPair("strict-coverage", ZVal.getNull()),
                    new ZPair("disable-coverage-ignore", ZVal.getNull()),
                    new ZPair("strict-global-state", ZVal.getNull()),
                    new ZPair("teamcity", ZVal.getNull()),
                    new ZPair("testdox", ZVal.getNull()),
                    new ZPair("testdox-group=", ZVal.getNull()),
                    new ZPair("testdox-exclude-group=", ZVal.getNull()),
                    new ZPair("testdox-html=", ZVal.getNull()),
                    new ZPair("testdox-text=", ZVal.getNull()),
                    new ZPair("testdox-xml=", ZVal.getNull()),
                    new ZPair("test-suffix=", ZVal.getNull()),
                    new ZPair("testsuite=", ZVal.getNull()),
                    new ZPair("verbose", ZVal.getNull()),
                    new ZPair("version", ZVal.getNull()),
                    new ZPair("whitelist=", ZVal.getNull()));

    public Object versionStringPrinted = false;

    public Command(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argv", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "exit",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object run(RuntimeEnv env, Object... args) {
        Object argv = assignParameter(args, 0, null);
        Object exit = assignParameter(args, 1, null);
        if (ZVal.isNull(exit)) {
            exit = true;
        }
        Object result = null;
        Object suite = null;
        Object e = null;
        Object runner = null;
        Object _pReturn = null;
        env.callMethod(this, "handleArguments", Command.class, argv);
        runner = env.callMethod(this, "createRunner", Command.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("arguments").value(),
                                "test"),
                        Test.class,
                        "PHPUnit\\Framework\\Test"))) {
            suite =
                    ZVal.assign(
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                                    "test"));

        } else {
            suite =
                    env.callMethod(
                            runner,
                            "getTest",
                            Command.class,
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                                    "test"),
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                                    "testFile"),
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                                    "testSuffixes"));
        }

        if (ZVal.isTrue(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "listGroups"))) {
            return ZVal.assign(
                    env.callMethod(this, "handleListGroups", Command.class, suite, exit));
        }

        if (ZVal.isTrue(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "listSuites"))) {
            return ZVal.assign(env.callMethod(this, "handleListSuites", Command.class, exit));
        }

        if (ZVal.isTrue(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "listTests"))) {
            return ZVal.assign(env.callMethod(this, "handleListTests", Command.class, suite, exit));
        }

        if (ZVal.isTrue(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "listTestsXml"))) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "handleListTestsXml",
                            Command.class,
                            suite,
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                                    "listTestsXml"),
                            exit));
        }

        ZVal.unsetArrayElement(
                toObjectR(this).accessProp(this, env).name("arguments").value(), "test");
        ZVal.unsetArrayElement(
                toObjectR(this).accessProp(this, env).name("arguments").value(), "testFile");
        try {
            result =
                    env.callMethod(
                            runner,
                            "doRun",
                            Command.class,
                            suite,
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            exit);
        } catch (ConvertedException convertedException50) {
            if (convertedException50.instanceOf(
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
                e = convertedException50.getObject();
                env.echo(
                        toStringR(env.callMethod(e, "getMessage", Command.class), env)
                                + toStringR("\n", env));
            } else {
                throw convertedException50;
            }
        }

        _pReturn = ZVal.assign(TestRunner.CONST_FAILURE_EXIT);
        if (ZVal.toBool(ZVal.isset(result))
                && ZVal.toBool(env.callMethod(result, "wasSuccessful", Command.class))) {
            _pReturn = ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);

        } else if (ZVal.toBool(!ZVal.isset(result))
                || ZVal.toBool(
                        ZVal.isGreaterThan(
                                env.callMethod(result, "errorCount", Command.class), '>', 0))) {
            _pReturn = ZVal.assign(TestRunner.CONST_EXCEPTION_EXIT);
        }

        if (ZVal.isTrue(exit)) {
            env.exit(_pReturn);
        }

        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    protected Object createRunner(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new TestRunner(
                        env,
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("arguments").value(),
                                "loader")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argv", typeHint = "array")
    protected Object handleArguments(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object argv = assignParameter(args, 0, null);
        Object handler = null;
        Object phpunitConfiguration = ZVal.newArray();
        Object testsDirectory = null;
        Object test = null;
        Object ini = ZVal.newArray();
        Object src = null;
        Object configuration = null;
        Object testSuite = null;
        Object generator = null;
        Object includePath = null;
        Object bootstrapScript = null;
        Object file = null;
        Object t = null;
        Object configurationFile = null;
        Object optionName = null;
        Object option = ZVal.newArray();
        try {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("options")
                    .set(
                            Getopt.runtimeStaticObject.getopt(
                                    env,
                                    argv,
                                    "d:c:hv",
                                    CRArrayF.array_keys
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("longOptions")
                                                            .value())
                                            .value()));
        } catch (ConvertedException convertedException51) {
            if (convertedException51.instanceOf(
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
                t = convertedException51.getObject();
                env.callMethod(
                        this,
                        "exitWithErrorMessage",
                        Command.class,
                        env.callMethod(t, "getMessage", Command.class));
            } else {
                throw convertedException51;
            }
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult333 :
                ZVal.getIterable(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("options").value(), 0),
                        env,
                        true)) {
            option = ZVal.assign(zpairResult333.getValue());
            SwitchEnumType17 switchVariable17 =
                    ZVal.getEnum(
                            ZVal.getElement(option, 0),
                            SwitchEnumType17.DEFAULT_CASE,
                            SwitchEnumType17.STRING___colors,
                            "--colors",
                            SwitchEnumType17.STRING___bootstrap,
                            "--bootstrap",
                            SwitchEnumType17.STRING___columns,
                            "--columns",
                            SwitchEnumType17.STRING_c,
                            "c",
                            SwitchEnumType17.STRING___configuration,
                            "--configuration",
                            SwitchEnumType17.STRING___coverage_clover,
                            "--coverage-clover",
                            SwitchEnumType17.STRING___coverage_crap4j,
                            "--coverage-crap4j",
                            SwitchEnumType17.STRING___coverage_html,
                            "--coverage-html",
                            SwitchEnumType17.STRING___coverage_php,
                            "--coverage-php",
                            SwitchEnumType17.STRING___coverage_text,
                            "--coverage-text",
                            SwitchEnumType17.STRING___coverage_xml,
                            "--coverage-xml",
                            SwitchEnumType17.STRING_d,
                            "d",
                            SwitchEnumType17.STRING___debug,
                            "--debug",
                            SwitchEnumType17.STRING_h,
                            "h",
                            SwitchEnumType17.STRING___help,
                            "--help",
                            SwitchEnumType17.STRING___filter,
                            "--filter",
                            SwitchEnumType17.STRING___testsuite,
                            "--testsuite",
                            SwitchEnumType17.STRING___generate_configuration,
                            "--generate-configuration",
                            SwitchEnumType17.STRING___group,
                            "--group",
                            SwitchEnumType17.STRING___exclude_group,
                            "--exclude-group",
                            SwitchEnumType17.STRING___test_suffix,
                            "--test-suffix",
                            SwitchEnumType17.STRING___include_path,
                            "--include-path",
                            SwitchEnumType17.STRING___list_groups,
                            "--list-groups",
                            SwitchEnumType17.STRING___list_suites,
                            "--list-suites",
                            SwitchEnumType17.STRING___list_tests,
                            "--list-tests",
                            SwitchEnumType17.STRING___list_tests_xml,
                            "--list-tests-xml",
                            SwitchEnumType17.STRING___printer,
                            "--printer",
                            SwitchEnumType17.STRING___loader,
                            "--loader",
                            SwitchEnumType17.STRING___log_junit,
                            "--log-junit",
                            SwitchEnumType17.STRING___log_teamcity,
                            "--log-teamcity",
                            SwitchEnumType17.STRING___process_isolation,
                            "--process-isolation",
                            SwitchEnumType17.STRING___repeat,
                            "--repeat",
                            SwitchEnumType17.STRING___stderr,
                            "--stderr",
                            SwitchEnumType17.STRING___stop_on_error,
                            "--stop-on-error",
                            SwitchEnumType17.STRING___stop_on_failure,
                            "--stop-on-failure",
                            SwitchEnumType17.STRING___stop_on_warning,
                            "--stop-on-warning",
                            SwitchEnumType17.STRING___stop_on_incomplete,
                            "--stop-on-incomplete",
                            SwitchEnumType17.STRING___stop_on_risky,
                            "--stop-on-risky",
                            SwitchEnumType17.STRING___stop_on_skipped,
                            "--stop-on-skipped",
                            SwitchEnumType17.STRING___fail_on_warning,
                            "--fail-on-warning",
                            SwitchEnumType17.STRING___fail_on_risky,
                            "--fail-on-risky",
                            SwitchEnumType17.STRING___teamcity,
                            "--teamcity",
                            SwitchEnumType17.STRING___testdox,
                            "--testdox",
                            SwitchEnumType17.STRING___testdox_group,
                            "--testdox-group",
                            SwitchEnumType17.STRING___testdox_exclude_group,
                            "--testdox-exclude-group",
                            SwitchEnumType17.STRING___testdox_html,
                            "--testdox-html",
                            SwitchEnumType17.STRING___testdox_text,
                            "--testdox-text",
                            SwitchEnumType17.STRING___testdox_xml,
                            "--testdox-xml",
                            SwitchEnumType17.STRING___no_configuration,
                            "--no-configuration",
                            SwitchEnumType17.STRING___no_extensions,
                            "--no-extensions",
                            SwitchEnumType17.STRING___no_coverage,
                            "--no-coverage",
                            SwitchEnumType17.STRING___no_logging,
                            "--no-logging",
                            SwitchEnumType17.STRING___globals_backup,
                            "--globals-backup",
                            SwitchEnumType17.STRING___static_backup,
                            "--static-backup",
                            SwitchEnumType17.STRING_v,
                            "v",
                            SwitchEnumType17.STRING___verbose,
                            "--verbose",
                            SwitchEnumType17.STRING___atleast_version,
                            "--atleast-version",
                            SwitchEnumType17.STRING___version,
                            "--version",
                            SwitchEnumType17.STRING___dont_report_useless_tests,
                            "--dont-report-useless-tests",
                            SwitchEnumType17.STRING___strict_coverage,
                            "--strict-coverage",
                            SwitchEnumType17.STRING___disable_coverage_ignore,
                            "--disable-coverage-ignore",
                            SwitchEnumType17.STRING___strict_global_state,
                            "--strict-global-state",
                            SwitchEnumType17.STRING___disallow_test_output,
                            "--disallow-test-output",
                            SwitchEnumType17.STRING___disallow_resource_usage,
                            "--disallow-resource-usage",
                            SwitchEnumType17.STRING___enforce_time_limit,
                            "--enforce-time-limit",
                            SwitchEnumType17.STRING___disallow_todo_tests,
                            "--disallow-todo-tests",
                            SwitchEnumType17.STRING___reverse_list,
                            "--reverse-list",
                            SwitchEnumType17.STRING___check_version,
                            "--check-version",
                            SwitchEnumType17.STRING___whitelist,
                            "--whitelist");
            switch (switchVariable17) {
                case STRING___colors:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "colors",
                            ZVal.isTrue(ZVal.getElement(option, 1))
                                    ? ZVal.getElement(option, 1)
                                    : ResultPrinter.CONST_COLOR_AUTO);
                    break;
                case STRING___bootstrap:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "bootstrap",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___columns:
                    if (function_is_numeric.f.env(env).call(ZVal.getElement(option, 1)).getBool()) {
                        ZVal.putArrayElement(
                                toObjectR(this).accessProp(this, env).name("arguments").value(),
                                "columns",
                                ZVal.toLong(ZVal.getElement(option, 1)));

                    } else if (ZVal.strictEqualityCheck(ZVal.getElement(option, 1), "===", "max")) {
                        ZVal.putArrayElement(
                                toObjectR(this).accessProp(this, env).name("arguments").value(),
                                "columns",
                                "max");
                    }

                    break;
                case STRING_c:
                case STRING___configuration:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "configuration",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___coverage_clover:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "coverageClover",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___coverage_crap4j:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "coverageCrap4J",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___coverage_html:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "coverageHtml",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___coverage_php:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "coveragePHP",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___coverage_text:
                    if (ZVal.strictEqualityCheck(
                            ZVal.getElement(option, 1), "===", ZVal.getNull())) {
                        ZVal.putArrayElement(option, 1, "php://stdout");
                    }

                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "coverageText",
                            ZVal.getElement(option, 1));
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "coverageTextShowUncoveredFiles",
                            false);
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "coverageTextShowOnlySummary",
                            false);
                    break;
                case STRING___coverage_xml:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "coverageXml",
                            ZVal.getElement(option, 1));
                    break;
                case STRING_d:
                    ini =
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call("=", ZVal.getElement(option, 1))
                                    .value();
                    if (ZVal.isset(ZVal.getElement(ini, 0))) {
                        if (ZVal.isset(ZVal.getElement(ini, 1))) {
                            NamespaceGlobal.ini_set
                                    .env(env)
                                    .call(ZVal.getElement(ini, 0), ZVal.getElement(ini, 1));

                        } else {
                            NamespaceGlobal.ini_set.env(env).call(ZVal.getElement(ini, 0), true);
                        }
                    }

                    break;
                case STRING___debug:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "debug",
                            true);
                    break;
                case STRING_h:
                case STRING___help:
                    env.callMethod(this, "showHelp", Command.class);
                    env.exit(TestRunner.CONST_SUCCESS_EXIT);
                    break;
                case STRING___filter:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "filter",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___testsuite:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "testsuite",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___generate_configuration:
                    env.callMethod(this, "printVersionString", Command.class);
                    env.echo(
                            "Generating phpunit.xml in "
                                    + toStringR(NamespaceGlobal.getcwd.env(env).call().value(), env)
                                    + toStringR("\n", env)
                                    + toStringR("\n", env));
                    env.echo(
                            "Bootstrap script (relative to path shown above; default: vendor/autoload.php): ");
                    bootstrapScript =
                            NamespaceGlobal.trim
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.fgets
                                                    .env(env)
                                                    .call(function_constant.f.call(env, "STDIN"))
                                                    .value())
                                    .value();
                    env.echo("Tests directory (relative to path shown above; default: tests): ");
                    testsDirectory =
                            NamespaceGlobal.trim
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.fgets
                                                    .env(env)
                                                    .call(function_constant.f.call(env, "STDIN"))
                                                    .value())
                                    .value();
                    env.echo("Source directory (relative to path shown above; default: src): ");
                    src =
                            NamespaceGlobal.trim
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.fgets
                                                    .env(env)
                                                    .call(function_constant.f.call(env, "STDIN"))
                                                    .value())
                                    .value();
                    if (ZVal.strictEqualityCheck(bootstrapScript, "===", "")) {
                        bootstrapScript = "vendor/autoload.php";
                    }

                    if (ZVal.strictEqualityCheck(testsDirectory, "===", "")) {
                        testsDirectory = "tests";
                    }

                    if (ZVal.strictEqualityCheck(src, "===", "")) {
                        src = "src";
                    }

                    generator = new ConfigurationGenerator(env);
                    NamespaceGlobal.file_put_contents
                            .env(env)
                            .call(
                                    "phpunit.xml",
                                    env.callMethod(
                                            generator,
                                            "generateDefaultConfiguration",
                                            Command.class,
                                            com.project.convertedCode.globalNamespace.namespaces
                                                    .PHPUnit.namespaces.Runner.classes.Version
                                                    .runtimeStaticObject.series(env),
                                            bootstrapScript,
                                            testsDirectory,
                                            src));
                    env.echo(
                            toStringR("\n", env)
                                    + "Generated phpunit.xml in "
                                    + toStringR(NamespaceGlobal.getcwd.env(env).call().value(), env)
                                    + toStringR("\n", env));
                    env.exit(TestRunner.CONST_SUCCESS_EXIT);
                    break;
                case STRING___group:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "groups",
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(",", ZVal.getElement(option, 1))
                                    .value());
                    break;
                case STRING___exclude_group:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "excludeGroups",
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(",", ZVal.getElement(option, 1))
                                    .value());
                    break;
                case STRING___test_suffix:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "testSuffixes",
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(",", ZVal.getElement(option, 1))
                                    .value());
                    break;
                case STRING___include_path:
                    includePath = ZVal.assign(ZVal.getElement(option, 1));
                    break;
                case STRING___list_groups:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "listGroups",
                            true);
                    break;
                case STRING___list_suites:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "listSuites",
                            true);
                    break;
                case STRING___list_tests:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "listTests",
                            true);
                    break;
                case STRING___list_tests_xml:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "listTestsXml",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___printer:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "printer",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___loader:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "loader",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___log_junit:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "junitLogfile",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___log_teamcity:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "teamcityLogfile",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___process_isolation:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "processIsolation",
                            true);
                    break;
                case STRING___repeat:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "repeat",
                            ZVal.toLong(ZVal.getElement(option, 1)));
                    break;
                case STRING___stderr:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "stderr",
                            true);
                    break;
                case STRING___stop_on_error:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "stopOnError",
                            true);
                    break;
                case STRING___stop_on_failure:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "stopOnFailure",
                            true);
                    break;
                case STRING___stop_on_warning:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "stopOnWarning",
                            true);
                    break;
                case STRING___stop_on_incomplete:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "stopOnIncomplete",
                            true);
                    break;
                case STRING___stop_on_risky:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "stopOnRisky",
                            true);
                    break;
                case STRING___stop_on_skipped:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "stopOnSkipped",
                            true);
                    break;
                case STRING___fail_on_warning:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "failOnWarning",
                            true);
                    break;
                case STRING___fail_on_risky:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "failOnRisky",
                            true);
                    break;
                case STRING___teamcity:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "printer",
                            TeamCity.CONST_class);
                    break;
                case STRING___testdox:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "printer",
                            CliTestDoxPrinter.CONST_class);
                    break;
                case STRING___testdox_group:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "testdoxGroups",
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(",", ZVal.getElement(option, 1))
                                    .value());
                    break;
                case STRING___testdox_exclude_group:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "testdoxExcludeGroups",
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(",", ZVal.getElement(option, 1))
                                    .value());
                    break;
                case STRING___testdox_html:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "testdoxHTMLFile",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___testdox_text:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "testdoxTextFile",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___testdox_xml:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "testdoxXMLFile",
                            ZVal.getElement(option, 1));
                    break;
                case STRING___no_configuration:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "useDefaultConfiguration",
                            false);
                    break;
                case STRING___no_extensions:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "noExtensions",
                            true);
                    break;
                case STRING___no_coverage:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "noCoverage",
                            true);
                    break;
                case STRING___no_logging:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "noLogging",
                            true);
                    break;
                case STRING___globals_backup:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "backupGlobals",
                            true);
                    break;
                case STRING___static_backup:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "backupStaticAttributes",
                            true);
                    break;
                case STRING_v:
                case STRING___verbose:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "verbose",
                            true);
                    break;
                case STRING___atleast_version:
                    if (NamespaceGlobal.version_compare
                            .env(env)
                            .call(
                                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                            .namespaces.Runner.classes.Version.runtimeStaticObject
                                            .id(env),
                                    ZVal.getElement(option, 1),
                                    ">=")
                            .getBool()) {
                        env.exit(TestRunner.CONST_SUCCESS_EXIT);
                    }

                    env.exit(TestRunner.CONST_FAILURE_EXIT);
                    break;
                case STRING___version:
                    env.callMethod(this, "printVersionString", Command.class);
                    env.exit(TestRunner.CONST_SUCCESS_EXIT);
                    break;
                case STRING___dont_report_useless_tests:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "reportUselessTests",
                            false);
                    break;
                case STRING___strict_coverage:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "strictCoverage",
                            true);
                    break;
                case STRING___disable_coverage_ignore:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "disableCodeCoverageIgnore",
                            true);
                    break;
                case STRING___strict_global_state:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "beStrictAboutChangesToGlobalState",
                            true);
                    break;
                case STRING___disallow_test_output:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "disallowTestOutput",
                            true);
                    break;
                case STRING___disallow_resource_usage:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "beStrictAboutResourceUsageDuringSmallTests",
                            true);
                    break;
                case STRING___enforce_time_limit:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "enforceTimeLimit",
                            true);
                    break;
                case STRING___disallow_todo_tests:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "disallowTodoAnnotatedTests",
                            true);
                    break;
                case STRING___reverse_list:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "reverseList",
                            true);
                    break;
                case STRING___check_version:
                    env.callMethod(this, "handleVersionCheck", Command.class);
                    break;
                case STRING___whitelist:
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "whitelist",
                            ZVal.getElement(option, 1));
                    break;
                case DEFAULT_CASE:
                    optionName =
                            NamespaceGlobal.str_replace
                                    .env(env)
                                    .addReferneceArgs(new RuntimeArgsWithReferences())
                                    .call("--", "", ZVal.getElement(option, 0))
                                    .value();
                    handler = ZVal.getNull();
                    if (ZVal.isset(
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("longOptions")
                                            .value(),
                                    optionName))) {
                        handler =
                                ZVal.assign(
                                        ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("longOptions")
                                                        .value(),
                                                optionName));

                    } else if (ZVal.isset(
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("longOptions")
                                            .value(),
                                    toStringR(optionName, env) + "="))) {
                        handler =
                                ZVal.assign(
                                        ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("longOptions")
                                                        .value(),
                                                toStringR(optionName, env) + "="));
                    }

                    if (ZVal.toBool(ZVal.isset(handler))
                            && ZVal.toBool(
                                    NamespaceGlobal.is_callable
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    ZVal.newArray(
                                                            new ZPair(0, this),
                                                            new ZPair(1, handler)))
                                            .value())) {
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences()
                                        .add(0, new ArrayDimensionReference(option, 1)),
                                toStringR(handler, env),
                                Command.class,
                                ZVal.getElement(option, 1));
                    }
            }
            ;
        }

        env.callMethod(this, "handleCustomTestSuite", Command.class);
        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(), "test"))) {
            if (ZVal.isset(
                    ZVal.getElementRecursive(
                            toObjectR(this).accessProp(this, env).name("options").value(), 1, 0))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "test",
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("options").value(),
                                1,
                                0));
            }

            if (ZVal.isset(
                    ZVal.getElementRecursive(
                            toObjectR(this).accessProp(this, env).name("options").value(), 1, 1))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "testFile",
                        NamespaceGlobal.realpath
                                .env(env)
                                .call(
                                        ZVal.getElementRecursive(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("options")
                                                        .value(),
                                                1,
                                                1))
                                .value());

            } else {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "testFile",
                        "");
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.isset(
                                                    ZVal.getElement(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("arguments")
                                                                    .value(),
                                                            "test")))
                                    && ZVal.toBool(
                                            NamespaceGlobal.is_file
                                                    .env(env)
                                                    .call(
                                                            ZVal.getElement(
                                                                    toObjectR(this)
                                                                            .accessProp(this, env)
                                                                            .name("arguments")
                                                                            .value(),
                                                                    "test"))
                                                    .value()))
                    && ZVal.toBool(
                            ZVal.notEqualityCheck(
                                    NamespaceGlobal.substr
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("arguments")
                                                                    .value(),
                                                            "test"),
                                                    -5,
                                                    5)
                                            .value(),
                                    ".phpt"))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "testFile",
                        NamespaceGlobal.realpath
                                .env(env)
                                .call(
                                        ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("arguments")
                                                        .value(),
                                                "test"))
                                .value());
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "test",
                        NamespaceGlobal.substr
                                .env(env)
                                .call(
                                        ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("arguments")
                                                        .value(),
                                                "test"),
                                        0,
                                        NamespaceGlobal.strrpos
                                                .env(env)
                                                .call(
                                                        ZVal.getElement(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("arguments")
                                                                        .value(),
                                                                "test"),
                                                        ".")
                                                .value())
                                .value());
            }
        }

        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "testSuffixes"))) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                    "testSuffixes",
                    ZVal.newArray(new ZPair(0, "Test.php"), new ZPair(1, ".phpt")));
        }

        if (ZVal.isset(includePath)) {
            NamespaceGlobal.ini_set
                    .env(env)
                    .call(
                            "include_path",
                            toStringR(includePath, env)
                                    + toStringR(":", env)
                                    + toStringR(
                                            NamespaceGlobal.ini_get
                                                    .env(env)
                                                    .call("include_path")
                                                    .value(),
                                            env));
        }

        if (ZVal.strictNotEqualityCheck(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(), "loader"),
                "!==",
                ZVal.getNull())) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                    "loader",
                    env.callMethod(
                            this,
                            "handleLoader",
                            Command.class,
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                                    "loader")));
        }

        if (ZVal.toBool(
                        ZVal.isset(
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("arguments")
                                                .value(),
                                        "configuration")))
                && ZVal.toBool(
                        NamespaceGlobal.is_dir
                                .env(env)
                                .call(
                                        ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("arguments")
                                                        .value(),
                                                "configuration"))
                                .value())) {
            configurationFile =
                    toStringR(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("arguments")
                                                    .value(),
                                            "configuration"),
                                    env)
                            + "/phpunit.xml";
            if (NamespaceGlobal.file_exists.env(env).call(configurationFile).getBool()) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "configuration",
                        NamespaceGlobal.realpath.env(env).call(configurationFile).value());

            } else if (NamespaceGlobal.file_exists
                    .env(env)
                    .call(toStringR(configurationFile, env) + ".dist")
                    .getBool()) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "configuration",
                        NamespaceGlobal.realpath
                                .env(env)
                                .call(toStringR(configurationFile, env) + ".dist")
                                .value());
            }

        } else if (ZVal.toBool(
                        !ZVal.isset(
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("arguments")
                                                .value(),
                                        "configuration")))
                && ZVal.toBool(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("arguments").value(),
                                "useDefaultConfiguration"))) {
            if (NamespaceGlobal.file_exists.env(env).call("phpunit.xml").getBool()) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "configuration",
                        NamespaceGlobal.realpath.env(env).call("phpunit.xml").value());

            } else if (NamespaceGlobal.file_exists.env(env).call("phpunit.xml.dist").getBool()) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "configuration",
                        NamespaceGlobal.realpath.env(env).call("phpunit.xml.dist").value());
            }
        }

        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "configuration"))) {
            try {
                configuration =
                        Configuration.runtimeStaticObject.getInstance(
                                env,
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("arguments")
                                                .value(),
                                        "configuration"));
            } catch (ConvertedException convertedException52) {
                if (convertedException52.instanceOf(Throwable.class, "Throwable")) {
                    t = convertedException52.getObject();
                    env.echo(
                            toStringR(env.callMethod(t, "getMessage", Command.class), env)
                                    + toStringR("\n", env));
                    env.exit(TestRunner.CONST_FAILURE_EXIT);
                } else {
                    throw convertedException52;
                }
            }

            phpunitConfiguration =
                    env.callMethod(configuration, "getPHPUnitConfiguration", Command.class);
            env.callMethod(configuration, "handlePHPConfiguration", Command.class);
            if (ZVal.isset(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "bootstrap"))) {
                env.callMethod(
                        this,
                        "handleBootstrap",
                        Command.class,
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("arguments").value(),
                                "bootstrap"));

            } else if (ZVal.isset(ZVal.getElement(phpunitConfiguration, "bootstrap"))) {
                env.callMethod(
                        this,
                        "handleBootstrap",
                        Command.class,
                        ZVal.getElement(phpunitConfiguration, "bootstrap"));
            }

            if (ZVal.toBool(ZVal.isset(ZVal.getElement(phpunitConfiguration, "stderr")))
                    && ZVal.toBool(
                            !ZVal.isset(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("arguments")
                                                    .value(),
                                            "stderr")))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "stderr",
                        ZVal.getElement(phpunitConfiguration, "stderr"));
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.isset(
                                                    ZVal.getElement(
                                                            phpunitConfiguration,
                                                            "extensionsDirectory")))
                                    && ZVal.toBool(
                                            !ZVal.isset(
                                                    ZVal.getElement(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("arguments")
                                                                    .value(),
                                                            "noExtensions"))))
                    && ZVal.toBool(
                            NamespaceGlobal.extension_loaded.env(env).call("phar").value())) {
                env.callMethod(
                        this,
                        "handleExtensions",
                        Command.class,
                        ZVal.getElement(phpunitConfiguration, "extensionsDirectory"));
            }

            if (ZVal.toBool(ZVal.isset(ZVal.getElement(phpunitConfiguration, "columns")))
                    && ZVal.toBool(
                            !ZVal.isset(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("arguments")
                                                    .value(),
                                            "columns")))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "columns",
                        ZVal.getElement(phpunitConfiguration, "columns"));
            }

            if (ZVal.toBool(
                            !ZVal.isset(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("arguments")
                                                    .value(),
                                            "printer")))
                    && ZVal.toBool(
                            ZVal.isset(ZVal.getElement(phpunitConfiguration, "printerClass")))) {
                if (ZVal.isset(ZVal.getElement(phpunitConfiguration, "printerFile"))) {
                    file = ZVal.assign(ZVal.getElement(phpunitConfiguration, "printerFile"));

                } else {
                    file = "";
                }

                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "printer",
                        env.callMethod(
                                this,
                                "handlePrinter",
                                Command.class,
                                ZVal.getElement(phpunitConfiguration, "printerClass"),
                                file));
            }

            if (ZVal.isset(ZVal.getElement(phpunitConfiguration, "testSuiteLoaderClass"))) {
                if (ZVal.isset(ZVal.getElement(phpunitConfiguration, "testSuiteLoaderFile"))) {
                    file =
                            ZVal.assign(
                                    ZVal.getElement(phpunitConfiguration, "testSuiteLoaderFile"));

                } else {
                    file = "";
                }

                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "loader",
                        env.callMethod(
                                this,
                                "handleLoader",
                                Command.class,
                                ZVal.getElement(phpunitConfiguration, "testSuiteLoaderClass"),
                                file));
            }

            if (ZVal.toBool(
                            !ZVal.isset(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("arguments")
                                                    .value(),
                                            "testsuite")))
                    && ZVal.toBool(
                            ZVal.isset(
                                    ZVal.getElement(phpunitConfiguration, "defaultTestSuite")))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "testsuite",
                        ZVal.getElement(phpunitConfiguration, "defaultTestSuite"));
            }

            if (!ZVal.isset(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "test"))) {
                testSuite =
                        env.callMethod(
                                configuration,
                                "getTestSuiteConfiguration",
                                Command.class,
                                ZVal.isTrue(
                                                ZVal.getElement(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("arguments")
                                                                .value(),
                                                        "testsuite"))
                                        ? ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("arguments")
                                                        .value(),
                                                "testsuite")
                                        : "");
                if (ZVal.strictNotEqualityCheck(testSuite, "!==", ZVal.getNull())) {
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "test",
                            testSuite);
                }
            }

        } else if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        "bootstrap"))) {
            env.callMethod(
                    this,
                    "handleBootstrap",
                    Command.class,
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "bootstrap"));
        }

        if (ZVal.toBool(
                        ZVal.isset(
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("arguments")
                                                .value(),
                                        "printer")))
                && ZVal.toBool(
                        function_is_string
                                .f
                                .env(env)
                                .call(
                                        ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("arguments")
                                                        .value(),
                                                "printer"))
                                .value())) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                    "printer",
                    env.callMethod(
                            this,
                            "handlePrinter",
                            Command.class,
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                                    "printer")));
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.isset(
                                                ZVal.getElement(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("arguments")
                                                                .value(),
                                                        "test")))
                                && ZVal.toBool(
                                        function_is_string
                                                .f
                                                .env(env)
                                                .call(
                                                        ZVal.getElement(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("arguments")
                                                                        .value(),
                                                                "test"))
                                                .value()))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                NamespaceGlobal.substr
                                        .env(env)
                                        .call(
                                                ZVal.getElement(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("arguments")
                                                                .value(),
                                                        "test"),
                                                -5,
                                                5)
                                        .value(),
                                ".phpt"))) {
            test =
                    new PhptTestCase(
                            env,
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                                    "test"));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("arguments").value(),
                    "test",
                    new TestSuite(env));
            env.callMethod(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("arguments").value(),
                            "test"),
                    "addTest",
                    Command.class,
                    test);
        }

        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("arguments").value(), "test"))) {
            env.callMethod(this, "showHelp", Command.class);
            env.exit(TestRunner.CONST_EXCEPTION_EXIT);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "loaderClass", typeHint = "string")
    @ConvertedParameter(index = 1, name = "loaderFile", typeHint = "string")
    protected Object handleLoader(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/TextUI")
                        .setFile("/vendor/phpunit/phpunit/src/TextUI/Command.php");
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope10 scope = new Scope10();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            scope.loaderClass = assignParameter(args, 0, null);
            scope.loaderFile = assignParameter(args, 1, null);
            if (ZVal.isNull(scope.loaderFile)) {
                scope.loaderFile = "";
            }
            scope._pClass = null;
            if (!function_class_exists.f.env(env).call(scope.loaderClass, false).getBool()) {
                if (ZVal.equalityCheck(scope.loaderFile, "")) {
                    scope.loaderFile =
                            Filesystem.runtimeStaticObject.classNameToFilename(
                                    env, scope.loaderClass);
                }

                scope.loaderFile =
                        function_stream_resolve_include_path
                                .f
                                .env(env)
                                .call(scope.loaderFile)
                                .value();
                if (ZVal.isTrue(scope.loaderFile)) {
                    env.include(
                            toStringR(scope.loaderFile, env),
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            false);
                }
            }

            if (function_class_exists.f.env(env).call(scope.loaderClass, false).getBool()) {
                scope._pClass = new ReflectionClass(env, scope.loaderClass);
                if (ZVal.toBool(
                                env.callMethod(
                                        scope._pClass,
                                        "implementsInterface",
                                        Command.class,
                                        TestSuiteLoader.CONST_class))
                        && ZVal.toBool(
                                env.callMethod(scope._pClass, "isInstantiable", Command.class))) {
                    throw new IncludeEventException(
                            ZVal.assign(
                                    env.callMethod(scope._pClass, "newInstance", Command.class)));
                }
            }

            if (ZVal.equalityCheck(scope.loaderClass, StandardTestSuiteLoader.CONST_class)) {
                throw new IncludeEventException(ZVal.assign(ZVal.getNull()));
            }

            env.callMethod(
                    scope._thisVarAlias,
                    "exitWithErrorMessage",
                    Command.class,
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call("Could not use \"%s\" as loader.", scope.loaderClass)
                            .value());
            throw new IncludeEventException(ZVal.assign(ZVal.getNull()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "printerClass", typeHint = "string")
    @ConvertedParameter(index = 1, name = "printerFile", typeHint = "string")
    protected Object handlePrinter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/TextUI")
                        .setFile("/vendor/phpunit/phpunit/src/TextUI/Command.php");
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope11 scope = new Scope11();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            scope.printerClass = assignParameter(args, 0, null);
            scope.printerFile = assignParameter(args, 1, null);
            if (ZVal.isNull(scope.printerFile)) {
                scope.printerFile = "";
            }
            scope.outputStream = null;
            scope._pClass = null;
            if (!function_class_exists.f.env(env).call(scope.printerClass, false).getBool()) {
                if (ZVal.equalityCheck(scope.printerFile, "")) {
                    scope.printerFile =
                            Filesystem.runtimeStaticObject.classNameToFilename(
                                    env, scope.printerClass);
                }

                scope.printerFile =
                        function_stream_resolve_include_path
                                .f
                                .env(env)
                                .call(scope.printerFile)
                                .value();
                if (ZVal.isTrue(scope.printerFile)) {
                    env.include(
                            toStringR(scope.printerFile, env),
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            false);
                }
            }

            if (!function_class_exists.f.env(env).call(scope.printerClass).getBool()) {
                env.callMethod(
                        scope._thisVarAlias,
                        "exitWithErrorMessage",
                        Command.class,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "Could not use \"%s\" as printer: class does not exist",
                                        scope.printerClass)
                                .value());
            }

            scope._pClass = new ReflectionClass(env, scope.printerClass);
            if (!ZVal.isTrue(
                    env.callMethod(
                            scope._pClass,
                            "implementsInterface",
                            Command.class,
                            TestListener.CONST_class))) {
                env.callMethod(
                        scope._thisVarAlias,
                        "exitWithErrorMessage",
                        Command.class,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "Could not use \"%s\" as printer: class does not implement %s",
                                        scope.printerClass, TestListener.CONST_class)
                                .value());
            }

            if (!ZVal.isTrue(
                    env.callMethod(
                            scope._pClass, "isSubclassOf", Command.class, Printer.CONST_class))) {
                env.callMethod(
                        scope._thisVarAlias,
                        "exitWithErrorMessage",
                        Command.class,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "Could not use \"%s\" as printer: class does not extend %s",
                                        scope.printerClass, Printer.CONST_class)
                                .value());
            }

            if (!ZVal.isTrue(env.callMethod(scope._pClass, "isInstantiable", Command.class))) {
                env.callMethod(
                        scope._thisVarAlias,
                        "exitWithErrorMessage",
                        Command.class,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "Could not use \"%s\" as printer: class cannot be instantiated",
                                        scope.printerClass)
                                .value());
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            scope._pClass,
                            "isSubclassOf",
                            Command.class,
                            ResultPrinter.CONST_class))) {
                throw new IncludeEventException(ZVal.assign(scope.printerClass));
            }

            scope.outputStream =
                    ZVal.assign(
                            ZVal.isset(
                                            ZVal.getElement(
                                                    toObjectR(scope._thisVarAlias)
                                                            .accessProp(this, env)
                                                            .name("arguments")
                                                            .value(),
                                                    "stderr"))
                                    ? "php://stderr"
                                    : ZVal.getNull());
            throw new IncludeEventException(
                    ZVal.assign(
                            env.callMethod(
                                    scope._pClass,
                                    "newInstance",
                                    Command.class,
                                    scope.outputStream)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    protected Object handleBootstrap(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        Object e = null;
        try {
            FileLoader.runtimeStaticObject.checkAndLoad(env, filename);
        } catch (ConvertedException convertedException53) {
            if (convertedException53.instanceOf(
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
                e = convertedException53.getObject();
                env.callMethod(
                        this,
                        "exitWithErrorMessage",
                        Command.class,
                        env.callMethod(e, "getMessage", Command.class));
            } else {
                throw convertedException53;
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object handleVersionCheck(RuntimeEnv env, Object... args) {
        Object latestVersion = null;
        Object isOutdated = null;
        env.callMethod(this, "printVersionString", Command.class);
        latestVersion =
                function_file_get_contents
                        .f
                        .env(env)
                        .call("https://phar.phpunit.de/latest-version-of/phpunit")
                        .value();
        isOutdated =
                NamespaceGlobal.version_compare
                        .env(env)
                        .call(
                                latestVersion,
                                com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                        .namespaces.Runner.classes.Version.runtimeStaticObject.id(
                                        env),
                                ">")
                        .value();
        if (ZVal.isTrue(isOutdated)) {
            NamespaceGlobal.printf
                    .env(env)
                    .call(
                            "You are not using the latest version of PHPUnit."
                                    + toStringR("\n", env)
                                    + "The latest version is PHPUnit %s."
                                    + toStringR("\n", env),
                            latestVersion);

        } else {
            env.echo("You are using the latest version of PHPUnit." + toStringR("\n", env));
        }

        env.exit(TestRunner.CONST_SUCCESS_EXIT);
        return null;
    }

    @ConvertedMethod
    protected Object showHelp(RuntimeEnv env, Object... args) {
        env.callMethod(this, "printVersionString", Command.class);
        env.echo(
                "Usage: phpunit [options] UnitTest [UnitTest.php]\n       phpunit [options] <directory>\n\nCode Coverage Options:\n\n  --coverage-clover <file>    Generate code coverage report in Clover XML format.\n  --coverage-crap4j <file>    Generate code coverage report in Crap4J XML format.\n  --coverage-html <dir>       Generate code coverage report in HTML format.\n  --coverage-php <file>       Export PHP_CodeCoverage object to file.\n  --coverage-text=<file>      Generate code coverage report in text format.\n                              Default: Standard output.\n  --coverage-xml <dir>        Generate code coverage report in PHPUnit XML format.\n  --whitelist <dir>           Whitelist <dir> for code coverage analysis.\n  --disable-coverage-ignore   Disable annotations for ignoring code coverage.\n\nLogging Options:\n\n  --log-junit <file>          Log test execution in JUnit XML format to file.\n  --log-teamcity <file>       Log test execution in TeamCity format to file.\n  --testdox-html <file>       Write agile documentation in HTML format to file.\n  --testdox-text <file>       Write agile documentation in Text format to file.\n  --testdox-xml <file>        Write agile documentation in XML format to file.\n  --reverse-list              Print defects in reverse order\n\nTest Selection Options:\n\n  --filter <pattern>          Filter which tests to run.\n  --testsuite <name,...>      Filter which testsuite to run.\n  --group ...                 Only runs tests from the specified group(s).\n  --exclude-group ...         Exclude tests from the specified group(s).\n  --list-groups               List available test groups.\n  --list-suites               List available test suites.\n  --list-tests                List available tests.\n  --list-tests-xml <file>     List available tests in XML format.\n  --test-suffix ...           Only search for test in files with specified\n                              suffix(es). Default: Test.php,.phpt\n\nTest Execution Options:\n\n  --dont-report-useless-tests Do not report tests that do not test anything.\n  --strict-coverage           Be strict about @covers annotation usage.\n  --strict-global-state       Be strict about changes to global state\n  --disallow-test-output      Be strict about output during tests.\n  --disallow-resource-usage   Be strict about resource usage during small tests.\n  --enforce-time-limit        Enforce time limit based on test size.\n  --disallow-todo-tests       Disallow @todo-annotated tests.\n\n  --process-isolation         Run each test in a separate PHP process.\n  --globals-backup            Backup and restore $GLOBALS for each test.\n  --static-backup             Backup and restore static attributes for each test.\n\n  --colors=<flag>             Use colors in output (\"never\", \"auto\" or \"always\").\n  --columns <n>               Number of columns to use for progress output.\n  --columns max               Use maximum number of columns for progress output.\n  --stderr                    Write to STDERR instead of STDOUT.\n  --stop-on-error             Stop execution upon first error.\n  --stop-on-failure           Stop execution upon first error or failure.\n  --stop-on-warning           Stop execution upon first warning.\n  --stop-on-risky             Stop execution upon first risky test.\n  --stop-on-skipped           Stop execution upon first skipped test.\n  --stop-on-incomplete        Stop execution upon first incomplete test.\n  --fail-on-warning           Treat tests with warnings as failures.\n  --fail-on-risky             Treat risky tests as failures.\n  -v|--verbose                Output more verbose information.\n  --debug                     Display debugging information.\n\n  --loader <loader>           TestSuiteLoader implementation to use.\n  --repeat <times>            Runs the test(s) repeatedly.\n  --teamcity                  Report test execution progress in TeamCity format.\n  --testdox                   Report test execution progress in TestDox format.\n  --testdox-group             Only include tests from the specified group(s).\n  --testdox-exclude-group     Exclude tests from the specified group(s).\n  --printer <printer>         TestListener implementation to use.\n\nConfiguration Options:\n\n  --bootstrap <file>          A \"bootstrap\" PHP file that is run before the tests.\n  -c|--configuration <file>   Read configuration from XML file.\n  --no-configuration          Ignore default configuration file (phpunit.xml).\n  --no-coverage               Ignore code coverage configuration.\n  --no-logging                Ignore logging configuration.\n  --no-extensions             Do not load PHPUnit extensions.\n  --include-path <path(s)>    Prepend PHP's include_path with given path(s).\n  -d key[=value]              Sets a php.ini value.\n  --generate-configuration    Generate configuration file with suggested settings.\n\nMiscellaneous Options:\n\n  -h|--help                   Prints this usage information.\n  --version                   Prints the version and exits.\n  --atleast-version <min>     Checks that version is greater than min and exits.\n  --check-version             Check whether PHPUnit is the latest version.\n");
        return null;
    }

    @ConvertedMethod
    protected Object handleCustomTestSuite(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    private Object printVersionString(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("versionStringPrinted").getBool()) {
            return null;
        }

        env.echo(
                toStringR(
                                com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                        .namespaces.Runner.classes.Version.runtimeStaticObject
                                        .getVersionString(env),
                                env)
                        + toStringR("\n", env)
                        + toStringR("\n", env));
        toObjectR(this).accessProp(this, env).name("versionStringPrinted").set(true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    private Object exitWithErrorMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        env.callMethod(this, "printVersionString", Command.class);
        env.echo(toStringR(message, env) + toStringR("\n", env));
        env.exit(TestRunner.CONST_FAILURE_EXIT);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    private Object handleExtensions(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/TextUI")
                        .setFile("/vendor/phpunit/phpunit/src/TextUI/Command.php");
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope12 scope = new Scope12();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            int runtimeConverterContinueCount;
            scope.directory = assignParameter(args, 0, null);
            scope.file = null;
            scope.e = null;
            scope.manifest = null;
            scope.facade = null;
            scope.version = null;
            scope.applicationName = null;
            scope.facade = new File_Iterator_Facade(env);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult334 :
                    ZVal.getIterable(
                            env.callMethod(
                                    scope.facade,
                                    "getFilesAsArray",
                                    Command.class,
                                    scope.directory,
                                    ".phar"),
                            env,
                            true)) {
                scope.file = ZVal.assign(zpairResult334.getValue());
                if (!NamespaceGlobal.file_exists
                        .env(env)
                        .call("phar://" + toStringR(scope.file, env) + "/manifest.xml")
                        .getBool()) {
                    ZVal.setElementRecursive(
                            toObjectR(scope._thisVarAlias)
                                    .accessProp(this, env)
                                    .name("arguments")
                                    .value(),
                            toStringR(scope.file, env) + " is not an extension for PHPUnit",
                            "notLoadedExtensions",
                            ZVal.addToArray);
                    continue;
                }

                try {
                    scope.applicationName = new ApplicationName(env, "phpunit/phpunit");
                    scope.version =
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PharIo
                                    .namespaces
                                    .Version
                                    .classes
                                    .Version(
                                    env,
                                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                            .namespaces.Runner.classes.Version.runtimeStaticObject
                                            .series(env));
                    scope.manifest =
                            ManifestLoader.runtimeStaticObject.fromFile(
                                    env, "phar://" + toStringR(scope.file, env) + "/manifest.xml");
                    if (!ZVal.isTrue(
                            env.callMethod(
                                    scope.manifest,
                                    "isExtensionFor",
                                    Command.class,
                                    scope.applicationName))) {
                        ZVal.setElementRecursive(
                                toObjectR(scope._thisVarAlias)
                                        .accessProp(this, env)
                                        .name("arguments")
                                        .value(),
                                toStringR(scope.file, env) + " is not an extension for PHPUnit",
                                "notLoadedExtensions",
                                ZVal.addToArray);
                        continue;
                    }

                    if (!ZVal.isTrue(
                            env.callMethod(
                                    scope.manifest,
                                    "isExtensionFor",
                                    Command.class,
                                    scope.applicationName,
                                    scope.version))) {
                        ZVal.setElementRecursive(
                                toObjectR(scope._thisVarAlias)
                                        .accessProp(this, env)
                                        .name("arguments")
                                        .value(),
                                toStringR(scope.file, env)
                                        + " is not compatible with this version of PHPUnit",
                                "notLoadedExtensions",
                                ZVal.addToArray);
                        continue;
                    }

                } catch (ConvertedException convertedException54) {
                    if (convertedException54.instanceOf(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PharIo
                                    .namespaces
                                    .Manifest
                                    .classes
                                    .Exception
                                    .class,
                            "PharIo\\Manifest\\Exception")) {
                        scope.e = convertedException54.getObject();
                        ZVal.setElementRecursive(
                                toObjectR(scope._thisVarAlias)
                                        .accessProp(this, env)
                                        .name("arguments")
                                        .value(),
                                toStringR(scope.file, env)
                                        + ": "
                                        + toStringR(
                                                env.callMethod(
                                                        scope.e, "getMessage", Command.class),
                                                env),
                                "notLoadedExtensions",
                                ZVal.addToArray);
                        continue;
                    } else {
                        throw convertedException54;
                    }
                }

                env.include(
                        toStringR(scope.file, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
                ZVal.setElementRecursive(
                        toObjectR(scope._thisVarAlias)
                                .accessProp(this, env)
                                .name("arguments")
                                .value(),
                        toStringR(env.callMethod(scope.manifest, "getName", Command.class), env)
                                + " "
                                + toStringR(
                                        env.callMethod(
                                                env.callMethod(
                                                        scope.manifest,
                                                        "getVersion",
                                                        Command.class),
                                                "getVersionString",
                                                Command.class),
                                        env),
                        "loadedExtensions",
                        ZVal.addToArray);
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "exit", typeHint = "bool")
    private Object handleListGroups(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object exit = assignParameter(args, 1, null);
        Object groups = null;
        Object group = null;
        env.callMethod(this, "printVersionString", Command.class);
        env.echo("Available test group(s):" + toStringR("\n", env));
        groups = env.callMethod(suite, "getGroups", Command.class);
        CRArrayF.sort.env(env).call(groups);
        for (ZPair zpairResult335 : ZVal.getIterable(groups, env, true)) {
            group = ZVal.assign(zpairResult335.getValue());
            NamespaceGlobal.printf.env(env).call(" - %s" + toStringR("\n", env), group);
        }

        if (ZVal.isTrue(exit)) {
            env.exit(TestRunner.CONST_SUCCESS_EXIT);
        }

        return ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exit", typeHint = "bool")
    private Object handleListSuites(RuntimeEnv env, Object... args) {
        Object exit = assignParameter(args, 0, null);
        Object configuration = null;
        Object suiteNames = null;
        Object suiteName = null;
        env.callMethod(this, "printVersionString", Command.class);
        env.echo("Available test suite(s):" + toStringR("\n", env));
        configuration =
                Configuration.runtimeStaticObject.getInstance(
                        env,
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("arguments").value(),
                                "configuration"));
        suiteNames = env.callMethod(configuration, "getTestSuiteNames", Command.class);
        for (ZPair zpairResult336 : ZVal.getIterable(suiteNames, env, true)) {
            suiteName = ZVal.assign(zpairResult336.getValue());
            NamespaceGlobal.printf.env(env).call(" - %s" + toStringR("\n", env), suiteName);
        }

        if (ZVal.isTrue(exit)) {
            env.exit(TestRunner.CONST_SUCCESS_EXIT);
        }

        return ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "exit", typeHint = "bool")
    private Object handleListTests(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object exit = assignParameter(args, 1, null);
        Object renderer = null;
        env.callMethod(this, "printVersionString", Command.class);
        renderer = new TextTestListRenderer(env);
        env.echo(env.callMethod(renderer, "render", Command.class, suite));
        if (ZVal.isTrue(exit)) {
            env.exit(TestRunner.CONST_SUCCESS_EXIT);
        }

        return ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    @ConvertedParameter(index = 1, name = "target", typeHint = "string")
    @ConvertedParameter(index = 2, name = "exit", typeHint = "bool")
    private Object handleListTestsXml(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        Object target = assignParameter(args, 1, null);
        Object exit = assignParameter(args, 2, null);
        Object renderer = null;
        env.callMethod(this, "printVersionString", Command.class);
        renderer = new XmlTestListRenderer(env);
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(target, env.callMethod(renderer, "render", Command.class, suite));
        NamespaceGlobal.printf
                .env(env)
                .call(
                        "Wrote list of tests that would have been run to %s" + toStringR("\n", env),
                        target);
        if (ZVal.isTrue(exit)) {
            env.exit(TestRunner.CONST_SUCCESS_EXIT);
        }

        return ZVal.assign(TestRunner.CONST_SUCCESS_EXIT);
    }

    public static final Object CONST_class = "PHPUnit\\TextUI\\Command";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "exit",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object main(RuntimeEnv env, Object... args) {
            Object exit = assignParameter(args, 0, null);
            if (ZVal.isNull(exit)) {
                exit = true;
            }
            Object _SERVER = env.getGlobal("_SERVER");
            Object command = null;
            command = env.createNewWithLateStaticBindings(this);
            return env.returnWithGlobals(
                    env.callMethod(
                            command, "run", Command.class, ZVal.getElement(_SERVER, "argv"), exit),
                    "_SERVER",
                    _SERVER);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\TextUI\\Command")
                    .setLookup(Command.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "arguments", "longOptions", "options", "versionStringPrinted")
                    .setFilename("vendor/phpunit/phpunit/src/TextUI/Command.php")
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

    private static class Scope10 implements UpdateRuntimeScopeInterface {

        Object loaderClass;
        Object loaderFile;
        Object _thisVarAlias;
        Object _pClass;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("loaderClass", this.loaderClass);
            stack.setVariable("loaderFile", this.loaderFile);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("class", this._pClass);
        }

        public void updateScope(RuntimeStack stack) {

            this.loaderClass = stack.getVariable("loaderClass");
            this.loaderFile = stack.getVariable("loaderFile");
            this._thisVarAlias = stack.getVariable("this");
            this._pClass = stack.getVariable("class");
        }
    }

    private static class Scope11 implements UpdateRuntimeScopeInterface {

        Object printerClass;
        Object _thisVarAlias;
        Object outputStream;
        Object _pClass;
        Object printerFile;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("printerClass", this.printerClass);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("outputStream", this.outputStream);
            stack.setVariable("class", this._pClass);
            stack.setVariable("printerFile", this.printerFile);
        }

        public void updateScope(RuntimeStack stack) {

            this.printerClass = stack.getVariable("printerClass");
            this._thisVarAlias = stack.getVariable("this");
            this.outputStream = stack.getVariable("outputStream");
            this._pClass = stack.getVariable("class");
            this.printerFile = stack.getVariable("printerFile");
        }
    }

    private static class Scope12 implements UpdateRuntimeScopeInterface {

        Object file;
        Object e;
        Object manifest;
        Object _thisVarAlias;
        Object facade;
        Object version;
        Object directory;
        Object applicationName;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("e", this.e);
            stack.setVariable("manifest", this.manifest);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("facade", this.facade);
            stack.setVariable("version", this.version);
            stack.setVariable("directory", this.directory);
            stack.setVariable("applicationName", this.applicationName);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this.e = stack.getVariable("e");
            this.manifest = stack.getVariable("manifest");
            this._thisVarAlias = stack.getVariable("this");
            this.facade = stack.getVariable("facade");
            this.version = stack.getVariable("version");
            this.directory = stack.getVariable("directory");
            this.applicationName = stack.getVariable("applicationName");
        }
    }

    private enum SwitchEnumType17 {
        STRING___colors,
        STRING___bootstrap,
        STRING___columns,
        STRING_c,
        STRING___configuration,
        STRING___coverage_clover,
        STRING___coverage_crap4j,
        STRING___coverage_html,
        STRING___coverage_php,
        STRING___coverage_text,
        STRING___coverage_xml,
        STRING_d,
        STRING___debug,
        STRING_h,
        STRING___help,
        STRING___filter,
        STRING___testsuite,
        STRING___generate_configuration,
        STRING___group,
        STRING___exclude_group,
        STRING___test_suffix,
        STRING___include_path,
        STRING___list_groups,
        STRING___list_suites,
        STRING___list_tests,
        STRING___list_tests_xml,
        STRING___printer,
        STRING___loader,
        STRING___log_junit,
        STRING___log_teamcity,
        STRING___process_isolation,
        STRING___repeat,
        STRING___stderr,
        STRING___stop_on_error,
        STRING___stop_on_failure,
        STRING___stop_on_warning,
        STRING___stop_on_incomplete,
        STRING___stop_on_risky,
        STRING___stop_on_skipped,
        STRING___fail_on_warning,
        STRING___fail_on_risky,
        STRING___teamcity,
        STRING___testdox,
        STRING___testdox_group,
        STRING___testdox_exclude_group,
        STRING___testdox_html,
        STRING___testdox_text,
        STRING___testdox_xml,
        STRING___no_configuration,
        STRING___no_extensions,
        STRING___no_coverage,
        STRING___no_logging,
        STRING___globals_backup,
        STRING___static_backup,
        STRING_v,
        STRING___verbose,
        STRING___atleast_version,
        STRING___version,
        STRING___dont_report_useless_tests,
        STRING___strict_coverage,
        STRING___disable_coverage_ignore,
        STRING___strict_global_state,
        STRING___disallow_test_output,
        STRING___disallow_resource_usage,
        STRING___enforce_time_limit,
        STRING___disallow_todo_tests,
        STRING___reverse_list,
        STRING___check_version,
        STRING___whitelist,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
