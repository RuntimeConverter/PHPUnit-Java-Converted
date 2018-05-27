package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/IdenticalValueToken.php

*/

public class IdenticalValueToken extends RuntimeClassBase implements TokenInterface {

    public Object value = null;

    public Object string = null;

    public Object util = null;

    public IdenticalValueToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IdenticalValueToken.class) {
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
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object util = assignParameter(args, 1, null);
        if (ZVal.isNull(util)) {
            util = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("value").set(value);
        toObjectR(this)
                .accessProp(this, env)
                .name("util")
                .set(ZVal.isTrue(util) ? util : new StringUtil(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                argument,
                                "===",
                                toObjectR(this).accessProp(this, env).name("value").value())
                        ? 11
                        : false);
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
                                            "identical(%s)",
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("util")
                                                            .value(),
                                                    "stringify",
                                                    IdenticalValueToken.class,
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("value")
                                                            .value()))
                                    .value());
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("string").value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\IdenticalValueToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\IdenticalValueToken")
                    .setLookup(IdenticalValueToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("string", "util", "value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/IdenticalValueToken.php")
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
