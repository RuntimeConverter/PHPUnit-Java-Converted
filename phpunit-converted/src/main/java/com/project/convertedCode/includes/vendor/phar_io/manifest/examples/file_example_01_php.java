package com.project.convertedCode.includes.vendor.phar_io.manifest.examples;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestSerializer;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestLoader;
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

 vendor/phar-io/manifest/examples/example-01.php

*/

public class file_example_01_php implements RuntimeIncludable {

    public static final file_example_01_php instance = new file_example_01_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope73 scope = new Scope73();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope73 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        env.include(
                toStringR(env.addRootFilesystemPrefix("/vendor/phar-io/manifest/examples"), env)
                        + "/../vendor/autoload.php",
                stack,
                this,
                true,
                false);
        scope.manifest =
                ManifestLoader.runtimeStaticObject.fromFile(
                        env,
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/phar-io/manifest/examples"),
                                        env)
                                + "/../tests/_fixture/phpunit-5.6.5.xml");
        env.echo(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "Manifest for %s (%s):\n\n",
                                env.callMethod(
                                        scope.manifest, "getName", file_example_01_php.class),
                                env.callMethod(
                                        env.callMethod(
                                                scope.manifest,
                                                "getVersion",
                                                file_example_01_php.class),
                                        "getVersionString",
                                        file_example_01_php.class))
                        .value());
        env.echo(
                env.callMethod(
                        new ManifestSerializer(env),
                        "serializeToString",
                        file_example_01_php.class,
                        scope.manifest));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phar-io/manifest/examples")
                    .setFile("/vendor/phar-io/manifest/examples/example-01.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope73 implements UpdateRuntimeScopeInterface {

        Object manifest;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("manifest", this.manifest);
        }

        public void updateScope(RuntimeStack stack) {

            this.manifest = stack.getVariable("manifest");
        }
    }
}
