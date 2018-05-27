package com.project.convertedCode.includes.vendor.phpdocumentor.reflection_docblock.src;

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

 vendor/phpdocumentor/reflection-docblock/src/DocBlockFactoryInterface.php

*/

public class file_DocBlockFactoryInterface_php implements RuntimeIncludable {

    public static final file_DocBlockFactoryInterface_php instance =
            new file_DocBlockFactoryInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope183 scope = new Scope183();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope183 scope)
            throws IncludeEventException {

        // Conversion Note: class named DocBlockFactoryInterface was here in the source code
        env.addManualClassLoad("phpDocumentor\\Reflection\\DocBlockFactoryInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpdocumentor/reflection-docblock/src")
                    .setFile(
                            "/vendor/phpdocumentor/reflection-docblock/src/DocBlockFactoryInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope183 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
