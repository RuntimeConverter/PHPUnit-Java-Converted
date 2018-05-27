package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Link.php

*/

public final class Link extends BaseTag implements StaticMethod {

    public Object name = "link";

    public Object link = "";

    public Link(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Link.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "link")
    @ConvertedParameter(
        index = 1,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object link = assignParameter(args, 0, null);
        Object description = assignParameter(args, 1, null);
        if (ZVal.isNull(description)) {
            description = ZVal.getNull();
        }
        Assert.runtimeStaticObject.string(env, link);
        toObjectR(this).accessProp(this, env).name("link").set(link);
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("link").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("link").value(), env)
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("description").getBool()
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("description")
                                                                        .value(),
                                                                "render",
                                                                Link.class),
                                                        env)
                                        : "",
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Link";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        @ConvertedParameter(
            index = 1,
            name = "descriptionFactory",
            typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "context",
            typeHint = "phpDocumentor\\Reflection\\Types\\Context",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, null);
            Object descriptionFactory = assignParameter(args, 1, null);
            if (ZVal.isNull(descriptionFactory)) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 2, null);
            if (ZVal.isNull(context)) {
                context = ZVal.getNull();
            }
            Object parts = ZVal.newArray();
            Object description = null;
            Assert.runtimeStaticObject.string(env, body);
            Assert.runtimeStaticObject.notNull(env, descriptionFactory);
            parts = NamespaceGlobal.preg_split.env(env).call("/\\s+/Su", body, 2).value();
            description =
                    ZVal.assign(
                            ZVal.isset(ZVal.getElement(parts, 1))
                                    ? env.callMethod(
                                            descriptionFactory,
                                            "create",
                                            Link.class,
                                            ZVal.getElement(parts, 1),
                                            context)
                                    : ZVal.getNull());
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, ZVal.getElement(parts, 0), description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Link")
                    .setLookup(Link.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("description", "link", "name", "name")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Link.php")
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
