package com.project.convertedCode.includes.vendor.sebastian.recursion_context.src;

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

 vendor/sebastian/recursion-context/src/InvalidArgumentException.php

*/

public class file_InvalidArgumentException_php implements RuntimeIncludable {

    public static final file_InvalidArgumentException_php instance =
            new file_InvalidArgumentException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope585 scope = new Scope585();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope585 scope)
            throws IncludeEventException {

        // Conversion Note: class named InvalidArgumentException was here in the source code
        env.addManualClassLoad("SebastianBergmann\\RecursionContext\\InvalidArgumentException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/recursion-context/src")
                    .setFile(
                            "/vendor/sebastian/recursion-context/src/InvalidArgumentException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope585 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
