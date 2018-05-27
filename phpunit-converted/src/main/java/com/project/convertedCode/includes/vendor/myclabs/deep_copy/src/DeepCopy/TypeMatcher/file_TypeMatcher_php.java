package com.project.convertedCode.includes.vendor.myclabs.deep_copy.src.DeepCopy.TypeMatcher;

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

 vendor/myclabs/deep-copy/src/DeepCopy/TypeMatcher/TypeMatcher.php

*/

public class file_TypeMatcher_php implements RuntimeIncludable {

    public static final file_TypeMatcher_php instance = new file_TypeMatcher_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope71 scope = new Scope71();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope71 scope)
            throws IncludeEventException {

        // Conversion Note: class named TypeMatcher was here in the source code
        env.addManualClassLoad("DeepCopy\\TypeMatcher\\TypeMatcher");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/myclabs/deep-copy/src/DeepCopy/TypeMatcher")
                    .setFile("/vendor/myclabs/deep-copy/src/DeepCopy/TypeMatcher/TypeMatcher.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope71 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
