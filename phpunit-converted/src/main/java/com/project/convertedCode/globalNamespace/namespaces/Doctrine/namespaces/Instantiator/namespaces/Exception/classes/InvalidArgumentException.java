package com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/InvalidArgumentException.php

*/

public class InvalidArgumentException
        extends com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException
        implements ExceptionInterface {

    public InvalidArgumentException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvalidArgumentException.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class =
            "Doctrine\\Instantiator\\Exception\\InvalidArgumentException";

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
                    .InvalidArgumentException
                    .RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        public Object fromNonExistingClass(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            if (NamespaceGlobal.interface_exists.env(env).call(className).getBool()) {
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
                                .InvalidArgumentException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "The provided type \"%s\" is an interface, and can not be instantiated",
                                                className)
                                        .value()));
            }

            if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(70116, ">=", 50400))
                    && ZVal.toBool(NamespaceGlobal.trait_exists.env(env).call(className).value())) {
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
                                .InvalidArgumentException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "The provided type \"%s\" is a trait, and can not be instantiated",
                                                className)
                                        .value()));
            }

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
                            .InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("The provided class \"%s\" does not exist", className)
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
        public Object fromAbstractClass(RuntimeEnv env, Object... args) {
            Object reflectionClass = assignParameter(args, 0, null);
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
                            .InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "The provided class \"%s\" is abstract, and can not be instantiated",
                                            env.callMethod(
                                                    reflectionClass,
                                                    "getName",
                                                    InvalidArgumentException.class))
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Doctrine\\Instantiator\\Exception\\InvalidArgumentException")
                    .setLookup(
                            InvalidArgumentException.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/InvalidArgumentException.php")
                    .addInterface("ExceptionInterface")
                    .addInterface("Throwable")
                    .addExtendsClass("InvalidArgumentException")
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
