package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Util.PHP;

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

 vendor/phpunit/phpunit/src/Util/PHP/WindowsPhpProcess.php

*/

public class file_WindowsPhpProcess_php implements RuntimeIncludable {

    public static final file_WindowsPhpProcess_php instance = new file_WindowsPhpProcess_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope519 scope = new Scope519();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope519 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named WindowsPhpProcess was here in the source code
        env.addManualClassLoad("PHPUnit\\Util\\PHP\\WindowsPhpProcess");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Util/PHP")
                    .setFile("/vendor/phpunit/phpunit/src/Util/PHP/WindowsPhpProcess.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope519 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
