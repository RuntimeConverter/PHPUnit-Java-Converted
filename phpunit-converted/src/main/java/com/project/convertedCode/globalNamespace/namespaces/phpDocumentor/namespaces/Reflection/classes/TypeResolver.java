package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Mixed_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.String_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Void_;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Resource_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Scalar;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Null_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.This;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Boolean;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Array_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Iterable_;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.FqsenResolver;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Compound;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Callable_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Object_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Integer;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Self_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Type;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Static_;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Float_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Parent_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Nullable;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/TypeResolver.php

*/

public final class TypeResolver extends RuntimeClassBase {

    public Object keywords =
            ZVal.newArray(
                    new ZPair("string", String_.CONST_class),
                    new ZPair("int", Integer.CONST_class),
                    new ZPair("integer", Integer.CONST_class),
                    new ZPair("bool", Boolean.CONST_class),
                    new ZPair("boolean", Boolean.CONST_class),
                    new ZPair("float", Float_.CONST_class),
                    new ZPair("double", Float_.CONST_class),
                    new ZPair("object", Object_.CONST_class),
                    new ZPair("mixed", Mixed_.CONST_class),
                    new ZPair("array", Array_.CONST_class),
                    new ZPair("resource", Resource_.CONST_class),
                    new ZPair("void", Void_.CONST_class),
                    new ZPair("null", Null_.CONST_class),
                    new ZPair("scalar", Scalar.CONST_class),
                    new ZPair("callback", Callable_.CONST_class),
                    new ZPair("callable", Callable_.CONST_class),
                    new ZPair("false", Boolean.CONST_class),
                    new ZPair("true", Boolean.CONST_class),
                    new ZPair("self", Self_.CONST_class),
                    new ZPair("$this", This.CONST_class),
                    new ZPair("static", Static_.CONST_class),
                    new ZPair("parent", Parent_.CONST_class),
                    new ZPair("iterable", Iterable_.CONST_class));

    public Object fqsenResolver = null;

