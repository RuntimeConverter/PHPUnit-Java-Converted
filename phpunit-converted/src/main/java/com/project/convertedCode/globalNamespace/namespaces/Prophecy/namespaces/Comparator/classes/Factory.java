package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Comparator.classes.ClosureComparator;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Comparator.classes.ProphecyComparator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Comparator/Factory.php

*/

public final class Factory
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .SebastianBergmann
                .namespaces
                .Comparator
                .classes
                .Factory {

    public Factory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Factory.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        super.__construct(env);
        env.callMethod(this, "register", Factory.class, new ClosureComparator(env));
        env.callMethod(this, "register", Factory.class, new ProphecyComparator(env));
        return null;
    }

    public static final Object CONST_class = "Prophecy\\Comparator\\Factory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .SebastianBergmann
                    .namespaces
                    .Comparator
                    .classes
                    .Factory
                    .RuntimeStaticCompanion {

        @ConvertedMethod
        public Object getInstance(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Prophecy
                                            .namespaces
                                            .Comparator
                                            .classes
                                            .Factory
                                            .RequestStaticProperties
                                            .class)
                            .instance,
                    "===",
                    ZVal.getNull())) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Prophecy
                                                .namespaces
                                                .Comparator
                                                .classes
                                                .Factory
                                                .RequestStaticProperties
                                                .class)
                                .instance =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Prophecy
                                .namespaces
                                .Comparator
                                .classes
                                .Factory(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Prophecy
                                            .namespaces
                                            .Comparator
                                            .classes
                                            .Factory
                                            .RequestStaticProperties
                                            .class)
                            .instance);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instance = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Comparator\\Factory")
                    .setLookup(Factory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("customComparators", "defaultComparators")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Comparator/Factory.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\Factory")
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
