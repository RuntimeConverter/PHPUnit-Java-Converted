package com.project.convertedCode.includes.vendor.doctrine.instantiator.src.Doctrine.Instantiator;

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

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/InstantiatorInterface.php

*/

public class file_InstantiatorInterface_php implements RuntimeIncludable {

    public static final file_InstantiatorInterface_php instance =
            new file_InstantiatorInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope36 scope = new Scope36();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope36 scope)
            throws IncludeEventException {

        // Conversion Note: class named InstantiatorInterface was here in the source code
        env.addManualClassLoad("Doctrine\\Instantiator\\InstantiatorInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/doctrine/instantiator/src/Doctrine/Instantiator")
                    .setFile(
                            "/vendor/doctrine/instantiator/src/Doctrine/Instantiator/InstantiatorInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope36 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
