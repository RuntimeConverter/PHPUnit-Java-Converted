package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/version/src/Version.php

*/

public class Version extends RuntimeClassBase {

    public Object path = null;

    public Object release = null;

    public Object version = null;

    public Version(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Version.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "release")
    @ConvertedParameter(index = 1, name = "path")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object release = assignParameter(args, 0, null);
        Object path = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("release").set(release);
        toObjectR(this).accessProp(this, env).name("path").set(path);
        return null;
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        Object git = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("version").value(),
                "===",
                ZVal.getNull())) {
            if (ZVal.equalityCheck(
                    CRArrayF.count
                            .env(env)
                            .call(
                                    NamespaceGlobal.explode
                                            .env(env)
                                            .call(
                                                    ".",
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("release")
                                                            .value())
                                            .value())
                            .value(),
                    3)) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("version")
                        .set(toObjectR(this).accessProp(this, env).name("release").value());

            } else {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("version")
                        .set(
                                toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("release")
                                                        .value(),
                                                env)
                                        + "-dev");
            }

            git =
                    env.callMethod(
                            this,
                            "getGitInformation",
                            Version.class,
                            toObjectR(this).accessProp(this, env).name("path").value());
            if (ZVal.isTrue(git)) {
                if (ZVal.equalityCheck(
                        CRArrayF.count
                                .env(env)
                                .call(
                                        NamespaceGlobal.explode
                                                .env(env)
                                                .call(
                                                        ".",
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("release")
                                                                .value())
                                                .value())
                                .value(),
                        3)) {
                    toObjectR(this).accessProp(this, env).name("version").set(git);

                } else {
                    git = NamespaceGlobal.explode.env(env).call("-", git).value();
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("version")
                            .set(
                                    toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("release")
                                                            .value(),
                                                    env)
                                            + "-"
                                            + toStringR(
                                                    CRArrayF.end.env(env).call(git).value(), env));
                }
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("version").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    private Object getGitInformation(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, null);
        Object result = null;
        Object returnCode = null;
        Object process = null;
        ReferenceContainer pipes = new BasicReferenceContainer(ZVal.newArray());
        if (!NamespaceGlobal.is_dir
                .env(env)
                .call(toStringR(path, env) + toStringR("/", env) + ".git")
                .getBool()) {
            return ZVal.assign(false);
        }

        process =
                NamespaceGlobal.proc_open
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                        .call(
                                "git describe --tags",
                                ZVal.newArray(
                                        new ZPair(
                                                1,
                                                ZVal.newArray(
                                                        new ZPair(0, "pipe"), new ZPair(1, "w"))),
                                        new ZPair(
                                                2,
                                                ZVal.newArray(
                                                        new ZPair(0, "pipe"), new ZPair(1, "w")))),
                                pipes.getObject(),
                                path)
                        .value();
        if (!NamespaceGlobal.is_resource.env(env).call(process).getBool()) {
            return ZVal.assign(false);
        }

        result =
                NamespaceGlobal.trim
                        .env(env)
                        .call(
                                NamespaceGlobal.stream_get_contents
                                        .env(env)
                                        .call(ZVal.getElement(pipes.getObject(), 1))
                                        .value())
                        .value();
        NamespaceGlobal.fclose.env(env).call(ZVal.getElement(pipes.getObject(), 1));
        NamespaceGlobal.fclose.env(env).call(ZVal.getElement(pipes.getObject(), 2));
        returnCode = NamespaceGlobal.proc_close.env(env).call(process).value();
        if (ZVal.strictNotEqualityCheck(returnCode, "!==", 0)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_class = "SebastianBergmann\\Version";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Version")
                    .setLookup(Version.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("path", "release", "version")
                    .setFilename("vendor/sebastian/version/src/Version.php")
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
