package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ObjectComparator;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/DateTimeComparator.php

*/

public class DateTimeComparator extends ObjectComparator {

    public DateTimeComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DateTimeComparator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object accepts(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        expected, DateTime.class, "DateTime"))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        expected,
                                                        DateTimeInterface.class,
                                                        "DateTimeInterface")))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        actual, DateTime.class, "DateTime"))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        actual,
                                                        DateTimeInterface.class,
                                                        "DateTimeInterface"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    @ConvertedParameter(
        index = 2,
        name = "delta",
        defaultValue = "0.0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "canonicalize",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "ignoreCase",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "processed",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object assertEquals(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        ReferenceContainer delta = new BasicReferenceContainer(assignParameter(args, 2, null));
        if (ZVal.isNull(delta)) {
            delta.setObject(0.0);
        }
        Object canonicalize = assignParameter(args, 3, null);
        if (ZVal.isNull(canonicalize)) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 4, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        ReferenceContainer processed =
                assignParameterRef(runtimePassByReferenceArgs, args, 5, null);
        if (ZVal.isNull(processed)) {
            processed.setObject(ZVal.newArray());
        }
        Object expectedUpper = null;
        Object expectedLower = null;
        Object absDelta = null;
        Object actualClone = null;
        absDelta = NamespaceGlobal.abs.env(env).call(delta.getObject()).value();
        delta.setObject(
                new DateInterval(
                        env, NamespaceGlobal.sprintf.env(env).call("PT%dS", absDelta).value()));
        toObjectR(delta.getObject())
                .accessProp(this, env)
                .name("f")
                .set(
                        ZVal.subtract(
                                absDelta, NamespaceGlobal.floor.env(env).call(absDelta).value()));
        actualClone =
                env.callMethod(
                        ((RuntimeClassInterface) actual).phpClone(),
                        "setTimezone",
                        DateTimeComparator.class,
                        new DateTimeZone(env, "UTC"));
        expectedLower =
                env.callMethod(
                        env.callMethod(
                                ((RuntimeClassInterface) expected).phpClone(),
                                "setTimezone",
                                DateTimeComparator.class,
                                new DateTimeZone(env, "UTC")),
                        "sub",
                        DateTimeComparator.class,
                        delta.getObject());
        expectedUpper =
                env.callMethod(
                        env.callMethod(
                                ((RuntimeClassInterface) expected).phpClone(),
                                "setTimezone",
                                DateTimeComparator.class,
                                new DateTimeZone(env, "UTC")),
                        new RuntimeArgsWithReferences().add(0, delta),
                        "add",
                        DateTimeComparator.class,
                        delta.getObject());
        if (ZVal.toBool(ZVal.isLessThan(actualClone, '<', expectedLower))
                || ZVal.toBool(ZVal.isGreaterThan(actualClone, '>', expectedUpper))) {
            throw ZVal.getException(
                    env,
                    new ComparisonFailure(
                            env,
                            expected,
                            actual,
                            env.callMethod(
                                    this, "dateTimeToString", DateTimeComparator.class, expected),
                            env.callMethod(
                                    this, "dateTimeToString", DateTimeComparator.class, actual),
                            false,
                            "Failed asserting that two DateTime objects are equal."));
        }

        return null;
    }

    public Object assertEquals(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "datetime", typeHint = "DateTimeInterface")
    private Object dateTimeToString(RuntimeEnv env, Object... args) {
        Object datetime = assignParameter(args, 0, null);
        Object string = null;
        string = env.callMethod(datetime, "format", DateTimeComparator.class, "Y-m-d\\TH:i:s.uO");
        return ZVal.assign(ZVal.isTrue(string) ? string : "Invalid DateTimeInterface object");
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\DateTimeComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ObjectComparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\DateTimeComparator")
                    .setLookup(DateTimeComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/DateTimeComparator.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ObjectComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ArrayComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\Comparator")
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
