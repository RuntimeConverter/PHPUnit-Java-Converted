package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectReflector.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectReflector.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/object-reflector/src/ObjectReflector.php

*/

public class ObjectReflector extends RuntimeClassBase {

    public ObjectReflector(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    public Object getAttributes(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        Object name = ZVal.newArray();
        Object attributes = ZVal.newArray();
        Object className = null;
        Object value = null;
        if (!function_is_object.f.env(env).call(_object).getBool()) {
            throw ZVal.getException(env, new InvalidArgumentException(env));
        }

        attributes = ZVal.newArray();
        className = function_get_class.f.env(env).call(_object).value();
        for (ZPair zpairResult485 : ZVal.getIterable(ZVal.toArray(_object), env, false)) {
            name = ZVal.assign(zpairResult485.getKey());
            value = ZVal.assign(zpairResult485.getValue());
            name = NamespaceGlobal.explode.env(env).call("\u0000", toStringR(name, env)).value();
            if (ZVal.strictEqualityCheck(CRArrayF.count.env(env).call(name).value(), "===", 1)) {
                name = ZVal.assign(ZVal.getElement(name, 0));

            } else {
                if (ZVal.strictNotEqualityCheck(ZVal.getElement(name, 1), "!==", className)) {
                    name =
                            toStringR(ZVal.getElement(name, 1), env)
                                    + "::"
                                    + toStringR(ZVal.getElement(name, 2), env);

                } else {
                    name = ZVal.assign(ZVal.getElement(name, 2));
                }
            }

            ZVal.putArrayElement(attributes, name, value);
        }

        return ZVal.assign(attributes);
    }

    public static final Object CONST_class = "SebastianBergmann\\ObjectReflector\\ObjectReflector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\ObjectReflector\\ObjectReflector")
                    .setLookup(ObjectReflector.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/object-reflector/src/ObjectReflector.php")
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
