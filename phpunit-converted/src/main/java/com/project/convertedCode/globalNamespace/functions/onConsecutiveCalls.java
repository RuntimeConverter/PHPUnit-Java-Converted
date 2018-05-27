package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ConsecutiveCalls;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Assert/Functions.php

*/

public class onConsecutiveCalls extends FunctionBaseRegular {

    public static onConsecutiveCalls f = new onConsecutiveCalls();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        Object ___args = null;
        ___args = NamespaceGlobal.func_get_args.env(env).call().value();
        return ZVal.assign(new ConsecutiveCalls(env, ___args));
    }
}
