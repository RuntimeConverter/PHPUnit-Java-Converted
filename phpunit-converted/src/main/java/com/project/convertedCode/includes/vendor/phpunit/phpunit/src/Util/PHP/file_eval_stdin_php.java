package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Util.PHP;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/PHP/eval-stdin.php

*/

public class file_eval_stdin_php implements RuntimeIncludable {

    public static final file_eval_stdin_php instance = new file_eval_stdin_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope520 scope = new Scope520();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope520 scope)
            throws IncludeEventException {
        com.runtimeconverter.runtime.ZVal.functionNotFound("eval222")
                .env(env)
                .call(
                        "?>"
                                + toStringR(
                                        function_file_get_contents
                                                .f
                                                .env(env)
                                                .call("php://stdin")
                                                .value(),
                                        env));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Util/PHP")
                    .setFile("/vendor/phpunit/phpunit/src/Util/PHP/eval-stdin.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope520 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
