package com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.NamespaceUri;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeClasses.xml.XMLWriter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/theseer/tokenizer/src/XMLSerializer.php

*/

public class XMLSerializer extends RuntimeClassBase {

    public Object writer = null;

    public Object previousToken = null;

    public Object xmlns = null;

    public XMLSerializer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == XMLSerializer.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xmlns",
        typeHint = "TheSeer\\Tokenizer\\NamespaceUri",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object xmlns = assignParameter(args, 0, null);
        if (ZVal.isNull(xmlns)) {
            xmlns = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(xmlns, "===", ZVal.getNull())) {
            xmlns = new NamespaceUri(env, "https://github.com/theseer/tokenizer");
        }

        toObjectR(this).accessProp(this, env).name("xmlns").set(xmlns);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tokens",
        typeHint = "TheSeer\\Tokenizer\\TokenCollection"
    )
    public Object toDom(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        Object dom = null;
        dom = new DOMDocument(env);
        toObjectR(dom).accessProp(this, env).name("preserveWhiteSpace").set(false);
        env.callMethod(
                dom,
                "loadXML",
                XMLSerializer.class,
                env.callMethod(this, "toXML", XMLSerializer.class, tokens));
        return ZVal.assign(dom);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tokens",
        typeHint = "TheSeer\\Tokenizer\\TokenCollection"
    )
    public Object toXML(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        if (ZVal.isNull(tokens)) {
            tokens = ZVal.newArray();
        }
        Object token = null;
        toObjectR(this).accessProp(this, env).name("writer").set(new XMLWriter(env));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "openMemory",
                XMLSerializer.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "setIndent",
                XMLSerializer.class,
                true);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "startDocument",
                XMLSerializer.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "startElement",
                XMLSerializer.class,
                "source");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "writeAttribute",
                XMLSerializer.class,
                "xmlns",
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("xmlns").value(),
                        "asString",
                        XMLSerializer.class));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "startElement",
                XMLSerializer.class,
                "line");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "writeAttribute",
                XMLSerializer.class,
                "no",
                "1");
        toObjectR(this).accessProp(this, env).name("previousToken").set(ZVal.getElement(tokens, 0));
        for (ZPair zpairResult492 : ZVal.getIterable(tokens, env, true)) {
            token = ZVal.assign(zpairResult492.getValue());
            env.callMethod(this, "addToken", XMLSerializer.class, token);
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "endElement",
                XMLSerializer.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "endElement",
                XMLSerializer.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("writer").value(),
                "endDocument",
                XMLSerializer.class);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("writer").value(),
                        "outputMemory",
                        XMLSerializer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token", typeHint = "TheSeer\\Tokenizer\\Token")
    private Object addToken(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, null);
        if (ZVal.isLessThan(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("previousToken").value(),
                        "getLine",
                        XMLSerializer.class),
                '<',
                env.callMethod(token, "getLine", XMLSerializer.class))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("writer").value(),
                    "endElement",
                    XMLSerializer.class);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("writer").value(),
                    "startElement",
                    XMLSerializer.class,
                    "line");
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("writer").value(),
                    "writeAttribute",
                    XMLSerializer.class,
                    "no",
                    toStringR(env.callMethod(token, "getLine", XMLSerializer.class), env));
            toObjectR(this).accessProp(this, env).name("previousToken").set(token);
        }

        if (ZVal.strictNotEqualityCheck(
                env.callMethod(token, "getValue", XMLSerializer.class), "!==", "")) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("writer").value(),
                    "startElement",
                    XMLSerializer.class,
                    "token");
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("writer").value(),
                    "writeAttribute",
                    XMLSerializer.class,
                    "name",
                    env.callMethod(token, "getName", XMLSerializer.class));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("writer").value(),
                    "writeRaw",
                    XMLSerializer.class,
                    NamespaceGlobal.htmlspecialchars
                            .env(env)
                            .call(
                                    env.callMethod(token, "getValue", XMLSerializer.class),
                                    ZVal.toLong(ZVal.toLong(0) | ZVal.toLong(128))
                                            | ZVal.toLong(16))
                            .value());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("writer").value(),
                    "endElement",
                    XMLSerializer.class);
        }

        return null;
    }

    public static final Object CONST_class = "TheSeer\\Tokenizer\\XMLSerializer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("TheSeer\\Tokenizer\\XMLSerializer")
                    .setLookup(XMLSerializer.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("previousToken", "writer", "xmlns")
                    .setFilename("vendor/theseer/tokenizer/src/XMLSerializer.php")
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
