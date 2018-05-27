package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

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
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-common/src/Fqsen.php

*/

public final class Fqsen extends RuntimeClassBase {

    public Object fqsen = null;

    public Object name = null;

    public Fqsen(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Fqsen.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fqsen")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fqsen = assignParameter(args, 0, null);
        Object result = null;
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        matches.setObject(ZVal.newArray());
        result =
                NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                "/^\\\\([a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff\\\\]*)?(?:[:]{2}\\$?([a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*))?(?:\\(\\))?$/",
                                fqsen, matches.getObject())
                        .value();
        if (ZVal.strictEqualityCheck(result, "===", 0)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("\"%s\" is not a valid Fqsen.", fqsen)
                                    .value()));
        }

        toObjectR(this).accessProp(this, env).name("fqsen").set(fqsen);
        if (ZVal.isset(ZVal.getElement(matches.getObject(), 2))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("name")
                    .set(ZVal.getElement(matches.getObject(), 2));

        } else {
            matches.setObject(NamespaceGlobal.explode.env(env).call("\\", fqsen).value());
            toObjectR(this)
                    .accessProp(this, env)
                    .name("name")
                    .set(
                            NamespaceGlobal.trim
                                    .env(env)
                                    .call(
                                            CRArrayF.end.env(env).call(matches.getObject()).value(),
                                            "()")
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("fqsen").value());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Fqsen";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\Fqsen")
                    .setLookup(Fqsen.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("fqsen", "name")
                    .setFilename("vendor/phpdocumentor/reflection-common/src/Fqsen.php")
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
