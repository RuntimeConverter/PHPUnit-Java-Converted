package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeUnitReverseLookup.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_get_declared_classes;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/code-unit-reverse-lookup/src/Wizard.php

*/

public class Wizard extends RuntimeClassBase {

    public Object lookupTable = ZVal.newArray();

    public Object processedClasses = ZVal.newArray();

    public Object processedFunctions = ZVal.newArray();

    public Wizard(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    @ConvertedParameter(index = 1, name = "lineNumber")
    public Object lookup(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        Object lineNumber = assignParameter(args, 1, null);
        if (!ZVal.isset(
                ZVal.getElementRecursive(
                        toObjectR(this).accessProp(this, env).name("lookupTable").value(),
                        filename,
                        lineNumber))) {
            env.callMethod(this, "updateLookupTable", Wizard.class);
        }

        if (ZVal.isset(
                ZVal.getElementRecursive(
                        toObjectR(this).accessProp(this, env).name("lookupTable").value(),
                        filename,
                        lineNumber))) {
            return ZVal.assign(
                    ZVal.getElementRecursive(
                            toObjectR(this).accessProp(this, env).name("lookupTable").value(),
                            filename,
                            lineNumber));

        } else {
            return ZVal.assign(toStringR(filename, env) + ":" + toStringR(lineNumber, env));
        }
    }

    @ConvertedMethod
    private Object updateLookupTable(RuntimeEnv env, Object... args) {
        env.callMethod(this, "processClassesAndTraits", Wizard.class);
        env.callMethod(this, "processFunctions", Wizard.class);
        return null;
    }

    @ConvertedMethod
    private Object processClassesAndTraits(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object classOrTrait = null;
        Object method = null;
        Object reflector = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult431 :
                ZVal.getIterable(
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        function_get_declared_classes.f.env(env).call().value(),
                                        NamespaceGlobal.get_declared_traits.env(env).call().value())
                                .value(),
                        env,
                        true)) {
            classOrTrait = ZVal.assign(zpairResult431.getValue());
            if (ZVal.isset(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("processedClasses").value(),
                            classOrTrait))) {
                continue;
            }

            reflector = new ReflectionClass(env, classOrTrait);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult432 :
                    ZVal.getIterable(
                            env.callMethod(reflector, "getMethods", Wizard.class), env, true)) {
                method = ZVal.assign(zpairResult432.getValue());
                env.callMethod(this, "processFunctionOrMethod", Wizard.class, method);
            }

            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("processedClasses").value(),
                    classOrTrait,
                    true);
        }

        return null;
    }

    @ConvertedMethod
    private Object processFunctions(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object function = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult433 :
                ZVal.getIterable(
                        ZVal.getElement(
                                NamespaceGlobal.get_defined_functions.env(env).call().value(),
                                "user"),
                        env,
                        true)) {
            function = ZVal.assign(zpairResult433.getValue());
            if (ZVal.isset(
                    ZVal.getElement(
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name("processedFunctions")
                                    .value(),
                            function))) {
                continue;
            }

            env.callMethod(
                    this,
                    "processFunctionOrMethod",
                    Wizard.class,
                    new ReflectionFunction(env, function));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("processedFunctions").value(),
                    function,
                    true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "functionOrMethod",
        typeHint = "ReflectionFunctionAbstract"
    )
    private Object processFunctionOrMethod(RuntimeEnv env, Object... args) {
        Object functionOrMethod = assignParameter(args, 0, null);
        Object line = null;
        Object name = null;
        if (ZVal.isTrue(env.callMethod(functionOrMethod, "isInternal", Wizard.class))) {
            return null;
        }

        name = env.callMethod(functionOrMethod, "getName", Wizard.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        functionOrMethod, ReflectionMethod.class, "ReflectionMethod"))) {
            name =
                    toStringR(
                                    env.callMethod(
                                            env.callMethod(
                                                    functionOrMethod,
                                                    "getDeclaringClass",
                                                    Wizard.class),
                                            "getName",
                                            Wizard.class),
                                    env)
                            + "::"
                            + toStringR(name, env);
        }

        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("lookupTable").value(),
                        env.callMethod(functionOrMethod, "getFileName", Wizard.class)))) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("lookupTable").value(),
                    env.callMethod(functionOrMethod, "getFileName", Wizard.class),
                    ZVal.newArray());
        }

        for (ZPair zpairResult434 :
                ZVal.getIterable(
                        CRArrayF.range
                                .env(env)
                                .call(
                                        env.callMethod(
                                                functionOrMethod, "getStartLine", Wizard.class),
                                        env.callMethod(
                                                functionOrMethod, "getEndLine", Wizard.class))
                                .value(),
                        env,
                        true)) {
            line = ZVal.assign(zpairResult434.getValue());
            ZVal.setElementRecursive(
                    toObjectR(this).accessProp(this, env).name("lookupTable").value(),
                    name,
                    env.callMethod(functionOrMethod, "getFileName", Wizard.class),
                    line);
        }

        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeUnitReverseLookup\\Wizard";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeUnitReverseLookup\\Wizard")
                    .setLookup(Wizard.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("lookupTable", "processedClasses", "processedFunctions")
                    .setFilename("vendor/sebastian/code-unit-reverse-lookup/src/Wizard.php")
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
