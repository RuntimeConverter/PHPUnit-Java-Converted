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

public class assertNotEquals extends FunctionBaseRegular {

    public static assertNotEquals f = new assertNotEquals();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    @ConvertedParameter(index = 2, name = "message", typeHint = "string")
    @ConvertedParameter(
        index = 3,
        name = "delta",
        defaultValue = "0.0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 4,
        name = "maxDepth",
        defaultValue = "10",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 5,
        name = "canonicalize",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "ignoreCase",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        Object actual = assignParameter(args, 1, null);
        Object message = assignParameter(args, 2, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        Object delta = assignParameter(args, 3, null);
        if (ZVal.isNull(delta)) {
            delta = 0.0;
        }
        Object maxDepth = assignParameter(args, 4, null);
        if (ZVal.isNull(maxDepth)) {
            maxDepth = 10;
        }
        Object canonicalize = assignParameter(args, 5, null);
        if (ZVal.isNull(canonicalize)) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 6, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        Assert.runtimeStaticObject.assertNotEquals(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                NamespaceGlobal.func_get_args.env(env).call().value())));
        return null;
    }
}
