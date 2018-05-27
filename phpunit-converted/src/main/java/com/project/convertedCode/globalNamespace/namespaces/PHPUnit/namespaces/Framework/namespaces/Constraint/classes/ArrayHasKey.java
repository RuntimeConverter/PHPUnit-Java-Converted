package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/ArrayHasKey.php

*/

public class ArrayHasKey extends Constraint {

    public Object key = null;

    public ArrayHasKey(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayHasKey.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("key").set(key);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "has the key "
                        + toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        ArrayHasKey.class,
                                        toObjectR(this).accessProp(this, env).name("key").value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        if (function_is_array.f.env(env).call(other).getBool()) {
            return ZVal.assign(
                    CRArrayF.array_key_exists
                            .env(env)
                            .call(toObjectR(this).accessProp(this, env).name("key").value(), other)
                            .value());
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(other, ArrayAccess.class, "ArrayAccess"))) {
            return ZVal.assign(
                    env.callMethod(
                            other,
                            "offsetExists",
                            ArrayHasKey.class,
                            toObjectR(this).accessProp(this, env).name("key").value()));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                "an array " + toStringR(env.callMethod(this, "toString", ArrayHasKey.class), env));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\ArrayHasKey";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\ArrayHasKey")
                    .setLookup(ArrayHasKey.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "key")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/ArrayHasKey.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
