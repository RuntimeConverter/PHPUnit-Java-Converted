package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/LogicalAndToken.php

*/

public class LogicalAndToken extends RuntimeClassBase implements TokenInterface {

    public Object tokens = ZVal.newArray();

    public LogicalAndToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogicalAndToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        Object argument = null;
        for (ZPair zpairResult49 : ZVal.getIterable(arguments, env, true)) {
            argument = ZVal.assign(zpairResult49.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            argument,
                            TokenInterface.class,
                            "Prophecy\\Argument\\Token\\TokenInterface"))) {
                argument = new ExactValueToken(env, argument);
            }

            ZVal.addToArray(toObjectR(this).accessProp(this, env).name("tokens").value(), argument);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        Object score = null;
        Object maxScore = null;
        Object token = null;
        if (ZVal.strictEqualityCheck(
                0,
                "===",
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("tokens").value())
                        .value())) {
            return ZVal.assign(false);
        }

        maxScore = 0;
        for (ZPair zpairResult50 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("tokens").value(), env, true)) {
            token = ZVal.assign(zpairResult50.getValue());
            score = env.callMethod(token, "scoreArgument", LogicalAndToken.class, argument);
            if (ZVal.strictEqualityCheck(false, "===", score)) {
                return ZVal.assign(false);
            }

            maxScore = NamespaceGlobal.max.env(env).call(score, maxScore).value();
        }

        return ZVal.assign(maxScore);
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
                                "bool(%s)",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                " AND ",
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("tokens")
                                                        .value())
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\LogicalAndToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\LogicalAndToken")
                    .setLookup(LogicalAndToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("tokens")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/LogicalAndToken.php")
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
