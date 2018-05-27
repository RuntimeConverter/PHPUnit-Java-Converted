package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.Prophecy;

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

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/ProphecySubjectInterface.php

*/

public class file_ProphecySubjectInterface_php implements RuntimeIncludable {

    public static final file_ProphecySubjectInterface_php instance =
            new file_ProphecySubjectInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope290 scope = new Scope290();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope290 scope)
            throws IncludeEventException {

        // Conversion Note: class named ProphecySubjectInterface was here in the source code
        env.addManualClassLoad("Prophecy\\Prophecy\\ProphecySubjectInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Prophecy")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Prophecy/ProphecySubjectInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope290 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
