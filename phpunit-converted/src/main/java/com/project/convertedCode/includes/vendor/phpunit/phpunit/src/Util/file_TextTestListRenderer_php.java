package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Util;

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

 vendor/phpunit/phpunit/src/Util/TextTestListRenderer.php

*/

public class file_TextTestListRenderer_php implements RuntimeIncludable {

    public static final file_TextTestListRenderer_php instance =
            new file_TextTestListRenderer_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope531 scope = new Scope531();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope531 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named TextTestListRenderer was here in the source code
        env.addManualClassLoad("PHPUnit\\Util\\TextTestListRenderer");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Util")
                    .setFile("/vendor/phpunit/phpunit/src/Util/TextTestListRenderer.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope531 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
