package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ExactValueToken;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEntryToken.php

*/

public class ArrayEntryToken extends RuntimeClassBase implements TokenInterface {

    public Object key = null;

    public Object value = null;

    public ArrayEntryToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayEntryToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, null);
        Object value = assignParameter(args, 1, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("key")
                .set(env.callMethod(this, "wrapIntoExactValueToken", ArrayEntryToken.class, key));
        toObjectR(this)
                .accessProp(this, env)
                .name("value")
                .set(env.callMethod(this, "wrapIntoExactValueToken", ArrayEntryToken.class, value));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        Object valueScores = null;
        Object scoreEntry = null;
        Object keyScores = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(argument, Traversable.class, "Traversable"))) {
            argument = NamespaceGlobal.iterator_to_array.env(env).call(argument).value();
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(argument, ArrayAccess.class, "ArrayAccess"))) {
            argument =
                    env.callMethod(
                            this, "convertArrayAccessToEntry", ArrayEntryToken.class, argument);
        }

        if (ZVal.toBool(!function_is_array.f.env(env).call(argument).getBool())
                || ZVal.toBool(ZVal.isEmpty(argument))) {
            return ZVal.assign(false);
        }

        keyScores =
                CRArrayF.array_map
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("key")
                                                        .value()),
                                        new ZPair(1, "scoreArgument")),
                                CRArrayF.array_keys.env(env).call(argument).value())
                        .value();
        valueScores =
                CRArrayF.array_map
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value()),
                                        new ZPair(1, "scoreArgument")),
                                argument)
                        .value();
        scoreEntry =
                new Closure(env) {
                    @Override
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object value = assignParameter(args, 0, null);
                        Object key = assignParameter(args, 1, null);
                        return ZVal.assign(
                                ZVal.toBool(value) && ZVal.toBool(key)
                                        ? NamespaceGlobal.min
                                                .env(env)
                                                .call(8, ZVal.divide(ZVal.add(key, value), 2))
                                                .value()
                                        : false);
                    }
                };
        return ZVal.assign(
                NamespaceGlobal.max
                        .env(env)
                        .call(
                                CRArrayF.array_map
                                        .env(env)
                                        .call(scoreEntry, valueScores, keyScores)
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object isLast(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "[..., %s => %s, ...]",
                                toObjectR(this).accessProp(this, env).name("key").value(),
                                toObjectR(this).accessProp(this, env).name("value").value())
                        .value());
    }

    @ConvertedMethod
    public Object getKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("key").value());
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("value").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object wrapIntoExactValueToken(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        value,
                                        TokenInterface.class,
                                        "Prophecy\\Argument\\Token\\TokenInterface"))
                        ? value
                        : new ExactValueToken(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object", typeHint = "ArrayAccess")
    private Object convertArrayAccessToEntry(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        if (ZVal.isNull(_object)) {
            _object = ZVal.newArray();
        }
        Object key = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(this).accessProp(this, env).name("key").value(),
                        ExactValueToken.class,
                        "Prophecy\\Argument\\Token\\ExactValueToken"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "You can only use exact value tokens to match key of ArrayAccess object"
                                                    + toStringR("\n", env)
                                                    + "But you used `%s`.",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("key")
                                                    .value())
                                    .value()));
        }

        key =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("key").value(),
                        "getValue",
                        ArrayEntryToken.class);
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(_object, "offsetExists", ArrayEntryToken.class, key))
                        ? ZVal.newArray(new ZPair(key, ZVal.getElement(_object, key)))
                        : ZVal.newArray());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ArrayEntryToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\ArrayEntryToken")
                    .setLookup(ArrayEntryToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("key", "value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEntryToken.php")
                    .addInterface("TokenInterface")
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
