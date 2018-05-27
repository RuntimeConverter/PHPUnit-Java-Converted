package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterSuccessfulTestHook;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.BeforeTestHook;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterTestWarningHook;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterSkippedTestHook;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterTestErrorHook;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterIncompleteTestHook;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterTestFailureHook;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.AfterRiskyTestHook;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Hook/TestListenerAdapter.php

*/

public final class TestListenerAdapter extends RuntimeClassBase implements TestListener {

    public Object hooks = ZVal.newArray();

    public Object lastTestWasNotSuccessful = null;

    public TestListenerAdapter(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hook", typeHint = "PHPUnit\\Runner\\TestHook")
    public Object add(RuntimeEnv env, Object... args) {
        Object hook = assignParameter(args, 0, null);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("hooks").value(), hook);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object hook = null;
        for (ZPair zpairResult312 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("hooks").value(), env, true)) {
            hook = ZVal.assign(zpairResult312.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            hook, BeforeTestHook.class, "PHPUnit\\Runner\\BeforeTestHook"))) {
                env.callMethod(
                        hook,
                        "executeBeforeTest",
                        TestListenerAdapter.class,
                        Test.runtimeStaticObject.describeAsString(env, test));
            }
        }

        toObjectR(this).accessProp(this, env).name("lastTestWasNotSuccessful").set(false);
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
        Object hook = null;
        for (ZPair zpairResult313 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("hooks").value(), env, true)) {
            hook = ZVal.assign(zpairResult313.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            hook,
                            AfterTestErrorHook.class,
                            "PHPUnit\\Runner\\AfterTestErrorHook"))) {
                env.callMethod(
                        hook,
                        "executeAfterTestError",
                        TestListenerAdapter.class,
                        Test.runtimeStaticObject.describeAsString(env, test),
                        env.callMethod(t, "getMessage", TestListenerAdapter.class),
                        time);
            }
        }

        toObjectR(this).accessProp(this, env).name("lastTestWasNotSuccessful").set(true);
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
        Object hook = null;
        for (ZPair zpairResult314 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("hooks").value(), env, true)) {
            hook = ZVal.assign(zpairResult314.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            hook,
                            AfterTestWarningHook.class,
                            "PHPUnit\\Runner\\AfterTestWarningHook"))) {
                env.callMethod(
                        hook,
                        "executeAfterTestWarning",
                        TestListenerAdapter.class,
                        Test.runtimeStaticObject.describeAsString(env, test),
                        env.callMethod(e, "getMessage", TestListenerAdapter.class),
                        time);
            }
        }

        toObjectR(this).accessProp(this, env).name("lastTestWasNotSuccessful").set(true);
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
        Object hook = null;
        for (ZPair zpairResult315 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("hooks").value(), env, true)) {
            hook = ZVal.assign(zpairResult315.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            hook,
                            AfterTestFailureHook.class,
                            "PHPUnit\\Runner\\AfterTestFailureHook"))) {
                env.callMethod(
                        hook,
                        "executeAfterTestFailure",
                        TestListenerAdapter.class,
                        Test.runtimeStaticObject.describeAsString(env, test),
                        env.callMethod(e, "getMessage", TestListenerAdapter.class),
                        time);
            }
        }

        toObjectR(this).accessProp(this, env).name("lastTestWasNotSuccessful").set(true);
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
        Object hook = null;
        for (ZPair zpairResult316 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("hooks").value(), env, true)) {
            hook = ZVal.assign(zpairResult316.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            hook,
                            AfterIncompleteTestHook.class,
                            "PHPUnit\\Runner\\AfterIncompleteTestHook"))) {
                env.callMethod(
                        hook,
                        "executeAfterIncompleteTest",
                        TestListenerAdapter.class,
                        Test.runtimeStaticObject.describeAsString(env, test),
                        env.callMethod(t, "getMessage", TestListenerAdapter.class),
                        time);
            }
        }

        toObjectR(this).accessProp(this, env).name("lastTestWasNotSuccessful").set(true);
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
        Object hook = null;
        for (ZPair zpairResult317 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("hooks").value(), env, true)) {
            hook = ZVal.assign(zpairResult317.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            hook,
                            AfterRiskyTestHook.class,
                            "PHPUnit\\Runner\\AfterRiskyTestHook"))) {
                env.callMethod(
                        hook,
                        "executeAfterRiskyTest",
                        TestListenerAdapter.class,
                        Test.runtimeStaticObject.describeAsString(env, test),
                        env.callMethod(t, "getMessage", TestListenerAdapter.class),
                        time);
            }
        }

        toObjectR(this).accessProp(this, env).name("lastTestWasNotSuccessful").set(true);
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
        Object hook = null;
        for (ZPair zpairResult318 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("hooks").value(), env, true)) {
            hook = ZVal.assign(zpairResult318.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            hook,
                            AfterSkippedTestHook.class,
                            "PHPUnit\\Runner\\AfterSkippedTestHook"))) {
                env.callMethod(
                        hook,
                        "executeAfterSkippedTest",
                        TestListenerAdapter.class,
                        Test.runtimeStaticObject.describeAsString(env, test),
                        env.callMethod(t, "getMessage", TestListenerAdapter.class),
                        time);
            }
        }

        toObjectR(this).accessProp(this, env).name("lastTestWasNotSuccessful").set(true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object time = assignParameter(args, 1, null);
        Object hook = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("lastTestWasNotSuccessful").value(),
                "===",
                true)) {
            return null;
        }

        for (ZPair zpairResult319 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("hooks").value(), env, true)) {
            hook = ZVal.assign(zpairResult319.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            hook,
                            AfterSuccessfulTestHook.class,
                            "PHPUnit\\Runner\\AfterSuccessfulTestHook"))) {
                env.callMethod(
                        hook,
                        "executeAfterSuccessfulTest",
                        TestListenerAdapter.class,
                        Test.runtimeStaticObject.describeAsString(env, test),
                        time);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, null);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\TestListenerAdapter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\TestListenerAdapter")
                    .setLookup(TestListenerAdapter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("hooks", "lastTestWasNotSuccessful")
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Hook/TestListenerAdapter.php")
                    .addInterface("TestListener")
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
