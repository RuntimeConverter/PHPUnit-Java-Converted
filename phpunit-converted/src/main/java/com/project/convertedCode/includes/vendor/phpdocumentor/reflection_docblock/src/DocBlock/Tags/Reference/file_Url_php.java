package com.project.convertedCode.includes.vendor.phpdocumentor.reflection_docblock.src.DocBlock.Tags.Reference;

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

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Reference/Url.php

*/

public class file_Url_php implements RuntimeIncludable {

    public static final file_Url_php instance = new file_Url_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope173 scope = new Scope173();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope173 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Url was here in the source code
        env.addManualClassLoad("phpDocumentor\\Reflection\\DocBlock\\Tags\\Reference\\Url");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Reference")
                    .setFile(
                            "/vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Reference/Url.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope173 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
