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

 vendor/phpunit/phpunit/src/Util/PHP/DefaultPhpProcess.php

*/

public class file_DefaultPhpProcess_php implements RuntimeIncludable {

    public static final file_DefaultPhpProcess_php instance = new file_DefaultPhpProcess_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope518 scope = new Scope518();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope518 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named DefaultPhpProcess was here in the source code
        env.addManualClassLoad("PHPUnit\\Util\\PHP\\DefaultPhpProcess");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Util/PHP")
                    .setFile("/vendor/phpunit/phpunit/src/Util/PHP/DefaultPhpProcess.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope518 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
