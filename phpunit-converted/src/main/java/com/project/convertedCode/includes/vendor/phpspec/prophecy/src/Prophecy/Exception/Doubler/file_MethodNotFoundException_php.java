package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Exception.Doubler;

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

 vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/MethodNotFoundException.php

*/

public class file_MethodNotFoundException_php implements RuntimeIncludable {

    public static final file_MethodNotFoundException_php instance =
            new file_MethodNotFoundException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope260 scope = new Scope260();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope260 scope)
            throws IncludeEventException {

        // Conversion Note: class named MethodNotFoundException was here in the source code
        env.addManualClassLoad("Prophecy\\Exception\\Doubler\\MethodNotFoundException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/MethodNotFoundException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope260 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
