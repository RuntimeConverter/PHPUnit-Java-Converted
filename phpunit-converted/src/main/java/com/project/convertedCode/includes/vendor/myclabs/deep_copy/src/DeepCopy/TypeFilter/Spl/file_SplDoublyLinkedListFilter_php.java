package com.project.convertedCode.includes.vendor.myclabs.deep_copy.src.DeepCopy.TypeFilter.Spl;

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

 vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedListFilter.php

*/

public class file_SplDoublyLinkedListFilter_php implements RuntimeIncludable {

    public static final file_SplDoublyLinkedListFilter_php instance =
            new file_SplDoublyLinkedListFilter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope69 scope = new Scope69();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope69 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named SplDoublyLinkedListFilter was here in the source code
        env.addManualClassLoad("DeepCopy\\TypeFilter\\Spl\\SplDoublyLinkedListFilter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl")
                    .setFile(
                            "/vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedListFilter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope69 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
