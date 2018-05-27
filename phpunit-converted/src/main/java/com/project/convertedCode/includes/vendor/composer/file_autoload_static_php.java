package com.project.convertedCode.includes.vendor.composer;

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

 vendor/composer/autoload_static.php

*/

public class file_autoload_static_php implements RuntimeIncludable {

    public static final file_autoload_static_php instance = new file_autoload_static_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope31 scope = new Scope31();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope31 scope)
            throws IncludeEventException {

        // Conversion Note: class named ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33 was here
        // in the source code
        env.addManualClassLoad(
                "Composer\\Autoload\\ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/composer")
                    .setFile("/vendor/composer/autoload_static.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope31 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
