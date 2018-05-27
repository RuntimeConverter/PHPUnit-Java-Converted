package com.project.convertedCode.includes.vendor.sebastian.global_state.src.exceptions;

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

 vendor/sebastian/global-state/src/exceptions/RuntimeException.php

*/

public class file_RuntimeException_php implements RuntimeIncludable {

    public static final file_RuntimeException_php instance = new file_RuntimeException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope576 scope = new Scope576();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope576 scope)
            throws IncludeEventException {

        // Conversion Note: class named RuntimeException was here in the source code
        env.addManualClassLoad("SebastianBergmann\\GlobalState\\RuntimeException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/global-state/src/exceptions")
                    .setFile("/vendor/sebastian/global-state/src/exceptions/RuntimeException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope576 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
