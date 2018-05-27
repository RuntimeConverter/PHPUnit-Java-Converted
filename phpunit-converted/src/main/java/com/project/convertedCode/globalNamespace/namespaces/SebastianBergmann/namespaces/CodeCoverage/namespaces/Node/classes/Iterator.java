package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeInterfaces.RecursiveIterator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Directory;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/Iterator.php

*/

public final class Iterator extends RuntimeClassBase implements RecursiveIterator {

    public Object position = null;

    public Object nodes = null;

    public Iterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Iterator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\Directory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("nodes")
                .set(env.callMethod(node, "getChildNodes", Iterator.class));
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
                                .call(toObjectR(this).accessProp(this, env).name("nodes").value())
                                .value()));
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("position").value());
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "valid", Iterator.class))
                        ? ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("nodes").value(),
                                toObjectR(this).accessProp(this, env).name("position").value())
                        : ZVal.getNull());
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

    @ConvertedMethod
    public Object getChildren(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .SebastianBergmann
                        .namespaces
                        .CodeCoverage
                        .namespaces
                        .Node
                        .classes
                        .Iterator(
                        env,
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("nodes").value(),
                                toObjectR(this).accessProp(this, env).name("position").value())));
    }

    @ConvertedMethod
    public Object hasChildren(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.checkInstanceType(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("nodes").value(),
                                toObjectR(this).accessProp(this, env).name("position").value()),
                        Directory.class,
                        "SebastianBergmann\\CodeCoverage\\Node\\Directory"));
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\Iterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\Iterator")
                    .setLookup(Iterator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("nodes", "position")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/Iterator.php")
                    .addInterface("RecursiveIterator")
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
