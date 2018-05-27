package com.project.convertedCode.includes.vendor.sebastian.diff.src;

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

 vendor/sebastian/diff/src/LongestCommonSubsequenceCalculator.php

*/

public class file_LongestCommonSubsequenceCalculator_php implements RuntimeIncludable {

    public static final file_LongestCommonSubsequenceCalculator_php instance =
            new file_LongestCommonSubsequenceCalculator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope558 scope = new Scope558();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope558 scope)
            throws IncludeEventException {

        // Conversion Note: class named LongestCommonSubsequenceCalculator was here in the source
        // code
        env.addManualClassLoad("SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/diff/src")
                    .setFile("/vendor/sebastian/diff/src/LongestCommonSubsequenceCalculator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope558 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
