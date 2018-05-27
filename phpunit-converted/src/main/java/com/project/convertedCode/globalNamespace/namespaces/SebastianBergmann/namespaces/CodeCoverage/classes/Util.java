package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Util.php

*/

public final class Util extends RuntimeClassBase {

    public Util(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Util";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "a", typeHint = "float")
        @ConvertedParameter(index = 1, name = "b", typeHint = "float")
        @ConvertedParameter(
            index = 2,
            name = "asString",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "fixedWidth",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object percent(RuntimeEnv env, Object... args) {
            Object a = assignParameter(args, 0, null);
            Object b = assignParameter(args, 1, null);
            Object asString = assignParameter(args, 2, null);
            if (ZVal.isNull(asString)) {
                asString = false;
            }
            Object fixedWidth = assignParameter(args, 3, null);
            if (ZVal.isNull(fixedWidth)) {
                fixedWidth = false;
            }
            Object format = null;
            Object percent = null;
            if (ZVal.toBool(asString) && ZVal.toBool(ZVal.equalityCheck(b, 0))) {
                return "";
            }

            percent = 100;
            if (ZVal.isGreaterThan(b, '>', 0)) {
                percent = ZVal.multiply(ZVal.divide(a, b), 100);
            }

            if (ZVal.isTrue(asString)) {
                format = ZVal.assign(ZVal.isTrue(fixedWidth) ? "%6.2F%%" : "%01.2F%%");
                return ZVal.assign(NamespaceGlobal.sprintf.env(env).call(format, percent).value());
            }

            return ZVal.assign(percent);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Util")
                    .setLookup(Util.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Util.php")
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
