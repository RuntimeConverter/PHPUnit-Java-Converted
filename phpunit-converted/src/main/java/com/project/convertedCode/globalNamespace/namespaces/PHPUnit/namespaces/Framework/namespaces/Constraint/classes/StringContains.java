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

 vendor/phpunit/phpunit/src/Framework/Constraint/StringContains.php

*/

public class StringContains extends Constraint {

    public Object string = null;

    public Object ignoreCase = null;

    public StringContains(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringContains.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, null);
        Object ignoreCase = assignParameter(args, 1, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("string").set(string);
        toObjectR(this).accessProp(this, env).name("ignoreCase").set(ignoreCase);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object string = null;
        if (toObjectR(this).accessProp(this, env).name("ignoreCase").getBool()) {
            string =
                    NamespaceGlobal.mb_strtolower
                            .env(env)
                            .call(toObjectR(this).accessProp(this, env).name("string").value())
                            .value();

        } else {
            string = ZVal.assign(toObjectR(this).accessProp(this, env).name("string").value());
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf.env(env).call("contains \"%s\"", string).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(
                "", "===", toObjectR(this).accessProp(this, env).name("string").value())) {
            return ZVal.assign(true);
        }

        if (toObjectR(this).accessProp(this, env).name("ignoreCase").getBool()) {
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            NamespaceGlobal.mb_stripos
                                    .env(env)
                                    .call(
                                            other,
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("string")
                                                    .value())
                                    .value(),
                            "!==",
                            false));
        }

        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        NamespaceGlobal.mb_strpos
                                .env(env)
                                .call(
                                        other,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("string")
                                                .value())
                                .value(),
                        "!==",
                        false));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\StringContains";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\StringContains")
                    .setLookup(StringContains.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "ignoreCase", "string")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/StringContains.php")
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
