package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Printer.php

*/

public class Printer extends RuntimeClassBase {

    public Object autoFlush = false;

    public Object out = null;

    public Object outTarget = null;

    public Printer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Printer.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "out",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, null);
        if (ZVal.isNull(out)) {
            out = ZVal.getNull();
        }
        if (ZVal.strictNotEqualityCheck(out, "!==", ZVal.getNull())) {
            if (function_is_string.f.env(env).call(out).getBool()) {
                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.strpos.env(env).call(out, "socket://").value(), "===", 0)) {
                    out =
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(
                                            ":",
                                            NamespaceGlobal.str_replace
                                                    .env(env)
                                                    .addReferneceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call("socket://", "", out)
                                                    .value())
                                    .value();
                    if (ZVal.strictNotEqualityCheck(
                            CRArrayF.count.env(env).call(out).value(), "!==", 2)) {
                        throw ZVal.getException(env, new Exception(env));
                    }

                    toObjectR(this)
                            .accessProp(this, env)
                            .name("out")
                            .set(
                                    NamespaceGlobal.fsockopen
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call(ZVal.getElement(out, 0), ZVal.getElement(out, 1))
                                            .value());

                } else {
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            NamespaceGlobal.strpos
                                                                    .env(env)
                                                                    .call(out, "php://")
                                                                    .value(),
                                                            "===",
                                                            false))
                                            && ZVal.toBool(
                                                    !ZVal.isTrue(
                                                            NamespaceGlobal.mkdir
                                                                    .env(env)
                                                                    .call(
                                                                            NamespaceGlobal.dirname
                                                                                    .env(env)
                                                                                    .call(out)
                                                                                    .value(),
                                                                            511,
                                                                            true)
                                                                    .value())))
                            && ZVal.toBool(
                                    !NamespaceGlobal.is_dir
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.dirname
                                                            .env(env)
                                                            .call(out)
                                                            .value())
                                            .getBool())) {
                        throw ZVal.getException(
                                env,
                                new RuntimeException(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Directory \"%s\" was not created",
                                                        NamespaceGlobal.dirname
                                                                .env(env)
                                                                .call(out)
                                                                .value())
                                                .value()));
                    }

                    toObjectR(this)
                            .accessProp(this, env)
                            .name("out")
                            .set(NamespaceGlobal.fopen.env(env).call(out, "wt").value());
                }

                toObjectR(this).accessProp(this, env).name("outTarget").set(out);

            } else {
                toObjectR(this).accessProp(this, env).name("out").set(out);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(toObjectR(this).accessProp(this, env).name("out").value())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                NamespaceGlobal.strncmp
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("outTarget")
                                                        .value(),
                                                "php://",
                                                6)
                                        .value(),
                                "!==",
                                0))) {
            NamespaceGlobal.fclose
                    .env(env)
                    .call(toObjectR(this).accessProp(this, env).name("out").value());
        }

        return null;
    }

    @ConvertedMethod
    public Object incrementalFlush(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("out").getBool()) {
            NamespaceGlobal.fflush
                    .env(env)
                    .call(toObjectR(this).accessProp(this, env).name("out").value());

        } else {
            NamespaceGlobal.flush.env(env).call();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buffer", typeHint = "string")
    public Object write(RuntimeEnv env, Object... args) {
        Object buffer = assignParameter(args, 0, null);
        if (toObjectR(this).accessProp(this, env).name("out").getBool()) {
            NamespaceGlobal.fwrite
                    .env(env)
                    .call(toObjectR(this).accessProp(this, env).name("out").value(), buffer);
            if (toObjectR(this).accessProp(this, env).name("autoFlush").getBool()) {
                env.callMethod(this, "incrementalFlush", Printer.class);
            }

        } else {
            if (ZVal.toBool(ZVal.strictNotEqualityCheck("cli", "!==", "cli"))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck("cli", "!==", "phpdbg"))) {
                buffer = NamespaceGlobal.htmlspecialchars.env(env).call(buffer, 8).value();
            }

            env.echo(buffer);
            if (toObjectR(this).accessProp(this, env).name("autoFlush").getBool()) {
                env.callMethod(this, "incrementalFlush", Printer.class);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getAutoFlush(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("autoFlush").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "autoFlush", typeHint = "bool")
    public Object setAutoFlush(RuntimeEnv env, Object... args) {
        Object autoFlush = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("autoFlush").set(autoFlush);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Printer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Printer")
                    .setLookup(Printer.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("autoFlush", "out", "outTarget")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Printer.php")
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
