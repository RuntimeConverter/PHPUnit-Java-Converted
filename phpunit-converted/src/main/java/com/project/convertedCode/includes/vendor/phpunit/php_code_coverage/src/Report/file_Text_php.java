package com.project.convertedCode.includes.vendor.phpunit.php_code_coverage.src.Report;

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

 vendor/phpunit/php-code-coverage/src/Report/Text.php

*/

public class file_Text_php implements RuntimeIncludable {

    public static final file_Text_php instance = new file_Text_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope320 scope = new Scope320();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope320 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named Text was here in the source code
        env.addManualClassLoad("SebastianBergmann\\CodeCoverage\\Report\\Text");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/php-code-coverage/src/Report")
                    .setFile("/vendor/phpunit/php-code-coverage/src/Report/Text.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope320 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
