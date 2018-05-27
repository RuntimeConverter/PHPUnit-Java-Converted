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

public class assertContains extends FunctionBaseRegular {

    public static assertContains f = new assertContains();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "needle")
    @ConvertedParameter(index = 1, name = "haystack")
    @ConvertedParameter(index = 2, name = "message", typeHint = "string")
    @ConvertedParameter(
        index = 3,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "checkForObjectIdentity",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "checkForNonObjectIdentity",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object needle = assignParameter(args, 0, null);
        Object haystack = assignParameter(args, 1, null);
        Object message = assignParameter(args, 2, null);
        if (ZVal.isNull(message)) {
            message = "";
        }
        Object ignoreCase = assignParameter(args, 3, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        Object checkForObjectIdentity = assignParameter(args, 4, null);
        if (ZVal.isNull(checkForObjectIdentity)) {
            checkForObjectIdentity = true;
        }
        Object checkForNonObjectIdentity = assignParameter(args, 5, null);
        if (ZVal.isNull(checkForNonObjectIdentity)) {
            checkForNonObjectIdentity = false;
        }
        Assert.runtimeStaticObject.assertContains(
                env,
                PackedVaradicArgs.unpack(
                        new PackedVaradicArgs(
                                NamespaceGlobal.func_get_args.env(env).call().value())));
        return null;
    }
}
