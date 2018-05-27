package com.project.convertedCode.includes.vendor.myclabs.deep_copy.src.DeepCopy.Reflection;

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

 vendor/myclabs/deep-copy/src/DeepCopy/Reflection/ReflectionHelper.php

*/

public class file_ReflectionHelper_php implements RuntimeIncludable {

    public static final file_ReflectionHelper_php instance = new file_ReflectionHelper_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope64 scope = new Scope64();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope64 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named ReflectionHelper was here in the source code
        env.addManualClassLoad("DeepCopy\\Reflection\\ReflectionHelper");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/myclabs/deep-copy/src/DeepCopy/Reflection")
                    .setFile(
                            "/vendor/myclabs/deep-copy/src/DeepCopy/Reflection/ReflectionHelper.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope64 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
