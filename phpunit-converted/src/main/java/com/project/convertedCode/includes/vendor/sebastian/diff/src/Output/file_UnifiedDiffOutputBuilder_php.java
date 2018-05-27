package com.project.convertedCode.includes.vendor.sebastian.diff.src.Output;

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

 vendor/sebastian/diff/src/Output/UnifiedDiffOutputBuilder.php

*/

public class file_UnifiedDiffOutputBuilder_php implements RuntimeIncludable {

    public static final file_UnifiedDiffOutputBuilder_php instance =
            new file_UnifiedDiffOutputBuilder_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope564 scope = new Scope564();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope564 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named UnifiedDiffOutputBuilder was here in the source code
        env.addManualClassLoad("SebastianBergmann\\Diff\\Output\\UnifiedDiffOutputBuilder");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/diff/src/Output")
                    .setFile("/vendor/sebastian/diff/src/Output/UnifiedDiffOutputBuilder.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope564 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
