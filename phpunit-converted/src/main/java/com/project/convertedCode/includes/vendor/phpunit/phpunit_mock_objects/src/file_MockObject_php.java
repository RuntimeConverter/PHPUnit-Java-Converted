package com.project.convertedCode.includes.vendor.phpunit.phpunit_mock_objects.src;

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

 vendor/phpunit/phpunit-mock-objects/src/MockObject.php

*/

public class file_MockObject_php implements RuntimeIncludable {

    public static final file_MockObject_php instance = new file_MockObject_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope379 scope = new Scope379();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope379 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named PHPUnit_Framework_MockObject_MockObject was here in the
        // source code
        env.addManualClassLoad("PHPUnit_Framework_MockObject_MockObject");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit-mock-objects/src")
                    .setFile("/vendor/phpunit/phpunit-mock-objects/src/MockObject.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope379 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
