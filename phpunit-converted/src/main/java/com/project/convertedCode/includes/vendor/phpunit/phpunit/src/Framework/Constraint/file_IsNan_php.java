package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Framework.Constraint;

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

 vendor/phpunit/phpunit/src/Framework/Constraint/IsNan.php

*/

public class file_IsNan_php implements RuntimeIncludable {

    public static final file_IsNan_php instance = new file_IsNan_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope421 scope = new Scope421();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope421 scope)
            throws IncludeEventException {

        // Conversion Note: class named IsNan was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\Constraint\\IsNan");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/Constraint")
                    .setFile("/vendor/phpunit/phpunit/src/Framework/Constraint/IsNan.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope421 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
