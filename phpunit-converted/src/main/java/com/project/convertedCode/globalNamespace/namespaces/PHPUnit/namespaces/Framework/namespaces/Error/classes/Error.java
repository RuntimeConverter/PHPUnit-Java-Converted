package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Error/Error.php

*/

public class Error extends Exception {

    public Error(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Error.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(index = 1, name = "code", typeHint = "int")
    @ConvertedParameter(index = 2, name = "file", typeHint = "string")
    @ConvertedParameter(index = 3, name = "line", typeHint = "int")
    @ConvertedParameter(
        index = 4,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        Object code = assignParameter(args, 1, null);
        Object file = assignParameter(args, 2, null);
        Object line = assignParameter(args, 3, null);
        Object previous = assignParameter(args, 4, null);
        if (ZVal.isNull(previous)) {
            previous = ZVal.getNull();
        }
        super.__construct(env, message, code, previous);
        toObjectR(this).accessProp(this, env).name("file").set(file);
        toObjectR(this).accessProp(this, env).name("line").set(line);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Error\\Error";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Exception.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Error\\Error")
                    .setLookup(Error.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("serializableTrace")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Error/Error.php")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("PHPUnit\\Framework\\Exception")
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
