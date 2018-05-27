package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Util.TestDox;

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

 vendor/phpunit/phpunit/src/Util/TestDox/NamePrettifier.php

*/

public class file_NamePrettifier_php implements RuntimeIncludable {

    public static final file_NamePrettifier_php instance = new file_NamePrettifier_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope526 scope = new Scope526();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope526 scope)
            throws IncludeEventException {

        // Conversion Note: class named NamePrettifier was here in the source code
        env.addManualClassLoad("PHPUnit\\Util\\TestDox\\NamePrettifier");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Util/TestDox")
                    .setFile("/vendor/phpunit/phpunit/src/Util/TestDox/NamePrettifier.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope526 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
