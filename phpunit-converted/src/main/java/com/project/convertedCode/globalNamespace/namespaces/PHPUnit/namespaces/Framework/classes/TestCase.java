package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.other.function_get_include_path;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes.Exporter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Restorer;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.AnyInvokedCount;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestCase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectEnumerator.classes.Enumerator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.GlobalState;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Blacklist;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnStub;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.MockBuilder;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTest;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestResult;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtIndex;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ConsecutiveCalls;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Snapshot;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnValueMap;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnSelf;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ExceptionMessageRegularExpression;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ExceptionCode;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Generator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Warning;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.RiskyTestError;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnCallback;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BaseTestRunner;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedCount;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnArgument;
import com.runtimeconverter.runtime.modules.standard.serialization.function_serialize;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.classes.DeepCopy;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtLeastOnce;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTest;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.AbstractPhpProcess;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ExceptionMessage;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtLeastCount;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.MockObject;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtMostCount;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.classes.Prophet;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/TestCase.php

*/

public abstract class TestCase extends Assert
        implements com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PHPUnit
                        .namespaces
                        .Framework
                        .classes
                        .Test,
                SelfDescribing {

    public Object backupGlobals = null;

    public Object backupGlobalsBlacklist = ZVal.newArray();

    public Object backupStaticAttributes = null;

    public Object backupStaticAttributesBlacklist = ZVal.newArray();

    public Object runTestInSeparateProcess = null;

    public Object preserveGlobalState = true;

    public Object runClassInSeparateProcess = null;

    public Object inIsolation = false;

    public Object data = null;

    public Object dataName = null;

    public Object useErrorHandler = null;

    public Object expectedException = null;

    public Object expectedExceptionMessage = null;

    public Object expectedExceptionMessageRegExp = null;

    public Object expectedExceptionCode = null;

    public Object name = null;

    public Object dependencies = ZVal.newArray();

    public Object dependencyInput = ZVal.newArray();

    public Object iniSettings = ZVal.newArray();

    public Object locale = ZVal.newArray();

    public Object mockObjects = ZVal.newArray();

    public Object mockObjectGenerator = null;

    public Object status = null;

    public Object statusMessage = "";

    public Object numAssertions = 0;

    public Object result = null;

    public Object testResult = null;

    public Object output = "";

    public Object outputExpectedRegex = null;

    public Object outputExpectedString = null;

    public Object outputCallback = false;

    public Object outputBufferingActive = false;

    public Object outputBufferingLevel = null;

    public Object snapshot = null;

    public Object prophet = null;

    public Object beStrictAboutChangesToGlobalState = false;

    public Object registerMockObjectsFromTestArgumentsRecursively = false;

    public Object warnings = ZVal.newArray();

    public Object groups = ZVal.newArray();

    public Object doesNotPerformAssertions = false;

    public Object customComparators = ZVal.newArray();

    public TestCase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestCase.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "dataName")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        if (ZVal.isNull(name)) {
            name = ZVal.getNull();
        }
        Object data = assignParameter(args, 1, null);
        if (ZVal.isNull(data)) {
            data = ZVal.newArray();
        }
        Object dataName = assignParameter(args, 2, null);
        if (ZVal.isNull(dataName)) {
            dataName = "";
        }
        if (ZVal.strictNotEqualityCheck(name, "!==", ZVal.getNull())) {
            env.callMethod(this, "setName", TestCase.class, name);
        }

        toObjectR(this).accessProp(this, env).name("data").set(data);
        toObjectR(this).accessProp(this, env).name("dataName").set(dataName);
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
        Object buffer = null;
        Object _pClass = null;
        _pClass = new ReflectionClass(env, this);
        buffer =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s::%s",
                                toObjectR(_pClass).accessProp(this, env).name("name").value(),
                                env.callMethod(this, "getName", TestCase.class, false))
                        .value();
        return ZVal.assign(
                toStringR(buffer, env)
                        + toStringR(
                                env.callMethod(this, "getDataSetAsString", TestCase.class), env));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return 1;
    }

    @ConvertedMethod
    public Object getGroups(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("groups").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "groups", typeHint = "array")
    public Object setGroups(RuntimeEnv env, Object... args) {
        Object groups = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("groups").set(groups);
        return null;
    }

    @ConvertedMethod
    public Object getAnnotations(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.parseTestMethodAnnotations(
                        env,
                        function_get_class.f.env(env).call(this).value(),
                        toObjectR(this).accessProp(this, env).name("name").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "withDataSet",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getName(RuntimeEnv env, Object... args) {
        Object withDataSet = assignParameter(args, 0, null);
        if (ZVal.isNull(withDataSet)) {
            withDataSet = true;
        }
        if (ZVal.isTrue(withDataSet)) {
            return ZVal.assign(
                    toStringR(toObjectR(this).accessProp(this, env).name("name").value(), env)
                            + toStringR(
                                    env.callMethod(
                                            this, "getDataSetAsString", TestCase.class, false),
                                    env));
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getSize(
                        env,
                        function_get_class.f.env(env).call(this).value(),
                        env.callMethod(this, "getName", TestCase.class, false)));
    }

    @ConvertedMethod
    public Object hasSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        env.callMethod(this, "getSize", TestCase.class),
                        "!==",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Test
                                .CONST_UNKNOWN));
    }

    @ConvertedMethod
    public Object isSmall(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        env.callMethod(this, "getSize", TestCase.class),
                        "===",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Test
                                .CONST_SMALL));
    }

    @ConvertedMethod
    public Object isMedium(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        env.callMethod(this, "getSize", TestCase.class),
                        "===",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Test
                                .CONST_MEDIUM));
    }

    @ConvertedMethod
    public Object isLarge(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        env.callMethod(this, "getSize", TestCase.class),
                        "===",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PHPUnit
                                .namespaces
                                .Util
                                .classes
                                .Test
                                .CONST_LARGE));
    }

    @ConvertedMethod
    public Object getActualOutput(RuntimeEnv env, Object... args) {
        if (!toObjectR(this).accessProp(this, env).name("outputBufferingActive").getBool()) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("output").value());
        }

        return ZVal.assign(NamespaceGlobal.ob_get_contents.env(env).call().value());
    }

    @ConvertedMethod
    public Object hasOutput(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("output").value(), "===", "")) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(env.callMethod(this, "hasExpectationOnOutput", TestCase.class))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object doesNotPerformAssertions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("doesNotPerformAssertions").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedRegex", typeHint = "string")
    public Object expectOutputRegex(RuntimeEnv env, Object... args) {
        Object expectedRegex = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("outputExpectedRegex").set(expectedRegex);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedString", typeHint = "string")
    public Object expectOutputString(RuntimeEnv env, Object... args) {
        Object expectedString = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("outputExpectedString").set(expectedString);
        return null;
    }

    @ConvertedMethod
    public Object hasExpectationOnOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                function_is_string
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("outputExpectedString")
                                                        .value())
                                        .value())
                        || ZVal.toBool(
                                function_is_string
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("outputExpectedRegex")
                                                        .value())
                                        .value()));
    }

    @ConvertedMethod
    public Object getExpectedException(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("expectedException").value());
    }

    @ConvertedMethod
    public Object getExpectedExceptionCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("expectedExceptionCode").value());
    }

    @ConvertedMethod
    public Object getExpectedExceptionMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("expectedExceptionMessage").value());
    }

    @ConvertedMethod
    public Object getExpectedExceptionMessageRegExp(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this)
                        .accessProp(this, env)
                        .name("expectedExceptionMessageRegExp")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "string")
    public Object expectException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("expectedException").set(exception);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object expectExceptionCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("expectedExceptionCode").set(code);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    public Object expectExceptionMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("expectedExceptionMessage").set(message);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messageRegExp", typeHint = "string")
    public Object expectExceptionMessageRegExp(RuntimeEnv env, Object... args) {
        Object messageRegExp = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("expectedExceptionMessageRegExp")
                .set(messageRegExp);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    public Object expectExceptionObject(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "expectException",
                TestCase.class,
                function_get_class.f.env(env).call(exception).value());
        env.callMethod(
                this,
                "expectExceptionMessage",
                TestCase.class,
                env.callMethod(exception, "getMessage", TestCase.class));
        env.callMethod(
                this,
                "expectExceptionCode",
                TestCase.class,
                env.callMethod(exception, "getCode", TestCase.class));
        return null;
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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useErrorHandler", typeHint = "bool")
    public Object setUseErrorHandler(RuntimeEnv env, Object... args) {
        Object useErrorHandler = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("useErrorHandler").set(useErrorHandler);
        return null;
    }

    @ConvertedMethod
    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toLong(toObjectR(this).accessProp(this, env).name("status").value()));
    }

    @ConvertedMethod
    public Object markAsRisky(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("status").set(BaseTestRunner.CONST_STATUS_RISKY);
        return null;
    }

    @ConvertedMethod
    public Object getStatusMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("statusMessage").value());
    }

    @ConvertedMethod
    public Object hasFailed(RuntimeEnv env, Object... args) {
        Object status = null;
        status = env.callMethod(this, "getStatus", TestCase.class);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        status, "===", BaseTestRunner.CONST_STATUS_FAILURE))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        status, "===", BaseTestRunner.CONST_STATUS_ERROR)));
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
        Object template = null;
        Object enforcesTimeLimit = null;
        Object data = null;
        Object globals = null;
        Object isStrictAboutTestsThatDoNotTestAnything = null;
        Object includePath = null;
        Object dataName = null;
        Object runEntireClass = null;
        Object GLOBALS = env.getGlobal("GLOBALS");
        Object isStrictAboutResourceUsageDuringSmallTests = null;
        Object configurationFilePath = null;
        Object codeCoverageFilter = null;
        Object includedFiles = null;
        Object constants = null;
        Object _pClass = null;
        Object isStrictAboutOutputDuringTests = null;
        Object phar = null;
        Object coverage = null;
        Object oldErrorHandlerSetting = null;
        Object var = ZVal.newArray();
        Object iniSettings = null;
        Object dependencyInput = null;
        Object php = null;
        Object isStrictAboutTodoAnnotatedTests = null;
        Object composerAutoload = null;
        if (ZVal.strictEqualityCheck(result, "===", ZVal.getNull())) {
            result = env.callMethod(this, "createResult", TestCase.class);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this, WarningTestCase.class, "PHPUnit\\Framework\\WarningTestCase"))) {
            env.callMethod(this, "setTestResultObject", TestCase.class, result);
            env.callMethod(this, "setUseErrorHandlerFromAnnotation", TestCase.class);
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("useErrorHandler").value(),
                "!==",
                ZVal.getNull())) {
            oldErrorHandlerSetting =
                    env.callMethod(result, "getConvertErrorsToExceptions", TestCase.class);
            env.callMethod(
                    result,
                    "convertErrorsToExceptions",
                    TestCase.class,
                    toObjectR(this).accessProp(this, env).name("useErrorHandler").value());
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this,
                                                        WarningTestCase.class,
                                                        "PHPUnit\\Framework\\WarningTestCase")))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this,
                                                        SkippedTestCase.class,
                                                        "PHPUnit\\Framework\\SkippedTestCase"))))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(this, "handleDependencies", TestCase.class)))) {
            return env.returnWithGlobals(result, "GLOBALS", GLOBALS);
        }

        runEntireClass =
                ZVal.toBool(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("runClassInSeparateProcess")
                                        .value())
                        && ZVal.toBool(
                                !toObjectR(this)
                                        .accessProp(this, env)
                                        .name("runTestInSeparateProcess")
                                        .getBool());
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name(
                                                                                "runTestInSeparateProcess")
                                                                        .value(),
                                                                "===",
                                                                true))
                                                || ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name(
                                                                                "runClassInSeparateProcess")
                                                                        .value(),
                                                                "===",
                                                                true)))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("inIsolation")
                                                        .value(),
                                                "!==",
                                                true)))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        this,
                                        PhptTestCase.class,
                                        "PHPUnit\\Runner\\PhptTestCase")))) {
            _pClass = new ReflectionClass(env, this);
            if (ZVal.isTrue(runEntireClass)) {
                template =
                        new Text_Template(
                                env,
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/phpunit/phpunit/src/Framework"),
                                                env)
                                        + "/../Util/PHP/Template/TestCaseClass.tpl");

            } else {
                template =
                        new Text_Template(
                                env,
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/phpunit/phpunit/src/Framework"),
                                                env)
                                        + "/../Util/PHP/Template/TestCaseMethod.tpl");
            }

            if (toObjectR(this).accessProp(this, env).name("preserveGlobalState").getBool()) {
                constants = GlobalState.runtimeStaticObject.getConstantsAsString(env);
                globals = GlobalState.runtimeStaticObject.getGlobalsAsString(env);
                includedFiles = GlobalState.runtimeStaticObject.getIncludedFilesAsString(env);
                iniSettings = GlobalState.runtimeStaticObject.getIniSettingsAsString(env);

            } else {
                constants = "";
                if (!ZVal.isEmpty(ZVal.getElement(GLOBALS, "__PHPUNIT_BOOTSTRAP"))) {
                    globals =
                            "$GLOBALS['__PHPUNIT_BOOTSTRAP'] = "
                                    + toStringR(
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(
                                                            ZVal.getElement(
                                                                    GLOBALS, "__PHPUNIT_BOOTSTRAP"),
                                                            true)
                                                    .value(),
                                            env)
                                    + ";\n";

                } else {
                    globals = "";
                }

                includedFiles = "";
                iniSettings = "";
            }

            coverage =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "getCollectCodeCoverageInformation",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            isStrictAboutTestsThatDoNotTestAnything =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "isStrictAboutTestsThatDoNotTestAnything",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            isStrictAboutOutputDuringTests =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "isStrictAboutOutputDuringTests",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            enforcesTimeLimit =
                    ZVal.assign(
                            ZVal.isTrue(env.callMethod(result, "enforcesTimeLimit", TestCase.class))
                                    ? "true"
                                    : "false");
            isStrictAboutTodoAnnotatedTests =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "isStrictAboutTodoAnnotatedTests",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            isStrictAboutResourceUsageDuringSmallTests =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    result,
                                                    "isStrictAboutResourceUsageDuringSmallTests",
                                                    TestCase.class))
                                    ? "true"
                                    : "false");
            if (function_defined.f.env(env).call("PHPUNIT_COMPOSER_INSTALL").getBool()) {
                composerAutoload =
                        NamespaceGlobal.var_export
                                .env(env)
                                .call(
                                        function_constant.f.call(env, "PHPUNIT_COMPOSER_INSTALL"),
                                        true)
                                .value();

            } else {
                composerAutoload = "''";
            }

            if (function_defined.f.env(env).call("__PHPUNIT_PHAR__").getBool()) {
                phar =
                        NamespaceGlobal.var_export
                                .env(env)
                                .call(function_constant.f.call(env, "__PHPUNIT_PHAR__"), true)
                                .value();

            } else {
                phar = "''";
            }

            if (ZVal.isTrue(env.callMethod(result, "getCodeCoverage", TestCase.class))) {
                codeCoverageFilter =
                        env.callMethod(
                                env.callMethod(result, "getCodeCoverage", TestCase.class),
                                new RuntimeArgsWithReferences(),
                                "filter",
                                TestCase.class);

            } else {
                codeCoverageFilter = ZVal.getNull();
            }

            data =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(
                                    function_serialize
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("data")
                                                            .value())
                                            .value(),
                                    true)
                            .value();
            dataName =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(
                                    toObjectR(this).accessProp(this, env).name("dataName").value(),
                                    true)
                            .value();
            dependencyInput =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(
                                    function_serialize
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("dependencyInput")
                                                            .value())
                                            .value(),
                                    true)
                            .value();
            includePath =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(function_get_include_path.f.env(env).call().value(), true)
                            .value();
            codeCoverageFilter =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(
                                    function_serialize.f.env(env).call(codeCoverageFilter).value(),
                                    true)
                            .value();
            data = "'." + toStringR(data, env) + ".'";
            dataName = "'.(" + toStringR(dataName, env) + ").'";
            dependencyInput = "'." + toStringR(dependencyInput, env) + ".'";
            includePath = "'." + toStringR(includePath, env) + ".'";
            codeCoverageFilter = "'." + toStringR(codeCoverageFilter, env) + ".'";
            configurationFilePath =
                    ZVal.assign(
                            ZVal.isTrue(ZVal.getElement(GLOBALS, "__PHPUNIT_CONFIGURATION_FILE"))
                                    ? ZVal.getElement(GLOBALS, "__PHPUNIT_CONFIGURATION_FILE")
                                    : "");
            var =
                    ZVal.newArray(
                            new ZPair("composerAutoload", composerAutoload),
                            new ZPair("phar", phar),
                            new ZPair(
                                    "filename",
                                    env.callMethod(_pClass, "getFileName", TestCase.class)),
                            new ZPair(
                                    "className",
                                    env.callMethod(_pClass, "getName", TestCase.class)),
                            new ZPair("collectCodeCoverageInformation", coverage),
                            new ZPair("data", data),
                            new ZPair("dataName", dataName),
                            new ZPair("dependencyInput", dependencyInput),
                            new ZPair("constants", constants),
                            new ZPair("globals", globals),
                            new ZPair("include_path", includePath),
                            new ZPair("included_files", includedFiles),
                            new ZPair("iniSettings", iniSettings),
                            new ZPair(
                                    "isStrictAboutTestsThatDoNotTestAnything",
                                    isStrictAboutTestsThatDoNotTestAnything),
                            new ZPair(
                                    "isStrictAboutOutputDuringTests",
                                    isStrictAboutOutputDuringTests),
                            new ZPair("enforcesTimeLimit", enforcesTimeLimit),
                            new ZPair(
                                    "isStrictAboutTodoAnnotatedTests",
                                    isStrictAboutTodoAnnotatedTests),
                            new ZPair(
                                    "isStrictAboutResourceUsageDuringSmallTests",
                                    isStrictAboutResourceUsageDuringSmallTests),
                            new ZPair("codeCoverageFilter", codeCoverageFilter),
                            new ZPair("configurationFilePath", configurationFilePath),
                            new ZPair(
                                    "name",
                                    env.callMethod(this, "getName", TestCase.class, false)));
            if (!ZVal.isTrue(runEntireClass)) {
                ZVal.putArrayElement(
                        var,
                        "methodName",
                        toObjectR(this).accessProp(this, env).name("name").value());
            }

            env.callMethod(template, "setVar", TestCase.class, var);
            php = AbstractPhpProcess.runtimeStaticObject.factory(env);
            env.callMethod(
                    php,
                    "runTestJob",
                    TestCase.class,
                    env.callMethod(template, "render", TestCase.class),
                    this,
                    result);

        } else {
            env.callMethod(result, "run", TestCase.class, this);
        }

        if (ZVal.isset(oldErrorHandlerSetting)) {
            env.callMethod(
                    result, "convertErrorsToExceptions", TestCase.class, oldErrorHandlerSetting);
        }

        toObjectR(this).accessProp(this, env).name("result").set(ZVal.getNull());
        return env.returnWithGlobals(result, "GLOBALS", GLOBALS);
    }

    @ConvertedMethod
    public Object runBare(RuntimeEnv env, Object... args) {
        Object method = null;
        Object e = null;
        Object hasMetRequirements = null;
        Object _e = null;
        Object hookMethods = ZVal.newArray();
        Object currentWorkingDirectory = null;
        toObjectR(this).accessProp(this, env).name("numAssertions").set(0);
        env.callMethod(this, "snapshotGlobalState", TestCase.class);
        env.callMethod(this, "startOutputBuffering", TestCase.class);
        NamespaceGlobal.clearstatcache.env(env).call();
        currentWorkingDirectory = NamespaceGlobal.getcwd.env(env).call().value();
        hookMethods =
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getHookMethods(
                        env, function_get_class.f.env(env).call(this).value());
        try {
            hasMetRequirements = false;
            env.callMethod(this, "checkRequirements", TestCase.class);
            hasMetRequirements = true;
            if (toObjectR(this).accessProp(this, env).name("inIsolation").getBool()) {
                for (ZPair zpairResult269 :
                        ZVal.getIterable(ZVal.getElement(hookMethods, "beforeClass"), env, true)) {
                    method = ZVal.assign(zpairResult269.getValue());
                    env.callMethod(this, toStringR(method, env), TestCase.class);
                }
            }

            env.callMethod(this, "setExpectedExceptionFromAnnotation", TestCase.class);
            env.callMethod(this, "setDoesNotPerformAssertionsFromAnnotation", TestCase.class);
            for (ZPair zpairResult270 :
                    ZVal.getIterable(ZVal.getElement(hookMethods, "before"), env, true)) {
                method = ZVal.assign(zpairResult270.getValue());
                env.callMethod(this, toStringR(method, env), TestCase.class);
            }

            env.callMethod(this, "assertPreConditions", TestCase.class);
            toObjectR(this)
                    .accessProp(this, env)
                    .name("testResult")
                    .set(env.callMethod(this, "runTest", TestCase.class));
            env.callMethod(this, "verifyMockObjects", TestCase.class);
            env.callMethod(this, "assertPostConditions", TestCase.class);
            if (!ZVal.isEmpty(toObjectR(this).accessProp(this, env).name("warnings").value())) {
                throw ZVal.getException(
                        env,
                        new Warning(
                                env,
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "\n",
                                                CRArrayF.array_unique
                                                        .env(env)
                                                        .call(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("warnings")
                                                                        .value())
                                                        .value())
                                        .value()));
            }

            toObjectR(this)
                    .accessProp(this, env)
                    .name("status")
                    .set(BaseTestRunner.CONST_STATUS_PASSED);
        } catch (ConvertedException convertedException31) {
            if (convertedException31.instanceOf(
                    IncompleteTest.class, "PHPUnit\\Framework\\IncompleteTest")) {
                e = convertedException31.getObject();
                toObjectR(this)
                        .accessProp(this, env)
                        .name("status")
                        .set(BaseTestRunner.CONST_STATUS_INCOMPLETE);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("statusMessage")
                        .set(env.callMethod(e, "getMessage", TestCase.class));
            } else if (convertedException31.instanceOf(
                    SkippedTest.class, "PHPUnit\\Framework\\SkippedTest")) {
                e = convertedException31.getObject();
                toObjectR(this)
                        .accessProp(this, env)
                        .name("status")
                        .set(BaseTestRunner.CONST_STATUS_SKIPPED);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("statusMessage")
                        .set(env.callMethod(e, "getMessage", TestCase.class));
            } else if (convertedException31.instanceOf(
                    Warning.class, "PHPUnit\\Framework\\Warning")) {
                e = convertedException31.getObject();
                toObjectR(this)
                        .accessProp(this, env)
                        .name("status")
                        .set(BaseTestRunner.CONST_STATUS_WARNING);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("statusMessage")
                        .set(env.callMethod(e, "getMessage", TestCase.class));
            } else if (convertedException31.instanceOf(
                    AssertionFailedError.class, "PHPUnit\\Framework\\AssertionFailedError")) {
                e = convertedException31.getObject();
                toObjectR(this)
                        .accessProp(this, env)
                        .name("status")
                        .set(BaseTestRunner.CONST_STATUS_FAILURE);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("statusMessage")
                        .set(env.callMethod(e, "getMessage", TestCase.class));
            } else if (convertedException31.instanceOf(
                    PredictionException.class,
                    "Prophecy\\Exception\\Prediction\\PredictionException")) {
                e = convertedException31.getObject();
                toObjectR(this)
                        .accessProp(this, env)
                        .name("status")
                        .set(BaseTestRunner.CONST_STATUS_FAILURE);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("statusMessage")
                        .set(env.callMethod(e, "getMessage", TestCase.class));
            } else if (convertedException31.instanceOf(Throwable.class, "Throwable")) {
                _e = convertedException31.getObject();
                e = ZVal.assign(_e);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("status")
                        .set(BaseTestRunner.CONST_STATUS_ERROR);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("statusMessage")
                        .set(env.callMethod(_e, "getMessage", TestCase.class));
            } else {
                throw convertedException31;
            }
        }

        toObjectR(this).accessProp(this, env).name("mockObjects").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("prophet").set(ZVal.getNull());
        try {
            if (ZVal.isTrue(hasMetRequirements)) {
                for (ZPair zpairResult271 :
                        ZVal.getIterable(ZVal.getElement(hookMethods, "after"), env, true)) {
                    method = ZVal.assign(zpairResult271.getValue());
                    env.callMethod(this, toStringR(method, env), TestCase.class);
                }

                if (toObjectR(this).accessProp(this, env).name("inIsolation").getBool()) {
                    for (ZPair zpairResult272 :
                            ZVal.getIterable(
                                    ZVal.getElement(hookMethods, "afterClass"), env, true)) {
                        method = ZVal.assign(zpairResult272.getValue());
                        env.callMethod(this, toStringR(method, env), TestCase.class);
                    }
                }
            }

        } catch (ConvertedException convertedException32) {
            if (convertedException32.instanceOf(Throwable.class, "Throwable")) {
                _e = convertedException32.getObject();
                if (!ZVal.isset(e)) {
                    e = ZVal.assign(_e);
                }

            } else {
                throw convertedException32;
            }
        }

        try {
            env.callMethod(this, "stopOutputBuffering", TestCase.class);
        } catch (ConvertedException convertedException33) {
            if (convertedException33.instanceOf(
                    RiskyTestError.class, "PHPUnit\\Framework\\RiskyTestError")) {
                _e = convertedException33.getObject();
                if (!ZVal.isset(e)) {
                    e = ZVal.assign(_e);
                }

            } else {
                throw convertedException33;
            }
        }

        if (ZVal.isset(_e)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("status")
                    .set(BaseTestRunner.CONST_STATUS_ERROR);
            toObjectR(this)
                    .accessProp(this, env)
                    .name("statusMessage")
                    .set(env.callMethod(_e, "getMessage", TestCase.class));
        }

        NamespaceGlobal.clearstatcache.env(env).call();
        if (ZVal.notEqualityCheck(
                currentWorkingDirectory, NamespaceGlobal.getcwd.env(env).call().value())) {
            NamespaceGlobal.chdir.env(env).call(currentWorkingDirectory);
        }

        env.callMethod(this, "restoreGlobalState", TestCase.class);
        env.callMethod(this, "unregisterCustomComparators", TestCase.class);
        env.callMethod(this, "cleanupIniSettings", TestCase.class);
        env.callMethod(this, "cleanupLocaleSettings", TestCase.class);
        if (!ZVal.isset(e)) {
            try {
                if (ZVal.strictNotEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("outputExpectedRegex").value(),
                        "!==",
                        ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertRegExp",
                            TestCase.class,
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("outputExpectedRegex")
                                    .value(),
                            toObjectR(this).accessProp(this, env).name("output").value());

                } else if (ZVal.strictNotEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("outputExpectedString").value(),
                        "!==",
                        ZVal.getNull())) {
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences(),
                            "assertEquals",
                            TestCase.class,
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("outputExpectedString")
                                    .value(),
                            toObjectR(this).accessProp(this, env).name("output").value());
                }

            } catch (ConvertedException convertedException34) {
                if (convertedException34.instanceOf(Throwable.class, "Throwable")) {
                    _e = convertedException34.getObject();
                    e = ZVal.assign(_e);
                } else {
                    throw convertedException34;
                }
            }
        }

        if (ZVal.isset(e)) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            e,
                            PredictionException.class,
                            "Prophecy\\Exception\\Prediction\\PredictionException"))) {
                e = new AssertionFailedError(env, env.callMethod(e, "getMessage", TestCase.class));
            }

            env.callMethod(this, "onNotSuccessfulTest", TestCase.class, e);
        }

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
    @ConvertedParameter(index = 0, name = "dependencies", typeHint = "array")
    public Object setDependencies(RuntimeEnv env, Object... args) {
        Object dependencies = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("dependencies").set(dependencies);
        return null;
    }

    @ConvertedMethod
    public Object hasDependencies(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(
                        CRArrayF.count
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("dependencies")
                                                .value())
                                .value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dependencyInput", typeHint = "array")
    public Object setDependencyInput(RuntimeEnv env, Object... args) {
        Object dependencyInput = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("dependencyInput").set(dependencyInput);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "beStrictAboutChangesToGlobalState")
    public Object setBeStrictAboutChangesToGlobalState(RuntimeEnv env, Object... args) {
        Object beStrictAboutChangesToGlobalState = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("beStrictAboutChangesToGlobalState")
                .set(beStrictAboutChangesToGlobalState);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backupGlobals")
    public Object setBackupGlobals(RuntimeEnv env, Object... args) {
        Object backupGlobals = assignParameter(args, 0, null);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                toObjectR(this).accessProp(this, env).name("backupGlobals").value(),
                                "===",
                                ZVal.getNull()))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(backupGlobals, "!==", ZVal.getNull()))) {
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
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("backupStaticAttributes")
                                        .value(),
                                "===",
                                ZVal.getNull()))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                backupStaticAttributes, "!==", ZVal.getNull()))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("backupStaticAttributes")
                    .set(backupStaticAttributes);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runTestInSeparateProcess", typeHint = "bool")
    public Object setRunTestInSeparateProcess(RuntimeEnv env, Object... args) {
        Object runTestInSeparateProcess = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("runTestInSeparateProcess").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("runTestInSeparateProcess")
                    .set(runTestInSeparateProcess);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "runClassInSeparateProcess", typeHint = "bool")
    public Object setRunClassInSeparateProcess(RuntimeEnv env, Object... args) {
        Object runClassInSeparateProcess = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("runClassInSeparateProcess").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("runClassInSeparateProcess")
                    .set(runClassInSeparateProcess);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "preserveGlobalState", typeHint = "bool")
    public Object setPreserveGlobalState(RuntimeEnv env, Object... args) {
        Object preserveGlobalState = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("preserveGlobalState").set(preserveGlobalState);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inIsolation", typeHint = "bool")
    public Object setInIsolation(RuntimeEnv env, Object... args) {
        Object inIsolation = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("inIsolation").set(inIsolation);
        return null;
    }

    @ConvertedMethod
    public Object isInIsolation(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("inIsolation").value());
    }

    @ConvertedMethod
    public Object getResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("testResult").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result")
    public Object setResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("testResult").set(result);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object setOutputCallback(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("outputCallback").set(callback);
        return null;
    }

    @ConvertedMethod
    public Object getTestResultObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("result").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object setTestResultObject(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("result").set(result);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mockObject",
        typeHint = "PHPUnit\\Framework\\MockObject\\MockObject"
    )
    public Object registerMockObject(RuntimeEnv env, Object... args) {
        Object mockObject = assignParameter(args, 0, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("mockObjects").value(), mockObject);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object getMockBuilder(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        return ZVal.assign(new MockBuilder(env, this, className));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    public Object addToAssertionCount(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("numAssertions")
                .set(
                        ZAssignment.add(
                                "+=",
                                toObjectR(this).accessProp(this, env).name("numAssertions").value(),
                                count));
        return null;
    }

    @ConvertedMethod
    public Object getNumAssertions(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numAssertions").value());
    }

    @ConvertedMethod
    public Object usesDataProvider(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                !ZVal.isEmpty(toObjectR(this).accessProp(this, env).name("data").value()));
    }

    @ConvertedMethod
    public Object dataDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_is_string
                                .f
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("dataName")
                                                .value())
                                .getBool()
                        ? toObjectR(this).accessProp(this, env).name("dataName").value()
                        : "");
    }

    @ConvertedMethod
    public Object dataName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("dataName").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "comparator",
        typeHint = "SebastianBergmann\\Comparator\\Comparator"
    )
    public Object registerComparator(RuntimeEnv env, Object... args) {
        Object comparator = assignParameter(args, 0, null);
        env.callMethod(
                Factory.runtimeStaticObject.getInstance(env),
                "register",
                TestCase.class,
                comparator);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("customComparators").value(),
                comparator);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "includeData",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getDataSetAsString(RuntimeEnv env, Object... args) {
        Object includeData = assignParameter(args, 0, null);
        if (ZVal.isNull(includeData)) {
            includeData = true;
        }
        Object exporter = null;
        Object buffer = null;
        buffer = "";
        if (!ZVal.isEmpty(toObjectR(this).accessProp(this, env).name("data").value())) {
            if (function_is_int
                    .f
                    .env(env)
                    .call(toObjectR(this).accessProp(this, env).name("dataName").value())
                    .getBool()) {
                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        " with data set #%d",
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("dataName")
                                                                .value())
                                                .value(),
                                        env);

            } else {
                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        " with data set \"%s\"",
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("dataName")
                                                                .value())
                                                .value(),
                                        env);
            }

            exporter = new Exporter(env);
            if (ZVal.isTrue(includeData)) {
                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        " (%s)",
                                                        env.callMethod(
                                                                exporter,
                                                                new RuntimeArgsWithReferences(),
                                                                "shortenedRecursiveExport",
                                                                TestCase.class,
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("data")
                                                                        .value()))
                                                .value(),
                                        env);
            }
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    protected Object runTest(RuntimeEnv env, Object... args) {
        Object exception = null;
        Object testArguments = null;
        Object t = null;
        Object testResult = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("name").value(),
                "===",
                ZVal.getNull())) {
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
                            env, "PHPUnit\\Framework\\TestCase::$name must not be null."));
        }

        testArguments =
                CRArrayF.array_merge
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("data").value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("dependencyInput")
                                        .value())
                        .value();
        env.callMethod(
                this,
                new RuntimeArgsWithReferences(),
                "registerMockObjectsFromTestArguments",
                TestCase.class,
                testArguments);
        try {
            testResult =
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences(),
                            toStringR(
                                    toObjectR(this).accessProp(this, env).name("name").value(),
                                    env),
                            TestCase.class,
                            PackedVaradicArgs.unpack(
                                    new PackedVaradicArgs(
                                            CRArrayF.array_values
                                                    .env(env)
                                                    .call(testArguments)
                                                    .value())));
        } catch (ConvertedException convertedException35) {
            if (convertedException35.instanceOf(Throwable.class, "Throwable")) {
                t = convertedException35.getObject();
                exception = ZVal.assign(t);
            } else {
                throw convertedException35;
            }
        }

        if (ZVal.isset(exception)) {
            if (ZVal.isTrue(
                    env.callMethod(
                            this, "checkExceptionExpectations", TestCase.class, exception))) {
                if (ZVal.strictNotEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("expectedException").value(),
                        "!==",
                        ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertThat",
                            TestCase.class,
                            exception,
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .namespaces
                                    .Constraint
                                    .classes
                                    .Exception(
                                    env,
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("expectedException")
                                            .value()));
                }

                if (ZVal.strictNotEqualityCheck(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("expectedExceptionMessage")
                                .value(),
                        "!==",
                        ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertThat",
                            TestCase.class,
                            exception,
                            new ExceptionMessage(
                                    env,
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("expectedExceptionMessage")
                                            .value()));
                }

                if (ZVal.strictNotEqualityCheck(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("expectedExceptionMessageRegExp")
                                .value(),
                        "!==",
                        ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertThat",
                            TestCase.class,
                            exception,
                            new ExceptionMessageRegularExpression(
                                    env,
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("expectedExceptionMessageRegExp")
                                            .value()));
                }

                if (ZVal.strictNotEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("expectedExceptionCode").value(),
                        "!==",
                        ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "assertThat",
                            TestCase.class,
                            exception,
                            new ExceptionCode(
                                    env,
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("expectedExceptionCode")
                                            .value()));
                }

                return null;
            }

            throw ZVal.getException(env, exception);
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("expectedException").value(),
                "!==",
                ZVal.getNull())) {
            env.callMethod(
                    this,
                    "assertThat",
                    TestCase.class,
                    ZVal.getNull(),
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .namespaces
                            .Constraint
                            .classes
                            .Exception(
                            env,
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("expectedException")
                                    .value()));

        } else if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("expectedExceptionMessage").value(),
                "!==",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("numAssertions")
                    .set(
                            ZVal.increment(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("numAssertions")
                                            .value()));
            throw ZVal.getException(
                    env,
                    new AssertionFailedError(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Failed asserting that exception with message \"%s\" is thrown",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("expectedExceptionMessage")
                                                    .value())
                                    .value()));

        } else if (ZVal.strictNotEqualityCheck(
                toObjectR(this)
                        .accessProp(this, env)
                        .name("expectedExceptionMessageRegExp")
                        .value(),
                "!==",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("numAssertions")
                    .set(
                            ZVal.increment(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("numAssertions")
                                            .value()));
            throw ZVal.getException(
                    env,
                    new AssertionFailedError(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Failed asserting that exception with message matching \"%s\" is thrown",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("expectedExceptionMessageRegExp")
                                                    .value())
                                    .value()));

        } else if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("expectedExceptionCode").value(),
                "!==",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("numAssertions")
                    .set(
                            ZVal.increment(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("numAssertions")
                                            .value()));
            throw ZVal.getException(
                    env,
                    new AssertionFailedError(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Failed asserting that exception with code \"%s\" is thrown",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("expectedExceptionCode")
                                                    .value())
                                    .value()));
        }

        return ZVal.assign(testResult);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "varName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "newValue")
    protected Object iniSet(RuntimeEnv env, Object... args) {
        Object varName = assignParameter(args, 0, null);
        Object newValue = assignParameter(args, 1, null);
        Object currentValue = null;
        currentValue = NamespaceGlobal.ini_set.env(env).call(varName, newValue).value();
        if (ZVal.strictNotEqualityCheck(currentValue, "!==", false)) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("iniSettings").value(),
                    varName,
                    currentValue);

        } else {
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
                                            "INI setting \"%s\" could not be set to \"%s\".",
                                            varName, newValue)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    protected Object setLocale(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, null);
        Object result = null;
        Object runtimeTempArrayResult13 = null;
        Object categories = ZVal.newArray();
        Object category = null;
        Object locale = null;
        if (ZVal.isLessThan(CRArrayF.count.env(env).call(___args).value(), '<', 2)) {
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
                            .Exception(env));
        }

        ZVal.list(
                runtimeTempArrayResult13 = ___args,
                (category = ZVal.assign(ZVal.getElement(runtimeTempArrayResult13, 0))),
                (locale = ZVal.assign(ZVal.getElement(runtimeTempArrayResult13, 1))));
        categories =
                ZVal.newArray(
                        new ZPair(0, 6),
                        new ZPair(1, 3),
                        new ZPair(2, 0),
                        new ZPair(3, 4),
                        new ZPair(4, 1),
                        new ZPair(5, 2));
        if (function_defined.f.env(env).call("LC_MESSAGES").getBool()) {
            ZVal.addToArray(categories, 5);
        }

        if (!CRArrayF.in_array.env(env).call(category, categories).getBool()) {
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
                            .Exception(env));
        }

        if (ZVal.toBool(!function_is_array.f.env(env).call(locale).getBool())
                && ZVal.toBool(!function_is_string.f.env(env).call(locale).getBool())) {
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
                            .Exception(env));
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("locale").value(),
                category,
                NamespaceGlobal.setlocale.env(env).call(category, 0).value());
        result =
                NamespaceGlobal.setlocale
                        .env(env)
                        .call(PackedVaradicArgs.unpack(new PackedVaradicArgs(___args)))
                        .value();
        if (ZVal.strictEqualityCheck(result, "===", false)) {
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
                            "The locale functionality is not implemented on your platform, "
                                    + "the specified locale does not exist or the category name is "
                                    + "invalid."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    protected Object createMock(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, null);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                this,
                                                                "getMockBuilder",
                                                                TestCase.class,
                                                                originalClassName),
                                                        "disableOriginalConstructor",
                                                        TestCase.class),
                                                "disableOriginalClone",
                                                TestCase.class),
                                        "disableArgumentCloning",
                                        TestCase.class),
                                "disallowMockingUnknownTypes",
                                TestCase.class),
                        "getMock",
                        TestCase.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(index = 1, name = "configuration", typeHint = "array")
    protected Object createConfiguredMock(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, null);
        Object configuration = assignParameter(args, 1, null);
        Object method = null;
        Object _pReturn = null;
        Object o = null;
        o = env.callMethod(this, "createMock", TestCase.class, originalClassName);
        for (ZPair zpairResult273 : ZVal.getIterable(configuration, env, false)) {
            method = ZVal.assign(zpairResult273.getKey());
            _pReturn = ZVal.assign(zpairResult273.getValue());
            env.callMethod(
                    env.callMethod(o, "method", TestCase.class, method),
                    "willReturn",
                    TestCase.class,
                    _pReturn);
        }

        return ZVal.assign(o);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(index = 1, name = "methods", typeHint = "array")
    protected Object createPartialMock(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, null);
        Object methods = assignParameter(args, 1, null);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        this,
                                                                        "getMockBuilder",
                                                                        TestCase.class,
                                                                        originalClassName),
                                                                "disableOriginalConstructor",
                                                                TestCase.class),
                                                        "disableOriginalClone",
                                                        TestCase.class),
                                                "disableArgumentCloning",
                                                TestCase.class),
                                        "disallowMockingUnknownTypes",
                                        TestCase.class),
                                "setMethods",
                                TestCase.class,
                                ZVal.isEmpty(methods) ? ZVal.getNull() : methods),
                        "getMock",
                        TestCase.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "constructorArguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object createTestProxy(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, null);
        Object constructorArguments = assignParameter(args, 1, null);
        if (ZVal.isNull(constructorArguments)) {
            constructorArguments = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                this,
                                                "getMockBuilder",
                                                TestCase.class,
                                                originalClassName),
                                        "setConstructorArgs",
                                        TestCase.class,
                                        constructorArguments),
                                "enableProxyingToOriginalMethods",
                                TestCase.class),
                        "getMock",
                        TestCase.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(index = 1, name = "methods", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "mockClassName")
    @ConvertedParameter(
        index = 4,
        name = "callOriginalConstructor",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object getMockClass(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, null);
        Object methods = assignParameter(args, 1, null);
        if (ZVal.isNull(methods)) {
            methods = ZVal.newArray();
        }
        Object arguments = assignParameter(args, 2, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 3, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = false;
        }
        Object callOriginalClone = assignParameter(args, 5, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 6, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        Object cloneArguments = assignParameter(args, 7, null);
        if (ZVal.isNull(cloneArguments)) {
            cloneArguments = false;
        }
        Object mock = null;
        mock =
                env.callMethod(
                        env.callMethod(this, "getMockObjectGenerator", TestCase.class),
                        "getMock",
                        TestCase.class,
                        originalClassName,
                        methods,
                        arguments,
                        mockClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload,
                        cloneArguments);
        return ZVal.assign(function_get_class.f.env(env).call(mock).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockedMethods",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object getMockForAbstractClass(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        Object mockedMethods = assignParameter(args, 6, null);
        if (ZVal.isNull(mockedMethods)) {
            mockedMethods = ZVal.newArray();
        }
        Object cloneArguments = assignParameter(args, 7, null);
        if (ZVal.isNull(cloneArguments)) {
            cloneArguments = false;
        }
        Object mockObject = null;
        mockObject =
                env.callMethod(
                        env.callMethod(this, "getMockObjectGenerator", TestCase.class),
                        "getMockForAbstractClass",
                        TestCase.class,
                        originalClassName,
                        arguments,
                        mockClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload,
                        mockedMethods,
                        cloneArguments);
        env.callMethod(this, "registerMockObject", TestCase.class, mockObject);
        return ZVal.assign(mockObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "wsdlFile")
    @ConvertedParameter(index = 1, name = "originalClassName")
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "methods",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object getMockFromWsdl(RuntimeEnv env, Object... args) {
        Object wsdlFile = assignParameter(args, 0, null);
        Object originalClassName = assignParameter(args, 1, null);
        if (ZVal.isNull(originalClassName)) {
            originalClassName = "";
        }
        Object mockClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = "";
        }
        Object methods = assignParameter(args, 3, null);
        if (ZVal.isNull(methods)) {
            methods = ZVal.newArray();
        }
        Object callOriginalConstructor = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = true;
        }
        Object options = assignParameter(args, 5, null);
        if (ZVal.isNull(options)) {
            options = ZVal.newArray();
        }
        Object mockObject = null;
        if (ZVal.strictEqualityCheck(originalClassName, "===", "")) {
            originalClassName =
                    NamespaceGlobal.pathinfo
                            .env(env)
                            .call(
                                    NamespaceGlobal.basename
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(
                                                            NamespaceGlobal.parse_url
                                                                    .env(env)
                                                                    .call(wsdlFile)
                                                                    .value(),
                                                            "path"))
                                            .value(),
                                    8)
                            .value();
        }

        if (!function_class_exists.f.env(env).call(originalClassName).getBool()) {
            com.runtimeconverter.runtime.ZVal.functionNotFound("eval222")
                    .env(env)
                    .call(
                            env.callMethod(
                                    env.callMethod(this, "getMockObjectGenerator", TestCase.class),
                                    "generateClassFromWsdl",
                                    TestCase.class,
                                    wsdlFile,
                                    originalClassName,
                                    methods,
                                    options));
        }

        mockObject =
                env.callMethod(
                        env.callMethod(this, "getMockObjectGenerator", TestCase.class),
                        "getMock",
                        TestCase.class,
                        originalClassName,
                        methods,
                        ZVal.newArray(new ZPair(0, ""), new ZPair(1, options)),
                        mockClassName,
                        callOriginalConstructor,
                        false,
                        false);
        env.callMethod(this, "registerMockObject", TestCase.class, mockObject);
        return ZVal.assign(mockObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traitName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockedMethods",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object getMockForTrait(RuntimeEnv env, Object... args) {
        Object traitName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        Object mockedMethods = assignParameter(args, 6, null);
        if (ZVal.isNull(mockedMethods)) {
            mockedMethods = ZVal.newArray();
        }
        Object cloneArguments = assignParameter(args, 7, null);
        if (ZVal.isNull(cloneArguments)) {
            cloneArguments = false;
        }
        Object mockObject = null;
        mockObject =
                env.callMethod(
                        env.callMethod(this, "getMockObjectGenerator", TestCase.class),
                        "getMockForTrait",
                        TestCase.class,
                        traitName,
                        arguments,
                        mockClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload,
                        mockedMethods,
                        cloneArguments);
        env.callMethod(this, "registerMockObject", TestCase.class, mockObject);
        return ZVal.assign(mockObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traitName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "traitClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object getObjectForTrait(RuntimeEnv env, Object... args) {
        Object traitName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object traitClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(traitClassName)) {
            traitClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "getMockObjectGenerator", TestCase.class),
                        "getObjectForTrait",
                        TestCase.class,
                        traitName,
                        arguments,
                        traitClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "classOrInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object prophesize(RuntimeEnv env, Object... args) {
        Object classOrInterface = assignParameter(args, 0, null);
        if (ZVal.isNull(classOrInterface)) {
            classOrInterface = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "getProphet", TestCase.class),
                        "prophesize",
                        TestCase.class,
                        classOrInterface));
    }

    @ConvertedMethod
    protected Object getProvidedData(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("data").value());
    }

    @ConvertedMethod
    protected Object createResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(new TestResult(env));
    }

    @ConvertedMethod
    protected Object assertPreConditions(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    protected Object assertPostConditions(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
    protected Object onNotSuccessfulTest(RuntimeEnv env, Object... args) {
        Object t = assignParameter(args, 0, null);
        throw ZVal.getException(env, t);
    }

    @ConvertedMethod
    private Object setExpectedExceptionFromAnnotation(RuntimeEnv env, Object... args) {
        Object e = null;
        Object expectedException = ZVal.newArray();
        try {
            expectedException =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getExpectedException(
                            env,
                            function_get_class.f.env(env).call(this).value(),
                            toObjectR(this).accessProp(this, env).name("name").value());
            if (ZVal.strictNotEqualityCheck(expectedException, "!==", false)) {
                env.callMethod(
                        this,
                        "expectException",
                        TestCase.class,
                        ZVal.getElement(expectedException, "class"));
                if (ZVal.strictNotEqualityCheck(
                        ZVal.getElement(expectedException, "code"), "!==", ZVal.getNull())) {
                    env.callMethod(
                            this,
                            "expectExceptionCode",
                            TestCase.class,
                            ZVal.getElement(expectedException, "code"));
                }

                if (ZVal.strictNotEqualityCheck(
                        ZVal.getElement(expectedException, "message"), "!==", "")) {
                    env.callMethod(
                            this,
                            "expectExceptionMessage",
                            TestCase.class,
                            ZVal.getElement(expectedException, "message"));

                } else if (ZVal.strictNotEqualityCheck(
                        ZVal.getElement(expectedException, "message_regex"), "!==", "")) {
                    env.callMethod(
                            this,
                            "expectExceptionMessageRegExp",
                            TestCase.class,
                            ZVal.getElement(expectedException, "message_regex"));
                }
            }

        } catch (ConvertedException convertedException36) {
            if (convertedException36.instanceOf(ReflectionException.class, "ReflectionException")) {
                e = convertedException36.getObject();
            } else {
                throw convertedException36;
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object setUseErrorHandlerFromAnnotation(RuntimeEnv env, Object... args) {
        Object e = null;
        Object useErrorHandler = null;
        try {
            useErrorHandler =
                    com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util
                            .classes.Test.runtimeStaticObject.getErrorHandlerSettings(
                            env,
                            function_get_class.f.env(env).call(this).value(),
                            toObjectR(this).accessProp(this, env).name("name").value());
            if (ZVal.strictNotEqualityCheck(useErrorHandler, "!==", ZVal.getNull())) {
                env.callMethod(this, "setUseErrorHandler", TestCase.class, useErrorHandler);
            }

        } catch (ConvertedException convertedException37) {
            if (convertedException37.instanceOf(ReflectionException.class, "ReflectionException")) {
                e = convertedException37.getObject();
            } else {
                throw convertedException37;
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object checkRequirements(RuntimeEnv env, Object... args) {
        Object missingRequirements = null;
        if (ZVal.toBool(!toObjectR(this).accessProp(this, env).name("name").getBool())
                || ZVal.toBool(
                        !function_method_exists
                                .f
                                .env(env)
                                .call(
                                        this,
                                        toObjectR(this).accessProp(this, env).name("name").value())
                                .getBool())) {
            return null;
        }

        missingRequirements =
                com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes
                        .Test.runtimeStaticObject.getMissingRequirements(
                        env,
                        function_get_class.f.env(env).call(this).value(),
                        toObjectR(this).accessProp(this, env).name("name").value());
        if (!ZVal.isEmpty(missingRequirements)) {
            env.callMethod(
                    this,
                    "markTestSkipped",
                    TestCase.class,
                    NamespaceGlobal.implode.env(env).call("\n", missingRequirements).value());
        }

        return null;
    }

    @ConvertedMethod
    private Object verifyMockObjects(RuntimeEnv env, Object... args) {
        Object methodProphecy = null;
        Object t = null;
        Object methodProphecies = null;
        Object objectProphecy = null;
        Object mockObject = null;
        for (ZPair zpairResult274 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("mockObjects").value(),
                        env,
                        true)) {
            mockObject = ZVal.assign(zpairResult274.getValue());
            if (ZVal.isTrue(env.callMethod(mockObject, "__phpunit_hasMatchers", TestCase.class))) {
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

            env.callMethod(
                    mockObject,
                    "__phpunit_verify",
                    TestCase.class,
                    env.callMethod(
                            this, "shouldInvocationMockerBeReset", TestCase.class, mockObject));
        }

        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("prophet").value(),
                "!==",
                ZVal.getNull())) {
            try {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("prophet").value(),
                        "checkPredictions",
                        TestCase.class);
            } catch (ConvertedException convertedException38) {
                if (convertedException38.instanceOf(Throwable.class, "Throwable")) {
                    t = convertedException38.getObject();
                } else {
                    throw convertedException38;
                }
            }

            for (ZPair zpairResult275 :
                    ZVal.getIterable(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("prophet").value(),
                                    "getProphecies",
                                    TestCase.class),
                            env,
                            true)) {
                objectProphecy = ZVal.assign(zpairResult275.getValue());
                for (ZPair zpairResult276 :
                        ZVal.getIterable(
                                env.callMethod(
                                        objectProphecy, "getMethodProphecies", TestCase.class),
                                env,
                                true)) {
                    methodProphecies = ZVal.assign(zpairResult276.getValue());
                    for (ZPair zpairResult277 : ZVal.getIterable(methodProphecies, env, true)) {
                        methodProphecy = ZVal.assign(zpairResult277.getValue());
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
                                                CRArrayF.count
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        methodProphecy,
                                                                        "getCheckedPredictions",
                                                                        TestCase.class))
                                                        .value()));
                    }
                }
            }

            if (ZVal.isset(t)) {
                throw ZVal.getException(env, t);
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object handleDependencies(RuntimeEnv env, Object... args) {
        Object numKeys = null;
        Object passedKeys = ZVal.newArray();
        Object pos = null;
        Object dependency = null;
        Object shallowClone = null;
        Object deepClone = null;
        Object i = null;
        Object className = null;
        Object passed = ZVal.newArray();
        Object deepCopy = null;
        if (ZVal.toBool(
                        !ZVal.isEmpty(
                                toObjectR(this).accessProp(this, env).name("dependencies").value()))
                && ZVal.toBool(
                        !toObjectR(this).accessProp(this, env).name("inIsolation").getBool())) {
            className = function_get_class.f.env(env).call(this).value();
            passed =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("result").value(),
                            "passed",
                            TestCase.class);
            passedKeys = CRArrayF.array_keys.env(env).call(passed).value();
            numKeys = CRArrayF.count.env(env).call(passedKeys).value();
            for (i = 0; ZVal.isLessThan(i, '<', numKeys); i = ZVal.increment(i)) {
                pos =
                        NamespaceGlobal.strpos
                                .env(env)
                                .call(ZVal.getElement(passedKeys, i), " with data set")
                                .value();
                if (ZVal.strictNotEqualityCheck(pos, "!==", false)) {
                    ZVal.putArrayElement(
                            passedKeys,
                            i,
                            NamespaceGlobal.substr
                                    .env(env)
                                    .call(ZVal.getElement(passedKeys, i), 0, pos)
                                    .value());
                }
            }

            passedKeys =
                    CRArrayF.array_flip
                            .env(env)
                            .call(CRArrayF.array_unique.env(env).call(passedKeys).value())
                            .value();
            for (ZPair zpairResult278 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("dependencies").value(),
                            env,
                            true)) {
                dependency = ZVal.assign(zpairResult278.getValue());
                deepClone = false;
                shallowClone = false;
                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.strpos.env(env).call(dependency, "clone ").value(),
                        "===",
                        0)) {
                    deepClone = true;
                    dependency =
                            NamespaceGlobal.substr
                                    .env(env)
                                    .call(
                                            dependency,
                                            NamespaceGlobal.strlen.env(env).call("clone ").value())
                                    .value();

                } else if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.strpos.env(env).call(dependency, "!clone ").value(),
                        "===",
                        0)) {
                    deepClone = false;
                    dependency =
                            NamespaceGlobal.substr
                                    .env(env)
                                    .call(
                                            dependency,
                                            NamespaceGlobal.strlen.env(env).call("!clone ").value())
                                    .value();
                }

                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.strpos.env(env).call(dependency, "shallowClone ").value(),
                        "===",
                        0)) {
                    shallowClone = true;
                    dependency =
                            NamespaceGlobal.substr
                                    .env(env)
                                    .call(
                                            dependency,
                                            NamespaceGlobal.strlen
                                                    .env(env)
                                                    .call("shallowClone ")
                                                    .value())
                                    .value();

                } else if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.strpos.env(env).call(dependency, "!shallowClone ").value(),
                        "===",
                        0)) {
                    shallowClone = false;
                    dependency =
                            NamespaceGlobal.substr
                                    .env(env)
                                    .call(
                                            dependency,
                                            NamespaceGlobal.strlen
                                                    .env(env)
                                                    .call("!shallowClone ")
                                                    .value())
                                    .value();
                }

                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.strpos.env(env).call(dependency, "::").value(),
                        "===",
                        false)) {
                    dependency = toStringR(className, env) + "::" + toStringR(dependency, env);
                }

                if (!ZVal.isset(ZVal.getElement(passedKeys, dependency))) {
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("result").value(),
                            "startTest",
                            TestCase.class,
                            this);
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("result").value(),
                            "addError",
                            TestCase.class,
                            this,
                            new SkippedTestError(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "This test depends on \"%s\" to pass.",
                                                    dependency)
                                            .value()),
                            0);
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("result").value(),
                            "endTest",
                            TestCase.class,
                            this,
                            0);
                    return ZVal.assign(false);
                }

                if (ZVal.isset(ZVal.getElement(passed, dependency))) {
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.notEqualityCheck(
                                                            ZVal.getElementRecursive(
                                                                    passed, dependency, "size"),
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .CONST_UNKNOWN))
                                            && ZVal.toBool(
                                                    ZVal.notEqualityCheck(
                                                            env.callMethod(
                                                                    this,
                                                                    "getSize",
                                                                    TestCase.class),
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .CONST_UNKNOWN)))
                            && ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            ZVal.getElementRecursive(passed, dependency, "size"),
                                            '>',
                                            env.callMethod(this, "getSize", TestCase.class)))) {
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("result").value(),
                                "addError",
                                TestCase.class,
                                this,
                                new SkippedTestError(
                                        env,
                                        "This test depends on a test that is larger than itself."),
                                0);
                        return ZVal.assign(false);
                    }

                    if (ZVal.isTrue(deepClone)) {
                        deepCopy = new DeepCopy(env);
                        env.callMethod(deepCopy, "skipUncloneable", TestCase.class, false);
                        ZVal.putArrayElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("dependencyInput")
                                        .value(),
                                dependency,
                                env.callMethod(
                                        deepCopy,
                                        "copy",
                                        TestCase.class,
                                        ZVal.getElementRecursive(passed, dependency, "result")));

                    } else if (ZVal.isTrue(shallowClone)) {
                        ZVal.putArrayElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("dependencyInput")
                                        .value(),
                                dependency,
                                ((RuntimeClassInterface)
                                                ZVal.getElementRecursive(
                                                        passed, dependency, "result"))
                                        .phpClone());

                    } else {
                        ZVal.putArrayElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("dependencyInput")
                                        .value(),
                                dependency,
                                ZVal.getElementRecursive(passed, dependency, "result"));
                    }

                } else {
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("dependencyInput").value(),
                            dependency,
                            ZVal.getNull());
                }
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    private Object getMockObjectGenerator(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("mockObjectGenerator").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("mockObjectGenerator")
                    .set(new Generator(env));
        }

        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("mockObjectGenerator").value());
    }

    @ConvertedMethod
    private Object startOutputBuffering(RuntimeEnv env, Object... args) {
        NamespaceGlobal.ob_start.env(env).call();
        toObjectR(this).accessProp(this, env).name("outputBufferingActive").set(true);
        toObjectR(this)
                .accessProp(this, env)
                .name("outputBufferingLevel")
                .set(NamespaceGlobal.ob_get_level.env(env).call().value());
        return null;
    }

    @ConvertedMethod
    private Object stopOutputBuffering(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.ob_get_level.env(env).call().value(),
                "!==",
                toObjectR(this).accessProp(this, env).name("outputBufferingLevel").value())) {
            while (ZVal.isGreaterThanOrEqualTo(
                    NamespaceGlobal.ob_get_level.env(env).call().value(),
                    ">=",
                    toObjectR(this).accessProp(this, env).name("outputBufferingLevel").value())) {
                NamespaceGlobal.ob_end_clean.env(env).call();
            }

            throw ZVal.getException(
                    env,
                    new RiskyTestError(
                            env,
                            "Test code or tested code did not (only) close its own output buffers"));
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("output")
                .set(NamespaceGlobal.ob_get_contents.env(env).call().value());
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("outputCallback").value(),
                "!==",
                false)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("output")
                    .set(
                            toStringR(
                                    function_call_user_func
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("outputCallback")
                                                            .value(),
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("output")
                                                            .value())
                                            .value(),
                                    env));
        }

        NamespaceGlobal.ob_end_clean.env(env).call();
        toObjectR(this).accessProp(this, env).name("outputBufferingActive").set(false);
        toObjectR(this)
                .accessProp(this, env)
                .name("outputBufferingLevel")
                .set(NamespaceGlobal.ob_get_level.env(env).call().value());
        return null;
    }

    @ConvertedMethod
    private Object snapshotGlobalState(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(
                        ZVal.toBool(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("runTestInSeparateProcess")
                                                .value())
                                || ZVal.toBool(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("inIsolation")
                                                .value()))
                || ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                !toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("backupGlobals")
                                                        .getBool(),
                                                "===",
                                                true))
                                && ZVal.toBool(
                                        !toObjectR(this)
                                                .accessProp(this, env)
                                                .name("backupStaticAttributes")
                                                .getBool()))) {
            return null;
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("snapshot")
                .set(
                        env.callMethod(
                                this,
                                "createGlobalStateSnapshot",
                                TestCase.class,
                                ZVal.strictEqualityCheck(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("backupGlobals")
                                                .value(),
                                        "===",
                                        true)));
        return null;
    }

    @ConvertedMethod
    private Object restoreGlobalState(RuntimeEnv env, Object... args) {
        Object rte = null;
        Object restorer = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(this).accessProp(this, env).name("snapshot").value(),
                        Snapshot.class,
                        "SebastianBergmann\\GlobalState\\Snapshot"))) {
            return null;
        }

        if (toObjectR(this)
                .accessProp(this, env)
                .name("beStrictAboutChangesToGlobalState")
                .getBool()) {
            try {
                env.callMethod(
                        this,
                        "compareGlobalStateSnapshots",
                        TestCase.class,
                        toObjectR(this).accessProp(this, env).name("snapshot").value(),
                        env.callMethod(
                                this,
                                "createGlobalStateSnapshot",
                                TestCase.class,
                                ZVal.strictEqualityCheck(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("backupGlobals")
                                                .value(),
                                        "===",
                                        true)));
            } catch (ConvertedException convertedException39) {
                if (convertedException39.instanceOf(
                        RiskyTestError.class, "PHPUnit\\Framework\\RiskyTestError")) {
                    rte = convertedException39.getObject();
                } else {
                    throw convertedException39;
                }
            }
        }

        restorer = new Restorer(env);
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("backupGlobals").value(), "===", true)) {
            env.callMethod(
                    restorer,
                    "restoreGlobalVariables",
                    TestCase.class,
                    toObjectR(this).accessProp(this, env).name("snapshot").value());
        }

        if (toObjectR(this).accessProp(this, env).name("backupStaticAttributes").getBool()) {
            env.callMethod(
                    restorer,
                    "restoreStaticAttributes",
                    TestCase.class,
                    toObjectR(this).accessProp(this, env).name("snapshot").value());
        }

        toObjectR(this).accessProp(this, env).name("snapshot").set(ZVal.getNull());
        if (ZVal.isset(rte)) {
            throw ZVal.getException(env, rte);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backupGlobals", typeHint = "bool")
    private Object createGlobalStateSnapshot(RuntimeEnv env, Object... args) {
        Object backupGlobals = assignParameter(args, 0, null);
        Object globalVariable = null;
        Object blacklist = null;
        Object attributes = null;
        Object attribute = null;
        Object _pClass = null;
        blacklist = new Blacklist(env);
        for (ZPair zpairResult279 :
                ZVal.getIterable(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("backupGlobalsBlacklist")
                                .value(),
                        env,
                        true)) {
            globalVariable = ZVal.assign(zpairResult279.getValue());
            env.callMethod(blacklist, "addGlobalVariable", TestCase.class, globalVariable);
        }

        if (!function_defined.f.env(env).call("PHPUNIT_TESTSUITE").getBool()) {
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "PHPUnit");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "File_Iterator");
            env.callMethod(
                    blacklist,
                    "addClassNamePrefix",
                    TestCase.class,
                    "SebastianBergmann\\CodeCoverage");
            env.callMethod(
                    blacklist, "addClassNamePrefix", TestCase.class, "SebastianBergmann\\Invoker");
            env.callMethod(
                    blacklist, "addClassNamePrefix", TestCase.class, "SebastianBergmann\\Timer");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "PHP_Token");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "Symfony");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "Text_Template");
            env.callMethod(
                    blacklist, "addClassNamePrefix", TestCase.class, "Doctrine\\Instantiator");
            env.callMethod(blacklist, "addClassNamePrefix", TestCase.class, "Prophecy");
            for (ZPair zpairResult280 :
                    ZVal.getIterable(
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("backupStaticAttributesBlacklist")
                                    .value(),
                            env,
                            false)) {
                _pClass = ZVal.assign(zpairResult280.getKey());
                attributes = ZVal.assign(zpairResult280.getValue());
                for (ZPair zpairResult281 : ZVal.getIterable(attributes, env, true)) {
                    attribute = ZVal.assign(zpairResult281.getValue());
                    env.callMethod(
                            blacklist, "addStaticAttribute", TestCase.class, _pClass, attribute);
                }
            }
        }

        return ZVal.assign(
                new Snapshot(
                        env,
                        blacklist,
                        backupGlobals,
                        ZVal.toBool(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("backupStaticAttributes")
                                        .value()),
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "before",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    @ConvertedParameter(
        index = 1,
        name = "after",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    private Object compareGlobalStateSnapshots(RuntimeEnv env, Object... args) {
        Object before = assignParameter(args, 0, null);
        Object after = assignParameter(args, 1, null);
        Object backupGlobals = null;
        backupGlobals =
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("backupGlobals")
                                                .value(),
                                        "===",
                                        ZVal.getNull()))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("backupGlobals")
                                                .value(),
                                        "===",
                                        true));
        if (ZVal.isTrue(backupGlobals)) {
            env.callMethod(
                    this,
                    "compareGlobalStateSnapshotPart",
                    TestCase.class,
                    env.callMethod(before, "globalVariables", TestCase.class),
                    env.callMethod(after, "globalVariables", TestCase.class),
                    "--- Global variables before the test\n+++ Global variables after the test\n");
            env.callMethod(
                    this,
                    "compareGlobalStateSnapshotPart",
                    TestCase.class,
                    env.callMethod(before, "superGlobalVariables", TestCase.class),
                    env.callMethod(after, "superGlobalVariables", TestCase.class),
                    "--- Super-global variables before the test\n+++ Super-global variables after the test\n");
        }

        if (toObjectR(this).accessProp(this, env).name("backupStaticAttributes").getBool()) {
            env.callMethod(
                    this,
                    "compareGlobalStateSnapshotPart",
                    TestCase.class,
                    env.callMethod(before, "staticAttributes", TestCase.class),
                    env.callMethod(after, "staticAttributes", TestCase.class),
                    "--- Static attributes before the test\n+++ Static attributes after the test\n");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "before", typeHint = "array")
    @ConvertedParameter(index = 1, name = "after", typeHint = "array")
    @ConvertedParameter(index = 2, name = "header", typeHint = "string")
    private Object compareGlobalStateSnapshotPart(RuntimeEnv env, Object... args) {
        Object before = assignParameter(args, 0, null);
        Object after = assignParameter(args, 1, null);
        Object header = assignParameter(args, 2, null);
        Object exporter = null;
        Object diff = null;
        Object differ = null;
        if (ZVal.notEqualityCheck(before, after)) {
            differ = new Differ(env, header);
            exporter = new Exporter(env);
            diff =
                    env.callMethod(
                            differ,
                            "diff",
                            TestCase.class,
                            env.callMethod(exporter, "export", TestCase.class, before),
                            env.callMethod(exporter, "export", TestCase.class, after));
            throw ZVal.getException(env, new RiskyTestError(env, diff));
        }

        return null;
    }

    @ConvertedMethod
    private Object getProphet(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("prophet").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("prophet").set(new Prophet(env));
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("prophet").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mock",
        typeHint = "PHPUnit\\Framework\\MockObject\\MockObject"
    )
    private Object shouldInvocationMockerBeReset(RuntimeEnv env, Object... args) {
        Object mock = assignParameter(args, 0, null);
        Object enumerator = null;
        Object _object = null;
        enumerator = new Enumerator(env);
        for (ZPair zpairResult282 :
                ZVal.getIterable(
                        env.callMethod(
                                enumerator,
                                "enumerate",
                                TestCase.class,
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("dependencyInput")
                                        .value()),
                        env,
                        true)) {
            _object = ZVal.assign(zpairResult282.getValue());
            if (ZVal.strictEqualityCheck(mock, "===", _object)) {
                return ZVal.assign(false);
            }
        }

        if (ZVal.toBool(
                        !function_is_array
                                .f
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("testResult")
                                                .value())
                                .getBool())
                && ZVal.toBool(
                        !function_is_object
                                .f
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("testResult")
                                                .value())
                                .getBool())) {
            return ZVal.assign(true);
        }

        for (ZPair zpairResult283 :
                ZVal.getIterable(
                        env.callMethod(
                                enumerator,
                                "enumerate",
                                TestCase.class,
                                toObjectR(this).accessProp(this, env).name("testResult").value()),
                        env,
                        true)) {
            _object = ZVal.assign(zpairResult283.getValue());
            if (ZVal.strictEqualityCheck(mock, "===", _object)) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testArguments", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "visited",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    private Object registerMockObjectsFromTestArguments(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object testArguments = assignParameter(args, 0, null);
        ReferenceContainer visited = assignParameterRef(runtimePassByReferenceArgs, args, 1, null);
        if (ZVal.isNull(visited)) {
            visited.setObject(ZVal.newArray());
        }
        Object enumerator = null;
        Object testArgument = null;
        Object _object = null;
        if (toObjectR(this)
                .accessProp(this, env)
                .name("registerMockObjectsFromTestArgumentsRecursively")
                .getBool()) {
            enumerator = new Enumerator(env);
            for (ZPair zpairResult284 :
                    ZVal.getIterable(
                            env.callMethod(enumerator, "enumerate", TestCase.class, testArguments),
                            env,
                            true)) {
                _object = ZVal.assign(zpairResult284.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                _object,
                                MockObject.class,
                                "PHPUnit\\Framework\\MockObject\\MockObject"))) {
                    env.callMethod(this, "registerMockObject", TestCase.class, _object);
                }
            }

        } else {
            for (ZPair zpairResult285 : ZVal.getIterable(testArguments, env, true)) {
                testArgument = ZVal.assign(zpairResult285.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                testArgument,
                                MockObject.class,
                                "PHPUnit\\Framework\\MockObject\\MockObject"))) {
                    if (ZVal.isTrue(
                            env.callMethod(this, "isCloneable", TestCase.class, testArgument))) {
                        testArgument =
                                ZVal.assign(((RuntimeClassInterface) testArgument).phpClone());
                    }

                    env.callMethod(this, "registerMockObject", TestCase.class, testArgument);

                } else if (ZVal.toBool(function_is_array.f.env(env).call(testArgument).value())
                        && ZVal.toBool(
                                !CRArrayF.in_array
                                        .env(env)
                                        .call(testArgument, visited.getObject(), true)
                                        .getBool())) {
                    ZVal.addToArray(visited.getObject(), testArgument);
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(1, visited),
                            "registerMockObjectsFromTestArguments",
                            TestCase.class,
                            testArgument,
                            visited.getObject());
                }
            }
        }

        return null;
    }

    public Object registerMockObjectsFromTestArguments(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    private Object setDoesNotPerformAssertionsFromAnnotation(RuntimeEnv env, Object... args) {
        Object annotations = ZVal.newArray();
        annotations = env.callMethod(this, "getAnnotations", TestCase.class);
        if (ZVal.isset(
                ZVal.getElementRecursive(annotations, "method", "doesNotPerformAssertions"))) {
            toObjectR(this).accessProp(this, env).name("doesNotPerformAssertions").set(true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "testArgument",
        typeHint = "PHPUnit\\Framework\\MockObject\\MockObject"
    )
    private Object isCloneable(RuntimeEnv env, Object... args) {
        Object testArgument = assignParameter(args, 0, null);
        Object reflector = null;
        reflector = new ReflectionObject(env, testArgument);
        if (!ZVal.isTrue(env.callMethod(reflector, "isCloneable", TestCase.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(env.callMethod(reflector, "hasMethod", TestCase.class, "__clone"))
                && ZVal.toBool(
                        env.callMethod(
                                env.callMethod(reflector, "getMethod", TestCase.class, "__clone"),
                                "isPublic",
                                TestCase.class))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    private Object unregisterCustomComparators(RuntimeEnv env, Object... args) {
        Object factory = null;
        Object comparator = null;
        factory = Factory.runtimeStaticObject.getInstance(env);
        for (ZPair zpairResult286 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("customComparators").value(),
                        env,
                        true)) {
            comparator = ZVal.assign(zpairResult286.getValue());
            env.callMethod(factory, "unregister", TestCase.class, comparator);
        }

        toObjectR(this).accessProp(this, env).name("customComparators").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    private Object cleanupIniSettings(RuntimeEnv env, Object... args) {
        Object varName = null;
        Object oldValue = null;
        for (ZPair zpairResult287 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("iniSettings").value(),
                        env,
                        false)) {
            varName = ZVal.assign(zpairResult287.getKey());
            oldValue = ZVal.assign(zpairResult287.getValue());
            NamespaceGlobal.ini_set.env(env).call(varName, oldValue);
        }

        toObjectR(this).accessProp(this, env).name("iniSettings").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    private Object cleanupLocaleSettings(RuntimeEnv env, Object... args) {
        Object category = null;
        Object locale = null;
        for (ZPair zpairResult288 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("locale").value(), env, false)) {
            category = ZVal.assign(zpairResult288.getKey());
            locale = ZVal.assign(zpairResult288.getValue());
            NamespaceGlobal.setlocale.env(env).call(category, locale);
        }

        toObjectR(this).accessProp(this, env).name("locale").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "throwable", typeHint = "Throwable")
    private Object checkExceptionExpectations(RuntimeEnv env, Object... args) {
        Object throwable = assignParameter(args, 0, null);
        Object result = null;
        Object reflector = null;
        result = false;
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("expectedException")
                                                                        .value(),
                                                                "!==",
                                                                ZVal.getNull()))
                                                || ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name(
                                                                                "expectedExceptionCode")
                                                                        .value(),
                                                                "!==",
                                                                ZVal.getNull())))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("expectedExceptionMessage")
                                                        .value(),
                                                "!==",
                                                ZVal.getNull())))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("expectedExceptionMessageRegExp")
                                        .value(),
                                "!==",
                                ZVal.getNull()))) {
            result = true;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        throwable,
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
                        "PHPUnit\\Framework\\Exception"))) {
            result = false;
        }

        if (function_is_string
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("expectedException").value())
                .getBool()) {
            reflector =
                    new ReflectionClass(
                            env,
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("expectedException")
                                    .value());
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("expectedException")
                                                            .value(),
                                                    "===",
                                                    "PHPUnit\\Framework\\Exception"))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("expectedException")
                                                            .value(),
                                                    "===",
                                                    "\\PHPUnit\\Framework\\Exception")))
                    || ZVal.toBool(
                            env.callMethod(
                                    reflector,
                                    "isSubclassOf",
                                    TestCase.class,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .Exception
                                            .CONST_class))) {
                result = true;
            }
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\TestCase";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Assert.RuntimeStaticCompanion {

        @ConvertedMethod
        public Object any(RuntimeEnv env, Object... args) {
            return ZVal.assign(new AnyInvokedCount(env));
        }

        @ConvertedMethod
        public Object never(RuntimeEnv env, Object... args) {
            return ZVal.assign(new InvokedCount(env, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "requiredInvocations", typeHint = "int")
        public Object atLeast(RuntimeEnv env, Object... args) {
            Object requiredInvocations = assignParameter(args, 0, null);
            return ZVal.assign(new InvokedAtLeastCount(env, requiredInvocations));
        }

        @ConvertedMethod
        public Object atLeastOnce(RuntimeEnv env, Object... args) {
            return ZVal.assign(new InvokedAtLeastOnce(env));
        }

        @ConvertedMethod
        public Object once(RuntimeEnv env, Object... args) {
            return ZVal.assign(new InvokedCount(env, 1));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "count", typeHint = "int")
        public Object exactly(RuntimeEnv env, Object... args) {
            Object count = assignParameter(args, 0, null);
            return ZVal.assign(new InvokedCount(env, count));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "allowedInvocations", typeHint = "int")
        public Object atMost(RuntimeEnv env, Object... args) {
            Object allowedInvocations = assignParameter(args, 0, null);
            return ZVal.assign(new InvokedAtMostCount(env, allowedInvocations));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "index", typeHint = "int")
        public Object at(RuntimeEnv env, Object... args) {
            Object index = assignParameter(args, 0, null);
            return ZVal.assign(new InvokedAtIndex(env, index));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object returnValue(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(new ReturnStub(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "valueMap", typeHint = "array")
        public Object returnValueMap(RuntimeEnv env, Object... args) {
            Object valueMap = assignParameter(args, 0, null);
            return ZVal.assign(new ReturnValueMap(env, valueMap));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argumentIndex", typeHint = "int")
        public Object returnArgument(RuntimeEnv env, Object... args) {
            Object argumentIndex = assignParameter(args, 0, null);
            return ZVal.assign(new ReturnArgument(env, argumentIndex));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object returnCallback(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, null);
            return ZVal.assign(new ReturnCallback(env, callback));
        }

        @ConvertedMethod
        public Object returnSelf(RuntimeEnv env, Object... args) {
            return ZVal.assign(new ReturnSelf(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "exception", typeHint = "Throwable")
        public Object throwException(RuntimeEnv env, Object... args) {
            Object exception = assignParameter(args, 0, null);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .namespaces
                            .MockObject
                            .namespaces
                            .Stub
                            .classes
                            .Exception(env, exception));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object onConsecutiveCalls(RuntimeEnv env, Object... args) {
            Object ___args = assignParameter(args, 0, null);
            return ZVal.assign(new ConsecutiveCalls(env, ___args));
        }

        @ConvertedMethod
        public Object setUpBeforeClass(RuntimeEnv env, Object... args) {
            return null;
        }

        @ConvertedMethod
        public Object tearDownAfterClass(RuntimeEnv env, Object... args) {
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\TestCase")
                    .setLookup(TestCase.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "backupGlobals",
                            "backupGlobalsBlacklist",
                            "backupStaticAttributes",
                            "backupStaticAttributesBlacklist",
                            "beStrictAboutChangesToGlobalState",
                            "customComparators",
                            "data",
                            "dataName",
                            "dependencies",
                            "dependencyInput",
                            "doesNotPerformAssertions",
                            "expectedException",
                            "expectedExceptionCode",
                            "expectedExceptionMessage",
                            "expectedExceptionMessageRegExp",
                            "groups",
                            "inIsolation",
                            "iniSettings",
                            "locale",
                            "mockObjectGenerator",
                            "mockObjects",
                            "name",
                            "numAssertions",
                            "output",
                            "outputBufferingActive",
                            "outputBufferingLevel",
                            "outputCallback",
                            "outputExpectedRegex",
                            "outputExpectedString",
                            "preserveGlobalState",
                            "prophet",
                            "registerMockObjectsFromTestArgumentsRecursively",
                            "result",
                            "runClassInSeparateProcess",
                            "runTestInSeparateProcess",
                            "snapshot",
                            "status",
                            "statusMessage",
                            "testResult",
                            "useErrorHandler",
                            "warnings")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/TestCase.php")
                    .addInterface("Test")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Assert")
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
