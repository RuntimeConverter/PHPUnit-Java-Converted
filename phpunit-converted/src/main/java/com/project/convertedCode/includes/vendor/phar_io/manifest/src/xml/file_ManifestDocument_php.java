package com.project.convertedCode.includes.vendor.phar_io.manifest.src.xml;

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

 vendor/phar-io/manifest/src/xml/ManifestDocument.php

*/

public class file_ManifestDocument_php implements RuntimeIncludable {

    public static final file_ManifestDocument_php instance = new file_ManifestDocument_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope118 scope = new Scope118();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope118 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named ManifestDocument was here in the source code
        env.addManualClassLoad("PharIo\\Manifest\\ManifestDocument");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phar-io/manifest/src/xml")
                    .setFile("/vendor/phar-io/manifest/src/xml/ManifestDocument.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope118 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
