package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.AbstractPhpProcess;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/PHP/DefaultPhpProcess.php

*/

public class DefaultPhpProcess extends AbstractPhpProcess {

    public Object tempFile = null;

    public DefaultPhpProcess(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DefaultPhpProcess.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "settings",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object runJob(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, null);
        Object settings = assignParameter(args, 1, null);
        if (ZVal.isNull(settings)) {
            settings = ZVal.newArray();
        }
        if (ZVal.toBool(env.callMethod(this, "useTemporaryFile", DefaultPhpProcess.class))
                || ZVal.toBool(toObjectR(this).accessProp(this, env).name("stdin").value())) {
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("tempFile")
                                            .set(
                                                    NamespaceGlobal.tempnam
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.sys_get_temp_dir
                                                                            .env(env)
                                                                            .call()
                                                                            .value(),
                                                                    "PHPUnit")
                                                            .value())))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    NamespaceGlobal.file_put_contents
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("tempFile")
                                                            .value(),
                                                    job)
                                            .value(),
                                    "===",
                                    false))) {
                throw ZVal.getException(env, new Exception(env, "Unable to write temporary file"));
            }

            job = ZVal.assign(toObjectR(this).accessProp(this, env).name("stdin").value());
        }

        return ZVal.assign(
                env.callMethod(this, "runProcess", DefaultPhpProcess.class, job, settings));
    }

    @ConvertedMethod
    protected Object getHandles(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "string")
    @ConvertedParameter(index = 1, name = "settings", typeHint = "array")
    protected Object runProcess(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object job = assignParameter(args, 0, null);
        Object settings = assignParameter(args, 1, null);
        Object handles = ZVal.newArray();
        Object process = null;
        Object envVar = null;
        Object stdout = null;
        ReferenceContainer e = new BasicReferenceContainer(null);
        Object line = null;
        Object _SERVER = env.getGlobal("_SERVER");
        Object origPipe = null;
        Object pipeOffset = null;
        Object i = null;
        Object ___env = ZVal.newArray();
        Object envKey = null;
        Object stderr = null;
        Object pipeSpec = null;
        Object n = null;
        ReferenceContainer r = new BasicReferenceContainer(null);
        ReferenceContainer w = new BasicReferenceContainer(null);
        Object pipe = null;
        ReferenceContainer pipes = new BasicReferenceContainer(ZVal.newArray());
        handles = env.callMethod(this, "getHandles", DefaultPhpProcess.class);
        ___env = ZVal.getNull();
        if (toObjectR(this).accessProp(this, env).name("env").getBool()) {
            ___env = ZVal.assign(ZVal.isTrue(_SERVER) ? _SERVER : ZVal.newArray());
            ZVal.unsetArrayElement(___env, "argv");
            ZVal.unsetArrayElement(___env, "argc");
            ___env =
                    CRArrayF.array_merge
                            .env(env)
                            .call(___env, toObjectR(this).accessProp(this, env).name("env").value())
                            .value();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult393 : ZVal.getIterable(___env, env, false)) {
                envKey = ZVal.assign(zpairResult393.getKey());
                envVar = ZVal.assign(zpairResult393.getValue());
                if (function_is_array.f.env(env).call(envVar).getBool()) {
                    ZVal.unsetArrayElement(___env, envKey);
                }
            }
        }

        pipeSpec =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.isTrue(ZVal.getElement(handles, 0))
                                        ? ZVal.getElement(handles, 0)
                                        : ZVal.newArray(new ZPair(0, "pipe"), new ZPair(1, "r"))),
                        new ZPair(
                                1,
                                ZVal.isTrue(ZVal.getElement(handles, 1))
                                        ? ZVal.getElement(handles, 1)
                                        : ZVal.newArray(new ZPair(0, "pipe"), new ZPair(1, "w"))),
                        new ZPair(
                                2,
                                ZVal.isTrue(ZVal.getElement(handles, 2))
                                        ? ZVal.getElement(handles, 2)
                                        : ZVal.newArray(new ZPair(0, "pipe"), new ZPair(1, "w"))));
        process =
                NamespaceGlobal.proc_open
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                        .call(
                                env.callMethod(
                                        this,
                                        "getCommand",
                                        DefaultPhpProcess.class,
                                        settings,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("tempFile")
                                                .value()),
                                pipeSpec,
                                pipes.getObject(),
                                ZVal.getNull(),
                                ___env)
                        .value();
        if (!NamespaceGlobal.is_resource.env(env).call(process).getBool()) {
            throw ZVal.getException(env, new Exception(env, "Unable to spawn worker process"));
        }

        if (ZVal.isTrue(job)) {
            env.callMethod(
                    this,
                    "process",
                    DefaultPhpProcess.class,
                    ZVal.getElement(pipes.getObject(), 0),
                    job);
        }

        NamespaceGlobal.fclose.env(env).call(ZVal.getElement(pipes.getObject(), 0));
        if (toObjectR(this).accessProp(this, env).name("timeout").getBool()) {
            stderr = ZVal.assign(stdout = "");
            ZVal.unsetArrayElement(pipes.getObject(), 0);
            runtimeConverterBreakCount = 0;
            while (ZVal.isTrue(true)) {
                r.setObject(ZVal.assign(pipes.getObject()));
                w.setObject(ZVal.getNull());
                e.setObject(ZVal.getNull());
                n =
                        NamespaceGlobal.stream_select
                                .env(env)
                                .addReferneceArgs(
                                        new RuntimeArgsWithReferences()
                                                .add(0, r)
                                                .add(1, w)
                                                .add(2, e))
                                .call(
                                        r.getObject(),
                                        w.getObject(),
                                        e.getObject(),
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("timeout")
                                                .value())
                                .value();
                if (ZVal.strictEqualityCheck(n, "===", false)) {
                    break;
                }

                if (ZVal.strictEqualityCheck(n, "===", 0)) {
                    NamespaceGlobal.proc_terminate.env(env).call(process, 9);
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "Job execution aborted after %d seconds",
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("timeout")
                                                            .value())
                                            .value()));
                }

                if (ZVal.isGreaterThan(n, '>', 0)) {
                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult394 : ZVal.getIterable(r.getObject(), env, true)) {
                        pipe = ZVal.assign(zpairResult394.getValue());
                        pipeOffset = 0;
                        runtimeConverterBreakCount = 0;
                        for (ZPair zpairResult395 :
                                ZVal.getIterable(pipes.getObject(), env, false)) {
                            i = ZVal.assign(zpairResult395.getKey());
                            origPipe = ZVal.assign(zpairResult395.getValue());
                            if (ZVal.strictEqualityCheck(pipe, "===", origPipe)) {
                                pipeOffset = ZVal.assign(i);
                                break;
                            }
                        }

                        if (!ZVal.isTrue(pipeOffset)) {
                            break;
                        }

                        line = NamespaceGlobal.fread.env(env).call(pipe, 8192).value();
                        if (ZVal.strictEqualityCheck(line, "===", "")) {
                            NamespaceGlobal.fclose
                                    .env(env)
                                    .call(ZVal.getElement(pipes.getObject(), pipeOffset));
                            ZVal.unsetArrayElement(pipes.getObject(), pipeOffset);

                        } else {
                            if (ZVal.strictEqualityCheck(pipeOffset, "===", 1)) {
                                stdout = toStringR(stdout, env) + toStringR(line, env);

                            } else {
                                stderr = toStringR(stderr, env) + toStringR(line, env);
                            }
                        }
                    }

                    if (ZVal.isEmpty(pipes.getObject())) {
                        break;
                    }
                }
            }

        } else {
            if (ZVal.isset(ZVal.getElement(pipes.getObject(), 1))) {
                stdout =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(ZVal.getElement(pipes.getObject(), 1))
                                .value();
                NamespaceGlobal.fclose.env(env).call(ZVal.getElement(pipes.getObject(), 1));
            }

            if (ZVal.isset(ZVal.getElement(pipes.getObject(), 2))) {
                stderr =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(ZVal.getElement(pipes.getObject(), 2))
                                .value();
                NamespaceGlobal.fclose.env(env).call(ZVal.getElement(pipes.getObject(), 2));
            }
        }

        if (ZVal.isset(ZVal.getElement(handles, 1))) {
            NamespaceGlobal.rewind.env(env).call(ZVal.getElement(handles, 1));
            stdout =
                    NamespaceGlobal.stream_get_contents
                            .env(env)
                            .call(ZVal.getElement(handles, 1))
                            .value();
            NamespaceGlobal.fclose.env(env).call(ZVal.getElement(handles, 1));
        }

        if (ZVal.isset(ZVal.getElement(handles, 2))) {
            NamespaceGlobal.rewind.env(env).call(ZVal.getElement(handles, 2));
            stderr =
                    NamespaceGlobal.stream_get_contents
                            .env(env)
                            .call(ZVal.getElement(handles, 2))
                            .value();
            NamespaceGlobal.fclose.env(env).call(ZVal.getElement(handles, 2));
        }

        NamespaceGlobal.proc_close.env(env).call(process);
        env.callMethod(this, "cleanup", DefaultPhpProcess.class);
        return env.returnWithGlobals(
                ZVal.newArray(new ZPair("stdout", stdout), new ZPair("stderr", stderr)),
                "_SERVER",
                _SERVER);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pipe")
    @ConvertedParameter(index = 1, name = "job", typeHint = "string")
    protected Object process(RuntimeEnv env, Object... args) {
        Object pipe = assignParameter(args, 0, null);
        Object job = assignParameter(args, 1, null);
        NamespaceGlobal.fwrite.env(env).call(pipe, job);
        return null;
    }

    @ConvertedMethod
    protected Object cleanup(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("tempFile").getBool()) {
            NamespaceGlobal.unlink
                    .env(env)
                    .call(toObjectR(this).accessProp(this, env).name("tempFile").value());
        }

        return null;
    }

    @ConvertedMethod
    protected Object useTemporaryFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\PHP\\DefaultPhpProcess";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractPhpProcess.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\PHP\\DefaultPhpProcess")
                    .setLookup(DefaultPhpProcess.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "args",
                            "env",
                            "runtime",
                            "stderrRedirection",
                            "stdin",
                            "tempFile",
                            "timeout")
                    .setFilename("vendor/phpunit/phpunit/src/Util/PHP/DefaultPhpProcess.php")
                    .addExtendsClass("PHPUnit\\Util\\PHP\\AbstractPhpProcess")
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
