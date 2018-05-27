package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.DefaultPhpProcess;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SyntheticError;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.WindowsPhpProcess;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.modules.standard.serialization.function_unserialize;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/PHP/AbstractPhpProcess.php

*/

public abstract class AbstractPhpProcess extends RuntimeClassBase {

    public Object runtime = null;

    public Object stderrRedirection = false;

    public Object stdin = "";

    public Object ___args = "";

    public Object ___env = ZVal.newArray();

    public Object timeout = 0;

    public AbstractPhpProcess(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractPhpProcess.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("runtime").set(new Runtime(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stderrRedirection", typeHint = "bool")
    public Object setUseStderrRedirection(RuntimeEnv env, Object... args) {
        Object stderrRedirection = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stderrRedirection").set(stderrRedirection);
        return null;
    }

    @ConvertedMethod
    public Object useStderrRedirection(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("stderrRedirection").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stdin", typeHint = "string")
    public Object setStdin(RuntimeEnv env, Object... args) {
        Object stdin = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("stdin").set(stdin);
        return null;
    }

    @ConvertedMethod
    public Object getStdin(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("stdin").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "string")
    public Object setArgs(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("args").set(___args);
        return null;
    }

    @ConvertedMethod
    public Object getArgs(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("args").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "env", typeHint = "array")
    public Object setEnv(RuntimeEnv env, Object... args) {
        Object ___env = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("env").set(___env);
        return null;
    }

    @ConvertedMethod
    public Object getEnv(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("env").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout", typeHint = "int")
    public Object setTimeout(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("timeout").set(timeout);
        return null;
    }

    @ConvertedMethod
    public Object getTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("timeout").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "string")
    @ConvertedParameter(index = 1, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 2, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object runTestJob(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, null);
        Object test = assignParameter(args, 1, null);
        Object result = assignParameter(args, 2, null);
        Object _result = ZVal.newArray();
        env.callMethod(result, "startTest", AbstractPhpProcess.class, test);
        _result = env.callMethod(this, "runJob", AbstractPhpProcess.class, job);
        env.callMethod(
                this,
                "processChildResult",
                AbstractPhpProcess.class,
                test,
                result,
                ZVal.getElement(_result, "stdout"),
                ZVal.getElement(_result, "stderr"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "settings", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "file",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getCommand(RuntimeEnv env, Object... args) {
        Object settings = assignParameter(args, 0, null);
        Object file = assignParameter(args, 1, null);
        if (ZVal.isNull(file)) {
            file = ZVal.getNull();
        }
        Object command = null;
        command =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("runtime").value(),
                        "getBinary",
                        AbstractPhpProcess.class);
        command =
                toStringR(command, env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "settingsToParameters",
                                        AbstractPhpProcess.class,
                                        settings),
                                env);
        if (ZVal.strictEqualityCheck("cli", "===", "phpdbg")) {
            command = toStringR(command, env) + " -qrr ";
            if (ZVal.isTrue(file)) {
                command =
                        toStringR(command, env)
                                + "-e "
                                + toStringR(
                                        NamespaceGlobal.escapeshellarg.env(env).call(file).value(),
                                        env);

            } else {
                command =
                        toStringR(command, env)
                                + toStringR(
                                        NamespaceGlobal.escapeshellarg
                                                .env(env)
                                                .call(
                                                        toStringR(
                                                                        env.addRootFilesystemPrefix(
                                                                                "/vendor/phpunit/phpunit/src/Util/PHP"),
                                                                        env)
                                                                + "/eval-stdin.php")
                                                .value(),
                                        env);
            }

        } else if (ZVal.isTrue(file)) {
            command =
                    toStringR(command, env)
                            + " -f "
                            + toStringR(
                                    NamespaceGlobal.escapeshellarg.env(env).call(file).value(),
                                    env);
        }

        if (toObjectR(this).accessProp(this, env).name("args").getBool()) {
            command =
                    toStringR(command, env)
                            + " -- "
                            + toStringR(
                                    toObjectR(this).accessProp(this, env).name("args").value(),
                                    env);
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("stderrRedirection").value(),
                "===",
                true)) {
            command = toStringR(command, env) + " 2>&1";
        }

        return ZVal.assign(command);
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
    public abstract Object runJob(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "settings", typeHint = "array")
    protected Object settingsToParameters(RuntimeEnv env, Object... args) {
        Object settings = assignParameter(args, 0, null);
        Object buffer = null;
        Object setting = null;
        buffer = "";
        for (ZPair zpairResult391 : ZVal.getIterable(settings, env, true)) {
            setting = ZVal.assign(zpairResult391.getValue());
            buffer =
                    toStringR(buffer, env)
                            + " -d "
                            + toStringR(
                                    NamespaceGlobal.escapeshellarg.env(env).call(setting).value(),
                                    env);
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    @ConvertedParameter(index = 2, name = "stdout", typeHint = "string")
    @ConvertedParameter(index = 3, name = "stderr", typeHint = "string")
    private Object processChildResult(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, null);
        Object result = assignParameter(args, 1, null);
        Object stdout = assignParameter(args, 2, null);
        Object stderr = assignParameter(args, 3, null);
        Object childResult = ZVal.newArray();
        Object failures = ZVal.newArray();
        Object e = null;
        Object warnings = ZVal.newArray();
        Object skipped = ZVal.newArray();
        Object output = null;
        Object notImplemented = ZVal.newArray();
        Object time = null;
        Object risky = ZVal.newArray();
        Object errors = ZVal.newArray();
        time = 0;
        if (!ZVal.isEmpty(stderr)) {
            env.callMethod(
                    result,
                    "addError",
                    AbstractPhpProcess.class,
                    test,
                    new Exception(env, NamespaceGlobal.trim.env(env).call(stderr).value()),
                    time);

        } else {
            function_set_error_handler
                    .f
                    .env(env)
                    .call(
                            new Closure(env) {
                                @Override
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object errno = assignParameter(args, 0, null);
                                    Object errstr = assignParameter(args, 1, null);
                                    Object errfile = assignParameter(args, 2, null);
                                    Object errline = assignParameter(args, 3, null);
                                    throw ZVal.getException(
                                            env,
                                            new ErrorException(
                                                    env, errstr, errno, errno, errfile, errline));
                                }
                            });
            try {
                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.strpos
                                .env(env)
                                .call(stdout, "#!/usr/bin/env php\n")
                                .value(),
                        "===",
                        0)) {
                    stdout = NamespaceGlobal.substr.env(env).call(stdout, 19).value();
                }

                childResult =
                        function_unserialize
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.str_replace
                                                .env(env)
                                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                                .call("#!/usr/bin/env php\n", "", stdout)
                                                .value())
                                .value();
                NamespaceGlobal.restore_error_handler.env(env).call();
            } catch (ConvertedException convertedException61) {
                if (convertedException61.instanceOf(ErrorException.class, "ErrorException")) {
                    e = convertedException61.getObject();
                    NamespaceGlobal.restore_error_handler.env(env).call();
                    childResult = false;
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            new Exception(
                                    env, NamespaceGlobal.trim.env(env).call(stdout).value(), 0, e),
                            time);
                } else {
                    throw convertedException61;
                }
            }

            if (ZVal.strictNotEqualityCheck(childResult, "!==", false)) {
                if (!ZVal.isEmpty(ZVal.getElement(childResult, "output"))) {
                    output = ZVal.assign(ZVal.getElement(childResult, "output"));
                }

                env.callMethod(
                        test,
                        "setResult",
                        AbstractPhpProcess.class,
                        ZVal.getElement(childResult, "testResult"));
                env.callMethod(
                        test,
                        "addToAssertionCount",
                        AbstractPhpProcess.class,
                        ZVal.getElement(childResult, "numAssertions"));
                childResult = ZVal.assign(ZVal.getElement(childResult, "result"));
                if (ZVal.isTrue(
                        env.callMethod(
                                result,
                                "getCollectCodeCoverageInformation",
                                AbstractPhpProcess.class))) {
                    env.callMethod(
                            env.callMethod(result, "getCodeCoverage", AbstractPhpProcess.class),
                            "merge",
                            AbstractPhpProcess.class,
                            env.callMethod(
                                    childResult, "getCodeCoverage", AbstractPhpProcess.class));
                }

                time = env.callMethod(childResult, "time", AbstractPhpProcess.class);
                notImplemented =
                        env.callMethod(childResult, "notImplemented", AbstractPhpProcess.class);
                risky = env.callMethod(childResult, "risky", AbstractPhpProcess.class);
                skipped = env.callMethod(childResult, "skipped", AbstractPhpProcess.class);
                errors = env.callMethod(childResult, "errors", AbstractPhpProcess.class);
                warnings = env.callMethod(childResult, "warnings", AbstractPhpProcess.class);
                failures = env.callMethod(childResult, "failures", AbstractPhpProcess.class);
                if (!ZVal.isEmpty(notImplemented)) {
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            env.callMethod(
                                    this,
                                    "getException",
                                    AbstractPhpProcess.class,
                                    ZVal.getElement(notImplemented, 0)),
                            time);

                } else if (!ZVal.isEmpty(risky)) {
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            env.callMethod(
                                    this,
                                    "getException",
                                    AbstractPhpProcess.class,
                                    ZVal.getElement(risky, 0)),
                            time);

                } else if (!ZVal.isEmpty(skipped)) {
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            env.callMethod(
                                    this,
                                    "getException",
                                    AbstractPhpProcess.class,
                                    ZVal.getElement(skipped, 0)),
                            time);

                } else if (!ZVal.isEmpty(errors)) {
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            env.callMethod(
                                    this,
                                    "getException",
                                    AbstractPhpProcess.class,
                                    ZVal.getElement(errors, 0)),
                            time);

                } else if (!ZVal.isEmpty(warnings)) {
                    env.callMethod(
                            result,
                            "addWarning",
                            AbstractPhpProcess.class,
                            test,
                            env.callMethod(
                                    this,
                                    "getException",
                                    AbstractPhpProcess.class,
                                    ZVal.getElement(warnings, 0)),
                            time);

                } else if (!ZVal.isEmpty(failures)) {
                    env.callMethod(
                            result,
                            "addFailure",
                            AbstractPhpProcess.class,
                            test,
                            env.callMethod(
                                    this,
                                    "getException",
                                    AbstractPhpProcess.class,
                                    ZVal.getElement(failures, 0)),
                            time);
                }
            }
        }

        env.callMethod(result, "endTest", AbstractPhpProcess.class, test, time);
        if (!ZVal.isEmpty(output)) {
            env.echo(output);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "PHPUnit\\Framework\\TestFailure")
    private Object getException(RuntimeEnv env, Object... args) {
        Object error = assignParameter(args, 0, null);
        Object exception = null;
        Object exceptionArray = ZVal.newArray();
        Object value = null;
        Object key = null;
        exception = env.callMethod(error, "thrownException", AbstractPhpProcess.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(exception, (Class) null, "__PHP_Incomplete_Class"))) {
            exceptionArray = ZVal.newArray();
            for (ZPair zpairResult392 : ZVal.getIterable(ZVal.toArray(exception), env, false)) {
                key = ZVal.assign(zpairResult392.getKey());
                value = ZVal.assign(zpairResult392.getValue());
                key =
                        NamespaceGlobal.substr
                                .env(env)
                                .call(
                                        key,
                                        ZVal.add(
                                                NamespaceGlobal.strrpos
                                                        .env(env)
                                                        .call(key, "\u0000")
                                                        .value(),
                                                1))
                                .value();
                ZVal.putArrayElement(exceptionArray, key, value);
            }

            exception =
                    new SyntheticError(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "%s: %s",
                                            ZVal.getElement(
                                                    exceptionArray, "_PHP_Incomplete_Class_Name"),
                                            ZVal.getElement(exceptionArray, "message"))
                                    .value(),
                            ZVal.getElement(exceptionArray, "code"),
                            ZVal.getElement(exceptionArray, "file"),
                            ZVal.getElement(exceptionArray, "line"),
                            ZVal.getElement(exceptionArray, "trace"));
        }

        return ZVal.assign(exception);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\PHP\\AbstractPhpProcess";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        public Object factory(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck("/", "===", "\\")) {
                return ZVal.assign(new WindowsPhpProcess(env));
            }

            return ZVal.assign(new DefaultPhpProcess(env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\PHP\\AbstractPhpProcess")
                    .setLookup(AbstractPhpProcess.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "args", "env", "runtime", "stderrRedirection", "stdin", "timeout")
                    .setFilename("vendor/phpunit/phpunit/src/Util/PHP/AbstractPhpProcess.php")
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
