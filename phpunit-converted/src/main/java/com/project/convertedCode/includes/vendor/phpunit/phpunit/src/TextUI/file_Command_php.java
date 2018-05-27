package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.TextUI;

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

 vendor/phpunit/phpunit/src/TextUI/Command.php

*/

public class file_Command_php implements RuntimeIncludable {

    public static final file_Command_php instance = new file_Command_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope501 scope = new Scope501();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope501 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named Command was here in the source code
        env.addManualClassLoad("PHPUnit\\TextUI\\Command");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/TextUI")
                    .setFile("/vendor/phpunit/phpunit/src/TextUI/Command.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope501 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
