package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NS_SEPARATOR;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_TokenWithScope;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_NAMESPACE extends PHP_TokenWithScope {

    public PHP_Token_NAMESPACE(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_NAMESPACE.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object namespace = null;
        Object i = null;
        Object tokens = ZVal.newArray();
        tokens =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_NAMESPACE.class);
        namespace =
                ZVal.assign(
                        toStringR(
                                ZVal.getElement(
                                        tokens,
                                        ZVal.add(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value(),
                                                2)),
                                env));
        runtimeConverterBreakCount = 0;
        for (i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 3);
                ZVal.isTrue(true);
                i = ZAssignment.add("+=", i, 2)) {
            if (ZVal.toBool(ZVal.isset(ZVal.getElement(tokens, i)))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    ZVal.getElement(tokens, i),
                                    PHP_Token_NS_SEPARATOR.class,
                                    "PHP_Token_NS_SEPARATOR"))) {
                namespace =
                        toStringR(namespace, env)
                                + "\\"
                                + toStringR(ZVal.getElement(tokens, ZVal.add(i, 1)), env);

            } else {
                break;
            }
        }

        return ZVal.assign(namespace);
    }

    public static final Object CONST_class = "PHP_Token_NAMESPACE";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_TokenWithScope.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_NAMESPACE")
                    .setLookup(PHP_Token_NAMESPACE.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("endTokenId", "id", "line", "text", "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
                    .addExtendsClass("PHP_TokenWithScope")
                    .addExtendsClass("PHP_Token")
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
