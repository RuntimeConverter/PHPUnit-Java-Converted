package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Prophecy;

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

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/ProphecyInterface.php

*/

public class file_ProphecyInterface_php implements RuntimeIncludable {

    public static final file_ProphecyInterface_php instance = new file_ProphecyInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope289 scope = new Scope289();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope289 scope)
            throws IncludeEventException {

        // Conversion Note: class named ProphecyInterface was here in the source code
        env.addManualClassLoad("Prophecy\\Prophecy\\ProphecyInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Prophecy")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Prophecy/ProphecyInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope289 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
