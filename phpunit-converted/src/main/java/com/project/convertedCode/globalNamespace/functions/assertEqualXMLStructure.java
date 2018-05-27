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

public class assertEqualXMLStructure extends FunctionBaseRegular {

    public static assertEqualXMLStructure f = new assertEqualXMLStructure();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedElement", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "actualElement", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 2,
        name = "checkAttributes",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "message", typeHint = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object expectedElement = assignParameter(args, 0, null);
        Object actualElement = assignParameter(args, 1, null);
        Object checkAttributes = assignParameter(args, 2, null);
        if (ZVal.isNull(checkAttributes)) {
            checkAttributes = false;
        }
        Object message = assignParameter(args, 3, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        Assert.runtimeStaticObject.assertEqualXMLStructure(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                NamespaceGlobal.func_get_args.env(env).call().value())));
        return null;
    }
}
