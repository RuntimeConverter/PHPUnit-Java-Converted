package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.StandardTestSuiteLoader;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.File_Iterator_Facade;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/BaseTestRunner.php

*/

public abstract class BaseTestRunner extends RuntimeClassBase {

    public BaseTestRunner(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getLoader(RuntimeEnv env, Object... args) {
        return ZVal.assign(new StandardTestSuiteLoader(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suiteClassName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suiteClassFile", typeHint = "string")
    @ConvertedParameter(index = 2, name = "suffixes")
    public Object getTest(RuntimeEnv env, Object... args) {
        Object suiteClassName = assignParameter(args, 0, null);
        Object suiteClassFile = assignParameter(args, 1, null);
        if (ZVal.isNull(suiteClassFile)) {
            suiteClassFile = "";
        }
        Object suffixes = assignParameter(args, 2, null);
        if (ZVal.isNull(suffixes)) {
            suffixes = "";
        }
        Object suite = null;
        Object test = null;
        Object e = null;
        Object facade = null;
        Object files = null;
        Object testClass = null;
        Object suiteMethod = null;
        if (ZVal.toBool(
                        ZVal.toBool(NamespaceGlobal.is_dir.env(env).call(suiteClassName).value())
                                && ZVal.toBool(
                                        !NamespaceGlobal.is_file
                                                .env(env)
                                                .call(toStringR(suiteClassName, env) + ".php")
                                                .getBool()))
                && ZVal.toBool(ZVal.isEmpty(suiteClassFile))) {
            facade = new File_Iterator_Facade(env);
            files =
                    env.callMethod(
                            facade,
                            "getFilesAsArray",
                            BaseTestRunner.class,
                            suiteClassName,
                            suffixes);
            suite = new TestSuite(env, suiteClassName);
            env.callMethod(suite, "addTestFiles", BaseTestRunner.class, files);
            return ZVal.assign(suite);
        }

        try {
            testClass =
                    env.callMethod(
                            this,
                            "loadSuiteClass",
                            BaseTestRunner.class,
                            suiteClassName,
                            suiteClassFile);
        } catch (ConvertedException convertedException45) {
            if (convertedException45.instanceOf(Exception.class, "PHPUnit\\Framework\\Exception")) {
                e = convertedException45.getObject();
                env.callMethod(
                        this,
                        "runFailed",
                        BaseTestRunner.class,
                        env.callMethod(e, "getMessage", BaseTestRunner.class));
                return ZVal.assign(ZVal.getNull());
            } else {
                throw convertedException45;
            }
        }

        try {
            suiteMethod =
                    env.callMethod(
                            testClass, "getMethod", BaseTestRunner.class, CONST_SUITE_METHODNAME);
            if (!ZVal.isTrue(env.callMethod(suiteMethod, "isStatic", BaseTestRunner.class))) {
                env.callMethod(
                        this, "runFailed", BaseTestRunner.class, "suite() method must be static.");
                return ZVal.assign(ZVal.getNull());
            }

            try {
                test =
                        env.callMethod(
                                suiteMethod,
                                "invoke",
                                BaseTestRunner.class,
                                ZVal.getNull(),
                                env.callMethod(testClass, "getName", BaseTestRunner.class));
            } catch (ConvertedException convertedException46) {
                if (convertedException46.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException46.getObject();
                    env.callMethod(
                            this,
                            "runFailed",
                            BaseTestRunner.class,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Failed to invoke suite() method.\n%s",
                                            env.callMethod(e, "getMessage", BaseTestRunner.class))
                                    .value());
                    return ZVal.assign(ZVal.getNull());
                } else {
                    throw convertedException46;
                }
            }

        } catch (ConvertedException convertedException47) {
            if (convertedException47.instanceOf(ReflectionException.class, "ReflectionException")) {
                e = convertedException47.getObject();
                try {
                    test = new TestSuite(env, testClass);
                } catch (ConvertedException convertedException48) {
                    if (convertedException48.instanceOf(
                            Exception.class, "PHPUnit\\Framework\\Exception")) {
                        e = convertedException48.getObject();
                        test = new TestSuite(env);
                        env.callMethod(test, "setName", BaseTestRunner.class, suiteClassName);
                    } else {
                        throw convertedException48;
                    }
                }

            } else {
                throw convertedException47;
            }
        }

        env.callMethod(this, "clearStatus", BaseTestRunner.class);
        return ZVal.assign(test);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suiteClassName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suiteClassFile", typeHint = "string")
    protected Object loadSuiteClass(RuntimeEnv env, Object... args) {
        Object suiteClassName = assignParameter(args, 0, null);
        Object suiteClassFile = assignParameter(args, 1, null);
        if (ZVal.isNull(suiteClassFile)) {
            suiteClassFile = "";
        }
        Object loader = null;
        loader = env.callMethod(this, "getLoader", BaseTestRunner.class);
        return ZVal.assign(
                env.callMethod(
                        loader, "load", BaseTestRunner.class, suiteClassName, suiteClassFile));
    }

    @ConvertedMethod
    protected Object clearStatus(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    protected abstract Object runFailed(RuntimeEnv env, Object... args);

    public static final Object CONST_STATUS_PASSED = 0;

    public static final Object CONST_STATUS_SKIPPED = 1;

    public static final Object CONST_STATUS_INCOMPLETE = 2;

    public static final Object CONST_STATUS_FAILURE = 3;

    public static final Object CONST_STATUS_ERROR = 4;

    public static final Object CONST_STATUS_RISKY = 5;

    public static final Object CONST_STATUS_WARNING = 6;

    public static final Object CONST_SUITE_METHODNAME = "suite";

    public static final Object CONST_class = "PHPUnit\\Runner\\BaseTestRunner";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\BaseTestRunner")
                    .setLookup(BaseTestRunner.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/BaseTestRunner.php")
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
