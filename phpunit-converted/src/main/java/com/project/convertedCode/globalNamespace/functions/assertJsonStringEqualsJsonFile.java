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

public class assertJsonStringEqualsJsonFile extends FunctionBaseRegular {

    public static assertJsonStringEqualsJsonFile f = new assertJsonStringEqualsJsonFile();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
    @ConvertedParameter(index = 1, name = "actualJson", typeHint = "string")
    @ConvertedParameter(index = 2, name = "message", typeHint = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object expectedFile = assignParameter(args, 0, null);
        Object actualJson = assignParameter(args, 1, null);
        Object message = assignParameter(args, 2, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        Assert.runtimeStaticObject.assertJsonStringEqualsJsonFile(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                NamespaceGlobal.func_get_args.env(env).call().value())));
        return null;
    }
}
