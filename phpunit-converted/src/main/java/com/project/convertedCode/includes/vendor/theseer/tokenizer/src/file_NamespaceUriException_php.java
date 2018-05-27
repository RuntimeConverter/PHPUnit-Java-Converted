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

 vendor/theseer/tokenizer/src/NamespaceUriException.php

*/

public class file_NamespaceUriException_php implements RuntimeIncludable {

    public static final file_NamespaceUriException_php instance =
            new file_NamespaceUriException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope591 scope = new Scope591();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope591 scope)
            throws IncludeEventException {

        // Conversion Note: class named NamespaceUriException was here in the source code
        env.addManualClassLoad("TheSeer\\Tokenizer\\NamespaceUriException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/theseer/tokenizer/src")
                    .setFile("/vendor/theseer/tokenizer/src/NamespaceUriException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope591 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
