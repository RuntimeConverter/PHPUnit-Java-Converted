package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
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
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/ArgumentsWildcard.php

*/

public class ArgumentsWildcard extends RuntimeClassBase {

    public Object tokens = ZVal.newArray();

    public Object string = null;

    public ArgumentsWildcard(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgumentsWildcard.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        Object argument = null;
        for (ZPair zpairResult46 : ZVal.getIterable(arguments, env, true)) {
            argument = ZVal.assign(zpairResult46.getValue());
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
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    public Object scoreArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object score = null;
        Object argument = null;
        Object i = null;
        Object totalScore = null;
        Object token = null;
        if (ZVal.toBool(ZVal.equalityCheck(0, CRArrayF.count.env(env).call(arguments).value()))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                0,
                                CRArrayF.count
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("tokens")
                                                        .value())
                                        .value()))) {
            return 1;
        }

        arguments = CRArrayF.array_values.env(env).call(arguments).value();
        totalScore = 0;
        for (ZPair zpairResult47 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("tokens").value(), env, false)) {
            i = ZVal.assign(zpairResult47.getKey());
            token = ZVal.assign(zpairResult47.getValue());
            argument =
                    ZVal.assign(
                            ZVal.isset(ZVal.getElement(arguments, i))
                                    ? ZVal.getElement(arguments, i)
                                    : ZVal.getNull());
            if (ZVal.isGreaterThanOrEqualTo(
                    1,
                    ">=",
                    score =
                            env.callMethod(
                                    token, "scoreArgument", ArgumentsWildcard.class, argument))) {
                return ZVal.assign(false);
            }

            totalScore = ZAssignment.add("+=", totalScore, score);
            if (ZVal.strictEqualityCheck(
                    true, "===", env.callMethod(token, "isLast", ArgumentsWildcard.class))) {
                return ZVal.assign(totalScore);
            }
        }

        if (ZVal.isGreaterThan(
                CRArrayF.count.env(env).call(arguments).value(),
                '>',
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("tokens").value())
                        .value())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(totalScore);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                toObjectR(this).accessProp(this, env).name("string").value())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("string")
                    .set(
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call(
                                            ", ",
                                            CRArrayF.array_map
                                                    .env(env)
                                                    .call(
                                                            new Closure(env) {
                                                                @Override
                                                                public Object run(
                                                                        RuntimeEnv env,
                                                                        Object thisvar,
                                                                        PassByReferenceArgs
                                                                                runtimePassByReferenceArgs,
                                                                        Object... args) {
                                                                    Object token =
                                                                            assignParameter(
                                                                                    args, 0, null);
                                                                    return ZVal.assign(
                                                                            toStringR(token, env));
                                                                }
                                                            },
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("tokens")
                                                                    .value())
                                                    .value())
                                    .value());
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("string").value());
    }

    @ConvertedMethod
    public Object getTokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("tokens").value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\ArgumentsWildcard";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\ArgumentsWildcard")
                    .setLookup(ArgumentsWildcard.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("string", "tokens")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/ArgumentsWildcard.php")
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
