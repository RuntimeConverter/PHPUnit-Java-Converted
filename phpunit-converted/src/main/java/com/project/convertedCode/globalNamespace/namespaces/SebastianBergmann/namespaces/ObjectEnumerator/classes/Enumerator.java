package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectEnumerator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes.Context;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectReflector.classes.ObjectReflector;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectEnumerator.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/object-enumerator/src/Enumerator.php

*/

public class Enumerator extends RuntimeClassBase {

    public Enumerator(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variable")
    public Object enumerate(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer variable = new BasicReferenceContainer(assignParameter(args, 0, null));
        Object processed = null;
        Object array = null;
        Object reflector = null;
        Object objects = ZVal.newArray();
        Object value = null;
        Object element = null;
        if (ZVal.toBool(!function_is_array.f.env(env).call(variable.getObject()).getBool())
                && ZVal.toBool(
                        !function_is_object.f.env(env).call(variable.getObject()).getBool())) {
            throw ZVal.getException(env, new InvalidArgumentException(env));
        }

        if (ZVal.isset(ZVal.getElement(NamespaceGlobal.func_get_args.env(env).call().value(), 1))) {
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            ZVal.getElement(
                                    NamespaceGlobal.func_get_args.env(env).call().value(), 1),
                            Context.class,
                            "SebastianBergmann\\RecursionContext\\Context"))) {
                throw ZVal.getException(env, new InvalidArgumentException(env));
            }

            processed =
                    ZVal.assign(
                            ZVal.getElement(
                                    NamespaceGlobal.func_get_args.env(env).call().value(), 1));

        } else {
            processed = new Context(env);
        }

        objects = ZVal.newArray();
        if (ZVal.isTrue(
                env.callMethod(
                        processed,
                        new RuntimeArgsWithReferences().add(0, variable),
                        "contains",
                        Enumerator.class,
                        variable.getObject()))) {
            return ZVal.assign(objects);
        }

        array = ZVal.assign(variable.getObject());
        env.callMethod(
                processed,
                new RuntimeArgsWithReferences().add(0, variable),
                "add",
                Enumerator.class,
                variable.getObject());
        if (function_is_array.f.env(env).call(variable.getObject()).getBool()) {
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult483 : ZVal.getIterable(array, env, true)) {
                element = ZVal.assign(zpairResult483.getValue());
                if (ZVal.toBool(!function_is_array.f.env(env).call(element).getBool())
                        && ZVal.toBool(!function_is_object.f.env(env).call(element).getBool())) {
                    continue;
                }

                objects =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        objects,
                                        env.callMethod(
                                                this,
                                                "enumerate",
                                                Enumerator.class,
                                                element,
                                                processed))
                                .value();
            }

        } else {
            ZVal.addToArray(objects, variable.getObject());
            reflector = new ObjectReflector(env);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult484 :
                    ZVal.getIterable(
                            env.callMethod(
                                    reflector,
                                    "getAttributes",
                                    Enumerator.class,
                                    variable.getObject()),
                            env,
                            true)) {
                value = ZVal.assign(zpairResult484.getValue());
                if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                        && ZVal.toBool(!function_is_object.f.env(env).call(value).getBool())) {
                    continue;
                }

                objects =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        objects,
                                        env.callMethod(
                                                this,
                                                "enumerate",
                                                Enumerator.class,
                                                value,
                                                processed))
                                .value();
            }
        }

        return ZVal.assign(objects);
    }

    public static final Object CONST_class = "SebastianBergmann\\ObjectEnumerator\\Enumerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\ObjectEnumerator\\Enumerator")
                    .setLookup(Enumerator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/object-enumerator/src/Enumerator.php")
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
