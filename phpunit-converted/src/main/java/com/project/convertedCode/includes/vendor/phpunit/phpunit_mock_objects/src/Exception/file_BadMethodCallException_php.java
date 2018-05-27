package com.project.convertedCode.includes.vendor.phpunit.phpunit_mock_objects.src.Exception;

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

 vendor/phpunit/phpunit-mock-objects/src/Exception/BadMethodCallException.php

*/

public class file_BadMethodCallException_php implements RuntimeIncludable {

    public static final file_BadMethodCallException_php instance =
            new file_BadMethodCallException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope353 scope = new Scope353();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope353 scope)
            throws IncludeEventException {

        // Conversion Note: class named BadMethodCallException was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\MockObject\\BadMethodCallException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit-mock-objects/src/Exception")
                    .setFile(
                            "/vendor/phpunit/phpunit-mock-objects/src/Exception/BadMethodCallException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope353 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
