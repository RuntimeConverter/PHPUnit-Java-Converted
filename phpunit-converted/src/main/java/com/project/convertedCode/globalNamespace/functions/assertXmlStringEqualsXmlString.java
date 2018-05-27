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

public class assertXmlStringEqualsXmlString extends FunctionBaseRegular {

    public static assertXmlStringEqualsXmlString f = new assertXmlStringEqualsXmlString();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedXml")
    @ConvertedParameter(index = 1, name = "actualXml")
    @ConvertedParameter(index = 2, name = "message", typeHint = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object expectedXml = assignParameter(args, 0, null);
        Object actualXml = assignParameter(args, 1, null);
        Object message = assignParameter(args, 2, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        Assert.runtimeStaticObject.assertXmlStringEqualsXmlString(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                NamespaceGlobal.func_get_args.env(env).call().value())));
        return null;
    }
}
