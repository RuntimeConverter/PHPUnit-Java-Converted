package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ExactValueToken;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEveryEntryToken.php

*/

public class ArrayEveryEntryToken extends RuntimeClassBase implements TokenInterface {

    public Object value = null;

    public ArrayEveryEntryToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayEveryEntryToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        value,
                        TokenInterface.class,
                        "Prophecy\\Argument\\Token\\TokenInterface"))) {
            value = new ExactValueToken(env, value);
        }

        toObjectR(this).accessProp(this, env).name("value").set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        Object scores = ZVal.newArray();
        Object argumentEntry = null;
        Object key = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(argument, Traversable.class, "Traversable")))
                && ZVal.toBool(!function_is_array.f.env(env).call(argument).getBool())) {
            return ZVal.assign(false);
        }

        scores = ZVal.newArray();
        for (ZPair zpairResult48 : ZVal.getIterable(argument, env, false)) {
            key = ZVal.assign(zpairResult48.getKey());
            argumentEntry = ZVal.assign(zpairResult48.getValue());
            ZVal.addToArray(
                    scores,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("value").value(),
                            "scoreArgument",
                            ArrayEveryEntryToken.class,
                            argumentEntry));
        }

        if (ZVal.toBool(ZVal.isEmpty(scores))
                || ZVal.toBool(CRArrayF.in_array.env(env).call(false, scores, true).value())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.divide(
                        CRArrayF.array_sum.env(env).call(scores).value(),
                        CRArrayF.count.env(env).call(scores).value()));
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
                                "[%s, ..., %s]",
                                toObjectR(this).accessProp(this, env).name("value").value(),
                                toObjectR(this).accessProp(this, env).name("value").value())
                        .value());
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("value").value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ArrayEveryEntryToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\ArrayEveryEntryToken")
                    .setLookup(ArrayEveryEntryToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEveryEntryToken.php")
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
