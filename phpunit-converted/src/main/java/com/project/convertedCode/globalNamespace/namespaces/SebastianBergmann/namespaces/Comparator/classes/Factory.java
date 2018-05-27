package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ResourceComparator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ObjectComparator;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.DOMNodeComparator;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.DoubleComparator;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ExceptionComparator;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.TypeComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.DateTimeComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.SplObjectStorageComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.MockObjectComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ScalarComparator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.NumericComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ArrayComparator;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/Factory.php

*/

public class Factory extends RuntimeClassBase {

    public Object customComparators = ZVal.newArray();

    public Object defaultComparators = ZVal.newArray();

    public Factory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Factory.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        env.callMethod(this, "registerDefaultComparators", Factory.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object getComparatorFor(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        Object comparator = null;
        for (ZPair zpairResult437 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("customComparators").value(),
                        env,
                        true)) {
            comparator = ZVal.assign(zpairResult437.getValue());
            if (ZVal.isTrue(
                    env.callMethod(comparator, "accepts", Factory.class, expected, actual))) {
                return ZVal.assign(comparator);
            }
        }

        for (ZPair zpairResult438 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("defaultComparators").value(),
                        env,
                        true)) {
            comparator = ZVal.assign(zpairResult438.getValue());
            if (ZVal.isTrue(
                    env.callMethod(comparator, "accepts", Factory.class, expected, actual))) {
                return ZVal.assign(comparator);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "comparator",
        typeHint = "SebastianBergmann\\Comparator\\Comparator"
    )
    public Object register(RuntimeEnv env, Object... args) {
        Object comparator = assignParameter(args, 0, null);
        CRArrayF.array_unshift
                .env(env)
                .call(
                        toObjectR(this).accessProp(this, env).name("customComparators").value(),
                        comparator);
        env.callMethod(comparator, "setFactory", Factory.class, this);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "comparator",
        typeHint = "SebastianBergmann\\Comparator\\Comparator"
    )
    public Object unregister(RuntimeEnv env, Object... args) {
        Object comparator = assignParameter(args, 0, null);
        Object _comparator = null;
        Object key = null;
        for (ZPair zpairResult439 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("customComparators").value(),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult439.getKey());
            _comparator = ZVal.assign(zpairResult439.getValue());
            if (ZVal.strictEqualityCheck(comparator, "===", _comparator)) {
                ZVal.unsetArrayElement(
                        toObjectR(this).accessProp(this, env).name("customComparators").value(),
                        key);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("customComparators").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    private Object registerDefaultComparators(RuntimeEnv env, Object... args) {
        env.callMethod(this, "registerDefaultComparator", Factory.class, new TypeComparator(env));
        env.callMethod(this, "registerDefaultComparator", Factory.class, new ScalarComparator(env));
        env.callMethod(
                this, "registerDefaultComparator", Factory.class, new NumericComparator(env));
        env.callMethod(this, "registerDefaultComparator", Factory.class, new DoubleComparator(env));
        env.callMethod(this, "registerDefaultComparator", Factory.class, new ArrayComparator(env));
        env.callMethod(
                this, "registerDefaultComparator", Factory.class, new ResourceComparator(env));
        env.callMethod(this, "registerDefaultComparator", Factory.class, new ObjectComparator(env));
        env.callMethod(
                this, "registerDefaultComparator", Factory.class, new ExceptionComparator(env));
        env.callMethod(
                this,
                "registerDefaultComparator",
                Factory.class,
                new SplObjectStorageComparator(env));
        env.callMethod(
                this, "registerDefaultComparator", Factory.class, new DOMNodeComparator(env));
        env.callMethod(
                this, "registerDefaultComparator", Factory.class, new MockObjectComparator(env));
        env.callMethod(
                this, "registerDefaultComparator", Factory.class, new DateTimeComparator(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "comparator",
        typeHint = "SebastianBergmann\\Comparator\\Comparator"
    )
    private Object registerDefaultComparator(RuntimeEnv env, Object... args) {
        Object comparator = assignParameter(args, 0, null);
        CRArrayF.array_unshift
                .env(env)
                .call(
                        toObjectR(this).accessProp(this, env).name("defaultComparators").value(),
                        comparator);
        env.callMethod(comparator, "setFactory", Factory.class, this);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\Factory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        public Object getInstance(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
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
                                                .SebastianBergmann
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
                                .SebastianBergmann
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
                                            .SebastianBergmann
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
                    .setName("SebastianBergmann\\Comparator\\Factory")
                    .setLookup(Factory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("customComparators", "defaultComparators")
                    .setFilename("vendor/sebastian/comparator/src/Factory.php")
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
