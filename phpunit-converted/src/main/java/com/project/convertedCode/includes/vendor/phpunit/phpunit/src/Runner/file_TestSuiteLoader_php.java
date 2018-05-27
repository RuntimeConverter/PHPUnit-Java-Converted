package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Runner;

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

 vendor/phpunit/phpunit/src/Runner/TestSuiteLoader.php

*/

public class file_TestSuiteLoader_php implements RuntimeIncludable {

    public static final file_TestSuiteLoader_php instance = new file_TestSuiteLoader_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope499 scope = new Scope499();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope499 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named TestSuiteLoader was here in the source code
        env.addManualClassLoad("PHPUnit\\Runner\\TestSuiteLoader");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Runner")
                    .setFile("/vendor/phpunit/phpunit/src/Runner/TestSuiteLoader.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope499 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
