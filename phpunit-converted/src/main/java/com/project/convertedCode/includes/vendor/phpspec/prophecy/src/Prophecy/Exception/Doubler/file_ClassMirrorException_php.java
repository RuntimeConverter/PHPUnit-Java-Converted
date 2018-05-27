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

 vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/ClassMirrorException.php

*/

public class file_ClassMirrorException_php implements RuntimeIncludable {

    public static final file_ClassMirrorException_php instance =
            new file_ClassMirrorException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope254 scope = new Scope254();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope254 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ClassMirrorException was here in the source code
        env.addManualClassLoad("Prophecy\\Exception\\Doubler\\ClassMirrorException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/ClassMirrorException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope254 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
