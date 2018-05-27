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

 vendor/theseer/tokenizer/src/NamespaceUri.php

*/

public class file_NamespaceUri_php implements RuntimeIncludable {

    public static final file_NamespaceUri_php instance = new file_NamespaceUri_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope590 scope = new Scope590();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope590 scope)
            throws IncludeEventException {

        // Conversion Note: class named NamespaceUri was here in the source code
        env.addManualClassLoad("TheSeer\\Tokenizer\\NamespaceUri");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/theseer/tokenizer/src")
                    .setFile("/vendor/theseer/tokenizer/src/NamespaceUri.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope590 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
