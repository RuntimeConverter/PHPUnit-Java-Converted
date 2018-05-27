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

 vendor/phpunit/phpunit/src/Framework/Constraint/ClassHasStaticAttribute.php

*/

public class file_ClassHasStaticAttribute_php implements RuntimeIncludable {

    public static final file_ClassHasStaticAttribute_php instance =
            new file_ClassHasStaticAttribute_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope401 scope = new Scope401();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope401 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ClassHasStaticAttribute was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\Constraint\\ClassHasStaticAttribute");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/Constraint")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Framework/Constraint/ClassHasStaticAttribute.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope401 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
