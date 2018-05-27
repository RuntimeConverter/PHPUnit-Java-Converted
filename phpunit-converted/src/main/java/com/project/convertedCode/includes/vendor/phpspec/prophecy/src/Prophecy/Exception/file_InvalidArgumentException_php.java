package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Exception;

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

 vendor/phpspec/prophecy/src/Prophecy/Exception/InvalidArgumentException.php

*/

public class file_InvalidArgumentException_php implements RuntimeIncludable {

    public static final file_InvalidArgumentException_php instance =
            new file_InvalidArgumentException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope263 scope = new Scope263();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope263 scope)
            throws IncludeEventException {

        // Conversion Note: class named InvalidArgumentException was here in the source code
        env.addManualClassLoad("Prophecy\\Exception\\InvalidArgumentException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Exception")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Exception/InvalidArgumentException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope263 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
