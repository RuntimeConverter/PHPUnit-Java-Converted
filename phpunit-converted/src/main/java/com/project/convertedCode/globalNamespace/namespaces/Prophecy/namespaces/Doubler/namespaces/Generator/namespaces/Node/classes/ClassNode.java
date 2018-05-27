package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.MethodNotExtendableException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/ClassNode.php

*/

public class ClassNode extends RuntimeClassBase {

    public Object parentClass = "stdClass";

    public Object interfaces = ZVal.newArray();

    public Object properties = ZVal.newArray();

    public Object unextendableMethods = ZVal.newArray();

    public Object methods = ZVal.newArray();

    public ClassNode(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getParentClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("parentClass").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object setParentClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("parentClass")
                .set(ZVal.isTrue(_pClass) ? _pClass : "stdClass");
        return null;
    }

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("interfaces").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object addInterface(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, null);
        if (ZVal.isTrue(env.callMethod(this, "hasInterface", ClassNode.class, _pInterface))) {
            return null;
        }

        CRArrayF.array_unshift
                .env(env)
                .call(
                        toObjectR(this).accessProp(this, env).name("interfaces").value(),
                        _pInterface);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object hasInterface(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, null);
        return ZVal.assign(
                CRArrayF.in_array
                        .env(env)
                        .call(
                                _pInterface,
                                toObjectR(this).accessProp(this, env).name("interfaces").value())
                        .value());
    }

    @ConvertedMethod
    public Object getProperties(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("properties").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object addProperty(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object visibility = assignParameter(args, 1, null);
        if (ZVal.isNull(visibility)) {
            visibility = "public";
        }
        visibility = NamespaceGlobal.strtolower.env(env).call(visibility).value();
        if (!CRArrayF.in_array
                .env(env)
                .call(
                        visibility,
                        ZVal.newArray(
                                new ZPair(0, "public"),
                                new ZPair(1, "private"),
                                new ZPair(2, "protected")))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("`%s` property visibility is not supported.", visibility)
                                    .value()));
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("properties").value(), name, visibility);
        return null;
    }

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("methods").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "method",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\MethodNode"
    )
    public Object addMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, null);
        Object message = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        "isExtendable",
                        ClassNode.class,
                        env.callMethod(method, "getName", ClassNode.class)))) {
            message =
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "Method `%s` is not extendable, so can not be added.",
                                    env.callMethod(method, "getName", ClassNode.class))
                            .value();
            throw ZVal.getException(
                    env,
                    new MethodNotExtendableException(
                            env,
                            message,
                            env.callMethod(this, "getParentClass", ClassNode.class),
                            env.callMethod(method, "getName", ClassNode.class)));
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("methods").value(),
                env.callMethod(method, "getName", ClassNode.class),
                method);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object removeMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        ZVal.unsetArrayElement(toObjectR(this).accessProp(this, env).name("methods").value(), name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "hasMethod", ClassNode.class, name))
                        ? ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("methods").value(), name)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("methods").value(),
                                name)));
    }

    @ConvertedMethod
    public Object getUnextendableMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("unextendableMethods").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unextendableMethod")
    public Object addUnextendableMethod(RuntimeEnv env, Object... args) {
        Object unextendableMethod = assignParameter(args, 0, null);
        if (!ZVal.isTrue(
                env.callMethod(this, "isExtendable", ClassNode.class, unextendableMethod))) {
            return null;
        }

        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("unextendableMethods").value(),
                unextendableMethod);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object isExtendable(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, null);
        return ZVal.assign(
                !CRArrayF.in_array
                        .env(env)
                        .call(
                                method,
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("unextendableMethods")
                                        .value())
                        .getBool());
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\Node\\ClassNode";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\Node\\ClassNode")
                    .setLookup(ClassNode.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "interfaces",
                            "methods",
                            "parentClass",
                            "properties",
                            "unextendableMethods")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/ClassNode.php")
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
