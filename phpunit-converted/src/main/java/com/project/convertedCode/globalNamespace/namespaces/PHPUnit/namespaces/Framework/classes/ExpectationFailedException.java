package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/ExpectationFailedException.php

*/

public class ExpectationFailedException extends AssertionFailedError {

    public Object comparisonFailure = null;

    public ExpectationFailedException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExpectationFailedException.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "comparisonFailure",
        typeHint = "SebastianBergmann\\Comparator\\ComparisonFailure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, null);
        Object comparisonFailure = assignParameter(args, 1, null);
        if (ZVal.isNull(comparisonFailure)) {
            comparisonFailure = ZVal.getNull();
        }
        Object previous = assignParameter(args, 2, null);
        if (ZVal.isNull(previous)) {
            previous = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("comparisonFailure").set(comparisonFailure);
        super.__construct(env, message, 0, previous);
        return null;
    }

    @ConvertedMethod
    public Object getComparisonFailure(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("comparisonFailure").value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\ExpectationFailedException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AssertionFailedError.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\ExpectationFailedException")
                    .setLookup(
                            ExpectationFailedException.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("comparisonFailure", "serializableTrace")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/ExpectationFailedException.php")
                    .addInterface("SelfDescribing")
                    .addInterface("Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("PHPUnit\\Framework\\AssertionFailedError")
                    .addExtendsClass("PHPUnit\\Framework\\Exception")
                    .addExtendsClass("RuntimeException")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
