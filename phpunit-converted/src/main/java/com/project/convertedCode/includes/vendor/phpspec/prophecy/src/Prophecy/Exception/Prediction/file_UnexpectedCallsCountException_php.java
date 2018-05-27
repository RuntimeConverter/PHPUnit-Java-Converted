package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Exception.Prediction;

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

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/UnexpectedCallsCountException.php

*/

public class file_UnexpectedCallsCountException_php implements RuntimeIncludable {

    public static final file_UnexpectedCallsCountException_php instance =
            new file_UnexpectedCallsCountException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope268 scope = new Scope268();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope268 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named UnexpectedCallsCountException was here in the source code
        env.addManualClassLoad("Prophecy\\Exception\\Prediction\\UnexpectedCallsCountException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/UnexpectedCallsCountException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope268 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
