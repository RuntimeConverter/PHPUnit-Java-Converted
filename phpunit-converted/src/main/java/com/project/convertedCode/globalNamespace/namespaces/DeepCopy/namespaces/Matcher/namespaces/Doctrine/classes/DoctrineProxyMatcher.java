package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Matcher.namespaces.Doctrine.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Matcher.classes.Matcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/Matcher/Doctrine/DoctrineProxyMatcher.php

*/

public class DoctrineProxyMatcher extends RuntimeClassBase implements Matcher {

    public DoctrineProxyMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "property")
    public Object matches(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        Object property = assignParameter(args, 1, null);
        return ZVal.assign(ZVal.checkInstanceType(_object, (Class) null, "Proxy"));
    }

    public static final Object CONST_class = "DeepCopy\\Matcher\\Doctrine\\DoctrineProxyMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\Matcher\\Doctrine\\DoctrineProxyMatcher")
                    .setLookup(DoctrineProxyMatcher.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/Matcher/Doctrine/DoctrineProxyMatcher.php")
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
