package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Mixed_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.String_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Compound;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Integer;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Type;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/Array_.php

*/

public final class Array_ extends RuntimeClassBase implements Type {

    public Object valueType = null;

    public Object keyType = null;

    public Array_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Array_.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "valueType",
        typeHint = "phpDocumentor\\Reflection\\Type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "keyType",
        typeHint = "phpDocumentor\\Reflection\\Type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object valueType = assignParameter(args, 0, null);
        if (ZVal.isNull(valueType)) {
            valueType = ZVal.getNull();
        }
        Object keyType = assignParameter(args, 1, null);
        if (ZVal.isNull(keyType)) {
            keyType = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(keyType, "===", ZVal.getNull())) {
            keyType =
                    new Compound(
                            env,
                            ZVal.newArray(
                                    new ZPair(0, new String_(env)),
                                    new ZPair(1, new Integer(env))));
        }

        if (ZVal.strictEqualityCheck(valueType, "===", ZVal.getNull())) {
            valueType = new Mixed_(env);
        }

        toObjectR(this).accessProp(this, env).name("valueType").set(valueType);
        toObjectR(this).accessProp(this, env).name("keyType").set(keyType);
        return null;
    }

    @ConvertedMethod
    public Object getKeyType(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("keyType").value());
    }

    @ConvertedMethod
    public Object getValueType(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("valueType").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(this).accessProp(this, env).name("valueType").value(),
                        Mixed_.class,
                        "phpDocumentor\\Reflection\\Types\\Mixed_"))) {
            return "array";
        }

        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("valueType").value(), env)
                        + "[]");
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\Array_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\Types\\Array_")
                    .setLookup(Array_.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("keyType", "valueType")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/Array_.php")
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
