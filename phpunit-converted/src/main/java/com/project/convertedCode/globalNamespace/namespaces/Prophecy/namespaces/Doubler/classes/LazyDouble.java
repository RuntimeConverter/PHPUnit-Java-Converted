package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.InterfaceNotFoundException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.DoubleException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.ClassNotFoundException;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/LazyDouble.php

*/

public class LazyDouble extends RuntimeClassBase {

    public Object doubler = null;

    public Object _pClass = null;

    public Object interfaces = ZVal.newArray();

    public Object arguments = ZVal.getNull();

    public Object _pDouble = null;

    public LazyDouble(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LazyDouble.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "doubler", typeHint = "Prophecy\\Doubler\\Doubler")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object doubler = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("doubler").set(doubler);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object setParentClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                toObjectR(this).accessProp(this, env).name("double").value())) {
            throw ZVal.getException(
                    env,
                    new DoubleException(
                            env, "Can not extend class with already instantiated double."));
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(_pClass, ReflectionClass.class, "ReflectionClass"))) {
            if (!function_class_exists.f.env(env).call(_pClass).getBool()) {
                throw ZVal.getException(
                        env,
                        new ClassNotFoundException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Class %s not found.", _pClass)
                                        .value(),
                                _pClass));
            }

            _pClass = new ReflectionClass(env, _pClass);
        }

        toObjectR(this).accessProp(this, env).name("class").set(_pClass);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object addInterface(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, null);
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                toObjectR(this).accessProp(this, env).name("double").value())) {
            throw ZVal.getException(
                    env,
                    new DoubleException(
                            env, "Can not implement interface with already instantiated double."));
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(_pInterface, ReflectionClass.class, "ReflectionClass"))) {
            if (!NamespaceGlobal.interface_exists.env(env).call(_pInterface).getBool()) {
                throw ZVal.getException(
                        env,
                        new InterfaceNotFoundException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Interface %s not found.", _pInterface)
                                        .value(),
                                _pInterface));
            }

            _pInterface = new ReflectionClass(env, _pInterface);
        }

        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("interfaces").value(), _pInterface);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "arguments",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("arguments").set(arguments);
        return null;
    }

    @ConvertedMethod
    public Object getInstance(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                toObjectR(this).accessProp(this, env).name("double").value())) {
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    toObjectR(this).accessProp(this, env).name("arguments").value())) {
                return ZVal.assign(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("double")
                                .set(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("doubler")
                                                        .value(),
                                                "double",
                                                LazyDouble.class,
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("class")
                                                        .value(),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("interfaces")
                                                        .value(),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("arguments")
                                                        .value())));
            }

            toObjectR(this)
                    .accessProp(this, env)
                    .name("double")
                    .set(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("doubler").value(),
                                    "double",
                                    LazyDouble.class,
                                    toObjectR(this).accessProp(this, env).name("class").value(),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("interfaces")
                                            .value()));
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("double").value());
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\LazyDouble";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\LazyDouble")
                    .setLookup(LazyDouble.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("arguments", "class", "double", "doubler", "interfaces")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Doubler/LazyDouble.php")
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
