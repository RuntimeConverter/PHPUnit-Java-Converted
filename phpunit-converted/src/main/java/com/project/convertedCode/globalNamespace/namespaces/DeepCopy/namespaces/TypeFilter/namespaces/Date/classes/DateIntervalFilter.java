package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.namespaces.Date.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.classes.TypeFilter;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Date/DateIntervalFilter.php

*/

public class DateIntervalFilter extends RuntimeClassBase implements TypeFilter {

    public DateIntervalFilter(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element")
    public Object apply(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, null);
        Object propertyName = null;
        Object propertyValue = null;
        Object copy = null;
        copy = new DateInterval(env, "P0D");
        for (ZPair zpairResult17 : ZVal.getIterable(element, env, false)) {
            propertyName = ZVal.assign(zpairResult17.getKey());
            propertyValue = ZVal.assign(zpairResult17.getValue());
            toObjectR(copy).accessProp(this, env).name(propertyName).set(propertyValue);
        }

        return ZVal.assign(copy);
    }

    public static final Object CONST_class = "DeepCopy\\TypeFilter\\Date\\DateIntervalFilter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\TypeFilter\\Date\\DateIntervalFilter")
                    .setLookup(DateIntervalFilter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Date/DateIntervalFilter.php")
                    .addInterface("TypeFilter")
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
