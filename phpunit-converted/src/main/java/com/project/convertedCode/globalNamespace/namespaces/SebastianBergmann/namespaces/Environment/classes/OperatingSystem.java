package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/environment/src/OperatingSystem.php

*/

public final class OperatingSystem extends RuntimeClassBase {

    public OperatingSystem(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getFamily(RuntimeEnv env, Object... args) {
        if (function_defined.f.env(env).call("PHP_OS_FAMILY").getBool()) {
            return ZVal.assign(function_constant.f.call(env, "PHP_OS_FAMILY"));
        }

        if (ZVal.strictEqualityCheck("/", "===", "\\")) {
            return "Windows";
        }

        SwitchEnumType20 switchVariable20 =
                ZVal.getEnum(
                        "Linux",
                        SwitchEnumType20.DEFAULT_CASE,
                        SwitchEnumType20.STRING_Darwin,
                        "Darwin",
                        SwitchEnumType20.STRING_DragonFly,
                        "DragonFly",
                        SwitchEnumType20.STRING_FreeBSD,
                        "FreeBSD",
                        SwitchEnumType20.STRING_NetBSD,
                        "NetBSD",
                        SwitchEnumType20.STRING_OpenBSD,
                        "OpenBSD",
                        SwitchEnumType20.STRING_Linux,
                        "Linux",
                        SwitchEnumType20.STRING_SunOS,
                        "SunOS");
        switch (switchVariable20) {
            case STRING_Darwin:
                return "Darwin";
            case STRING_DragonFly:
            case STRING_FreeBSD:
            case STRING_NetBSD:
            case STRING_OpenBSD:
                return "BSD";
            case STRING_Linux:
                return "Linux";
            case STRING_SunOS:
                return "Solaris";
            case DEFAULT_CASE:
                return "Unknown";
        }
        ;
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Environment\\OperatingSystem";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Environment\\OperatingSystem")
                    .setLookup(OperatingSystem.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/environment/src/OperatingSystem.php")
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

    private enum SwitchEnumType20 {
        STRING_Darwin,
        STRING_DragonFly,
        STRING_FreeBSD,
        STRING_NetBSD,
        STRING_OpenBSD,
        STRING_Linux,
        STRING_SunOS,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
