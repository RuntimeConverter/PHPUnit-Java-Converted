package com.project.convertedCode.includes.vendor.composer;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/autoload_namespaces.php

*/

public class file_autoload_namespaces_php implements RuntimeIncludable {

    public static final file_autoload_namespaces_php instance = new file_autoload_namespaces_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope28 scope = new Scope28();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope28 scope)
            throws IncludeEventException {
        scope.vendorDir =
                NamespaceGlobal.dirname
                        .env(env)
                        .call(
                                NamespaceGlobal.dirname
                                        .env(env)
                                        .call(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/composer/autoload_namespaces.php"))
                                        .value())
                        .value();
        scope.baseDir = NamespaceGlobal.dirname.env(env).call(scope.vendorDir).value();
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "Prophecy\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/phpspec/prophecy/src"))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/composer")
                    .setFile("/vendor/composer/autoload_namespaces.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope28 implements UpdateRuntimeScopeInterface {

        Object vendorDir;
        Object baseDir;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("vendorDir", this.vendorDir);
            stack.setVariable("baseDir", this.baseDir);
        }

        public void updateScope(RuntimeStack stack) {

            this.vendorDir = stack.getVariable("vendorDir");
            this.baseDir = stack.getVariable("baseDir");
        }
    }
}
