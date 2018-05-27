package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.ArgumentNode;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.MethodNode;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.ClassNode;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.ClassMirrorException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassMirror.php

*/

public class ClassMirror extends RuntimeClassBase {

    public ClassMirror(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    public Object reflect(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        if (ZVal.isNull(_pClass)) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, null);
        Object node = null;
        Object _pInterface = null;
        node = new ClassNode(env);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pClass)) {
            if (ZVal.strictEqualityCheck(
                    true, "===", env.callMethod(_pClass, "isInterface", ClassMirror.class))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Could not reflect %s as a class, because it\n"
                                                        + "is interface - use the second argument instead.",
                                                env.callMethod(
                                                        _pClass, "getName", ClassMirror.class))
                                        .value()));
            }

            env.callMethod(this, "reflectClassToNode", ClassMirror.class, _pClass, node);
        }

        for (ZPair zpairResult64 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult64.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            _pInterface, ReflectionClass.class, "ReflectionClass"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "[ReflectionClass $interface1 [, ReflectionClass $interface2]] array expected as\n"
                                                        + "a second argument to `ClassMirror::reflect(...)`, but got %s.",
                                                function_is_object
                                                                .f
                                                                .env(env)
                                                                .call(_pInterface)
                                                                .getBool()
                                                        ? toStringR(
                                                                        function_get_class
                                                                                .f
                                                                                .env(env)
                                                                                .call(_pInterface)
                                                                                .value(),
                                                                        env)
                                                                + " class"
                                                        : NamespaceGlobal.gettype
                                                                .env(env)
                                                                .call(_pInterface)
                                                                .value())
                                        .value()));
            }

            if (ZVal.strictEqualityCheck(
                    false, "===", env.callMethod(_pInterface, "isInterface", ClassMirror.class))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Could not reflect %s as an interface, because it\n"
                                                        + "is class - use the first argument instead.",
                                                env.callMethod(
                                                        _pInterface, "getName", ClassMirror.class))
                                        .value()));
            }

            env.callMethod(this, "reflectInterfaceToNode", ClassMirror.class, _pInterface, node);
        }

        env.callMethod(
                node,
                "addInterface",
                ClassMirror.class,
                "Prophecy\\Doubler\\Generator\\ReflectionInterface");
        return ZVal.assign(node);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "ReflectionClass")
    @ConvertedParameter(
        index = 1,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object reflectClassToNode(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object _pClass = assignParameter(args, 0, null);
        Object node = assignParameter(args, 1, null);
        Object method = null;
        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(_pClass, "isFinal", ClassMirror.class))) {
            throw ZVal.getException(
                    env,
                    new ClassMirrorException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Could not reflect class %s as it is marked final.",
                                            env.callMethod(_pClass, "getName", ClassMirror.class))
                                    .value(),
                            _pClass));
        }

        env.callMethod(
                node,
                "setParentClass",
                ClassMirror.class,
                env.callMethod(_pClass, "getName", ClassMirror.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult65 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getMethods", ClassMirror.class, 2), env, true)) {
            method = ZVal.assign(zpairResult65.getValue());
            if (ZVal.strictEqualityCheck(
                    false, "===", env.callMethod(method, "isProtected", ClassMirror.class))) {
                continue;
            }

            env.callMethod(this, "reflectMethodToNode", ClassMirror.class, method, node);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult66 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getMethods", ClassMirror.class, 256), env, true)) {
            method = ZVal.assign(zpairResult66.getValue());
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    NamespaceGlobal.strpos
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            method, "getName", ClassMirror.class),
                                                    "_")
                                            .value()))
                    && ZVal.toBool(
                            !CRArrayF.in_array
                                    .env(env)
                                    .call(
                                            env.callMethod(method, "getName", ClassMirror.class),
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Prophecy
                                                                    .namespaces
                                                                    .Doubler
                                                                    .namespaces
                                                                    .Generator
                                                                    .classes
                                                                    .ClassMirror
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .reflectableMethods)
                                    .getBool())) {
                continue;
            }

            if (ZVal.strictEqualityCheck(
                    true, "===", env.callMethod(method, "isFinal", ClassMirror.class))) {
                env.callMethod(
                        node,
                        "addUnextendableMethod",
                        ClassMirror.class,
                        env.callMethod(method, "getName", ClassMirror.class));
                continue;
            }

            env.callMethod(this, "reflectMethodToNode", ClassMirror.class, method, node);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface", typeHint = "ReflectionClass")
    @ConvertedParameter(
        index = 1,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object reflectInterfaceToNode(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, null);
        Object node = assignParameter(args, 1, null);
        Object method = null;
        env.callMethod(
                node,
                "addInterface",
                ClassMirror.class,
                env.callMethod(_pInterface, "getName", ClassMirror.class));
        for (ZPair zpairResult67 :
                ZVal.getIterable(
                        env.callMethod(_pInterface, "getMethods", ClassMirror.class), env, true)) {
            method = ZVal.assign(zpairResult67.getValue());
            env.callMethod(this, "reflectMethodToNode", ClassMirror.class, method, node);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    @ConvertedParameter(
        index = 1,
        name = "classNode",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object reflectMethodToNode(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, null);
        Object classNode = assignParameter(args, 1, null);
        Object node = null;
        Object returnTypeLower = null;
        Object param = null;
        Object params = null;
        Object returnType = null;
        node = new MethodNode(env, env.callMethod(method, "getName", ClassMirror.class));
        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(method, "isProtected", ClassMirror.class))) {
            env.callMethod(node, "setVisibility", ClassMirror.class, "protected");
        }

        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(method, "isStatic", ClassMirror.class))) {
            env.callMethod(node, "setStatic", ClassMirror.class);
        }

        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(method, "returnsReference", ClassMirror.class))) {
            env.callMethod(node, "setReturnsReference", ClassMirror.class);
        }

        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.1.16", "7.0", ">=")
                                .value())
                && ZVal.toBool(env.callMethod(method, "hasReturnType", ClassMirror.class))) {
            returnType =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(method, "getReturnType", ClassMirror.class),
                                    env));
            returnTypeLower = NamespaceGlobal.strtolower.env(env).call(returnType).value();
            if (ZVal.strictEqualityCheck("self", "===", returnTypeLower)) {
                returnType =
                        env.callMethod(
                                env.callMethod(method, "getDeclaringClass", ClassMirror.class),
                                "getName",
                                ClassMirror.class);
            }

            if (ZVal.strictEqualityCheck("parent", "===", returnTypeLower)) {
                returnType =
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                method, "getDeclaringClass", ClassMirror.class),
                                        "getParentClass",
                                        ClassMirror.class),
                                "getName",
                                ClassMirror.class);
            }

            env.callMethod(node, "setReturnType", ClassMirror.class, returnType);
            if (ZVal.toBool(
                            NamespaceGlobal.version_compare
                                    .env(env)
                                    .call("7.1.16", "7.1", ">=")
                                    .value())
                    && ZVal.toBool(
                            env.callMethod(
                                    env.callMethod(method, "getReturnType", ClassMirror.class),
                                    "allowsNull",
                                    ClassMirror.class))) {
                env.callMethod(node, "setNullableReturnType", ClassMirror.class, true);
            }
        }

        if (ZVal.toBool(
                        function_is_array
                                .f
                                .env(env)
                                .call(
                                        params =
                                                env.callMethod(
                                                        method, "getParameters", ClassMirror.class))
                                .value())
                && ZVal.toBool(CRArrayF.count.env(env).call(params).value())) {
            for (ZPair zpairResult68 : ZVal.getIterable(params, env, true)) {
                param = ZVal.assign(zpairResult68.getValue());
                env.callMethod(this, "reflectArgumentToNode", ClassMirror.class, param, node);
            }
        }

        env.callMethod(classNode, "addMethod", ClassMirror.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    @ConvertedParameter(
        index = 1,
        name = "methodNode",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\MethodNode"
    )
    private Object reflectArgumentToNode(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, null);
        Object methodNode = assignParameter(args, 1, null);
        Object node = null;
        Object name = null;
        name =
                ZVal.assign(
                        ZVal.equalityCheck(
                                        env.callMethod(parameter, "getName", ClassMirror.class),
                                        "...")
                                ? "__dot_dot_dot__"
                                : env.callMethod(parameter, "getName", ClassMirror.class));
        node = new ArgumentNode(env, name);
        env.callMethod(
                node,
                "setTypeHint",
                ClassMirror.class,
                env.callMethod(this, "getTypeHint", ClassMirror.class, parameter));
        if (ZVal.isTrue(env.callMethod(this, "isVariadic", ClassMirror.class, parameter))) {
            env.callMethod(node, "setAsVariadic", ClassMirror.class);
        }

        if (ZVal.isTrue(env.callMethod(this, "hasDefaultValue", ClassMirror.class, parameter))) {
            env.callMethod(
                    node,
                    "setDefault",
                    ClassMirror.class,
                    env.callMethod(this, "getDefaultValue", ClassMirror.class, parameter));
        }

        if (ZVal.isTrue(env.callMethod(parameter, "isPassedByReference", ClassMirror.class))) {
            env.callMethod(node, "setAsPassedByReference", ClassMirror.class);
        }

        env.callMethod(methodNode, "addArgument", ClassMirror.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object hasDefaultValue(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, null);
        if (ZVal.isTrue(env.callMethod(this, "isVariadic", ClassMirror.class, parameter))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(env.callMethod(parameter, "isDefaultValueAvailable", ClassMirror.class))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.toBool(env.callMethod(parameter, "isOptional", ClassMirror.class))
                        || ZVal.toBool(
                                env.callMethod(this, "isNullable", ClassMirror.class, parameter)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object getDefaultValue(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, null);
        if (!ZVal.isTrue(env.callMethod(parameter, "isDefaultValueAvailable", ClassMirror.class))) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(env.callMethod(parameter, "getDefaultValue", ClassMirror.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object getTypeHint(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, null);
        Object className = null;
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                className =
                        env.callMethod(
                                this, "getParameterClassName", ClassMirror.class, parameter))) {
            return ZVal.assign(className);
        }

        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(parameter, "isArray", ClassMirror.class))) {
            return "array";
        }

        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.1.16", "5.4", ">=")
                                .value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                true,
                                "===",
                                env.callMethod(parameter, "isCallable", ClassMirror.class)))) {
            return "callable";
        }

        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.1.16", "7.0", ">=")
                                .value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                true,
                                "===",
                                env.callMethod(parameter, "hasType", ClassMirror.class)))) {
            return ZVal.assign(
                    toStringR(env.callMethod(parameter, "getType", ClassMirror.class), env));
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object isVariadic(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(70116, ">=", 50600))
                        && ZVal.toBool(env.callMethod(parameter, "isVariadic", ClassMirror.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object isNullable(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.toBool(env.callMethod(parameter, "allowsNull", ClassMirror.class))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.getNull(),
                                        "!==",
                                        env.callMethod(
                                                this,
                                                "getTypeHint",
                                                ClassMirror.class,
                                                parameter))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object getParameterClassName(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, null);
        Object e = null;
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        try {
            return ZVal.assign(
                    ZVal.isTrue(env.callMethod(parameter, "getClass", ClassMirror.class))
                            ? env.callMethod(
                                    env.callMethod(parameter, "getClass", ClassMirror.class),
                                    "getName",
                                    ClassMirror.class)
                            : ZVal.getNull());
        } catch (ConvertedException convertedException11) {
            if (convertedException11.instanceOf(ReflectionException.class, "ReflectionException")) {
                e = convertedException11.getObject();
                NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/\\[\\s\\<\\w+?>\\s([\\w,\\\\]+)/s", parameter, matches.getObject());
                return ZVal.assign(
                        ZVal.isset(ZVal.getElement(matches.getObject(), 1))
                                ? ZVal.getElement(matches.getObject(), 1)
                                : ZVal.getNull());
            } else {
                throw convertedException11;
            }
        }
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\ClassMirror";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object reflectableMethods =
                ZVal.newArray(
                        new ZPair(0, "__construct"),
                        new ZPair(1, "__destruct"),
                        new ZPair(2, "__sleep"),
                        new ZPair(3, "__wakeup"),
                        new ZPair(4, "__toString"),
                        new ZPair(5, "__call"),
                        new ZPair(6, "__invoke"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\ClassMirror")
                    .setLookup(ClassMirror.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassMirror.php")
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
