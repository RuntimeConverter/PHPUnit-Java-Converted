package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Builder;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLASS;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_FUNCTION;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.Xdebug;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream_CachingFactory;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLOSE_TAG;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.UnintentionallyCoveredCodeException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.PHPDBG;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NAMESPACE;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.CoveredCodeNotExecutedException;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.Driver;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_COMMENT;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_TRAIT;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_USE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_INTERFACE;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.MissingCoversAnnotationException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Filter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_DOC_COMMENT;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_TAG;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_DECLARE;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeUnitReverseLookup.classes.Wizard;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/CodeCoverage.php

*/

public final class CodeCoverage extends RuntimeClassBase {

    public Object driver = null;

    public Object filter = null;

    public Object wizard = null;

    public Object cacheTokens = false;

    public Object checkForUnintentionallyCoveredCode = false;

    public Object forceCoversAnnotation = false;

    public Object checkForUnexecutedCoveredCode = false;

    public Object checkForMissingCoversAnnotation = false;

    public Object addUncoveredFilesFromWhitelist = true;

    public Object processUncoveredFilesFromWhitelist = false;

    public Object ignoreDeprecatedCode = false;

    public Object currentId = null;

    public Object data = ZVal.newArray();

    public Object ignoredLines = ZVal.newArray();

    public Object disableIgnoredLines = false;

    public Object tests = ZVal.newArray();

    public Object unintentionallyCoveredSubclassesWhitelist = ZVal.newArray();

    public Object isInitialized = false;

    public Object shouldCheckForDeadAndUnused = true;

    public Object report = null;

    public CodeCoverage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CodeCoverage.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "driver",
        typeHint = "SebastianBergmann\\CodeCoverage\\Driver\\Driver",
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
        Object driver = assignParameter(args, 0, null);
        if (ZVal.isNull(driver)) {
            driver = ZVal.getNull();
        }
        Object filter = assignParameter(args, 1, null);
        if (ZVal.isNull(filter)) {
            filter = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(driver, "===", ZVal.getNull())) {
            driver = env.callMethod(this, "selectDriver", CodeCoverage.class);
        }

        if (ZVal.strictEqualityCheck(filter, "===", ZVal.getNull())) {
            filter = new Filter(env);
        }

