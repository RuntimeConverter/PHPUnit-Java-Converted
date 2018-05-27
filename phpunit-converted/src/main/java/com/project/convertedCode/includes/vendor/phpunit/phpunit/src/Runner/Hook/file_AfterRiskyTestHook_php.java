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

 vendor/phpunit/phpunit/src/Runner/Hook/AfterRiskyTestHook.php

*/

public class file_AfterRiskyTestHook_php implements RuntimeIncludable {

    public static final file_AfterRiskyTestHook_php instance = new file_AfterRiskyTestHook_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope486 scope = new Scope486();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope486 scope)
            throws IncludeEventException {

        // Conversion Note: class named AfterRiskyTestHook was here in the source code
        env.addManualClassLoad("PHPUnit\\Runner\\AfterRiskyTestHook");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Runner/Hook")
                    .setFile("/vendor/phpunit/phpunit/src/Runner/Hook/AfterRiskyTestHook.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope486 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
