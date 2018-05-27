package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ObjectComparator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/ExceptionComparator.php

*/

public class ExceptionComparator extends ObjectComparator {

    public ExceptionComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionComparator.class) {
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
                ZVal.toBool(ZVal.checkInstanceType(expected, PHPException.class, "Exception"))
                        && ZVal.toBool(
                                ZVal.checkInstanceType(actual, PHPException.class, "Exception")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    protected Object toArray(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        Object array = ZVal.newArray();
        array = super.toArray(env, _object);
        ZVal.unsetArrayElement(array, "file");
        ZVal.unsetArrayElement(array, "line");
        ZVal.unsetArrayElement(array, "trace");
        ZVal.unsetArrayElement(array, "string");
        ZVal.unsetArrayElement(array, "xdebug_message");
        return ZVal.assign(array);
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\ExceptionComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ObjectComparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\ExceptionComparator")
                    .setLookup(ExceptionComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/ExceptionComparator.php")
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
