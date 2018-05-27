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

public class stringContains extends FunctionBaseRegular {

    public static stringContains f = new stringContains();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "case",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, null);
        Object _pCase = assignParameter(args, 1, null);
        if (ZVal.isNull(_pCase)) {
            _pCase = true;
        }
        return ZVal.assign(
                Assert.runtimeStaticObject.stringContains(
                        env,
                        PackedVaradicArgs.unpack(
                                new PackedVaradicArgs(
                                        NamespaceGlobal.func_get_args.env(env).call().value()))));
    }
}
