package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMXPath;
import com.runtimeconverter.runtime.modules.standard.stream.function_stream_resolve_include_path;
import com.runtimeconverter.runtime.modules.standard.constants.function_define;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMElement;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.File_Iterator_Facade;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Xml;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Configuration.php

*/

public final class Configuration extends RuntimeClassBase {

    public Object document = null;

    public Object xpath = null;

    public Object filename = null;

    public Configuration(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Configuration.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    private Object __construct(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("filename").set(filename);
        toObjectR(this)
                .accessProp(this, env)
                .name("document")
                .set(Xml.runtimeStaticObject.loadFile(env, filename, false, true, true));
        toObjectR(this)
                .accessProp(this, env)
                .name("xpath")
                .set(
                        new DOMXPath(
                                env,
                                toObjectR(this).accessProp(this, env).name("document").value()));
        return null;
    }

    @ConvertedMethod
    protected Object __clone(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object getFilename(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("filename").value());
    }

    @ConvertedMethod
    public Object getExtensionConfiguration(RuntimeEnv env, Object... args) {
        Object result = ZVal.newArray();
        Object extension = null;
        Object file = null;
        Object _pClass = null;
        result = ZVal.newArray();
        for (ZPair zpairResult355 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                "extensions/extension"),
                        env,
                        true)) {
            extension = ZVal.assign(zpairResult355.getValue());
            _pClass =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            extension,
                                            "getAttribute",
                                            Configuration.class,
                                            "class"),
                                    env));
            file = "";
            if (ZVal.isTrue(
                    env.callMethod(extension, "getAttribute", Configuration.class, "file"))) {
                file =
                        env.callMethod(
                                this,
                                "toAbsolutePath",
                                Configuration.class,
                                toStringR(
                                        env.callMethod(
                                                extension,
                                                "getAttribute",
                                                Configuration.class,
                                                "file"),
                                        env),
                                true);
            }

            ZVal.addToArray(
                    result, ZVal.newArray(new ZPair("class", _pClass), new ZPair("file", file)));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getFilterConfiguration(RuntimeEnv env, Object... args) {
        Object processUncoveredFilesFromWhitelist = null;
        Object includeFile = null;
        Object tmp = null;
        Object excludeDirectory = null;
        Object includeDirectory = null;
        Object excludeFile = null;
        Object addUncoveredFilesFromWhitelist = null;
        addUncoveredFilesFromWhitelist = true;
        processUncoveredFilesFromWhitelist = false;
        includeDirectory = ZVal.newArray();
        includeFile = ZVal.newArray();
        excludeDirectory = ZVal.newArray();
        excludeFile = ZVal.newArray();
        tmp =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("xpath").value(),
                        "query",
                        Configuration.class,
                        "filter/whitelist");
        if (ZVal.strictEqualityCheck(
                toObjectR(tmp).accessProp(this, env).name("length").value(), "===", 1)) {
            if (ZVal.isTrue(
                    env.callMethod(
                            env.callMethod(tmp, "item", Configuration.class, 0),
                            "hasAttribute",
                            Configuration.class,
                            "addUncoveredFilesFromWhitelist"))) {
                addUncoveredFilesFromWhitelist =
                        env.callMethod(
                                this,
                                "getBoolean",
                                Configuration.class,
                                toStringR(
                                        env.callMethod(
                                                env.callMethod(tmp, "item", Configuration.class, 0),
                                                "getAttribute",
                                                Configuration.class,
                                                "addUncoveredFilesFromWhitelist"),
                                        env),
                                true);
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            env.callMethod(tmp, "item", Configuration.class, 0),
                            "hasAttribute",
                            Configuration.class,
                            "processUncoveredFilesFromWhitelist"))) {
                processUncoveredFilesFromWhitelist =
                        env.callMethod(
                                this,
                                "getBoolean",
                                Configuration.class,
                                toStringR(
                                        env.callMethod(
                                                env.callMethod(tmp, "item", Configuration.class, 0),
                                                "getAttribute",
                                                Configuration.class,
                                                "processUncoveredFilesFromWhitelist"),
                                        env),
                                false);
            }

            includeDirectory =
                    env.callMethod(
                            this,
                            "readFilterDirectories",
                            Configuration.class,
                            "filter/whitelist/directory");
            includeFile =
                    env.callMethod(
                            this, "readFilterFiles", Configuration.class, "filter/whitelist/file");
            excludeDirectory =
                    env.callMethod(
                            this,
                            "readFilterDirectories",
                            Configuration.class,
                            "filter/whitelist/exclude/directory");
            excludeFile =
                    env.callMethod(
                            this,
                            "readFilterFiles",
                            Configuration.class,
                            "filter/whitelist/exclude/file");
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "whitelist",
                                ZVal.newArray(
                                        new ZPair(
                                                "addUncoveredFilesFromWhitelist",
                                                addUncoveredFilesFromWhitelist),
                                        new ZPair(
                                                "processUncoveredFilesFromWhitelist",
                                                processUncoveredFilesFromWhitelist),
                                        new ZPair(
                                                "include",
                                                ZVal.newArray(
                                                        new ZPair("directory", includeDirectory),
                                                        new ZPair("file", includeFile))),
                                        new ZPair(
                                                "exclude",
                                                ZVal.newArray(
                                                        new ZPair("directory", excludeDirectory),
                                                        new ZPair("file", excludeFile)))))));
    }

    @ConvertedMethod
    public Object getGroupConfiguration(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "parseGroupConfiguration", Configuration.class, "groups"));
    }

    @ConvertedMethod
    public Object getTestdoxGroupConfiguration(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this, "parseGroupConfiguration", Configuration.class, "testdoxGroups"));
    }

    @ConvertedMethod
    public Object getListenerConfiguration(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object result = ZVal.newArray();
        Object node = null;
        Object argument = null;
        Object file = null;
        Object listener = null;
        Object arguments = ZVal.newArray();
        Object _pClass = null;
        result = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult356 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                "listeners/listener"),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult356.getValue());
            _pClass =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            listener, "getAttribute", Configuration.class, "class"),
                                    env));
            file = "";
            arguments = ZVal.newArray();
            if (ZVal.isTrue(
                    env.callMethod(listener, "getAttribute", Configuration.class, "file"))) {
                file =
                        env.callMethod(
                                this,
                                "toAbsolutePath",
                                Configuration.class,
                                toStringR(
                                        env.callMethod(
                                                listener,
                                                "getAttribute",
                                                Configuration.class,
                                                "file"),
                                        env),
                                true);
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult357 :
                    ZVal.getIterable(
                            toObjectR(listener).accessProp(this, env).name("childNodes").value(),
                            env,
                            true)) {
                node = ZVal.assign(zpairResult357.getValue());
                if (!ZVal.isTrue(ZVal.checkInstanceType(node, DOMElement.class, "DOMElement"))) {
                    continue;
                }

                if (ZVal.strictNotEqualityCheck(
                        toObjectR(node).accessProp(this, env).name("tagName").value(),
                        "!==",
                        "arguments")) {
                    continue;
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult358 :
                        ZVal.getIterable(
                                toObjectR(node).accessProp(this, env).name("childNodes").value(),
                                env,
                                true)) {
                    argument = ZVal.assign(zpairResult358.getValue());
                    if (!ZVal.isTrue(
                            ZVal.checkInstanceType(argument, DOMElement.class, "DOMElement"))) {
                        continue;
                    }

                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            toObjectR(argument)
                                                    .accessProp(this, env)
                                                    .name("tagName")
                                                    .value(),
                                            "===",
                                            "file"))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            toObjectR(argument)
                                                    .accessProp(this, env)
                                                    .name("tagName")
                                                    .value(),
                                            "===",
                                            "directory"))) {
                        ZVal.addToArray(
                                arguments,
                                env.callMethod(
                                        this,
                                        "toAbsolutePath",
                                        Configuration.class,
                                        toStringR(
                                                toObjectR(argument)
                                                        .accessProp(this, env)
                                                        .name("textContent")
                                                        .value(),
                                                env)));

                    } else {
                        ZVal.addToArray(
                                arguments, Xml.runtimeStaticObject.xmlToVariable(env, argument));
                    }
                }
            }

            ZVal.addToArray(
                    result,
                    ZVal.newArray(
                            new ZPair("class", _pClass),
                            new ZPair("file", file),
                            new ZPair("arguments", arguments)));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getLoggingConfiguration(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object result = ZVal.newArray();
        Object log = null;
        Object type = null;
        Object target = null;
        result = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult359 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                "logging/log"),
                        env,
                        true)) {
            log = ZVal.assign(zpairResult359.getValue());
            type =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            log, "getAttribute", Configuration.class, "type"),
                                    env));
            target =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            log, "getAttribute", Configuration.class, "target"),
                                    env));
            if (!ZVal.isTrue(target)) {
                continue;
            }

            target = env.callMethod(this, "toAbsolutePath", Configuration.class, target);
            if (ZVal.strictEqualityCheck(type, "===", "coverage-html")) {
                if (ZVal.isTrue(
                        env.callMethod(
                                log, "hasAttribute", Configuration.class, "lowUpperBound"))) {
                    ZVal.putArrayElement(
                            result,
                            "lowUpperBound",
                            env.callMethod(
                                    this,
                                    "getInteger",
                                    Configuration.class,
                                    toStringR(
                                            env.callMethod(
                                                    log,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "lowUpperBound"),
                                            env),
                                    50));
                }

                if (ZVal.isTrue(
                        env.callMethod(
                                log, "hasAttribute", Configuration.class, "highLowerBound"))) {
                    ZVal.putArrayElement(
                            result,
                            "highLowerBound",
                            env.callMethod(
                                    this,
                                    "getInteger",
                                    Configuration.class,
                                    toStringR(
                                            env.callMethod(
                                                    log,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "highLowerBound"),
                                            env),
                                    90));
                }

            } else if (ZVal.strictEqualityCheck(type, "===", "coverage-crap4j")) {
                if (ZVal.isTrue(
                        env.callMethod(log, "hasAttribute", Configuration.class, "threshold"))) {
                    ZVal.putArrayElement(
                            result,
                            "crap4jThreshold",
                            env.callMethod(
                                    this,
                                    "getInteger",
                                    Configuration.class,
                                    toStringR(
                                            env.callMethod(
                                                    log,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "threshold"),
                                            env),
                                    30));
                }

            } else if (ZVal.strictEqualityCheck(type, "===", "coverage-text")) {
                if (ZVal.isTrue(
                        env.callMethod(
                                log, "hasAttribute", Configuration.class, "showUncoveredFiles"))) {
                    ZVal.putArrayElement(
                            result,
                            "coverageTextShowUncoveredFiles",
                            env.callMethod(
                                    this,
                                    "getBoolean",
                                    Configuration.class,
                                    toStringR(
                                            env.callMethod(
                                                    log,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "showUncoveredFiles"),
                                            env),
                                    false));
                }

                if (ZVal.isTrue(
                        env.callMethod(
                                log, "hasAttribute", Configuration.class, "showOnlySummary"))) {
                    ZVal.putArrayElement(
                            result,
                            "coverageTextShowOnlySummary",
                            env.callMethod(
                                    this,
                                    "getBoolean",
                                    Configuration.class,
                                    toStringR(
                                            env.callMethod(
                                                    log,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "showOnlySummary"),
                                            env),
                                    false));
                }
            }

            ZVal.putArrayElement(result, type, target);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getPHPConfiguration(RuntimeEnv env, Object... args) {
        Object result = ZVal.newArray();
        Object path = null;
        Object _pConst = null;
        Object ini = null;
        Object array = null;
        Object var = null;
        Object name = null;
        Object includePath = null;
        Object force = null;
        Object value = null;
        Object verbatim = null;
        result =
                ZVal.newArray(
                        new ZPair("include_path", ZVal.newArray()),
                        new ZPair("ini", ZVal.newArray()),
                        new ZPair("const", ZVal.newArray()),
                        new ZPair("var", ZVal.newArray()),
                        new ZPair("env", ZVal.newArray()),
                        new ZPair("post", ZVal.newArray()),
                        new ZPair("get", ZVal.newArray()),
                        new ZPair("cookie", ZVal.newArray()),
                        new ZPair("server", ZVal.newArray()),
                        new ZPair("files", ZVal.newArray()),
                        new ZPair("request", ZVal.newArray()));
        for (ZPair zpairResult360 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                "php/includePath"),
                        env,
                        true)) {
            includePath = ZVal.assign(zpairResult360.getValue());
            path =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(includePath)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isTrue(path)) {
                ZVal.setElementRecursive(
                        result,
                        env.callMethod(this, "toAbsolutePath", Configuration.class, path),
                        "include_path",
                        ZVal.addToArray);
            }
        }

        for (ZPair zpairResult361 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                "php/ini"),
                        env,
                        true)) {
            ini = ZVal.assign(zpairResult361.getValue());
            name =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            ini, "getAttribute", Configuration.class, "name"),
                                    env));
            value =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            ini, "getAttribute", Configuration.class, "value"),
                                    env));
            ZVal.setElementRecursive(result, value, "ini", name, "value");
        }

        for (ZPair zpairResult362 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                "php/const"),
                        env,
                        true)) {
            _pConst = ZVal.assign(zpairResult362.getValue());
            name =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            _pConst, "getAttribute", Configuration.class, "name"),
                                    env));
            value =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            _pConst, "getAttribute", Configuration.class, "value"),
                                    env));
            ZVal.setElementRecursive(
                    result,
                    env.callMethod(this, "getBoolean", Configuration.class, value, value),
                    "const",
                    name,
                    "value");
        }

        for (ZPair zpairResult363 :
                ZVal.getIterable(
                        ZVal.newArray(
                                new ZPair(0, "var"),
                                new ZPair(1, "env"),
                                new ZPair(2, "post"),
                                new ZPair(3, "get"),
                                new ZPair(4, "cookie"),
                                new ZPair(5, "server"),
                                new ZPair(6, "files"),
                                new ZPair(7, "request")),
                        env,
                        true)) {
            array = ZVal.assign(zpairResult363.getValue());
            for (ZPair zpairResult364 :
                    ZVal.getIterable(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("xpath").value(),
                                    "query",
                                    Configuration.class,
                                    "php/" + toStringR(array, env)),
                            env,
                            true)) {
                var = ZVal.assign(zpairResult364.getValue());
                name =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                var, "getAttribute", Configuration.class, "name"),
                                        env));
                value =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                var, "getAttribute", Configuration.class, "value"),
                                        env));
                verbatim = false;
                if (ZVal.isTrue(
                        env.callMethod(var, "hasAttribute", Configuration.class, "verbatim"))) {
                    verbatim =
                            env.callMethod(
                                    this,
                                    "getBoolean",
                                    Configuration.class,
                                    env.callMethod(
                                            var, "getAttribute", Configuration.class, "verbatim"),
                                    false);
                    ZVal.setElementRecursive(result, verbatim, array, name, "verbatim");
                }

                if (ZVal.isTrue(
                        env.callMethod(var, "hasAttribute", Configuration.class, "force"))) {
                    force =
                            env.callMethod(
                                    this,
                                    "getBoolean",
                                    Configuration.class,
                                    env.callMethod(
                                            var, "getAttribute", Configuration.class, "force"),
                                    false);
                    ZVal.setElementRecursive(result, force, array, name, "force");
                }

                if (!ZVal.isTrue(verbatim)) {
                    value = env.callMethod(this, "getBoolean", Configuration.class, value, value);
                }

                ZVal.setElementRecursive(result, value, array, name, "value");
            }
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object handlePHPConfiguration(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer GLOBALS = new BasicReferenceContainer(env.getGlobal("GLOBALS"));
        Object _ENV = ZVal.newArray();
        Object data = ZVal.newArray();
        Object configuration = ZVal.newArray();
        Object array = null;
        ReferenceContainer _SERVER = new BasicReferenceContainer(env.getGlobal("_SERVER"));
        Object name = null;
        Object force = null;
        Object value = null;
        ReferenceContainer target = new BasicReferenceContainer(ZVal.newArray());
        configuration = env.callMethod(this, "getPHPConfiguration", Configuration.class);
        if (!ZVal.isEmpty(ZVal.getElement(configuration, "include_path"))) {
            NamespaceGlobal.ini_set
                    .env(env)
                    .call(
                            "include_path",
                            toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ":",
                                                            ZVal.getElement(
                                                                    configuration, "include_path"))
                                                    .value(),
                                            env)
                                    + toStringR(":", env)
                                    + toStringR(
                                            NamespaceGlobal.ini_get
                                                    .env(env)
                                                    .call("include_path")
                                                    .value(),
                                            env));
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult365 :
                ZVal.getIterable(ZVal.getElement(configuration, "ini"), env, false)) {
            name = ZVal.assign(zpairResult365.getKey());
            data = ZVal.assign(zpairResult365.getValue());
            value = ZVal.assign(ZVal.getElement(data, "value"));
            if (function_defined.f.env(env).call(value).getBool()) {
                value =
                        ZVal.assign(
                                toStringR(function_constant.f.env(env).call(value).value(), env));
            }

            NamespaceGlobal.ini_set.env(env).call(name, value);
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult366 :
                ZVal.getIterable(ZVal.getElement(configuration, "const"), env, false)) {
            name = ZVal.assign(zpairResult366.getKey());
            data = ZVal.assign(zpairResult366.getValue());
            value = ZVal.assign(ZVal.getElement(data, "value"));
            if (!function_defined.f.env(env).call(name).getBool()) {
                function_define.f.env(env).call(name, value);
            }
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult367 :
                ZVal.getIterable(
                        ZVal.newArray(
                                new ZPair(0, "var"),
                                new ZPair(1, "post"),
                                new ZPair(2, "get"),
                                new ZPair(3, "cookie"),
                                new ZPair(4, "server"),
                                new ZPair(5, "files"),
                                new ZPair(6, "request")),
                        env,
                        true)) {
            array = ZVal.assign(zpairResult367.getValue());
            SwitchEnumType18 switchVariable18 =
                    ZVal.getEnum(
                            array,
                            SwitchEnumType18.DEFAULT_CASE,
                            SwitchEnumType18.STRING_var,
                            "var",
                            SwitchEnumType18.STRING_server,
                            "server");
            switch (switchVariable18) {
                case STRING_var:
                    target = GLOBALS;
                    break;
                case STRING_server:
                    target = _SERVER;
                    break;
                case DEFAULT_CASE:
                    target =
                            new ArrayDimensionReference(
                                    GLOBALS.getObject(),
                                    "_"
                                            + toStringR(
                                                    NamespaceGlobal.strtoupper
                                                            .env(env)
                                                            .call(array)
                                                            .value(),
                                                    env));
                    break;
            }
            ;
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult368 :
                    ZVal.getIterable(ZVal.getElement(configuration, array), env, false)) {
                name = ZVal.assign(zpairResult368.getKey());
                data = ZVal.assign(zpairResult368.getValue());
                ZVal.putArrayElement(target.getObject(), name, ZVal.getElement(data, "value"));
            }
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult369 :
                ZVal.getIterable(ZVal.getElement(configuration, "env"), env, false)) {
            name = ZVal.assign(zpairResult369.getKey());
            data = ZVal.assign(zpairResult369.getValue());
            value = ZVal.assign(ZVal.getElement(data, "value"));
            force =
                    ZVal.assign(
                            ZVal.isTrue(ZVal.getElement(data, "force"))
                                    ? ZVal.getElement(data, "force")
                                    : false);
            if (ZVal.toBool(force)
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    NamespaceGlobal.getenv.env(env).call(name).value(),
                                    "===",
                                    false))) {
                NamespaceGlobal.putenv
                        .env(env)
                        .call(toStringR(name, env) + "=" + toStringR(value, env));
            }

            if (!ZVal.isset(ZVal.getElement(_ENV, name))) {
                ZVal.putArrayElement(_ENV, name, value);
            }

            if (ZVal.strictEqualityCheck(force, "===", true)) {
                ZVal.putArrayElement(_ENV, name, value);
            }
        }

        return env.returnWithGlobals(null, "GLOBALS", GLOBALS, "_SERVER", _SERVER);
    }

    @ConvertedMethod
    public Object getPHPUnitConfiguration(RuntimeEnv env, Object... args) {
        Object result = ZVal.newArray();
        Object columns = null;
        Object root = null;
        result = ZVal.newArray();
        root =
                ZVal.assign(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("document")
                                .getObject()
                                .accessProp(this, env)
                                .name("documentElement")
                                .value());
        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "cacheTokens"))) {
            ZVal.putArrayElement(
                    result,
                    "cacheTokens",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "cacheTokens"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "columns"))) {
            columns =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            root, "getAttribute", Configuration.class, "columns"),
                                    env));
            if (ZVal.strictEqualityCheck(columns, "===", "max")) {
                ZVal.putArrayElement(result, "columns", "max");

            } else {
                ZVal.putArrayElement(
                        result,
                        "columns",
                        env.callMethod(this, "getInteger", Configuration.class, columns, 80));
            }
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "colors"))) {
            if (ZVal.isTrue(
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            env.callMethod(root, "getAttribute", Configuration.class, "colors"),
                            false))) {
                ZVal.putArrayElement(result, "colors", ResultPrinter.CONST_COLOR_AUTO);

            } else {
                ZVal.putArrayElement(result, "colors", ResultPrinter.CONST_COLOR_NEVER);
            }
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "stderr"))) {
            ZVal.putArrayElement(
                    result,
                    "stderr",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root, "getAttribute", Configuration.class, "stderr"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "backupGlobals"))) {
            ZVal.putArrayElement(
                    result,
                    "backupGlobals",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "backupGlobals"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "backupStaticAttributes"))) {
            ZVal.putArrayElement(
                    result,
                    "backupStaticAttributes",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "backupStaticAttributes"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(env.callMethod(root, "getAttribute", Configuration.class, "bootstrap"))) {
            ZVal.putArrayElement(
                    result,
                    "bootstrap",
                    env.callMethod(
                            this,
                            "toAbsolutePath",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root, "getAttribute", Configuration.class, "bootstrap"),
                                    env)));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "convertDeprecationsToExceptions"))) {
            ZVal.putArrayElement(
                    result,
                    "convertDeprecationsToExceptions",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "convertDeprecationsToExceptions"),
                                    env),
                            true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "convertErrorsToExceptions"))) {
            ZVal.putArrayElement(
                    result,
                    "convertErrorsToExceptions",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "convertErrorsToExceptions"),
                                    env),
                            true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "convertNoticesToExceptions"))) {
            ZVal.putArrayElement(
                    result,
                    "convertNoticesToExceptions",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "convertNoticesToExceptions"),
                                    env),
                            true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "convertWarningsToExceptions"))) {
            ZVal.putArrayElement(
                    result,
                    "convertWarningsToExceptions",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "convertWarningsToExceptions"),
                                    env),
                            true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "forceCoversAnnotation"))) {
            ZVal.putArrayElement(
                    result,
                    "forceCoversAnnotation",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "forceCoversAnnotation"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "disableCodeCoverageIgnore"))) {
            ZVal.putArrayElement(
                    result,
                    "disableCodeCoverageIgnore",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "disableCodeCoverageIgnore"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "processIsolation"))) {
            ZVal.putArrayElement(
                    result,
                    "processIsolation",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "processIsolation"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "stopOnError"))) {
            ZVal.putArrayElement(
                    result,
                    "stopOnError",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "stopOnError"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "stopOnFailure"))) {
            ZVal.putArrayElement(
                    result,
                    "stopOnFailure",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "stopOnFailure"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "stopOnWarning"))) {
            ZVal.putArrayElement(
                    result,
                    "stopOnWarning",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "stopOnWarning"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "stopOnIncomplete"))) {
            ZVal.putArrayElement(
                    result,
                    "stopOnIncomplete",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "stopOnIncomplete"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "stopOnRisky"))) {
            ZVal.putArrayElement(
                    result,
                    "stopOnRisky",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "stopOnRisky"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "stopOnSkipped"))) {
            ZVal.putArrayElement(
                    result,
                    "stopOnSkipped",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "stopOnSkipped"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "failOnWarning"))) {
            ZVal.putArrayElement(
                    result,
                    "failOnWarning",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "failOnWarning"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "failOnRisky"))) {
            ZVal.putArrayElement(
                    result,
                    "failOnRisky",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "failOnRisky"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "testSuiteLoaderClass"))) {
            ZVal.putArrayElement(
                    result,
                    "testSuiteLoaderClass",
                    toStringR(
                            env.callMethod(
                                    root,
                                    "getAttribute",
                                    Configuration.class,
                                    "testSuiteLoaderClass"),
                            env));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "defaultTestSuite"))) {
            ZVal.putArrayElement(
                    result,
                    "defaultTestSuite",
                    toStringR(
                            env.callMethod(
                                    root, "getAttribute", Configuration.class, "defaultTestSuite"),
                            env));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "getAttribute", Configuration.class, "testSuiteLoaderFile"))) {
            ZVal.putArrayElement(
                    result,
                    "testSuiteLoaderFile",
                    env.callMethod(
                            this,
                            "toAbsolutePath",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "testSuiteLoaderFile"),
                                    env)));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "printerClass"))) {
            ZVal.putArrayElement(
                    result,
                    "printerClass",
                    toStringR(
                            env.callMethod(
                                    root, "getAttribute", Configuration.class, "printerClass"),
                            env));
        }

        if (ZVal.isTrue(env.callMethod(root, "getAttribute", Configuration.class, "printerFile"))) {
            ZVal.putArrayElement(
                    result,
                    "printerFile",
                    env.callMethod(
                            this,
                            "toAbsolutePath",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "printerFile"),
                                    env)));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutChangesToGlobalState"))) {
            ZVal.putArrayElement(
                    result,
                    "beStrictAboutChangesToGlobalState",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "beStrictAboutChangesToGlobalState"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutOutputDuringTests"))) {
            ZVal.putArrayElement(
                    result,
                    "disallowTestOutput",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "beStrictAboutOutputDuringTests"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutResourceUsageDuringSmallTests"))) {
            ZVal.putArrayElement(
                    result,
                    "beStrictAboutResourceUsageDuringSmallTests",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "beStrictAboutResourceUsageDuringSmallTests"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutTestsThatDoNotTestAnything"))) {
            ZVal.putArrayElement(
                    result,
                    "reportUselessTests",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "beStrictAboutTestsThatDoNotTestAnything"),
                                    env),
                            true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutTodoAnnotatedTests"))) {
            ZVal.putArrayElement(
                    result,
                    "disallowTodoAnnotatedTests",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "beStrictAboutTodoAnnotatedTests"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutCoversAnnotation"))) {
            ZVal.putArrayElement(
                    result,
                    "strictCoverage",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "beStrictAboutCoversAnnotation"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "enforceTimeLimit"))) {
            ZVal.putArrayElement(
                    result,
                    "enforceTimeLimit",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "enforceTimeLimit"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "ignoreDeprecatedCodeUnitsFromCodeCoverage"))) {
            ZVal.putArrayElement(
                    result,
                    "ignoreDeprecatedCodeUnitsFromCodeCoverage",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "ignoreDeprecatedCodeUnitsFromCodeCoverage"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "timeoutForSmallTests"))) {
            ZVal.putArrayElement(
                    result,
                    "timeoutForSmallTests",
                    env.callMethod(
                            this,
                            "getInteger",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "timeoutForSmallTests"),
                                    env),
                            1));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "timeoutForMediumTests"))) {
            ZVal.putArrayElement(
                    result,
                    "timeoutForMediumTests",
                    env.callMethod(
                            this,
                            "getInteger",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "timeoutForMediumTests"),
                                    env),
                            10));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "timeoutForLargeTests"))) {
            ZVal.putArrayElement(
                    result,
                    "timeoutForLargeTests",
                    env.callMethod(
                            this,
                            "getInteger",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "timeoutForLargeTests"),
                                    env),
                            60));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "reverseDefectList"))) {
            ZVal.putArrayElement(
                    result,
                    "reverseDefectList",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "reverseDefectList"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "verbose"))) {
            ZVal.putArrayElement(
                    result,
                    "verbose",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root, "getAttribute", Configuration.class, "verbose"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "registerMockObjectsFromTestArgumentsRecursively"))) {
            ZVal.putArrayElement(
                    result,
                    "registerMockObjectsFromTestArgumentsRecursively",
                    env.callMethod(
                            this,
                            "getBoolean",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "registerMockObjectsFromTestArgumentsRecursively"),
                                    env),
                            false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "extensionsDirectory"))) {
            ZVal.putArrayElement(
                    result,
                    "extensionsDirectory",
                    env.callMethod(
                            this,
                            "toAbsolutePath",
                            Configuration.class,
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "extensionsDirectory"),
                                    env)));
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testSuiteFilter", typeHint = "string")
    public Object getTestSuiteConfiguration(RuntimeEnv env, Object... args) {
        Object testSuiteFilter = assignParameter(args, 0, null);
        if (ZVal.isNull(testSuiteFilter)) {
            testSuiteFilter = "";
        }
        Object suite = null;
        Object testSuiteNodes = null;
        Object testSuiteNode = null;
        testSuiteNodes =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("xpath").value(),
                        "query",
                        Configuration.class,
                        "testsuites/testsuite");
        if (ZVal.strictEqualityCheck(
                toObjectR(testSuiteNodes).accessProp(this, env).name("length").value(), "===", 0)) {
            testSuiteNodes =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("xpath").value(),
                            "query",
                            Configuration.class,
                            "testsuite");
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(testSuiteNodes).accessProp(this, env).name("length").value(), "===", 1)) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "getTestSuite",
                            Configuration.class,
                            env.callMethod(testSuiteNodes, "item", Configuration.class, 0),
                            testSuiteFilter));
        }

        suite = new TestSuite(env);
        for (ZPair zpairResult370 : ZVal.getIterable(testSuiteNodes, env, true)) {
            testSuiteNode = ZVal.assign(zpairResult370.getValue());
            env.callMethod(
                    suite,
                    "addTestSuite",
                    Configuration.class,
                    env.callMethod(
                            this,
                            "getTestSuite",
                            Configuration.class,
                            testSuiteNode,
                            testSuiteFilter));
        }

        return ZVal.assign(suite);
    }

    @ConvertedMethod
    public Object getTestSuiteNames(RuntimeEnv env, Object... args) {
        Object node = null;
        Object names = ZVal.newArray();
        names = ZVal.newArray();
        for (ZPair zpairResult371 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                "*/testsuite"),
                        env,
                        true)) {
            node = ZVal.assign(zpairResult371.getValue());
            ZVal.addToArray(
                    names, env.callMethod(node, "getAttribute", Configuration.class, "name"));
        }

        return ZVal.assign(names);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testSuiteNode", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "testSuiteFilter", typeHint = "string")
    private Object getTestSuite(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object testSuiteNode = assignParameter(args, 0, null);
        Object testSuiteFilter = assignParameter(args, 1, null);
        if (ZVal.isNull(testSuiteFilter)) {
            testSuiteFilter = "";
        }
        Object prefix = null;
        Object directoryNode = null;
        Object suffix = null;
        Object fileIteratorFacade = null;
        Object directory = null;
        Object phpVersionOperator = null;
        Object suite = null;
        Object excludeNode = null;
        Object file = ZVal.newArray();
        Object files = null;
        Object exclude = ZVal.newArray();
        Object fileNode = null;
        Object excludeFile = null;
        Object phpVersion = null;
        if (ZVal.isTrue(
                env.callMethod(testSuiteNode, "hasAttribute", Configuration.class, "name"))) {
            suite =
                    new TestSuite(
                            env,
                            toStringR(
                                    env.callMethod(
                                            testSuiteNode,
                                            "getAttribute",
                                            Configuration.class,
                                            "name"),
                                    env));

        } else {
            suite = new TestSuite(env);
        }

        exclude = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult372 :
                ZVal.getIterable(
                        env.callMethod(
                                testSuiteNode,
                                "getElementsByTagName",
                                Configuration.class,
                                "exclude"),
                        env,
                        true)) {
            excludeNode = ZVal.assign(zpairResult372.getValue());
            excludeFile =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(excludeNode)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isTrue(excludeFile)) {
                ZVal.addToArray(
                        exclude,
                        env.callMethod(this, "toAbsolutePath", Configuration.class, excludeFile));
            }
        }

        fileIteratorFacade = new File_Iterator_Facade(env);
        testSuiteFilter =
                ZVal.assign(
                        ZVal.isTrue(testSuiteFilter)
                                ? NamespaceGlobal.explode
                                        .env(env)
                                        .call(",", testSuiteFilter)
                                        .value()
                                : ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult373 :
                ZVal.getIterable(
                        env.callMethod(
                                testSuiteNode,
                                "getElementsByTagName",
                                Configuration.class,
                                "directory"),
                        env,
                        true)) {
            directoryNode = ZVal.assign(zpairResult373.getValue());
            if (ZVal.toBool(!ZVal.isEmpty(testSuiteFilter))
                    && ZVal.toBool(
                            !CRArrayF.in_array
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    toObjectR(directoryNode)
                                                            .accessProp(this, env)
                                                            .name("parentNode")
                                                            .value(),
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "name"),
                                            testSuiteFilter)
                                    .getBool())) {
                continue;
            }

            directory =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(directoryNode)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isEmpty(directory)) {
                continue;
            }

            phpVersion = "7.1.16";
            phpVersionOperator = ">=";
            prefix = "";
            suffix = "Test.php";
            if (ZVal.isTrue(
                    env.callMethod(
                            directoryNode, "hasAttribute", Configuration.class, "phpVersion"))) {
                phpVersion =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "phpVersion"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            directoryNode,
                            "hasAttribute",
                            Configuration.class,
                            "phpVersionOperator"))) {
                phpVersionOperator =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "phpVersionOperator"),
                                        env));
            }

            if (!NamespaceGlobal.version_compare
                    .env(env)
                    .call("7.1.16", phpVersion, phpVersionOperator)
                    .getBool()) {
                continue;
            }

            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "prefix"))) {
                prefix =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "prefix"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "suffix"))) {
                suffix =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "suffix"),
                                        env));
            }

            files =
                    env.callMethod(
                            fileIteratorFacade,
                            "getFilesAsArray",
                            Configuration.class,
                            env.callMethod(this, "toAbsolutePath", Configuration.class, directory),
                            suffix,
                            prefix,
                            exclude);
            env.callMethod(suite, "addTestFiles", Configuration.class, files);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult374 :
                ZVal.getIterable(
                        env.callMethod(
                                testSuiteNode, "getElementsByTagName", Configuration.class, "file"),
                        env,
                        true)) {
            fileNode = ZVal.assign(zpairResult374.getValue());
            if (ZVal.toBool(!ZVal.isEmpty(testSuiteFilter))
                    && ZVal.toBool(
                            !CRArrayF.in_array
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    toObjectR(fileNode)
                                                            .accessProp(this, env)
                                                            .name("parentNode")
                                                            .value(),
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "name"),
                                            testSuiteFilter)
                                    .getBool())) {
                continue;
            }

            file =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(fileNode)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isEmpty(file)) {
                continue;
            }

            file =
                    env.callMethod(
                            fileIteratorFacade,
                            "getFilesAsArray",
                            Configuration.class,
                            env.callMethod(this, "toAbsolutePath", Configuration.class, file));
            if (!ZVal.isset(ZVal.getElement(file, 0))) {
                continue;
            }

            file = ZVal.assign(ZVal.getElement(file, 0));
            phpVersion = "7.1.16";
            phpVersionOperator = ">=";
            if (ZVal.isTrue(
                    env.callMethod(fileNode, "hasAttribute", Configuration.class, "phpVersion"))) {
                phpVersion =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                fileNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "phpVersion"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            fileNode, "hasAttribute", Configuration.class, "phpVersionOperator"))) {
                phpVersionOperator =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                fileNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "phpVersionOperator"),
                                        env));
            }

            if (!NamespaceGlobal.version_compare
                    .env(env)
                    .call("7.1.16", phpVersion, phpVersionOperator)
                    .getBool()) {
                continue;
            }

            env.callMethod(suite, "addTestFile", Configuration.class, file);
        }

        return ZVal.assign(suite);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    @ConvertedParameter(index = 1, name = "default")
    private Object getBoolean(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object _pDefault = assignParameter(args, 1, null);
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strtolower.env(env).call(value).value(), "===", "false")) {
            return ZVal.assign(false);
        }

        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strtolower.env(env).call(value).value(), "===", "true")) {
            return ZVal.assign(true);
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    @ConvertedParameter(index = 1, name = "default", typeHint = "int")
    private Object getInteger(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object _pDefault = assignParameter(args, 1, null);
        if (function_is_numeric.f.env(env).call(value).getBool()) {
            return ZVal.assign(ZVal.toLong(value));
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query", typeHint = "string")
    private Object readFilterDirectories(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object query = assignParameter(args, 0, null);
        Object directoryPath = null;
        Object prefix = null;
        Object directories = ZVal.newArray();
        Object directoryNode = null;
        Object suffix = null;
        Object group = null;
        directories = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult375 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                query),
                        env,
                        true)) {
            directoryNode = ZVal.assign(zpairResult375.getValue());
            directoryPath =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(directoryNode)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (!ZVal.isTrue(directoryPath)) {
                continue;
            }

            prefix = "";
            suffix = ".php";
            group = "DEFAULT";
            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "prefix"))) {
                prefix =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "prefix"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "suffix"))) {
                suffix =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "suffix"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "group"))) {
                group =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "group"),
                                        env));
            }

            ZVal.addToArray(
                    directories,
                    ZVal.newArray(
                            new ZPair(
                                    "path",
                                    env.callMethod(
                                            this,
                                            "toAbsolutePath",
                                            Configuration.class,
                                            directoryPath)),
                            new ZPair("prefix", prefix),
                            new ZPair("suffix", suffix),
                            new ZPair("group", group)));
        }

        return ZVal.assign(directories);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query", typeHint = "string")
    private Object readFilterFiles(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, null);
        Object file = null;
        Object filePath = null;
        Object files = ZVal.newArray();
        files = ZVal.newArray();
        for (ZPair zpairResult376 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                query),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult376.getValue());
            filePath =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(file)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isTrue(filePath)) {
                ZVal.addToArray(
                        files,
                        env.callMethod(this, "toAbsolutePath", Configuration.class, filePath));
            }
        }

        return ZVal.assign(files);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "useIncludePath",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object toAbsolutePath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, null);
        if (ZVal.isNull(path)) {
            path = ZVal.newArray();
        }
        Object useIncludePath = assignParameter(args, 1, null);
        if (ZVal.isNull(useIncludePath)) {
            useIncludePath = false;
        }
        Object file = null;
        Object includePathFile = null;
        path = NamespaceGlobal.trim.env(env).call(path).value();
        if (ZVal.strictEqualityCheck(ZVal.getElement(path, 0), "===", "/")) {
            return ZVal.assign(path);
        }

        if (ZVal.toBool(function_defined.f.env(env).call("PHP_WINDOWS_VERSION_BUILD").value())
                && ZVal.toBool(
                        ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getElement(path, 0), "===", "\\"))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.isGreaterThanOrEqualTo(
                                                                NamespaceGlobal.strlen
                                                                        .env(env)
                                                                        .call(path)
                                                                        .value(),
                                                                ">=",
                                                                3))
                                                && ZVal.toBool(
                                                        NamespaceGlobal.preg_match
                                                                .env(env)
                                                                .addReferneceArgs(
                                                                        new RuntimeArgsWithReferences())
                                                                .call(
                                                                        "#^[A-Z]\\:[/\\\\]#i",
                                                                        NamespaceGlobal.substr
                                                                                .env(env)
                                                                                .call(path, 0, 3)
                                                                                .value())
                                                                .value())))) {
            return ZVal.assign(path);
        }

        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(path, "://").value(), "!==", false)) {
            return ZVal.assign(path);
        }

        file =
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
                        + toStringR("/", env)
                        + toStringR(path, env);
        if (ZVal.toBool(useIncludePath)
                && ZVal.toBool(!NamespaceGlobal.file_exists.env(env).call(file).getBool())) {
            includePathFile = function_stream_resolve_include_path.f.env(env).call(path).value();
            if (ZVal.isTrue(includePathFile)) {
                file = ZVal.assign(includePathFile);
            }
        }

        return ZVal.assign(file);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root", typeHint = "string")
    private Object parseGroupConfiguration(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, null);
        Object groups = ZVal.newArray();
        Object group = null;
        groups =
                ZVal.newArray(
                        new ZPair("include", ZVal.newArray()),
                        new ZPair("exclude", ZVal.newArray()));
        for (ZPair zpairResult377 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                toStringR(root, env) + "/include/group"),
                        env,
                        true)) {
            group = ZVal.assign(zpairResult377.getValue());
            ZVal.setElementRecursive(
                    groups,
                    toStringR(
                            toObjectR(group).accessProp(this, env).name("textContent").value(),
                            env),
                    "include",
                    ZVal.addToArray);
        }

        for (ZPair zpairResult378 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("xpath").value(),
                                "query",
                                Configuration.class,
                                toStringR(root, env) + "/exclude/group"),
                        env,
                        true)) {
            group = ZVal.assign(zpairResult378.getValue());
            ZVal.setElementRecursive(
                    groups,
                    toStringR(
                            toObjectR(group).accessProp(this, env).name("textContent").value(),
                            env),
                    "exclude",
                    ZVal.addToArray);
        }

        return ZVal.assign(groups);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Configuration";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        public Object getInstance(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, null);
            Object realPath = null;
            realPath = NamespaceGlobal.realpath.env(env).call(filename).value();
            if (ZVal.strictEqualityCheck(realPath, "===", false)) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Could not read \"%s\".", filename)
                                        .value()));
            }

            if (!ZVal.isset(
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Configuration
                                                    .RequestStaticProperties
                                                    .class)
                                    .instances,
                            realPath))) {
                ZVal.putArrayElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Util
                                                .classes
                                                .Configuration
                                                .RequestStaticProperties
                                                .class)
                                .instances,
                        realPath,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Configuration(env, realPath));
            }

            return ZVal.assign(
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Configuration
                                                    .RequestStaticProperties
                                                    .class)
                                    .instances,
                            realPath));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instances = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Configuration")
                    .setLookup(Configuration.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("document", "filename", "xpath")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Configuration.php")
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

    private enum SwitchEnumType18 {
        STRING_var,
        STRING_server,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
