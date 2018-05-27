package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Runner.Hook;

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

 vendor/phpunit/phpunit/src/Runner/Hook/AfterSkippedTestHook.php

*/

public class file_AfterSkippedTestHook_php implements RuntimeIncludable {

    public static final file_AfterSkippedTestHook_php instance =
            new file_AfterSkippedTestHook_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope487 scope = new Scope487();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope487 scope)
            throws IncludeEventException {

        // Conversion Note: class named AfterSkippedTestHook was here in the source code
        env.addManualClassLoad("PHPUnit\\Runner\\AfterSkippedTestHook");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Runner/Hook")
                    .setFile("/vendor/phpunit/phpunit/src/Runner/Hook/AfterSkippedTestHook.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope487 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
