package com.project.convertedCode.includes.vendor.phar_io.version.src;

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

 vendor/phar-io/version/src/GreaterThanOrEqualToVersionConstraint.php

*/

public class file_GreaterThanOrEqualToVersionConstraint_php implements RuntimeIncludable {

    public static final file_GreaterThanOrEqualToVersionConstraint_php instance =
            new file_GreaterThanOrEqualToVersionConstraint_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope128 scope = new Scope128();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope128 scope)
            throws IncludeEventException {

        // Conversion Note: class named GreaterThanOrEqualToVersionConstraint was here in the source
        // code
        env.addManualClassLoad("PharIo\\Version\\GreaterThanOrEqualToVersionConstraint");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phar-io/version/src")
                    .setFile(
                            "/vendor/phar-io/version/src/GreaterThanOrEqualToVersionConstraint.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope128 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
