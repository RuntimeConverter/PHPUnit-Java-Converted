package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Test;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.modules.standard.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestResult;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Exception;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.AbstractPhpProcess;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestError;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/PhptTestCase.php

*/

public class PhptTestCase extends RuntimeClassBase implements Test, SelfDescribing {

    public Object filename = null;

    public Object phpUtil = null;

    public Object settings =
            ZVal.newArray(
                    new ZPair(0, "allow_url_fopen=1"),
                    new ZPair(1, "auto_append_file="),
                    new ZPair(2, "auto_prepend_file="),
                    new ZPair(3, "disable_functions="),
                    new ZPair(4, "display_errors=1"),
                    new ZPair(5, "docref_root="),
                    new ZPair(6, "docref_ext=.html"),
                    new ZPair(7, "error_append_string="),
                    new ZPair(8, "error_prepend_string="),
                    new ZPair(9, "error_reporting=-1"),
                    new ZPair(10, "html_errors=0"),
                    new ZPair(11, "log_errors=0"),
                    new ZPair(12, "magic_quotes_runtime=0"),
                    new ZPair(13, "output_handler="),
                    new ZPair(14, "open_basedir="),
                    new ZPair(15, "output_buffering=Off"),
                    new ZPair(16, "report_memleaks=0"),
                    new ZPair(17, "report_zend_debug=0"),
                    new ZPair(18, "safe_mode=0"),
                    new ZPair(19, "xdebug.default_enable=0"));

