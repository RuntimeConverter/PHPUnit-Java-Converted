package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
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

 src/Email.php

*/

public final class Email extends RuntimeClassBase {

    public Object email = null;

    public Email(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Email.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email", typeHint = "string")
    private Object __construct(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, null);
        env.callMethod(this, "ensureIsValidEmail", Email.class, email);
        toObjectR(this).accessProp(this, env).name("email").set(email);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("email").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email", typeHint = "string")
    private Object ensureIsValidEmail(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, null);
        if (!NamespaceGlobal.filter_var.env(env).call(email, 274).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("\"%s\" is not a valid email address", email)
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class = "Email";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "email", typeHint = "string")
        public Object fromString(RuntimeEnv env, Object... args) {
            Object email = assignParameter(args, 0, null);
            return ZVal.assign(
                    new com.project.convertedCode.globalNamespace.classes.Email(env, email));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Email")
                    .setLookup(Email.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("email")
                    .setFilename("src/Email.php")
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
