package com.project.convertedCode.includes.src;

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

 src/MockTestObj.php

*/

public class file_MockTestObj_php implements RuntimeIncludable {

    public static final file_MockTestObj_php instance = new file_MockTestObj_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope21 scope = new Scope21();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope21 scope)
            throws IncludeEventException {
        // Conversion Note: class named MockTestObj was here in the source code
        env.addManualClassLoad("MockTestObj");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/src").setFile("/src/MockTestObj.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope21 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
