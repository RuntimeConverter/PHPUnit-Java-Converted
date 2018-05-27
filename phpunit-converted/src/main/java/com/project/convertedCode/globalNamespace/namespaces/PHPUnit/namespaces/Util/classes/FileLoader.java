package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.stream.function_stream_resolve_include_path;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.modules.standard.other.function_get_defined_vars;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/FileLoader.php

*/

public final class FileLoader extends RuntimeClassBase {

    public FileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\FileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        public Object checkAndLoad(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, null);
            Object includePathFilename = null;
            Object localFile = null;
            Object isReadable = null;
            includePathFilename =
                    function_stream_resolve_include_path.f.env(env).call(filename).value();
            localFile =
                    toStringR(env.addRootFilesystemPrefix("/vendor/phpunit/phpunit/src/Util"), env)
                            + toStringR("/", env)
                            + toStringR(filename, env);
            isReadable =
                    ZVal.strictNotEqualityCheck(
                            NamespaceGlobal.fopen.env(env).call(includePathFilename, "r").value(),
                            "!==",
                            false);
            if (ZVal.toBool(
                            ZVal.toBool(!ZVal.isTrue(includePathFilename))
                                    || ZVal.toBool(!ZVal.isTrue(isReadable)))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(includePathFilename, "===", localFile))) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Cannot open file \"%s\"." + "\n", filename)
                                        .value()));
            }

            runtimeStaticObject.load(env, includePathFilename);
            return ZVal.assign(includePathFilename);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        public Object load(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/phpunit/phpunit/src/Util")
                            .setFile("/vendor/phpunit/phpunit/src/Util/FileLoader.php");
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope15 scope = new Scope15();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                scope.filename = assignParameter(args, 0, null);
                scope.GLOBALS = env.getGlobal("GLOBALS");
                scope.variableName = null;
                scope.oldVariableNames = null;
                scope.newVariableNames = null;
                scope.newVariables = ZVal.newArray();
                scope.oldVariableNames =
                        CRArrayF.array_keys
                                .env(env)
                                .call(function_get_defined_vars.f.env(env).call().value())
                                .value();
                env.include(
                        toStringR(scope.filename, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        false,
                        true);
                scope.newVariables = function_get_defined_vars.f.env(env).call().value();
                scope.newVariableNames =
                        CRArrayF.array_diff
                                .env(env)
                                .call(
                                        CRArrayF.array_keys
                                                .env(env)
                                                .call(scope.newVariables)
                                                .value(),
                                        scope.oldVariableNames)
                                .value();
                for (ZPair zpairResult380 : ZVal.getIterable(scope.newVariableNames, env, true)) {
                    scope.variableName = ZVal.assign(zpairResult380.getValue());
                    if (ZVal.strictNotEqualityCheck(
                            scope.variableName, "!==", "oldVariableNames")) {
                        ZVal.putArrayElement(
                                scope.GLOBALS,
                                scope.variableName,
                                ZVal.getElement(scope.newVariables, scope.variableName));
                    }
                }

                throw new IncludeEventException(
                        env.returnWithGlobals(null, "GLOBALS", scope.GLOBALS));
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\FileLoader")
                    .setLookup(FileLoader.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/FileLoader.php")
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

    private static class Scope15 implements UpdateRuntimeScopeInterface {

        Object GLOBALS;
        Object filename;
        Object variableName;
        Object oldVariableNames;
        Object _thisVarAlias;
        Object newVariableNames;
        Object newVariables;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("GLOBALS", this.GLOBALS);
            stack.setVariable("filename", this.filename);
            stack.setVariable("variableName", this.variableName);
            stack.setVariable("oldVariableNames", this.oldVariableNames);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("newVariableNames", this.newVariableNames);
            stack.setVariable("newVariables", this.newVariables);
        }

        public void updateScope(RuntimeStack stack) {

            this.GLOBALS = stack.getVariable("GLOBALS");
            this.filename = stack.getVariable("filename");
            this.variableName = stack.getVariable("variableName");
            this.oldVariableNames = stack.getVariable("oldVariableNames");
            this._thisVarAlias = stack.getVariable("this");
            this.newVariableNames = stack.getVariable("newVariableNames");
            this.newVariables = stack.getVariable("newVariables");
        }
    }
}
