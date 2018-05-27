package com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.other.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.modules.standard.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes.InstantiatorInterface;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes.UnexpectedValueException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/Instantiator.php

*/

public final class Instantiator extends RuntimeClassBase implements InstantiatorInterface {

    public Instantiator(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object instantiate(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object factory = null;
        if (ZVal.isset(
                ZVal.getElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Doctrine
                                                .namespaces
                                                .Instantiator
                                                .classes
                                                .Instantiator
                                                .RequestStaticProperties
                                                .class)
                                .cachedCloneables,
                        className))) {
            return ZVal.assign(
                    ((RuntimeClassInterface)
                                    ZVal.getElement(
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Doctrine
                                                                    .namespaces
                                                                    .Instantiator
                                                                    .classes
                                                                    .Instantiator
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .cachedCloneables,
                                            className))
                            .phpClone());
        }

        if (ZVal.isset(
                ZVal.getElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Doctrine
                                                .namespaces
                                                .Instantiator
                                                .classes
                                                .Instantiator
                                                .RequestStaticProperties
                                                .class)
                                .cachedInstantiators,
                        className))) {
            factory =
                    ZVal.assign(
                            ZVal.getElement(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Doctrine
                                                            .namespaces
                                                            .Instantiator
                                                            .classes
                                                            .Instantiator
                                                            .RequestStaticProperties
                                                            .class)
                                            .cachedInstantiators,
                                    className));
            return ZVal.assign(
                    env.callFunctionDynamic(factory, new RuntimeArgsWithReferences()).value());
        }

        return ZVal.assign(
                env.callMethod(this, "buildAndCacheFromFactory", Instantiator.class, className));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    private Object buildAndCacheFromFactory(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object factory = null;
        Object instance = null;
        factory =
                ZVal.assign(
                        ZVal.putArrayElement(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Doctrine
                                                        .namespaces
                                                        .Instantiator
                                                        .classes
                                                        .Instantiator
                                                        .RequestStaticProperties
                                                        .class)
                                        .cachedInstantiators,
                                className,
                                env.callMethod(
                                        this, "buildFactory", Instantiator.class, className)));
        instance = env.callFunctionDynamic(factory, new RuntimeArgsWithReferences()).value();
        if (ZVal.isTrue(
                env.callMethod(
                        this,
                        "isSafeToClone",
                        Instantiator.class,
                        new ReflectionClass(env, instance)))) {
            ZVal.putArrayElement(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Doctrine
                                            .namespaces
                                            .Instantiator
                                            .classes
                                            .Instantiator
                                            .RequestStaticProperties
                                            .class)
                            .cachedCloneables,
                    className,
                    ((RuntimeClassInterface) instance).phpClone());
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    private Object buildFactory(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object serializedString = null;
        Object reflectionClass = null;
        reflectionClass = env.callMethod(this, "getReflectionClass", Instantiator.class, className);
        if (ZVal.isTrue(
                env.callMethod(
                        this,
                        "isInstantiableViaReflection",
                        Instantiator.class,
                        reflectionClass))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, reflectionClass),
                            new ZPair(1, "newInstanceWithoutConstructor")));
        }

        serializedString =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s:%d:\"%s\":0:{}",
                                CONST_SERIALIZATION_FORMAT_AVOID_UNSERIALIZER,
                                NamespaceGlobal.strlen.env(env).call(className).value(),
                                className)
                        .value();
        env.callMethod(
                this,
                "checkIfUnSerializationIsSupported",
                Instantiator.class,
                reflectionClass,
                serializedString);
        return ZVal.assign(
                new Closure(env) {
                    @Override
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object serializedString = null;
                        serializedString =
                                this.contextReferences.getCapturedValue("serializedString");
                        return ZVal.assign(
                                function_unserialize.f.env(env).call(serializedString).value());
                    }
                }.use("serializedString", serializedString));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    private Object getReflectionClass(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object reflection = null;
        if (!function_class_exists.f.env(env).call(className).getBool()) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentException.runtimeStaticObject.fromNonExistingClass(
                            env, className));
        }

        reflection = new ReflectionClass(env, className);
        if (ZVal.isTrue(env.callMethod(reflection, "isAbstract", Instantiator.class))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentException.runtimeStaticObject.fromAbstractClass(
                            env, reflection));
        }

        return ZVal.assign(reflection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "serializedString")
    private Object checkIfUnSerializationIsSupported(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, null);
        Object serializedString = assignParameter(args, 1, null);
        ReferenceContainer error = new BasicReferenceContainer(null);
        function_set_error_handler
                .f
                .env(env)
                .call(
                        new Closure(env) {
                            @Override
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object code = assignParameter(args, 0, null);
                                Object message = assignParameter(args, 1, null);
                                Object file = assignParameter(args, 2, null);
                                Object line = assignParameter(args, 3, null);
                                Object reflectionClass = null;
                                ReferenceContainer error = new BasicReferenceContainer(null);
                                error = this.contextReferences.getReferenceContainer("error");
                                reflectionClass =
                                        this.contextReferences.getCapturedValue("reflectionClass");
                                error.setObject(
                                        UnexpectedValueException.runtimeStaticObject
                                                .fromUncleanUnSerialization(
                                                        env,
                                                        reflectionClass,
                                                        message,
                                                        code,
                                                        file,
                                                        line));
                                return null;
                            }
                        }.useRef("error", error).use("reflectionClass", reflectionClass));
        env.callMethod(
                this,
                "attemptInstantiationViaUnSerialization",
                Instantiator.class,
                reflectionClass,
                serializedString);
        NamespaceGlobal.restore_error_handler.env(env).call();
        if (ZVal.isTrue(error.getObject())) {
            throw ZVal.getException(env, error.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "serializedString")
    private Object attemptInstantiationViaUnSerialization(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, null);
        Object serializedString = assignParameter(args, 1, null);
        Object exception = null;
        try {
            function_unserialize.f.env(env).call(serializedString);
        } catch (ConvertedException convertedException1) {
            if (convertedException1.instanceOf(PHPException.class, "Exception")) {
                exception = convertedException1.getObject();
                NamespaceGlobal.restore_error_handler.env(env).call();
                throw ZVal.getException(
                        env,
                        UnexpectedValueException.runtimeStaticObject
                                .fromSerializationTriggeredException(
                                        env, reflectionClass, exception));
            } else {
                throw convertedException1;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    private Object isInstantiableViaReflection(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, null);
        return ZVal.assign(
                !ZVal.toBool(
                                env.callMethod(
                                        this,
                                        "hasInternalAncestors",
                                        Instantiator.class,
                                        reflectionClass))
                        && ZVal.toBool(
                                env.callMethod(reflectionClass, "isFinal", Instantiator.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    private Object hasInternalAncestors(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, null);
        do {
            if (ZVal.isTrue(env.callMethod(reflectionClass, "isInternal", Instantiator.class))) {
                return ZVal.assign(true);
            }

        } while (ZVal.isTrue(
                reflectionClass =
                        env.callMethod(reflectionClass, "getParentClass", Instantiator.class)));

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflection", typeHint = "ReflectionClass")
    private Object isSafeToClone(RuntimeEnv env, Object... args) {
        Object reflection = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.toBool(env.callMethod(reflection, "isCloneable", Instantiator.class))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                reflection,
                                                "hasMethod",
                                                Instantiator.class,
                                                "__clone"))));
    }

    public static final Object CONST_SERIALIZATION_FORMAT_USE_UNSERIALIZER = "C";

    public static final Object CONST_SERIALIZATION_FORMAT_AVOID_UNSERIALIZER = "O";

    public static final Object CONST_class = "Doctrine\\Instantiator\\Instantiator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cachedInstantiators = ZVal.newArray();

        public Object cachedCloneables = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Doctrine\\Instantiator\\Instantiator")
                    .setLookup(Instantiator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/doctrine/instantiator/src/Doctrine/Instantiator/Instantiator.php")
                    .addInterface("InstantiatorInterface")
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
