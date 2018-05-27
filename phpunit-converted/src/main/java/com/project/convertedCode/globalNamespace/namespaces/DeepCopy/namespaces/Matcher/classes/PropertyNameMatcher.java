package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Matcher.classes.Matcher;
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

 vendor/myclabs/deep-copy/src/DeepCopy/Matcher/PropertyNameMatcher.php

*/

public class PropertyNameMatcher extends RuntimeClassBase implements Matcher {

    public Object property = null;

    public PropertyNameMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PropertyNameMatcher.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("property").set(property);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "property")
    public Object matches(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        Object property = assignParameter(args, 1, null);
        return ZVal.assign(
                ZVal.equalityCheck(
                        property, toObjectR(this).accessProp(this, env).name("property").value()));
    }

    public static final Object CONST_class = "DeepCopy\\Matcher\\PropertyNameMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\Matcher\\PropertyNameMatcher")
                    .setLookup(PropertyNameMatcher.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("property")
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/Matcher/PropertyNameMatcher.php")
                    .addInterface("Matcher")
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
