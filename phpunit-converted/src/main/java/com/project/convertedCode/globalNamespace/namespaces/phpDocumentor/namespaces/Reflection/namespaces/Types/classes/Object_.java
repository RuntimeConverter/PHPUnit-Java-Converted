package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Type;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
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

 vendor/phpdocumentor/type-resolver/src/Types/Object_.php

*/

public final class Object_ extends RuntimeClassBase implements Type {

    public Object fqsen = null;

    public Object_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Object_.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fqsen",
        typeHint = "phpDocumentor\\Reflection\\Fqsen",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fqsen = assignParameter(args, 0, null);
        if (ZVal.isNull(fqsen)) {
            fqsen = ZVal.getNull();
        }
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                NamespaceGlobal.strpos
                                        .env(env)
                                        .call(toStringR(fqsen, env), "::")
                                        .value(),
                                "!==",
                                false))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                NamespaceGlobal.strpos
                                        .env(env)
                                        .call(toStringR(fqsen, env), "()")
                                        .value(),
                                "!==",
                                false))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Object types can only refer to a class, interface or trait but a method, function, constant or "
                                    + "property was received: "
                                    + toStringR(toStringR(fqsen, env), env)));
        }

        toObjectR(this).accessProp(this, env).name("fqsen").set(fqsen);
        return null;
    }

    @ConvertedMethod
    public Object getFqsen(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("fqsen").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("fqsen").getBool()) {
            return ZVal.assign(
                    toStringR(toObjectR(this).accessProp(this, env).name("fqsen").value(), env));
        }

        return "object";
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\Object_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\Types\\Object_")
                    .setLookup(Object_.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("fqsen")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/Object_.php")
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
