package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Stub;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes.Exporter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Stub/ReturnStub.php

*/

public class ReturnStub extends RuntimeClassBase implements Stub {

    public Object value = null;

    public ReturnStub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnStub.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("value").set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoke(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("value").value());
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object exporter = null;
        exporter = new Exporter(env);
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "return user-specified value %s",
                                env.callMethod(
                                        exporter,
                                        "export",
                                        ReturnStub.class,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()))
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Stub\\ReturnStub";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Stub\\ReturnStub")
                    .setLookup(ReturnStub.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("value")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Stub/ReturnStub.php")
                    .addInterface("Stub")
                    .addInterface("SelfDescribing")
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
