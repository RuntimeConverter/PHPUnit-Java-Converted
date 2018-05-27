package com.project.convertedCode.includes.vendor.phpunit.php_code_coverage.src.Driver;

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

 vendor/phpunit/php-code-coverage/src/Driver/PHPDBG.php

*/

public class file_PHPDBG_php implements RuntimeIncludable {

    public static final file_PHPDBG_php instance = new file_PHPDBG_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope298 scope = new Scope298();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope298 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named PHPDBG was here in the source code
        env.addManualClassLoad("SebastianBergmann\\CodeCoverage\\Driver\\PHPDBG");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/php-code-coverage/src/Driver")
                    .setFile("/vendor/phpunit/php-code-coverage/src/Driver/PHPDBG.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope298 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
