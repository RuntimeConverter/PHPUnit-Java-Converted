package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Example.php

*/

public final class Example extends BaseTag {

    public Object filePath = null;

    public Object isURI = false;

    public Object startingLine = null;

    public Object lineCount = null;

    public Example(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Example.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filePath")
    @ConvertedParameter(index = 1, name = "isURI")
    @ConvertedParameter(index = 2, name = "startingLine")
    @ConvertedParameter(index = 3, name = "lineCount")
    @ConvertedParameter(index = 4, name = "description")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filePath = assignParameter(args, 0, null);
        Object isURI = assignParameter(args, 1, null);
        Object startingLine = assignParameter(args, 2, null);
        Object lineCount = assignParameter(args, 3, null);
        Object description = assignParameter(args, 4, null);
        Assert.runtimeStaticObject.notEmpty(env, filePath);
        Assert.runtimeStaticObject.integer(env, startingLine);
        Assert.runtimeStaticObject.greaterThanEq(env, startingLine, 0);
        toObjectR(this).accessProp(this, env).name("filePath").set(filePath);
        toObjectR(this).accessProp(this, env).name("startingLine").set(startingLine);
        toObjectR(this).accessProp(this, env).name("lineCount").set(lineCount);
        toObjectR(this).accessProp(this, env).name("name").set("example");
        if (ZVal.strictNotEqualityCheck(description, "!==", ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("description")
                    .set(NamespaceGlobal.trim.env(env).call(description).value());
        }

        toObjectR(this).accessProp(this, env).name("isURI").set(isURI);
        return null;
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        Object filePath = null;
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                toObjectR(this).accessProp(this, env).name("description").value())) {
            filePath =
                    "\""
                            + toStringR(
                                    toObjectR(this).accessProp(this, env).name("filePath").value(),
                                    env)
                            + "\"";
            if (toObjectR(this).accessProp(this, env).name("isURI").getBool()) {
                filePath =
                        ZVal.assign(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        this,
                                                        "isUriRelative",
                                                        Example.class,
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("filePath")
                                                                .value()))
                                        ? NamespaceGlobal.str_replace
                                                .env(env)
                                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                                .call(
                                                        "%2F",
                                                        "/",
                                                        NamespaceGlobal.rawurlencode
                                                                .env(env)
                                                                .call(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("filePath")
                                                                                .value())
                                                                .value())
                                                .value()
                                        : toObjectR(this)
                                                .accessProp(this, env)
                                                .name("filePath")
                                                .value());
            }

            return ZVal.assign(
                    NamespaceGlobal.trim
                            .env(env)
                            .call(
                                    toStringR(filePath, env)
                                            + " "
                                            + toStringR(super.getDescription(env), env))
                            .value());
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("description").value());
    }

    @ConvertedMethod
    public Object getFilePath(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("filePath").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("filePath").value(), env)
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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    private Object isUriRelative(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        false, "===", NamespaceGlobal.strpos.env(env).call(uri, ":").value()));
    }

    @ConvertedMethod
    public Object getStartingLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("startingLine").value());
    }

    @ConvertedMethod
    public Object getLineCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("lineCount").value());
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Example";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, null);
            ReferenceContainer contentMatches = new BasicReferenceContainer(ZVal.newArray());
            Object startingLine = null;
            Object filePath = null;
            Object fileUri = null;
            Object description = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Object lineCount = null;
            if (!NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^(?:\\\"([^\\\"]+)\\\"|(\\S+))(?:\\s+(.*))?$/sux",
                            body,
                            matches.getObject())
                    .getBool()) {
                return ZVal.assign(ZVal.getNull());
            }

            filePath = ZVal.getNull();
            fileUri = ZVal.getNull();
            if (ZVal.strictNotEqualityCheck("", "!==", ZVal.getElement(matches.getObject(), 1))) {
                filePath = ZVal.assign(ZVal.getElement(matches.getObject(), 1));

            } else {
                fileUri = ZVal.assign(ZVal.getElement(matches.getObject(), 2));
            }

            startingLine = 1;
            lineCount = ZVal.getNull();
            description = ZVal.getNull();
            if (CRArrayF.array_key_exists.env(env).call(3, matches.getObject()).getBool()) {
                description = ZVal.assign(ZVal.getElement(matches.getObject(), 3));
                if (NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, contentMatches))
                        .call(
                                "/^([1-9]\\d*)(?:\\s+((?1))\\s*)?(.*)$/sux",
                                ZVal.getElement(matches.getObject(), 3),
                                contentMatches.getObject())
                        .getBool()) {
                    startingLine =
                            ZVal.assign(
                                    ZVal.toLong(ZVal.getElement(contentMatches.getObject(), 1)));
                    if (ZVal.toBool(ZVal.isset(ZVal.getElement(contentMatches.getObject(), 2)))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            ZVal.getElement(contentMatches.getObject(), 2),
                                            "!==",
                                            ""))) {
                        lineCount =
                                ZVal.assign(
                                        ZVal.toLong(
                                                ZVal.getElement(contentMatches.getObject(), 2)));
                    }

                    if (CRArrayF.array_key_exists
                            .env(env)
                            .call(3, contentMatches.getObject())
                            .getBool()) {
                        description = ZVal.assign(ZVal.getElement(contentMatches.getObject(), 3));
                    }
                }
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            ZVal.strictNotEqualityCheck(filePath, "!==", ZVal.getNull())
                                    ? filePath
                                    : fileUri,
                            ZVal.strictNotEqualityCheck(fileUri, "!==", ZVal.getNull()),
                            startingLine,
                            lineCount,
                            description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Example")
                    .setLookup(Example.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "description", "filePath", "isURI", "lineCount", "name", "startingLine")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Example.php")
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
