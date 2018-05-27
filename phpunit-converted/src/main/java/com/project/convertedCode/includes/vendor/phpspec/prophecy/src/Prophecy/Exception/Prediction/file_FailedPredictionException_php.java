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

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/FailedPredictionException.php

*/

public class file_FailedPredictionException_php implements RuntimeIncludable {

    public static final file_FailedPredictionException_php instance =
            new file_FailedPredictionException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope265 scope = new Scope265();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope265 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named FailedPredictionException was here in the source code
        env.addManualClassLoad("Prophecy\\Exception\\Prediction\\FailedPredictionException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/FailedPredictionException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope265 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
