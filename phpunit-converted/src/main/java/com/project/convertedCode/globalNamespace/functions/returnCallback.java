package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnCallback;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Assert/Functions.php

*/

public class returnCallback extends FunctionBaseRegular {

    public static returnCallback f = new returnCallback();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object call(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, null);
        return ZVal.assign(new ReturnCallback(env, callback));
    }
}
