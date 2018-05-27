package com.project.convertedCode.includes.vendor.phar_io.manifest.src.exceptions;

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

 vendor/phar-io/manifest/src/exceptions/InvalidApplicationNameException.php

*/

public class file_InvalidApplicationNameException_php implements RuntimeIncludable {

    public static final file_InvalidApplicationNameException_php instance =
            new file_InvalidApplicationNameException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope78 scope = new Scope78();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope78 scope)
            throws IncludeEventException {

        // Conversion Note: class named InvalidApplicationNameException was here in the source code
        env.addManualClassLoad("PharIo\\Manifest\\InvalidApplicationNameException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phar-io/manifest/src/exceptions")
                    .setFile(
                            "/vendor/phar-io/manifest/src/exceptions/InvalidApplicationNameException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope78 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
