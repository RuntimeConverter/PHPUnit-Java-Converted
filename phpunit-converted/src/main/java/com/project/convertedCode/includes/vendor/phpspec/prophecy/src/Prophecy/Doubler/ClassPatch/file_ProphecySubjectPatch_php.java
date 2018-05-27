package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Doubler.ClassPatch;

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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/ProphecySubjectPatch.php

*/

public class file_ProphecySubjectPatch_php implements RuntimeIncludable {

    public static final file_ProphecySubjectPatch_php instance =
            new file_ProphecySubjectPatch_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope236 scope = new Scope236();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope236 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named ProphecySubjectPatch was here in the source code
        env.addManualClassLoad("Prophecy\\Doubler\\ClassPatch\\ProphecySubjectPatch");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/ProphecySubjectPatch.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope236 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
