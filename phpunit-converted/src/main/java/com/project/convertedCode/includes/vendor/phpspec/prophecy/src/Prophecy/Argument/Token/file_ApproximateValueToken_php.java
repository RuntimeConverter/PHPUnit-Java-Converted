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

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ApproximateValueToken.php

*/

public class file_ApproximateValueToken_php implements RuntimeIncludable {

    public static final file_ApproximateValueToken_php instance =
            new file_ApproximateValueToken_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope212 scope = new Scope212();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope212 scope)
            throws IncludeEventException {

        // Conversion Note: class named ApproximateValueToken was here in the source code
        env.addManualClassLoad("Prophecy\\Argument\\Token\\ApproximateValueToken");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Argument/Token")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ApproximateValueToken.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope212 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
