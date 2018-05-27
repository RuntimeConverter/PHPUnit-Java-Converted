package com.project.convertedCode.includes.tests;

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

 tests/EmailTest.php

*/

public class file_EmailTest_php implements RuntimeIncludable {

    public static final file_EmailTest_php instance = new file_EmailTest_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope22 scope = new Scope22();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope22 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named EmailTest was here in the source code
        env.addManualClassLoad("EmailTest");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/tests").setFile("/tests/EmailTest.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope22 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
