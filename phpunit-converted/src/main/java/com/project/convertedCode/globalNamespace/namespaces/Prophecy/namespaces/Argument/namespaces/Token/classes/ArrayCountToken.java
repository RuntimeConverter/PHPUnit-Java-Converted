package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayCountToken.php

*/

public class ArrayCountToken extends RuntimeClassBase implements TokenInterface {

    public Object count = null;

    public ArrayCountToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayCountToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("count").set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this, "isCountable", ArrayCountToken.class, argument))
                                && ZVal.toBool(
                                        env.callMethod(
                                                this,
                                                "hasProperCount",
                                                ArrayCountToken.class,
                                                argument))
                        ? 6
                        : false);
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
                                "count(%s)",
                                toObjectR(this).accessProp(this, env).name("count").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    private Object isCountable(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.toBool(function_is_array.f.env(env).call(argument).value())
                        || ZVal.toBool(
                                ZVal.checkInstanceType(argument, Countable.class, "Countable")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    private Object hasProperCount(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("count").value(),
                        "===",
                        CRArrayF.count.env(env).call(argument).value()));
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ArrayCountToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\ArrayCountToken")
                    .setLookup(ArrayCountToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("count")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayCountToken.php")
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
