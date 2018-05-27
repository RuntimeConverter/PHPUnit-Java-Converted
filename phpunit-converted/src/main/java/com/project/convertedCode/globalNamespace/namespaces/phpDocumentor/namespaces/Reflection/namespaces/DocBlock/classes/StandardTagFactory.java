package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.Generic;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.FqsenResolver;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.TagFactory;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/StandardTagFactory.php

*/

public final class StandardTagFactory extends RuntimeClassBase implements TagFactory {

    public Object tagHandlerMappings =
            ZVal.newArray(
                    new ZPair("author", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Author"),
                    new ZPair("covers", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Covers"),
                    new ZPair(
                            "deprecated",
                            "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Deprecated"),
                    new ZPair("link", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Link"),
                    new ZPair("method", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Method"),
                    new ZPair("param", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Param"),
                    new ZPair(
                            "property-read",
                            "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\PropertyRead"),
                    new ZPair("property", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Property"),
                    new ZPair(
                            "property-write",
                            "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\PropertyWrite"),
                    new ZPair("return", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Return_"),
                    new ZPair("see", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\See"),
                    new ZPair("since", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Since"),
                    new ZPair("source", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Source"),
                    new ZPair("throw", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Throws"),
                    new ZPair("throws", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Throws"),
                    new ZPair("uses", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Uses"),
                    new ZPair("var", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Var_"),
                    new ZPair("version", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Version"));

    public Object tagHandlerParameterCache = ZVal.newArray();

    public Object fqsenResolver = null;

    public Object serviceLocator = ZVal.newArray();

    public StandardTagFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StandardTagFactory.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fqsenResolver",
        typeHint = "phpDocumentor\\Reflection\\FqsenResolver"
    )
    @ConvertedParameter(
        index = 1,
        name = "tagHandlers",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fqsenResolver = assignParameter(args, 0, null);
        Object tagHandlers = assignParameter(args, 1, null);
        if (ZVal.isNull(tagHandlers)) {
            tagHandlers = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("fqsenResolver").set(fqsenResolver);
        if (ZVal.strictNotEqualityCheck(tagHandlers, "!==", ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("tagHandlerMappings").set(tagHandlers);
        }

        env.callMethod(
                this,
                "addService",
                StandardTagFactory.class,
                fqsenResolver,
                FqsenResolver.CONST_class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagLine")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object tagLine = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        if (ZVal.isNull(context)) {
            context = ZVal.getNull();
        }
        Object runtimeTempArrayResult2 = null;
        Object tagBody = ZVal.newArray();
        Object tagName = null;
        if (!ZVal.isTrue(context)) {
            context = new Context(env, "");
        }

        ZVal.list(
                runtimeTempArrayResult2 =
                        env.callMethod(this, "extractTagParts", StandardTagFactory.class, tagLine),
                (tagName = ZVal.assign(ZVal.getElement(runtimeTempArrayResult2, 0))),
                (tagBody = ZVal.assign(ZVal.getElement(runtimeTempArrayResult2, 1))));
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(tagBody, "!==", ""))
                && ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getElement(tagBody, 0), "===", "["))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The tag \""
                                    + toStringR(tagLine, env)
                                    + "\" does not seem to be wellformed, please check it for errors"));
        }

        return ZVal.assign(
                env.callMethod(
                        this, "createTag", StandardTagFactory.class, tagBody, tagName, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object addParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object value = assignParameter(args, 1, null);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("serviceLocator").value(), name, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "service")
    @ConvertedParameter(
        index = 1,
        name = "alias",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addService(RuntimeEnv env, Object... args) {
        Object service = assignParameter(args, 0, null);
        Object alias = assignParameter(args, 1, null);
        if (ZVal.isNull(alias)) {
            alias = ZVal.getNull();
        }
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("serviceLocator").value(),
                ZVal.isTrue(alias) ? alias : function_get_class.f.env(env).call(service).value(),
                service);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagName")
    @ConvertedParameter(index = 1, name = "handler")
    public Object registerTagHandler(RuntimeEnv env, Object... args) {
        Object tagName = assignParameter(args, 0, null);
        if (ZVal.isNull(tagName)) {
            tagName = ZVal.newArray();
        }
        Object handler = assignParameter(args, 1, null);
        Assert.runtimeStaticObject.stringNotEmpty(env, tagName);
        Assert.runtimeStaticObject.stringNotEmpty(env, handler);
        Assert.runtimeStaticObject.classExists(env, handler);
        Assert.runtimeStaticObject.implementsInterface(env, handler, StaticMethod.CONST_class);
        if (ZVal.toBool(NamespaceGlobal.strpos.env(env).call(tagName, "\\").value())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(ZVal.getElement(tagName, 0), "!==", "\\"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "A namespaced tag must have a leading backslash as it must be fully qualified"));
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("tagHandlerMappings").value(),
                tagName,
                handler);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagLine")
    private Object extractTagParts(RuntimeEnv env, Object... args) {
        Object tagLine = assignParameter(args, 0, null);
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        matches.setObject(ZVal.newArray());
        if (!NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^@(" + toStringR(CONST_REGEX_TAGNAME, env) + ")(?:\\s*([^\\s].*)|$)/us",
                        tagLine,
                        matches.getObject())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The tag \""
                                    + toStringR(tagLine, env)
                                    + "\" does not seem to be wellformed, please check it for errors"));
        }

        if (ZVal.isLessThan(CRArrayF.count.env(env).call(matches.getObject()).value(), '<', 3)) {
            ZVal.addToArray(matches.getObject(), "");
        }

        return ZVal.assign(CRArrayF.array_slice.env(env).call(matches.getObject(), 1).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "body")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object createTag(RuntimeEnv env, Object... args) {
        Object body = assignParameter(args, 0, null);
        Object name = assignParameter(args, 1, null);
        Object context = assignParameter(args, 2, null);
        Object handlerClassName = null;
        Object arguments = null;
        handlerClassName =
                env.callMethod(
                        this, "findHandlerClassName", StandardTagFactory.class, name, context);
        arguments =
                env.callMethod(
                        this,
                        "getArgumentsForParametersFromWiring",
                        StandardTagFactory.class,
                        env.callMethod(
                                this,
                                "fetchParametersForHandlerFactoryMethod",
                                StandardTagFactory.class,
                                handlerClassName),
                        env.callMethod(
                                this,
                                "getServiceLocatorWithDynamicParameters",
                                StandardTagFactory.class,
                                context,
                                name,
                                body));
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, handlerClassName), new ZPair(1, "create")),
                                arguments)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagName")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object findHandlerClassName(RuntimeEnv env, Object... args) {
        Object tagName = assignParameter(args, 0, null);
        Object context = assignParameter(args, 1, null);
        Object handlerClassName = null;
        handlerClassName = ZVal.assign(Generic.CONST_class);
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("tagHandlerMappings").value(),
                        tagName))) {
            handlerClassName =
                    ZVal.assign(
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("tagHandlerMappings")
                                            .value(),
                                    tagName));

        } else if (ZVal.isTrue(
                env.callMethod(this, "isAnnotation", StandardTagFactory.class, tagName))) {

        }

        return ZVal.assign(handlerClassName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    @ConvertedParameter(index = 1, name = "locator")
    private Object getArgumentsForParametersFromWiring(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object parameters = assignParameter(args, 0, null);
        Object locator = assignParameter(args, 1, null);
        if (ZVal.isNull(locator)) {
            locator = ZVal.newArray();
        }
        Object parameter = null;
        Object index = null;
        Object arguments = ZVal.newArray();
        Object typeHint = null;
        Object parameterName = null;
        arguments = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult35 : ZVal.getIterable(parameters, env, false)) {
            index = ZVal.assign(zpairResult35.getKey());
            parameter = ZVal.assign(zpairResult35.getValue());
            typeHint =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    parameter,
                                                    "getClass",
                                                    StandardTagFactory.class))
                                    ? env.callMethod(
                                            env.callMethod(
                                                    parameter,
                                                    "getClass",
                                                    StandardTagFactory.class),
                                            "getName",
                                            StandardTagFactory.class)
                                    : ZVal.getNull());
            if (ZVal.isset(ZVal.getElement(locator, typeHint))) {
                ZVal.addToArray(arguments, ZVal.getElement(locator, typeHint));
                continue;
            }

            parameterName = env.callMethod(parameter, "getName", StandardTagFactory.class);
            if (ZVal.isset(ZVal.getElement(locator, parameterName))) {
                ZVal.addToArray(arguments, ZVal.getElement(locator, parameterName));
                continue;
            }

            ZVal.addToArray(arguments, ZVal.getNull());
        }

        return ZVal.assign(arguments);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handlerClassName")
    private Object fetchParametersForHandlerFactoryMethod(RuntimeEnv env, Object... args) {
        Object handlerClassName = assignParameter(args, 0, null);
        Object methodReflection = null;
        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("tagHandlerParameterCache")
                                .value(),
                        handlerClassName))) {
            methodReflection = new ReflectionMethod(env, handlerClassName, "create");
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("tagHandlerParameterCache").value(),
                    handlerClassName,
                    env.callMethod(methodReflection, "getParameters", StandardTagFactory.class));
        }

        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("tagHandlerParameterCache")
                                .value(),
                        handlerClassName));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    @ConvertedParameter(index = 1, name = "tagName")
    @ConvertedParameter(index = 2, name = "tagBody")
    private Object getServiceLocatorWithDynamicParameters(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, null);
        Object tagName = assignParameter(args, 1, null);
        Object tagBody = assignParameter(args, 2, null);
        Object locator = null;
        locator =
                CRArrayF.array_merge
                        .env(env)
                        .call(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("serviceLocator")
                                        .value(),
                                ZVal.newArray(
                                        new ZPair("name", tagName),
                                        new ZPair("body", tagBody),
                                        new ZPair(Context.CONST_class, context)))
                        .value();
        return ZVal.assign(locator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagContent")
    private Object isAnnotation(RuntimeEnv env, Object... args) {
        Object tagContent = assignParameter(args, 0, null);
        return ZVal.assign(false);
    }

    public static final Object CONST_REGEX_TAGNAME = "[\\w\\-\\_\\\\]+";

    public static final Object CONST_class =
            "phpDocumentor\\Reflection\\DocBlock\\StandardTagFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\StandardTagFactory")
                    .setLookup(StandardTagFactory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "fqsenResolver",
                            "serviceLocator",
                            "tagHandlerMappings",
                            "tagHandlerParameterCache")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/StandardTagFactory.php")
                    .addInterface("TagFactory")
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
