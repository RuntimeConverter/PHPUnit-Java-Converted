package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Filter.namespaces.Doctrine.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Reflection.classes.ReflectionHelper;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Filter.classes.Filter;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/Filter/Doctrine/DoctrineCollectionFilter.php

*/

public class DoctrineCollectionFilter extends RuntimeClassBase implements Filter {

    public DoctrineCollectionFilter(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "property")
    @ConvertedParameter(index = 2, name = "objectCopier")
    public Object apply(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        Object property = assignParameter(args, 1, null);
        Object objectCopier = assignParameter(args, 2, null);
        Object newCollection = null;
        Object reflectionProperty = null;
        Object oldCollection = null;
        reflectionProperty =
                ReflectionHelper.runtimeStaticObject.getProperty(env, _object, property);
        env.callMethod(reflectionProperty, "setAccessible", DoctrineCollectionFilter.class, true);
        oldCollection =
                env.callMethod(
                        reflectionProperty, "getValue", DoctrineCollectionFilter.class, _object);
        newCollection =
                env.callMethod(
                        oldCollection,
                        "map",
                        DoctrineCollectionFilter.class,
                        new Closure(env) {
                            @Override
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer item =
                                        new BasicReferenceContainer(assignParameter(args, 0, null));
                                Object objectCopier = null;
                                objectCopier =
                                        this.contextReferences.getCapturedValue("objectCopier");
                                return ZVal.assign(
                                        env.callFunctionDynamic(
                                                        objectCopier,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, item),
                                                        item.getObject())
                                                .value());
                            }
                        }.use("objectCopier", objectCopier));
        env.callMethod(
                reflectionProperty,
                "setValue",
                DoctrineCollectionFilter.class,
                _object,
                newCollection);
        return null;
    }

    public static final Object CONST_class = "DeepCopy\\Filter\\Doctrine\\DoctrineCollectionFilter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\Filter\\Doctrine\\DoctrineCollectionFilter")
                    .setLookup(
                            DoctrineCollectionFilter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/Filter/Doctrine/DoctrineCollectionFilter.php")
                    .addInterface("Filter")
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
