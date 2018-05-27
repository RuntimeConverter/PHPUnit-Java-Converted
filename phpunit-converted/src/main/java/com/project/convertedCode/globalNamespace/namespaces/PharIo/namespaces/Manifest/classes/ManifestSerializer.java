package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeClasses.xml.XMLWriter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.PhpVersionRequirement;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.PhpExtensionRequirement;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.AnyVersionConstraint;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/ManifestSerializer.php

*/

public class ManifestSerializer extends RuntimeClassBase {

    public Object xmlWriter = null;

    public ManifestSerializer(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manifest", typeHint = "PharIo\\Manifest\\Manifest")
    @ConvertedParameter(index = 1, name = "filename")
    public Object serializeToFile(RuntimeEnv env, Object... args) {
        Object manifest = assignParameter(args, 0, null);
        Object filename = assignParameter(args, 1, null);
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        filename,
                        env.callMethod(
                                this, "serializeToString", ManifestSerializer.class, manifest));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manifest", typeHint = "PharIo\\Manifest\\Manifest")
    public Object serializeToString(RuntimeEnv env, Object... args) {
        Object manifest = assignParameter(args, 0, null);
        env.callMethod(this, "startDocument", ManifestSerializer.class);
        env.callMethod(
                this,
                "addContains",
                ManifestSerializer.class,
                env.callMethod(manifest, "getName", ManifestSerializer.class),
                env.callMethod(manifest, "getVersion", ManifestSerializer.class),
                env.callMethod(manifest, "getType", ManifestSerializer.class));
        env.callMethod(
                this,
                "addCopyright",
                ManifestSerializer.class,
                env.callMethod(manifest, "getCopyrightInformation", ManifestSerializer.class));
        env.callMethod(
                this,
                "addRequirements",
                ManifestSerializer.class,
                env.callMethod(manifest, "getRequirements", ManifestSerializer.class));
        env.callMethod(
                this,
                "addBundles",
                ManifestSerializer.class,
                env.callMethod(manifest, "getBundledComponents", ManifestSerializer.class));
        return ZVal.assign(env.callMethod(this, "finishDocument", ManifestSerializer.class));
    }

    @ConvertedMethod
    private Object startDocument(RuntimeEnv env, Object... args) {
        Object xmlWriter = null;
        xmlWriter = new XMLWriter(env);
        env.callMethod(xmlWriter, "openMemory", ManifestSerializer.class);
        env.callMethod(xmlWriter, "setIndent", ManifestSerializer.class, true);
        env.callMethod(
                xmlWriter,
                "setIndentString",
                ManifestSerializer.class,
                NamespaceGlobal.str_repeat.env(env).call(" ", 4).value());
        env.callMethod(xmlWriter, "startDocument", ManifestSerializer.class, "1.0", "UTF-8");
        env.callMethod(xmlWriter, "startElement", ManifestSerializer.class, "phar");
        env.callMethod(
                xmlWriter,
                "writeAttribute",
                ManifestSerializer.class,
                "xmlns",
                "https://phar.io/xml/manifest/1.0");
        toObjectR(this).accessProp(this, env).name("xmlWriter").set(xmlWriter);
        return null;
    }

    @ConvertedMethod
    private Object finishDocument(RuntimeEnv env, Object... args) {
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endElement",
                ManifestSerializer.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endDocument",
                ManifestSerializer.class);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                        "outputMemory",
                        ManifestSerializer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "version", typeHint = "PharIo\\Version\\Version")
    @ConvertedParameter(index = 2, name = "type", typeHint = "PharIo\\Manifest\\Type")
    private Object addContains(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object name = assignParameter(args, 0, null);
        Object version = assignParameter(args, 1, null);
        Object type = assignParameter(args, 2, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "startElement",
                ManifestSerializer.class,
                "contains");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "writeAttribute",
                ManifestSerializer.class,
                "name",
                name);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "writeAttribute",
                ManifestSerializer.class,
                "version",
                env.callMethod(version, "getVersionString", ManifestSerializer.class));
        SwitchEnumType1 switchVariable1 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType1.DEFAULT_CASE,
                        SwitchEnumType1.DYNAMIC_TYPE_1,
                        env.callMethod(type, "isApplication", ManifestSerializer.class),
                        SwitchEnumType1.DYNAMIC_TYPE_2,
                        env.callMethod(type, "isLibrary", ManifestSerializer.class),
                        SwitchEnumType1.DYNAMIC_TYPE_3,
                        env.callMethod(type, "isExtension", ManifestSerializer.class));
        switch (switchVariable1) {
            case DYNAMIC_TYPE_1:
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                        "writeAttribute",
                        ManifestSerializer.class,
                        "type",
                        "application");
                break;
            case DYNAMIC_TYPE_2:
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                        "writeAttribute",
                        ManifestSerializer.class,
                        "type",
                        "library");
                break;
            case DYNAMIC_TYPE_3:
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                        "writeAttribute",
                        ManifestSerializer.class,
                        "type",
                        "extension");
                env.callMethod(
                        this,
                        "addExtension",
                        ManifestSerializer.class,
                        env.callMethod(type, "getApplicationName", ManifestSerializer.class),
                        env.callMethod(type, "getVersionConstraint", ManifestSerializer.class));
                break;
            case DEFAULT_CASE:
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                        "writeAttribute",
                        ManifestSerializer.class,
                        "type",
                        "custom");
        }
        ;
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endElement",
                ManifestSerializer.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "copyrightInformation",
        typeHint = "PharIo\\Manifest\\CopyrightInformation"
    )
    private Object addCopyright(RuntimeEnv env, Object... args) {
        Object copyrightInformation = assignParameter(args, 0, null);
        Object license = null;
        Object author = null;
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "startElement",
                ManifestSerializer.class,
                "copyright");
        for (ZPair zpairResult21 :
                ZVal.getIterable(
                        env.callMethod(
                                copyrightInformation, "getAuthors", ManifestSerializer.class),
                        env,
                        true)) {
            author = ZVal.assign(zpairResult21.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "startElement",
                    ManifestSerializer.class,
                    "author");
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "writeAttribute",
                    ManifestSerializer.class,
                    "name",
                    env.callMethod(author, "getName", ManifestSerializer.class));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "writeAttribute",
                    ManifestSerializer.class,
                    "email",
                    toStringR(env.callMethod(author, "getEmail", ManifestSerializer.class), env));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "endElement",
                    ManifestSerializer.class);
        }

        license = env.callMethod(copyrightInformation, "getLicense", ManifestSerializer.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "startElement",
                ManifestSerializer.class,
                "license");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "writeAttribute",
                ManifestSerializer.class,
                "type",
                env.callMethod(license, "getName", ManifestSerializer.class));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "writeAttribute",
                ManifestSerializer.class,
                "url",
                env.callMethod(license, "getUrl", ManifestSerializer.class));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endElement",
                ManifestSerializer.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endElement",
                ManifestSerializer.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "requirementCollection",
        typeHint = "PharIo\\Manifest\\RequirementCollection"
    )
    private Object addRequirements(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object requirementCollection = assignParameter(args, 0, null);
        Object extensions = ZVal.newArray();
        Object extension = null;
        Object phpRequirement = null;
        Object requirement = null;
        phpRequirement = new AnyVersionConstraint(env);
        extensions = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult22 : ZVal.getIterable(requirementCollection, env, true)) {
            requirement = ZVal.assign(zpairResult22.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            requirement,
                            PhpVersionRequirement.class,
                            "PharIo\\Manifest\\PhpVersionRequirement"))) {
                phpRequirement =
                        env.callMethod(
                                requirement, "getVersionConstraint", ManifestSerializer.class);
                continue;
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            requirement,
                            PhpExtensionRequirement.class,
                            "PharIo\\Manifest\\PhpExtensionRequirement"))) {
                ZVal.addToArray(extensions, toStringR(requirement, env));
            }
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "startElement",
                ManifestSerializer.class,
                "requires");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "startElement",
                ManifestSerializer.class,
                "php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "writeAttribute",
                ManifestSerializer.class,
                "version",
                env.callMethod(phpRequirement, "asString", ManifestSerializer.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult23 : ZVal.getIterable(extensions, env, true)) {
            extension = ZVal.assign(zpairResult23.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "startElement",
                    ManifestSerializer.class,
                    "ext");
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "writeAttribute",
                    ManifestSerializer.class,
                    "name",
                    extension);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "endElement",
                    ManifestSerializer.class);
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endElement",
                ManifestSerializer.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endElement",
                ManifestSerializer.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bundledComponentCollection",
        typeHint = "PharIo\\Manifest\\BundledComponentCollection"
    )
    private Object addBundles(RuntimeEnv env, Object... args) {
        Object bundledComponentCollection = assignParameter(args, 0, null);
        Object bundledComponent = null;
        if (ZVal.strictEqualityCheck(
                CRArrayF.count.env(env).call(bundledComponentCollection).value(), "===", 0)) {
            return null;
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "startElement",
                ManifestSerializer.class,
                "bundles");
        for (ZPair zpairResult24 : ZVal.getIterable(bundledComponentCollection, env, true)) {
            bundledComponent = ZVal.assign(zpairResult24.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "startElement",
                    ManifestSerializer.class,
                    "component");
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "writeAttribute",
                    ManifestSerializer.class,
                    "name",
                    env.callMethod(bundledComponent, "getName", ManifestSerializer.class));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "writeAttribute",
                    ManifestSerializer.class,
                    "version",
                    env.callMethod(
                            env.callMethod(
                                    bundledComponent, "getVersion", ManifestSerializer.class),
                            "getVersionString",
                            ManifestSerializer.class));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                    "endElement",
                    ManifestSerializer.class);
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endElement",
                ManifestSerializer.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "application")
    @ConvertedParameter(
        index = 1,
        name = "versionConstraint",
        typeHint = "PharIo\\Version\\VersionConstraint"
    )
    private Object addExtension(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, null);
        Object versionConstraint = assignParameter(args, 1, null);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "startElement",
                ManifestSerializer.class,
                "extension");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "writeAttribute",
                ManifestSerializer.class,
                "for",
                application);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "writeAttribute",
                ManifestSerializer.class,
                "compatible",
                env.callMethod(versionConstraint, "asString", ManifestSerializer.class));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("xmlWriter").value(),
                "endElement",
                ManifestSerializer.class);
        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ManifestSerializer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ManifestSerializer")
                    .setLookup(ManifestSerializer.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("xmlWriter")
                    .setFilename("vendor/phar-io/manifest/src/ManifestSerializer.php")
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

    private enum SwitchEnumType1 {
        DYNAMIC_TYPE_1,
        DYNAMIC_TYPE_2,
        DYNAMIC_TYPE_3,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
