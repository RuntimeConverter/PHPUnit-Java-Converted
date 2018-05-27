package com.project.convertedCode.includes.vendor.phpunit.php_token_stream.src.Token.Stream;

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

 vendor/phpunit/php-token-stream/src/Token/Stream/CachingFactory.php

*/

public class file_CachingFactory_php implements RuntimeIncludable {

    public static final file_CachingFactory_php instance = new file_CachingFactory_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope345 scope = new Scope345();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope345 scope)
            throws IncludeEventException {
        // Conversion Note: class named PHP_Token_Stream_CachingFactory was here in the source code
        env.addManualClassLoad("PHP_Token_Stream_CachingFactory");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/php-token-stream/src/Token/Stream")
                    .setFile(
                            "/vendor/phpunit/php-token-stream/src/Token/Stream/CachingFactory.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope345 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
