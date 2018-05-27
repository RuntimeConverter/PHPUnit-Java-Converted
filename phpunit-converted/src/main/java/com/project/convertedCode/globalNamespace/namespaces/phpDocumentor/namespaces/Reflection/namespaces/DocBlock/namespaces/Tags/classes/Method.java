package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Void_;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Method.php

*/

public final class Method extends BaseTag implements StaticMethod {

    public Object name = "method";

    public Object methodName = "";

    public Object arguments = ZVal.newArray();

    public Object isStatic = false;

    public Object returnType = null;

    public Method(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Method.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "returnType",
        typeHint = "phpDocumentor\\Reflection\\Type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "static",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object returnType = assignParameter(args, 2, null);
        if (ZVal.isNull(returnType)) {
            returnType = ZVal.getNull();
        }
        Object _pStatic = assignParameter(args, 3, null);
        if (ZVal.isNull(_pStatic)) {
            _pStatic = false;
        }
        Object description = assignParameter(args, 4, null);
        if (ZVal.isNull(description)) {
            description = ZVal.getNull();
        }
        Assert.runtimeStaticObject.stringNotEmpty(env, methodName);
        Assert.runtimeStaticObject._pBoolean(env, _pStatic);
        if (ZVal.strictEqualityCheck(returnType, "===", ZVal.getNull())) {
            returnType = new Void_(env);
        }

        toObjectR(this).accessProp(this, env).name("methodName").set(methodName);
        toObjectR(this)
                .accessProp(this, env)
                .name("arguments")
                .set(env.callMethod(this, "filterArguments", Method.class, arguments));
        toObjectR(this).accessProp(this, env).name("returnType").set(returnType);
        toObjectR(this).accessProp(this, env).name("isStatic").set(_pStatic);
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("methodName").value());
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("arguments").value());
    }

    @ConvertedMethod
    public Object isStatic(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("isStatic").value());
    }

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("returnType").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object argument = ZVal.newArray();
        Object arguments = ZVal.newArray();
        arguments = ZVal.newArray();
        for (ZPair zpairResult38 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("arguments").value(),
                        env,
                        true)) {
            argument = ZVal.assign(zpairResult38.getValue());
            ZVal.addToArray(
                    arguments,
                    toStringR(ZVal.getElement(argument, "type"), env)
                            + " $"
                            + toStringR(ZVal.getElement(argument, "name"), env));
        }

        return ZVal.assign(
                NamespaceGlobal.trim
                        .env(env)
                        .call(
                                toStringR(
                                                ZVal.isTrue(
                                                                env.callMethod(
                                                                        this,
                                                                        "isStatic",
                                                                        Method.class))
                                                        ? "static "
                                                        : "",
                                                env)
                                        + toStringR(
                                                toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("returnType")
                                                                .value(),
                                                        env),
                                                env)
                                        + " "
                                        + toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("methodName")
                                                        .value(),
                                                env)
                                        + "("
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", arguments)
                                                        .value(),
                                                env)
                                        + ")"
                                        + toStringR(
                                                toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("description")
                                                                .getBool()
                                                        ? " "
                                                                + toStringR(
                                                                        env.callMethod(
                                                                                toObjectR(this)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "description")
                                                                                        .value(),
                                                                                "render",
                                                                                Method.class),
                                                                        env)
                                                        : "",
                                                env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    private Object filterArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        ReferenceContainer argument = new BasicReferenceContainer(ZVal.newArray());
        Object keys = null;
        for (ZPair zpairResult39 : ZVal.getIterable(arguments, env, true)) {
            argument = zpairResult39;
            if (function_is_string.f.env(env).call(argument.getObject()).getBool()) {
                argument.setObject(ZVal.newArray(new ZPair("name", argument.getObject())));
            }

            if (!ZVal.isset(ZVal.getElement(argument.getObject(), "type"))) {
                ZVal.putArrayElement(argument.getObject(), "type", new Void_(env));
            }

            keys = CRArrayF.array_keys.env(env).call(argument.getObject()).value();
            CRArrayF.sort.env(env).call(keys);
            if (ZVal.strictNotEqualityCheck(
                    keys, "!==", ZVal.newArray(new ZPair(0, "name"), new ZPair(1, "type")))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Arguments can only have the \"name\" and \"type\" fields, found: "
                                        + toStringR(
                                                NamespaceGlobal.var_export
                                                        .env(env)
                                                        .call(keys, true)
                                                        .value(),
                                                env)));
            }
        }

        return ZVal.assign(arguments);
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Method";

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
            ReferenceContainer argument = new BasicReferenceContainer(ZVal.newArray());
            Object _pStatic = null;
            Object argumentName = null;
            Object methodName = null;
            Object description = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object runtimeTempArrayResult3 = null;
            Object argumentType = null;
            Object arguments = null;
            Object returnType = null;
            Assert.runtimeStaticObject.stringNotEmpty(env, body);
            Assert.runtimeStaticObject.__callStatic(
                    env,
                    "allNotNull",
                    ZVal.indexedArray(
                            ZVal.newArray(
                                    new ZPair(0, typeResolver), new ZPair(1, descriptionFactory))));
            if (!NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^\n                # Static keyword\n                # Declares a static method ONLY if type is also present\n                (?:\n                    (static)\n                    \\s+\n                )?\n                # Return type\n                (?:\n                    (   \n                        (?:[\\w\\|_\\\\]*\\$this[\\w\\|_\\\\]*)\n                        |\n                        (?:\n                            (?:[\\w\\|_\\\\]+)\n                            # array notation           \n                            (?:\\[\\])*\n                        )*\n                    )\n                    \\s+\n                )?\n                # Legacy method name (not captured)\n                (?:\n                    [\\w_]+\\(\\)\\s+\n                )?\n                # Method name\n                ([\\w\\|_\\\\]+)\n                # Arguments\n                (?:\n                    \\(([^\\)]*)\\)\n                )?\n                \\s*\n                # Description\n                (.*)\n            $/sux",
                            body,
                            matches.getObject())
                    .getBool()) {
                return ZVal.assign(ZVal.getNull());
            }

            ZVal.list(
                    runtimeTempArrayResult3 = matches.getObject(),
                    (_pStatic = ZVal.assign(ZVal.getElement(runtimeTempArrayResult3, 1))),
                    (returnType = ZVal.assign(ZVal.getElement(runtimeTempArrayResult3, 2))),
                    (methodName = ZVal.assign(ZVal.getElement(runtimeTempArrayResult3, 3))),
                    (arguments = ZVal.assign(ZVal.getElement(runtimeTempArrayResult3, 4))),
                    (description = ZVal.assign(ZVal.getElement(runtimeTempArrayResult3, 5))));
            _pStatic = ZVal.strictEqualityCheck(_pStatic, "===", "static");
            if (ZVal.strictEqualityCheck(returnType, "===", "")) {
                returnType = "void";
            }

            returnType = env.callMethod(typeResolver, "resolve", Method.class, returnType, context);
            description =
                    env.callMethod(
                            descriptionFactory, "create", Method.class, description, context);
            if (ZVal.toBool(function_is_string.f.env(env).call(arguments).value())
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    NamespaceGlobal.strlen.env(env).call(arguments).value(),
                                    '>',
                                    0))) {
                arguments = NamespaceGlobal.explode.env(env).call(",", arguments).value();
                for (ZPair zpairResult37 : ZVal.getIterable(arguments, env, true)) {
                    argument = zpairResult37;
                    argument.setObject(
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(
                                            " ",
                                            runtimeStaticObject.stripRestArg(
                                                    env,
                                                    NamespaceGlobal.trim
                                                            .env(env)
                                                            .call(argument.getObject())
                                                            .value()),
                                            2)
                                    .value());
                    if (ZVal.strictEqualityCheck(
                            ZVal.getElementRecursive(argument.getObject(), 0, 0), "===", "$")) {
                        argumentName =
                                NamespaceGlobal.substr
                                        .env(env)
                                        .call(ZVal.getElement(argument.getObject(), 0), 1)
                                        .value();
                        argumentType = new Void_(env);

                    } else {
                        argumentType =
                                env.callMethod(
                                        typeResolver,
                                        "resolve",
                                        Method.class,
                                        ZVal.getElement(argument.getObject(), 0),
                                        context);
                        argumentName = "";
                        if (ZVal.isset(ZVal.getElement(argument.getObject(), 1))) {
                            ZVal.putArrayElement(
                                    argument.getObject(),
                                    1,
                                    runtimeStaticObject.stripRestArg(
                                            env, ZVal.getElement(argument.getObject(), 1)));
                            argumentName =
                                    NamespaceGlobal.substr
                                            .env(env)
                                            .call(ZVal.getElement(argument.getObject(), 1), 1)
                                            .value();
                        }
                    }

                    argument.setObject(
                            ZVal.newArray(
                                    new ZPair("name", argumentName),
                                    new ZPair("type", argumentType)));
                }

            } else {
                arguments = ZVal.newArray();
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, methodName, arguments, returnType, _pStatic, description));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument")
        private Object stripRestArg(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, null);
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strpos.env(env).call(argument, "...").value(), "===", 0)) {
                argument =
                        NamespaceGlobal.trim
                                .env(env)
                                .call(NamespaceGlobal.substr.env(env).call(argument, 3).value())
                                .value();
            }

            return ZVal.assign(argument);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Method")
                    .setLookup(Method.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "arguments",
                            "description",
                            "isStatic",
                            "methodName",
                            "name",
                            "name",
                            "returnType")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Method.php")
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
