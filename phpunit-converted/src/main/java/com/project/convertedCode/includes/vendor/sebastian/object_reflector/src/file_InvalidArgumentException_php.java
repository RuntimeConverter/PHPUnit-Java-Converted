package com.project.convertedCode.includes.vendor.sebastian.object_reflector.src;

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

 vendor/sebastian/object-reflector/src/InvalidArgumentException.php

*/

public class file_InvalidArgumentException_php implements RuntimeIncludable {

    public static final file_InvalidArgumentException_php instance =
            new file_InvalidArgumentException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope581 scope = new Scope581();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope581 scope)
            throws IncludeEventException {

        // Conversion Note: class named InvalidArgumentException was here in the source code
        env.addManualClassLoad("SebastianBergmann\\ObjectReflector\\InvalidArgumentException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/object-reflector/src")
                    .setFile("/vendor/sebastian/object-reflector/src/InvalidArgumentException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope581 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
