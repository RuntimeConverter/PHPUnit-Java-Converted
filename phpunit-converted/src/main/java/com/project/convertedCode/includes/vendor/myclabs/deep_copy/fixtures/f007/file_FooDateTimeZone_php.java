package com.project.convertedCode.includes.vendor.myclabs.deep_copy.fixtures.f007;

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

 vendor/myclabs/deep-copy/fixtures/f007/FooDateTimeZone.php

*/

public class file_FooDateTimeZone_php implements RuntimeIncludable {

    public static final file_FooDateTimeZone_php instance = new file_FooDateTimeZone_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope46 scope = new Scope46();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope46 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named FooDateTimeZone was here in the source code
        env.addManualClassLoad("DeepCopy\\f007\\FooDateTimeZone");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/myclabs/deep-copy/fixtures/f007")
                    .setFile("/vendor/myclabs/deep-copy/fixtures/f007/FooDateTimeZone.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope46 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