    public PhptTestCase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhptTestCase.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "phpUtil",
        typeHint = "PHPUnit\\Util\\PHP\\AbstractPhpProcess",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        Object phpUtil = assignParameter(args, 1, null);
        if (ZVal.isNull(phpUtil)) {
            phpUtil = ZVal.getNull();
        }
        if (!NamespaceGlobal.is_file.env(env).call(filename).getBool()) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("File \"%s\" does not exist.", filename)
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("filename").set(filename);
        toObjectR(this)
                .accessProp(this, env)
                .name("phpUtil")
                .set(
                        ZVal.isTrue(phpUtil)
                                ? phpUtil
                                : AbstractPhpProcess.runtimeStaticObject.factory(env));
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return 1;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "result",
        typeHint = "PHPUnit\\Framework\\TestResult",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object run(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        if (ZVal.isNull(result)) {
            result = ZVal.getNull();
        }
        Object coverage = null;
        ReferenceContainer settings = new BasicReferenceContainer(null);
        Object code = null;
        Object e = null;
        Object skip = null;
        Object ___env = null;
        ReferenceContainer sections = new BasicReferenceContainer(ZVal.newArray());
        Object t = null;
        Object failure = null;
        Object jobResult = ZVal.newArray();
        Object time = null;
        Object xfail = null;
        sections.setObject(env.callMethod(this, "parse", PhptTestCase.class));
        code =
                env.callMethod(
                        this,
                        "render",
                        PhptTestCase.class,
                        ZVal.getElement(sections.getObject(), "FILE"));
        if (ZVal.strictEqualityCheck(result, "===", ZVal.getNull())) {
            result = new TestResult(env);
        }

        xfail = false;
        settings.setObject(
                env.callMethod(
                        this,
                        "parseIniSection",
                        PhptTestCase.class,
                        toObjectR(this).accessProp(this, env).name("settings").value()));
        env.callMethod(result, "startTest", PhptTestCase.class, this);
        if (ZVal.isset(ZVal.getElement(sections.getObject(), "INI"))) {
            settings.setObject(
                    env.callMethod(
                            this,
                            "parseIniSection",
                            PhptTestCase.class,
                            ZVal.getElement(sections.getObject(), "INI"),
                            settings.getObject()));
        }

        if (ZVal.isset(ZVal.getElement(sections.getObject(), "ENV"))) {
            ___env =
                    env.callMethod(
                            this,
                            "parseEnvSection",
                            PhptTestCase.class,
                            ZVal.getElement(sections.getObject(), "ENV"));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                    "setEnv",
                    PhptTestCase.class,
                    ___env);
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                "setUseStderrRedirection",
                PhptTestCase.class,
                true);
        if (ZVal.isTrue(env.callMethod(result, "enforcesTimeLimit", PhptTestCase.class))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                    "setTimeout",
                    PhptTestCase.class,
                    env.callMethod(result, "getTimeoutForLargeTests", PhptTestCase.class));
        }

        skip =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, sections),
                        "runSkip",
                        PhptTestCase.class,
                        sections.getObject(),
                        result,
                        settings.getObject());
        if (ZVal.isTrue(skip)) {
            return ZVal.assign(result);
        }

        if (ZVal.isset(ZVal.getElement(sections.getObject(), "XFAIL"))) {
            xfail =
                    NamespaceGlobal.trim
                            .env(env)
                            .call(ZVal.getElement(sections.getObject(), "XFAIL"))
                            .value();
        }

        if (ZVal.isset(ZVal.getElement(sections.getObject(), "STDIN"))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                    "setStdin",
                    PhptTestCase.class,
                    ZVal.getElement(sections.getObject(), "STDIN"));
        }

        if (ZVal.isset(ZVal.getElement(sections.getObject(), "ARGS"))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                    "setArgs",
                    PhptTestCase.class,
                    ZVal.getElement(sections.getObject(), "ARGS"));
        }

        if (ZVal.isTrue(
                env.callMethod(result, "getCollectCodeCoverageInformation", PhptTestCase.class))) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, settings),
                    "renderForCoverage",
                    PhptTestCase.class,
                    settings.getObject());
        }

        Timer.runtimeStaticObject.start(env);
        jobResult =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                        "runJob",
                        PhptTestCase.class,
                        code,
                        env.callMethod(
                                this, "stringifyIni", PhptTestCase.class, settings.getObject()));
        time = Timer.runtimeStaticObject.stop(env);
        if (ZVal.toBool(
                        env.callMethod(
                                result, "getCollectCodeCoverageInformation", PhptTestCase.class))
                && ZVal.toBool(
                        coverage =
                                env.callMethod(this, "cleanupForCoverage", PhptTestCase.class))) {
            env.callMethod(
                    env.callMethod(result, "getCodeCoverage", PhptTestCase.class),
                    "append",
                    PhptTestCase.class,
                    coverage,
                    this,
                    true,
                    ZVal.newArray(),
                    ZVal.newArray(),
                    true);
        }

        try {
            env.callMethod(
                    this,
                    "assertPhptExpectation",
                    PhptTestCase.class,
                    sections.getObject(),
                    ZVal.getElement(jobResult, "stdout"));
        } catch (ConvertedException convertedException49) {
            if (convertedException49.instanceOf(
                    AssertionFailedError.class, "PHPUnit\\Framework\\AssertionFailedError")) {
                e = convertedException49.getObject();
                failure = ZVal.assign(e);
                if (ZVal.strictNotEqualityCheck(xfail, "!==", false)) {
                    failure = new IncompleteTestError(env, xfail, 0, e);
                }

                env.callMethod(result, "addFailure", PhptTestCase.class, this, failure, time);
            } else if (convertedException49.instanceOf(Throwable.class, "Throwable")) {
                t = convertedException49.getObject();
                env.callMethod(result, "addError", PhptTestCase.class, this, t, time);
            } else {
                throw convertedException49;
            }
        }

        if (ZVal.toBool(env.callMethod(result, "allCompletelyImplemented", PhptTestCase.class))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(xfail, "!==", false))) {
            env.callMethod(
                    result,
                    "addFailure",
                    PhptTestCase.class,
                    this,
                    new IncompleteTestError(env, "XFAIL section but test passes"),
                    time);
        }

        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, sections),
                "runClean",
                PhptTestCase.class,
                sections.getObject());
        env.callMethod(result, "endTest", PhptTestCase.class, this, time);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "toString", PhptTestCase.class));
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("filename").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(index = 1, name = "ini", defaultValue = "", defaultValueType = "array")
    private Object parseIniSection(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object content = assignParameter(args, 0, null);
        Object ini = assignParameter(args, 1, null);
        if (ZVal.isNull(ini)) {
            ini = ZVal.newArray();
        }
        Object name = null;
        Object value = null;
        Object setting = ZVal.newArray();
        if (function_is_string.f.env(env).call(content).getBool()) {
            content =
                    NamespaceGlobal.explode
                            .env(env)
                            .call("\n", NamespaceGlobal.trim.env(env).call(content).value())
                            .value();
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult320 : ZVal.getIterable(content, env, true)) {
            setting = ZVal.assign(zpairResult320.getValue());
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strpos.env(env).call(setting, "=").value(), "===", false)) {
                continue;
            }

            setting = NamespaceGlobal.explode.env(env).call("=", setting, 2).value();
            name = NamespaceGlobal.trim.env(env).call(ZVal.getElement(setting, 0)).value();
            value = NamespaceGlobal.trim.env(env).call(ZVal.getElement(setting, 1)).value();
            if (ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "extension"))
                    || ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "zend_extension"))) {
                if (!ZVal.isset(ZVal.getElement(ini, name))) {
                    ZVal.putArrayElement(ini, name, ZVal.newArray());
                }

                ZVal.setElementRecursive(ini, value, name, ZVal.addToArray);
                continue;
            }

            ZVal.putArrayElement(ini, name, value);
        }

        return ZVal.assign(ini);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content", typeHint = "string")
    private Object parseEnvSection(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, null);
        Object e = ZVal.newArray();
        Object ___env = ZVal.newArray();
        ___env = ZVal.newArray();
        for (ZPair zpairResult321 :
                ZVal.getIterable(
                        NamespaceGlobal.explode
                                .env(env)
                                .call("\n", NamespaceGlobal.trim.env(env).call(content).value())
                                .value(),
                        env,
                        true)) {
            e = ZVal.assign(zpairResult321.getValue());
            e =
                    NamespaceGlobal.explode
                            .env(env)
                            .call("=", NamespaceGlobal.trim.env(env).call(e).value(), 2)
                            .value();
            if (ZVal.toBool(!ZVal.isEmpty(ZVal.getElement(e, 0)))
                    && ZVal.toBool(ZVal.isset(ZVal.getElement(e, 1)))) {
                ZVal.putArrayElement(___env, ZVal.getElement(e, 0), ZVal.getElement(e, 1));
            }
        }

        return ZVal.assign(___env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    @ConvertedParameter(index = 1, name = "output", typeHint = "string")
    private Object assertPhptExpectation(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object sections = assignParameter(args, 0, null);
        if (ZVal.isNull(sections)) {
            sections = ZVal.newArray();
        }
        Object output = assignParameter(args, 1, null);
        Object sectionName = null;
        ReferenceContainer actual = new BasicReferenceContainer(null);
        Object sectionContent = null;
        Object sectionAssertion = null;
        ReferenceContainer expected = new BasicReferenceContainer(null);
        Object assertion = null;
        Object assertions = null;
        assertions =
                ZVal.newArray(
                        new ZPair("EXPECT", "assertEquals"),
                        new ZPair("EXPECTF", "assertStringMatchesFormat"),
                        new ZPair("EXPECTREGEX", "assertRegExp"));
        actual.setObject(
                NamespaceGlobal.preg_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call("/\\r\\n/", "\n", NamespaceGlobal.trim.env(env).call(output).value())
                        .value());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult322 : ZVal.getIterable(assertions, env, false)) {
            sectionName = ZVal.assign(zpairResult322.getKey());
            sectionAssertion = ZVal.assign(zpairResult322.getValue());
            if (ZVal.isset(ZVal.getElement(sections, sectionName))) {
                sectionContent =
                        NamespaceGlobal.preg_replace
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call(
                                        "/\\r\\n/",
                                        "\n",
                                        NamespaceGlobal.trim
                                                .env(env)
                                                .call(ZVal.getElement(sections, sectionName))
                                                .value())
                                .value();
                assertion = ZVal.assign(sectionAssertion);
                expected.setObject(
                        ZVal.assign(
                                ZVal.strictEqualityCheck(sectionName, "===", "EXPECTREGEX")
                                        ? "/" + toStringR(sectionContent, env) + "/"
                                        : sectionContent));
                break;
            }
        }

        if (!ZVal.isset(assertion)) {
            throw ZVal.getException(env, new Exception(env, "No PHPT assertion found"));
        }

        if (!ZVal.isset(expected.getObject())) {
            throw ZVal.getException(env, new Exception(env, "No PHPT expectation found"));
        }

        Assert.runtimeStaticObject.runtimeConverterCallStaticMethod(
                env,
                assertion,
                new RuntimeArgsWithReferences().add(0, expected).add(1, actual),
                expected.getObject(),
                actual.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    @ConvertedParameter(index = 1, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    @ConvertedParameter(index = 2, name = "settings", typeHint = "array")
    private Object runSkip(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer sections = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(sections)) {
            sections.setObject(ZVal.newArray());
        }
        Object result = assignParameter(args, 1, null);
        Object settings = assignParameter(args, 2, null);
        ReferenceContainer skipMatch = new BasicReferenceContainer(ZVal.newArray());
        Object jobResult = ZVal.newArray();
        Object message = null;
        Object skipif = null;
        if (!ZVal.isset(ZVal.getElement(sections.getObject(), "SKIPIF"))) {
            return ZVal.assign(false);
        }

        skipif =
                env.callMethod(
                        this,
                        "render",
                        PhptTestCase.class,
                        ZVal.getElement(sections.getObject(), "SKIPIF"));
        jobResult =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                        "runJob",
                        PhptTestCase.class,
                        skipif,
                        env.callMethod(this, "stringifyIni", PhptTestCase.class, settings));
        if (!NamespaceGlobal.strncasecmp
                .env(env)
                .call(
                        "skip",
                        NamespaceGlobal.ltrim
                                .env(env)
                                .call(ZVal.getElement(jobResult, "stdout"))
                                .value(),
                        4)
                .getBool()) {
            message = "";
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, skipMatch))
                    .call(
                            "/^\\s*skip\\s*(.+)\\s*/i",
                            ZVal.getElement(jobResult, "stdout"),
                            skipMatch.getObject())
                    .getBool()) {
                message =
                        NamespaceGlobal.substr
                                .env(env)
                                .call(ZVal.getElement(skipMatch.getObject(), 1), 2)
                                .value();
            }

            env.callMethod(
                    result,
                    "addFailure",
                    PhptTestCase.class,
                    this,
                    new SkippedTestError(env, message),
                    0);
            env.callMethod(result, "endTest", PhptTestCase.class, this, 0);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public Object runSkip(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    private Object runClean(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer sections = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(sections)) {
            sections.setObject(ZVal.newArray());
        }
        Object cleanCode = null;
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                "setStdin",
                PhptTestCase.class,
                "");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                "setArgs",
                PhptTestCase.class,
                "");
        if (ZVal.isset(ZVal.getElement(sections.getObject(), "CLEAN"))) {
            cleanCode =
                    env.callMethod(
                            this,
                            "render",
                            PhptTestCase.class,
                            ZVal.getElement(sections.getObject(), "CLEAN"));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("phpUtil").value(),
                    "runJob",
                    PhptTestCase.class,
                    cleanCode,
                    toObjectR(this).accessProp(this, env).name("settings").value());
        }

        return null;
    }

    public Object runClean(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    private Object parse(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer result = new BasicReferenceContainer(ZVal.newArray());
        Object line = null;
        Object section = null;
        Object unsupportedSections = null;
        ReferenceContainer sections = new BasicReferenceContainer(ZVal.newArray());
        sections.setObject(ZVal.newArray());
        section = "";
        unsupportedSections =
                ZVal.newArray(
                        new ZPair(0, "REDIRECTTEST"),
                        new ZPair(1, "REQUEST"),
                        new ZPair(2, "POST"),
                        new ZPair(3, "PUT"),
                        new ZPair(4, "POST_RAW"),
                        new ZPair(5, "GZIP_POST"),
                        new ZPair(6, "DEFLATE_POST"),
                        new ZPair(7, "GET"),
                        new ZPair(8, "COOKIE"),
                        new ZPair(9, "HEADERS"),
                        new ZPair(10, "CGI"),
                        new ZPair(11, "EXPECTHEADERS"),
                        new ZPair(12, "EXTENSIONS"),
                        new ZPair(13, "PHPDBG"));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult323 :
                ZVal.getIterable(
                        NamespaceGlobal.file
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("filename")
                                                .value())
                                .value(),
                        env,
                        true)) {
            line = ZVal.assign(zpairResult323.getValue());
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, result))
                    .call("/^--([_A-Z]+)--/", line, result.getObject())
                    .getBool()) {
                section = ZVal.assign(ZVal.getElement(result.getObject(), 1));
                ZVal.putArrayElement(sections.getObject(), section, "");
                continue;
            }

            if (ZVal.isEmpty(section)) {
                throw ZVal.getException(env, new Exception(env, "Invalid PHPT file"));
            }

            ZVal.putArrayElement(
                    sections.getObject(),
                    section,
                    toStringR(ZVal.getElement(sections.getObject(), section), env)
                            + toStringR(line, env));
        }

        if (ZVal.isset(ZVal.getElement(sections.getObject(), "FILEEOF"))) {
            ZVal.putArrayElement(
                    sections.getObject(),
                    "FILE",
                    NamespaceGlobal.rtrim
                            .env(env)
                            .call(ZVal.getElement(sections.getObject(), "FILEEOF"), "\r\n")
                            .value());
            ZVal.unsetArrayElement(sections.getObject(), "FILEEOF");
        }

        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, sections),
                "parseExternal",
                PhptTestCase.class,
                sections.getObject());
        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, sections),
                        "validate",
                        PhptTestCase.class,
                        sections.getObject()))) {
            throw ZVal.getException(env, new Exception(env, "Invalid PHPT file"));
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult324 : ZVal.getIterable(unsupportedSections, env, true)) {
            section = ZVal.assign(zpairResult324.getValue());
            if (ZVal.isset(ZVal.getElement(sections.getObject(), section))) {
                throw ZVal.getException(
                        env, new Exception(env, "PHPUnit does not support this PHPT file"));
            }
        }

        return ZVal.assign(sections.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    private Object parseExternal(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer sections = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(sections)) {
            sections.setObject(ZVal.newArray());
        }
        Object testDirectory = null;
        Object allowSections = null;
        Object section = null;
        Object externalFilename = null;
        allowSections =
                ZVal.newArray(
                        new ZPair(0, "FILE"),
                        new ZPair(1, "EXPECT"),
                        new ZPair(2, "EXPECTF"),
                        new ZPair(3, "EXPECTREGEX"));
        testDirectory =
                toStringR(
                                NamespaceGlobal.dirname
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("filename")
                                                        .value())
                                        .value(),
                                env)
                        + toStringR("/", env);
        for (ZPair zpairResult325 : ZVal.getIterable(allowSections, env, true)) {
            section = ZVal.assign(zpairResult325.getValue());
            if (ZVal.isset(
                    ZVal.getElement(sections.getObject(), toStringR(section, env) + "_EXTERNAL"))) {
                externalFilename =
                        NamespaceGlobal.trim
                                .env(env)
                                .call(
                                        ZVal.getElement(
                                                sections.getObject(),
                                                toStringR(section, env) + "_EXTERNAL"))
                                .value();
                if (ZVal.toBool(
                                !NamespaceGlobal.is_file
                                        .env(env)
                                        .call(
                                                toStringR(testDirectory, env)
                                                        + toStringR(externalFilename, env))
                                        .getBool())
                        || ZVal.toBool(
                                !NamespaceGlobal.is_readable
                                        .env(env)
                                        .call(
                                                toStringR(testDirectory, env)
                                                        + toStringR(externalFilename, env))
                                        .getBool())) {
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "Could not load --%s-- %s for PHPT file",
                                                    toStringR(section, env) + "_EXTERNAL",
                                                    toStringR(testDirectory, env)
                                                            + toStringR(externalFilename, env))
                                            .value()));
                }

                ZVal.putArrayElement(
                        sections.getObject(),
                        section,
                        function_file_get_contents
                                .f
                                .env(env)
                                .call(
                                        toStringR(testDirectory, env)
                                                + toStringR(externalFilename, env))
                                .value());
                ZVal.unsetArrayElement(sections.getObject(), toStringR(section, env) + "_EXTERNAL");
            }
        }

        return null;
    }

    public Object parseExternal(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    private Object validate(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        ReferenceContainer sections = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(sections)) {
            sections.setObject(ZVal.newArray());
        }
        Object foundSection = null;
        Object anySection = null;
        Object section = null;
        Object requiredSections = null;
        requiredSections =
                ZVal.newArray(
                        new ZPair(0, "FILE"),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "EXPECT"),
                                        new ZPair(1, "EXPECTF"),
                                        new ZPair(2, "EXPECTREGEX"))));
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult326 : ZVal.getIterable(requiredSections, env, true)) {
            section = ZVal.assign(zpairResult326.getValue());
            if (function_is_array.f.env(env).call(section).getBool()) {
                foundSection = false;
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult327 : ZVal.getIterable(section, env, true)) {
                    anySection = ZVal.assign(zpairResult327.getValue());
                    if (ZVal.isset(ZVal.getElement(sections.getObject(), anySection))) {
                        foundSection = true;
                        break;
                    }
                }

                if (!ZVal.isTrue(foundSection)) {
                    return ZVal.assign(false);
                }

                continue;
            }

            if (!ZVal.isset(ZVal.getElement(sections.getObject(), section))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    public Object validate(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    private Object render(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.str_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call(
                                ZVal.newArray(new ZPair(0, "__DIR__"), new ZPair(1, "__FILE__")),
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                "'"
                                                        + toStringR(
                                                                NamespaceGlobal.dirname
                                                                        .env(env)
                                                                        .call(
                                                                                toObjectR(this)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "filename")
                                                                                        .value())
                                                                        .value(),
                                                                env)
                                                        + "'"),
                                        new ZPair(
                                                1,
                                                "'"
                                                        + toStringR(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("filename")
                                                                        .value(),
                                                                env)
                                                        + "'")),
                                code)
                        .value());
    }

    @ConvertedMethod
    private Object getCoverageFiles(RuntimeEnv env, Object... args) {
        Object baseDir = null;
        Object basename = null;
        baseDir =
                toStringR(
                                NamespaceGlobal.dirname
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("filename")
                                                        .value())
                                        .value(),
                                env)
                        + toStringR("/", env);
        basename =
                NamespaceGlobal.basename
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("filename").value(),
                                "phpt")
                        .value();
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "coverage",
                                toStringR(baseDir, env) + toStringR(basename, env) + "coverage"),
                        new ZPair(
                                "job",
                                toStringR(baseDir, env) + toStringR(basename, env) + "php")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "settings", typeHint = "array")
    private Object renderForCoverage(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer settings = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(settings)) {
            settings.setObject(ZVal.newArray());
        }
        Object template = null;
        Object GLOBALS = env.getGlobal("GLOBALS");
        Object globals = null;
        Object files = ZVal.newArray();
        Object phar = null;
        Object composerAutoload = null;
        files = env.callMethod(this, "getCoverageFiles", PhptTestCase.class);
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/phpunit/phpunit/src/Runner"),
                                        env)
                                + "/../Util/PHP/Template/PhptTestCase.tpl");
        composerAutoload = "''";
        if (ZVal.toBool(function_defined.f.env(env).call("PHPUNIT_COMPOSER_INSTALL").value())
                && ZVal.toBool(!function_defined.f.env(env).call("PHPUNIT_TESTSUITE").getBool())) {
            composerAutoload =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(function_constant.f.call(env, "PHPUNIT_COMPOSER_INSTALL"), true)
                            .value();
        }

        phar = "''";
        if (function_defined.f.env(env).call("__PHPUNIT_PHAR__").getBool()) {
            phar =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(function_constant.f.call(env, "__PHPUNIT_PHAR__"), true)
                            .value();
        }

        globals = "";
        if (!ZVal.isEmpty(ZVal.getElement(GLOBALS, "__PHPUNIT_BOOTSTRAP"))) {
            globals =
                    "$GLOBALS['__PHPUNIT_BOOTSTRAP'] = "
                            + toStringR(
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(GLOBALS, "__PHPUNIT_BOOTSTRAP"),
                                                    true)
                                            .value(),
                                    env)
                            + ";\n";
        }

        env.callMethod(
                template,
                "setVar",
                PhptTestCase.class,
                ZVal.newArray(
                        new ZPair("composerAutoload", composerAutoload),
                        new ZPair("phar", phar),
                        new ZPair("globals", globals),
                        new ZPair("job", ZVal.getElement(files, "job")),
                        new ZPair("coverageFile", ZVal.getElement(files, "coverage")),
                        new ZPair(
                                "autoPrependFile",
                                NamespaceGlobal.var_export
                                        .env(env)
                                        .call(
                                                !ZVal.isEmpty(
                                                                ZVal.getElement(
                                                                        settings.getObject(),
                                                                        "auto_prepend_file"))
                                                        ? ZVal.getElement(
                                                                settings.getObject(),
                                                                "auto_prepend_file")
                                                        : false,
                                                true)
                                        .value())));
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        ZVal.getElement(files, "job"),
                        env.callMethod(template, "render", PhptTestCase.class));
        ZVal.putArrayElement(
                settings.getObject(), "auto_prepend_file", ZVal.getElement(files, "job"));
        return env.returnWithGlobals(null, "GLOBALS", GLOBALS);
    }

    public Object renderForCoverage(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    private Object cleanupForCoverage(RuntimeEnv env, Object... args) {
        Object coverage = null;
        Object file = null;
        Object files = ZVal.newArray();
        files = env.callMethod(this, "getCoverageFiles", PhptTestCase.class);
        coverage =
                function_unserialize
                        .f
                        .env(env)
                        .call(
                                function_file_get_contents
                                        .f
                                        .env(env)
                                        .call(ZVal.getElement(files, "coverage"))
                                        .value())
                        .value();
        for (ZPair zpairResult328 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult328.getValue());
            NamespaceGlobal.unlink.env(env).call(file).value();
        }

        return ZVal.assign(coverage);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ini", typeHint = "array")
    private Object stringifyIni(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object ini = assignParameter(args, 0, null);
        Object val = null;
        Object settings = ZVal.newArray();
        Object value = null;
        Object key = null;
        settings = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult329 : ZVal.getIterable(ini, env, false)) {
            key = ZVal.assign(zpairResult329.getKey());
            value = ZVal.assign(zpairResult329.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult330 : ZVal.getIterable(value, env, true)) {
                    val = ZVal.assign(zpairResult330.getValue());
                    ZVal.addToArray(settings, toStringR(key, env) + "=" + toStringR(val, env));
                }

                continue;
            }

            ZVal.addToArray(settings, toStringR(key, env) + "=" + toStringR(value, env));
        }

        return ZVal.assign(settings);
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\PhptTestCase";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\PhptTestCase")
                    .setLookup(PhptTestCase.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("filename", "phpUtil", "settings")
                    .setFilename("vendor/phpunit/phpunit/src/Runner/PhptTestCase.php")
                    .addInterface("Test")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
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
