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

 vendor/phpunit/phpunit/src/Runner/Filter/ExcludeGroupFilterIterator.php

*/

public class file_ExcludeGroupFilterIterator_php implements RuntimeIncludable {

    public static final file_ExcludeGroupFilterIterator_php instance =
            new file_ExcludeGroupFilterIterator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope479 scope = new Scope479();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope479 scope)
            throws IncludeEventException {

        // Conversion Note: class named ExcludeGroupFilterIterator was here in the source code
        env.addManualClassLoad("PHPUnit\\Runner\\Filter\\ExcludeGroupFilterIterator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Runner/Filter")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Runner/Filter/ExcludeGroupFilterIterator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope479 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
