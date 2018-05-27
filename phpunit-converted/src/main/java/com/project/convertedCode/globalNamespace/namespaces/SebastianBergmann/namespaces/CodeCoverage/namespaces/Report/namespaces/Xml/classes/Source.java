package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.XMLSerializer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.NamespaceUri;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.Tokenizer;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Source.php

*/

public final class Source extends RuntimeClassBase {

    public Object context = null;

    public Source(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Source.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("context").set(context);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "string")
    public Object setSourceCode(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, null);
        Object context = null;
        Object tokens = null;
        Object srcDom = null;
        context = ZVal.assign(toObjectR(this).accessProp(this, env).name("context").value());
        tokens = env.callMethod(new Tokenizer(env), "parse", Source.class, source);
        srcDom =
                env.callMethod(
                        new XMLSerializer(
                                env,
                                new NamespaceUri(
                                        env,
                                        toObjectR(context)
                                                .accessProp(this, env)
                                                .name("namespaceURI")
                                                .value())),
                        "toDom",
                        Source.class,
                        tokens);
        env.callMethod(
                toObjectR(context).accessProp(this, env).name("parentNode").value(),
                "replaceChild",
                Source.class,
                env.callMethod(
                        toObjectR(context).accessProp(this, env).name("ownerDocument").value(),
                        "importNode",
                        Source.class,
                        toObjectR(srcDom).accessProp(this, env).name("documentElement").value(),
                        true),
                context);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Source";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Source")
                    .setLookup(Source.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("context")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Source.php")
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
