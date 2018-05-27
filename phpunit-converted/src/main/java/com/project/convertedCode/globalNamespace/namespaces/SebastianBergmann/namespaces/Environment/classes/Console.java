package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/environment/src/Console.php

*/

public final class Console extends RuntimeClassBase {

    public Console(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object hasColorSupport(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "isWindows", Console.class))) {
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            false,
                                                            "!==",
                                                            NamespaceGlobal.getenv
                                                                    .env(env)
                                                                    .call("ANSICON")
                                                                    .value()))
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            "ON",
                                                            "===",
                                                            NamespaceGlobal.getenv
                                                                    .env(env)
                                                                    .call("ConEmuANSI")
                                                                    .value())))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            "xterm",
                                            "===",
                                            NamespaceGlobal.getenv.env(env).call("TERM").value())));
        }

        if (!function_defined.f.env(env).call("STDOUT").getBool()) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "isInteractive",
                        Console.class,
                        function_constant.f.call(env, "STDOUT")));
    }

    @ConvertedMethod
    public Object getNumberOfColumns(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "isWindows", Console.class))) {
            return ZVal.assign(env.callMethod(this, "getNumberOfColumnsWindows", Console.class));
        }

        if (!ZVal.isTrue(env.callMethod(this, "isInteractive", Console.class, CONST_STDIN))) {
            return 80;
        }

        return ZVal.assign(env.callMethod(this, "getNumberOfColumnsInteractive", Console.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileDescriptor")
    public Object isInteractive(RuntimeEnv env, Object... args) {
        Object fileDescriptor = assignParameter(args, 0, null);
        if (ZVal.isNull(fileDescriptor)) {
            fileDescriptor = CONST_STDOUT;
        }
        return ZVal.assign(
                ZVal.toBool(NamespaceGlobal.function_exists.env(env).call("posix_isatty").value())
                        && ZVal.toBool(
                                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                                "___error23423346_namespace_function_not_found__(identifier:posix_isatty)_(namespace:\\)(source:posix_isatty)______")
                                        .env(env)
                                        .call(fileDescriptor)
                                        .value()));
    }

    @ConvertedMethod
    private Object isWindows(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck("/", "===", "\\"));
    }

    @ConvertedMethod
    private Object getNumberOfColumnsInteractive(RuntimeEnv env, Object... args) {
        ReferenceContainer match = new BasicReferenceContainer(ZVal.newArray());
        if (ZVal.toBool(NamespaceGlobal.function_exists.env(env).call("shell_exec").value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                NamespaceGlobal.preg_match
                                        .env(env)
                                        .addReferneceArgs(
                                                new RuntimeArgsWithReferences().add(2, match))
                                        .call(
                                                "#\\d+ (\\d+)#",
                                                NamespaceGlobal.shell_exec
                                                                .env(env)
                                                                .call("stty size")
                                                                .getBool()
                                                        ? NamespaceGlobal.shell_exec
                                                                .env(env)
                                                                .call("stty size")
                                                                .value()
                                                        : "",
                                                match.getObject())
                                        .value(),
                                "===",
                                1))) {
            if (ZVal.isGreaterThan(ZVal.toLong(ZVal.getElement(match.getObject(), 1)), '>', 0)) {
                return ZVal.assign(ZVal.toLong(ZVal.getElement(match.getObject(), 1)));
            }
        }

        if (ZVal.toBool(NamespaceGlobal.function_exists.env(env).call("shell_exec").value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                NamespaceGlobal.preg_match
                                        .env(env)
                                        .addReferneceArgs(
                                                new RuntimeArgsWithReferences().add(2, match))
                                        .call(
                                                "#columns = (\\d+);#",
                                                NamespaceGlobal.shell_exec
                                                                .env(env)
                                                                .call("stty")
                                                                .getBool()
                                                        ? NamespaceGlobal.shell_exec
                                                                .env(env)
                                                                .call("stty")
                                                                .value()
                                                        : "",
                                                match.getObject())
                                        .value(),
                                "===",
                                1))) {
            if (ZVal.isGreaterThan(ZVal.toLong(ZVal.getElement(match.getObject(), 1)), '>', 0)) {
                return ZVal.assign(ZVal.toLong(ZVal.getElement(match.getObject(), 1)));
            }
        }

        return 80;
    }

    @ConvertedMethod
    private Object getNumberOfColumnsWindows(RuntimeEnv env, Object... args) {
        Object process = null;
        Object columns = null;
        Object ansicon = null;
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        ReferenceContainer pipes = new BasicReferenceContainer(ZVal.newArray());
        Object info = null;
        ansicon = NamespaceGlobal.getenv.env(env).call("ANSICON").value();
        columns = 80;
        if (ZVal.toBool(function_is_string.f.env(env).call(ansicon).value())
                && ZVal.toBool(
                        NamespaceGlobal.preg_match
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^(\\d+)x\\d+ \\(\\d+x(\\d+)\\)$/",
                                        NamespaceGlobal.trim.env(env).call(ansicon).value(),
                                        matches.getObject())
                                .value())) {
            columns = ZVal.assign(ZVal.getElement(matches.getObject(), 1));

        } else if (NamespaceGlobal.function_exists.env(env).call("proc_open").getBool()) {
            process =
                    NamespaceGlobal.proc_open
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                            .call(
                                    "mode CON",
                                    ZVal.newArray(
                                            new ZPair(
                                                    1,
                                                    ZVal.newArray(
                                                            new ZPair(0, "pipe"),
                                                            new ZPair(1, "w"))),
                                            new ZPair(
                                                    2,
                                                    ZVal.newArray(
                                                            new ZPair(0, "pipe"),
                                                            new ZPair(1, "w")))),
                                    pipes.getObject(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.newArray(new ZPair("suppress_errors", true)))
                            .value();
            if (NamespaceGlobal.is_resource.env(env).call(process).getBool()) {
                info =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(ZVal.getElement(pipes.getObject(), 1))
                                .value();
                NamespaceGlobal.fclose.env(env).call(ZVal.getElement(pipes.getObject(), 1));
                NamespaceGlobal.fclose.env(env).call(ZVal.getElement(pipes.getObject(), 2));
                NamespaceGlobal.proc_close.env(env).call(process);
                if (NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                "/--------+\\r?\\n.+?(\\d+)\\r?\\n.+?(\\d+)\\r?\\n/",
                                info,
                                matches.getObject())
                        .getBool()) {
                    columns = ZVal.assign(ZVal.getElement(matches.getObject(), 2));
                }
            }
        }

        return ZVal.assign(ZVal.subtract(columns, 1));
    }

    public static final Object CONST_STDIN = 0;

    public static final Object CONST_STDOUT = 1;

    public static final Object CONST_STDERR = 2;

    public static final Object CONST_class = "SebastianBergmann\\Environment\\Console";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Environment\\Console")
                    .setLookup(Console.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/environment/src/Console.php")
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
