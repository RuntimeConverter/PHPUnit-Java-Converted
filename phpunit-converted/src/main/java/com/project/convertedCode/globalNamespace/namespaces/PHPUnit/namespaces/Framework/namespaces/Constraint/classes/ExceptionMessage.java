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
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/ExceptionMessage.php

*/

public class ExceptionMessage extends Constraint {

    public Object expectedMessage = null;

    public ExceptionMessage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionMessage.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("expectedMessage").set(expected);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("expectedMessage").value(), "===", "")) {
            return "exception message is empty";
        }

        return "exception message contains ";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("expectedMessage").value(), "===", "")) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            env.callMethod(other, "getMessage", ExceptionMessage.class),
                            "===",
                            ""));
        }

        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        NamespaceGlobal.strpos
                                .env(env)
                                .call(
                                        env.callMethod(other, "getMessage", ExceptionMessage.class),
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("expectedMessage")
                                                .value())
                                .value(),
                        "!==",
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("expectedMessage").value(), "===", "")) {
            return ZVal.assign(
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "exception message is empty but is '%s'",
                                    env.callMethod(other, "getMessage", ExceptionMessage.class))
                            .value());
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "exception message '%s' contains '%s'",
                                env.callMethod(other, "getMessage", ExceptionMessage.class),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("expectedMessage")
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\ExceptionMessage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\ExceptionMessage")
                    .setLookup(ExceptionMessage.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("expectedMessage", "exporter")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/ExceptionMessage.php")
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
