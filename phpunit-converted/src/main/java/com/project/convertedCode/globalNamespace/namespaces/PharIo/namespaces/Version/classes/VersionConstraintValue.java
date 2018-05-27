package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionNumber;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/version/src/VersionConstraintValue.php

*/

public class VersionConstraintValue extends RuntimeClassBase {

    public Object major = null;

    public Object minor = null;

    public Object patch = null;

    public Object label = "";

    public Object buildMetaData = "";

    public Object versionString = "";

    public VersionConstraintValue(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == VersionConstraintValue.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object versionString = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("versionString").set(versionString);
        env.callMethod(this, "parseVersion", VersionConstraintValue.class, versionString);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    private Object parseVersion(RuntimeEnv env, Object... args) {
        ReferenceContainer versionString =
                new BasicReferenceContainer(assignParameter(args, 0, null));
        Object minorValue = null;
        Object versionSegments = ZVal.newArray();
        Object patchValue = null;
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, versionString),
                "extractBuildMetaData",
                VersionConstraintValue.class,
                versionString.getObject());
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, versionString),
                "extractLabel",
                VersionConstraintValue.class,
                versionString.getObject());
        versionSegments =
                NamespaceGlobal.explode.env(env).call(".", versionString.getObject()).value();
        toObjectR(this)
                .accessProp(this, env)
                .name("major")
                .set(new VersionNumber(env, ZVal.getElement(versionSegments, 0)));
        minorValue =
                ZVal.assign(
                        ZVal.isset(ZVal.getElement(versionSegments, 1))
                                ? ZVal.getElement(versionSegments, 1)
                                : ZVal.getNull());
        patchValue =
                ZVal.assign(
                        ZVal.isset(ZVal.getElement(versionSegments, 2))
                                ? ZVal.getElement(versionSegments, 2)
                                : ZVal.getNull());
        toObjectR(this).accessProp(this, env).name("minor").set(new VersionNumber(env, minorValue));
        toObjectR(this).accessProp(this, env).name("patch").set(new VersionNumber(env, patchValue));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    private Object extractBuildMetaData(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer versionString =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        if (ZVal.equalityCheck(
                NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/\\+(.*)/", versionString.getObject(), matches.getObject())
                        .value(),
                1)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("buildMetaData")
                    .set(ZVal.getElement(matches.getObject(), 1));
            versionString.setObject(
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    ZVal.getElement(matches.getObject(), 0),
                                    "",
                                    versionString.getObject())
                            .value());
        }

        return null;
    }

    public Object extractBuildMetaData(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    private Object extractLabel(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer versionString =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        if (ZVal.equalityCheck(
                NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/\\-(.*)/", versionString.getObject(), matches.getObject())
                        .value(),
                1)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("label")
                    .set(ZVal.getElement(matches.getObject(), 1));
            versionString.setObject(
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    ZVal.getElement(matches.getObject(), 0),
                                    "",
                                    versionString.getObject())
                            .value());
        }

        return null;
    }

    public Object extractLabel(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getLabel(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("label").value());
    }

    @ConvertedMethod
    public Object getBuildMetaData(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("buildMetaData").value());
    }

    @ConvertedMethod
    public Object getVersionString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("versionString").value());
    }

    @ConvertedMethod
    public Object getMajor(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("major").value());
    }

    @ConvertedMethod
    public Object getMinor(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("minor").value());
    }

    @ConvertedMethod
    public Object getPatch(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("patch").value());
    }

    public static final Object CONST_class = "PharIo\\Version\\VersionConstraintValue";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Version\\VersionConstraintValue")
                    .setLookup(
                            VersionConstraintValue.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "buildMetaData", "label", "major", "minor", "patch", "versionString")
                    .setFilename("vendor/phar-io/version/src/VersionConstraintValue.php")
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
