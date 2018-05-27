package com.project.convertedCode.includes.vendor.doctrine.instantiator.src.Doctrine.Instantiator.Exception;

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

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/ExceptionInterface.php

*/

public class file_ExceptionInterface_php implements RuntimeIncludable {

    public static final file_ExceptionInterface_php instance = new file_ExceptionInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope32 scope = new Scope32();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope32 scope)
            throws IncludeEventException {

        // Conversion Note: class named ExceptionInterface was here in the source code
        env.addManualClassLoad("Doctrine\\Instantiator\\Exception\\ExceptionInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception")
                    .setFile(
                            "/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/ExceptionInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope32 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
