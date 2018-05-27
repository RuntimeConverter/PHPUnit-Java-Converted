package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/Count.php

*/

public class Count extends Constraint {

    public Object expectedCount = 0;

    public Count(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Count.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("expectedCount").set(expected);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "count matches %d",
                                toObjectR(this).accessProp(this, env).name("expectedCount").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("expectedCount").value(),
                        "===",
                        env.callMethod(this, "getCountOf", Count.class, other)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object getCountOf(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object iterator = null;
        Object count = null;
        Object key = null;
        if (ZVal.toBool(ZVal.checkInstanceType(other, Countable.class, "Countable"))
                || ZVal.toBool(function_is_array.f.env(env).call(other).value())) {
            return ZVal.assign(CRArrayF.count.env(env).call(other).value());
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(other, Traversable.class, "Traversable"))) {
            while (ZVal.isTrue(
                    ZVal.checkInstanceType(other, IteratorAggregate.class, "IteratorAggregate"))) {
                other = env.callMethod(other, "getIterator", Count.class);
            }

            iterator = ZVal.assign(other);
            if (ZVal.isTrue(ZVal.checkInstanceType(iterator, (Class) null, "Generator"))) {
                return ZVal.assign(
                        env.callMethod(this, "getCountOfGenerator", Count.class, iterator));
            }

            if (!ZVal.isTrue(ZVal.checkInstanceType(iterator, Iterator.class, "Iterator"))) {
                return ZVal.assign(NamespaceGlobal.iterator_count.env(env).call(iterator).value());
            }

            key = env.callMethod(iterator, "key", Count.class);
            count = NamespaceGlobal.iterator_count.env(env).call(iterator).value();
            if (ZVal.strictNotEqualityCheck(key, "!==", ZVal.getNull())) {
                env.callMethod(iterator, "rewind", Count.class);
                while (ZVal.toBool(env.callMethod(iterator, "valid", Count.class))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        key,
                                        "!==",
                                        env.callMethod(iterator, "key", Count.class)))) {
                    env.callMethod(iterator, "next", Count.class);
                }
            }

            return ZVal.assign(count);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Generator")
    protected Object getCountOfGenerator(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, null);
        Object count = null;
        for (count = 0;
                ZVal.isTrue(env.callMethod(generator, "valid", Count.class));
                env.callMethod(generator, "next", Count.class)) {
            count = ZVal.increment(count);
        }

        return ZVal.assign(count);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "actual size %d matches expected size %d",
                                env.callMethod(this, "getCountOf", Count.class, other),
                                toObjectR(this).accessProp(this, env).name("expectedCount").value())
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\Count";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\Count")
                    .setLookup(Count.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("expectedCount", "exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/Count.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
