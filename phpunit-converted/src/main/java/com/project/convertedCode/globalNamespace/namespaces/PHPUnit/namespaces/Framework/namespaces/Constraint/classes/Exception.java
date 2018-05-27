package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/Exception.php

*/

public class Exception extends Constraint {

    public Object className = null;

    public Exception(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Exception.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("className").set(className);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "exception of type \"%s\"",
                                toObjectR(this).accessProp(this, env).name("className").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.checkInstanceTypeMatch(
                        other, toObjectR(this).accessProp(this, env).name("className").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object message = null;
        if (ZVal.strictNotEqualityCheck(other, "!==", ZVal.getNull())) {
            message = "";
            if (ZVal.isTrue(ZVal.checkInstanceType(other, Throwable.class, "Throwable"))) {
                message =
                        ". Message was: \""
                                + toStringR(
                                        env.callMethod(other, "getMessage", Exception.class), env)
                                + "\" at"
                                + "\n"
                                + toStringR(
                                        Filter.runtimeStaticObject.getFilteredStacktrace(
                                                env, other),
                                        env);
            }

            return ZVal.assign(
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "exception of type \"%s\" matches expected exception \"%s\"%s",
                                    function_get_class.f.env(env).call(other).value(),
                                    toObjectR(this).accessProp(this, env).name("className").value(),
                                    message)
                            .value());
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "exception of type \"%s\" is thrown",
                                toObjectR(this).accessProp(this, env).name("className").value())
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\Exception";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\Exception")
                    .setLookup(Exception.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("className", "exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/Exception.php")
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
