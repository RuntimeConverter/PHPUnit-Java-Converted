package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
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

 vendor/phpunit/php-token-stream/src/Token.php

*/

public abstract class PHP_Token extends RuntimeClassBase {

    public Object text = null;

    public Object line = null;

    public Object tokenStream = null;

    public Object id = null;

    public PHP_Token(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    @ConvertedParameter(index = 1, name = "line")
    @ConvertedParameter(index = 2, name = "tokenStream", typeHint = "PHP_Token_Stream")
    @ConvertedParameter(index = 3, name = "id")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, null);
        Object line = assignParameter(args, 1, null);
        Object tokenStream = assignParameter(args, 2, null);
        Object id = assignParameter(args, 3, null);
        toObjectR(this).accessProp(this, env).name("text").set(text);
        toObjectR(this).accessProp(this, env).name("line").set(line);
        toObjectR(this).accessProp(this, env).name("tokenStream").set(tokenStream);
        toObjectR(this).accessProp(this, env).name("id").set(id);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("text").value());
    }

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("line").value());
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value());
    }

    public static final Object CONST_class = "PHP_Token";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token")
                    .setLookup(PHP_Token.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("id", "line", "text", "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
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
