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

 vendor/sebastian/diff/src/Output/StrictUnifiedDiffOutputBuilder.php

*/

public class file_StrictUnifiedDiffOutputBuilder_php implements RuntimeIncludable {

    public static final file_StrictUnifiedDiffOutputBuilder_php instance =
            new file_StrictUnifiedDiffOutputBuilder_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope563 scope = new Scope563();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope563 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named StrictUnifiedDiffOutputBuilder was here in the source code
        env.addManualClassLoad("SebastianBergmann\\Diff\\Output\\StrictUnifiedDiffOutputBuilder");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/diff/src/Output")
                    .setFile(
                            "/vendor/sebastian/diff/src/Output/StrictUnifiedDiffOutputBuilder.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope563 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
