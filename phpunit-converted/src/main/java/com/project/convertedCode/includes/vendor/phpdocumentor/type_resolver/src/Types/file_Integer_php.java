package com.project.convertedCode.includes.vendor.phpdocumentor.type_resolver.src.Types;

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

 vendor/phpdocumentor/type-resolver/src/Types/Integer.php

*/

public class file_Integer_php implements RuntimeIncludable {

    public static final file_Integer_php instance = new file_Integer_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope194 scope = new Scope194();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope194 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Integer was here in the source code
        env.addManualClassLoad("phpDocumentor\\Reflection\\Types\\Integer");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpdocumentor/type-resolver/src/Types")
                    .setFile("/vendor/phpdocumentor/type-resolver/src/Types/Integer.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope194 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
