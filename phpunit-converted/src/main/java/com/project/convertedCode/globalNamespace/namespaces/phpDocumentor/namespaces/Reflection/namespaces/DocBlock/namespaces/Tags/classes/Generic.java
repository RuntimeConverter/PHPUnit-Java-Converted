package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.StandardTagFactory;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Generic.php

*/

public class Generic extends BaseTag implements StaticMethod {

    public Generic(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Generic.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object description = assignParameter(args, 1, null);
        if (ZVal.isNull(description)) {
            description = ZVal.getNull();
        }
        env.callMethod(this, "validateTagName", Generic.class, name);
        toObjectR(this).accessProp(this, env).name("name").set(name);
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("description").getBool()
                        ? env.callMethod(
                                toObjectR(this).accessProp(this, env).name("description").value(),
                                "render",
                                Generic.class)
                        : "");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object validateTagName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        if (!NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences())
                .call("/^" + toStringR(StandardTagFactory.CONST_REGEX_TAGNAME, env) + "$/u", name)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The tag name \""
                                    + toStringR(name, env)
                                    + "\" is not wellformed. Tags may only consist of letters, underscores, "
                                    + "hyphens and backslashes."));
        }

        return null;
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Generic";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        @ConvertedParameter(index = 1, name = "name")
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
            Object name = assignParameter(args, 1, null);
            if (ZVal.isNull(name)) {
                name = "";
            }
            Object descriptionFactory = assignParameter(args, 2, null);
            if (ZVal.isNull(descriptionFactory)) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 3, null);
            if (ZVal.isNull(context)) {
                context = ZVal.getNull();
            }
            Object description = null;
            Assert.runtimeStaticObject.string(env, body);
            Assert.runtimeStaticObject.stringNotEmpty(env, name);
            Assert.runtimeStaticObject.notNull(env, descriptionFactory);
            description =
                    ZVal.assign(
                            ZVal.toBool(descriptionFactory) && ZVal.toBool(body)
                                    ? env.callMethod(
                                            descriptionFactory,
                                            "create",
                                            Generic.class,
                                            body,
                                            context)
                                    : ZVal.getNull());
            return ZVal.assign(env.createNewWithLateStaticBindings(this, name, description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Generic")
                    .setLookup(Generic.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("description", "name")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Generic.php")
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
