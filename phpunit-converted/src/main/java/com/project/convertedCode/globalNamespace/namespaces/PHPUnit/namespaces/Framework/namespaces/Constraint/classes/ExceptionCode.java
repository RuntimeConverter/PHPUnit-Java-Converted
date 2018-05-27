package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
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

 vendor/phpunit/phpunit/src/Framework/Constraint/ExceptionCode.php

*/

public class ExceptionCode extends Constraint {

    public Object expectedCode = null;

    public ExceptionCode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionCode.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("expectedCode").set(expected);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "exception code is ";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toStringR(env.callMethod(other, "getCode", ExceptionCode.class), env),
                        "===",
                        toStringR(
                                toObjectR(this).accessProp(this, env).name("expectedCode").value(),
                                env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s is equal to expected exception code %s",
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        ExceptionCode.class,
                                        env.callMethod(other, "getCode", ExceptionCode.class)),
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        ExceptionCode.class,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("expectedCode")
                                                .value()))
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\ExceptionCode";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\ExceptionCode")
                    .setLookup(ExceptionCode.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("expectedCode", "exporter")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/ExceptionCode.php")
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
