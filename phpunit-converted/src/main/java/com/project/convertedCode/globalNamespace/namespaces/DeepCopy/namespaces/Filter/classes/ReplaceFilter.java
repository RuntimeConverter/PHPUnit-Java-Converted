package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Filter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Filter.classes.Filter;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Reflection.classes.ReflectionHelper;
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

 vendor/myclabs/deep-copy/src/DeepCopy/Filter/ReplaceFilter.php

*/

public class ReplaceFilter extends RuntimeClassBase implements Filter {

    public Object callback = null;

    public ReplaceFilter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReplaceFilter.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callable", typeHint = "callable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object callable = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("callback").set(callable);
        return null;
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
        Object value = null;
        reflectionProperty =
                ReflectionHelper.runtimeStaticObject.getProperty(env, _object, property);
        env.callMethod(reflectionProperty, "setAccessible", ReplaceFilter.class, true);
        value =
                function_call_user_func
                        .f
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("callback").value(),
                                env.callMethod(
                                        reflectionProperty,
                                        "getValue",
                                        ReplaceFilter.class,
                                        _object))
                        .value();
        env.callMethod(reflectionProperty, "setValue", ReplaceFilter.class, _object, value);
        return null;
    }

    public static final Object CONST_class = "DeepCopy\\Filter\\ReplaceFilter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\Filter\\ReplaceFilter")
                    .setLookup(ReplaceFilter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("callback")
                    .setFilename("vendor/myclabs/deep-copy/src/DeepCopy/Filter/ReplaceFilter.php")
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
