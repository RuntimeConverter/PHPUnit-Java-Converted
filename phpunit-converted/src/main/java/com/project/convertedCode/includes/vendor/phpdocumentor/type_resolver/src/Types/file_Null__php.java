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

 vendor/phpdocumentor/type-resolver/src/Types/Null_.php

*/

public class file_Null__php implements RuntimeIncludable {

    public static final file_Null__php instance = new file_Null__php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope197 scope = new Scope197();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope197 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Null_ was here in the source code
        env.addManualClassLoad("phpDocumentor\\Reflection\\Types\\Null_");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpdocumentor/type-resolver/src/Types")
                    .setFile("/vendor/phpdocumentor/type-resolver/src/Types/Null_.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope197 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
