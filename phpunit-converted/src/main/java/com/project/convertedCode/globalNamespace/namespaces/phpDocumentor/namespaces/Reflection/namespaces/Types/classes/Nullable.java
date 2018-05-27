package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Type;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/Nullable.php

*/

public final class Nullable extends RuntimeClassBase implements Type {

    public Object realType = null;

    public Nullable(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Nullable.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "realType", typeHint = "phpDocumentor\\Reflection\\Type")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object realType = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("realType").set(realType);
        return null;
    }

    @ConvertedMethod
    public Object getActualType(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("realType").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "?"
                        + toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("realType")
                                                .value(),
                                        "__toString",
                                        Nullable.class),
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\Nullable";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\Types\\Nullable")
                    .setLookup(Nullable.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("realType")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/Nullable.php")
                    .addInterface("Type")
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
