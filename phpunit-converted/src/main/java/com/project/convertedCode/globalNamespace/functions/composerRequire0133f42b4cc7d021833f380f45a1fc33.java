package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/autoload_real.php

*/

public class composerRequire0133f42b4cc7d021833f380f45a1fc33 extends FunctionBaseRegular {

    public static composerRequire0133f42b4cc7d021833f380f45a1fc33 f =
            new composerRequire0133f42b4cc7d021833f380f45a1fc33();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileIdentifier")
    @ConvertedParameter(index = 1, name = "file")
    public Object call(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/composer")
                        .setFile("/vendor/composer/autoload_real.php");
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope8 scope = new Scope8();
        stack.pushScope(scope);
        try {
            scope.fileIdentifier = assignParameter(args, 0, null);
            scope.file = assignParameter(args, 1, null);
            scope.GLOBALS = env.getGlobal("GLOBALS");
            if (ZVal.isEmpty(
                    ZVal.getElementRecursive(
                            scope.GLOBALS, "__composer_autoload_files", scope.fileIdentifier))) {
                env.include(
                        toStringR(scope.file, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
                ZVal.setElementRecursive(
                        scope.GLOBALS, true, "__composer_autoload_files", scope.fileIdentifier);
            }

            throw new IncludeEventException(env.returnWithGlobals(null, "GLOBALS", scope.GLOBALS));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    private static class Scope8 implements UpdateRuntimeScopeInterface {

        Object GLOBALS;
        Object file;
        Object fileIdentifier;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("GLOBALS", this.GLOBALS);
            stack.setVariable("file", this.file);
            stack.setVariable("fileIdentifier", this.fileIdentifier);
        }

        public void updateScope(RuntimeStack stack) {

            this.GLOBALS = stack.getVariable("GLOBALS");
            this.file = stack.getVariable("file");
            this.fileIdentifier = stack.getVariable("fileIdentifier");
        }
    }
}
