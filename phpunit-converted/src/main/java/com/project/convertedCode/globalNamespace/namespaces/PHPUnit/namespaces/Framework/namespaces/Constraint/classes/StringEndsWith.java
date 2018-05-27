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

 vendor/phpunit/phpunit/src/Framework/Constraint/StringEndsWith.php

*/

public class StringEndsWith extends Constraint {

    public Object suffix = null;

    public StringEndsWith(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringEndsWith.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suffix", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object suffix = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("suffix").set(suffix);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "ends with \""
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("suffix").value(), env)
                        + "\"");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.equalityCheck(
                        NamespaceGlobal.substr
                                .env(env)
                                .call(
                                        other,
                                        ZVal.subtract(
                                                0,
                                                NamespaceGlobal.strlen
                                                        .env(env)
                                                        .call(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("suffix")
                                                                        .value())
                                                        .value()))
                                .value(),
                        toObjectR(this).accessProp(this, env).name("suffix").value()));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\StringEndsWith";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\StringEndsWith")
                    .setLookup(StringEndsWith.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "suffix")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/StringEndsWith.php")
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
