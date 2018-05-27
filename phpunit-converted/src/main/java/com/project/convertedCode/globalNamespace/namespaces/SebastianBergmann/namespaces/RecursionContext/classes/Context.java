package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/recursion-context/src/Context.php

*/

public final class Context extends RuntimeClassBase {

    public Object arrays = null;

    public Object objects = null;

    public Context(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Context.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("arrays").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("objects").set(new SplObjectStorage(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object add(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer value = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, value),
                            "addArray",
                            Context.class,
                            value.getObject()));

        } else if (function_is_object.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(env.callMethod(this, "addObject", Context.class, value.getObject()));
        }

        throw ZVal.getException(
                env, new InvalidArgumentException(env, "Only arrays and objects are supported"));
    }

    public Object add(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object contains(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer value = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, value),
                            "containsArray",
                            Context.class,
                            value.getObject()));

        } else if (function_is_object.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(
                    env.callMethod(this, "containsObject", Context.class, value.getObject()));
        }

        throw ZVal.getException(
                env, new InvalidArgumentException(env, "Only arrays and objects are supported"));
    }

    public Object contains(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    private Object addArray(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer array = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(array)) {
            array.setObject(ZVal.newArray());
        }
        Object key = null;
        key =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, array),
                        "containsArray",
                        Context.class,
                        array.getObject());
        if (ZVal.strictNotEqualityCheck(key, "!==", false)) {
            return ZVal.assign(key);
        }

        key =
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("arrays").value())
                        .value();
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("arrays").value(), array.getObject());
        if (ZVal.toBool(!ZVal.isset(ZVal.getElement(array.getObject(), 9223372036854775807L)))
                && ZVal.toBool(
                        !ZVal.isset(
                                ZVal.getElement(
                                        array.getObject(),
                                        ZVal.subtract(9223372036854775807L, 1))))) {
            ZVal.addToArray(array.getObject(), key);
            ZVal.addToArray(
                    array.getObject(),
                    toObjectR(this).accessProp(this, env).name("objects").value());

        } else {
            do {
                key =
                        NamespaceGlobal.random_int
                                .env(env)
                                .call(-9223372036854775808L, 9223372036854775807L)
                                .value();

            } while (ZVal.isset(ZVal.getElement(array.getObject(), key)));

            ZVal.putArrayElement(array.getObject(), key, key);
            do {
                key =
                        NamespaceGlobal.random_int
                                .env(env)
                                .call(-9223372036854775808L, 9223372036854775807L)
                                .value();

            } while (ZVal.isset(ZVal.getElement(array.getObject(), key)));

            ZVal.putArrayElement(
                    array.getObject(),
                    key,
                    toObjectR(this).accessProp(this, env).name("objects").value());
        }

        return ZVal.assign(key);
    }

    public Object addArray(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    private Object addObject(RuntimeEnv env, Object... args) {
        ReferenceContainer _object = new BasicReferenceContainer(assignParameter(args, 0, null));
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("objects").value(),
                        new RuntimeArgsWithReferences().add(0, _object),
                        "contains",
                        Context.class,
                        _object.getObject()))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("objects").value(),
                    "attach",
                    Context.class,
                    _object.getObject());
        }

        return ZVal.assign(
                NamespaceGlobal.spl_object_hash.env(env).call(_object.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    private Object containsArray(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer array = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        Object end = ZVal.newArray();
        end = CRArrayF.array_slice.env(env).call(array.getObject(), -2).value();
        return ZVal.assign(
                ZVal.toBool(ZVal.isset(ZVal.getElement(end, 1)))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                ZVal.getElement(end, 1),
                                                "===",
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("objects")
                                                        .value()))
                        ? ZVal.getElement(end, 0)
                        : false);
    }

    public Object containsArray(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object containsObject(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, null));
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("objects").value(),
                        new RuntimeArgsWithReferences().add(0, value),
                        "contains",
                        Context.class,
                        value.getObject()))) {
            return ZVal.assign(
                    NamespaceGlobal.spl_object_hash.env(env).call(value.getObject()).value());
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        ReferenceContainer array = new BasicReferenceContainer(null);
        for (ZPair zpairResult486 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("arrays").value(), env, true)) {
            array = zpairResult486;
            if (function_is_array.f.env(env).call(array.getObject()).getBool()) {
                CRArrayF.array_pop.env(env).call(array.getObject());
                CRArrayF.array_pop.env(env).call(array.getObject());
            }
        }

        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\RecursionContext\\Context";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\RecursionContext\\Context")
                    .setLookup(Context.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("arrays", "objects")
                    .setFilename("vendor/sebastian/recursion-context/src/Context.php")
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
