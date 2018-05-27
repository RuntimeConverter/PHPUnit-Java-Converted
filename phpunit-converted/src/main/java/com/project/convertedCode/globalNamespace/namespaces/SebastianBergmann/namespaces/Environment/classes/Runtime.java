package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/environment/src/Runtime.php

*/

public final class Runtime extends RuntimeClassBase {

    public Runtime(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object canCollectCodeCoverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this, "hasXdebug", Runtime.class))
                        || ZVal.toBool(
                                env.callMethod(this, "hasPHPDBGCodeCoverage", Runtime.class)));
    }

    @ConvertedMethod
    public Object discardsComments(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(NamespaceGlobal.extension_loaded.env(env).call("Zend Optimizer+").value())
                && ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                NamespaceGlobal.ini_get
                                                        .env(env)
                                                        .call("zend_optimizerplus.save_comments")
                                                        .value(),
                                                "===",
                                                "0"))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                NamespaceGlobal.ini_get
                                                        .env(env)
                                                        .call("opcache.save_comments")
                                                        .value(),
                                                "===",
                                                "0")))) {
            return ZVal.assign(true);
        }

        if (ZVal.toBool(NamespaceGlobal.extension_loaded.env(env).call("Zend OPcache").value())
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                NamespaceGlobal.ini_get
                                        .env(env)
                                        .call("opcache.save_comments")
                                        .value(),
                                0))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getBinary(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object binary = null;
        Object possibleBinaryLocations = null;
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .SebastianBergmann
                                                        .namespaces
                                                        .Environment
                                                        .classes
                                                        .Runtime
                                                        .RequestStaticProperties
                                                        .class)
                                        .binary,
                                "===",
                                ZVal.getNull()))
                && ZVal.toBool(env.callMethod(this, "isHHVM", Runtime.class))) {
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .SebastianBergmann
                                                    .namespaces
                                                    .Environment
                                                    .classes
                                                    .Runtime
                                                    .RequestStaticProperties
                                                    .class)
                                    .binary =
                            NamespaceGlobal.getenv.env(env).call("PHP_BINARY").value(),
                    "===",
                    false)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .SebastianBergmann
                                                .namespaces
                                                .Environment
                                                .classes
                                                .Runtime
                                                .RequestStaticProperties
                                                .class)
                                .binary =
                        "/usr/bin/php";
            }

            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
                                            .namespaces
                                            .Environment
                                            .classes
                                            .Runtime
                                            .RequestStaticProperties
                                            .class)
                            .binary =
                    toStringR(
                                    NamespaceGlobal.escapeshellarg
                                            .env(env)
                                            .call(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .SebastianBergmann
                                                                            .namespaces
                                                                            .Environment
                                                                            .classes
                                                                            .Runtime
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .binary)
                                            .value(),
                                    env)
                            + " --php"
                            + " -d hhvm.php7.all=1";
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .SebastianBergmann
                                                        .namespaces
                                                        .Environment
                                                        .classes
                                                        .Runtime
                                                        .RequestStaticProperties
                                                        .class)
                                        .binary,
                                "===",
                                ZVal.getNull()))
                && ZVal.toBool(ZVal.strictNotEqualityCheck("/usr/bin/php", "!==", ""))) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
                                            .namespaces
                                            .Environment
                                            .classes
                                            .Runtime
                                            .RequestStaticProperties
                                            .class)
                            .binary =
                    NamespaceGlobal.escapeshellarg.env(env).call("/usr/bin/php").value();
        }

        if (ZVal.strictEqualityCheck(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .SebastianBergmann
                                        .namespaces
                                        .Environment
                                        .classes
                                        .Runtime
                                        .RequestStaticProperties
                                        .class)
                        .binary,
                "===",
                ZVal.getNull())) {
            possibleBinaryLocations =
                    ZVal.newArray(
                            new ZPair(0, toStringR("/usr/bin", env) + "/php"),
                            new ZPair(1, toStringR("/usr/bin", env) + "/php-cli.exe"),
                            new ZPair(2, toStringR("/usr/bin", env) + "/php.exe"));
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult455 : ZVal.getIterable(possibleBinaryLocations, env, true)) {
                binary = ZVal.assign(zpairResult455.getValue());
                if (NamespaceGlobal.is_readable.env(env).call(binary).getBool()) {
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .SebastianBergmann
                                                    .namespaces
                                                    .Environment
                                                    .classes
                                                    .Runtime
                                                    .RequestStaticProperties
                                                    .class)
                                    .binary =
                            NamespaceGlobal.escapeshellarg.env(env).call(binary).value();
                    break;
                }
            }
        }

        if (ZVal.strictEqualityCheck(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .SebastianBergmann
                                        .namespaces
                                        .Environment
                                        .classes
                                        .Runtime
                                        .RequestStaticProperties
                                        .class)
                        .binary,
                "===",
                ZVal.getNull())) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
                                            .namespaces
                                            .Environment
                                            .classes
                                            .Runtime
                                            .RequestStaticProperties
                                            .class)
                            .binary =
                    "php";
        }

        return ZVal.assign(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .SebastianBergmann
                                        .namespaces
                                        .Environment
                                        .classes
                                        .Runtime
                                        .RequestStaticProperties
                                        .class)
                        .binary);
    }

    @ConvertedMethod
    public Object getNameWithVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(env.callMethod(this, "getName", Runtime.class), env)
                        + " "
                        + toStringR(env.callMethod(this, "getVersion", Runtime.class), env));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "isHHVM", Runtime.class))) {
            return "HHVM";
        }

        if (ZVal.isTrue(env.callMethod(this, "isPHPDBG", Runtime.class))) {
            return "PHPDBG";
        }

        return "PHP";
    }

    @ConvertedMethod
    public Object getVendorUrl(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "isHHVM", Runtime.class))) {
            return "http://hhvm.com/";
        }

        return "https://secure.php.net/";
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "isHHVM", Runtime.class))) {
            return ZVal.assign(function_constant.f.call(env, "HHVM_VERSION"));
        }

        return ZVal.assign("7.1.16");
    }

    @ConvertedMethod
    public Object hasXdebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(env.callMethod(this, "isPHP", Runtime.class))
                                        || ZVal.toBool(
                                                env.callMethod(this, "isHHVM", Runtime.class)))
                        && ZVal.toBool(
                                NamespaceGlobal.extension_loaded.env(env).call("xdebug").value()));
    }

    @ConvertedMethod
    public Object isHHVM(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_defined.f.env(env).call("HHVM_VERSION").value());
    }

    @ConvertedMethod
    public Object isPHP(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(!ZVal.isTrue(env.callMethod(this, "isHHVM", Runtime.class)))
                        && ZVal.toBool(
                                !ZVal.isTrue(env.callMethod(this, "isPHPDBG", Runtime.class))));
    }

    @ConvertedMethod
    public Object isPHPDBG(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck("cli", "===", "phpdbg"))
                        && ZVal.toBool(
                                !ZVal.isTrue(env.callMethod(this, "isHHVM", Runtime.class))));
    }

    @ConvertedMethod
    public Object hasPHPDBGCodeCoverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "isPHPDBG", Runtime.class));
    }

    public static final Object CONST_class = "SebastianBergmann\\Environment\\Runtime";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object binary = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Environment\\Runtime")
                    .setLookup(Runtime.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/environment/src/Runtime.php")
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
