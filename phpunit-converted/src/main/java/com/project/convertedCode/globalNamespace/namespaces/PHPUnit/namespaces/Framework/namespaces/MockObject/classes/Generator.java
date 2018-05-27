package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes.ExceptionInterface;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.InvalidArgumentHelper;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes.Instantiator;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.modules.standard.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.nativeClasses.soap.SoapClient;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.MockObject;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Generator.php

*/

public class Generator extends RuntimeClassBase {

    public Object blacklistedMethodNames =
            ZVal.newArray(
                    new ZPair("__CLASS__", true),
                    new ZPair("__DIR__", true),
                    new ZPair("__FILE__", true),
                    new ZPair("__FUNCTION__", true),
                    new ZPair("__LINE__", true),
                    new ZPair("__METHOD__", true),
                    new ZPair("__NAMESPACE__", true),
                    new ZPair("__TRAIT__", true),
                    new ZPair("__clone", true),
                    new ZPair("__halt_compiler", true));

    public Generator(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "methods", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "mockClassName")
    @ConvertedParameter(
        index = 4,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "callOriginalMethods",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 9,
        name = "proxyTarget",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 10,
        name = "allowMockingUnknownTypes",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 11,
        name = "returnValueGeneration",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getMock(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object methods = assignParameter(args, 1, null);
        if (ZVal.isNull(methods)) {
            methods = ZVal.newArray();
        }
        Object arguments = assignParameter(args, 2, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 3, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 5, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 6, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        Object cloneArguments = assignParameter(args, 7, null);
        if (ZVal.isNull(cloneArguments)) {
            cloneArguments = true;
        }
        Object callOriginalMethods = assignParameter(args, 8, null);
        if (ZVal.isNull(callOriginalMethods)) {
            callOriginalMethods = false;
        }
        Object proxyTarget = assignParameter(args, 9, null);
        if (ZVal.isNull(proxyTarget)) {
            proxyTarget = ZVal.getNull();
        }
        Object allowMockingUnknownTypes = assignParameter(args, 10, null);
        if (ZVal.isNull(allowMockingUnknownTypes)) {
            allowMockingUnknownTypes = true;
        }
        Object returnValueGeneration = assignParameter(args, 11, null);
        if (ZVal.isNull(returnValueGeneration)) {
            returnValueGeneration = true;
        }
        Object method = null;
        Object _type = null;
        Object reflect = null;
        Object mock = ZVal.newArray();
        if (ZVal.toBool(!function_is_array.f.env(env).call(type).getBool())
                && ZVal.toBool(!function_is_string.f.env(env).call(type).getBool())) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "array or string"));
        }

