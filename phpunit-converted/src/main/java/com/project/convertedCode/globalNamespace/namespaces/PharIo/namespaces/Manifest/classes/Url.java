package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.InvalidUrlException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/Url.php

*/

public class Url extends RuntimeClassBase {

    public Object url = null;

    public Url(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Url.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, null);
        env.callMethod(this, "ensureUrlIsValid", Url.class, url);
        toObjectR(this).accessProp(this, env).name("url").set(url);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("url").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    private Object ensureUrlIsValid(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.filter_var.env(env).call(url, 273).value(), "===", false)) {
            throw ZVal.getException(env, new InvalidUrlException(env));
        }

        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\Url";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\Url")
                    .setLookup(Url.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("url")
                    .setFilename("vendor/phar-io/manifest/src/values/Url.php")
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
