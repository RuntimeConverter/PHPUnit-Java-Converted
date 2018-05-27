package com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.functions;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/ClassLoader.php

*/

public class includeFile extends FunctionBaseRegular {

    public static includeFile f = new includeFile();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object call(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/composer")
                        .setFile("/vendor/composer/ClassLoader.php");
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope1 scope = new Scope1();
        stack.pushScope(scope);
        try {
            scope.file = assignParameter(args, 0, null);
            env.include(
                    toStringR(scope.file, env),
                    stack,
                    runtimeConverterFunctionClassConstants,
                    false,
                    false);
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    private static class Scope1 implements UpdateRuntimeScopeInterface {

        Object file;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
        }
    }
}
