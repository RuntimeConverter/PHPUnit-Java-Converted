package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ApproximateValueToken.php

*/

public class ApproximateValueToken extends RuntimeClassBase implements TokenInterface {

    public Object value = null;

    public Object precision = null;

    public ApproximateValueToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ApproximateValueToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object precision = assignParameter(args, 1, null);
        if (ZVal.isNull(precision)) {
            precision = 0;
        }
        toObjectR(this).accessProp(this, env).name("value").set(value);
        toObjectR(this).accessProp(this, env).name("precision").set(precision);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                NamespaceGlobal.round
                                        .env(env)
                                        .call(
                                                argument,
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("precision")
                                                        .value())
                                        .value(),
                                "===",
                                NamespaceGlobal.round
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("precision")
                                                        .value())
                                        .value())
                        ? 10
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
                                "\u2245%s",
                                NamespaceGlobal.round
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("precision")
                                                        .value())
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ApproximateValueToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\ApproximateValueToken")
                    .setLookup(ApproximateValueToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("precision", "value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ApproximateValueToken.php")
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
