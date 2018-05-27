package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedAtLeastCount;
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

public class atLeast extends FunctionBaseRegular {

    public static atLeast f = new atLeast();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requiredInvocations")
    public Object call(RuntimeEnv env, Object... args) {
        Object requiredInvocations = assignParameter(args, 0, null);
        return ZVal.assign(new InvokedAtLeastCount(env, requiredInvocations));
    }
}
