package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Filter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Filter.classes.Filter;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Reflection.classes.ReflectionHelper;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/Filter/SetNullFilter.php

*/

public class SetNullFilter extends RuntimeClassBase implements Filter {

    public SetNullFilter(RuntimeEnv env, Object... args) {
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
        Object reflectionProperty = null;
        reflectionProperty =
                ReflectionHelper.runtimeStaticObject.getProperty(env, _object, property);
        env.callMethod(reflectionProperty, "setAccessible", SetNullFilter.class, true);
        env.callMethod(
                reflectionProperty, "setValue", SetNullFilter.class, _object, ZVal.getNull());
        return null;
    }

    public static final Object CONST_class = "DeepCopy\\Filter\\SetNullFilter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\Filter\\SetNullFilter")
                    .setLookup(SetNullFilter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/myclabs/deep-copy/src/DeepCopy/Filter/SetNullFilter.php")
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
