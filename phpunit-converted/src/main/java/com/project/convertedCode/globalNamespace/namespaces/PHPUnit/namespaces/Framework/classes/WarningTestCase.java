package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Warning;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/WarningTestCase.php

*/

public class WarningTestCase extends TestCase {

    public Object message = "";

    public Object backupGlobals = false;

    public Object backupStaticAttributes = false;

    public Object runTestInSeparateProcess = false;

    public Object useErrorHandler = false;

    public WarningTestCase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WarningTestCase.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        toObjectR(this).accessProp(this, env).name("message").set(message);
        super.__construct(env, "Warning");
        return null;
    }

    @ConvertedMethod
    public Object getMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("message").value());
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "Warning";
    }

    @ConvertedMethod
    protected Object runTest(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env,
                new Warning(env, toObjectR(this).accessProp(this, env).name("message").value()));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\WarningTestCase";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TestCase.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\WarningTestCase")
                    .setLookup(WarningTestCase.class, java.lang.invoke.MethodHandles.lookup())
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
                            "warnings")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/WarningTestCase.php")
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
