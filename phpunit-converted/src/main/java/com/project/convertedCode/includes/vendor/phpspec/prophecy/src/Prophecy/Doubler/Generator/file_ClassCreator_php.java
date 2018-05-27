package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Doubler.Generator;

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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassCreator.php

*/

public class file_ClassCreator_php implements RuntimeIncludable {

    public static final file_ClassCreator_php instance = new file_ClassCreator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope243 scope = new Scope243();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope243 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ClassCreator was here in the source code
        env.addManualClassLoad("Prophecy\\Doubler\\Generator\\ClassCreator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassCreator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope243 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
