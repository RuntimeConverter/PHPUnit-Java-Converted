package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.ClassNotFoundException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/InterfaceNotFoundException.php

*/

public class InterfaceNotFoundException extends ClassNotFoundException {

    public InterfaceNotFoundException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InterfaceNotFoundException.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getInterfaceName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getClassname", InterfaceNotFoundException.class));
    }

    public static final Object CONST_class =
            "Prophecy\\Exception\\Doubler\\InterfaceNotFoundException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends ClassNotFoundException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Doubler\\InterfaceNotFoundException")
                    .setLookup(
                            InterfaceNotFoundException.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("classname")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/InterfaceNotFoundException.php")
                    .addInterface("DoublerException")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("Prophecy\\Exception\\Doubler\\ClassNotFoundException")
                    .addExtendsClass("Prophecy\\Exception\\Doubler\\DoubleException")
                    .addExtendsClass("RuntimeException")
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
