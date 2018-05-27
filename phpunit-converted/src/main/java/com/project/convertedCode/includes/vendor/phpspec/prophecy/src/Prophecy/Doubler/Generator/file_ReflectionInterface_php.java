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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ReflectionInterface.php

*/

public class file_ReflectionInterface_php implements RuntimeIncludable {

    public static final file_ReflectionInterface_php instance = new file_ReflectionInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope248 scope = new Scope248();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope248 scope)
            throws IncludeEventException {

        // Conversion Note: class named ReflectionInterface was here in the source code
        env.addManualClassLoad("Prophecy\\Doubler\\Generator\\ReflectionInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ReflectionInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope248 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
