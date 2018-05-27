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

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/InvalidArgumentException.php

*/

public class file_InvalidArgumentException_php implements RuntimeIncludable {

    public static final file_InvalidArgumentException_php instance =
            new file_InvalidArgumentException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope33 scope = new Scope33();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope33 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named InvalidArgumentException was here in the source code
        env.addManualClassLoad("Doctrine\\Instantiator\\Exception\\InvalidArgumentException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception")
                    .setFile(
                            "/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/InvalidArgumentException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope33 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
