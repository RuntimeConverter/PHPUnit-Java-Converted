package com.project.convertedCode.includes.vendor.phar_io.manifest.src.values;

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

 vendor/phar-io/manifest/src/values/RequirementCollectionIterator.php

*/

public class file_RequirementCollectionIterator_php implements RuntimeIncludable {

    public static final file_RequirementCollectionIterator_php instance =
            new file_RequirementCollectionIterator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope103 scope = new Scope103();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope103 scope)
            throws IncludeEventException {

        // Conversion Note: class named RequirementCollectionIterator was here in the source code
        env.addManualClassLoad("PharIo\\Manifest\\RequirementCollectionIterator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phar-io/manifest/src/values")
                    .setFile(
                            "/vendor/phar-io/manifest/src/values/RequirementCollectionIterator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope103 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