        if (!function_is_string.f.env(env).call(mockClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 4, "string"));
        }

        if (ZVal.toBool(!function_is_array.f.env(env).call(methods).getBool())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", methods))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(env, 2, "array", methods));
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(type, "===", "Traversable"))
                || ZVal.toBool(ZVal.strictEqualityCheck(type, "===", "\\Traversable"))) {
            type = "Iterator";
        }

        if (function_is_array.f.env(env).call(type).getBool()) {
            type =
                    CRArrayF.array_unique
                            .env(env)
                            .call(
                                    CRArrayF.array_map
                                            .env(env)
                                            .call(
                                                    new Closure(env) {
                                                        @Override
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object type =
                                                                    assignParameter(args, 0, null);
                                                            if (ZVal.toBool(
                                                                            ZVal.toBool(
                                                                                            ZVal
                                                                                                    .strictEqualityCheck(
                                                                                                            type,
                                                                                                            "===",
                                                                                                            "Traversable"))
                                                                                    || ZVal.toBool(
                                                                                            ZVal
                                                                                                    .strictEqualityCheck(
                                                                                                            type,
                                                                                                            "===",
                                                                                                            "\\Traversable")))
                                                                    || ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            type,
                                                                                            "===",
                                                                                            "\\Iterator"))) {
                                                                return "Iterator";
                                                            }

                                                            return ZVal.assign(type);
                                                        }
                                                    },
                                                    type)
                                            .value())
                            .value();
        }

        if (!ZVal.isTrue(allowMockingUnknownTypes)) {
            if (function_is_array.f.env(env).call(type).getBool()) {
                for (ZPair zpairResult222 : ZVal.getIterable(type, env, true)) {
                    _type = ZVal.assign(zpairResult222.getValue());
                    if (ZVal.toBool(
                                    !function_class_exists
                                            .f
                                            .env(env)
                                            .call(_type, callAutoload)
                                            .getBool())
                            && ZVal.toBool(
                                    !NamespaceGlobal.interface_exists
                                            .env(env)
                                            .call(_type, callAutoload)
                                            .getBool())) {
                        throw ZVal.getException(
                                env,
                                new RuntimeException(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Cannot stub or mock class or interface \"%s\" which does not exist",
                                                        _type)
                                                .value()));
                    }
                }

            } else {
                if (ZVal.toBool(
                                !function_class_exists
                                        .f
                                        .env(env)
                                        .call(type, callAutoload)
                                        .getBool())
                        && ZVal.toBool(
                                !NamespaceGlobal.interface_exists
                                        .env(env)
                                        .call(type, callAutoload)
                                        .getBool())) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "Cannot stub or mock class or interface \"%s\" which does not exist",
                                                    type)
                                            .value()));
                }
            }
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", methods)) {
            for (ZPair zpairResult223 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult223.getValue());
                if (!NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call("~[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*~", method)
                        .getBool()) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "Cannot stub or mock method with invalid name \"%s\"",
                                                    method)
                                            .value()));
                }
            }

            if (ZVal.strictNotEqualityCheck(
                    methods, "!==", CRArrayF.array_unique.env(env).call(methods).value())) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Cannot stub or mock using a method list that contains duplicates: \"%s\" (duplicate: \"%s\")",
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", methods)
                                                        .value(),
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                ", ",
                                                                CRArrayF.array_unique
                                                                        .env(env)
                                                                        .call(
                                                                                CRArrayF
                                                                                        .array_diff_assoc
                                                                                        .env(env)
                                                                                        .call(
                                                                                                methods,
                                                                                                CRArrayF
                                                                                                        .array_unique
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                methods)
                                                                                                        .value())
                                                                                        .value())
                                                                        .value())
                                                        .value())
                                        .value()));
            }
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(mockClassName, "!==", ""))
                && ZVal.toBool(
                        function_class_exists.f.env(env).call(mockClassName, false).value())) {
            reflect = new ReflectionClass(env, mockClassName);
            if (!ZVal.isTrue(
                    env.callMethod(
                            reflect,
                            "implementsInterface",
                            Generator.class,
                            MockObject.CONST_class))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Class \"%s\" already exists.", mockClassName)
                                        .value()));
            }
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(callOriginalConstructor, "===", false))
                && ZVal.toBool(ZVal.strictEqualityCheck(callOriginalMethods, "===", true))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Proxying to original methods requires invoking the original constructor"));
        }

        mock =
                env.callMethod(
                        this,
                        "generate",
                        Generator.class,
                        type,
                        methods,
                        mockClassName,
                        callOriginalClone,
                        callAutoload,
                        cloneArguments,
                        callOriginalMethods);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getObject",
                        Generator.class,
                        ZVal.getElement(mock, "code"),
                        ZVal.getElement(mock, "mockClassName"),
                        type,
                        callOriginalConstructor,
                        callAutoload,
                        arguments,
                        callOriginalMethods,
                        proxyTarget,
                        returnValueGeneration));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockedMethods",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getMockForAbstractClass(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        Object mockedMethods = assignParameter(args, 6, null);
        if (ZVal.isNull(mockedMethods)) {
            mockedMethods = ZVal.newArray();
        }
        Object cloneArguments = assignParameter(args, 7, null);
        if (ZVal.isNull(cloneArguments)) {
            cloneArguments = true;
        }
        Object method = null;
        Object reflector = null;
        Object methods = ZVal.newArray();
        if (!function_is_string.f.env(env).call(originalClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
        }

        if (!function_is_string.f.env(env).call(mockClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 3, "string"));
        }

        if (ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call(originalClassName, callAutoload)
                                .value())
                || ZVal.toBool(
                        NamespaceGlobal.interface_exists
                                .env(env)
                                .call(originalClassName, callAutoload)
                                .value())) {
            reflector = new ReflectionClass(env, originalClassName);
            methods = ZVal.assign(mockedMethods);
            for (ZPair zpairResult224 :
                    ZVal.getIterable(
                            env.callMethod(reflector, "getMethods", Generator.class), env, true)) {
                method = ZVal.assign(zpairResult224.getValue());
                if (ZVal.toBool(env.callMethod(method, "isAbstract", Generator.class))
                        && ZVal.toBool(
                                !CRArrayF.in_array
                                        .env(env)
                                        .call(
                                                env.callMethod(method, "getName", Generator.class),
                                                methods)
                                        .getBool())) {
                    ZVal.addToArray(methods, env.callMethod(method, "getName", Generator.class));
                }
            }

            if (ZVal.isEmpty(methods)) {
                methods = ZVal.getNull();
            }

            return ZVal.assign(
                    env.callMethod(
                            this,
                            "getMock",
                            Generator.class,
                            originalClassName,
                            methods,
                            arguments,
                            mockClassName,
                            callOriginalConstructor,
                            callOriginalClone,
                            callAutoload,
                            cloneArguments));
        }

        throw ZVal.getException(
                env,
                new RuntimeException(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call("Class \"%s\" does not exist.", originalClassName)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traitName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockedMethods",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getMockForTrait(RuntimeEnv env, Object... args) {
        Object traitName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        Object mockedMethods = assignParameter(args, 6, null);
        if (ZVal.isNull(mockedMethods)) {
            mockedMethods = ZVal.newArray();
        }
        Object cloneArguments = assignParameter(args, 7, null);
        if (ZVal.isNull(cloneArguments)) {
            cloneArguments = true;
        }
        Object classTemplate = null;
        Object className = ZVal.newArray();
        if (!function_is_string.f.env(env).call(traitName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
        }

        if (!function_is_string.f.env(env).call(mockClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 3, "string"));
        }

        if (!NamespaceGlobal.trait_exists.env(env).call(traitName, callAutoload).getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Trait \"%s\" does not exist.", traitName)
                                    .value()));
        }

        className =
                env.callMethod(this, "generateClassName", Generator.class, traitName, "", "Trait_");
        classTemplate = env.callMethod(this, "getTemplate", Generator.class, "trait_class.tpl");
        env.callMethod(
                classTemplate,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("prologue", "abstract "),
                        new ZPair("class_name", ZVal.getElement(className, "className")),
                        new ZPair("trait_name", traitName)));
        env.callMethod(
                this,
                "evalClass",
                Generator.class,
                env.callMethod(classTemplate, "render", Generator.class),
                ZVal.getElement(className, "className"));
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getMockForAbstractClass",
                        Generator.class,
                        ZVal.getElement(className, "className"),
                        arguments,
                        mockClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload,
                        mockedMethods,
                        cloneArguments));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traitName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "traitClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getObjectForTrait(RuntimeEnv env, Object... args) {
        Object traitName = assignParameter(args, 0, null);
        Object arguments = assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object traitClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(traitClassName)) {
            traitClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        Object classTemplate = null;
        Object className = ZVal.newArray();
        if (!function_is_string.f.env(env).call(traitName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
        }

        if (!function_is_string.f.env(env).call(traitClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 3, "string"));
        }

        if (!NamespaceGlobal.trait_exists.env(env).call(traitName, callAutoload).getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Trait \"%s\" does not exist.", traitName)
                                    .value()));
        }

        className =
                env.callMethod(
                        this,
                        "generateClassName",
                        Generator.class,
                        traitName,
                        traitClassName,
                        "Trait_");
        classTemplate = env.callMethod(this, "getTemplate", Generator.class, "trait_class.tpl");
        env.callMethod(
                classTemplate,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("prologue", ""),
                        new ZPair("class_name", ZVal.getElement(className, "className")),
                        new ZPair("trait_name", traitName)));
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getObject",
                        Generator.class,
                        env.callMethod(classTemplate, "render", Generator.class),
                        ZVal.getElement(className, "className")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "methods",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "callOriginalMethods",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object generate(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object methods = assignParameter(args, 1, null);
        if (ZVal.isNull(methods)) {
            methods = ZVal.getNull();
        }
        Object mockClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = "";
        }
        Object callOriginalClone = assignParameter(args, 3, null);
        if (ZVal.isNull(callOriginalClone)) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 4, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = true;
        }
        Object cloneArguments = assignParameter(args, 5, null);
        if (ZVal.isNull(cloneArguments)) {
            cloneArguments = true;
        }
        Object callOriginalMethods = assignParameter(args, 6, null);
        if (ZVal.isNull(callOriginalMethods)) {
            callOriginalMethods = false;
        }
        Object mock = null;
        Object key = null;
        if (function_is_array.f.env(env).call(type).getBool()) {
            CRArrayF.sort.env(env).call(type);
        }

        if (ZVal.strictEqualityCheck(mockClassName, "===", "")) {
            key =
                    NamespaceGlobal.md5
                            .env(env)
                            .call(
                                    function_is_array.f.env(env).call(type).getBool()
                                            ? NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("_", type)
                                                    .value()
                                            : toStringR(type, env)
                                                    + toStringR(
                                                            function_serialize
                                                                    .f
                                                                    .env(env)
                                                                    .call(methods)
                                                                    .value(),
                                                            env)
                                                    + toStringR(
                                                            function_serialize
                                                                    .f
                                                                    .env(env)
                                                                    .call(callOriginalClone)
                                                                    .value(),
                                                            env)
                                                    + toStringR(
                                                            function_serialize
                                                                    .f
                                                                    .env(env)
                                                                    .call(cloneArguments)
                                                                    .value(),
                                                            env)
                                                    + toStringR(
                                                            function_serialize
                                                                    .f
                                                                    .env(env)
                                                                    .call(callOriginalMethods)
                                                                    .value(),
                                                            env))
                            .value();
            if (ZVal.isset(
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Framework
                                                    .namespaces
                                                    .MockObject
                                                    .classes
                                                    .Generator
                                                    .RequestStaticProperties
                                                    .class)
                                    .cache,
                            key))) {
                return ZVal.assign(
                        ZVal.getElement(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .PHPUnit
                                                        .namespaces
                                                        .Framework
                                                        .namespaces
                                                        .MockObject
                                                        .classes
                                                        .Generator
                                                        .RequestStaticProperties
                                                        .class)
                                        .cache,
                                key));
            }
        }

        mock =
                env.callMethod(
                        this,
                        "generateMock",
                        Generator.class,
                        type,
                        methods,
                        mockClassName,
                        callOriginalClone,
                        callAutoload,
                        cloneArguments,
                        callOriginalMethods);
        if (ZVal.isset(key)) {
            ZVal.putArrayElement(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .namespaces
                                            .MockObject
                                            .classes
                                            .Generator
                                            .RequestStaticProperties
                                            .class)
                            .cache,
                    key,
                    mock);
        }

        return ZVal.assign(mock);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "wsdlFile")
    @ConvertedParameter(index = 1, name = "className")
    @ConvertedParameter(
        index = 2,
        name = "methods",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object generateClassFromWsdl(RuntimeEnv env, Object... args) {
        Object wsdlFile = assignParameter(args, 0, null);
        Object className = assignParameter(args, 1, null);
        Object methods = assignParameter(args, 2, null);
        if (ZVal.isNull(methods)) {
            methods = ZVal.newArray();
        }
        Object options = assignParameter(args, 3, null);
        if (ZVal.isNull(options)) {
            options = ZVal.newArray();
        }
        Object method = null;
        Object classTemplate = null;
        Object i = null;
        Object methodTemplate = null;
        Object _methods = null;
        Object ___args = ZVal.newArray();
        Object nameEnd = null;
        Object nameStart = null;
        Object methodsBuffer = null;
        Object name = null;
        Object namespace = null;
        Object parts = null;
        Object client = null;
        Object optionsBuffer = null;
        Object value = null;
        Object key = null;
        if (!NamespaceGlobal.extension_loaded.env(env).call("soap").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "The SOAP extension is required to generate a mock object from WSDL."));
        }

        options =
                CRArrayF.array_merge
                        .env(env)
                        .call(options, ZVal.newArray(new ZPair("cache_wsdl", 0)))
                        .value();
        client = new SoapClient(env, wsdlFile, options);
        _methods =
                CRArrayF.array_unique
                        .env(env)
                        .call(env.callMethod(client, "__getFunctions", Generator.class))
                        .value();
        client = null;
        CRArrayF.sort.env(env).call(_methods);
        methodTemplate = env.callMethod(this, "getTemplate", Generator.class, "wsdl_method.tpl");
        methodsBuffer = "";
        for (ZPair zpairResult225 : ZVal.getIterable(_methods, env, true)) {
            method = ZVal.assign(zpairResult225.getValue());
            nameStart = ZVal.add(NamespaceGlobal.strpos.env(env).call(method, " ").value(), 1);
            nameEnd = NamespaceGlobal.strpos.env(env).call(method, "(").value();
            name =
                    NamespaceGlobal.substr
                            .env(env)
                            .call(method, nameStart, ZVal.subtract(nameEnd, nameStart))
                            .value();
            if (ZVal.toBool(ZVal.isEmpty(methods))
                    || ZVal.toBool(CRArrayF.in_array.env(env).call(name, methods).value())) {
                ___args =
                        NamespaceGlobal.explode
                                .env(env)
                                .call(
                                        ",",
                                        NamespaceGlobal.substr
                                                .env(env)
                                                .call(
                                                        method,
                                                        ZVal.add(nameEnd, 1),
                                                        ZVal.subtract(
                                                                ZVal.subtract(
                                                                        NamespaceGlobal.strpos
                                                                                .env(env)
                                                                                .call(method, ")")
                                                                                .value(),
                                                                        nameEnd),
                                                                1))
                                                .value())
                                .value();
                for (ZPair zpairResult226 :
                        ZVal.getIterable(
                                CRArrayF.range
                                        .env(env)
                                        .call(
                                                0,
                                                ZVal.subtract(
                                                        CRArrayF.count
                                                                .env(env)
                                                                .call(___args)
                                                                .value(),
                                                        1))
                                        .value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult226.getValue());
                    ZVal.putArrayElement(
                            ___args,
                            i,
                            NamespaceGlobal.substr
                                    .env(env)
                                    .call(
                                            ZVal.getElement(___args, i),
                                            NamespaceGlobal.strpos
                                                    .env(env)
                                                    .call(ZVal.getElement(___args, i), "$")
                                                    .value())
                                    .value());
                }

                env.callMethod(
                        methodTemplate,
                        "setVar",
                        Generator.class,
                        ZVal.newArray(
                                new ZPair("method_name", name),
                                new ZPair(
                                        "arguments",
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(", ", ___args)
                                                .value())));
                methodsBuffer =
                        toStringR(methodsBuffer, env)
                                + toStringR(
                                        env.callMethod(methodTemplate, "render", Generator.class),
                                        env);
            }
        }

        optionsBuffer = "array(";
        for (ZPair zpairResult227 : ZVal.getIterable(options, env, false)) {
            key = ZVal.assign(zpairResult227.getKey());
            value = ZVal.assign(zpairResult227.getValue());
            optionsBuffer =
                    toStringR(optionsBuffer, env)
                            + toStringR(key, env)
                            + " => "
                            + toStringR(value, env);
        }

        optionsBuffer = toStringR(optionsBuffer, env) + ")";
        classTemplate = env.callMethod(this, "getTemplate", Generator.class, "wsdl_class.tpl");
        namespace = "";
        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(className, "\\").value(), "!==", false)) {
            parts = NamespaceGlobal.explode.env(env).call("\\", className).value();
            className = CRArrayF.array_pop.env(env).call(parts).value();
            namespace =
                    "namespace "
                            + toStringR(
                                    NamespaceGlobal.implode.env(env).call("\\", parts).value(), env)
                            + ";"
                            + "\n\n";
        }

        env.callMethod(
                classTemplate,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("namespace", namespace),
                        new ZPair("class_name", className),
                        new ZPair("wsdl", wsdlFile),
                        new ZPair("options", optionsBuffer),
                        new ZPair("methods", methodsBuffer)));
        return ZVal.assign(env.callMethod(classTemplate, "render", Generator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object getClassMethods(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object method = null;
        Object methods = ZVal.newArray();
        Object _pClass = null;
        _pClass = new ReflectionClass(env, className);
        methods = ZVal.newArray();
        for (ZPair zpairResult228 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getMethods", Generator.class), env, true)) {
            method = ZVal.assign(zpairResult228.getValue());
            if (ZVal.toBool(env.callMethod(method, "isPublic", Generator.class))
                    || ZVal.toBool(env.callMethod(method, "isAbstract", Generator.class))) {
                ZVal.addToArray(methods, env.callMethod(method, "getName", Generator.class));
            }
        }

        return ZVal.assign(methods);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "className")
    @ConvertedParameter(index = 2, name = "type")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callAutoload",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 6,
        name = "callOriginalMethods",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "proxyTarget",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "returnValueGeneration",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    private Object getObject(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, null);
        Object className = assignParameter(args, 1, null);
        Object type = assignParameter(args, 2, null);
        if (ZVal.isNull(type)) {
            type = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, null);
        if (ZVal.isNull(callOriginalConstructor)) {
            callOriginalConstructor = false;
        }
        Object callAutoload = assignParameter(args, 4, null);
        if (ZVal.isNull(callAutoload)) {
            callAutoload = false;
        }
        Object arguments = assignParameter(args, 5, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object callOriginalMethods = assignParameter(args, 6, null);
        if (ZVal.isNull(callOriginalMethods)) {
            callOriginalMethods = false;
        }
        Object proxyTarget = assignParameter(args, 7, null);
        if (ZVal.isNull(proxyTarget)) {
            proxyTarget = ZVal.getNull();
        }
        Object returnValueGeneration = assignParameter(args, 8, null);
        if (ZVal.isNull(returnValueGeneration)) {
            returnValueGeneration = true;
        }
        Object exception = null;
        Object instantiator = null;
        Object _pClass = null;
        Object _object = null;
        env.callMethod(this, "evalClass", Generator.class, code, className);
        if (ZVal.toBool(
                        ZVal.toBool(callOriginalConstructor)
                                && ZVal.toBool(function_is_string.f.env(env).call(type).value()))
                && ZVal.toBool(
                        !NamespaceGlobal.interface_exists
                                .env(env)
                                .call(type, callAutoload)
                                .getBool())) {
            if (ZVal.strictEqualityCheck(
                    CRArrayF.count.env(env).call(arguments).value(), "===", 0)) {
                _object = env.createNew(className);

            } else {
                _pClass = new ReflectionClass(env, className);
                _object = env.callMethod(_pClass, "newInstanceArgs", Generator.class, arguments);
            }

        } else {
            try {
                instantiator = new Instantiator(env);
                _object = env.callMethod(instantiator, "instantiate", Generator.class, className);
            } catch (ConvertedException convertedException17) {
                if (convertedException17.instanceOf(
                        ExceptionInterface.class,
                        "Doctrine\\Instantiator\\Exception\\ExceptionInterface")) {
                    exception = convertedException17.getObject();
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env, env.callMethod(exception, "getMessage", Generator.class)));
                } else {
                    throw convertedException17;
                }
            }
        }

        if (ZVal.isTrue(callOriginalMethods)) {
            if (!function_is_object.f.env(env).call(proxyTarget).getBool()) {
                if (ZVal.strictEqualityCheck(
                        CRArrayF.count.env(env).call(arguments).value(), "===", 0)) {
                    proxyTarget = env.createNew(type);

                } else {
                    _pClass = new ReflectionClass(env, type);
                    proxyTarget =
                            env.callMethod(_pClass, "newInstanceArgs", Generator.class, arguments);
                }
            }

            env.callMethod(_object, "__phpunit_setOriginalObject", Generator.class, proxyTarget);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        _object, MockObject.class, "PHPUnit\\Framework\\MockObject\\MockObject"))) {
            env.callMethod(
                    _object,
                    "__phpunit_setReturnValueGeneration",
                    Generator.class,
                    returnValueGeneration);
        }

        return ZVal.assign(_object);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "className")
    private Object evalClass(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, null);
        Object className = assignParameter(args, 1, null);
        if (!function_class_exists.f.env(env).call(className, false).getBool()) {
            com.runtimeconverter.runtime.ZVal.functionNotFound("eval222").env(env).call(code);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "methods")
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(index = 3, name = "callOriginalClone")
    @ConvertedParameter(index = 4, name = "callAutoload")
    @ConvertedParameter(index = 5, name = "cloneArguments")
    @ConvertedParameter(index = 6, name = "callOriginalMethods")
    private Object generateMock(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object methods = assignParameter(args, 1, null);
        if (ZVal.isNull(methods)) {
            methods = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = ZVal.newArray();
        }
        Object callOriginalClone = assignParameter(args, 3, null);
        Object callAutoload = assignParameter(args, 4, null);
        Object cloneArguments = assignParameter(args, 5, null);
        Object callOriginalMethods = assignParameter(args, 6, null);
        Object cloneMethod = null;
        Object classTemplate = null;
        Object methodTemplate = null;
        Object additionalInterfaces = ZVal.newArray();
        Object epilogue = null;
        Object cloneTemplate = null;
        Object isInterface = null;
        Object _pClass = null;
        Object prologue = null;
        Object mockedMethods = null;
        Object isClass = null;
        Object method = null;
        Object e = null;
        Object _type = null;
        Object methodName = null;
        Object isMultipleInterfaces = null;
        Object methodReflections = ZVal.newArray();
        Object typeClass = null;
        Object configurable = ZVal.newArray();
        methodReflections = ZVal.newArray();
        classTemplate = env.callMethod(this, "getTemplate", Generator.class, "mocked_class.tpl");
        additionalInterfaces = ZVal.newArray();
        cloneTemplate = "";
        isClass = false;
        isInterface = false;
        isMultipleInterfaces = false;
        if (function_is_array.f.env(env).call(type).getBool()) {
            for (ZPair zpairResult229 : ZVal.getIterable(type, env, true)) {
                _type = ZVal.assign(zpairResult229.getValue());
                if (!NamespaceGlobal.interface_exists
                        .env(env)
                        .call(_type, callAutoload)
                        .getBool()) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call("Interface \"%s\" does not exist.", _type)
                                            .value()));
                }

                isMultipleInterfaces = true;
                ZVal.addToArray(additionalInterfaces, _type);
                typeClass =
                        new ReflectionClass(
                                env,
                                ZVal.getElement(
                                        env.callMethod(
                                                this,
                                                "generateClassName",
                                                Generator.class,
                                                _type,
                                                mockClassName,
                                                "Mock_"),
                                        "fullClassName"));
                for (ZPair zpairResult230 :
                        ZVal.getIterable(
                                env.callMethod(this, "getClassMethods", Generator.class, _type),
                                env,
                                true)) {
                    method = ZVal.assign(zpairResult230.getValue());
                    if (CRArrayF.in_array.env(env).call(method, methods).getBool()) {
                        throw ZVal.getException(
                                env,
                                new RuntimeException(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Duplicate method \"%s\" not allowed.",
                                                        method)
                                                .value()));
                    }

                    ZVal.putArrayElement(
                            methodReflections,
                            method,
                            env.callMethod(typeClass, "getMethod", Generator.class, method));
                    ZVal.addToArray(methods, method);
                }
            }
        }

        mockClassName =
                env.callMethod(
                        this, "generateClassName", Generator.class, type, mockClassName, "Mock_");
        if (function_class_exists
                .f
                .env(env)
                .call(ZVal.getElement(mockClassName, "fullClassName"), callAutoload)
                .getBool()) {
            isClass = true;

        } else if (NamespaceGlobal.interface_exists
                .env(env)
                .call(ZVal.getElement(mockClassName, "fullClassName"), callAutoload)
                .getBool()) {
            isInterface = true;
        }

        if (ZVal.toBool(!ZVal.isTrue(isClass)) && ZVal.toBool(!ZVal.isTrue(isInterface))) {
            prologue =
                    "class "
                            + toStringR(ZVal.getElement(mockClassName, "originalClassName"), env)
                            + "\n{\n}\n\n";
            if (!ZVal.isEmpty(ZVal.getElement(mockClassName, "namespaceName"))) {
                prologue =
                        "namespace "
                                + toStringR(ZVal.getElement(mockClassName, "namespaceName"), env)
                                + " {\n\n"
                                + toStringR(prologue, env)
                                + "}\n\n"
                                + "namespace {\n\n";
                epilogue = "\n\n}";
            }

            cloneTemplate =
                    env.callMethod(this, "getTemplate", Generator.class, "mocked_clone.tpl");

        } else {
            _pClass = new ReflectionClass(env, ZVal.getElement(mockClassName, "fullClassName"));
            if (ZVal.toBool(isInterface)
                    && ZVal.toBool(
                            env.callMethod(
                                    _pClass,
                                    "implementsInterface",
                                    Generator.class,
                                    "Throwable"))) {
                ZVal.addToArray(
                        additionalInterfaces, env.callMethod(_pClass, "getName", Generator.class));
                isInterface = false;
                mockClassName =
                        env.callMethod(
                                this,
                                "generateClassName",
                                Generator.class,
                                "Exception",
                                "",
                                "Mock_");
                _pClass = new ReflectionClass(env, ZVal.getElement(mockClassName, "fullClassName"));
            }

            if (ZVal.isTrue(env.callMethod(_pClass, "isFinal", Generator.class))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Class \"%s\" is declared \"final\" and cannot be mocked.",
                                                ZVal.getElement(mockClassName, "fullClassName"))
                                        .value()));
            }

            if (ZVal.isTrue(env.callMethod(_pClass, "hasMethod", Generator.class, "__clone"))) {
                cloneMethod = env.callMethod(_pClass, "getMethod", Generator.class, "__clone");
                if (!ZVal.isTrue(env.callMethod(cloneMethod, "isFinal", Generator.class))) {
                    if (ZVal.toBool(callOriginalClone) && ZVal.toBool(!ZVal.isTrue(isInterface))) {
                        cloneTemplate =
                                env.callMethod(
                                        this, "getTemplate", Generator.class, "unmocked_clone.tpl");

                    } else {
                        cloneTemplate =
                                env.callMethod(
                                        this, "getTemplate", Generator.class, "mocked_clone.tpl");
                    }
                }

            } else {
                cloneTemplate =
                        env.callMethod(this, "getTemplate", Generator.class, "mocked_clone.tpl");
            }
        }

        if (function_is_object.f.env(env).call(cloneTemplate).getBool()) {
            cloneTemplate = env.callMethod(cloneTemplate, "render", Generator.class);
        }

        if (ZVal.toBool(
                        ZVal.toBool(function_is_array.f.env(env).call(methods).value())
                                && ZVal.toBool(ZVal.isEmpty(methods)))
                && ZVal.toBool(ZVal.toBool(isClass) || ZVal.toBool(isInterface))) {
            methods =
                    env.callMethod(
                            this,
                            "getClassMethods",
                            Generator.class,
                            ZVal.getElement(mockClassName, "fullClassName"));
        }

        if (!function_is_array.f.env(env).call(methods).getBool()) {
            methods = ZVal.newArray();
        }

        mockedMethods = "";
        configurable = ZVal.newArray();
        for (ZPair zpairResult231 : ZVal.getIterable(methods, env, true)) {
            methodName = ZVal.assign(zpairResult231.getValue());
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(methodName, "!==", "__construct"))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(methodName, "!==", "__clone"))) {
                ZVal.addToArray(
                        configurable, NamespaceGlobal.strtolower.env(env).call(methodName).value());
            }
        }

        if (ZVal.isset(_pClass)) {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(isInterface)
                                                    && ZVal.toBool(
                                                            env.callMethod(
                                                                    _pClass,
                                                                    "implementsInterface",
                                                                    Generator.class,
                                                                    "Traversable")))
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            _pClass,
                                                            "implementsInterface",
                                                            Generator.class,
                                                            "Iterator"))))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            _pClass,
                                            "implementsInterface",
                                            Generator.class,
                                            "IteratorAggregate")))) {
                ZVal.addToArray(additionalInterfaces, "Iterator");
                methods =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        methods,
                                        env.callMethod(
                                                this,
                                                "getClassMethods",
                                                Generator.class,
                                                "Iterator"))
                                .value();
            }

            for (ZPair zpairResult232 : ZVal.getIterable(methods, env, true)) {
                methodName = ZVal.assign(zpairResult232.getValue());
                try {
                    method = env.callMethod(_pClass, "getMethod", Generator.class, methodName);
                    if (ZVal.isTrue(
                            env.callMethod(this, "canMockMethod", Generator.class, method))) {
                        mockedMethods =
                                toStringR(mockedMethods, env)
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        "generateMockedMethodDefinitionFromExisting",
                                                        Generator.class,
                                                        method,
                                                        cloneArguments,
                                                        callOriginalMethods),
                                                env);
                    }

                } catch (ConvertedException convertedException18) {
                    if (convertedException18.instanceOf(
                            ReflectionException.class, "ReflectionException")) {
                        e = convertedException18.getObject();
                        mockedMethods =
                                toStringR(mockedMethods, env)
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        "generateMockedMethodDefinition",
                                                        Generator.class,
                                                        ZVal.getElement(
                                                                mockClassName, "fullClassName"),
                                                        methodName,
                                                        cloneArguments),
                                                env);
                    } else {
                        throw convertedException18;
                    }
                }
            }

        } else if (ZVal.isTrue(isMultipleInterfaces)) {
            for (ZPair zpairResult233 : ZVal.getIterable(methods, env, true)) {
                methodName = ZVal.assign(zpairResult233.getValue());
                if (ZVal.isTrue(
                        env.callMethod(
                                this,
                                "canMockMethod",
                                Generator.class,
                                ZVal.getElement(methodReflections, methodName)))) {
                    mockedMethods =
                            toStringR(mockedMethods, env)
                                    + toStringR(
                                            env.callMethod(
                                                    this,
                                                    "generateMockedMethodDefinitionFromExisting",
                                                    Generator.class,
                                                    ZVal.getElement(methodReflections, methodName),
                                                    cloneArguments,
                                                    callOriginalMethods),
                                            env);
                }
            }

        } else {
            for (ZPair zpairResult234 : ZVal.getIterable(methods, env, true)) {
                methodName = ZVal.assign(zpairResult234.getValue());
                mockedMethods =
                        toStringR(mockedMethods, env)
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                "generateMockedMethodDefinition",
                                                Generator.class,
                                                ZVal.getElement(mockClassName, "fullClassName"),
                                                methodName,
                                                cloneArguments),
                                        env);
            }
        }

        method = "";
        if (ZVal.toBool(!CRArrayF.in_array.env(env).call("method", methods).getBool())
                && ZVal.toBool(
                        ZVal.toBool(!ZVal.isset(_pClass))
                                || ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        _pClass,
                                                        "hasMethod",
                                                        Generator.class,
                                                        "method"))))) {
            methodTemplate =
                    env.callMethod(this, "getTemplate", Generator.class, "mocked_class_method.tpl");
            method = env.callMethod(methodTemplate, "render", Generator.class);
        }

        env.callMethod(
                classTemplate,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("prologue", ZVal.isTrue(prologue) ? prologue : ""),
                        new ZPair("epilogue", ZVal.isTrue(epilogue) ? epilogue : ""),
                        new ZPair(
                                "class_declaration",
                                env.callMethod(
                                        this,
                                        "generateMockClassDeclaration",
                                        Generator.class,
                                        mockClassName,
                                        isInterface,
                                        additionalInterfaces)),
                        new ZPair("clone", cloneTemplate),
                        new ZPair("mock_class_name", ZVal.getElement(mockClassName, "className")),
                        new ZPair("mocked_methods", mockedMethods),
                        new ZPair("method", method),
                        new ZPair(
                                "configurable",
                                "["
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                ", ",
                                                                CRArrayF.array_map
                                                                        .env(env)
                                                                        .call(
                                                                                new Closure(env) {
                                                                                    @Override
                                                                                    public Object
                                                                                            run(
                                                                                                    RuntimeEnv
                                                                                                            env,
                                                                                                    Object
                                                                                                            thisvar,
                                                                                                    PassByReferenceArgs
                                                                                                            runtimePassByReferenceArgs,
                                                                                                    Object...
                                                                                                            args) {
                                                                                        Object m =
                                                                                                assignParameter(
                                                                                                        args,
                                                                                                        0,
                                                                                                        null);
                                                                                        return ZVal
                                                                                                .assign(
                                                                                                        "'"
                                                                                                                + toStringR(
                                                                                                                        m,
                                                                                                                        env)
                                                                                                                + "'");
                                                                                    }
                                                                                },
                                                                                configurable)
                                                                        .value())
                                                        .value(),
                                                env)
                                        + "]")));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("code", env.callMethod(classTemplate, "render", Generator.class)),
                        new ZPair("mockClassName", ZVal.getElement(mockClassName, "className"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "className")
    @ConvertedParameter(index = 2, name = "prefix")
    private Object generateClassName(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        if (ZVal.isNull(type)) {
            type = ZVal.newArray();
        }
        Object className = assignParameter(args, 1, null);
        Object prefix = assignParameter(args, 2, null);
        Object fullClassName = null;
        Object classNameParts = null;
        Object namespaceName = null;
        if (function_is_array.f.env(env).call(type).getBool()) {
            type = NamespaceGlobal.implode.env(env).call("_", type).value();
        }

        if (ZVal.strictEqualityCheck(ZVal.getElement(type, 0), "===", "\\")) {
            type = NamespaceGlobal.substr.env(env).call(type, 1).value();
        }

        classNameParts = NamespaceGlobal.explode.env(env).call("\\", type).value();
        if (ZVal.isGreaterThan(CRArrayF.count.env(env).call(classNameParts).value(), '>', 1)) {
            type = CRArrayF.array_pop.env(env).call(classNameParts).value();
            namespaceName = NamespaceGlobal.implode.env(env).call("\\", classNameParts).value();
            fullClassName = toStringR(namespaceName, env) + "\\" + toStringR(type, env);

        } else {
            namespaceName = "";
            fullClassName = ZVal.assign(type);
        }

        if (ZVal.strictEqualityCheck(className, "===", "")) {
            do {
                className =
                        toStringR(prefix, env)
                                + toStringR(type, env)
                                + "_"
                                + toStringR(
                                        NamespaceGlobal.substr
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.md5
                                                                .env(env)
                                                                .call(
                                                                        NamespaceGlobal.mt_rand
                                                                                .env(env)
                                                                                .call()
                                                                                .value())
                                                                .value(),
                                                        0,
                                                        8)
                                                .value(),
                                        env);

            } while (function_class_exists.f.env(env).call(className, false).getBool());
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("className", className),
                        new ZPair("originalClassName", type),
                        new ZPair("fullClassName", fullClassName),
                        new ZPair("namespaceName", namespaceName)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mockClassName", typeHint = "array")
    @ConvertedParameter(index = 1, name = "isInterface")
    @ConvertedParameter(
        index = 2,
        name = "additionalInterfaces",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    private Object generateMockClassDeclaration(RuntimeEnv env, Object... args) {
        Object mockClassName = assignParameter(args, 0, null);
        if (ZVal.isNull(mockClassName)) {
            mockClassName = ZVal.newArray();
        }
        Object isInterface = assignParameter(args, 1, null);
        Object additionalInterfaces = assignParameter(args, 2, null);
        if (ZVal.isNull(additionalInterfaces)) {
            additionalInterfaces = ZVal.newArray();
        }
        Object interfaces = null;
        Object buffer = null;
        buffer = "class ";
        ZVal.addToArray(additionalInterfaces, MockObject.CONST_class);
        interfaces = NamespaceGlobal.implode.env(env).call(", ", additionalInterfaces).value();
        if (ZVal.isTrue(isInterface)) {
            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "%s implements %s",
                                                    ZVal.getElement(mockClassName, "className"),
                                                    interfaces)
                                            .value(),
                                    env);
            if (!CRArrayF.in_array
                    .env(env)
                    .call(ZVal.getElement(mockClassName, "originalClassName"), additionalInterfaces)
                    .getBool()) {
                buffer = toStringR(buffer, env) + ", ";
                if (!ZVal.isEmpty(ZVal.getElement(mockClassName, "namespaceName"))) {
                    buffer =
                            toStringR(buffer, env)
                                    + toStringR(
                                            ZVal.getElement(mockClassName, "namespaceName"), env)
                                    + "\\";
                }

                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        ZVal.getElement(mockClassName, "originalClassName"), env);
            }

        } else {
            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "%s extends %s%s implements %s",
                                                    ZVal.getElement(mockClassName, "className"),
                                                    !ZVal.isEmpty(
                                                                    ZVal.getElement(
                                                                            mockClassName,
                                                                            "namespaceName"))
                                                            ? toStringR(
                                                                            ZVal.getElement(
                                                                                    mockClassName,
                                                                                    "namespaceName"),
                                                                            env)
                                                                    + "\\"
                                                            : "",
                                                    ZVal.getElement(
                                                            mockClassName, "originalClassName"),
                                                    interfaces)
                                            .value(),
                                    env);
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    @ConvertedParameter(index = 1, name = "cloneArguments")
    @ConvertedParameter(index = 2, name = "callOriginalMethods")
    private Object generateMockedMethodDefinitionFromExisting(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, null);
        Object cloneArguments = assignParameter(args, 1, null);
        Object callOriginalMethods = assignParameter(args, 2, null);
        Object reference = null;
        Object modifier = null;
        ReferenceContainer deprecation = new BasicReferenceContainer(ZVal.newArray());
        Object returnType = null;
        if (ZVal.isTrue(env.callMethod(method, "isPrivate", Generator.class))) {
            modifier = "private";

        } else if (ZVal.isTrue(env.callMethod(method, "isProtected", Generator.class))) {
            modifier = "protected";

        } else {
            modifier = "public";
        }

        if (ZVal.isTrue(env.callMethod(method, "isStatic", Generator.class))) {
            modifier = toStringR(modifier, env) + " static";
        }

        if (ZVal.isTrue(env.callMethod(method, "returnsReference", Generator.class))) {
            reference = "&";

        } else {
            reference = "";
        }

        if (ZVal.isTrue(env.callMethod(method, "hasReturnType", Generator.class))) {
            returnType =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(method, "getReturnType", Generator.class), env));

        } else {
            returnType = "";
        }

        if (NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences().add(2, deprecation))
                .call(
                        "#\\*[ \\t]*+@deprecated[ \\t]*+(.*?)\\r?+\\n[ \\t]*+\\*(?:[ \\t]*+@|/$)#s",
                        env.callMethod(method, "getDocComment", Generator.class),
                        deprecation.getObject())
                .getBool()) {
            deprecation.setObject(
                    NamespaceGlobal.trim
                            .env(env)
                            .call(
                                    NamespaceGlobal.preg_replace
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    "#[ \\t]*\\r?\\n[ \\t]*+\\*[ \\t]*+#",
                                                    " ",
                                                    ZVal.getElement(deprecation.getObject(), 1))
                                            .value())
                            .value());

        } else {
            deprecation.setObject(false);
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "generateMockedMethodDefinition",
                        Generator.class,
                        env.callMethod(
                                env.callMethod(method, "getDeclaringClass", Generator.class),
                                "getName",
                                Generator.class),
                        env.callMethod(method, "getName", Generator.class),
                        cloneArguments,
                        modifier,
                        env.callMethod(this, "getMethodParameters", Generator.class, method),
                        env.callMethod(this, "getMethodParameters", Generator.class, method, true),
                        returnType,
                        reference,
                        callOriginalMethods,
                        env.callMethod(method, "isStatic", Generator.class),
                        deprecation.getObject(),
                        ZVal.toBool(env.callMethod(method, "hasReturnType", Generator.class))
                                && ZVal.toBool(
                                        env.callMethod(
                                                env.callMethod(
                                                        method, "getReturnType", Generator.class),
                                                "allowsNull",
                                                Generator.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(
        index = 2,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "modifier")
    @ConvertedParameter(index = 4, name = "argumentsForDeclaration")
    @ConvertedParameter(index = 5, name = "argumentsForCall")
    @ConvertedParameter(index = 6, name = "returnType")
    @ConvertedParameter(index = 7, name = "reference")
    @ConvertedParameter(
        index = 8,
        name = "callOriginalMethods",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 9,
        name = "static",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 10,
        name = "deprecation",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 11,
        name = "allowsReturnNull",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object generateMockedMethodDefinition(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object methodName = assignParameter(args, 1, null);
        Object cloneArguments = assignParameter(args, 2, null);
        if (ZVal.isNull(cloneArguments)) {
            cloneArguments = true;
        }
        Object modifier = assignParameter(args, 3, null);
        if (ZVal.isNull(modifier)) {
            modifier = "public";
        }
        Object argumentsForDeclaration = assignParameter(args, 4, null);
        if (ZVal.isNull(argumentsForDeclaration)) {
            argumentsForDeclaration = "";
        }
        Object argumentsForCall = assignParameter(args, 5, null);
        if (ZVal.isNull(argumentsForCall)) {
            argumentsForCall = "";
        }
        Object returnType = assignParameter(args, 6, null);
        if (ZVal.isNull(returnType)) {
            returnType = "";
        }
        Object reference = assignParameter(args, 7, null);
        if (ZVal.isNull(reference)) {
            reference = "";
        }
        Object callOriginalMethods = assignParameter(args, 8, null);
        if (ZVal.isNull(callOriginalMethods)) {
            callOriginalMethods = false;
        }
        Object _pStatic = assignParameter(args, 9, null);
        if (ZVal.isNull(_pStatic)) {
            _pStatic = false;
        }
        Object deprecation = assignParameter(args, 10, null);
        if (ZVal.isNull(deprecation)) {
            deprecation = false;
        }
        Object allowsReturnNull = assignParameter(args, 11, null);
        if (ZVal.isNull(allowsReturnNull)) {
            allowsReturnNull = false;
        }
        Object template = null;
        Object deprecationTemplate = null;
        Object reflector = null;
        Object parentClass = null;
        Object templateFile = null;
        if (ZVal.isTrue(_pStatic)) {
            templateFile = "mocked_static_method.tpl";

        } else {
            if (ZVal.strictEqualityCheck(returnType, "===", "void")) {
                templateFile =
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%s_method_void.tpl",
                                        ZVal.isTrue(callOriginalMethods) ? "proxied" : "mocked")
                                .value();

            } else {
                templateFile =
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%s_method.tpl",
                                        ZVal.isTrue(callOriginalMethods) ? "proxied" : "mocked")
                                .value();
            }
        }

        if (ZVal.strictEqualityCheck(returnType, "===", "self")) {
            returnType = ZVal.assign(className);
        }

        if (ZVal.strictEqualityCheck(returnType, "===", "parent")) {
            reflector = new ReflectionClass(env, className);
            parentClass = env.callMethod(reflector, "getParentClass", Generator.class);
            if (ZVal.strictEqualityCheck(parentClass, "===", ZVal.getNull())) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Cannot mock %s::%s because \"parent\" return type declaration is used but %s does not have a parent class",
                                                className, methodName, className)
                                        .value()));
            }

            returnType = env.callMethod(parentClass, "getName", Generator.class);
        }

        if (ZVal.strictNotEqualityCheck(false, "!==", deprecation)) {
            deprecation =
                    ZVal.assign(
                            "The "
                                    + toStringR(className, env)
                                    + "::"
                                    + toStringR(methodName, env)
                                    + " method is deprecated ("
                                    + toStringR(deprecation, env)
                                    + ").");
            deprecationTemplate =
                    env.callMethod(this, "getTemplate", Generator.class, "deprecation.tpl");
            env.callMethod(
                    deprecationTemplate,
                    "setVar",
                    Generator.class,
                    ZVal.newArray(
                            new ZPair(
                                    "deprecation",
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(deprecation, true)
                                            .value())));
            deprecation = env.callMethod(deprecationTemplate, "render", Generator.class);
        }

        template = env.callMethod(this, "getTemplate", Generator.class, templateFile);
        env.callMethod(
                template,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("arguments_decl", argumentsForDeclaration),
                        new ZPair("arguments_call", argumentsForCall),
                        new ZPair("return_delim", ZVal.isTrue(returnType) ? ": " : ""),
                        new ZPair(
                                "return_type",
                                ZVal.isTrue(allowsReturnNull)
                                        ? "?" + toStringR(returnType, env)
                                        : returnType),
                        new ZPair(
                                "arguments_count",
                                !ZVal.isEmpty(argumentsForCall)
                                        ? ZVal.add(
                                                NamespaceGlobal.substr_count
                                                        .env(env)
                                                        .call(argumentsForCall, ",")
                                                        .value(),
                                                1)
                                        : 0),
                        new ZPair("class_name", className),
                        new ZPair("method_name", methodName),
                        new ZPair("modifier", modifier),
                        new ZPair("reference", reference),
                        new ZPair(
                                "clone_arguments", ZVal.isTrue(cloneArguments) ? "true" : "false"),
                        new ZPair("deprecation", deprecation)));
        return ZVal.assign(env.callMethod(template, "render", Generator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    private Object canMockMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, null);
        return ZVal.assign(
                !ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                env.callMethod(
                                                                        method,
                                                                        "isConstructor",
                                                                        Generator.class))
                                                        || ZVal.toBool(
                                                                env.callMethod(
                                                                        method,
                                                                        "isFinal",
                                                                        Generator.class)))
                                        || ZVal.toBool(
                                                env.callMethod(
                                                        method, "isPrivate", Generator.class)))
                        || ZVal.toBool(
                                env.callMethod(
                                        this,
                                        "isMethodNameBlacklisted",
                                        Generator.class,
                                        env.callMethod(method, "getName", Generator.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object isMethodNameBlacklisted(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("blacklistedMethodNames")
                                        .value(),
                                name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    @ConvertedParameter(
        index = 1,
        name = "forCall",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object getMethodParameters(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object method = assignParameter(args, 0, null);
        Object forCall = assignParameter(args, 1, null);
        if (ZVal.isNull(forCall)) {
            forCall = false;
        }
        Object nullable = null;
        Object e = null;
        Object i = null;
        Object typeDeclaration = null;
        Object reference = null;
        Object _pDefault = null;
        Object parameter = null;
        Object name = null;
        Object parameters = ZVal.newArray();
        Object _pClass = null;
        Object value = null;
        parameters = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult235 :
                ZVal.getIterable(
                        env.callMethod(method, "getParameters", Generator.class), env, false)) {
            i = ZVal.assign(zpairResult235.getKey());
            parameter = ZVal.assign(zpairResult235.getValue());
            name = "$" + toStringR(env.callMethod(parameter, "getName", Generator.class), env);
            if (ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "$"))
                    || ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "$..."))) {
                name = "$arg" + toStringR(i, env);
            }

            if (ZVal.isTrue(env.callMethod(parameter, "isVariadic", Generator.class))) {
                if (ZVal.isTrue(forCall)) {
                    continue;
                }

                name = "..." + toStringR(name, env);
            }

            nullable = "";
            _pDefault = "";
            reference = "";
            typeDeclaration = "";
            if (!ZVal.isTrue(forCall)) {
                if (ZVal.toBool(env.callMethod(parameter, "hasType", Generator.class))
                        && ZVal.toBool(env.callMethod(parameter, "allowsNull", Generator.class))) {
                    nullable = "?";
                }

                if (ZVal.toBool(env.callMethod(parameter, "hasType", Generator.class))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        toStringR(
                                                env.callMethod(
                                                        parameter, "getType", Generator.class),
                                                env),
                                        "!==",
                                        "self"))) {
                    typeDeclaration =
                            toStringR(
                                            toStringR(
                                                    env.callMethod(
                                                            parameter, "getType", Generator.class),
                                                    env),
                                            env)
                                    + " ";

                } else if (ZVal.isTrue(env.callMethod(parameter, "isArray", Generator.class))) {
                    typeDeclaration = "array ";

                } else if (ZVal.isTrue(env.callMethod(parameter, "isCallable", Generator.class))) {
                    typeDeclaration = "callable ";

                } else {
                    try {
                        _pClass = env.callMethod(parameter, "getClass", Generator.class);
                    } catch (ConvertedException convertedException19) {
                        if (convertedException19.instanceOf(
                                ReflectionException.class, "ReflectionException")) {
                            e = convertedException19.getObject();
                            throw ZVal.getException(
                                    env,
                                    new RuntimeException(
                                            env,
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "Cannot mock %s::%s() because a class or "
                                                                    + "interface used in the signature is not loaded",
                                                            env.callMethod(
                                                                    env.callMethod(
                                                                            method,
                                                                            "getDeclaringClass",
                                                                            Generator.class),
                                                                    "getName",
                                                                    Generator.class),
                                                            env.callMethod(
                                                                    method,
                                                                    "getName",
                                                                    Generator.class))
                                                    .value(),
                                            0,
                                            e));
                        } else {
                            throw convertedException19;
                        }
                    }

                    if (ZVal.strictNotEqualityCheck(_pClass, "!==", ZVal.getNull())) {
                        typeDeclaration =
                                toStringR(env.callMethod(_pClass, "getName", Generator.class), env)
                                        + " ";
                    }
                }

                if (!ZVal.isTrue(env.callMethod(parameter, "isVariadic", Generator.class))) {
                    if (ZVal.isTrue(
                            env.callMethod(
                                    parameter, "isDefaultValueAvailable", Generator.class))) {
                        value = env.callMethod(parameter, "getDefaultValue", Generator.class);
                        _pDefault =
                                " = "
                                        + toStringR(
                                                NamespaceGlobal.var_export
                                                        .env(env)
                                                        .call(value, true)
                                                        .value(),
                                                env);

                    } else if (ZVal.isTrue(
                            env.callMethod(parameter, "isOptional", Generator.class))) {
                        _pDefault = " = null";
                    }
                }
            }

            if (ZVal.isTrue(env.callMethod(parameter, "isPassedByReference", Generator.class))) {
                reference = "&";
            }

            ZVal.addToArray(
                    parameters,
                    toStringR(nullable, env)
                            + toStringR(typeDeclaration, env)
                            + toStringR(reference, env)
                            + toStringR(name, env)
                            + toStringR(_pDefault, env));
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(", ", parameters).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template")
    private Object getTemplate(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, null);
        Object filename = null;
        filename =
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/phpunit/phpunit-mock-objects/src"),
                                env)
                        + toStringR("/", env)
                        + "Generator"
                        + toStringR("/", env)
                        + toStringR(template, env);
        if (!ZVal.isset(
                ZVal.getElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Framework
                                                .namespaces
                                                .MockObject
                                                .classes
                                                .Generator
                                                .RequestStaticProperties
                                                .class)
                                .templates,
                        filename))) {
            ZVal.putArrayElement(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .namespaces
                                            .MockObject
                                            .classes
                                            .Generator
                                            .RequestStaticProperties
                                            .class)
                            .templates,
                    filename,
                    new Text_Template(env, filename));
        }

        return ZVal.assign(
                ZVal.getElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Framework
                                                .namespaces
                                                .MockObject
                                                .classes
                                                .Generator
                                                .RequestStaticProperties
                                                .class)
                                .templates,
                        filename));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Generator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cache = ZVal.newArray();

        public Object templates = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Generator")
                    .setLookup(Generator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("blacklistedMethodNames")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Generator.php")
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
