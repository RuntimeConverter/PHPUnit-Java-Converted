package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
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

 vendor/phar-io/manifest/src/values/AuthorCollectionIterator.php

*/

public class AuthorCollectionIterator extends RuntimeClassBase implements Iterator {

    public Object authors = ZVal.newArray();

    public Object position = null;

    public AuthorCollectionIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AuthorCollectionIterator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "authors",
        typeHint = "PharIo\\Manifest\\AuthorCollection"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object authors = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("authors")
                .set(env.callMethod(authors, "getAuthors", AuthorCollectionIterator.class));
        return null;
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("position").set(0);
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(
                        toObjectR(this).accessProp(this, env).name("position").value(),
                        '<',
                        CRArrayF.count
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("authors").value())
                                .value()));
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("position").value());
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("authors").value(),
                        toObjectR(this).accessProp(this, env).name("position").value()));
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("position")
                .set(
                        ZVal.increment(
                                toObjectR(this).accessProp(this, env).name("position").value()));
        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\AuthorCollectionIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\AuthorCollectionIterator")
                    .setLookup(
                            AuthorCollectionIterator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("authors", "position")
                    .setFilename("vendor/phar-io/manifest/src/values/AuthorCollectionIterator.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
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
