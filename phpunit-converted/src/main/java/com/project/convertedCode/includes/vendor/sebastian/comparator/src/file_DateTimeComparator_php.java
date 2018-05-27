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

 vendor/sebastian/comparator/src/DateTimeComparator.php

*/

public class file_DateTimeComparator_php implements RuntimeIncludable {

    public static final file_DateTimeComparator_php instance = new file_DateTimeComparator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope540 scope = new Scope540();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope540 scope)
            throws IncludeEventException {

        // Conversion Note: class named DateTimeComparator was here in the source code
        env.addManualClassLoad("SebastianBergmann\\Comparator\\DateTimeComparator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/comparator/src")
                    .setFile("/vendor/sebastian/comparator/src/DateTimeComparator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope540 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
