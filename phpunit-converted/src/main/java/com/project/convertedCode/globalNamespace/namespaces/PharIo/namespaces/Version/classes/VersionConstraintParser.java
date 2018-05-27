package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.SpecificMajorAndMinorVersionConstraint;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.UnsupportedVersionConstraintException;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.AndVersionConstraintGroup;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.OrVersionConstraintGroup;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.GreaterThanOrEqualToVersionConstraint;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.ExactVersionConstraint;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.Version;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionConstraintValue;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.SpecificMajorVersionConstraint;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.AnyVersionConstraint;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/version/src/VersionConstraintParser.php

*/

public class VersionConstraintParser extends RuntimeClassBase {

    public VersionConstraintParser(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object parse(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        if (ZVal.isNull(value)) {
            value = ZVal.newArray();
        }
        Object version = null;
        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(value, "||").value(), "!==", false)) {
            return ZVal.assign(
                    env.callMethod(this, "handleOrGroup", VersionConstraintParser.class, value));
        }

        if (!NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences())
                .call("/^[\\^~\\*]?[\\d.\\*]+$/", value)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new UnsupportedVersionConstraintException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Version constraint %s is not supported.", value)
                                    .value()));
        }

        switch (toStringR(ZVal.getElement(value, 0))) {
            case "~":
                return ZVal.assign(
                        env.callMethod(
                                this, "handleTildeOperator", VersionConstraintParser.class, value));
            case "^":
                return ZVal.assign(
                        env.callMethod(
                                this, "handleCaretOperator", VersionConstraintParser.class, value));
        }
        ;
        version = new VersionConstraintValue(env, value);
        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(version, "getMajor", VersionConstraintParser.class),
                        "isAny",
                        VersionConstraintParser.class))) {
            return ZVal.assign(new AnyVersionConstraint(env));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(version, "getMinor", VersionConstraintParser.class),
                        "isAny",
                        VersionConstraintParser.class))) {
            return ZVal.assign(
                    new SpecificMajorVersionConstraint(
                            env,
                            value,
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMajor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class)));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(version, "getPatch", VersionConstraintParser.class),
                        "isAny",
                        VersionConstraintParser.class))) {
            return ZVal.assign(
                    new SpecificMajorAndMinorVersionConstraint(
                            env,
                            value,
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMajor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class),
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMinor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class)));
        }

        return ZVal.assign(new ExactVersionConstraint(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object handleOrGroup(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object groupSegment = null;
        Object constraints = ZVal.newArray();
        constraints = ZVal.newArray();
        for (ZPair zpairResult27 :
                ZVal.getIterable(
                        NamespaceGlobal.explode.env(env).call("||", value).value(), env, true)) {
            groupSegment = ZVal.assign(zpairResult27.getValue());
            ZVal.addToArray(
                    constraints,
                    env.callMethod(
                            this,
                            "parse",
                            VersionConstraintParser.class,
                            NamespaceGlobal.trim.env(env).call(groupSegment).value()));
        }

        return ZVal.assign(new OrVersionConstraintGroup(env, value, constraints));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object handleTildeOperator(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object version = null;
        Object constraints = ZVal.newArray();
        version = new Version(env, NamespaceGlobal.substr.env(env).call(value, 1).value());
        constraints =
                ZVal.newArray(
                        new ZPair(
                                0, new GreaterThanOrEqualToVersionConstraint(env, value, version)));
        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(version, "getPatch", VersionConstraintParser.class),
                        "isAny",
                        VersionConstraintParser.class))) {
            ZVal.addToArray(
                    constraints,
                    new SpecificMajorVersionConstraint(
                            env,
                            value,
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMajor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class)));

        } else {
            ZVal.addToArray(
                    constraints,
                    new SpecificMajorAndMinorVersionConstraint(
                            env,
                            value,
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMajor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class),
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMinor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class)));
        }

        return ZVal.assign(new AndVersionConstraintGroup(env, value, constraints));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object handleCaretOperator(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object version = null;
        version = new Version(env, NamespaceGlobal.substr.env(env).call(value, 1).value());
        return ZVal.assign(
                new AndVersionConstraintGroup(
                        env,
                        value,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        new GreaterThanOrEqualToVersionConstraint(
                                                env, value, version)),
                                new ZPair(
                                        1,
                                        new SpecificMajorVersionConstraint(
                                                env,
                                                value,
                                                env.callMethod(
                                                        env.callMethod(
                                                                version,
                                                                "getMajor",
                                                                VersionConstraintParser.class),
                                                        "getValue",
                                                        VersionConstraintParser.class))))));
    }

    public static final Object CONST_class = "PharIo\\Version\\VersionConstraintParser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Version\\VersionConstraintParser")
                    .setLookup(
                            VersionConstraintParser.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phar-io/version/src/VersionConstraintParser.php")
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
