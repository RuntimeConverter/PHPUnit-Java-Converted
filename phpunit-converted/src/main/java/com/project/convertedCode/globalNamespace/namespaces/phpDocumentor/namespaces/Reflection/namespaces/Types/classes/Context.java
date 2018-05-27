package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

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
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/Context.php

*/

public final class Context extends RuntimeClassBase {

    public Object namespace = null;

    public Object namespaceAliases = null;

    public Context(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Context.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(
        index = 1,
        name = "namespaceAliases",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, null);
        Object namespaceAliases = assignParameter(args, 1, null);
        if (ZVal.isNull(namespaceAliases)) {
            namespaceAliases = ZVal.newArray();
        }
        Object alias = null;
        Object fqnn = ZVal.newArray();
        toObjectR(this)
                .accessProp(this, env)
                .name("namespace")
                .set(
                        ZVal.toBool(ZVal.strictNotEqualityCheck("global", "!==", namespace))
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        "default", "!==", namespace))
                                ? NamespaceGlobal.trim
                                        .env(env)
                                        .call(toStringR(namespace, env), "\\")
                                        .value()
                                : "");
        for (ZPair zpairResult45 : ZVal.getIterable(namespaceAliases, env, false)) {
            alias = ZVal.assign(zpairResult45.getKey());
            fqnn = ZVal.assign(zpairResult45.getValue());
            if (ZVal.strictEqualityCheck(ZVal.getElement(fqnn, 0), "===", "\\")) {
                fqnn = NamespaceGlobal.substr.env(env).call(fqnn, 1).value();
            }

            if (ZVal.strictEqualityCheck(
                    ZVal.getElement(
                            fqnn,
                            ZVal.subtract(NamespaceGlobal.strlen.env(env).call(fqnn).value(), 1)),
                    "===",
                    "\\")) {
                fqnn = NamespaceGlobal.substr.env(env).call(fqnn, 0, -1).value();
            }

            ZVal.putArrayElement(namespaceAliases, alias, fqnn);
        }

        toObjectR(this).accessProp(this, env).name("namespaceAliases").set(namespaceAliases);
        return null;
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("namespace").value());
    }

    @ConvertedMethod
    public Object getNamespaceAliases(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("namespaceAliases").value());
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\Context";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\Types\\Context")
                    .setLookup(Context.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("namespace", "namespaceAliases")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/Context.php")
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
