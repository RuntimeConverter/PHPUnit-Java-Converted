package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.DoubleException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/ClassNotFoundException.php

*/

public class ClassNotFoundException extends DoubleException {

    public Object classname = null;

    public ClassNotFoundException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassNotFoundException.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "classname")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        Object classname = assignParameter(args, 1, null);
        super.__construct(env, message);
        toObjectR(this).accessProp(this, env).name("classname").set(classname);
        return null;
    }

    @ConvertedMethod
    public Object getClassname(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("classname").value());
    }

    public static final Object CONST_class = "Prophecy\\Exception\\Doubler\\ClassNotFoundException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DoubleException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Doubler\\ClassNotFoundException")
                    .setLookup(
                            ClassNotFoundException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("classname")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/ClassNotFoundException.php")
                    .addInterface("DoublerException")
                    .addInterface("Exception")
                    .addInterface("Throwable")
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
