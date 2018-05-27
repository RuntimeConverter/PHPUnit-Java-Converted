package com.project.convertedCode.includes.vendor.sebastian.code_unit_reverse_lookup.src;

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

 vendor/sebastian/code-unit-reverse-lookup/src/Wizard.php

*/

public class file_Wizard_php implements RuntimeIncludable {

    public static final file_Wizard_php instance = new file_Wizard_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope535 scope = new Scope535();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope535 scope)
            throws IncludeEventException {

        // Conversion Note: class named Wizard was here in the source code
        env.addManualClassLoad("SebastianBergmann\\CodeUnitReverseLookup\\Wizard");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/code-unit-reverse-lookup/src")
                    .setFile("/vendor/sebastian/code-unit-reverse-lookup/src/Wizard.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope535 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