        toObjectR(this).accessProp(this, env).name("driver").set(driver);
        toObjectR(this).accessProp(this, env).name("filter").set(filter);
        toObjectR(this).accessProp(this, env).name("wizard").set(new Wizard(env));
        return null;
    }

    @ConvertedMethod
    public Object getReport(RuntimeEnv env, Object... args) {
        Object builder = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("report").value(),
                "===",
                ZVal.getNull())) {
            builder = new Builder(env);
            toObjectR(this)
                    .accessProp(this, env)
                    .name("report")
                    .set(env.callMethod(builder, "build", CodeCoverage.class, this));
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("report").value());
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("isInitialized").set(false);
        toObjectR(this).accessProp(this, env).name("currentId").set(ZVal.getNull());
        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("tests").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("report").set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    public Object filter(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("filter").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "raw",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getData(RuntimeEnv env, Object... args) {
        Object raw = assignParameter(args, 0, null);
        if (ZVal.isNull(raw)) {
            raw = false;
        }
        if (ZVal.toBool(!ZVal.isTrue(raw))
                && ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("addUncoveredFilesFromWhitelist")
                                .value())) {
            env.callMethod(this, "addUncoveredFilesFromWhitelist", CodeCoverage.class);
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("data").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object setData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("data").set(data);
        toObjectR(this).accessProp(this, env).name("report").set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    public Object getTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("tests").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tests", typeHint = "array")
    public Object setTests(RuntimeEnv env, Object... args) {
        Object tests = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("tests").set(tests);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "clear",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object start(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, null);
        Object clear = assignParameter(args, 1, null);
        if (ZVal.isNull(clear)) {
            clear = false;
        }
        if (ZVal.isTrue(clear)) {
            env.callMethod(this, "clear", CodeCoverage.class);
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("isInitialized").value(),
                "===",
                false)) {
            env.callMethod(this, "initializeData", CodeCoverage.class);
        }

        toObjectR(this).accessProp(this, env).name("currentId").set(id);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("driver").value(),
                "start",
                CodeCoverage.class,
                toObjectR(this).accessProp(this, env).name("shouldCheckForDeadAndUnused").value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "append",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "linesToBeCovered",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "linesToBeUsed",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "ignoreForceCoversAnnotation",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object stop(RuntimeEnv env, Object... args) {
        Object append = assignParameter(args, 0, null);
        if (ZVal.isNull(append)) {
            append = true;
        }
        Object linesToBeCovered = assignParameter(args, 1, null);
        if (ZVal.isNull(linesToBeCovered)) {
            linesToBeCovered = ZVal.newArray();
        }
        Object linesToBeUsed = assignParameter(args, 2, null);
        if (ZVal.isNull(linesToBeUsed)) {
            linesToBeUsed = ZVal.newArray();
        }
        Object ignoreForceCoversAnnotation = assignParameter(args, 3, null);
        if (ZVal.isNull(ignoreForceCoversAnnotation)) {
            ignoreForceCoversAnnotation = false;
        }
        Object data = null;
        if (ZVal.toBool(!function_is_array.f.env(env).call(linesToBeCovered).getBool())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(linesToBeCovered, "!==", false))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentException.runtimeStaticObject.create(env, 2, "array or false"));
        }

        data =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("driver").value(),
                        "stop",
                        CodeCoverage.class);
        env.callMethod(
                this,
                "append",
                CodeCoverage.class,
                data,
                ZVal.getNull(),
                append,
                linesToBeCovered,
                linesToBeUsed,
                ignoreForceCoversAnnotation);
        toObjectR(this).accessProp(this, env).name("currentId").set(ZVal.getNull());
        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "id",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "append",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "linesToBeCovered",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "linesToBeUsed",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 5,
        name = "ignoreForceCoversAnnotation",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object append(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, null));
        Object id = assignParameter(args, 1, null);
        if (ZVal.isNull(id)) {
            id = ZVal.getNull();
        }
        Object append = assignParameter(args, 2, null);
        if (ZVal.isNull(append)) {
            append = true;
        }
        Object linesToBeCovered = assignParameter(args, 3, null);
        if (ZVal.isNull(linesToBeCovered)) {
            linesToBeCovered = ZVal.newArray();
        }
        Object linesToBeUsed = assignParameter(args, 4, null);
        if (ZVal.isNull(linesToBeUsed)) {
            linesToBeUsed = ZVal.newArray();
        }
        Object ignoreForceCoversAnnotation = assignParameter(args, 5, null);
        if (ZVal.isNull(ignoreForceCoversAnnotation)) {
            ignoreForceCoversAnnotation = false;
        }
        Object k = null;
        Object _size = null;
        Object file = null;
        Object size = null;
        Object v = null;
        Object lines = null;
        Object status = null;
        if (ZVal.strictEqualityCheck(id, "===", ZVal.getNull())) {
            id = ZVal.assign(toObjectR(this).accessProp(this, env).name("currentId").value());
        }

        if (ZVal.strictEqualityCheck(id, "===", ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env));
        }

        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, data),
                "applyWhitelistFilter",
                CodeCoverage.class,
                data.getObject());
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, data),
                "applyIgnoredLinesFilter",
                CodeCoverage.class,
                data.getObject());
        env.callMethod(
                this,
                "initializeFilesThatAreSeenTheFirstTime",
                CodeCoverage.class,
                data.getObject());
        if (!ZVal.isTrue(append)) {
            return null;
        }

        if (ZVal.strictNotEqualityCheck(id, "!==", "UNCOVERED_FILES_FROM_WHITELIST")) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, data),
                    "applyCoversAnnotationFilter",
                    CodeCoverage.class,
                    data.getObject(),
                    linesToBeCovered,
                    linesToBeUsed,
                    ignoreForceCoversAnnotation);
        }

        if (ZVal.isEmpty(data.getObject())) {
            return null;
        }

        size = "unknown";
        status = ZVal.getNull();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(id, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            _size = env.callMethod(id, "getSize", CodeCoverage.class);
            if (ZVal.strictEqualityCheck(_size, "===", Test.CONST_SMALL)) {
                size = "small";

            } else if (ZVal.strictEqualityCheck(_size, "===", Test.CONST_MEDIUM)) {
                size = "medium";

            } else if (ZVal.strictEqualityCheck(_size, "===", Test.CONST_LARGE)) {
                size = "large";
            }

            status = env.callMethod(id, "getStatus", CodeCoverage.class);
            id =
                    toStringR(function_get_class.f.env(env).call(id).value(), env)
                            + "::"
                            + toStringR(env.callMethod(id, "getName", CodeCoverage.class), env);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(id, PhptTestCase.class, "PHPUnit\\Runner\\PhptTestCase"))) {
            size = "large";
            id = env.callMethod(id, "getName", CodeCoverage.class);
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("tests").value(),
                id,
                ZVal.newArray(new ZPair("size", size), new ZPair("status", status)));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult79 : ZVal.getIterable(data.getObject(), env, false)) {
            file = ZVal.assign(zpairResult79.getKey());
            lines = ZVal.assign(zpairResult79.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("filter").value(),
                            "isFile",
                            CodeCoverage.class,
                            file))) {
                continue;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult80 : ZVal.getIterable(lines, env, false)) {
                k = ZVal.assign(zpairResult80.getKey());
                v = ZVal.assign(zpairResult80.getValue());
                if (ZVal.strictEqualityCheck(v, "===", Driver.CONST_LINE_EXECUTED)) {
                    if (ZVal.toBool(
                                    ZVal.isEmpty(
                                            ZVal.getElementRecursive(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("data")
                                                            .value(),
                                                    file,
                                                    k)))
                            || ZVal.toBool(
                                    !CRArrayF.in_array
                                            .env(env)
                                            .call(
                                                    id,
                                                    ZVal.getElementRecursive(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("data")
                                                                    .value(),
                                                            file,
                                                            k))
                                            .getBool())) {
                        ZVal.setElementRecursive(
                                toObjectR(this).accessProp(this, env).name("data").value(),
                                id,
                                file,
                                k,
                                ZVal.addToArray);
                    }
                }
            }
        }

        toObjectR(this).accessProp(this, env).name("report").set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "that", typeHint = "self")
    public Object merge(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object that = assignParameter(args, 0, null);
        Object file = null;
        Object ours = null;
        Object data = null;
        Object line = null;
        Object lines = null;
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("filter").value(),
                "setWhitelistedFiles",
                CodeCoverage.class,
                CRArrayF.array_merge
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("filter")
                                                .value(),
                                        "getWhitelistedFiles",
                                        CodeCoverage.class),
                                env.callMethod(
                                        env.callMethod(
                                                that,
                                                new RuntimeArgsWithReferences(),
                                                "filter",
                                                CodeCoverage.class),
                                        "getWhitelistedFiles",
                                        CodeCoverage.class))
                        .value());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult81 :
                ZVal.getIterable(
                        toObjectR(that).accessProp(this, env).name("data").value(), env, false)) {
            file = ZVal.assign(zpairResult81.getKey());
            lines = ZVal.assign(zpairResult81.getValue());
            if (!ZVal.isset(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("data").value(), file))) {
                if (!ZVal.isTrue(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("filter").value(),
                                "isFiltered",
                                CodeCoverage.class,
                                file))) {
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("data").value(),
                            file,
                            lines);
                }

                continue;
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.isGreaterThan(
                                                    CRArrayF.count.env(env).call(lines).value(),
                                                    '>',
                                                    0))
                                    && ZVal.toBool(
                                            ZVal.isGreaterThan(
                                                    CRArrayF.count
                                                            .env(env)
                                                            .call(
                                                                    ZVal.getElement(
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name("data")
                                                                                    .value(),
                                                                            file))
                                                            .value(),
                                                    '>',
                                                    0)))
                    && ZVal.toBool(
                            ZVal.notEqualityCheck(
                                    CRArrayF.count.env(env).call(lines).value(),
                                    CRArrayF.count
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("data")
                                                                    .value(),
                                                            file))
                                            .value()))) {
                if (ZVal.isGreaterThan(
                        CRArrayF.count.env(env).call(lines).value(),
                        '>',
                        CRArrayF.count
                                .env(env)
                                .call(
                                        ours =
                                                ZVal.assign(
                                                        ZVal.getElement(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("data")
                                                                        .value(),
                                                                file)))
                                .value())) {
                    lines =
                            CRArrayF.array_filter
                                    .env(env)
                                    .call(
                                            lines,
                                            new Closure(env) {
                                                @Override
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object value = assignParameter(args, 0, null);
                                                    Object key = assignParameter(args, 1, null);
                                                    Object ours = null;
                                                    ours =
                                                            this.contextReferences.getCapturedValue(
                                                                    "ours");
                                                    return ZVal.assign(
                                                            CRArrayF.array_key_exists
                                                                    .env(env)
                                                                    .call(key, ours)
                                                                    .value());
                                                }
                                            }.use("ours", ours),
                                            1)
                                    .value();

                } else {
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("data").value(),
                            file,
                            CRArrayF.array_filter
                                    .env(env)
                                    .call(
                                            ZVal.getElement(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("data")
                                                            .value(),
                                                    file),
                                            new Closure(env) {
                                                @Override
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object value = assignParameter(args, 0, null);
                                                    Object key = assignParameter(args, 1, null);
                                                    Object lines = null;
                                                    lines =
                                                            this.contextReferences.getCapturedValue(
                                                                    "lines");
                                                    return ZVal.assign(
                                                            CRArrayF.array_key_exists
                                                                    .env(env)
                                                                    .call(key, lines)
                                                                    .value());
                                                }
                                            }.use("lines", lines),
                                            1)
                                    .value());
                }
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult82 : ZVal.getIterable(lines, env, false)) {
                line = ZVal.assign(zpairResult82.getKey());
                data = ZVal.assign(zpairResult82.getValue());
                if (ZVal.strictNotEqualityCheck(data, "!==", ZVal.getNull())) {
                    if (!ZVal.isset(
                            ZVal.getElementRecursive(
                                    toObjectR(this).accessProp(this, env).name("data").value(),
                                    file,
                                    line))) {
                        ZVal.setElementRecursive(
                                toObjectR(this).accessProp(this, env).name("data").value(),
                                data,
                                file,
                                line);

                    } else {
                        ZVal.setElementRecursive(
                                toObjectR(this).accessProp(this, env).name("data").value(),
                                CRArrayF.array_unique
                                        .env(env)
                                        .call(
                                                CRArrayF.array_merge
                                                        .env(env)
                                                        .call(
                                                                ZVal.getElementRecursive(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("data")
                                                                                .value(),
                                                                        file,
                                                                        line),
                                                                data)
                                                        .value())
                                        .value(),
                                file,
                                line);
                    }
                }
            }
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("tests")
                .set(
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        toObjectR(this).accessProp(this, env).name("tests").value(),
                                        env.callMethod(that, "getTests", CodeCoverage.class))
                                .value());
        toObjectR(this).accessProp(this, env).name("report").set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setCacheTokens(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("cacheTokens").set(flag);
        return null;
    }

    @ConvertedMethod
    public Object getCacheTokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("cacheTokens").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setCheckForUnintentionallyCoveredCode(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("checkForUnintentionallyCoveredCode").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setForceCoversAnnotation(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("forceCoversAnnotation").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setCheckForMissingCoversAnnotation(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("checkForMissingCoversAnnotation").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setCheckForUnexecutedCoveredCode(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("checkForUnexecutedCoveredCode").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setAddUncoveredFilesFromWhitelist(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("addUncoveredFilesFromWhitelist").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setProcessUncoveredFilesFromWhitelist(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("processUncoveredFilesFromWhitelist").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setDisableIgnoredLines(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("disableIgnoredLines").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setIgnoreDeprecatedCode(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("ignoreDeprecatedCode").set(flag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whitelist", typeHint = "array")
    public Object setUnintentionallyCoveredSubclassesWhitelist(RuntimeEnv env, Object... args) {
        Object whitelist = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("unintentionallyCoveredSubclassesWhitelist")
                .set(whitelist);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "linesToBeCovered")
    @ConvertedParameter(index = 2, name = "linesToBeUsed", typeHint = "array")
    @ConvertedParameter(index = 3, name = "ignoreForceCoversAnnotation", typeHint = "bool")
    private Object applyCoversAnnotationFilter(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(data)) {
            data.setObject(ZVal.newArray());
        }
        Object linesToBeCovered = assignParameter(args, 1, null);
        if (ZVal.isNull(linesToBeCovered)) {
            linesToBeCovered = ZVal.newArray();
        }
        Object linesToBeUsed = assignParameter(args, 2, null);
        Object ignoreForceCoversAnnotation = assignParameter(args, 3, null);
        Object filename = null;
        Object _linesToBeCovered = null;
        if (ZVal.toBool(ZVal.strictEqualityCheck(linesToBeCovered, "===", false))
                || ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("forceCoversAnnotation")
                                                                .value())
                                                && ZVal.toBool(ZVal.isEmpty(linesToBeCovered)))
                                && ZVal.toBool(!ZVal.isTrue(ignoreForceCoversAnnotation)))) {
            if (toObjectR(this)
                    .accessProp(this, env)
                    .name("checkForMissingCoversAnnotation")
                    .getBool()) {
                throw ZVal.getException(env, new MissingCoversAnnotationException(env));
            }

            data.setObject(ZVal.newArray());
            return null;
        }

        if (ZVal.isEmpty(linesToBeCovered)) {
            return null;
        }

        if (ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("checkForUnintentionallyCoveredCode")
                                .value())
                && ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("currentId")
                                                                .value(),
                                                        TestCase.class,
                                                        "PHPUnit\\Framework\\TestCase")))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("currentId")
                                                                                .value(),
                                                                        "isMedium",
                                                                        CodeCoverage.class)))
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("currentId")
                                                                                .value(),
                                                                        "isLarge",
                                                                        CodeCoverage.class)))))) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, data),
                    "performUnintentionallyCoveredCodeCheck",
                    CodeCoverage.class,
                    data.getObject(),
                    linesToBeCovered,
                    linesToBeUsed);
        }

        if (toObjectR(this).accessProp(this, env).name("checkForUnexecutedCoveredCode").getBool()) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, data),
                    "performUnexecutedCoveredCodeCheck",
                    CodeCoverage.class,
                    data.getObject(),
                    linesToBeCovered,
                    linesToBeUsed);
        }

        data.setObject(
                CRArrayF.array_intersect_key
                        .env(env)
                        .call(data.getObject(), linesToBeCovered)
                        .value());
        for (ZPair zpairResult83 :
                ZVal.getIterable(
                        CRArrayF.array_keys.env(env).call(data.getObject()).value(), env, true)) {
            filename = ZVal.assign(zpairResult83.getValue());
            _linesToBeCovered =
                    CRArrayF.array_flip
                            .env(env)
                            .call(ZVal.getElement(linesToBeCovered, filename))
                            .value();
            ZVal.putArrayElement(
                    data.getObject(),
                    filename,
                    CRArrayF.array_intersect_key
                            .env(env)
                            .call(ZVal.getElement(data.getObject(), filename), _linesToBeCovered)
                            .value());
        }

        return null;
    }

    public Object applyCoversAnnotationFilter(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object applyWhitelistFilter(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(data)) {
            data.setObject(ZVal.newArray());
        }
        Object filename = null;
        for (ZPair zpairResult84 :
                ZVal.getIterable(
                        CRArrayF.array_keys.env(env).call(data.getObject()).value(), env, true)) {
            filename = ZVal.assign(zpairResult84.getValue());
            if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("filter").value(),
                            "isFiltered",
                            CodeCoverage.class,
                            filename))) {
                ZVal.unsetArrayElement(data.getObject(), filename);
            }
        }

        return null;
    }

    public Object applyWhitelistFilter(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object applyIgnoredLinesFilter(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(data)) {
            data.setObject(ZVal.newArray());
        }
        Object filename = null;
        Object line = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult85 :
                ZVal.getIterable(
                        CRArrayF.array_keys.env(env).call(data.getObject()).value(), env, true)) {
            filename = ZVal.assign(zpairResult85.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("filter").value(),
                            "isFile",
                            CodeCoverage.class,
                            filename))) {
                continue;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult86 :
                    ZVal.getIterable(
                            env.callMethod(
                                    this, "getLinesToBeIgnored", CodeCoverage.class, filename),
                            env,
                            true)) {
                line = ZVal.assign(zpairResult86.getValue());
                ZVal.unsetElementRecursive(data.getObject(), filename, line);
            }
        }

        return null;
    }

    public Object applyIgnoredLinesFilter(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object initializeFilesThatAreSeenTheFirstTime(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, null);
        Object file = null;
        Object v = null;
        Object k = null;
        Object lines = null;
        for (ZPair zpairResult87 : ZVal.getIterable(data, env, false)) {
            file = ZVal.assign(zpairResult87.getKey());
            lines = ZVal.assign(zpairResult87.getValue());
            if (ZVal.toBool(
                            !ZVal.isset(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("data")
                                                    .value(),
                                            file)))
                    && ZVal.toBool(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("filter").value(),
                                    "isFile",
                                    CodeCoverage.class,
                                    file))) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("data").value(),
                        file,
                        ZVal.newArray());
                for (ZPair zpairResult88 : ZVal.getIterable(lines, env, false)) {
                    k = ZVal.assign(zpairResult88.getKey());
                    v = ZVal.assign(zpairResult88.getValue());
                    ZVal.setElementRecursive(
                            toObjectR(this).accessProp(this, env).name("data").value(),
                            ZVal.strictEqualityCheck(v, "===", -2)
                                    ? ZVal.getNull()
                                    : ZVal.newArray(),
                            file,
                            k);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object addUncoveredFilesFromWhitelist(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object data = ZVal.newArray();
        Object uncoveredFiles = null;
        Object i = null;
        Object lines = null;
        Object uncoveredFile = null;
        data = ZVal.newArray();
        uncoveredFiles =
                CRArrayF.array_diff
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("filter")
                                                .value(),
                                        "getWhitelist",
                                        CodeCoverage.class),
                                CRArrayF.array_keys
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("data")
                                                        .value())
                                        .value())
                        .value();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult89 : ZVal.getIterable(uncoveredFiles, env, true)) {
            uncoveredFile = ZVal.assign(zpairResult89.getValue());
            if (!NamespaceGlobal.file_exists.env(env).call(uncoveredFile).getBool()) {
                continue;
            }

            ZVal.putArrayElement(data, uncoveredFile, ZVal.newArray());
            lines =
                    CRArrayF.count
                            .env(env)
                            .call(NamespaceGlobal.file.env(env).call(uncoveredFile).value())
                            .value();
            runtimeConverterContinueCount = 0;
            for (i = 1; ZVal.isLessThanOrEqualTo(i, "<=", lines); i = ZVal.increment(i)) {
                ZVal.setElementRecursive(data, Driver.CONST_LINE_NOT_EXECUTED, uncoveredFile, i);
            }
        }

        env.callMethod(this, "append", CodeCoverage.class, data, "UNCOVERED_FILES_FROM_WHITELIST");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileName", typeHint = "string")
    private Object getLinesToBeIgnored(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object fileName = assignParameter(args, 0, null);
        Object endLine = null;
        Object classOrTrait = ZVal.newArray();
        Object docblock = null;
        Object line = null;
        Object _token = null;
        Object _pInterface = ZVal.newArray();
        Object interfaceStartLine = null;
        Object lastMethod = ZVal.newArray();
        Object ignore = null;
        Object tokens = null;
        Object end = null;
        Object lines = ZVal.newArray();
        Object interfaceEndLine = null;
        Object firstMethodStartLine = null;
        Object lastMethodEndLine = null;
        Object start = null;
        Object index = null;
        Object i = null;
        Object firstMethod = ZVal.newArray();
        Object firstMethodEndLine = null;
        Object token = null;
        Object classOrTraitStartLine = null;
        Object stop = null;
        Object classOrTraitEndLine = null;
        Object _line = null;
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                        fileName))) {
            return ZVal.assign(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                            fileName));
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                fileName,
                ZVal.newArray());
        lines = NamespaceGlobal.file.env(env).call(fileName).value();
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult90 : ZVal.getIterable(lines, env, false)) {
            index = ZVal.assign(zpairResult90.getKey());
            line = ZVal.assign(zpairResult90.getValue());
            if (!NamespaceGlobal.trim.env(env).call(line).getBool()) {
                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                        ZVal.add(index, 1),
                        fileName,
                        ZVal.addToArray);
            }
        }

        if (toObjectR(this).accessProp(this, env).name("cacheTokens").getBool()) {
            tokens = PHP_Token_Stream_CachingFactory.runtimeStaticObject.get(env, fileName);

        } else {
            tokens = new PHP_Token_Stream(env, fileName);
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult91 :
                ZVal.getIterable(
                        env.callMethod(tokens, "getInterfaces", CodeCoverage.class), env, true)) {
            _pInterface = ZVal.assign(zpairResult91.getValue());
            interfaceStartLine = ZVal.assign(ZVal.getElement(_pInterface, "startLine"));
            interfaceEndLine = ZVal.assign(ZVal.getElement(_pInterface, "endLine"));
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult92 :
                    ZVal.getIterable(
                            CRArrayF.range
                                    .env(env)
                                    .call(interfaceStartLine, interfaceEndLine)
                                    .value(),
                            env,
                            true)) {
                line = ZVal.assign(zpairResult92.getValue());
                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                        line,
                        fileName,
                        ZVal.addToArray);
            }
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult93 :
                ZVal.getIterable(
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        env.callMethod(tokens, "getClasses", CodeCoverage.class),
                                        env.callMethod(tokens, "getTraits", CodeCoverage.class))
                                .value(),
                        env,
                        true)) {
            classOrTrait = ZVal.assign(zpairResult93.getValue());
            classOrTraitStartLine = ZVal.assign(ZVal.getElement(classOrTrait, "startLine"));
            classOrTraitEndLine = ZVal.assign(ZVal.getElement(classOrTrait, "endLine"));
            if (ZVal.isEmpty(ZVal.getElement(classOrTrait, "methods"))) {
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult94 :
                        ZVal.getIterable(
                                CRArrayF.range
                                        .env(env)
                                        .call(classOrTraitStartLine, classOrTraitEndLine)
                                        .value(),
                                env,
                                true)) {
                    line = ZVal.assign(zpairResult94.getValue());
                    ZVal.setElementRecursive(
                            toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                            line,
                            fileName,
                            ZVal.addToArray);
                }

                continue;
            }

            firstMethod =
                    CRArrayF.array_shift
                            .env(env)
                            .call(ZVal.getElement(classOrTrait, "methods"))
                            .value();
            firstMethodStartLine = ZVal.assign(ZVal.getElement(firstMethod, "startLine"));
            firstMethodEndLine = ZVal.assign(ZVal.getElement(firstMethod, "endLine"));
            lastMethodEndLine = ZVal.assign(firstMethodEndLine);
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            do {
                lastMethod =
                        CRArrayF.array_pop
                                .env(env)
                                .call(ZVal.getElement(classOrTrait, "methods"))
                                .value();

            } while (ZVal.toBool(ZVal.strictNotEqualityCheck(lastMethod, "!==", ZVal.getNull()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    NamespaceGlobal.strpos
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(lastMethod, "signature"),
                                                    "anonymousFunction")
                                            .value())));

            if (ZVal.strictNotEqualityCheck(lastMethod, "!==", ZVal.getNull())) {
                lastMethodEndLine = ZVal.assign(ZVal.getElement(lastMethod, "endLine"));
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult95 :
                    ZVal.getIterable(
                            CRArrayF.range
                                    .env(env)
                                    .call(classOrTraitStartLine, firstMethodStartLine)
                                    .value(),
                            env,
                            true)) {
                line = ZVal.assign(zpairResult95.getValue());
                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                        line,
                        fileName,
                        ZVal.addToArray);
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult96 :
                    ZVal.getIterable(
                            CRArrayF.range
                                    .env(env)
                                    .call(ZVal.add(lastMethodEndLine, 1), classOrTraitEndLine)
                                    .value(),
                            env,
                            true)) {
                line = ZVal.assign(zpairResult96.getValue());
                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                        line,
                        fileName,
                        ZVal.addToArray);
            }
        }

        if (toObjectR(this).accessProp(this, env).name("disableIgnoredLines").getBool()) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                    fileName,
                    CRArrayF.array_unique
                            .env(env)
                            .call(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("ignoredLines")
                                                    .value(),
                                            fileName))
                            .value());
            CRArrayF.sort
                    .env(env)
                    .call(
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("ignoredLines")
                                            .value(),
                                    fileName));
            return ZVal.assign(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                            fileName));
        }

        ignore = false;
        stop = false;
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult97 :
                ZVal.getIterable(env.callMethod(tokens, "tokens", CodeCoverage.class), env, true)) {
            token = ZVal.assign(zpairResult97.getValue());
            SwitchEnumType6 switchVariable6 =
                    ZVal.getEnum(
                            function_get_class.f.env(env).call(token).value(),
                            SwitchEnumType6.DEFAULT_CASE,
                            SwitchEnumType6.DYNAMIC_TYPE_13,
                            PHP_Token_COMMENT.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_14,
                            PHP_Token_DOC_COMMENT.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_15,
                            PHP_Token_INTERFACE.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_16,
                            PHP_Token_TRAIT.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_17,
                            PHP_Token_CLASS.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_18,
                            PHP_Token_FUNCTION.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_19,
                            PHP_Token_NAMESPACE.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_20,
                            PHP_Token_DECLARE.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_21,
                            PHP_Token_OPEN_TAG.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_22,
                            PHP_Token_CLOSE_TAG.CONST_class,
                            SwitchEnumType6.DYNAMIC_TYPE_23,
                            PHP_Token_USE.CONST_class);
            switch (switchVariable6) {
                case DYNAMIC_TYPE_13:
                case DYNAMIC_TYPE_14:
                    _token = NamespaceGlobal.trim.env(env).call(token).value();
                    _line =
                            NamespaceGlobal.trim
                                    .env(env)
                                    .call(
                                            ZVal.getElement(
                                                    lines,
                                                    ZVal.subtract(
                                                            env.callMethod(
                                                                    token,
                                                                    "getLine",
                                                                    CodeCoverage.class),
                                                            1)))
                                    .value();
                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "// @codeCoverageIgnore"))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "//@codeCoverageIgnore"))) {
                        ignore = true;
                        stop = true;

                    } else if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "// @codeCoverageIgnoreStart"))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "//@codeCoverageIgnoreStart"))) {
                        ignore = true;

                    } else if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "// @codeCoverageIgnoreEnd"))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "//@codeCoverageIgnoreEnd"))) {
                        stop = true;
                    }

                    if (!ZVal.isTrue(ignore)) {
                        start = env.callMethod(token, "getLine", CodeCoverage.class);
                        end =
                                ZVal.add(
                                        start,
                                        NamespaceGlobal.substr_count
                                                .env(env)
                                                .call(token, "\n")
                                                .value());
                        if (ZVal.strictNotEqualityCheck(
                                0,
                                "!==",
                                NamespaceGlobal.strpos.env(env).call(_token, _line).value())) {
                            start = ZVal.increment(start);
                        }

                        runtimeConverterBreakCount = 0;
                        runtimeConverterContinueCount = 0;
                        for (i = ZVal.assign(start);
                                ZVal.isLessThan(i, '<', end);
                                i = ZVal.increment(i)) {
                            ZVal.setElementRecursive(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("ignoredLines")
                                            .value(),
                                    i,
                                    fileName,
                                    ZVal.addToArray);
                        }

                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.isset(
                                                                ZVal.getElement(
                                                                        lines,
                                                                        ZVal.subtract(i, 1))))
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                0,
                                                                "===",
                                                                NamespaceGlobal.strpos
                                                                        .env(env)
                                                                        .call(_token, "/*")
                                                                        .value())))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                "*/",
                                                "===",
                                                NamespaceGlobal.substr
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.trim
                                                                        .env(env)
                                                                        .call(
                                                                                ZVal.getElement(
                                                                                        lines,
                                                                                        ZVal
                                                                                                .subtract(
                                                                                                        i,
                                                                                                        1)))
                                                                        .value(),
                                                                -2)
                                                        .value()))) {
                            ZVal.setElementRecursive(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("ignoredLines")
                                            .value(),
                                    i,
                                    fileName,
                                    ZVal.addToArray);
                        }
                    }

                    break;
                case DYNAMIC_TYPE_15:
                case DYNAMIC_TYPE_16:
                case DYNAMIC_TYPE_17:
                case DYNAMIC_TYPE_18:
                    docblock = env.callMethod(token, "getDocblock", CodeCoverage.class);
                    ZVal.setElementRecursive(
                            toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                            env.callMethod(token, "getLine", CodeCoverage.class),
                            fileName,
                            ZVal.addToArray);
                    if (ZVal.toBool(
                                    NamespaceGlobal.strpos
                                            .env(env)
                                            .call(docblock, "@codeCoverageIgnore")
                                            .value())
                            || ZVal.toBool(
                                    ZVal.toBool(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("ignoreDeprecatedCode")
                                                            .value())
                                            && ZVal.toBool(
                                                    NamespaceGlobal.strpos
                                                            .env(env)
                                                            .call(docblock, "@deprecated")
                                                            .value()))) {
                        endLine = env.callMethod(token, "getEndLine", CodeCoverage.class);
                        runtimeConverterBreakCount = 0;
                        runtimeConverterContinueCount = 0;
                        for (i = env.callMethod(token, "getLine", CodeCoverage.class);
                                ZVal.isLessThanOrEqualTo(i, "<=", endLine);
                                i = ZVal.increment(i)) {
                            ZVal.setElementRecursive(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("ignoredLines")
                                            .value(),
                                    i,
                                    fileName,
                                    ZVal.addToArray);
                        }
                    }

                    break;
                case DYNAMIC_TYPE_19:
                    ZVal.setElementRecursive(
                            toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                            env.callMethod(token, "getEndLine", CodeCoverage.class),
                            fileName,
                            ZVal.addToArray);
                case DYNAMIC_TYPE_20:
                case DYNAMIC_TYPE_21:
                case DYNAMIC_TYPE_22:
                case DYNAMIC_TYPE_23:
                    ZVal.setElementRecursive(
                            toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                            env.callMethod(token, "getLine", CodeCoverage.class),
                            fileName,
                            ZVal.addToArray);
                    break;
            }
            ;
            if (ZVal.isTrue(ignore)) {
                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                        env.callMethod(token, "getLine", CodeCoverage.class),
                        fileName,
                        ZVal.addToArray);
                if (ZVal.isTrue(stop)) {
                    ignore = false;
                    stop = false;
                }
            }
        }

        ZVal.setElementRecursive(
                toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                ZVal.add(CRArrayF.count.env(env).call(lines).value(), 1),
                fileName,
                ZVal.addToArray);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                fileName,
                CRArrayF.array_unique
                        .env(env)
                        .call(
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("ignoredLines")
                                                .value(),
                                        fileName))
                        .value());
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                fileName,
                CRArrayF.array_unique
                        .env(env)
                        .call(
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("ignoredLines")
                                                .value(),
                                        fileName))
                        .value());
        CRArrayF.sort
                .env(env)
                .call(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                                fileName));
        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("ignoredLines").value(),
                        fileName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "linesToBeCovered", typeHint = "array")
    @ConvertedParameter(index = 2, name = "linesToBeUsed", typeHint = "array")
    private Object performUnintentionallyCoveredCodeCheck(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        Object linesToBeCovered = assignParameter(args, 1, null);
        Object linesToBeUsed = assignParameter(args, 2, null);
        Object _data = null;
        Object file = null;
        Object flag = null;
        Object line = null;
        Object unintentionallyCoveredUnits = ZVal.newArray();
        Object allowedLines = ZVal.newArray();
        allowedLines =
                env.callMethod(
                        this,
                        "getAllowedLines",
                        CodeCoverage.class,
                        linesToBeCovered,
                        linesToBeUsed);
        unintentionallyCoveredUnits = ZVal.newArray();
        for (ZPair zpairResult98 : ZVal.getIterable(data.getObject(), env, false)) {
            file = ZVal.assign(zpairResult98.getKey());
            _data = ZVal.assign(zpairResult98.getValue());
            for (ZPair zpairResult99 : ZVal.getIterable(_data, env, false)) {
                line = ZVal.assign(zpairResult99.getKey());
                flag = ZVal.assign(zpairResult99.getValue());
                if (ZVal.toBool(ZVal.strictEqualityCheck(flag, "===", 1))
                        && ZVal.toBool(
                                !ZVal.isset(ZVal.getElementRecursive(allowedLines, file, line)))) {
                    ZVal.addToArray(
                            unintentionallyCoveredUnits,
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("wizard").value(),
                                    "lookup",
                                    CodeCoverage.class,
                                    file,
                                    line));
                }
            }
        }

        unintentionallyCoveredUnits =
                env.callMethod(
                        this,
                        "processUnintentionallyCoveredUnits",
                        CodeCoverage.class,
                        unintentionallyCoveredUnits);
        if (!ZVal.isEmpty(unintentionallyCoveredUnits)) {
            throw ZVal.getException(
                    env, new UnintentionallyCoveredCodeException(env, unintentionallyCoveredUnits));
        }

        return null;
    }

    public Object performUnintentionallyCoveredCodeCheck(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "linesToBeCovered", typeHint = "array")
    @ConvertedParameter(index = 2, name = "linesToBeUsed", typeHint = "array")
    private Object performUnexecutedCoveredCodeCheck(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        Object linesToBeCovered = assignParameter(args, 1, null);
        Object linesToBeUsed = assignParameter(args, 2, null);
        Object codeUnit = null;
        Object executedCodeUnits = null;
        Object message = null;
        executedCodeUnits =
                env.callMethod(this, "coverageToCodeUnits", CodeCoverage.class, data.getObject());
        message = "";
        for (ZPair zpairResult100 :
                ZVal.getIterable(
                        env.callMethod(
                                this, "linesToCodeUnits", CodeCoverage.class, linesToBeCovered),
                        env,
                        true)) {
            codeUnit = ZVal.assign(zpairResult100.getValue());
            if (!CRArrayF.in_array.env(env).call(codeUnit, executedCodeUnits).getBool()) {
                message =
                        toStringR(message, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "- %s is expected to be executed (@covers) but was not executed"
                                                                + "\n",
                                                        codeUnit)
                                                .value(),
                                        env);
            }
        }

        for (ZPair zpairResult101 :
                ZVal.getIterable(
                        env.callMethod(this, "linesToCodeUnits", CodeCoverage.class, linesToBeUsed),
                        env,
                        true)) {
            codeUnit = ZVal.assign(zpairResult101.getValue());
            if (!CRArrayF.in_array.env(env).call(codeUnit, executedCodeUnits).getBool()) {
                message =
                        toStringR(message, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "- %s is expected to be executed (@uses) but was not executed"
                                                                + "\n",
                                                        codeUnit)
                                                .value(),
                                        env);
            }
        }

        if (!ZVal.isEmpty(message)) {
            throw ZVal.getException(env, new CoveredCodeNotExecutedException(env, message));
        }

        return null;
    }

    public Object performUnexecutedCoveredCodeCheck(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "linesToBeCovered", typeHint = "array")
    @ConvertedParameter(index = 1, name = "linesToBeUsed", typeHint = "array")
    private Object getAllowedLines(RuntimeEnv env, Object... args) {
        Object linesToBeCovered = assignParameter(args, 0, null);
        if (ZVal.isNull(linesToBeCovered)) {
            linesToBeCovered = ZVal.newArray();
        }
        Object linesToBeUsed = assignParameter(args, 1, null);
        if (ZVal.isNull(linesToBeUsed)) {
            linesToBeUsed = ZVal.newArray();
        }
        Object file = null;
        Object allowedLines = ZVal.newArray();
        allowedLines = ZVal.newArray();
        for (ZPair zpairResult102 :
                ZVal.getIterable(
                        CRArrayF.array_keys.env(env).call(linesToBeCovered).value(), env, true)) {
            file = ZVal.assign(zpairResult102.getValue());
            if (!ZVal.isset(ZVal.getElement(allowedLines, file))) {
                ZVal.putArrayElement(allowedLines, file, ZVal.newArray());
            }

            ZVal.putArrayElement(
                    allowedLines,
                    file,
                    CRArrayF.array_merge
                            .env(env)
                            .call(
                                    ZVal.getElement(allowedLines, file),
                                    ZVal.getElement(linesToBeCovered, file))
                            .value());
        }

        for (ZPair zpairResult103 :
                ZVal.getIterable(
                        CRArrayF.array_keys.env(env).call(linesToBeUsed).value(), env, true)) {
            file = ZVal.assign(zpairResult103.getValue());
            if (!ZVal.isset(ZVal.getElement(allowedLines, file))) {
                ZVal.putArrayElement(allowedLines, file, ZVal.newArray());
            }

            ZVal.putArrayElement(
                    allowedLines,
                    file,
                    CRArrayF.array_merge
                            .env(env)
                            .call(
                                    ZVal.getElement(allowedLines, file),
                                    ZVal.getElement(linesToBeUsed, file))
                            .value());
        }

        for (ZPair zpairResult104 :
                ZVal.getIterable(
                        CRArrayF.array_keys.env(env).call(allowedLines).value(), env, true)) {
            file = ZVal.assign(zpairResult104.getValue());
            ZVal.putArrayElement(
                    allowedLines,
                    file,
                    CRArrayF.array_flip
                            .env(env)
                            .call(
                                    CRArrayF.array_unique
                                            .env(env)
                                            .call(ZVal.getElement(allowedLines, file))
                                            .value())
                            .value());
        }

        return ZVal.assign(allowedLines);
    }

    @ConvertedMethod
    private Object selectDriver(RuntimeEnv env, Object... args) {
        Object runtime = null;
        runtime = new Runtime(env);
        if (!ZVal.isTrue(env.callMethod(runtime, "canCollectCodeCoverage", CodeCoverage.class))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "No code coverage driver available"));
        }

        if (ZVal.isTrue(env.callMethod(runtime, "isPHPDBG", CodeCoverage.class))) {
            return ZVal.assign(new PHPDBG(env));
        }

        if (ZVal.isTrue(env.callMethod(runtime, "hasXdebug", CodeCoverage.class))) {
            return ZVal.assign(new Xdebug(env));
        }

        throw ZVal.getException(
                env, new RuntimeException(env, "No code coverage driver available"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unintentionallyCoveredUnits", typeHint = "array")
    private Object processUnintentionallyCoveredUnits(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object unintentionallyCoveredUnits = assignParameter(args, 0, null);
        if (ZVal.isNull(unintentionallyCoveredUnits)) {
            unintentionallyCoveredUnits = ZVal.newArray();
        }
        Object unit = ZVal.newArray();
        Object v = null;
        Object k = null;
        Object whitelisted = null;
        Object _pClass = null;
        unintentionallyCoveredUnits =
                CRArrayF.array_unique.env(env).call(unintentionallyCoveredUnits).value();
        CRArrayF.sort.env(env).call(unintentionallyCoveredUnits);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult105 :
                ZVal.getIterable(
                        CRArrayF.array_keys.env(env).call(unintentionallyCoveredUnits).value(),
                        env,
                        false)) {
            k = ZVal.assign(zpairResult105.getKey());
            v = ZVal.assign(zpairResult105.getValue());
            unit =
                    NamespaceGlobal.explode
                            .env(env)
                            .call("::", ZVal.getElement(unintentionallyCoveredUnits, k))
                            .value();
            if (ZVal.strictNotEqualityCheck(CRArrayF.count.env(env).call(unit).value(), "!==", 2)) {
                continue;
            }

            _pClass = new ReflectionClass(env, ZVal.getElement(unit, 0));
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult106 :
                    ZVal.getIterable(
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("unintentionallyCoveredSubclassesWhitelist")
                                    .value(),
                            env,
                            true)) {
                whitelisted = ZVal.assign(zpairResult106.getValue());
                if (ZVal.isTrue(
                        env.callMethod(_pClass, "isSubclassOf", CodeCoverage.class, whitelisted))) {
                    ZVal.unsetArrayElement(unintentionallyCoveredUnits, k);
                    break;
                }
            }
        }

        return ZVal.assign(
                CRArrayF.array_values.env(env).call(unintentionallyCoveredUnits).value());
    }

    @ConvertedMethod
    private Object initializeData(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/php-code-coverage/src")
                        .setFile("/vendor/phpunit/php-code-coverage/src/CodeCoverage.php");
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope9 scope = new Scope9();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            int runtimeConverterContinueCount;
            scope.coverage = null;
            scope.file = null;
            scope.data = ZVal.newArray();
            scope.fileCoverage = ZVal.newArray();
            scope.key = null;
            toObjectR(scope._thisVarAlias).accessProp(this, env).name("isInitialized").set(true);
            if (toObjectR(scope._thisVarAlias)
                    .accessProp(this, env)
                    .name("processUncoveredFilesFromWhitelist")
                    .getBool()) {
                toObjectR(scope._thisVarAlias)
                        .accessProp(this, env)
                        .name("shouldCheckForDeadAndUnused")
                        .set(false);
                env.callMethod(
                        toObjectR(scope._thisVarAlias).accessProp(this, env).name("driver").value(),
                        "start",
                        CodeCoverage.class);
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult107 :
                        ZVal.getIterable(
                                env.callMethod(
                                        toObjectR(scope._thisVarAlias)
                                                .accessProp(this, env)
                                                .name("filter")
                                                .value(),
                                        "getWhitelist",
                                        CodeCoverage.class),
                                env,
                                true)) {
                    scope.file = ZVal.assign(zpairResult107.getValue());
                    if (ZVal.isTrue(
                            env.callMethod(
                                    toObjectR(scope._thisVarAlias)
                                            .accessProp(this, env)
                                            .name("filter")
                                            .value(),
                                    "isFile",
                                    CodeCoverage.class,
                                    scope.file))) {
                        env.include(
                                toStringR(scope.file, env),
                                stack,
                                runtimeConverterFunctionClassConstants,
                                false,
                                true);
                    }
                }

                scope.data = ZVal.newArray();
                scope.coverage =
                        env.callMethod(
                                toObjectR(scope._thisVarAlias)
                                        .accessProp(this, env)
                                        .name("driver")
                                        .value(),
                                "stop",
                                CodeCoverage.class);
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult108 : ZVal.getIterable(scope.coverage, env, false)) {
                    scope.file = ZVal.assign(zpairResult108.getKey());
                    scope.fileCoverage = ZVal.assign(zpairResult108.getValue());
                    if (ZVal.isTrue(
                            env.callMethod(
                                    toObjectR(scope._thisVarAlias)
                                            .accessProp(this, env)
                                            .name("filter")
                                            .value(),
                                    "isFiltered",
                                    CodeCoverage.class,
                                    scope.file))) {
                        continue;
                    }

                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult109 :
                            ZVal.getIterable(
                                    CRArrayF.array_keys.env(env).call(scope.fileCoverage).value(),
                                    env,
                                    true)) {
                        scope.key = ZVal.assign(zpairResult109.getValue());
                        if (ZVal.strictEqualityCheck(
                                ZVal.getElement(scope.fileCoverage, scope.key),
                                "===",
                                Driver.CONST_LINE_EXECUTED)) {
                            ZVal.putArrayElement(
                                    scope.fileCoverage, scope.key, Driver.CONST_LINE_NOT_EXECUTED);
                        }
                    }

                    ZVal.putArrayElement(scope.data, scope.file, scope.fileCoverage);
                }

                env.callMethod(
                        scope._thisVarAlias,
                        "append",
                        CodeCoverage.class,
                        scope.data,
                        "UNCOVERED_FILES_FROM_WHITELIST");
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object coverageToCodeUnits(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, null);
        Object codeUnits = ZVal.newArray();
        Object flag = null;
        Object filename = null;
        Object line = null;
        Object lines = null;
        codeUnits = ZVal.newArray();
        for (ZPair zpairResult110 : ZVal.getIterable(data, env, false)) {
            filename = ZVal.assign(zpairResult110.getKey());
            lines = ZVal.assign(zpairResult110.getValue());
            for (ZPair zpairResult111 : ZVal.getIterable(lines, env, false)) {
                line = ZVal.assign(zpairResult111.getKey());
                flag = ZVal.assign(zpairResult111.getValue());
                if (ZVal.strictEqualityCheck(flag, "===", 1)) {
                    ZVal.addToArray(
                            codeUnits,
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("wizard").value(),
                                    "lookup",
                                    CodeCoverage.class,
                                    filename,
                                    line));
                }
            }
        }

        return ZVal.assign(CRArrayF.array_unique.env(env).call(codeUnits).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object linesToCodeUnits(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, null);
        Object codeUnits = ZVal.newArray();
        Object filename = null;
        Object line = null;
        Object lines = null;
        codeUnits = ZVal.newArray();
        for (ZPair zpairResult112 : ZVal.getIterable(data, env, false)) {
            filename = ZVal.assign(zpairResult112.getKey());
            lines = ZVal.assign(zpairResult112.getValue());
            for (ZPair zpairResult113 : ZVal.getIterable(lines, env, true)) {
                line = ZVal.assign(zpairResult113.getValue());
                ZVal.addToArray(
                        codeUnits,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("wizard").value(),
                                "lookup",
                                CodeCoverage.class,
                                filename,
                                line));
            }
        }

        return ZVal.assign(CRArrayF.array_unique.env(env).call(codeUnits).value());
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\CodeCoverage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\CodeCoverage")
                    .setLookup(CodeCoverage.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "addUncoveredFilesFromWhitelist",
                            "cacheTokens",
                            "checkForMissingCoversAnnotation",
                            "checkForUnexecutedCoveredCode",
                            "checkForUnintentionallyCoveredCode",
                            "currentId",
                            "data",
                            "disableIgnoredLines",
                            "driver",
                            "filter",
                            "forceCoversAnnotation",
                            "ignoreDeprecatedCode",
                            "ignoredLines",
                            "isInitialized",
                            "processUncoveredFilesFromWhitelist",
                            "report",
                            "shouldCheckForDeadAndUnused",
                            "tests",
                            "unintentionallyCoveredSubclassesWhitelist",
                            "wizard")
                    .setFilename("vendor/phpunit/php-code-coverage/src/CodeCoverage.php")
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

    private static class Scope9 implements UpdateRuntimeScopeInterface {

        Object coverage;
        Object file;
        Object data;
        Object fileCoverage;
        Object _thisVarAlias;
        Object key;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("coverage", this.coverage);
            stack.setVariable("file", this.file);
            stack.setVariable("data", this.data);
            stack.setVariable("fileCoverage", this.fileCoverage);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("key", this.key);
        }

        public void updateScope(RuntimeStack stack) {

            this.coverage = stack.getVariable("coverage");
            this.file = stack.getVariable("file");
            this.data = stack.getVariable("data");
            this.fileCoverage = stack.getVariable("fileCoverage");
            this._thisVarAlias = stack.getVariable("this");
            this.key = stack.getVariable("key");
        }
    }

    private enum SwitchEnumType6 {
        DYNAMIC_TYPE_13,
        DYNAMIC_TYPE_14,
        DYNAMIC_TYPE_15,
        DYNAMIC_TYPE_16,
        DYNAMIC_TYPE_17,
        DYNAMIC_TYPE_18,
        DYNAMIC_TYPE_19,
        DYNAMIC_TYPE_20,
        DYNAMIC_TYPE_21,
        DYNAMIC_TYPE_22,
        DYNAMIC_TYPE_23,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
