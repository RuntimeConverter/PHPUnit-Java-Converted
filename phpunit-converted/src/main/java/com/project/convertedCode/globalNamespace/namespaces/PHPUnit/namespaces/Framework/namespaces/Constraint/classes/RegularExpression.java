package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/RegularExpression.php

*/

public class RegularExpression extends Constraint {

    public Object pattern = null;

    public RegularExpression(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RegularExpression.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("pattern").set(pattern);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "matches PCRE pattern \"%s\"",
                                toObjectR(this).accessProp(this, env).name("pattern").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        NamespaceGlobal.preg_match
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("pattern")
                                                .value(),
                                        other)
                                .value(),
                        '>',
                        0));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\RegularExpression";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\RegularExpression")
                    .setLookup(RegularExpression.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "pattern")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/RegularExpression.php")
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
