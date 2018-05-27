package com.project.convertedCode.includes.vendor.sebastian.comparator.src;

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

 vendor/sebastian/comparator/src/DoubleComparator.php

*/

public class file_DoubleComparator_php implements RuntimeIncludable {

    public static final file_DoubleComparator_php instance = new file_DoubleComparator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope541 scope = new Scope541();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope541 scope)
            throws IncludeEventException {

        // Conversion Note: class named DoubleComparator was here in the source code
        env.addManualClassLoad("SebastianBergmann\\Comparator\\DoubleComparator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/comparator/src")
                    .setFile("/vendor/sebastian/comparator/src/DoubleComparator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope541 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
