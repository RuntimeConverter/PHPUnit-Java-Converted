package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.InvalidApplicationNameException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/ApplicationName.php

*/

public class ApplicationName extends RuntimeClassBase {

    public Object name = null;

    public ApplicationName(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ApplicationName.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(this, "ensureIsString", ApplicationName.class, name);
        env.callMethod(this, "ensureValidFormat", ApplicationName.class, name);
        toObjectR(this).accessProp(this, env).name("name").set(name);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PharIo\\Manifest\\ApplicationName")
    public Object isEqual(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(this).accessProp(this, env).name("name").value(),
                        "===",
                        toObjectR(name).accessProp(this, env).name("name").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object ensureValidFormat(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        if (!NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences())
                .call("#\\w/\\w#", name)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidApplicationNameException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Format of name \"%s\" is not valid - expected: vendor/packagename",
                                            name)
                                    .value(),
                            InvalidApplicationNameException.CONST_InvalidFormat));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object ensureIsString(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        if (!function_is_string.f.env(env).call(name).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidApplicationNameException(
                            env,
                            "Name must be a string",
                            InvalidApplicationNameException.CONST_NotAString));
        }

        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ApplicationName";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ApplicationName")
                    .setLookup(ApplicationName.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("name")
                    .setFilename("vendor/phar-io/manifest/src/values/ApplicationName.php")
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
