package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeInterfaces.RecursiveIterator;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/TestSuiteIterator.php

*/

public class TestSuiteIterator extends RuntimeClassBase implements RecursiveIterator {

    public Object position = null;

    public Object tests = null;

    public TestSuiteIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestSuiteIterator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testSuite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object testSuite = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("tests")
                .set(env.callMethod(testSuite, "tests", TestSuiteIterator.class));
        return null;
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("position").set(0);
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(
                        toObjectR(this).accessProp(this, env).name("position").value(),
                        '<',
                        CRArrayF.count
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("tests").value())
                                .value()));
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("position").value());
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "valid", TestSuiteIterator.class))
                        ? ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tests").value(),
                                toObjectR(this).accessProp(this, env).name("position").value())
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("position")
                .set(
                        ZVal.increment(
                                toObjectR(this).accessProp(this, env).name("position").value()));
        return null;
    }

    @ConvertedMethod
    public Object getChildren(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PHPUnit
                        .namespaces
                        .Framework
                        .classes
                        .TestSuiteIterator(
                        env,
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tests").value(),
                                toObjectR(this).accessProp(this, env).name("position").value())));
    }

    @ConvertedMethod
    public Object hasChildren(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.checkInstanceType(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tests").value(),
                                toObjectR(this).accessProp(this, env).name("position").value()),
                        TestSuite.class,
                        "PHPUnit\\Framework\\TestSuite"));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\TestSuiteIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\TestSuiteIterator")
                    .setLookup(TestSuiteIterator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("position", "tests")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/TestSuiteIterator.php")
                    .addInterface("RecursiveIterator")
                    .addInterface("Iterator")
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
