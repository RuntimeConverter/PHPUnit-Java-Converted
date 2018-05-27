package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes.TypeHintReference;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/MethodNode.php

*/

public class MethodNode extends RuntimeClassBase {

    public Object name = null;

    public Object code = null;

    public Object visibility = "public";

    public Object _pStatic = false;

    public Object returnsReference = false;

    public Object returnType = null;

    public Object nullableReturnType = false;

    public Object arguments = ZVal.newArray();

    public Object typeHintReference = null;

    public MethodNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodNode.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "code",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "typeHintReference",
        typeHint = "Prophecy\\Doubler\\Generator\\TypeHintReference",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object code = assignParameter(args, 1, null);
        if (ZVal.isNull(code)) {
            code = ZVal.getNull();
        }
        Object typeHintReference = assignParameter(args, 2, null);
        if (ZVal.isNull(typeHintReference)) {
            typeHintReference = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("name").set(name);
        toObjectR(this).accessProp(this, env).name("code").set(code);
        toObjectR(this)
                .accessProp(this, env)
                .name("typeHintReference")
                .set(
                        ZVal.isTrue(typeHintReference)
                                ? typeHintReference
                                : new TypeHintReference(env));
        return null;
    }

    @ConvertedMethod
    public Object getVisibility(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("visibility").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args) {
        Object visibility = assignParameter(args, 0, null);
        visibility = NamespaceGlobal.strtolower.env(env).call(visibility).value();
        if (!CRArrayF.in_array
                .env(env)
                .call(
                        visibility,
                        ZVal.newArray(
                                new ZPair(0, "public"),
                                new ZPair(1, "private"),
                                new ZPair(2, "protected")))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("`%s` method visibility is not supported.", visibility)
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("visibility").set(visibility);
        return null;
    }

    @ConvertedMethod
    public Object isStatic(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("static").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "static",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setStatic(RuntimeEnv env, Object... args) {
        Object _pStatic = assignParameter(args, 0, null);
        if (ZVal.isNull(_pStatic)) {
            _pStatic = true;
        }
        toObjectR(this).accessProp(this, env).name("static").set(ZVal.toBool(_pStatic));
        return null;
    }

    @ConvertedMethod
    public Object returnsReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("returnsReference").value());
    }

    @ConvertedMethod
    public Object setReturnsReference(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("returnsReference").set(true);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "argument",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ArgumentNode"
    )
    public Object addArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, null);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("arguments").value(), argument);
        return null;
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("arguments").value());
    }

    @ConvertedMethod
    public Object hasReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        ZVal.getNull(),
                        "!==",
                        toObjectR(this).accessProp(this, env).name("returnType").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setReturnType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        if (ZVal.isNull(type)) {
            type = ZVal.getNull();
        }
        Object typeMap = ZVal.newArray();
        if (ZVal.toBool(ZVal.strictEqualityCheck(type, "===", ""))
                || ZVal.toBool(ZVal.strictEqualityCheck(type, "===", ZVal.getNull()))) {
            toObjectR(this).accessProp(this, env).name("returnType").set(ZVal.getNull());
            return null;
        }

        typeMap =
                ZVal.newArray(
                        new ZPair("double", "float"),
                        new ZPair("real", "float"),
                        new ZPair("boolean", "bool"),
                        new ZPair("integer", "int"));
        if (ZVal.isset(ZVal.getElement(typeMap, type))) {
            type = ZVal.assign(ZVal.getElement(typeMap, type));
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("returnType")
                .set(
                        ZVal.isTrue(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("typeHintReference")
                                                        .value(),
                                                "isBuiltInReturnTypeHint",
                                                MethodNode.class,
                                                type))
                                ? type
                                : "\\"
                                        + toStringR(
                                                NamespaceGlobal.ltrim
                                                        .env(env)
                                                        .call(type, "\\")
                                                        .value(),
                                                env));
        return null;
    }

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("returnType").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setNullableReturnType(RuntimeEnv env, Object... args) {
        Object bool = assignParameter(args, 0, null);
        if (ZVal.isNull(bool)) {
            bool = true;
        }
        toObjectR(this).accessProp(this, env).name("nullableReturnType").set(ZVal.toBool(bool));
        return null;
    }

    @ConvertedMethod
    public Object hasNullableReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("nullableReturnType").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object setCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("code").set(code);
        return null;
    }

    @ConvertedMethod
    public Object getCode(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("returnsReference").getBool()) {
            return ZVal.assign(
                    "throw new \\Prophecy\\Exception\\Doubler\\ReturnByReferenceException('Returning by reference not supported', get_class($this), '"
                            + toStringR(
                                    toObjectR(this).accessProp(this, env).name("name").value(), env)
                            + "');");
        }

        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("code").value(), env));
    }

    @ConvertedMethod
    public Object useParentCode(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("code")
                .set(
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "return parent::%s(%s);",
                                        env.callMethod(this, "getName", MethodNode.class),
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(
                                                        ", ",
                                                        CRArrayF.array_map
                                                                .env(env)
                                                                .call(
                                                                        ZVal.newArray(
                                                                                new ZPair(0, this),
                                                                                new ZPair(
                                                                                        1,
                                                                                        "generateArgument")),
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("arguments")
                                                                                .value())
                                                                .value())
                                                .value())
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "arg",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ArgumentNode"
    )
    private Object generateArgument(RuntimeEnv env, Object... args) {
        Object arg = assignParameter(args, 0, null);
        Object argument = null;
        argument = "$" + toStringR(env.callMethod(arg, "getName", MethodNode.class), env);
        if (ZVal.isTrue(env.callMethod(arg, "isVariadic", MethodNode.class))) {
            argument = "..." + toStringR(argument, env);
        }

        return ZVal.assign(argument);
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\Node\\MethodNode";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\Node\\MethodNode")
                    .setLookup(MethodNode.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "arguments",
                            "code",
                            "name",
                            "nullableReturnType",
                            "returnType",
                            "returnsReference",
                            "static",
                            "typeHintReference",
                            "visibility")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/MethodNode.php")
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
