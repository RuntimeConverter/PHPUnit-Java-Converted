package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
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

 vendor/phpunit/phpunit/src/Framework/DataProviderTestSuite.php

*/

public class DataProviderTestSuite extends TestSuite {

    public DataProviderTestSuite(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DataProviderTestSuite.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dependencies", typeHint = "array")
    public Object setDependencies(RuntimeEnv env, Object... args) {
        Object dependencies = assignParameter(args, 0, null);
        Object test = null;
        for (ZPair zpairResult266 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("tests").value(), env, true)) {
            test = ZVal.assign(zpairResult266.getValue());
            env.callMethod(test, "setDependencies", DataProviderTestSuite.class, dependencies);
        }

        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\DataProviderTestSuite";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TestSuite.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\DataProviderTestSuite")
                    .setLookup(DataProviderTestSuite.class, java.lang.invoke.MethodHandles.lookup())
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
                    .setFilename("vendor/phpunit/phpunit/src/Framework/DataProviderTestSuite.php")
                    .addInterface("Test")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addExtendsClass("PHPUnit\\Framework\\TestSuite")
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
