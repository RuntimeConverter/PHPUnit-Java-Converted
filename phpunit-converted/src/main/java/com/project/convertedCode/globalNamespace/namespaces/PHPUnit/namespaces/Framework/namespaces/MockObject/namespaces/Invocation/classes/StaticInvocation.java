package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Invocation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Invocation;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes.Exporter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeClasses.stdClass;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Invocation/StaticInvocation.php

*/

public class StaticInvocation extends RuntimeClassBase implements Invocation, SelfDescribing {

    public Object className = null;

    public Object methodName = null;

    public Object parameters = null;

    public Object returnType = null;

    public Object isReturnTypeNullable = false;

    public StaticInvocation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StaticInvocation.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(index = 2, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 3, name = "returnType")
    @ConvertedParameter(
        index = 4,
        name = "cloneObjects",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object methodName = assignParameter(args, 1, null);
        Object parameters = assignParameter(args, 2, null);
        Object returnType = assignParameter(args, 3, null);
        Object cloneObjects = assignParameter(args, 4, null);
        if (ZVal.isNull(cloneObjects)) {
            cloneObjects = false;
        }
        Object value = null;
        Object key = null;
        toObjectR(this).accessProp(this, env).name("className").set(className);
        toObjectR(this).accessProp(this, env).name("methodName").set(methodName);
        toObjectR(this).accessProp(this, env).name("parameters").set(parameters);
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strtolower.env(env).call(methodName).value(),
                "===",
                "__tostring")) {
            returnType = "string";
        }

        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strpos.env(env).call(returnType, "?").value(), "===", 0)) {
            returnType = NamespaceGlobal.substr.env(env).call(returnType, 1).value();
            toObjectR(this).accessProp(this, env).name("isReturnTypeNullable").set(true);
        }

        toObjectR(this).accessProp(this, env).name("returnType").set(returnType);
        if (!ZVal.isTrue(cloneObjects)) {
            return null;
        }

        for (ZPair zpairResult236 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("parameters").value(),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult236.getKey());
            value = ZVal.assign(zpairResult236.getValue());
            if (function_is_object.f.env(env).call(value).getBool()) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("parameters").value(),
                        key,
                        env.callMethod(this, "cloneObject", StaticInvocation.class, value));
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("className").value());
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("methodName").value());
    }

    @ConvertedMethod
    public Object getParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("parameters").value());
    }

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("returnType").value());
    }

    @ConvertedMethod
    public Object isReturnTypeNullable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("isReturnTypeNullable").value());
    }

    @ConvertedMethod
    public Object generateReturnValue(RuntimeEnv env, Object... args) {
        Object generator = null;
        if (toObjectR(this).accessProp(this, env).name("isReturnTypeNullable").getBool()) {
            return null;
        }

        SwitchEnumType10 switchVariable10 =
                ZVal.getEnum(
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("returnType")
                                                .value())
                                .value(),
                        SwitchEnumType10.DEFAULT_CASE,
                        SwitchEnumType10.STRING_,
                        "",
                        SwitchEnumType10.STRING_void,
                        "void",
                        SwitchEnumType10.STRING_string,
                        "string",
                        SwitchEnumType10.STRING_float,
                        "float",
                        SwitchEnumType10.STRING_int,
                        "int",
                        SwitchEnumType10.STRING_bool,
                        "bool",
                        SwitchEnumType10.STRING_array,
                        "array",
                        SwitchEnumType10.STRING_object,
                        "object",
                        SwitchEnumType10.STRING_callable,
                        "callable",
                        SwitchEnumType10.STRING_closure,
                        "closure",
                        SwitchEnumType10.STRING_traversable,
                        "traversable",
                        SwitchEnumType10.STRING_generator,
                        "generator",
                        SwitchEnumType10.STRING_iterable,
                        "iterable");
        switch (switchVariable10) {
            case STRING_:
            case STRING_void:
                return null;
            case STRING_string:
                return "";
            case STRING_float:
                return 0.0;
            case STRING_int:
                return 0;
            case STRING_bool:
                return ZVal.assign(false);
            case STRING_array:
                return ZVal.assign(ZVal.newArray());
            case STRING_object:
                return ZVal.assign(new stdClass(env));
            case STRING_callable:
            case STRING_closure:
                return ZVal.assign(
                        new Closure(env) {
                            @Override
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return null;
                            }
                        });
            case STRING_traversable:
            case STRING_generator:
            case STRING_iterable:
                generator =
                        new Closure(env) {
                            @Override
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                RuntimeIterable runtimeConverterYieldVariable =
                                        new RuntimeIterable(env);
                                runtimeConverterYieldVariable.add(null);
                                return runtimeConverterYieldVariable;
                            }
                        };
                return ZVal.assign(
                        env.callFunctionDynamic(generator, new RuntimeArgsWithReferences())
                                .value());
            case DEFAULT_CASE:
                generator = new Generator(env);
                return ZVal.assign(
                        env.callMethod(
                                generator,
                                "getMock",
                                StaticInvocation.class,
                                toObjectR(this).accessProp(this, env).name("returnType").value(),
                                ZVal.newArray(),
                                ZVal.newArray(),
                                "",
                                false));
        }
        ;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object exporter = null;
        exporter = new Exporter(env);
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s::%s(%s)%s",
                                toObjectR(this).accessProp(this, env).name("className").value(),
                                toObjectR(this).accessProp(this, env).name("methodName").value(),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                CRArrayF.array_map
                                                        .env(env)
                                                        .call(
                                                                ZVal.newArray(
                                                                        new ZPair(0, exporter),
                                                                        new ZPair(
                                                                                1,
                                                                                "shortenedExport")),
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("parameters")
                                                                        .value())
                                                        .value())
                                        .value(),
                                toObjectR(this).accessProp(this, env).name("returnType").getBool()
                                        ? NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        ": %s",
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("returnType")
                                                                .value())
                                                .value()
                                        : "")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "original")
    private Object cloneObject(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object original = assignParameter(args, 0, null);
        Object method = null;
        Object e = null;
        Object cloneable = null;
        Object _pClass = null;
        Object _object = null;
        cloneable = ZVal.getNull();
        _object = new ReflectionObject(env, original);
        if (ZVal.toBool(env.callMethod(_object, "isInternal", StaticInvocation.class))
                && ZVal.toBool(
                        ZVal.isset(
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
                                                                .namespaces
                                                                .Invocation
                                                                .classes
                                                                .StaticInvocation
                                                                .RequestStaticProperties
                                                                .class)
                                                .uncloneableExtensions,
                                        env.callMethod(
                                                _object,
                                                "getExtensionName",
                                                StaticInvocation.class))))) {
            cloneable = false;
        }

        if (ZVal.strictEqualityCheck(cloneable, "===", ZVal.getNull())) {
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult237 :
                    ZVal.getIterable(
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
                                                    .namespaces
                                                    .Invocation
                                                    .classes
                                                    .StaticInvocation
                                                    .RequestStaticProperties
                                                    .class)
                                    .uncloneableClasses,
                            env,
                            true)) {
                _pClass = ZVal.assign(zpairResult237.getValue());
                if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(original, _pClass))) {
                    cloneable = false;
                    break;
                }
            }
        }

        if (ZVal.strictEqualityCheck(cloneable, "===", ZVal.getNull())) {
            cloneable = env.callMethod(_object, "isCloneable", StaticInvocation.class);
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(cloneable, "===", ZVal.getNull()))
                && ZVal.toBool(
                        env.callMethod(_object, "hasMethod", StaticInvocation.class, "__clone"))) {
            method = env.callMethod(_object, "getMethod", StaticInvocation.class, "__clone");
            cloneable = env.callMethod(method, "isPublic", StaticInvocation.class);
        }

        if (ZVal.strictEqualityCheck(cloneable, "===", ZVal.getNull())) {
            cloneable = true;
        }

        if (ZVal.isTrue(cloneable)) {
            try {
                return ZVal.assign(((RuntimeClassInterface) original).phpClone());
            } catch (ConvertedException convertedException20) {
                if (convertedException20.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException20.getObject();
                    return ZVal.assign(original);
                } else {
                    throw convertedException20;
                }
            }

        } else {
            return ZVal.assign(original);
        }
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Invocation\\StaticInvocation";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object uncloneableExtensions =
                ZVal.newArray(
                        new ZPair("mysqli", true),
                        new ZPair("SQLite", true),
                        new ZPair("sqlite3", true),
                        new ZPair("tidy", true),
                        new ZPair("xmlwriter", true),
                        new ZPair("xsl", true));

        public Object uncloneableClasses =
                ZVal.newArray(
                        new ZPair(0, "Closure"),
                        new ZPair(1, "COMPersistHelper"),
                        new ZPair(2, "IteratorIterator"),
                        new ZPair(3, "RecursiveIteratorIterator"),
                        new ZPair(4, "SplFileObject"),
                        new ZPair(5, "PDORow"),
                        new ZPair(6, "ZipArchive"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Invocation\\StaticInvocation")
                    .setLookup(StaticInvocation.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "className",
                            "isReturnTypeNullable",
                            "methodName",
                            "parameters",
                            "returnType")
                    .setFilename(
                            "vendor/phpunit/phpunit-mock-objects/src/Invocation/StaticInvocation.php")
                    .addInterface("Invocation")
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

    private enum SwitchEnumType10 {
        STRING_,
        STRING_void,
        STRING_string,
        STRING_float,
        STRING_int,
        STRING_bool,
        STRING_array,
        STRING_object,
        STRING_callable,
        STRING_closure,
        STRING_traversable,
        STRING_generator,
        STRING_iterable,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
