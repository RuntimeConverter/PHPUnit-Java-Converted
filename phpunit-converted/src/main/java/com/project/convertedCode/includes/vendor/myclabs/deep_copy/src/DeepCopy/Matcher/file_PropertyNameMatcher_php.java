package com.project.convertedCode.includes.vendor.myclabs.deep_copy.src.DeepCopy.Matcher;

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

 vendor/myclabs/deep-copy/src/DeepCopy/Matcher/PropertyNameMatcher.php

*/

public class file_PropertyNameMatcher_php implements RuntimeIncludable {

    public static final file_PropertyNameMatcher_php instance = new file_PropertyNameMatcher_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope62 scope = new Scope62();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope62 scope)
            throws IncludeEventException {

        // Conversion Note: class named PropertyNameMatcher was here in the source code
        env.addManualClassLoad("DeepCopy\\Matcher\\PropertyNameMatcher");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/myclabs/deep-copy/src/DeepCopy/Matcher")
                    .setFile(
                            "/vendor/myclabs/deep-copy/src/DeepCopy/Matcher/PropertyNameMatcher.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope62 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