    public TypeResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TypeResolver.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fqsenResolver",
        typeHint = "phpDocumentor\\Reflection\\FqsenResolver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fqsenResolver = assignParameter(args, 0, null);
        if (ZVal.isNull(fqsenResolver)) {
            fqsenResolver = ZVal.getNull();
        }
        toObjectR(this)
                .accessProp(this, env)
                .name("fqsenResolver")
                .set(ZVal.isTrue(fqsenResolver) ? fqsenResolver : new FqsenResolver(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object resolve(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        if (ZVal.isNull(context)) {
            context = ZVal.getNull();
        }
        if (!function_is_string.f.env(env).call(type).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Attempted to resolve type but it appeared not to be a string, received: "
                                    + toStringR(
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(type, true)
                                                    .value(),
                                            env)));
        }

        type = NamespaceGlobal.trim.env(env).call(type).value();
        if (!ZVal.isTrue(type)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Attempted to resolve \""
                                    + toStringR(type, env)
                                    + "\" but it appears to be empty"));
        }

        if (ZVal.strictEqualityCheck(context, "===", ZVal.getNull())) {
            context = new Context(env, "");
        }

        SwitchEnumType2 switchVariable2 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType2.DEFAULT_CASE,
                        SwitchEnumType2.DYNAMIC_TYPE_4,
                        env.callMethod(this, "isNullableType", TypeResolver.class, type),
                        SwitchEnumType2.DYNAMIC_TYPE_5,
                        env.callMethod(this, "isKeyword", TypeResolver.class, type),
                        SwitchEnumType2.DYNAMIC_TYPE_6,
                        env.callMethod(this, "isCompoundType", TypeResolver.class, type),
                        SwitchEnumType2.DYNAMIC_TYPE_7,
                        env.callMethod(this, "isTypedArray", TypeResolver.class, type),
                        SwitchEnumType2.DYNAMIC_TYPE_8,
                        env.callMethod(this, "isFqsen", TypeResolver.class, type),
                        SwitchEnumType2.DYNAMIC_TYPE_9,
                        env.callMethod(
                                this, "isPartialStructuralElementName", TypeResolver.class, type));
        switch (switchVariable2) {
            case DYNAMIC_TYPE_4:
                return ZVal.assign(
                        env.callMethod(
                                this, "resolveNullableType", TypeResolver.class, type, context));
            case DYNAMIC_TYPE_5:
                return ZVal.assign(
                        env.callMethod(this, "resolveKeyword", TypeResolver.class, type));
            case DYNAMIC_TYPE_6:
                return ZVal.assign(
                        env.callMethod(
                                this, "resolveCompoundType", TypeResolver.class, type, context));
            case DYNAMIC_TYPE_7:
                return ZVal.assign(
                        env.callMethod(
                                this, "resolveTypedArray", TypeResolver.class, type, context));
            case DYNAMIC_TYPE_8:
                return ZVal.assign(
                        env.callMethod(this, "resolveTypedObject", TypeResolver.class, type));
            case DYNAMIC_TYPE_9:
                return ZVal.assign(
                        env.callMethod(
                                this, "resolveTypedObject", TypeResolver.class, type, context));
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Unable to resolve type \""
                                        + toStringR(type, env)
                                        + "\", there is no known method to resolve it"));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyword")
    @ConvertedParameter(index = 1, name = "typeClassName")
    public Object addKeyword(RuntimeEnv env, Object... args) {
        Object keyword = assignParameter(args, 0, null);
        Object typeClassName = assignParameter(args, 1, null);
        if (!function_class_exists.f.env(env).call(typeClassName).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The Value Object that needs to be created with a keyword \""
                                    + toStringR(keyword, env)
                                    + "\" must be an existing class"
                                    + " but we could not find the class "
                                    + toStringR(typeClassName, env)));
        }

        if (!CRArrayF.in_array
                .env(env)
                .call(
                        Type.CONST_class,
                        NamespaceGlobal.class_implements.env(env).call(typeClassName).value())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The class \""
                                    + toStringR(typeClassName, env)
                                    + "\" must implement the interface \"phpDocumentor\\Reflection\\Type\""));
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("keywords").value(),
                keyword,
                typeClassName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isTypedArray(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        NamespaceGlobal.substr.env(env).call(type, -2).value(),
                        "===",
                        CONST_OPERATOR_ARRAY));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isKeyword(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        return ZVal.assign(
                CRArrayF.in_array
                        .env(env)
                        .call(
                                NamespaceGlobal.strtolower.env(env).call(type).value(),
                                CRArrayF.array_keys
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("keywords")
                                                        .value())
                                        .value(),
                                true)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isPartialStructuralElementName(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        if (ZVal.isNull(type)) {
            type = ZVal.newArray();
        }
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.getElement(type, 0), "!==", CONST_OPERATOR_NAMESPACE))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                this, "isKeyword", TypeResolver.class, type))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isFqsen(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        NamespaceGlobal.strpos
                                .env(env)
                                .call(type, CONST_OPERATOR_NAMESPACE)
                                .value(),
                        "===",
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isCompoundType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        NamespaceGlobal.strpos.env(env).call(type, "|").value(), "!==", false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isNullableType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        if (ZVal.isNull(type)) {
            type = ZVal.newArray();
        }
        return ZVal.assign(ZVal.strictEqualityCheck(ZVal.getElement(type, 0), "===", "?"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object resolveTypedArray(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        return ZVal.assign(
                new Array_(
                        env,
                        env.callMethod(
                                this,
                                "resolve",
                                TypeResolver.class,
                                NamespaceGlobal.substr.env(env).call(type, 0, -2).value(),
                                context)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object resolveKeyword(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object className = null;
        className =
                ZVal.assign(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("keywords").value(),
                                NamespaceGlobal.strtolower.env(env).call(type).value()));
        return ZVal.assign(env.createNew(className));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object resolveTypedObject(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        if (ZVal.isNull(context)) {
            context = ZVal.getNull();
        }
        return ZVal.assign(
                new Object_(
                        env,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("fqsenResolver").value(),
                                "resolve",
                                TypeResolver.class,
                                type,
                                context)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object resolveCompoundType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        Object types = ZVal.newArray();
        Object part = null;
        types = ZVal.newArray();
        for (ZPair zpairResult43 :
                ZVal.getIterable(
                        NamespaceGlobal.explode.env(env).call("|", type).value(), env, true)) {
            part = ZVal.assign(zpairResult43.getValue());
            ZVal.addToArray(
                    types, env.callMethod(this, "resolve", TypeResolver.class, part, context));
        }

        return ZVal.assign(new Compound(env, types));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object resolveNullableType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        return ZVal.assign(
                new Nullable(
                        env,
                        env.callMethod(
                                this,
                                "resolve",
                                TypeResolver.class,
                                NamespaceGlobal.ltrim.env(env).call(type, "?").value(),
                                context)));
    }

    public static final Object CONST_OPERATOR_ARRAY = "[]";

    public static final Object CONST_OPERATOR_NAMESPACE = "\\";

    public static final Object CONST_class = "phpDocumentor\\Reflection\\TypeResolver";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\TypeResolver")
                    .setLookup(TypeResolver.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("fqsenResolver", "keywords")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/TypeResolver.php")
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

    private enum SwitchEnumType2 {
        DYNAMIC_TYPE_4,
        DYNAMIC_TYPE_5,
        DYNAMIC_TYPE_6,
        DYNAMIC_TYPE_7,
        DYNAMIC_TYPE_8,
        DYNAMIC_TYPE_9,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
