package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.UnifiedDiffOutputBuilder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/ComparisonFailure.php

*/

public class ComparisonFailure extends RuntimeException {

    public Object expected = null;

    public Object actual = null;

    public Object expectedAsString = null;

    public Object actualAsString = null;

    public Object identical = null;

    public Object message = null;

    public ComparisonFailure(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ComparisonFailure.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    @ConvertedParameter(index = 2, name = "expectedAsString")
    @ConvertedParameter(index = 3, name = "actualAsString")
    @ConvertedParameter(
        index = 4,
        name = "identical",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 5, name = "message")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        Object expectedAsString = assignParameter(args, 2, null);
        Object actualAsString = assignParameter(args, 3, null);
        Object identical = assignParameter(args, 4, null);
        if (ZVal.isNull(identical)) {
            identical = false;
        }
        Object message = assignParameter(args, 5, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        toObjectR(this).accessProp(this, env).name("expected").set(expected);
        toObjectR(this).accessProp(this, env).name("actual").set(actual);
        toObjectR(this).accessProp(this, env).name("expectedAsString").set(expectedAsString);
        toObjectR(this).accessProp(this, env).name("actualAsString").set(actualAsString);
        toObjectR(this).accessProp(this, env).name("message").set(message);
        return null;
    }

    @ConvertedMethod
    public Object getActual(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("actual").value());
    }

    @ConvertedMethod
    public Object getExpected(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("expected").value());
    }

    @ConvertedMethod
    public Object getActualAsString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("actualAsString").value());
    }

    @ConvertedMethod
    public Object getExpectedAsString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("expectedAsString").value());
    }

    @ConvertedMethod
    public Object getDiff(RuntimeEnv env, Object... args) {
        Object differ = null;
        if (ZVal.toBool(!toObjectR(this).accessProp(this, env).name("actualAsString").getBool())
                && ZVal.toBool(
                        !toObjectR(this)
                                .accessProp(this, env)
                                .name("expectedAsString")
                                .getBool())) {
            return "";
        }

        differ = new Differ(env, new UnifiedDiffOutputBuilder(env, "\n--- Expected\n+++ Actual\n"));
        return ZVal.assign(
                env.callMethod(
                        differ,
                        "diff",
                        ComparisonFailure.class,
                        toObjectR(this).accessProp(this, env).name("expectedAsString").value(),
                        toObjectR(this).accessProp(this, env).name("actualAsString").value()));
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("message").value(), env)
                        + toStringR(env.callMethod(this, "getDiff", ComparisonFailure.class), env));
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\ComparisonFailure";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\ComparisonFailure")
                    .setLookup(ComparisonFailure.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "actual",
                            "actualAsString",
                            "expected",
                            "expectedAsString",
                            "identical",
                            "message")
                    .setFilename("vendor/sebastian/comparator/src/ComparisonFailure.php")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
