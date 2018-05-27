package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/IsType.php

*/

public class IsType extends Constraint {

    public Object types =
            ZVal.newArray(
                    new ZPair("array", true),
                    new ZPair("boolean", true),
                    new ZPair("bool", true),
                    new ZPair("double", true),
                    new ZPair("float", true),
                    new ZPair("integer", true),
                    new ZPair("int", true),
                    new ZPair("null", true),
                    new ZPair("numeric", true),
                    new ZPair("object", true),
                    new ZPair("real", true),
                    new ZPair("resource", true),
                    new ZPair("string", true),
                    new ZPair("scalar", true),
                    new ZPair("callable", true),
                    new ZPair("iterable", true));

    public Object type = null;

    public IsType(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsType.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        super.__construct(env);
        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("types").value(), type))) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Type specified for PHPUnit\\Framework\\Constraint\\IsType <%s> "
                                                    + "is not a valid type.",
                                            type)
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("type").set(type);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "is of type \"%s\"",
                                toObjectR(this).accessProp(this, env).name("type").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        switch (toStringR(toObjectR(this).accessProp(this, env).name("type").value())) {
            case "numeric":
                return ZVal.assign(function_is_numeric.f.env(env).call(other).value());
            case "integer":
            case "int":
                return ZVal.assign(function_is_int.f.env(env).call(other).value());
            case "double":
            case "float":
            case "real":
                return ZVal.assign(NamespaceGlobal.is_float.env(env).call(other).value());
            case "string":
                return ZVal.assign(function_is_string.f.env(env).call(other).value());
            case "boolean":
            case "bool":
                return ZVal.assign(NamespaceGlobal.is_bool.env(env).call(other).value());
            case "null":
                return ZVal.assign(ZVal.strictEqualityCheck(ZVal.getNull(), "===", other));
            case "array":
                return ZVal.assign(function_is_array.f.env(env).call(other).value());
            case "object":
                return ZVal.assign(function_is_object.f.env(env).call(other).value());
            case "resource":
                return ZVal.assign(
                        ZVal.toBool(NamespaceGlobal.is_resource.env(env).call(other).value())
                                || ZVal.toBool(
                                        function_is_string
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.get_resource_type
                                                                .env(env)
                                                                .call(other)
                                                                .value())
                                                .value()));
            case "scalar":
                return ZVal.assign(NamespaceGlobal.is_scalar.env(env).call(other).value());
            case "callable":
                return ZVal.assign(
                        NamespaceGlobal.is_callable
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call(other)
                                .value());
            case "iterable":
                return ZVal.assign(NamespaceGlobal.is_iterable.env(env).call(other).value());
        }
        ;
        return null;
    }

    public static final Object CONST_TYPE_ARRAY = "array";

    public static final Object CONST_TYPE_BOOL = "bool";

    public static final Object CONST_TYPE_FLOAT = "float";

    public static final Object CONST_TYPE_INT = "int";

    public static final Object CONST_TYPE_NULL = "null";

    public static final Object CONST_TYPE_NUMERIC = "numeric";

    public static final Object CONST_TYPE_OBJECT = "object";

    public static final Object CONST_TYPE_RESOURCE = "resource";

    public static final Object CONST_TYPE_STRING = "string";

    public static final Object CONST_TYPE_SCALAR = "scalar";

    public static final Object CONST_TYPE_CALLABLE = "callable";

    public static final Object CONST_TYPE_ITERABLE = "iterable";

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\IsType";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\IsType")
                    .setLookup(IsType.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "type", "types")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/IsType.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
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
