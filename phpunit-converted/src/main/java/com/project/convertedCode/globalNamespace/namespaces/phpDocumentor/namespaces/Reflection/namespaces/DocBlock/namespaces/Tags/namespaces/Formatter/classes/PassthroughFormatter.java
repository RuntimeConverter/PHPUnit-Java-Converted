package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.Formatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Formatter/PassthroughFormatter.php

*/

public class PassthroughFormatter extends RuntimeClassBase implements Formatter {

    public PassthroughFormatter(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tag",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tag"
    )
    public Object format(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.trim
                        .env(env)
                        .call(
                                "@"
                                        + toStringR(
                                                env.callMethod(
                                                        tag, "getName", PassthroughFormatter.class),
                                                env)
                                        + " "
                                        + toStringR(toStringR(tag, env), env))
                        .value());
    }

    public static final Object CONST_class =
            "phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter\\PassthroughFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter\\PassthroughFormatter")
                    .setLookup(PassthroughFormatter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Formatter/PassthroughFormatter.php")
                    .addInterface("Formatter")
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
