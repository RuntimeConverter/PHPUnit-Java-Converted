package com.project.convertedCode.includes.vendor.phpunit.phpunit_mock_objects.src.ForwardCompatibility;

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

 vendor/phpunit/phpunit-mock-objects/src/ForwardCompatibility/MockObject.php

*/

public class file_MockObject_php implements RuntimeIncludable {

    public static final file_MockObject_php instance = new file_MockObject_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope356 scope = new Scope356();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope356 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named MockObject was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\MockObject\\MockObject");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit-mock-objects/src/ForwardCompatibility")
                    .setFile(
                            "/vendor/phpunit/phpunit-mock-objects/src/ForwardCompatibility/MockObject.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope356 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
