package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Framework.Constraint;

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

 vendor/phpunit/phpunit/src/Framework/Constraint/StringMatchesFormatDescription.php

*/

public class file_StringMatchesFormatDescription_php implements RuntimeIncludable {

    public static final file_StringMatchesFormatDescription_php instance =
            new file_StringMatchesFormatDescription_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope439 scope = new Scope439();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope439 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named StringMatchesFormatDescription was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\Constraint\\StringMatchesFormatDescription");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/Constraint")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Framework/Constraint/StringMatchesFormatDescription.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope439 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
