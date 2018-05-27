package com.project.convertedCode.includes.vendor.phpunit.phpunit_mock_objects.src.Builder;

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

 vendor/phpunit/phpunit-mock-objects/src/Builder/MethodNameMatch.php

*/

public class file_MethodNameMatch_php implements RuntimeIncludable {

    public static final file_MethodNameMatch_php instance = new file_MethodNameMatch_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope349 scope = new Scope349();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope349 scope)
            throws IncludeEventException {

        // Conversion Note: class named MethodNameMatch was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\MockObject\\Builder\\MethodNameMatch");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit-mock-objects/src/Builder")
                    .setFile(
                            "/vendor/phpunit/phpunit-mock-objects/src/Builder/MethodNameMatch.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope349 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
