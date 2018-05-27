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

 vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedList.php

*/

public class file_SplDoublyLinkedList_php implements RuntimeIncludable {

    public static final file_SplDoublyLinkedList_php instance = new file_SplDoublyLinkedList_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope68 scope = new Scope68();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope68 scope)
            throws IncludeEventException {

        // Conversion Note: class named SplDoublyLinkedList was here in the source code
        env.addManualClassLoad("DeepCopy\\TypeFilter\\Spl\\SplDoublyLinkedList");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl")
                    .setFile(
                            "/vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedList.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope68 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
