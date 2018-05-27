package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.classes.MockTestObj;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 tests/MockTest.php

*/

public final class MockTest extends TestCase {

    public MockTest(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockTest.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object testMock1Pass(RuntimeEnv env, Object... args) {
        Object testedUnit = null;
        Object a = null;
        testedUnit =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this,
                                        "getMockBuilder",
                                        MockTest.class,
                                        MockTestObj.CONST_class),
                                "setMethods",
                                MockTest.class,
                                ZVal.newArray(new ZPair(0, "testMethod"))),
                        "getMock",
                        MockTest.class);
        env.callMethod(
                env.callMethod(
                        testedUnit,
                        "expects",
                        MockTest.class,
                        env.callMethod(this, "once", MockTest.class)),
                "method",
                MockTest.class,
                "testMethod");
        a = env.callMethod(testedUnit, "testMethod", MockTest.class);
        env.callMethod(this, "assertNull", MockTest.class, a);
        return null;
    }

    @ConvertedMethod
    public Object testMock1Fail(RuntimeEnv env, Object... args) {
        Object testedUnit = null;
        testedUnit =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this,
                                        "getMockBuilder",
                                        MockTest.class,
                                        MockTestObj.CONST_class),
                                "setMethods",
                                MockTest.class,
                                ZVal.newArray(new ZPair(0, "testMethod"))),
                        "getMock",
                        MockTest.class);
        env.callMethod(
                env.callMethod(
                        testedUnit,
                        "expects",
                        MockTest.class,
                        env.callMethod(this, "once", MockTest.class)),
                "method",
                MockTest.class,
                "testMethod");
        return null;
    }

    public static final Object CONST_class = "MockTest";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TestCase.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("MockTest")
                    .setLookup(MockTest.class, java.lang.invoke.MethodHandles.lookup())
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
                    .setFilename("tests/MockTest.php")
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
