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

public class contains extends FunctionBaseRegular {

    public static contains f = new contains();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "checkForObjectIdentity",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "checkForNonObjectIdentity",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object checkForObjectIdentity = assignParameter(args, 1, null);
        if (ZVal.isNull(checkForObjectIdentity)) {
            checkForObjectIdentity = true;
        }
        Object checkForNonObjectIdentity = assignParameter(args, 2, null);
        if (ZVal.isNull(checkForNonObjectIdentity)) {
            checkForNonObjectIdentity = false;
        }
        return ZVal.assign(
                Assert.runtimeStaticObject.contains(
                        env,
                        PackedVaradicArgs.unpack(
                                new PackedVaradicArgs(
                                        NamespaceGlobal.func_get_args.env(env).call().value()))));
    }
}
