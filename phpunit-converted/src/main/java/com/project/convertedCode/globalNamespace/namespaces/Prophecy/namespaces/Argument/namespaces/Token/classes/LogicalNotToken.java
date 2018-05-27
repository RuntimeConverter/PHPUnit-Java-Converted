package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ExactValueToken;
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

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/LogicalNotToken.php

*/

public class LogicalNotToken extends RuntimeClassBase implements TokenInterface {

    public Object token = null;

    public LogicalNotToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogicalNotToken.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("token")
                .set(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                value,
                                                TokenInterface.class,
                                                "Prophecy\\Argument\\Token\\TokenInterface"))
                                ? value
                                : new ExactValueToken(env, value));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                false,
                                "===",
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("token").value(),
                                        "scoreArgument",
                                        LogicalNotToken.class,
                                        argument))
                        ? 4
                        : false);
    }

    @ConvertedMethod
    public Object isLast(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("token").value(),
                        "isLast",
                        LogicalNotToken.class));
    }

    @ConvertedMethod
    public Object getOriginatingToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("token").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "not(%s)",
                                toObjectR(this).accessProp(this, env).name("token").value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\LogicalNotToken";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument\\Token\\LogicalNotToken")
                    .setLookup(LogicalNotToken.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("token")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/LogicalNotToken.php")
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
