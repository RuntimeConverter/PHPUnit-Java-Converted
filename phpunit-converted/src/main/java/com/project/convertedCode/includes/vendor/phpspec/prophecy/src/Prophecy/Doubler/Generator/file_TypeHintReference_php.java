package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Doubler.Generator;

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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/TypeHintReference.php

*/

public class file_TypeHintReference_php implements RuntimeIncludable {

    public static final file_TypeHintReference_php instance = new file_TypeHintReference_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope249 scope = new Scope249();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope249 scope)
            throws IncludeEventException {

        // Conversion Note: class named TypeHintReference was here in the source code
        env.addManualClassLoad("Prophecy\\Doubler\\Generator\\TypeHintReference");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/TypeHintReference.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope249 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
