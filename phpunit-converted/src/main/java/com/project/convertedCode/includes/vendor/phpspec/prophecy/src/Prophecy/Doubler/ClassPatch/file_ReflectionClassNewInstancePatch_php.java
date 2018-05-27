package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Doubler.ClassPatch;

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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/ReflectionClassNewInstancePatch.php

*/

public class file_ReflectionClassNewInstancePatch_php implements RuntimeIncludable {

    public static final file_ReflectionClassNewInstancePatch_php instance =
            new file_ReflectionClassNewInstancePatch_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope237 scope = new Scope237();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope237 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ReflectionClassNewInstancePatch was here in the source code
        env.addManualClassLoad("Prophecy\\Doubler\\ClassPatch\\ReflectionClassNewInstancePatch");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/ReflectionClassNewInstancePatch.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope237 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
