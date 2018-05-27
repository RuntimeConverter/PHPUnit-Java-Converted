package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.DefaultPhpProcess;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/PHP/WindowsPhpProcess.php

*/

public class WindowsPhpProcess extends DefaultPhpProcess {

    public WindowsPhpProcess(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WindowsPhpProcess.class) {
            this.__construct(env, args);
        }
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
        return ZVal.assign("\"" + toStringR(super.getCommand(env, settings, file), env) + "\"");
    }

    @ConvertedMethod
    protected Object getHandles(RuntimeEnv env, Object... args) {
        Object stdout_handle = null;
        if (ZVal.strictEqualityCheck(
                false, "===", stdout_handle = NamespaceGlobal.tmpfile.env(env).call().value())) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            "A temporary file could not be created; verify that your TEMP environment variable is writable"));
        }

        return ZVal.assign(ZVal.newArray(new ZPair(1, stdout_handle)));
    }

    @ConvertedMethod
    protected Object useTemporaryFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\PHP\\WindowsPhpProcess";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DefaultPhpProcess.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\PHP\\WindowsPhpProcess")
                    .setLookup(WindowsPhpProcess.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "args",
                            "env",
                            "runtime",
                            "stderrRedirection",
                            "stdin",
                            "tempFile",
                            "timeout")
                    .setFilename("vendor/phpunit/phpunit/src/Util/PHP/WindowsPhpProcess.php")
                    .addExtendsClass("PHPUnit\\Util\\PHP\\DefaultPhpProcess")
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
