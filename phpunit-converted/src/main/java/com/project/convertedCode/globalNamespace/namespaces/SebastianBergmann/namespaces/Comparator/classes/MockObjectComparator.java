package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ObjectComparator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.MockObject;
import com.project.convertedCode.globalNamespace.classes.PHPUnit_Framework_MockObject_MockObject;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/MockObjectComparator.php

*/

public class MockObjectComparator extends ObjectComparator {

    public MockObjectComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockObjectComparator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object accepts(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        expected,
                                                        PHPUnit_Framework_MockObject_MockObject
                                                                .class,
                                                        "PHPUnit_Framework_MockObject_MockObject"))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        expected,
                                                        MockObject.class,
                                                        "PHPUnit\\Framework\\MockObject\\MockObject")))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        actual,
                                                        PHPUnit_Framework_MockObject_MockObject
                                                                .class,
                                                        "PHPUnit_Framework_MockObject_MockObject"))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        actual,
                                                        MockObject.class,
                                                        "PHPUnit\\Framework\\MockObject\\MockObject"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    protected Object toArray(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        Object array = ZVal.newArray();
        array = super.toArray(env, _object);
        ZVal.unsetArrayElement(array, "__phpunit_invocationMocker");
        return ZVal.assign(array);
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\MockObjectComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ObjectComparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\MockObjectComparator")
                    .setLookup(MockObjectComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/MockObjectComparator.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ObjectComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ArrayComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\Comparator")
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
