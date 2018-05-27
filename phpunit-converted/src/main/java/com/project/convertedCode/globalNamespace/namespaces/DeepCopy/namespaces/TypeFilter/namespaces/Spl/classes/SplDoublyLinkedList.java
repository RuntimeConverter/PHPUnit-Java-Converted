package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.namespaces.Spl.classes;

import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.namespaces.Spl.classes.SplDoublyLinkedListFilter;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedList.php

*/

public class SplDoublyLinkedList extends SplDoublyLinkedListFilter {

    public SplDoublyLinkedList(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SplDoublyLinkedList.class) {
            this.__construct(env, args);
        }
    }

    public static final Object CONST_class = "DeepCopy\\TypeFilter\\Spl\\SplDoublyLinkedList";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends SplDoublyLinkedListFilter.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\TypeFilter\\Spl\\SplDoublyLinkedList")
                    .setLookup(SplDoublyLinkedList.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("copier")
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedList.php")
                    .addInterface("TypeFilter")
                    .addExtendsClass("DeepCopy\\TypeFilter\\Spl\\SplDoublyLinkedListFilter")
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
