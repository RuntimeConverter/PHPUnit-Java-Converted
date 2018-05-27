package com.project.convertedCode.includes.vendor.phpunit.php_code_coverage.src.Exception;

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

 vendor/phpunit/php-code-coverage/src/Exception/CoveredCodeNotExecutedException.php

*/

public class file_CoveredCodeNotExecutedException_php implements RuntimeIncludable {

    public static final file_CoveredCodeNotExecutedException_php instance =
            new file_CoveredCodeNotExecutedException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope300 scope = new Scope300();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope300 scope)
            throws IncludeEventException {

        // Conversion Note: class named CoveredCodeNotExecutedException was here in the source code
        env.addManualClassLoad("SebastianBergmann\\CodeCoverage\\CoveredCodeNotExecutedException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/php-code-coverage/src/Exception")
                    .setFile(
                            "/vendor/phpunit/php-code-coverage/src/Exception/CoveredCodeNotExecutedException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope300 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
