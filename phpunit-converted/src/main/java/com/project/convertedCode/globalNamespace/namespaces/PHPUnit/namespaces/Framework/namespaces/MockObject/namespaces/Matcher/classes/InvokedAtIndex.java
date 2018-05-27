package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.Invocation;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtIndex.php

*/

public class InvokedAtIndex extends RuntimeClassBase implements Invocation {

    public Object sequenceIndex = null;

    public Object currentIndex = -1;

    public InvokedAtIndex(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvokedAtIndex.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sequenceIndex")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sequenceIndex = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("sequenceIndex").set(sequenceIndex);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "invoked at sequence index "
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("sequenceIndex").value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("currentIndex")
                .set(
                        ZVal.increment(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("currentIndex")
                                        .value()));
        return ZVal.assign(
                ZVal.equalityCheck(
                        toObjectR(this).accessProp(this, env).name("currentIndex").value(),
                        toObjectR(this).accessProp(this, env).name("sequenceIndex").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoked(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        return null;
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        if (ZVal.isLessThan(
                toObjectR(this).accessProp(this, env).name("currentIndex").value(),
                '<',
                toObjectR(this).accessProp(this, env).name("sequenceIndex").value())) {
            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "The expected invocation at index %s was never reached.",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("sequenceIndex")
                                                    .value())
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtIndex";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtIndex")
                    .setLookup(InvokedAtIndex.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("currentIndex", "sequenceIndex")
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtIndex.php")
                    .addInterface("Invocation")
                    .addInterface("SelfDescribing")
                    .addInterface("Verifiable")
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
