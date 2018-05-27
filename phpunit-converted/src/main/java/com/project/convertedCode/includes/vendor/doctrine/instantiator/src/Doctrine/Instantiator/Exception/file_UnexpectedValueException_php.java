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

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/UnexpectedValueException.php

*/

public class file_UnexpectedValueException_php implements RuntimeIncludable {

    public static final file_UnexpectedValueException_php instance =
            new file_UnexpectedValueException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope34 scope = new Scope34();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope34 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named UnexpectedValueException was here in the source code
        env.addManualClassLoad("Doctrine\\Instantiator\\Exception\\UnexpectedValueException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception")
                    .setFile(
                            "/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/UnexpectedValueException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope34 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
