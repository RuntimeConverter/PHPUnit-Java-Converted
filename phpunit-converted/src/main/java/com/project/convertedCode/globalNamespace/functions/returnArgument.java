package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.ReturnArgument;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Assert/Functions.php

*/

public class returnArgument extends FunctionBaseRegular {

    public static returnArgument f = new returnArgument();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argumentIndex")
    public Object call(RuntimeEnv env, Object... args) {
        Object argumentIndex = assignParameter(args, 0, null);
        return ZVal.assign(new ReturnArgument(env, argumentIndex));
    }
}
