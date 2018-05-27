package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.InvalidEmailException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/Email.php

*/

public class Email extends RuntimeClassBase {

    public Object email = null;

    public Email(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Email.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, null);
        env.callMethod(this, "ensureEmailIsValid", Email.class, email);
        toObjectR(this).accessProp(this, env).name("email").set(email);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("email").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    private Object ensureEmailIsValid(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, null);
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.filter_var.env(env).call(url, 274).value(), "===", false)) {
            throw ZVal.getException(env, new InvalidEmailException(env));
        }

        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\Email";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\Email")
                    .setLookup(Email.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("email")
                    .setFilename("vendor/phar-io/manifest/src/values/Email.php")
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
