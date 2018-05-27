package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Argument;

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

 vendor/phpspec/prophecy/src/Prophecy/Argument/ArgumentsWildcard.php

*/

public class file_ArgumentsWildcard_php implements RuntimeIncludable {

    public static final file_ArgumentsWildcard_php instance = new file_ArgumentsWildcard_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope209 scope = new Scope209();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope209 scope)
            throws IncludeEventException {

        // Conversion Note: class named ArgumentsWildcard was here in the source code
        env.addManualClassLoad("Prophecy\\Argument\\ArgumentsWildcard");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Argument")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Argument/ArgumentsWildcard.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope209 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
