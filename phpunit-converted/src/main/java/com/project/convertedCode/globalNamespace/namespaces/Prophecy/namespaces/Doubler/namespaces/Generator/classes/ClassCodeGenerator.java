package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes.TypeHintReference;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassCodeGenerator.php

*/

public class ClassCodeGenerator extends RuntimeClassBase {

    public Object typeHintReference = null;

    public ClassCodeGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassCodeGenerator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "typeHintReference",
        typeHint = "Prophecy\\Doubler\\Generator\\TypeHintReference",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object typeHintReference = assignParameter(args, 0, null);
        if (ZVal.isNull(typeHintReference)) {
            typeHintReference = ZVal.getNull();
        }
        toObjectR(this)
                .accessProp(this, env)
                .name("typeHintReference")
                .set(
                        ZVal.isTrue(typeHintReference)
                                ? typeHintReference
                                : new TypeHintReference(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classname")
    @ConvertedParameter(
        index = 1,
        name = "class",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object generate(RuntimeEnv env, Object... args) {
        Object classname = assignParameter(args, 0, null);
        Object _pClass = assignParameter(args, 1, null);
        Object code = null;
        Object visibility = null;
        Object method = null;
        Object parts = null;
        Object namespace = null;
        Object name = null;
        parts = NamespaceGlobal.explode.env(env).call("\\", classname).value();
        classname = CRArrayF.array_pop.env(env).call(parts).value();
        namespace = NamespaceGlobal.implode.env(env).call("\\", parts).value();
        code =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "class %s extends \\%s implements %s {\n",
                                classname,
                                env.callMethod(_pClass, "getParentClass", ClassCodeGenerator.class),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
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
                                                                        Object _pInterface =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        null);
                                                                        return ZVal.assign(
                                                                                "\\"
                                                                                        + toStringR(
                                                                                                _pInterface,
                                                                                                env));
                                                                    }
                                                                },
                                                                env.callMethod(
                                                                        _pClass,
                                                                        "getInterfaces",
                                                                        ClassCodeGenerator.class))
                                                        .value())
                                        .value())
                        .value();
        for (ZPair zpairResult62 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getProperties", ClassCodeGenerator.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult62.getKey());
            visibility = ZVal.assign(zpairResult62.getValue());
            code =
                    toStringR(code, env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call("%s $%s;\n", visibility, name)
                                            .value(),
                                    env);
        }

        code = toStringR(code, env) + "\n";
        for (ZPair zpairResult63 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getMethods", ClassCodeGenerator.class),
                        env,
                        true)) {
            method = ZVal.assign(zpairResult63.getValue());
            code =
                    toStringR(code, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "generateMethod",
                                            ClassCodeGenerator.class,
                                            method),
                                    env)
                            + "\n";
        }

        code = toStringR(code, env) + "\n}";
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call("namespace %s {\n%s\n}", namespace, code)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "method",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\MethodNode"
    )
    private Object generateMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, null);
        Object php = null;
        php =
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%s %s function %s%s(%s)%s {\n",
                                env.callMethod(method, "getVisibility", ClassCodeGenerator.class),
                                ZVal.isTrue(
                                                env.callMethod(
                                                        method,
                                                        "isStatic",
                                                        ClassCodeGenerator.class))
                                        ? "static"
                                        : "",
                                ZVal.isTrue(
                                                env.callMethod(
                                                        method,
                                                        "returnsReference",
                                                        ClassCodeGenerator.class))
                                        ? "&"
                                        : "",
                                env.callMethod(method, "getName", ClassCodeGenerator.class),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                env.callMethod(
                                                        this,
                                                        "generateArguments",
                                                        ClassCodeGenerator.class,
                                                        env.callMethod(
                                                                method,
                                                                "getArguments",
                                                                ClassCodeGenerator.class)))
                                        .value(),
                                env.callMethod(
                                        this, "getReturnType", ClassCodeGenerator.class, method))
                        .value();
        php =
                toStringR(php, env)
                        + toStringR(
                                env.callMethod(method, "getCode", ClassCodeGenerator.class), env)
                        + "\n";
        return ZVal.assign(toStringR(php, env) + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "method",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\MethodNode"
    )
    private Object getReturnType(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, null);
        if (NamespaceGlobal.version_compare.env(env).call("7.1.16", "7.1", ">=").getBool()) {
            if (ZVal.isTrue(env.callMethod(method, "hasReturnType", ClassCodeGenerator.class))) {
                return ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                method,
                                                "hasNullableReturnType",
                                                ClassCodeGenerator.class))
                                ? NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                ": ?%s",
                                                env.callMethod(
                                                        method,
                                                        "getReturnType",
                                                        ClassCodeGenerator.class))
                                        .value()
                                : NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                ": %s",
                                                env.callMethod(
                                                        method,
                                                        "getReturnType",
                                                        ClassCodeGenerator.class))
                                        .value());
            }
        }

        if (NamespaceGlobal.version_compare.env(env).call("7.1.16", "7.0", ">=").getBool()) {
            return ZVal.assign(
                    ZVal.toBool(env.callMethod(method, "hasReturnType", ClassCodeGenerator.class))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    env.callMethod(
                                                            method,
                                                            "getReturnType",
                                                            ClassCodeGenerator.class),
                                                    "!==",
                                                    "void"))
                            ? NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            ": %s",
                                            env.callMethod(
                                                    method,
                                                    "getReturnType",
                                                    ClassCodeGenerator.class))
                                    .value()
                            : "");
        }

        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    private Object generateArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, null);
        Object typeHintReference = null;
        typeHintReference =
                ZVal.assign(
                        toObjectR(this).accessProp(this, env).name("typeHintReference").value());
        return ZVal.assign(
                CRArrayF.array_map
                        .env(env)
                        .call(
                                new Closure(env) {
                                    @Override
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object argument = assignParameter(args, 0, null);
                                        Object typeHintReference = null;
                                        Object hint = null;
                                        Object php = null;
                                        typeHintReference =
                                                this.contextReferences.getCapturedValue(
                                                        "typeHintReference");
                                        php = "";
                                        if (NamespaceGlobal.version_compare
                                                .env(env)
                                                .call("7.1.16", "7.1", ">=")
                                                .getBool()) {
                                            php =
                                                    toStringR(php, env)
                                                            + toStringR(
                                                                    ZVal.isTrue(
                                                                                    env.callMethod(
                                                                                            argument,
                                                                                            "isNullable",
                                                                                            ClassCodeGenerator
                                                                                                    .class))
                                                                            ? "?"
                                                                            : "",
                                                                    env);
                                        }

                                        if (ZVal.isTrue(
                                                hint =
                                                        env.callMethod(
                                                                argument,
                                                                "getTypeHint",
                                                                ClassCodeGenerator.class))) {
                                            php =
                                                    toStringR(php, env)
                                                            + toStringR(
                                                                    ZVal.isTrue(
                                                                                    env.callMethod(
                                                                                            typeHintReference,
                                                                                            "isBuiltInParamTypeHint",
                                                                                            ClassCodeGenerator
                                                                                                    .class,
                                                                                            hint))
                                                                            ? hint
                                                                            : "\\"
                                                                                    + toStringR(
                                                                                            hint,
                                                                                            env),
                                                                    env);
                                        }

                                        php =
                                                toStringR(php, env)
                                                        + " "
                                                        + toStringR(
                                                                ZVal.isTrue(
                                                                                env.callMethod(
                                                                                        argument,
                                                                                        "isPassedByReference",
                                                                                        ClassCodeGenerator
                                                                                                .class))
                                                                        ? "&"
                                                                        : "",
                                                                env);
                                        php =
                                                toStringR(php, env)
                                                        + toStringR(
                                                                ZVal.isTrue(
                                                                                env.callMethod(
                                                                                        argument,
                                                                                        "isVariadic",
                                                                                        ClassCodeGenerator
                                                                                                .class))
                                                                        ? "..."
                                                                        : "",
                                                                env);
                                        php =
                                                toStringR(php, env)
                                                        + "$"
                                                        + toStringR(
                                                                env.callMethod(
                                                                        argument,
                                                                        "getName",
                                                                        ClassCodeGenerator.class),
                                                                env);
                                        if (ZVal.toBool(
                                                        env.callMethod(
                                                                argument,
                                                                "isOptional",
                                                                ClassCodeGenerator.class))
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        argument,
                                                                        "isVariadic",
                                                                        ClassCodeGenerator
                                                                                .class)))) {
                                            php =
                                                    toStringR(php, env)
                                                            + " = "
                                                            + toStringR(
                                                                    NamespaceGlobal.var_export
                                                                            .env(env)
                                                                            .call(
                                                                                    env.callMethod(
                                                                                            argument,
                                                                                            "getDefault",
                                                                                            ClassCodeGenerator
                                                                                                    .class),
                                                                                    true)
                                                                            .value(),
                                                                    env);
                                        }

                                        return ZVal.assign(php);
                                    }
                                }.use("typeHintReference", typeHintReference),
                                arguments)
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\ClassCodeGenerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\ClassCodeGenerator")
                    .setLookup(ClassCodeGenerator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("typeHintReference")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassCodeGenerator.php")
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
