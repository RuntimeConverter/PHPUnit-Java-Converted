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

 vendor/phpunit/php-code-coverage/src/Report/Xml/Coverage.php

*/

public class file_Coverage_php implements RuntimeIncludable {

    public static final file_Coverage_php instance = new file_Coverage_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope322 scope = new Scope322();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope322 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Coverage was here in the source code
        env.addManualClassLoad("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Coverage");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/php-code-coverage/src/Report/Xml")
                    .setFile("/vendor/phpunit/php-code-coverage/src/Report/Xml/Coverage.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope322 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
