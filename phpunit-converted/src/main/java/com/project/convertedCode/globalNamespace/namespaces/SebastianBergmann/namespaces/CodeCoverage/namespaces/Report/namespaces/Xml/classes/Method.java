package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
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

 vendor/phpunit/php-code-coverage/src/Report/Xml/Method.php

*/

public final class Method extends RuntimeClassBase {

    public Object contextNode = null;

    public Method(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Method.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, null);
        Object name = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("contextNode").set(context);
        env.callMethod(this, "setName", Method.class, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "signature", typeHint = "string")
    public Object setSignature(RuntimeEnv env, Object... args) {
        Object signature = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Method.class,
                "signature",
                signature);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "end",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setLines(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, null);
        Object end = assignParameter(args, 1, null);
        if (ZVal.isNull(end)) {
            end = ZVal.getNull();
        }
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Method.class,
                "start",
                start);
        if (ZVal.strictNotEqualityCheck(end, "!==", ZVal.getNull())) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("contextNode").value(),
                    "setAttribute",
                    Method.class,
                    "end",
                    end);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "executable", typeHint = "string")
    @ConvertedParameter(index = 1, name = "executed", typeHint = "string")
    @ConvertedParameter(index = 2, name = "coverage", typeHint = "string")
    public Object setTotals(RuntimeEnv env, Object... args) {
        Object executable = assignParameter(args, 0, null);
        Object executed = assignParameter(args, 1, null);
        Object coverage = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Method.class,
                "executable",
                executable);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Method.class,
                "executed",
                executed);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Method.class,
                "coverage",
                coverage);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "crap", typeHint = "string")
    public Object setCrap(RuntimeEnv env, Object... args) {
        Object crap = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Method.class,
                "crap",
                crap);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    private Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("contextNode").value(),
                "setAttribute",
                Method.class,
                "name",
                name);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Method";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Method")
                    .setLookup(Method.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("contextNode")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Method.php")
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
