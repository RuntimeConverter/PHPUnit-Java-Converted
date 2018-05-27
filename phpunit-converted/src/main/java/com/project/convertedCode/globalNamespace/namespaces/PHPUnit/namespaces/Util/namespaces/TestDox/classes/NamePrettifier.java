package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/NamePrettifier.php

*/

public final class NamePrettifier extends RuntimeClassBase {

    public Object strings = ZVal.newArray();

    public NamePrettifier(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object prettifyTestClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object title = ZVal.newArray();
        title = ZVal.assign(name);
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.substr
                        .env(env)
                        .call(
                                name,
                                ZVal.multiply(
                                        -1, NamespaceGlobal.strlen.env(env).call("Test").value()))
                        .value(),
                "===",
                "Test")) {
            title =
                    NamespaceGlobal.substr
                            .env(env)
                            .call(
                                    title,
                                    0,
                                    NamespaceGlobal.strripos.env(env).call(title, "Test").value())
                            .value();
        }

        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(name, "Tests").value(), "===", 0)) {
            title =
                    NamespaceGlobal.substr
                            .env(env)
                            .call(title, NamespaceGlobal.strlen.env(env).call("Tests").value())
                            .value();

        } else if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(name, "Test").value(), "===", 0)) {
            title =
                    NamespaceGlobal.substr
                            .env(env)
                            .call(title, NamespaceGlobal.strlen.env(env).call("Test").value())
                            .value();
        }

        if (ZVal.strictEqualityCheck(ZVal.getElement(title, 0), "===", "\\")) {
            title = NamespaceGlobal.substr.env(env).call(title, 1).value();
        }

        return ZVal.assign(title);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object prettifyTestMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        if (ZVal.isNull(name)) {
            name = ZVal.newArray();
        }
        Object wasNumeric = null;
        Object string = null;
        Object max = null;
        Object isNumeric = null;
        ReferenceContainer count = new BasicReferenceContainer(null);
        Object i = null;
        Object buffer = null;
        buffer = "";
        if (ZVal.toBool(!function_is_string.f.env(env).call(name).getBool())
                || ZVal.toBool(ZVal.strictEqualityCheck(name, "===", ""))) {
            return ZVal.assign(buffer);
        }

        string =
                NamespaceGlobal.preg_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(4, count))
                        .call("#\\d+$#", "", name, -1, count.getObject())
                        .value();
        if (CRArrayF.in_array
                .env(env)
                .call(string, toObjectR(this).accessProp(this, env).name("strings").value())
                .getBool()) {
            name = ZVal.assign(string);

        } else if (ZVal.strictEqualityCheck(count.getObject(), "===", 0)) {
            ZVal.addToArray(toObjectR(this).accessProp(this, env).name("strings").value(), string);
        }

        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(name, "test").value(), "===", 0)) {
            name = NamespaceGlobal.substr.env(env).call(name, 4).value();
        }

        if (ZVal.strictEqualityCheck(name, "===", "")) {
            return ZVal.assign(buffer);
        }

        ZVal.putArrayElement(
                name,
                0,
                NamespaceGlobal.strtoupper.env(env).call(ZVal.getElement(name, 0)).value());
        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(name, "_").value(), "!==", false)) {
            return ZVal.assign(
                    NamespaceGlobal.trim
                            .env(env)
                            .call(
                                    NamespaceGlobal.str_replace
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call("_", " ", name)
                                            .value())
                            .value());
        }

        max = NamespaceGlobal.strlen.env(env).call(name).value();
        wasNumeric = false;
        for (i = 0; ZVal.isLessThan(i, '<', max); i = ZVal.increment(i)) {
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.isGreaterThan(i, '>', 0))
                                    && ZVal.toBool(
                                            ZVal.isGreaterThanOrEqualTo(
                                                    NamespaceGlobal.ord
                                                            .env(env)
                                                            .call(ZVal.getElement(name, i))
                                                            .value(),
                                                    ">=",
                                                    65)))
                    && ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    NamespaceGlobal.ord
                                            .env(env)
                                            .call(ZVal.getElement(name, i))
                                            .value(),
                                    "<=",
                                    90))) {
                buffer =
                        toStringR(buffer, env)
                                + " "
                                + toStringR(
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(ZVal.getElement(name, i))
                                                .value(),
                                        env);

            } else {
                isNumeric = function_is_numeric.f.env(env).call(ZVal.getElement(name, i)).value();
                if (ZVal.toBool(!ZVal.isTrue(wasNumeric)) && ZVal.toBool(isNumeric)) {
                    buffer = toStringR(buffer, env) + " ";
                    wasNumeric = true;
                }

                if (ZVal.toBool(wasNumeric) && ZVal.toBool(!ZVal.isTrue(isNumeric))) {
                    wasNumeric = false;
                }

                buffer = toStringR(buffer, env) + toStringR(ZVal.getElement(name, i), env);
            }
        }

        return ZVal.assign(buffer);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\NamePrettifier";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\NamePrettifier")
                    .setLookup(NamePrettifier.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("strings")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/NamePrettifier.php")
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
