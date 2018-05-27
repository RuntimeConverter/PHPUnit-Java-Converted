package com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
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

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/UnexpectedValueException.php

*/

public class UnexpectedValueException
        extends com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException
        implements ExceptionInterface {

    public UnexpectedValueException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnexpectedValueException.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class =
            "Doctrine\\Instantiator\\Exception\\UnexpectedValueException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .spl
                    .exceptions
                    .UnexpectedValueException
                    .RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
        @ConvertedParameter(index = 1, name = "exception", typeHint = "Exception")
        public Object fromSerializationTriggeredException(RuntimeEnv env, Object... args) {
            Object reflectionClass = assignParameter(args, 0, null);
            Object exception = assignParameter(args, 1, null);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Doctrine
                            .namespaces
                            .Instantiator
                            .namespaces
                            .Exception
                            .classes
                            .UnexpectedValueException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "An exception was raised while trying to instantiate an instance of \"%s\" via un-serialization",
                                            env.callMethod(
                                                    reflectionClass,
                                                    "getName",
                                                    UnexpectedValueException.class))
                                    .value(),
                            0,
                            exception));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
        @ConvertedParameter(index = 1, name = "errorString", typeHint = "string")
        @ConvertedParameter(index = 2, name = "errorCode", typeHint = "int")
        @ConvertedParameter(index = 3, name = "errorFile", typeHint = "string")
        @ConvertedParameter(index = 4, name = "errorLine", typeHint = "int")
        public Object fromUncleanUnSerialization(RuntimeEnv env, Object... args) {
            Object reflectionClass = assignParameter(args, 0, null);
            Object errorString = assignParameter(args, 1, null);
            Object errorCode = assignParameter(args, 2, null);
            Object errorFile = assignParameter(args, 3, null);
            Object errorLine = assignParameter(args, 4, null);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Doctrine
                            .namespaces
                            .Instantiator
                            .namespaces
                            .Exception
                            .classes
                            .UnexpectedValueException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Could not produce an instance of \"%s\" via un-serialization, since an error was triggered "
                                                    + "in file \"%s\" at line \"%d\"",
                                            env.callMethod(
                                                    reflectionClass,
                                                    "getName",
                                                    UnexpectedValueException.class),
                                            errorFile,
                                            errorLine)
                                    .value(),
                            0,
                            new PHPException(env, errorString, errorCode)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Doctrine\\Instantiator\\Exception\\UnexpectedValueException")
                    .setLookup(
                            UnexpectedValueException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/UnexpectedValueException.php")
                    .addInterface("ExceptionInterface")
                    .addInterface("Throwable")
                    .addExtendsClass("UnexpectedValueException")
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
