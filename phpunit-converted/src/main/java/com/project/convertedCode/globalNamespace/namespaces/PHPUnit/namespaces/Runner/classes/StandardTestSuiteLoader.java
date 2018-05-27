package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestSuiteLoader;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.modules.standard.other.function_get_declared_classes;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.FileLoader;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filesystem;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/StandardTestSuiteLoader.php

*/

public class StandardTestSuiteLoader extends RuntimeClassBase implements TestSuiteLoader {

    public StandardTestSuiteLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suiteClassName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suiteClassFile", typeHint = "string")
    public Object load(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object suiteClassName = assignParameter(args, 0, null);
        Object suiteClassFile = assignParameter(args, 1, null);
        if (ZVal.isNull(suiteClassFile)) {
            suiteClassFile = "";
        }
        Object loadedClass = null;
        Object classFile = null;
        Object filename = null;
        Object offset = null;
        Object method = null;
        Object loadedClasses = null;
        Object testCaseClass = null;
        Object _pClass = null;
        suiteClassName =
                NamespaceGlobal.str_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call(".php", "", suiteClassName)
                        .value();
        if (ZVal.isEmpty(suiteClassFile)) {
            suiteClassFile =
                    Filesystem.runtimeStaticObject.classNameToFilename(env, suiteClassName);
        }

        if (!function_class_exists.f.env(env).call(suiteClassName, false).getBool()) {
            loadedClasses = function_get_declared_classes.f.env(env).call().value();
            filename = FileLoader.runtimeStaticObject.checkAndLoad(env, suiteClassFile);
            loadedClasses =
                    CRArrayF.array_values
                            .env(env)
                            .call(
                                    CRArrayF.array_diff
                                            .env(env)
                                            .call(
                                                    function_get_declared_classes
                                                            .f
                                                            .env(env)
                                                            .call()
                                                            .value(),
                                                    loadedClasses)
                                            .value())
                            .value();
        }

        if (ZVal.toBool(!function_class_exists.f.env(env).call(suiteClassName, false).getBool())
                && ZVal.toBool(!ZVal.isEmpty(loadedClasses))) {
            offset = ZVal.subtract(0, NamespaceGlobal.strlen.env(env).call(suiteClassName).value());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult331 : ZVal.getIterable(loadedClasses, env, true)) {
                loadedClass = ZVal.assign(zpairResult331.getValue());
                _pClass = new ReflectionClass(env, loadedClass);
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.substr
                                                .env(env)
                                                .call(loadedClass, offset)
                                                .value(),
                                        "===",
                                        suiteClassName))
                        && ZVal.toBool(
                                ZVal.equalityCheck(
                                        env.callMethod(
                                                _pClass,
                                                "getFileName",
                                                StandardTestSuiteLoader.class),
                                        filename))) {
                    suiteClassName = ZVal.assign(loadedClass);
                    break;
                }
            }
        }

        if (ZVal.toBool(!function_class_exists.f.env(env).call(suiteClassName, false).getBool())
                && ZVal.toBool(!ZVal.isEmpty(loadedClasses))) {
            testCaseClass = ZVal.assign(TestCase.CONST_class);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult332 : ZVal.getIterable(loadedClasses, env, true)) {
                loadedClass = ZVal.assign(zpairResult332.getValue());
                _pClass = new ReflectionClass(env, loadedClass);
                classFile = env.callMethod(_pClass, "getFileName", StandardTestSuiteLoader.class);
                if (ZVal.toBool(
                                env.callMethod(
                                        _pClass,
                                        "isSubclassOf",
                                        StandardTestSuiteLoader.class,
                                        testCaseClass))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                _pClass,
                                                "isAbstract",
                                                StandardTestSuiteLoader.class)))) {
                    suiteClassName = ZVal.assign(loadedClass);
                    testCaseClass = ZVal.assign(loadedClass);
                    if (ZVal.equalityCheck(
                            classFile,
                            NamespaceGlobal.realpath.env(env).call(suiteClassFile).value())) {
                        break;
                    }
                }

                if (ZVal.isTrue(
                        env.callMethod(
                                _pClass, "hasMethod", StandardTestSuiteLoader.class, "suite"))) {
                    method =
                            env.callMethod(
                                    _pClass, "getMethod", StandardTestSuiteLoader.class, "suite");
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    !ZVal.isTrue(
                                                            env.callMethod(
                                                                    method,
                                                                    "isAbstract",
                                                                    StandardTestSuiteLoader.class)))
                                            && ZVal.toBool(
                                                    env.callMethod(
                                                            method,
                                                            "isPublic",
                                                            StandardTestSuiteLoader.class)))
                            && ZVal.toBool(
                                    env.callMethod(
                                            method, "isStatic", StandardTestSuiteLoader.class))) {
                        suiteClassName = ZVal.assign(loadedClass);
                        if (ZVal.equalityCheck(
                                classFile,
                                NamespaceGlobal.realpath.env(env).call(suiteClassFile).value())) {
                            break;
                        }
                    }
                }
            }
        }

        if (function_class_exists.f.env(env).call(suiteClassName, false).getBool()) {
            _pClass = new ReflectionClass(env, suiteClassName);
            if (ZVal.equalityCheck(
                    env.callMethod(_pClass, "getFileName", StandardTestSuiteLoader.class),
                    NamespaceGlobal.realpath.env(env).call(suiteClassFile).value())) {
                return ZVal.assign(_pClass);
            }
        }

        throw ZVal.getException(
                env,
                new Exception(
                        env,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "Class '%s' could not be found in '%s'.",
                                        suiteClassName, suiteClassFile)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "aClass", typeHint = "ReflectionClass")
    public Object reload(RuntimeEnv env, Object... args) {
        Object aClass = assignParameter(args, 0, null);
        return ZVal.assign(aClass);
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\StandardTestSuiteLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\StandardTestSuiteLoader")
                    .setLookup(
                            StandardTestSuiteLoader.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/StandardTestSuiteLoader.php")
                    .addInterface("TestSuiteLoader")
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
