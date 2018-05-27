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

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/RevealerInterface.php

*/

public class file_RevealerInterface_php implements RuntimeIncludable {

    public static final file_RevealerInterface_php instance = new file_RevealerInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope292 scope = new Scope292();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope292 scope)
            throws IncludeEventException {

        // Conversion Note: class named RevealerInterface was here in the source code
        env.addManualClassLoad("Prophecy\\Prophecy\\RevealerInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/Prophecy")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/Prophecy/RevealerInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope292 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
