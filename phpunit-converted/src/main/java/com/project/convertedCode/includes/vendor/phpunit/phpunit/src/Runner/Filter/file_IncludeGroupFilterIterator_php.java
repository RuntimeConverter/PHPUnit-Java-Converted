package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Runner.Filter;

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

 vendor/phpunit/phpunit/src/Runner/Filter/IncludeGroupFilterIterator.php

*/

public class file_IncludeGroupFilterIterator_php implements RuntimeIncludable {

    public static final file_IncludeGroupFilterIterator_php instance =
            new file_IncludeGroupFilterIterator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope482 scope = new Scope482();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope482 scope)
            throws IncludeEventException {

        // Conversion Note: class named IncludeGroupFilterIterator was here in the source code
        env.addManualClassLoad("PHPUnit\\Runner\\Filter\\IncludeGroupFilterIterator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Runner/Filter")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Runner/Filter/IncludeGroupFilterIterator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope482 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
