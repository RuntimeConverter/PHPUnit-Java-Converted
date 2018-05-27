package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Param.php

*/

public final class Param extends BaseTag implements StaticMethod {

    public Object name = "param";

    public Object type = null;

    public Object variableName = "";

    public Object isVariadic = false;

    public Param(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Param.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variableName")
    @ConvertedParameter(
        index = 1,
        name = "type",
        typeHint = "phpDocumentor\\Reflection\\Type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "isVariadic",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object variableName = assignParameter(args, 0, null);
        Object type = assignParameter(args, 1, null);
        if (ZVal.isNull(type)) {
            type = ZVal.getNull();
        }
        Object isVariadic = assignParameter(args, 2, null);
        if (ZVal.isNull(isVariadic)) {
            isVariadic = false;
        }
        Object description = assignParameter(args, 3, null);
        if (ZVal.isNull(description)) {
            description = ZVal.getNull();
        }
        Assert.runtimeStaticObject.string(env, variableName);
        Assert.runtimeStaticObject._pBoolean(env, isVariadic);
        toObjectR(this).accessProp(this, env).name("variableName").set(variableName);
        toObjectR(this).accessProp(this, env).name("type").set(type);
        toObjectR(this).accessProp(this, env).name("isVariadic").set(isVariadic);
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getVariableName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("variableName").value());
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("type").value());
    }

    @ConvertedMethod
    public Object isVariadic(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("isVariadic").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                                toObjectR(this).accessProp(this, env).name("type").getBool()
                                        ? toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("type")
                                                                .value(),
                                                        env)
                                                + " "
                                        : "",
                                env)
                        + toStringR(
                                ZVal.isTrue(env.callMethod(this, "isVariadic", Param.class))
                                        ? "..."
                                        : "",
                                env)
                        + "$"
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("variableName").value(),
                                env)
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("description").getBool()
                                        ? " "
                                                + toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("description")
                                                                .value(),
                                                        env)
                                        : "",
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Param";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        @ConvertedParameter(
            index = 1,
            name = "typeResolver",
            typeHint = "phpDocumentor\\Reflection\\TypeResolver",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "descriptionFactory",
            typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "context",
            typeHint = "phpDocumentor\\Reflection\\Types\\Context",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, null);
            Object typeResolver = assignParameter(args, 1, null);
            if (ZVal.isNull(typeResolver)) {
                typeResolver = ZVal.getNull();
            }
            Object descriptionFactory = assignParameter(args, 2, null);
            if (ZVal.isNull(descriptionFactory)) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 3, null);
            if (ZVal.isNull(context)) {
                context = ZVal.getNull();
            }
            Object variableName = null;
            Object isVariadic = null;
            Object parts = ZVal.newArray();
            Object description = null;
            Object type = null;
            Assert.runtimeStaticObject.stringNotEmpty(env, body);
            Assert.runtimeStaticObject.__callStatic(
                    env,
                    "allNotNull",
                    ZVal.indexedArray(
                            ZVal.newArray(
                                    new ZPair(0, typeResolver), new ZPair(1, descriptionFactory))));
            parts = NamespaceGlobal.preg_split.env(env).call("/(\\s+)/Su", body, 3, 2).value();
            type = ZVal.getNull();
            variableName = "";
            isVariadic = false;
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.isset(ZVal.getElement(parts, 0)))
                                    && ZVal.toBool(
                                            ZVal.isGreaterThan(
                                                    NamespaceGlobal.strlen
                                                            .env(env)
                                                            .call(ZVal.getElement(parts, 0))
                                                            .value(),
                                                    '>',
                                                    0)))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    ZVal.getElementRecursive(parts, 0, 0), "!==", "$"))) {
                type =
                        env.callMethod(
                                typeResolver,
                                "resolve",
                                Param.class,
                                CRArrayF.array_shift.env(env).call(parts).value(),
                                context);
                CRArrayF.array_shift.env(env).call(parts);
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.isset(ZVal.getElement(parts, 0)))
                                    && ZVal.toBool(
                                            ZVal.isGreaterThan(
                                                    NamespaceGlobal.strlen
                                                            .env(env)
                                                            .call(ZVal.getElement(parts, 0))
                                                            .value(),
                                                    '>',
                                                    0)))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    ZVal.getElementRecursive(parts, 0, 0),
                                                    "===",
                                                    "$"))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    NamespaceGlobal.substr
                                                            .env(env)
                                                            .call(ZVal.getElement(parts, 0), 0, 4)
                                                            .value(),
                                                    "===",
                                                    "...$")))) {
                variableName = CRArrayF.array_shift.env(env).call(parts).value();
                CRArrayF.array_shift.env(env).call(parts);
                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.substr.env(env).call(variableName, 0, 3).value(),
                        "===",
                        "...")) {
                    isVariadic = true;
                    variableName = NamespaceGlobal.substr.env(env).call(variableName, 3).value();
                }

                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.substr.env(env).call(variableName, 0, 1).value(),
                        "===",
                        "$")) {
                    variableName = NamespaceGlobal.substr.env(env).call(variableName, 1).value();
                }
            }

            description =
                    env.callMethod(
                            descriptionFactory,
                            "create",
                            Param.class,
                            NamespaceGlobal.implode.env(env).call("", parts).value(),
                            context);
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, variableName, type, isVariadic, description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Param")
                    .setLookup(Param.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "description", "isVariadic", "name", "name", "type", "variableName")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Param.php")
                    .addInterface("StaticMethod")
                    .addInterface("Tag")
                    .addExtendsClass("phpDocumentor\\Reflection\\DocBlock\\Tags\\BaseTag")
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
