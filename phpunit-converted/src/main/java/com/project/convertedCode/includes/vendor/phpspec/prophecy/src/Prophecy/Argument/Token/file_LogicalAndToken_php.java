package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Argument.Token;

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

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/LogicalAndToken.php

*/

public class file_LogicalAndToken_php implements RuntimeIncludable {

    public static final file_LogicalAndToken_php instance = new file_LogicalAndToken_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope219 scope = new Scope219();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope219 scope)
            throws IncludeEventException {

        // Conversion Note: class named LogicalAndToken was here in the source code
        env.addManualClassLoad("Prophecy\\Argument\\Token\\LogicalAndToken");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Argument/Token")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Argument/Token/LogicalAndToken.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope219 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
