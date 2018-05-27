package com.project.convertedCode.includes.vendor.phpspec.prophecy.src.Prophecy.PhpDocumentor;

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

 vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/ClassAndInterfaceTagRetriever.php

*/

public class file_ClassAndInterfaceTagRetriever_php implements RuntimeIncludable {

    public static final file_ClassAndInterfaceTagRetriever_php instance =
            new file_ClassAndInterfaceTagRetriever_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope273 scope = new Scope273();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope273 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named ClassAndInterfaceTagRetriever was here in the source code
        env.addManualClassLoad("Prophecy\\PhpDocumentor\\ClassAndInterfaceTagRetriever");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor")
                    .setFile(
                            "/vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/ClassAndInterfaceTagRetriever.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope273 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
