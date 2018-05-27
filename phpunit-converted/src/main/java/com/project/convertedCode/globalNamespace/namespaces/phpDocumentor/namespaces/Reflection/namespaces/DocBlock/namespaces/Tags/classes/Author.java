package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
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

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Author.php

*/

public final class Author extends BaseTag implements StaticMethod {

    public Object name = "author";

    public Object authorName = "";

    public Object authorEmail = "";

    public Author(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Author.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "authorName")
    @ConvertedParameter(index = 1, name = "authorEmail")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object authorName = assignParameter(args, 0, null);
        Object authorEmail = assignParameter(args, 1, null);
        Assert.runtimeStaticObject.string(env, authorName);
        Assert.runtimeStaticObject.string(env, authorEmail);
        if (ZVal.toBool(authorEmail)
                && ZVal.toBool(
                        !NamespaceGlobal.filter_var.env(env).call(authorEmail, 274).getBool())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The author tag does not have a valid e-mail address"));
        }

        toObjectR(this).accessProp(this, env).name("authorName").set(authorName);
        toObjectR(this).accessProp(this, env).name("authorEmail").set(authorEmail);
        return null;
    }

    @ConvertedMethod
    public Object getAuthorName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("authorName").value());
    }

    @ConvertedMethod
    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("authorEmail").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("authorName").value(), env)
                        + toStringR(
                                NamespaceGlobal.strlen
                                                .env(env)
                                                .call(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("authorEmail")
                                                                .value())
                                                .getBool()
                                        ? " <"
                                                + toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("authorEmail")
                                                                .value(),
                                                        env)
                                                + ">"
                                        : "",
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Author";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, null);
            Object splitTagContent = null;
            Object authorName = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Object email = null;
            Assert.runtimeStaticObject.string(env, body);
            splitTagContent =
                    NamespaceGlobal.preg_match
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                            .call("/^([^\\<]*)(?:\\<([^\\>]*)\\>)?$/u", body, matches.getObject())
                            .value();
            if (!ZVal.isTrue(splitTagContent)) {
                return ZVal.assign(ZVal.getNull());
            }

            authorName =
                    NamespaceGlobal.trim
                            .env(env)
                            .call(ZVal.getElement(matches.getObject(), 1))
                            .value();
            email =
                    ZVal.assign(
                            ZVal.isset(ZVal.getElement(matches.getObject(), 2))
                                    ? NamespaceGlobal.trim
                                            .env(env)
                                            .call(ZVal.getElement(matches.getObject(), 2))
                                            .value()
                                    : "");
            return ZVal.assign(env.createNewWithLateStaticBindings(this, authorName, email));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Author")
                    .setLookup(Author.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("authorEmail", "authorName", "description", "name", "name")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Author.php")
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
