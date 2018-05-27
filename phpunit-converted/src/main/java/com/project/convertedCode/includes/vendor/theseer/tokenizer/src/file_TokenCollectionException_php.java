package com.project.convertedCode.includes.vendor.theseer.tokenizer.src;

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

 vendor/theseer/tokenizer/src/TokenCollectionException.php

*/

public class file_TokenCollectionException_php implements RuntimeIncludable {

    public static final file_TokenCollectionException_php instance =
            new file_TokenCollectionException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope594 scope = new Scope594();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope594 scope)
            throws IncludeEventException {

        // Conversion Note: class named TokenCollectionException was here in the source code
        env.addManualClassLoad("TheSeer\\Tokenizer\\TokenCollectionException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/theseer/tokenizer/src")
                    .setFile("/vendor/theseer/tokenizer/src/TokenCollectionException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope594 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
