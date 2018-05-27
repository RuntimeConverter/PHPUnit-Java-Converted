package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Email;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 tests/EmailTest.php

*/

public final class EmailTest extends TestCase {

    public EmailTest(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EmailTest.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object testCanBeCreatedFromValidEmailAddress(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "assertInstanceOf",
                EmailTest.class,
                Email.CONST_class,
                Email.runtimeStaticObject.fromString(env, "user@example.com"));
        return null;
    }

    @ConvertedMethod
    public Object testCannotBeCreatedFromInvalidEmailAddress(RuntimeEnv env, Object... args) {
        env.callMethod(this, "expectException", EmailTest.class, "InvalidArgumentException");
        Email.runtimeStaticObject.fromString(env, "invalid");
        return null;
    }

    @ConvertedMethod
    public Object testCanBeUsedAsString(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                new RuntimeArgsWithReferences(),
                "assertEquals",
                EmailTest.class,
                "user@example.com",
                Email.runtimeStaticObject.fromString(env, "user@example.com"));
        return null;
    }

    public static final Object CONST_class = "EmailTest";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TestCase.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("EmailTest")
                    .setLookup(EmailTest.class, java.lang.invoke.MethodHandles.lookup())
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
                    .setFilename("tests/EmailTest.php")
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
