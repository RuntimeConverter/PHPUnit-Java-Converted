package com.project.convertedCode.includes.vendor.phpdocumentor.reflection_docblock.src.DocBlock;

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

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/DescriptionFactory.php

*/

public class file_DescriptionFactory_php implements RuntimeIncludable {

    public static final file_DescriptionFactory_php instance = new file_DescriptionFactory_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope148 scope = new Scope148();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope148 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named DescriptionFactory was here in the source code
        env.addManualClassLoad("phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpdocumentor/reflection-docblock/src/DocBlock")
                    .setFile(
                            "/vendor/phpdocumentor/reflection-docblock/src/DocBlock/DescriptionFactory.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope148 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
