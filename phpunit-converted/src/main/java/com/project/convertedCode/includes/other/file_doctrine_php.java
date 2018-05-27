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

 other/doctrine.php

*/

public class file_doctrine_php implements RuntimeIncludable {

    public static final file_doctrine_php instance = new file_doctrine_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope16 scope = new Scope16();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope16 scope)
            throws IncludeEventException {
        // Conversion Note: class named ArrayCollection was here in the source code
        env.addManualClassLoad("Doctrine\\Common\\Collections\\ArrayCollection");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/other").setFile("/other/doctrine.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope16 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
