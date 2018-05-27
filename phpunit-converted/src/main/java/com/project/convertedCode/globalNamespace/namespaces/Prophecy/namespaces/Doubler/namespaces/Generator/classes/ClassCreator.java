package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.ClassCreatorException;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes.ClassCodeGenerator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassCreator.php

*/

public class ClassCreator extends RuntimeClassBase {

    public Object generator = null;

    public ClassCreator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassCreator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "generator",
        typeHint = "Prophecy\\Doubler\\Generator\\ClassCodeGenerator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, null);
        if (ZVal.isNull(generator)) {
            generator = ZVal.getNull();
        }
        toObjectR(this)
                .accessProp(this, env)
                .name("generator")
                .set(ZVal.isTrue(generator) ? generator : new ClassCodeGenerator(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classname")
    @ConvertedParameter(
        index = 1,
        name = "class",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object classname = assignParameter(args, 0, null);
        Object _pClass = assignParameter(args, 1, null);
        Object code = null;
        Object _pReturn = null;
        code =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "generate",
                        ClassCreator.class,
                        classname,
                        _pClass);
        _pReturn =
                com.runtimeconverter.runtime.ZVal.functionNotFound("eval222")
                        .env(env)
                        .call(code)
                        .value();
        if (!function_class_exists.f.env(env).call(classname, false).getBool()) {
            if (CRArrayF.count
                    .env(env)
                    .call(env.callMethod(_pClass, "getInterfaces", ClassCreator.class))
                    .getBool()) {
                throw ZVal.getException(
                        env,
                        new ClassCreatorException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Could not double `%s` and implement interfaces: [%s].",
                                                env.callMethod(
                                                        _pClass,
                                                        "getParentClass",
                                                        ClassCreator.class),
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                ", ",
                                                                env.callMethod(
                                                                        _pClass,
                                                                        "getInterfaces",
                                                                        ClassCreator.class))
                                                        .value())
                                        .value(),
                                _pClass));
            }

            throw ZVal.getException(
                    env,
                    new ClassCreatorException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Could not double `%s`.",
                                            env.callMethod(
                                                    _pClass, "getParentClass", ClassCreator.class))
                                    .value(),
                            _pClass));
        }

        return ZVal.assign(_pReturn);
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\ClassCreator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\ClassCreator")
                    .setLookup(ClassCreator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("generator")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassCreator.php")
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
