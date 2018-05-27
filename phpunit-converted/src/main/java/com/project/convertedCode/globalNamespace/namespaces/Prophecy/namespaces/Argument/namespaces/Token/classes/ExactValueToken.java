package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Comparator.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ExactValueToken.php

*/

public class ExactValueToken extends RuntimeClassBase implements TokenInterface {

    public Object value = null;

    public Object string = null;

    public Object util = null;

    public Object comparatorFactory = null;

    public ExactValueToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExactValueToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "util",
        typeHint = "Prophecy\\Util\\StringUtil",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "comparatorFactory",
        typeHint = "Prophecy\\Comparator\\Factory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object util = assignParameter(args, 1, null);
        if (ZVal.isNull(util)) {
            util = ZVal.getNull();
        }
        Object comparatorFactory = assignParameter(args, 2, null);
        if (ZVal.isNull(comparatorFactory)) {
            comparatorFactory = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("value").set(value);
        toObjectR(this)
                .accessProp(this, env)
                .name("util")
                .set(ZVal.isTrue(util) ? util : new StringUtil(env));
        toObjectR(this)
                .accessProp(this, env)
                .name("comparatorFactory")
                .set(
                        ZVal.isTrue(comparatorFactory)
                                ? comparatorFactory
                                : Factory.runtimeStaticObject.getInstance(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        Object comparator = null;
        Object failure = null;
        if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                && ZVal.toBool(
                        function_is_object
                                .f
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("value").value())
                                .value())) {
            comparator =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("comparatorFactory").value(),
                            "getComparatorFor",
                            ExactValueToken.class,
                            argument,
                            toObjectR(this).accessProp(this, env).name("value").value());
            try {
                env.callMethod(
                        comparator,
                        new RuntimeArgsWithReferences(),
                        "assertEquals",
                        ExactValueToken.class,
                        argument,
                        toObjectR(this).accessProp(this, env).name("value").value());
                return 10;
            } catch (ConvertedException convertedException8) {
                if (convertedException8.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    failure = convertedException8.getObject();
                } else {
                    throw convertedException8;
                }
            }
        }

        if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                ^ ZVal.toBool(
                        function_is_object
                                .f
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("value").value())
                                .value())) {
            if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                    && ZVal.toBool(
                            !function_method_exists
                                    .f
                                    .env(env)
                                    .call(argument, "__toString")
                                    .getBool())) {
                return ZVal.assign(false);
            }

            if (ZVal.toBool(
                            function_is_object
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("value")
                                                    .value())
                                    .value())
                    && ZVal.toBool(
                            !function_method_exists
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("value")
                                                    .value(),
                                            "__toString")
                                    .getBool())) {
                return ZVal.assign(false);
            }

        } else if (ZVal.toBool(function_is_numeric.f.env(env).call(argument).value())
                && ZVal.toBool(
                        function_is_numeric
                                .f
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("value").value())
                                .value())) {

        } else if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.gettype.env(env).call(argument).value(),
                "!==",
                NamespaceGlobal.gettype
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("value").value())
                        .value())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.equalityCheck(
                                argument,
                                toObjectR(this).accessProp(this, env).name("value").value())
                        ? 10
                        : false);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("value").value());
    }

    @ConvertedMethod
    public Object isLast(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
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
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "exact(%s)",
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("util")
                                                            .value(),
                                                    "stringify",
                                                    ExactValueToken.class,
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("value")
                                                            .value()))
                                    .value());
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("string").value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ExactValueToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\ExactValueToken")
                    .setLookup(ExactValueToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("comparatorFactory", "string", "util", "value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ExactValueToken.php")
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
