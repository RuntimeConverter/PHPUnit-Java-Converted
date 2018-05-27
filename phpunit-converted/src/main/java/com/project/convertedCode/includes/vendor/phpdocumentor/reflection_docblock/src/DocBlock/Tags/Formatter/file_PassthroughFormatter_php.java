package com.project.convertedCode.includes.vendor.phpdocumentor.reflection_docblock.src.DocBlock.Tags.Formatter;

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

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Formatter/PassthroughFormatter.php

*/

public class file_PassthroughFormatter_php implements RuntimeIncludable {

    public static final file_PassthroughFormatter_php instance =
            new file_PassthroughFormatter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope163 scope = new Scope163();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope163 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named PassthroughFormatter was here in the source code
        env.addManualClassLoad(
                "phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter\\PassthroughFormatter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Formatter")
                    .setFile(
                            "/vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Formatter/PassthroughFormatter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope163 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
