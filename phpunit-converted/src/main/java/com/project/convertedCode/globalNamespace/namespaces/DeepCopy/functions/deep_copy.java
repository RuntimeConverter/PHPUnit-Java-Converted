package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.functions;

import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.classes.DeepCopy;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/deep_copy.php

*/

public class deep_copy extends FunctionBaseRegular {

    public static deep_copy f = new deep_copy();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "useCloneMethod",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, null);
        Object useCloneMethod = assignParameter(args, 1, null);
        if (ZVal.isNull(useCloneMethod)) {
            useCloneMethod = false;
        }
        return ZVal.assign(
                env.callMethod(new DeepCopy(env, useCloneMethod), "copy", deep_copy.class, value));
    }
}
