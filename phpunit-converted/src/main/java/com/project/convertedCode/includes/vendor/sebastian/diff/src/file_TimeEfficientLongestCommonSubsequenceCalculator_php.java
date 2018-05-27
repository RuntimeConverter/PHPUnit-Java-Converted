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

 vendor/sebastian/diff/src/TimeEfficientLongestCommonSubsequenceCalculator.php

*/

public class file_TimeEfficientLongestCommonSubsequenceCalculator_php implements RuntimeIncludable {

    public static final file_TimeEfficientLongestCommonSubsequenceCalculator_php instance =
            new file_TimeEfficientLongestCommonSubsequenceCalculator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope566 scope = new Scope566();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope566 scope)
            throws IncludeEventException {

        // Conversion Note: class named TimeEfficientLongestCommonSubsequenceCalculator was here in
        // the source code
        env.addManualClassLoad(
                "SebastianBergmann\\Diff\\TimeEfficientLongestCommonSubsequenceCalculator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/diff/src")
                    .setFile(
                            "/vendor/sebastian/diff/src/TimeEfficientLongestCommonSubsequenceCalculator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope566 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
