package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/SkippedTestCase.php

*/

public class SkippedTestCase extends TestCase {

    public Object message = "";

    public Object backupGlobals = false;

    public Object backupStaticAttributes = false;

    public Object runTestInSeparateProcess = false;

    public Object useErrorHandler = false;

    public Object useOutputBuffering = false;

    public SkippedTestCase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SkippedTestCase.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
    @ConvertedParameter(index = 2, name = "message", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object methodName = assignParameter(args, 1, null);
        Object message = assignParameter(args, 2, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        super.__construct(env, toStringR(className, env) + "::" + toStringR(methodName, env));
        toObjectR(this).accessProp(this, env).name("message").set(message);
        return null;
    }

    @ConvertedMethod
    public Object getMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("message").value());
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getName", SkippedTestCase.class));
    }

    @ConvertedMethod
    protected Object runTest(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "markTestSkipped",
                SkippedTestCase.class,
                toObjectR(this).accessProp(this, env).name("message").value());
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\SkippedTestCase";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TestCase.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\SkippedTestCase")
                    .setLookup(SkippedTestCase.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "backupGlobals",
                            "backupGlobals",
                            "backupGlobalsBlacklist",
                            "backupStaticAttributes",
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
                            "message",
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
                            "runTestInSeparateProcess",
                            "snapshot",
                            "status",
                            "statusMessage",
                            "testResult",
                            "useErrorHandler",
                            "useErrorHandler",
                            "useOutputBuffering",
                            "warnings")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/SkippedTestCase.php")
                    .addInterface("Test")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\TestCase")
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
