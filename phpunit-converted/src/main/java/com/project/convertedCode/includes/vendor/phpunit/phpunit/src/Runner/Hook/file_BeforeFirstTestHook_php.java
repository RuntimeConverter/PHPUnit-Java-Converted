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

 vendor/phpunit/phpunit/src/Runner/Hook/BeforeFirstTestHook.php

*/

public class file_BeforeFirstTestHook_php implements RuntimeIncludable {

    public static final file_BeforeFirstTestHook_php instance = new file_BeforeFirstTestHook_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope492 scope = new Scope492();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope492 scope)
            throws IncludeEventException {

        // Conversion Note: class named BeforeFirstTestHook was here in the source code
        env.addManualClassLoad("PHPUnit\\Runner\\BeforeFirstTestHook");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Runner/Hook")
                    .setFile("/vendor/phpunit/phpunit/src/Runner/Hook/BeforeFirstTestHook.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope492 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
