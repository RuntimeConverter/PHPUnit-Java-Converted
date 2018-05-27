package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.GroupFilterIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
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

 vendor/phpunit/phpunit/src/Runner/Filter/ExcludeGroupFilterIterator.php

*/

public class ExcludeGroupFilterIterator extends GroupFilterIterator {

    public ExcludeGroupFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExcludeGroupFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hash", typeHint = "string")
    protected Object doAccept(RuntimeEnv env, Object... args) {
        Object hash = assignParameter(args, 0, null);
        return ZVal.assign(
                !CRArrayF.in_array
                        .env(env)
                        .call(
                                hash,
                                toObjectR(this).accessProp(this, env).name("groupTests").value())
                        .getBool());
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\Filter\\ExcludeGroupFilterIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GroupFilterIterator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\Filter\\ExcludeGroupFilterIterator")
                    .setLookup(
                            ExcludeGroupFilterIterator.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("groupTests")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Runner/Filter/ExcludeGroupFilterIterator.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addInterface("OuterIterator")
                    .addInterface("RecursiveIterator")
                    .addExtendsClass("PHPUnit\\Runner\\Filter\\GroupFilterIterator")
                    .addExtendsClass("RecursiveFilterIterator")
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
