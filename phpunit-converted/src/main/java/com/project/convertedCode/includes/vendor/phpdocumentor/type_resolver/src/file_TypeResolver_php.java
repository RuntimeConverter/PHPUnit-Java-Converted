package com.project.convertedCode.includes.vendor.phpdocumentor.type_resolver.src;

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

 vendor/phpdocumentor/type-resolver/src/TypeResolver.php

*/

public class file_TypeResolver_php implements RuntimeIncludable {

    public static final file_TypeResolver_php instance = new file_TypeResolver_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope186 scope = new Scope186();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope186 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named TypeResolver was here in the source code
        env.addManualClassLoad("phpDocumentor\\Reflection\\TypeResolver");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpdocumentor/type-resolver/src")
                    .setFile("/vendor/phpdocumentor/type-resolver/src/TypeResolver.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope186 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
