package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
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

public class assertAttributeInstanceOf extends FunctionBaseRegular {

    public static assertAttributeInstanceOf f = new assertAttributeInstanceOf();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
    @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
    @ConvertedParameter(index = 2, name = "classOrObject")
    @ConvertedParameter(index = 3, name = "message", typeHint = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object attributeName = assignParameter(args, 1, null);
        Object classOrObject = assignParameter(args, 2, null);
        Object message = assignParameter(args, 3, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        Assert.runtimeStaticObject.assertAttributeInstanceOf(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                NamespaceGlobal.func_get_args.env(env).call().value())));
        return null;
    }
}
