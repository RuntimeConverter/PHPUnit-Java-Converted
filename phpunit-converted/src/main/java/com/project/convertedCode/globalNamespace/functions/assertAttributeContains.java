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

public class assertAttributeContains extends FunctionBaseRegular {

    public static assertAttributeContains f = new assertAttributeContains();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "needle")
    @ConvertedParameter(index = 1, name = "haystackAttributeName", typeHint = "string")
    @ConvertedParameter(index = 2, name = "haystackClassOrObject")
    @ConvertedParameter(index = 3, name = "message", typeHint = "string")
    @ConvertedParameter(
        index = 4,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "checkForObjectIdentity",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "checkForNonObjectIdentity",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object needle = assignParameter(args, 0, null);
        Object haystackAttributeName = assignParameter(args, 1, null);
        Object haystackClassOrObject = assignParameter(args, 2, null);
        Object message = assignParameter(args, 3, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        Object ignoreCase = assignParameter(args, 4, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        Object checkForObjectIdentity = assignParameter(args, 5, null);
        if (ZVal.isNull(checkForObjectIdentity)) {
            checkForObjectIdentity = true;
        }
        Object checkForNonObjectIdentity = assignParameter(args, 6, null);
        if (ZVal.isNull(checkForNonObjectIdentity)) {
            checkForNonObjectIdentity = false;
        }
        Assert.runtimeStaticObject.assertAttributeContains(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                NamespaceGlobal.func_get_args.env(env).call().value())));
        return null;
    }
}
