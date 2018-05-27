package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Stub;
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

 vendor/phpunit/phpunit-mock-objects/src/Stub/ReturnArgument.php

*/

public class ReturnArgument extends RuntimeClassBase implements Stub {

    public Object argumentIndex = null;

    public ReturnArgument(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnArgument.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argumentIndex")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object argumentIndex = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("argumentIndex").set(argumentIndex);
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
        if (ZVal.isset(
                ZVal.getElement(
                        env.callMethod(invocation, "getParameters", ReturnArgument.class),
                        toObjectR(this).accessProp(this, env).name("argumentIndex").value()))) {
            return ZVal.assign(
                    ZVal.getElement(
                            env.callMethod(invocation, "getParameters", ReturnArgument.class),
                            toObjectR(this).accessProp(this, env).name("argumentIndex").value()));
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "return argument #%d",
                                toObjectR(this).accessProp(this, env).name("argumentIndex").value())
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Stub\\ReturnArgument";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Stub\\ReturnArgument")
                    .setLookup(ReturnArgument.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("argumentIndex")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Stub/ReturnArgument.php")
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
