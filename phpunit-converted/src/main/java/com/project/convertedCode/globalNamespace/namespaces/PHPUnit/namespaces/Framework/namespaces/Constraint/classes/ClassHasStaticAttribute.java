package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ClassHasAttribute;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/ClassHasStaticAttribute.php

*/

public class ClassHasStaticAttribute extends ClassHasAttribute {

    public ClassHasStaticAttribute(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassHasStaticAttribute.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "has static attribute \"%s\"",
                                env.callMethod(
                                        this, "attributeName", ClassHasStaticAttribute.class))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object attribute = null;
        Object _pClass = null;
        _pClass = new ReflectionClass(env, other);
        if (ZVal.isTrue(
                env.callMethod(
                        _pClass,
                        "hasProperty",
                        ClassHasStaticAttribute.class,
                        env.callMethod(this, "attributeName", ClassHasStaticAttribute.class)))) {
            attribute =
                    env.callMethod(
                            _pClass,
                            "getProperty",
                            ClassHasStaticAttribute.class,
                            env.callMethod(this, "attributeName", ClassHasStaticAttribute.class));
            return ZVal.assign(
                    env.callMethod(attribute, "isStatic", ClassHasStaticAttribute.class));
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\Constraint\\ClassHasStaticAttribute";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ClassHasAttribute.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\ClassHasStaticAttribute")
                    .setLookup(
                            ClassHasStaticAttribute.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("attributeName", "exporter")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/ClassHasStaticAttribute.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\ClassHasAttribute")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
