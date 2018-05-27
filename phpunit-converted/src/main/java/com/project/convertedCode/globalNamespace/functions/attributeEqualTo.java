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

public class attributeEqualTo extends FunctionBaseRegular {

    public static attributeEqualTo f = new attributeEqualTo();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "delta",
        typeHint = "float",
        defaultValue = "0.0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "maxDepth",
        typeHint = "int",
        defaultValue = "10",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 4,
        name = "canonicalize",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object attributeName = assignParameter(args, 0, null);
        Object value = assignParameter(args, 1, null);
        Object delta = assignParameter(args, 2, null);
        if (ZVal.isNull(delta)) {
            delta = 0.0;
        }
        Object maxDepth = assignParameter(args, 3, null);
        if (ZVal.isNull(maxDepth)) {
            maxDepth = 10;
        }
        Object canonicalize = assignParameter(args, 4, null);
        if (ZVal.isNull(canonicalize)) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 5, null);
        if (ZVal.isNull(ignoreCase)) {
            ignoreCase = false;
        }
        return ZVal.assign(
                Assert.runtimeStaticObject.attributeEqualTo(
                        env,
                        PackedVaradicArgs.unpack(
                                new PackedVaradicArgs(
                                        NamespaceGlobal.func_get_args.env(env).call().value()))));
    }
}
