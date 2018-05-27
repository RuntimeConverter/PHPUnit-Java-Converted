package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Assert/Functions.php

*/

public class logicalXor extends FunctionBaseRegular {

    public static logicalXor f = new logicalXor();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                Assert.runtimeStaticObject.logicalXor(
                        env,
                        PackedVaradicArgs.unpack(
                                new PackedVaradicArgs(
                                        NamespaceGlobal.func_get_args.env(env).call().value()))));
    }
}
