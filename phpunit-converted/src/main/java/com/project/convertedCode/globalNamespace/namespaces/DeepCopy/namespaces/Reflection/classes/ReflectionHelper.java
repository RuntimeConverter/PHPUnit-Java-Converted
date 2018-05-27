package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Exception.classes.PropertyException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/Reflection/ReflectionHelper.php

*/

public class ReflectionHelper extends RuntimeClassBase {

    public ReflectionHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "DeepCopy\\Reflection\\ReflectionHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "ref", typeHint = "ReflectionClass")
        public Object getProperties(RuntimeEnv env, Object... args) {
            Object ref = assignParameter(args, 0, null);
            Object propsArr = ZVal.newArray();
            Object propertyName = null;
            Object prop = null;
            Object property = null;
            Object parentPropsArr = ZVal.newArray();
            Object parentClass = null;
            Object key = null;
            Object props = null;
            props = env.callMethod(ref, "getProperties", ReflectionHelper.class);
            propsArr = ZVal.newArray();
            for (ZPair zpairResult15 : ZVal.getIterable(props, env, true)) {
                prop = ZVal.assign(zpairResult15.getValue());
                propertyName = env.callMethod(prop, "getName", ReflectionHelper.class);
                ZVal.putArrayElement(propsArr, propertyName, prop);
            }

            if (ZVal.isTrue(
                    parentClass = env.callMethod(ref, "getParentClass", ReflectionHelper.class))) {
                parentPropsArr = runtimeStaticObject.getProperties(env, parentClass);
                for (ZPair zpairResult16 : ZVal.getIterable(propsArr, env, false)) {
                    key = ZVal.assign(zpairResult16.getKey());
                    property = ZVal.assign(zpairResult16.getValue());
                    ZVal.putArrayElement(parentPropsArr, key, property);
                }

                return ZVal.assign(parentPropsArr);
            }

            return ZVal.assign(propsArr);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        @ConvertedParameter(index = 1, name = "name")
        public Object getProperty(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, null);
            Object name = assignParameter(args, 1, null);
            Object reflection = null;
            Object parentClass = null;
            reflection =
                    ZVal.assign(
                            function_is_object.f.env(env).call(_object).getBool()
                                    ? new ReflectionObject(env, _object)
                                    : new ReflectionClass(env, _object));
            if (ZVal.isTrue(
                    env.callMethod(reflection, "hasProperty", ReflectionHelper.class, name))) {
                return ZVal.assign(
                        env.callMethod(reflection, "getProperty", ReflectionHelper.class, name));
            }

            if (ZVal.isTrue(
                    parentClass =
                            env.callMethod(reflection, "getParentClass", ReflectionHelper.class))) {
                return ZVal.assign(
                        runtimeStaticObject.getProperty(
                                env,
                                env.callMethod(parentClass, "getName", ReflectionHelper.class),
                                name));
            }

            throw ZVal.getException(
                    env,
                    new PropertyException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "The class \"%s\" doesn't have a property with the given name: \"%s\".",
                                            function_is_object.f.env(env).call(_object).getBool()
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(_object)
                                                            .value()
                                                    : _object,
                                            name)
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\Reflection\\ReflectionHelper")
                    .setLookup(ReflectionHelper.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/Reflection/ReflectionHelper.php")
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
