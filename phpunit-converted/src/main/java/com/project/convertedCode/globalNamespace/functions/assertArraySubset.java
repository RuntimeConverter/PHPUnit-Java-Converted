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

public class assertArraySubset extends FunctionBaseRegular {

    public static assertArraySubset f = new assertArraySubset();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subset")
    @ConvertedParameter(index = 1, name = "array")
    @ConvertedParameter(
        index = 2,
        name = "strict",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "message", typeHint = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object subset = assignParameter(args, 0, null);
        Object array = assignParameter(args, 1, null);
        Object strict = assignParameter(args, 2, null);
        if (ZVal.isNull(strict)) {
            strict = false;
        }
        Object message = assignParameter(args, 3, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        Assert.runtimeStaticObject.assertArraySubset(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                NamespaceGlobal.func_get_args.env(env).call().value())));
        return null;
    }
}
