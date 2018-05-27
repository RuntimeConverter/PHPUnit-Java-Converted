package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.InvalidArgumentHelper;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestCase;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestSuiteError;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuiteIterator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestResult;
import com.runtimeconverter.runtime.modules.standard.other.function_get_declared_classes;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.DataProviderTestSuite;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.FileLoader;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/TestSuite.php

*/

public class TestSuite extends RuntimeClassBase
        implements com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PHPUnit
                        .namespaces
                        .Framework
                        .classes
                        .Test,
                SelfDescribing,
                IteratorAggregate {

    public Object backupGlobals = null;

    public Object backupStaticAttributes = null;

    public Object runTestInSeparateProcess = false;

    public Object name = "";

    public Object groups = ZVal.newArray();

    public Object tests = ZVal.newArray();

    public Object numTests = -1;

    public Object testCase = false;

    public Object foundClasses = ZVal.newArray();

    public Object cachedNumTests = null;

    public Object beStrictAboutChangesToGlobalState = null;

    public Object iteratorFilter = null;

    public Object declaredClasses = null;

    public TestSuite(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestSuite.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "theClass")
    @ConvertedParameter(index = 1, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object theClass = assignParameter(args, 0, null);
        if (ZVal.isNull(theClass)) {
            theClass = "";
        }
        Object name = assignParameter(args, 1, null);
        if (ZVal.isNull(name)) {
            name = "";
        }
        Object method = null;
        Object argumentsValid = null;
        Object constructor = null;
        toObjectR(this)
                .accessProp(this, env)
                .name("declaredClasses")
                .set(function_get_declared_classes.f.env(env).call().value());
        argumentsValid = false;
        if (ZVal.toBool(function_is_object.f.env(env).call(theClass).value())
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                theClass, ReflectionClass.class, "ReflectionClass"))) {
            argumentsValid = true;

        } else if (ZVal.toBool(
                        ZVal.toBool(function_is_string.f.env(env).call(theClass).value())
                                && ZVal.toBool(ZVal.strictNotEqualityCheck(theClass, "!==", "")))
                && ZVal.toBool(function_class_exists.f.env(env).call(theClass, false).value())) {
            argumentsValid = true;
            if (ZVal.equalityCheck(name, "")) {
                name = ZVal.assign(theClass);
            }

            theClass = new ReflectionClass(env, theClass);

        } else if (function_is_string.f.env(env).call(theClass).getBool()) {
            env.callMethod(this, "setName", TestSuite.class, theClass);
            return null;
        }

        if (!ZVal.isTrue(argumentsValid)) {
            throw ZVal.getException(env, new Exception(env));
        }

        if (!ZVal.isTrue(
                env.callMethod(theClass, "isSubclassOf", TestSuite.class, TestCase.CONST_class))) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            "Class \""
                                    + toStringR(
                                            toObjectR(theClass)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            env)
                                    + "\" does not extend PHPUnit\\Framework\\TestCase."));
        }

        if (ZVal.notEqualityCheck(name, "")) {
            env.callMethod(this, "setName", TestSuite.class, name);

        } else {
            env.callMethod(
                    this,
                    "setName",
                    TestSuite.class,
                    env.callMethod(theClass, "getName", TestSuite.class));
        }

        constructor = env.callMethod(theClass, "getConstructor", TestSuite.class);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(constructor, "!==", ZVal.getNull()))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(constructor, "isPublic", TestSuite.class)))) {
            env.callMethod(
                    this,
                    "addTest",
                    TestSuite.class,
                    runtimeStaticObject.warning(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Class \"%s\" has no public constructor.",
                                            env.callMethod(theClass, "getName", TestSuite.class))
                                    .value()));
            return null;
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult300 :
                ZVal.getIterable(
                        env.callMethod(theClass, "getMethods", TestSuite.class), env, true)) {
            method = ZVal.assign(zpairResult300.getValue());
            if (ZVal.strictEqualityCheck(
                    env.callMethod(
                            env.callMethod(method, "getDeclaringClass", TestSuite.class),
                            "getName",
                            TestSuite.class),
                    "===",
                    Assert.CONST_class)) {
                continue;
            }

            if (ZVal.strictEqualityCheck(
                    env.callMethod(
                            env.callMethod(method, "getDeclaringClass", TestSuite.class),
                            "getName",
                            TestSuite.class),
                    "===",
                    TestCase.CONST_class)) {
                continue;
            }

            env.callMethod(this, "addTestMethod", TestSuite.class, theClass, method);
        }

        if (ZVal.isEmpty(toObjectR(this).accessProp(this, env).name("tests").value())) {
            env.callMethod(
                    this,
                    "addTest",
                    TestSuite.class,
                    runtimeStaticObject.warning(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "No tests found in class \"%s\".",
                                            env.callMethod(theClass, "getName", TestSuite.class))
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("testCase").set(true);
        return null;
    }

    @ConvertedMethod
    protected Object setUp(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    protected Object tearDown(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getName", TestSuite.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "groups", defaultValue = "", defaultValueType = "array")
    public Object addTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object groups = assignParameter(args, 1, null);
        if (ZVal.isNull(groups)) {
            groups = ZVal.newArray();
        }
        Object _pClass = null;
        Object group = null;
        _pClass = new ReflectionClass(env, test);
        if (!ZVal.isTrue(env.callMethod(_pClass, "isAbstract", TestSuite.class))) {
            ZVal.addToArray(toObjectR(this).accessProp(this, env).name("tests").value(), test);
            toObjectR(this).accessProp(this, env).name("numTests").set(-1);
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    test,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .TestSuite
                                            .class,
                                    "PHPUnit\\FrameworkTestSuite"))
                    && ZVal.toBool(ZVal.isEmpty(groups))) {
                groups = env.callMethod(test, "getGroups", TestSuite.class);
            }

            if (ZVal.isEmpty(groups)) {
                groups = ZVal.newArray(new ZPair(0, "default"));
            }

            for (ZPair zpairResult301 : ZVal.getIterable(groups, env, true)) {
                group = ZVal.assign(zpairResult301.getValue());
                if (!ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("groups").value(),
                                group))) {
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("groups").value(),
                            group,
                            ZVal.newArray(new ZPair(0, test)));

                } else {
                    ZVal.setElementRecursive(
                            toObjectR(this).accessProp(this, env).name("groups").value(),
                            test,
                            group,
                            ZVal.addToArray);
                }
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                env.callMethod(test, "setGroups", TestSuite.class, groups);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testClass")
    public Object addTestSuite(RuntimeEnv env, Object... args) {
        Object testClass = assignParameter(args, 0, null);
        Object method = null;
        Object suiteMethod = null;
        if (ZVal.toBool(function_is_string.f.env(env).call(testClass).value())
                && ZVal.toBool(function_class_exists.f.env(env).call(testClass).value())) {
            testClass = new ReflectionClass(env, testClass);
        }

        if (!function_is_object.f.env(env).call(testClass).getBool()) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(
                            env, 1, "class name or object"));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        testClass,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Framework
                                .classes
                                .TestSuite
                                .class,
                        "PHPUnit\\FrameworkTestSuite"))) {
            env.callMethod(this, "addTest", TestSuite.class, testClass);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(testClass, ReflectionClass.class, "ReflectionClass"))) {
            suiteMethod = false;
            if (ZVal.toBool(!ZVal.isTrue(env.callMethod(testClass, "isAbstract", TestSuite.class)))
                    && ZVal.toBool(
                            env.callMethod(
                                    testClass,
                                    "hasMethod",
                                    TestSuite.class,
                                    BaseTestRunner.CONST_SUITE_METHODNAME))) {
                method =
                        env.callMethod(
                                testClass,
                                "getMethod",
                                TestSuite.class,
                                BaseTestRunner.CONST_SUITE_METHODNAME);
                if (ZVal.isTrue(env.callMethod(method, "isStatic", TestSuite.class))) {
                    env.callMethod(
                            this,
                            "addTest",
                            TestSuite.class,
                            env.callMethod(
                                    method,
                                    "invoke",
                                    TestSuite.class,
                                    ZVal.getNull(),
                                    env.callMethod(testClass, "getName", TestSuite.class)));
                    suiteMethod = true;
                }
            }

            if (ZVal.toBool(
                            ZVal.toBool(!ZVal.isTrue(suiteMethod))
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            testClass,
                                                            "isAbstract",
                                                            TestSuite.class))))
                    && ZVal.toBool(
                            env.callMethod(
                                    testClass,
                                    "isSubclassOf",
                                    TestSuite.class,
                                    TestCase.CONST_class))) {
                env.callMethod(
                        this,
                        "addTest",
                        TestSuite.class,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Framework
                                .classes
                                .TestSuite(env, testClass));
            }

        } else {
            throw ZVal.getException(env, new Exception(env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object addTestFile(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object filename = assignParameter(args, 0, null);
        Object shortNameRegEx = null;
        Object newClasses = null;
        Object method = null;
        Object i = null;
        Object className = null;
        Object shortName = null;
        Object _pClass = null;
        if (ZVal.toBool(NamespaceGlobal.file_exists.env(env).call(filename).value())
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                NamespaceGlobal.substr.env(env).call(filename, -5).value(),
                                ".phpt"))) {
            env.callMethod(this, "addTest", TestSuite.class, new PhptTestCase(env, filename));
            return null;
        }

        filename = FileLoader.runtimeStaticObject.checkAndLoad(env, filename);
        newClasses =
                CRArrayF.array_diff
                        .env(env)
                        .call(
                                function_get_declared_classes.f.env(env).call().value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("declaredClasses")
                                        .value())
                        .value();
        if (!ZVal.isEmpty(newClasses)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("foundClasses")
                    .set(
                            CRArrayF.array_merge
                                    .env(env)
                                    .call(
                                            newClasses,
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("foundClasses")
                                                    .value())
                                    .value());
            toObjectR(this)
                    .accessProp(this, env)
                    .name("declaredClasses")
                    .set(function_get_declared_classes.f.env(env).call().value());
        }

        shortName = NamespaceGlobal.basename.env(env).call(filename, ".php").value();
        shortNameRegEx =
                "/(?:^|_|\\\\)"
                        + toStringR(
                                NamespaceGlobal.preg_quote.env(env).call(shortName, "/").value(),
                                env)
                        + "$/";
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult302 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("foundClasses").value(),
                        env,
                        false)) {
            i = ZVal.assign(zpairResult302.getKey());
            className = ZVal.assign(zpairResult302.getValue());
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences())
                    .call(shortNameRegEx, className)
                    .getBool()) {
                _pClass = new ReflectionClass(env, className);
                if (ZVal.equalityCheck(
                        env.callMethod(_pClass, "getFileName", TestSuite.class), filename)) {
                    newClasses = ZVal.newArray(new ZPair(0, className));
                    ZVal.unsetArrayElement(
                            toObjectR(this).accessProp(this, env).name("foundClasses").value(), i);
                    break;
                }
            }
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult303 : ZVal.getIterable(newClasses, env, true)) {
            className = ZVal.assign(zpairResult303.getValue());
            _pClass = new ReflectionClass(env, className);
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.dirname
                            .env(env)
                            .call(env.callMethod(_pClass, "getFileName", TestSuite.class))
                            .value(),
                    "===",
                    env.addRootFilesystemPrefix("/vendor/phpunit/phpunit/src/Framework"))) {
                continue;
            }

            if (!ZVal.isTrue(env.callMethod(_pClass, "isAbstract", TestSuite.class))) {
                if (ZVal.isTrue(
                        env.callMethod(
                                _pClass,
                                "hasMethod",
                                TestSuite.class,
                                BaseTestRunner.CONST_SUITE_METHODNAME))) {
                    method =
                            env.callMethod(
                                    _pClass,
                                    "getMethod",
                                    TestSuite.class,
                                    BaseTestRunner.CONST_SUITE_METHODNAME);
                    if (ZVal.isTrue(env.callMethod(method, "isStatic", TestSuite.class))) {
                        env.callMethod(
                                this,
                                "addTest",
                                TestSuite.class,
                                env.callMethod(
                                        method,
                                        "invoke",
                                        TestSuite.class,
                                        ZVal.getNull(),
                                        className));
                    }

                } else if (ZVal.isTrue(
                        env.callMethod(
                                _pClass,
                                "implementsInterface",
                                TestSuite.class,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Test
                                        .CONST_class))) {
                    env.callMethod(this, "addTestSuite", TestSuite.class, _pClass);
                }
            }
        }

        toObjectR(this).accessProp(this, env).name("numTests").set(-1);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileNames")
    public Object addTestFiles(RuntimeEnv env, Object... args) {
        Object fileNames = assignParameter(args, 0, null);
        Object filename = null;
        if (!ZVal.toBool(function_is_array.f.env(env).call(fileNames).value())
                || ZVal.toBool(
                        ZVal.toBool(function_is_object.f.env(env).call(fileNames).value())
                                && ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                fileNames, Iterator.class, "Iterator")))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "array or iterator"));
        }

        for (ZPair zpairResult304 : ZVal.getIterable(fileNames, env, true)) {
            filename = ZVal.assign(zpairResult304.getValue());
            env.callMethod(this, "addTestFile", TestSuite.class, toStringR(filename, env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "preferCache",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object count(RuntimeEnv env, Object... args) {
        Object preferCache = assignParameter(args, 0, null);
        if (ZVal.isNull(preferCache)) {
            preferCache = false;
        }
        Object numTests = null;
        Object test = null;
        if (ZVal.toBool(preferCache)
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("cachedNumTests")
                                        .value(),
                                "!==",
                                ZVal.getNull()))) {
            return ZVal.assign(
                    toObjectR(this).accessProp(this, env).name("cachedNumTests").value());
        }

        numTests = 0;
        for (ZPair zpairResult305 : ZVal.getIterable(this, env, true)) {
            test = ZVal.assign(zpairResult305.getValue());
            numTests = ZAssignment.add("+=", numTests, CRArrayF.count.env(env).call(test).value());
        }

        toObjectR(this).accessProp(this, env).name("cachedNumTests").set(numTests);
        return ZVal.assign(numTests);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getGroups(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.array_keys
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("groups").value())
                        .value());
    }

    @ConvertedMethod
    public Object getGroupDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("groups").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "groups", typeHint = "array")
    public Object setGroupDetails(RuntimeEnv env, Object... args) {
        Object groups = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("groups").set(groups);
        return null;
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
        int runtimeConverterBreakCount;
        Object result = assignParameter(args, 0, null);
        if (ZVal.isNull(result)) {
            result = ZVal.getNull();
        }
        Object missingRequirements = null;
        Object numTests = null;
        Object t = null;
        Object test = null;
        Object e = null;
        Object _t = null;
        Object beforeClassMethod = null;
        Object hookMethods = ZVal.newArray();
        Object i = null;
        Object afterClassMethod = null;
        if (ZVal.strictEqualityCheck(result, "===", ZVal.getNull())) {
            result = env.callMethod(this, "createResult", TestSuite.class);
        }

        if (ZVal.equalityCheck(CRArrayF.count.env(env).call(this).value(), 0)) {
            return ZVal.assign(result);
        }

        hookMethods =
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getHookMethods(
                        env, toObjectR(this).accessProp(this, env).name("name").value());
        env.callMethod(result, "startTestSuite", TestSuite.class, this);
        try {
            env.callMethod(this, "setUp", TestSuite.class);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult306 :
                    ZVal.getIterable(ZVal.getElement(hookMethods, "beforeClass"), env, true)) {
                beforeClassMethod = ZVal.assign(zpairResult306.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("testCase")
                                                                .value(),
                                                        "===",
                                                        true))
                                        && ZVal.toBool(
                                                function_class_exists
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("name")
                                                                        .value(),
                                                                false)
                                                        .value()))
                        && ZVal.toBool(
                                function_method_exists
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                beforeClassMethod)
                                        .value())) {
                    if (ZVal.isTrue(
                            missingRequirements =
                                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                            .namespaces.Util.classes.Test.runtimeStaticObject
                                            .getMissingRequirements(
                                                    env,
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    beforeClassMethod))) {
                        env.callMethod(
                                this,
                                "markTestSuiteSkipped",
                                TestSuite.class,
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("\n", missingRequirements)
                                        .value());
                    }

                    function_call_user_func
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value()),
                                            new ZPair(1, beforeClassMethod)));
                }
            }

        } catch (ConvertedException convertedException43) {
            if (convertedException43.instanceOf(
                    SkippedTestSuiteError.class, "PHPUnit\\Framework\\SkippedTestSuiteError")) {
                e = convertedException43.getObject();
                numTests = CRArrayF.count.env(env).call(this).value();
                runtimeConverterBreakCount = 0;
                for (i = 0; ZVal.isLessThan(i, '<', numTests); i = ZVal.increment(i)) {
                    env.callMethod(result, "startTest", TestSuite.class, this);
                    env.callMethod(result, "addFailure", TestSuite.class, this, e, 0);
                    env.callMethod(result, "endTest", TestSuite.class, this, 0);
                }

                env.callMethod(this, "tearDown", TestSuite.class);
                env.callMethod(result, "endTestSuite", TestSuite.class, this);
                return ZVal.assign(result);
            } else if (convertedException43.instanceOf(Throwable.class, "Throwable")) {
                _t = convertedException43.getObject();
                t = ZVal.assign(_t);
            } else if (convertedException43.instanceOf(
                    Exception.class, "PHPUnit\\Framework\\Exception")) {
                _t = convertedException43.getObject();
                t = ZVal.assign(_t);
            } else {
                throw convertedException43;
            }
        }

        if (ZVal.isset(t)) {
            numTests = CRArrayF.count.env(env).call(this).value();
            runtimeConverterBreakCount = 0;
            for (i = 0; ZVal.isLessThan(i, '<', numTests); i = ZVal.increment(i)) {
                if (ZVal.isTrue(env.callMethod(result, "shouldStop", TestSuite.class))) {
                    break;
                }

                env.callMethod(result, "startTest", TestSuite.class, this);
                env.callMethod(result, "addError", TestSuite.class, this, t, 0);
                env.callMethod(result, "endTest", TestSuite.class, this, 0);
            }

            env.callMethod(this, "tearDown", TestSuite.class);
            env.callMethod(result, "endTestSuite", TestSuite.class, this);
            return ZVal.assign(result);
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult307 : ZVal.getIterable(this, env, true)) {
            test = ZVal.assign(zpairResult307.getValue());
            if (ZVal.isTrue(env.callMethod(result, "shouldStop", TestSuite.class))) {
                break;
            }

            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    test, TestCase.class, "PHPUnit\\Framework\\TestCase"))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    test,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .TestSuite
                                            .class,
                                    "PHPUnit\\FrameworkTestSuite"))) {
                env.callMethod(
                        test,
                        "setBeStrictAboutChangesToGlobalState",
                        TestSuite.class,
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("beStrictAboutChangesToGlobalState")
                                .value());
                env.callMethod(
                        test,
                        "setBackupGlobals",
                        TestSuite.class,
                        toObjectR(this).accessProp(this, env).name("backupGlobals").value());
                env.callMethod(
                        test,
                        "setBackupStaticAttributes",
                        TestSuite.class,
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("backupStaticAttributes")
                                .value());
                env.callMethod(
                        test,
                        "setRunTestInSeparateProcess",
                        TestSuite.class,
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("runTestInSeparateProcess")
                                .value());
            }

            env.callMethod(test, "run", TestSuite.class, result);
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult308 :
                ZVal.getIterable(ZVal.getElement(hookMethods, "afterClass"), env, true)) {
            afterClassMethod = ZVal.assign(zpairResult308.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("testCase")
                                                            .value(),
                                                    "===",
                                                    true))
                                    && ZVal.toBool(
                                            function_class_exists
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("name")
                                                                    .value(),
                                                            false)
                                                    .value()))
                    && ZVal.toBool(
                            function_method_exists
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            afterClassMethod)
                                    .value())) {
                function_call_user_func
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value()),
                                        new ZPair(1, afterClassMethod)));
            }
        }

        env.callMethod(this, "tearDown", TestSuite.class);
        env.callMethod(result, "endTestSuite", TestSuite.class, this);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runTestInSeparateProcess", typeHint = "bool")
    public Object setRunTestInSeparateProcess(RuntimeEnv env, Object... args) {
        Object runTestInSeparateProcess = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("runTestInSeparateProcess")
                .set(runTestInSeparateProcess);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("name").set(name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index", typeHint = "int")
    public Object testAt(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, null);
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("tests").value(), index))) {
            return ZVal.assign(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("tests").value(), index));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object tests(RuntimeEnv env, Object... args) {
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
    @ConvertedParameter(index = 0, name = "message")
    public Object markTestSuiteSkipped(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        throw ZVal.getException(env, new SkippedTestSuiteError(env, message));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "beStrictAboutChangesToGlobalState")
    public Object setBeStrictAboutChangesToGlobalState(RuntimeEnv env, Object... args) {
        Object beStrictAboutChangesToGlobalState = assignParameter(args, 0, null);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("beStrictAboutChangesToGlobalState")
                                        .value()))
                && ZVal.toBool(
                        NamespaceGlobal.is_bool
                                .env(env)
                                .call(beStrictAboutChangesToGlobalState)
                                .value())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("beStrictAboutChangesToGlobalState")
                    .set(beStrictAboutChangesToGlobalState);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backupGlobals")
    public Object setBackupGlobals(RuntimeEnv env, Object... args) {
        Object backupGlobals = assignParameter(args, 0, null);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("backupGlobals")
                                        .value()))
                && ZVal.toBool(NamespaceGlobal.is_bool.env(env).call(backupGlobals).value())) {
            toObjectR(this).accessProp(this, env).name("backupGlobals").set(backupGlobals);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backupStaticAttributes")
    public Object setBackupStaticAttributes(RuntimeEnv env, Object... args) {
        Object backupStaticAttributes = assignParameter(args, 0, null);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("backupStaticAttributes")
                                        .value()))
                && ZVal.toBool(
                        NamespaceGlobal.is_bool.env(env).call(backupStaticAttributes).value())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("backupStaticAttributes")
                    .set(backupStaticAttributes);
        }

        return null;
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        Object iterator = null;
        iterator = new TestSuiteIterator(env, this);
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("iteratorFilter").value(),
                "!==",
                ZVal.getNull())) {
            iterator =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("iteratorFilter").value(),
                            "factory",
                            TestSuite.class,
                            iterator,
                            this);
        }

        return ZVal.assign(iterator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "PHPUnit\\Runner\\Filter\\Factory")
    public Object injectFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, null);
        Object test = null;
        toObjectR(this).accessProp(this, env).name("iteratorFilter").set(filter);
        for (ZPair zpairResult309 : ZVal.getIterable(this, env, true)) {
            test = ZVal.assign(zpairResult309.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .classes
                                    .TestSuite
                                    .class,
                            "PHPUnit\\FrameworkTestSuite"))) {
                env.callMethod(test, "injectFilter", TestSuite.class, filter);
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object createResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(new TestResult(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "method", typeHint = "ReflectionMethod")
    protected Object addTestMethod(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        Object method = assignParameter(args, 1, null);
        Object test = null;
        Object name = null;
        if (!ZVal.isTrue(env.callMethod(this, "isTestMethod", TestSuite.class, method))) {
            return null;
        }

        name = env.callMethod(method, "getName", TestSuite.class);
        if (!ZVal.isTrue(env.callMethod(method, "isPublic", TestSuite.class))) {
            env.callMethod(
                    this,
                    "addTest",
                    TestSuite.class,
                    runtimeStaticObject.warning(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Test method \"%s\" in test class \"%s\" is not public.",
                                            name,
                                            env.callMethod(_pClass, "getName", TestSuite.class))
                                    .value()));
            return null;
        }

        test = runtimeStaticObject.createTest(env, _pClass, name);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                test, TestCase.class, "PHPUnit\\Framework\\TestCase"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                test,
                                DataProviderTestSuite.class,
                                "PHPUnit\\Framework\\DataProviderTestSuite"))) {
            env.callMethod(
                    test,
                    "setDependencies",
                    TestSuite.class,
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getDependencies(
                            env, env.callMethod(_pClass, "getName", TestSuite.class), name));
        }

        env.callMethod(
                this,
                "addTest",
                TestSuite.class,
                test,
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getGroups(
                        env, env.callMethod(_pClass, "getName", TestSuite.class), name));
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\TestSuite";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "theClass", typeHint = "ReflectionClass")
        @ConvertedParameter(index = 1, name = "name")
        public Object createTest(RuntimeEnv env, Object... args) {
            Object theClass = assignParameter(args, 0, null);
            Object name = assignParameter(args, 1, null);
            Object _data = null;
            Object _test = null;
            Object test = null;
            Object data = null;
            Object runTestInSeparateProcess = null;
            Object e = null;
            Object constructor = null;
            Object groups = null;
            Object className = null;
            Object message = null;
            Object backupSettings = ZVal.newArray();
            Object _dataName = null;
            Object _message = null;
            Object t = null;
            Object _t = null;
            Object preserveGlobalState = null;
            Object runClassInSeparateProcess = null;
            Object parameters = null;
            className = env.callMethod(theClass, "getName", TestSuite.class);
            if (!ZVal.isTrue(env.callMethod(theClass, "isInstantiable", TestSuite.class))) {
                return ZVal.assign(
                        runtimeStaticObject.warning(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Cannot instantiate class \"%s\".", className)
                                        .value()));
            }

            backupSettings =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getBackupSettings(
                            env, className, name);
            preserveGlobalState =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getPreserveGlobalStateSettings(
                            env, className, name);
            runTestInSeparateProcess =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getProcessIsolationSettings(
                            env, className, name);
            runClassInSeparateProcess =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getClassProcessIsolationSettings(
                            env, className, name);
            constructor = env.callMethod(theClass, "getConstructor", TestSuite.class);
            if (ZVal.strictNotEqualityCheck(constructor, "!==", ZVal.getNull())) {
                parameters = env.callMethod(constructor, "getParameters", TestSuite.class);
                if (ZVal.isLessThan(CRArrayF.count.env(env).call(parameters).value(), '<', 2)) {
                    test = env.createNew(className);

                } else {
                    try {
                        data =
                                com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                        .namespaces.Util.classes.Test.runtimeStaticObject
                                        .getProvidedData(env, className, name);
                    } catch (ConvertedException convertedException44) {
                        if (convertedException44.instanceOf(
                                IncompleteTestError.class,
                                "PHPUnit\\Framework\\IncompleteTestError")) {
                            e = convertedException44.getObject();
                            message =
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "Test for %s::%s marked incomplete by data provider",
                                                    className, name)
                                            .value();
                            _message = env.callMethod(e, "getMessage", TestSuite.class);
                            if (!ZVal.isEmpty(_message)) {
                                message = toStringR(message, env) + "\n" + toStringR(_message, env);
                            }

                            data =
                                    runtimeStaticObject.incompleteTest(
                                            env, className, name, message);
                        } else if (convertedException44.instanceOf(
                                SkippedTestError.class, "PHPUnit\\Framework\\SkippedTestError")) {
                            e = convertedException44.getObject();
                            message =
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "Test for %s::%s skipped by data provider",
                                                    className, name)
                                            .value();
                            _message = env.callMethod(e, "getMessage", TestSuite.class);
                            if (!ZVal.isEmpty(_message)) {
                                message = toStringR(message, env) + "\n" + toStringR(_message, env);
                            }

                            data = runtimeStaticObject.skipTest(env, className, name, message);
                        } else if (convertedException44.instanceOf(Throwable.class, "Throwable")) {
                            _t = convertedException44.getObject();
                            t = ZVal.assign(_t);
                        } else if (convertedException44.instanceOf(
                                Exception.class, "PHPUnit\\Framework\\Exception")) {
                            _t = convertedException44.getObject();
                            t = ZVal.assign(_t);
                        } else {
                            throw convertedException44;
                        }
                    }

                    if (ZVal.isset(t)) {
                        message =
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "The data provider specified for %s::%s is invalid.",
                                                className, name)
                                        .value();
                        _message = env.callMethod(t, "getMessage", TestSuite.class);
                        if (!ZVal.isEmpty(_message)) {
                            message = toStringR(message, env) + "\n" + toStringR(_message, env);
                        }

                        data = runtimeStaticObject.warning(env, message);
                    }

                    if (ZVal.isset(data)) {
                        test =
                                new DataProviderTestSuite(
                                        env,
                                        toStringR(className, env) + "::" + toStringR(name, env));
                        if (ZVal.isEmpty(data)) {
                            data =
                                    runtimeStaticObject.warning(
                                            env,
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "No tests found in suite \"%s\".",
                                                            env.callMethod(
                                                                    test,
                                                                    "getName",
                                                                    TestSuite.class))
                                                    .value());
                        }

                        groups =
                                com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                        .namespaces.Util.classes.Test.runtimeStaticObject.getGroups(
                                        env, className, name);
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                data,
                                                                WarningTestCase.class,
                                                                "PHPUnit\\Framework\\WarningTestCase"))
                                                || ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                data,
                                                                SkippedTestCase.class,
                                                                "PHPUnit\\Framework\\SkippedTestCase")))
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                data,
                                                IncompleteTestCase.class,
                                                "PHPUnit\\Framework\\IncompleteTestCase"))) {
                            env.callMethod(test, "addTest", TestSuite.class, data, groups);

                        } else {
                            for (ZPair zpairResult299 : ZVal.getIterable(data, env, false)) {
                                _dataName = ZVal.assign(zpairResult299.getKey());
                                _data = ZVal.assign(zpairResult299.getValue());
                                _test = env.createNew(className, name, _data, _dataName);
                                if (ZVal.isTrue(runTestInSeparateProcess)) {
                                    env.callMethod(
                                            _test,
                                            "setRunTestInSeparateProcess",
                                            TestSuite.class,
                                            true);
                                    if (ZVal.strictNotEqualityCheck(
                                            preserveGlobalState, "!==", ZVal.getNull())) {
                                        env.callMethod(
                                                _test,
                                                "setPreserveGlobalState",
                                                TestSuite.class,
                                                preserveGlobalState);
                                    }
                                }

                                if (ZVal.isTrue(runClassInSeparateProcess)) {
                                    env.callMethod(
                                            _test,
                                            "setRunClassInSeparateProcess",
                                            TestSuite.class,
                                            true);
                                    if (ZVal.strictNotEqualityCheck(
                                            preserveGlobalState, "!==", ZVal.getNull())) {
                                        env.callMethod(
                                                _test,
                                                "setPreserveGlobalState",
                                                TestSuite.class,
                                                preserveGlobalState);
                                    }
                                }

                                if (ZVal.strictNotEqualityCheck(
                                        ZVal.getElement(backupSettings, "backupGlobals"),
                                        "!==",
                                        ZVal.getNull())) {
                                    env.callMethod(
                                            _test,
                                            "setBackupGlobals",
                                            TestSuite.class,
                                            ZVal.getElement(backupSettings, "backupGlobals"));
                                }

                                if (ZVal.strictNotEqualityCheck(
                                        ZVal.getElement(backupSettings, "backupStaticAttributes"),
                                        "!==",
                                        ZVal.getNull())) {
                                    env.callMethod(
                                            _test,
                                            "setBackupStaticAttributes",
                                            TestSuite.class,
                                            ZVal.getElement(
                                                    backupSettings, "backupStaticAttributes"));
                                }

                                env.callMethod(test, "addTest", TestSuite.class, _test, groups);
                            }
                        }

                    } else {
                        test = env.createNew(className);
                    }
                }
            }

            if (!ZVal.isset(test)) {
                throw ZVal.getException(env, new Exception(env, "No valid test provided."));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                env.callMethod(test, "setName", TestSuite.class, name);
                if (ZVal.isTrue(runTestInSeparateProcess)) {
                    env.callMethod(test, "setRunTestInSeparateProcess", TestSuite.class, true);
                    if (ZVal.strictNotEqualityCheck(preserveGlobalState, "!==", ZVal.getNull())) {
                        env.callMethod(
                                test,
                                "setPreserveGlobalState",
                                TestSuite.class,
                                preserveGlobalState);
                    }
                }

                if (ZVal.isTrue(runClassInSeparateProcess)) {
                    env.callMethod(test, "setRunClassInSeparateProcess", TestSuite.class, true);
                    if (ZVal.strictNotEqualityCheck(preserveGlobalState, "!==", ZVal.getNull())) {
                        env.callMethod(
                                test,
                                "setPreserveGlobalState",
                                TestSuite.class,
                                preserveGlobalState);
                    }
                }

                if (ZVal.strictNotEqualityCheck(
                        ZVal.getElement(backupSettings, "backupGlobals"), "!==", ZVal.getNull())) {
                    env.callMethod(
                            test,
                            "setBackupGlobals",
                            TestSuite.class,
                            ZVal.getElement(backupSettings, "backupGlobals"));
                }

                if (ZVal.strictNotEqualityCheck(
                        ZVal.getElement(backupSettings, "backupStaticAttributes"),
                        "!==",
                        ZVal.getNull())) {
                    env.callMethod(
                            test,
                            "setBackupStaticAttributes",
                            TestSuite.class,
                            ZVal.getElement(backupSettings, "backupStaticAttributes"));
                }
            }

            return ZVal.assign(test);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        public Object isTestMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, null);
            Object annotations = ZVal.newArray();
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strpos
                            .env(env)
                            .call(
                                    toObjectR(method).accessProp(this, env).name("name").value(),
                                    "test")
                            .value(),
                    "===",
                    0)) {
                return ZVal.assign(true);
            }

            annotations =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.parseAnnotations(
                            env, env.callMethod(method, "getDocComment", TestSuite.class));
            return ZVal.assign(ZVal.isset(ZVal.getElement(annotations, "test")));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message")
        protected Object warning(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, null);
            return ZVal.assign(new WarningTestCase(env, message));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "methodName")
        @ConvertedParameter(index = 2, name = "message")
        protected Object skipTest(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            return ZVal.assign(new SkippedTestCase(env, _pClass, methodName, message));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "methodName")
        @ConvertedParameter(index = 2, name = "message")
        protected Object incompleteTest(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object message = assignParameter(args, 2, null);
            return ZVal.assign(new IncompleteTestCase(env, _pClass, methodName, message));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\TestSuite")
                    .setLookup(TestSuite.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "backupGlobals",
                            "backupStaticAttributes",
                            "beStrictAboutChangesToGlobalState",
                            "cachedNumTests",
                            "declaredClasses",
                            "foundClasses",
                            "groups",
                            "iteratorFilter",
                            "name",
                            "numTests",
                            "runTestInSeparateProcess",
                            "testCase",
                            "tests")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/TestSuite.php")
                    .addInterface("Test")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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
