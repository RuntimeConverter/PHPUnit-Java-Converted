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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Deprecated.php

*/

public final class Deprecated extends BaseTag implements StaticMethod {

    public Object name = "deprecated";

    public Object version = "";

    public Deprecated(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Deprecated.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "version",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, null);
        if (ZVal.isNull(version)) {
            version = ZVal.getNull();
        }
        Object description = assignParameter(args, 1, null);
        if (ZVal.isNull(description)) {
            description = ZVal.getNull();
        }
        Assert.runtimeStaticObject.__callStatic(
                env, "nullOrStringNotEmpty", ZVal.indexedArray(version));
        toObjectR(this).accessProp(this, env).name("version").set(version);
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("version").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(toObjectR(this).accessProp(this, env).name("version").value(), env)
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
                                                                Deprecated.class),
                                                        env)
                                        : "",
                                env));
    }

    public static final Object CONST_REGEX_VECTOR =
            "(?:\n        # Normal release vectors.\n        \\d\\S*\n        |\n        # VCS version vectors. Per PHPCS, they are expected to\n        # follow the form of the VCS name, followed by \":\", followed\n        # by the version vector itself.\n        # By convention, popular VCSes like CVS, SVN and GIT use \"$\"\n        # around the actual version vector.\n        [^\\s\\:]+\\:\\s*\\$[^\\$]+\\$\n    )";

    public static final Object CONST_class =
            "phpDocumentor\\Reflection\\DocBlock\\Tags\\Deprecated";

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
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Assert.runtimeStaticObject.__callStatic(env, "nullOrString", ZVal.indexedArray(body));
            if (ZVal.isEmpty(body)) {
                return ZVal.assign(env.createNewWithLateStaticBindings(this));
            }

            matches.setObject(ZVal.newArray());
            if (!NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^(" + toStringR(CONST_REGEX_VECTOR, env) + ")\\s*(.+)?$/sux",
                            body,
                            matches.getObject())
                    .getBool()) {
                return ZVal.assign(
                        env.createNewWithLateStaticBindings(
                                this,
                                ZVal.getNull(),
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(), "!==", descriptionFactory)
                                        ? env.callMethod(
                                                descriptionFactory,
                                                "create",
                                                Deprecated.class,
                                                body,
                                                context)
                                        : ZVal.getNull()));
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            ZVal.getElement(matches.getObject(), 1),
                            env.callMethod(
                                    descriptionFactory,
                                    "create",
                                    Deprecated.class,
                                    ZVal.isset(ZVal.getElement(matches.getObject(), 2))
                                            ? ZVal.getElement(matches.getObject(), 2)
                                            : "",
                                    context)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Deprecated")
                    .setLookup(Deprecated.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("description", "name", "name", "version")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Deprecated.php")
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
