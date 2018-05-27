package com.project.convertedCode.includes.other;

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

 other/invoker.php

*/

public class file_invoker_php implements RuntimeIncludable {

    public static final file_invoker_php instance = new file_invoker_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope17 scope = new Scope17();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope17 scope)
            throws IncludeEventException {

        // Conversion Note: class named Exception was here in the source code
        env.addManualClassLoad("SebastianBergmann\\Invoker\\Exception");
        // Conversion Note: class named Invoker was here in the source code
        env.addManualClassLoad("SebastianBergmann\\Invoker\\Invoker");
        // Conversion Note: class named TimeoutException was here in the source code
        env.addManualClassLoad("SebastianBergmann\\Invoker\\TimeoutException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/other").setFile("/other/invoker.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope17 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
