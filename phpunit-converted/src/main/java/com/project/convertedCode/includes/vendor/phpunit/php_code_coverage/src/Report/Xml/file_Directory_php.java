package com.project.convertedCode.includes.vendor.phpunit.php_code_coverage.src.Report.Xml;

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

 vendor/phpunit/php-code-coverage/src/Report/Xml/Directory.php

*/

public class file_Directory_php implements RuntimeIncludable {

    public static final file_Directory_php instance = new file_Directory_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope323 scope = new Scope323();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope323 scope)
            throws IncludeEventException {

        // Conversion Note: class named Directory was here in the source code
        env.addManualClassLoad("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Directory");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/php-code-coverage/src/Report/Xml")
                    .setFile("/vendor/phpunit/php-code-coverage/src/Report/Xml/Directory.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope323 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
