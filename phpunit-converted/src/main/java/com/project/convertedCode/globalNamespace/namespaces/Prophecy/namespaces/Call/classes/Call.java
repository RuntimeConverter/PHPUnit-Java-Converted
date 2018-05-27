package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes;

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
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Call/Call.php

*/

public class Call extends RuntimeClassBase {

    public Object methodName = null;

    public Object arguments = null;

    public Object returnValue = null;

    public Object exception = null;

    public Object file = null;

    public Object line = null;

    public Call(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Call.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    @ConvertedParameter(index = 2, name = "returnValue")
    @ConvertedParameter(
        index = 3,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 4, name = "file")
    @ConvertedParameter(index = 5, name = "line")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        Object returnValue = assignParameter(args, 2, null);
        Object exception = assignParameter(args, 3, null);
        if (ZVal.isNull(exception)) {
            exception = ZVal.getNull();
        }
        Object file = assignParameter(args, 4, null);
        Object line = assignParameter(args, 5, null);
        toObjectR(this).accessProp(this, env).name("methodName").set(methodName);
        toObjectR(this).accessProp(this, env).name("arguments").set(arguments);
        toObjectR(this).accessProp(this, env).name("returnValue").set(returnValue);
        toObjectR(this).accessProp(this, env).name("exception").set(exception);
        if (ZVal.isTrue(file)) {
            toObjectR(this).accessProp(this, env).name("file").set(file);
            toObjectR(this)
                    .accessProp(this, env)
                    .name("line")
                    .set(NamespaceGlobal.intval.env(env).call(line).value());
        }

        return null;
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("methodName").value());
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("arguments").value());
    }

    @ConvertedMethod
    public Object getReturnValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("returnValue").value());
    }

    @ConvertedMethod
    public Object getException(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("exception").value());
    }

    @ConvertedMethod
    public Object getFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("file").value());
    }

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("line").value());
    }

    @ConvertedMethod
    public Object getCallPlace(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                toObjectR(this).accessProp(this, env).name("file").value())) {
            return "unknown";
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s:%d",
                                toObjectR(this).accessProp(this, env).name("file").value(),
                                toObjectR(this).accessProp(this, env).name("line").value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Call\\Call";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Call\\Call")
                    .setLookup(Call.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "arguments", "exception", "file", "line", "methodName", "returnValue")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Call/Call.php")
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
