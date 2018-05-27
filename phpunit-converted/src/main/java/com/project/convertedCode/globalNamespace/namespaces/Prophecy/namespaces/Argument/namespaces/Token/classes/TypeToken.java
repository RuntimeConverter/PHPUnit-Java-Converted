package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/TypeToken.php

*/

public class TypeToken extends RuntimeClassBase implements TokenInterface {

    public Object type = null;

    public TypeToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TypeToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object checker = null;
        checker = ZVal.assign("is_" + toStringR(type, env));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        !NamespaceGlobal.function_exists
                                                .env(env)
                                                .call(checker)
                                                .getBool())
                                && ZVal.toBool(
                                        !NamespaceGlobal.interface_exists
                                                .env(env)
                                                .call(type)
                                                .getBool()))
                && ZVal.toBool(!function_class_exists.f.env(env).call(type).getBool())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Type or class name expected as an argument to TypeToken, but got %s.",
                                            type)
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("type").set(type);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        Object checker = null;
        checker =
                ZVal.assign(
                        "is_"
                                + toStringR(
                                        toObjectR(this).accessProp(this, env).name("type").value(),
                                        env));
        if (NamespaceGlobal.function_exists.env(env).call(checker).getBool()) {
            return ZVal.assign(
                    function_call_user_func.f.env(env).call(checker, argument).getBool()
                            ? 5
                            : false);
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceTypeMatch(
                                        argument,
                                        toObjectR(this).accessProp(this, env).name("type").value()))
                        ? 5
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
                                "type(%s)",
                                toObjectR(this).accessProp(this, env).name("type").value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\TypeToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\TypeToken")
                    .setLookup(TypeToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("type")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/TypeToken.php")
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
