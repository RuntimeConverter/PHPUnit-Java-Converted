package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Comparator;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/SplObjectStorageComparator.php

*/

public class SplObjectStorageComparator extends Comparator {

    public SplObjectStorageComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SplObjectStorageComparator.class) {
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
                                ZVal.checkInstanceType(
                                        expected, SplObjectStorage.class, "SplObjectStorage"))
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        actual, SplObjectStorage.class, "SplObjectStorage")));
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
    public Object assertEquals(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        Object delta = assignParameter(args, 2, null);
        if (ZVal.isNull(delta)) {
            delta = 0.0;
        }
        Object canonicalize = assignParameter(args, 3, null);
        if (ZVal.isNull(canonicalize)) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 4, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        ReferenceContainer _object = new BasicReferenceContainer(null);
        for (ZPair zpairResult440 : ZVal.getIterable(actual, env, true)) {
            _object.setObject(ZVal.assign(zpairResult440.getValue()));
            if (!ZVal.isTrue(
                    env.callMethod(
                            expected,
                            new RuntimeArgsWithReferences().add(0, _object),
                            "contains",
                            SplObjectStorageComparator.class,
                            _object.getObject()))) {
                throw ZVal.getException(
                        env,
                        new ComparisonFailure(
                                env,
                                expected,
                                actual,
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        SplObjectStorageComparator.class,
                                        expected),
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        SplObjectStorageComparator.class,
                                        actual),
                                false,
                                "Failed asserting that two objects are equal."));
            }
        }

        for (ZPair zpairResult441 : ZVal.getIterable(expected, env, true)) {
            _object.setObject(ZVal.assign(zpairResult441.getValue()));
            if (!ZVal.isTrue(
                    env.callMethod(
                            actual,
                            new RuntimeArgsWithReferences().add(0, _object),
                            "contains",
                            SplObjectStorageComparator.class,
                            _object.getObject()))) {
                throw ZVal.getException(
                        env,
                        new ComparisonFailure(
                                env,
                                expected,
                                actual,
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        SplObjectStorageComparator.class,
                                        expected),
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        SplObjectStorageComparator.class,
                                        actual),
                                false,
                                "Failed asserting that two objects are equal."));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Comparator\\SplObjectStorageComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Comparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\SplObjectStorageComparator")
                    .setLookup(
                            SplObjectStorageComparator.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/SplObjectStorageComparator.php")
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
