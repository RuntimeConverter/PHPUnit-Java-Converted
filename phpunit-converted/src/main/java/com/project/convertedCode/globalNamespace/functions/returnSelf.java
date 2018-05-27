package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnSelf;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Assert/Functions.php

*/

public class returnSelf extends FunctionBaseRegular {

    public static returnSelf f = new returnSelf();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReturnSelf(env));
    }
}
