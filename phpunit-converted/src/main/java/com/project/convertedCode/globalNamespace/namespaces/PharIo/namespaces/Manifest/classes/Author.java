package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
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

 vendor/phar-io/manifest/src/values/Author.php

*/

public class Author extends RuntimeClassBase {

    public Object name = null;

    public Object email = null;

    public Author(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Author.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "email", typeHint = "PharIo\\Manifest\\Email")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object email = assignParameter(args, 1, null);
        toObjectR(this).accessProp(this, env).name("name").set(name);
        toObjectR(this).accessProp(this, env).name("email").set(email);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("email").value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s <%s>",
                                toObjectR(this).accessProp(this, env).name("name").value(),
                                toObjectR(this).accessProp(this, env).name("email").value())
                        .value());
    }

    public static final Object CONST_class = "PharIo\\Manifest\\Author";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\Author")
                    .setLookup(Author.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("email", "name")
                    .setFilename("vendor/phar-io/manifest/src/values/Author.php")
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
