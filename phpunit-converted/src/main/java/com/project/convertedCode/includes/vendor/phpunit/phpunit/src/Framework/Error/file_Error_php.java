package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Framework.Error;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Error/Error.php

*/

public class file_Error_php implements RuntimeIncludable {

    public static final file_Error_php instance = new file_Error_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope446 scope = new Scope446();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope446 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Error was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\Error\\Error");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/Error")
                    .setFile("/vendor/phpunit/phpunit/src/Framework/Error/Error.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope446 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
