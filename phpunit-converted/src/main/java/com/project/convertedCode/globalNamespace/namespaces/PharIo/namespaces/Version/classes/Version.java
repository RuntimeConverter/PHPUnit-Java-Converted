package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.InvalidVersionException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.PreReleaseSuffix;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionNumber;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/version/src/Version.php

*/

public class Version extends RuntimeClassBase {

    public Object major = null;

    public Object minor = null;

    public Object patch = null;

    public Object preReleaseSuffix = null;

    public Object versionString = "";

    public Version(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Version.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object versionString = assignParameter(args, 0, null);
        env.callMethod(this, "ensureVersionStringIsValid", Version.class, versionString);
        toObjectR(this).accessProp(this, env).name("versionString").set(versionString);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matches", typeHint = "array")
    private Object parseVersion(RuntimeEnv env, Object... args) {
        Object matches = assignParameter(args, 0, null);
        if (ZVal.isNull(matches)) {
            matches = ZVal.newArray();
        }
        Object preReleaseNumber = null;
        toObjectR(this)
                .accessProp(this, env)
                .name("major")
                .set(new VersionNumber(env, ZVal.getElement(matches, "Major")));
        toObjectR(this)
                .accessProp(this, env)
                .name("minor")
                .set(new VersionNumber(env, ZVal.getElement(matches, "Minor")));
        toObjectR(this)
                .accessProp(this, env)
                .name("patch")
                .set(
                        ZVal.isset(ZVal.getElement(matches, "Patch"))
                                ? new VersionNumber(env, ZVal.getElement(matches, "Patch"))
                                : new VersionNumber(env, ZVal.getNull()));
        if (ZVal.isset(ZVal.getElement(matches, "ReleaseType"))) {
            preReleaseNumber =
                    ZVal.assign(
                            ZVal.isset(ZVal.getElement(matches, "ReleaseTypeCount"))
                                    ? ZVal.toLong(ZVal.getElement(matches, "ReleaseTypeCount"))
                                    : ZVal.getNull());
            toObjectR(this)
                    .accessProp(this, env)
                    .name("preReleaseSuffix")
                    .set(
                            new PreReleaseSuffix(
                                    env,
                                    ZVal.getElement(matches, "ReleaseType"),
                                    preReleaseNumber));
        }

        return null;
    }

    @ConvertedMethod
    public Object getPreReleaseSuffix(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("preReleaseSuffix").value());
    }

    @ConvertedMethod
    public Object getVersionString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("versionString").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version", typeHint = "PharIo\\Version\\Version")
    public Object isGreaterThan(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, null);
        if (ZVal.isGreaterThan(
                env.callMethod(
                        env.callMethod(version, "getMajor", Version.class),
                        "getValue",
                        Version.class),
                '>',
                env.callMethod(
                        env.callMethod(this, "getMajor", Version.class),
                        "getValue",
                        Version.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.isLessThan(
                env.callMethod(
                        env.callMethod(version, "getMajor", Version.class),
                        "getValue",
                        Version.class),
                '<',
                env.callMethod(
                        env.callMethod(this, "getMajor", Version.class),
                        "getValue",
                        Version.class))) {
            return ZVal.assign(true);
        }

        if (ZVal.isGreaterThan(
                env.callMethod(
                        env.callMethod(version, "getMinor", Version.class),
                        "getValue",
                        Version.class),
                '>',
                env.callMethod(
                        env.callMethod(this, "getMinor", Version.class),
                        "getValue",
                        Version.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.isLessThan(
                env.callMethod(
                        env.callMethod(version, "getMinor", Version.class),
                        "getValue",
                        Version.class),
                '<',
                env.callMethod(
                        env.callMethod(this, "getMinor", Version.class),
                        "getValue",
                        Version.class))) {
            return ZVal.assign(true);
        }

        if (ZVal.isGreaterThanOrEqualTo(
                env.callMethod(
                        env.callMethod(version, "getPatch", Version.class),
                        "getValue",
                        Version.class),
                ">=",
                env.callMethod(
                        env.callMethod(this, "getPatch", Version.class),
                        "getValue",
                        Version.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.isLessThan(
                env.callMethod(
                        env.callMethod(version, "getPatch", Version.class),
                        "getValue",
                        Version.class),
                '<',
                env.callMethod(
                        env.callMethod(this, "getPatch", Version.class),
                        "getValue",
                        Version.class))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version")
    private Object ensureVersionStringIsValid(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, null);
        Object regex = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        regex =
                "/^v?\n            (?<Major>(0|(?:[1-9][0-9]*)))\n            \\.\n            (?<Minor>(0|(?:[1-9][0-9]*)))\n            (\\.\n                (?<Patch>(0|(?:[1-9][0-9]*)))\n            )?\n            (?:\n                -\n                (?<ReleaseType>(?:(dev|beta|b|RC|alpha|a|patch|p)))\n                (?:\n                    (?<ReleaseTypeCount>[0-9])\n                )?\n            )?       \n        $/x";
        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(regex, version, matches.getObject())
                        .value(),
                "!==",
                1)) {
            throw ZVal.getException(
                    env,
                    new InvalidVersionException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Version string '%s' does not follow SemVer semantics",
                                            version)
                                    .value()));
        }

        env.callMethod(this, "parseVersion", Version.class, matches.getObject());
        return null;
    }

    public static final Object CONST_class = "PharIo\\Version\\Version";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Version\\Version")
                    .setLookup(Version.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "major", "minor", "patch", "preReleaseSuffix", "versionString")
                    .setFilename("vendor/phar-io/version/src/Version.php")
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
