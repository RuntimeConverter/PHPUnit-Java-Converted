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

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/ObjectProphecy.php

*/

public class file_ObjectProphecy_php implements RuntimeIncludable {

    public static final file_ObjectProphecy_php instance = new file_ObjectProphecy_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope288 scope = new Scope288();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope288 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named ObjectProphecy was here in the source code
        env.addManualClassLoad("Prophecy\\Prophecy\\ObjectProphecy");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Prophecy")
                    .setFile("/vendor/phpspec/prophecy/src/Prophecy/Prophecy/ObjectProphecy.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope288 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
