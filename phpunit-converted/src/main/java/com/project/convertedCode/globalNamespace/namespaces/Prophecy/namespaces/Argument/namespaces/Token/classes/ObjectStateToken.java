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
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func;
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

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ObjectStateToken.php

*/

public class ObjectStateToken extends RuntimeClassBase implements TokenInterface {

    public Object name = null;

    public Object value = null;

    public Object util = null;

    public Object comparatorFactory = null;

    public ObjectStateToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ObjectStateToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "util",
        typeHint = "Prophecy\\Util\\StringUtil",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "comparatorFactory",
        typeHint = "Prophecy\\Comparator\\Factory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        Object value = assignParameter(args, 1, null);
        Object util = assignParameter(args, 2, null);
        if (ZVal.isNull(util)) {
            util = ZVal.getNull();
        }
        Object comparatorFactory = assignParameter(args, 3, null);
        if (ZVal.isNull(comparatorFactory)) {
            comparatorFactory = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("name").set(methodName);
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
        Object actual = null;
        Object comparator = null;
        Object failure = null;
        if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                && ZVal.toBool(
                        function_method_exists
                                .f
                                .env(env)
                                .call(
                                        argument,
                                        toObjectR(this).accessProp(this, env).name("name").value())
                                .value())) {
            actual =
                    function_call_user_func
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, argument),
                                            new ZPair(
                                                    1,
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())))
                            .value();
            comparator =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("comparatorFactory").value(),
                            "getComparatorFor",
                            ObjectStateToken.class,
                            toObjectR(this).accessProp(this, env).name("value").value(),
                            actual);
            try {
                env.callMethod(
                        comparator,
                        new RuntimeArgsWithReferences(),
                        "assertEquals",
                        ObjectStateToken.class,
                        toObjectR(this).accessProp(this, env).name("value").value(),
                        actual);
                return 8;
            } catch (ConvertedException convertedException9) {
                if (convertedException9.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    failure = convertedException9.getObject();
                    return ZVal.assign(false);
                } else {
                    throw convertedException9;
                }
            }
        }

        if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                && ZVal.toBool(
                        NamespaceGlobal.property_exists
                                .env(env)
                                .call(
                                        argument,
                                        toObjectR(this).accessProp(this, env).name("name").value())
                                .value())) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                                    toObjectR(argument)
                                            .accessProp(this, env)
                                            .name(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())
                                            .value(),
                                    "===",
                                    toObjectR(this).accessProp(this, env).name("value").value())
                            ? 8
                            : false);
        }

        return ZVal.assign(false);
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
                                "state(%s(), %s)",
                                toObjectR(this).accessProp(this, env).name("name").value(),
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("util").value(),
                                        "stringify",
                                        ObjectStateToken.class,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()))
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ObjectStateToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\ObjectStateToken")
                    .setLookup(ObjectStateToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("comparatorFactory", "name", "util", "value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ObjectStateToken.php")
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
