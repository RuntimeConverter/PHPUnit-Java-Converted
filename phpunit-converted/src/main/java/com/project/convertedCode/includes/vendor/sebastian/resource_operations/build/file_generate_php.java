package com.project.convertedCode.includes.vendor.sebastian.resource_operations.build;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
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

 vendor/sebastian/resource-operations/build/generate.php

*/

public class file_generate_php implements RuntimeIncludable {

    public static final file_generate_php instance = new file_generate_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope586 scope = new Scope586();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope586 scope)
            throws IncludeEventException {
        env.echo("#!/usr/bin/env php\n");
        scope.functions =
                ZVal.assign(
                        env.include(
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/sebastian/resource-operations/build"),
                                                env)
                                        + "/arginfo.php",
                                stack,
                                this,
                                true,
                                false));
        scope.resourceFunctions = ZVal.newArray();
        for (ZPair zpairResult487 : ZVal.getIterable(scope.functions, env, false)) {
            scope.function = ZVal.assign(zpairResult487.getKey());
            scope.arguments = ZVal.assign(zpairResult487.getValue());
            for (ZPair zpairResult488 : ZVal.getIterable(scope.arguments, env, true)) {
                scope.argument = ZVal.assign(zpairResult488.getValue());
                if (ZVal.equalityCheck(scope.argument, "resource")) {
                    ZVal.addToArray(scope.resourceFunctions, scope.function);
                }
            }
        }

        scope.resourceFunctions =
                CRArrayF.array_unique.env(env).call(scope.resourceFunctions).value();
        CRArrayF.sort.env(env).call(scope.resourceFunctions);
        scope.buffer =
                "<?php\n/*\n * This file is part of resource-operations.\n *\n * (c) Sebastian Bergmann <sebastian@phpunit.de>\n *\n * For the full copyright and license information, please view the LICENSE\n * file that was distributed with this source code.\n */\n\nnamespace SebastianBergmann\\ResourceOperations;\n\nclass ResourceOperations\n{\n    /**\n     * @return string[]\n     */\n    public static function getFunctions()\n    {\n        return [\n";
        for (ZPair zpairResult489 : ZVal.getIterable(scope.resourceFunctions, env, true)) {
            scope.function = ZVal.assign(zpairResult489.getValue());
            scope.buffer =
                    toStringR(scope.buffer, env)
                            + toStringR(
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call("            '%s',\n", scope.function)
                                            .value(),
                                    env);
        }

        scope.buffer = toStringR(scope.buffer, env) + "        ];\n    }\n}\n";
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/sebastian/resource-operations/build"),
                                        env)
                                + "/../src/ResourceOperations.php",
                        scope.buffer);
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/sebastian/resource-operations/build")
                    .setFile("/vendor/sebastian/resource-operations/build/generate.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope586 implements UpdateRuntimeScopeInterface {

        Object argument;
        Object functions;
        Object function;
        Object arguments;
        Object resourceFunctions;
        Object buffer;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("argument", this.argument);
            stack.setVariable("functions", this.functions);
            stack.setVariable("function", this.function);
            stack.setVariable("arguments", this.arguments);
            stack.setVariable("resourceFunctions", this.resourceFunctions);
            stack.setVariable("buffer", this.buffer);
        }

        public void updateScope(RuntimeStack stack) {

            this.argument = stack.getVariable("argument");
            this.functions = stack.getVariable("functions");
            this.function = stack.getVariable("function");
            this.arguments = stack.getVariable("arguments");
            this.resourceFunctions = stack.getVariable("resourceFunctions");
            this.buffer = stack.getVariable("buffer");
        }
    }
}
