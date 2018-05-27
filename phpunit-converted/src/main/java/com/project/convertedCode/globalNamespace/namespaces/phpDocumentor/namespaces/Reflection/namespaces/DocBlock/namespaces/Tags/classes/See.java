package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Reference.classes.Url;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Reference.classes.Fqsen;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/See.php

*/

public class See extends BaseTag implements StaticMethod {

    public Object name = "see";

    public Object refers = ZVal.getNull();

    public See(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == See.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "refers",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Reference\\Reference"
    )
    @ConvertedParameter(
        index = 1,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object refers = assignParameter(args, 0, null);
        Object description = assignParameter(args, 1, null);
        if (ZVal.isNull(description)) {
            description = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("refers").set(refers);
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("refers").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("refers").value(), env)
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
                                                                See.class),
                                                        env)
                                        : "",
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\See";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        @ConvertedParameter(
            index = 1,
            name = "resolver",
            typeHint = "phpDocumentor\\Reflection\\FqsenResolver",
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
            Object resolver = assignParameter(args, 1, null);
            if (ZVal.isNull(resolver)) {
                resolver = ZVal.getNull();
            }
            Object descriptionFactory = assignParameter(args, 2, null);
            if (ZVal.isNull(descriptionFactory)) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 3, null);
            if (ZVal.isNull(context)) {
                context = ZVal.getNull();
            }
            Object parts = ZVal.newArray();
            Object description = null;
            Assert.runtimeStaticObject.string(env, body);
            Assert.runtimeStaticObject.__callStatic(
                    env,
                    "allNotNull",
                    ZVal.indexedArray(
                            ZVal.newArray(
                                    new ZPair(0, resolver), new ZPair(1, descriptionFactory))));
            parts = NamespaceGlobal.preg_split.env(env).call("/\\s+/Su", body, 2).value();
            description =
                    ZVal.assign(
                            ZVal.isset(ZVal.getElement(parts, 1))
                                    ? env.callMethod(
                                            descriptionFactory,
                                            "create",
                                            See.class,
                                            ZVal.getElement(parts, 1),
                                            context)
                                    : ZVal.getNull());
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences())
                    .call("/\\w:\\/\\/\\w/i", ZVal.getElement(parts, 0))
                    .getBool()) {
                return ZVal.assign(
                        env.createNewWithLateStaticBindings(
                                this, new Url(env, ZVal.getElement(parts, 0)), description));
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            new Fqsen(
                                    env,
                                    env.callMethod(
                                            resolver,
                                            "resolve",
                                            See.class,
                                            ZVal.getElement(parts, 0),
                                            context)),
                            description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\See")
                    .setLookup(See.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("description", "name", "name", "refers")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/See.php")
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
