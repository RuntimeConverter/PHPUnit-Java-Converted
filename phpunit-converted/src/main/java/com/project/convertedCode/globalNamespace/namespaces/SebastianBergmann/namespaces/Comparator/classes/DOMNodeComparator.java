package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ObjectComparator;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMNode;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/DOMNodeComparator.php

*/

public class DOMNodeComparator extends ObjectComparator {

    public DOMNodeComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DOMNodeComparator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object accepts(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        return ZVal.assign(
                ZVal.toBool(ZVal.checkInstanceType(expected, DOMNode.class, "DOMNode"))
                        && ZVal.toBool(ZVal.checkInstanceType(actual, DOMNode.class, "DOMNode")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    @ConvertedParameter(
        index = 2,
        name = "delta",
        defaultValue = "0.0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "canonicalize",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "ignoreCase",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "processed",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object assertEquals(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        Object delta = assignParameter(args, 2, null);
        if (ZVal.isNull(delta)) {
            delta = 0.0;
        }
        Object canonicalize = assignParameter(args, 3, null);
        if (ZVal.isNull(canonicalize)) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 4, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        ReferenceContainer processed =
                assignParameterRef(runtimePassByReferenceArgs, args, 5, null);
        if (ZVal.isNull(processed)) {
            processed.setObject(ZVal.newArray());
        }
        Object expectedAsString = null;
        Object type = null;
        Object actualAsString = null;
        expectedAsString =
                env.callMethod(
                        this, "nodeToText", DOMNodeComparator.class, expected, true, ignoreCase);
        actualAsString =
                env.callMethod(
                        this, "nodeToText", DOMNodeComparator.class, actual, true, ignoreCase);
        if (ZVal.strictNotEqualityCheck(expectedAsString, "!==", actualAsString)) {
            type =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    expected, DOMDocument.class, "DOMDocument"))
                                    ? "documents"
                                    : "nodes");
            throw ZVal.getException(
                    env,
                    new ComparisonFailure(
                            env,
                            expected,
                            actual,
                            expectedAsString,
                            actualAsString,
                            false,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Failed asserting that two DOM %s are equal.\n", type)
                                    .value()));
        }

        return null;
    }

    public Object assertEquals(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "DOMNode")
    @ConvertedParameter(index = 1, name = "canonicalize", typeHint = "bool")
    @ConvertedParameter(index = 2, name = "ignoreCase", typeHint = "bool")
    private Object nodeToText(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object canonicalize = assignParameter(args, 1, null);
        Object ignoreCase = assignParameter(args, 2, null);
        Object document = null;
        Object text = null;
        if (ZVal.isTrue(canonicalize)) {
            document = new DOMDocument(env);
            env.callMethod(
                    document,
                    "loadXML",
                    DOMNodeComparator.class,
                    env.callMethod(node, "C14N", DOMNodeComparator.class));
            node = ZVal.assign(document);
        }

        document =
                ZVal.assign(
                        ZVal.isTrue(ZVal.checkInstanceType(node, DOMDocument.class, "DOMDocument"))
                                ? node
                                : toObjectR(node)
                                        .accessProp(this, env)
                                        .name("ownerDocument")
                                        .value());
        toObjectR(document).accessProp(this, env).name("formatOutput").set(true);
        env.callMethod(document, "normalizeDocument", DOMNodeComparator.class);
        text =
                ZVal.assign(
                        ZVal.isTrue(ZVal.checkInstanceType(node, DOMDocument.class, "DOMDocument"))
                                ? env.callMethod(node, "saveXML", DOMNodeComparator.class)
                                : env.callMethod(
                                        document, "saveXML", DOMNodeComparator.class, node));
        return ZVal.assign(
                ZVal.isTrue(ignoreCase)
                        ? text
                        : NamespaceGlobal.strtolower.env(env).call(text).value());
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\DOMNodeComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ObjectComparator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\DOMNodeComparator")
                    .setLookup(DOMNodeComparator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/DOMNodeComparator.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ObjectComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ArrayComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\Comparator")
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
