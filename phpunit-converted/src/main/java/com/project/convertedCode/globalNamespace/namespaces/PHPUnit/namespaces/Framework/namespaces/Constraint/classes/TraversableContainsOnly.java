package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsType;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsInstanceOf;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/TraversableContainsOnly.php

*/

public class TraversableContainsOnly extends Constraint {

    public Object constraint = null;

    public Object type = null;

    public TraversableContainsOnly(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraversableContainsOnly.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "isNativeType",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        Object isNativeType = assignParameter(args, 1, null);
        if (ZVal.isNull(isNativeType)) {
            isNativeType = true;
        }
        super.__construct(env);
        if (ZVal.isTrue(isNativeType)) {
            toObjectR(this).accessProp(this, env).name("constraint").set(new IsType(env, type));

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("constraint")
                    .set(new IsInstanceOf(env, type));
        }

        toObjectR(this).accessProp(this, env).name("type").set(type);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    @ConvertedParameter(index = 1, name = "description")
    @ConvertedParameter(
        index = 2,
        name = "returnResult",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object evaluate(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object other = assignParameter(args, 0, null);
        Object description = assignParameter(args, 1, null);
        if (ZVal.isNull(description)) {
            description = "";
        }
        Object returnResult = assignParameter(args, 2, null);
        if (ZVal.isNull(returnResult)) {
            returnResult = false;
        }
        Object item = null;
        Object success = null;
        success = true;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult265 : ZVal.getIterable(other, env, true)) {
            item = ZVal.assign(zpairResult265.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("constraint").value(),
                            "evaluate",
                            TraversableContainsOnly.class,
                            item,
                            "",
                            true))) {
                success = false;
                break;
            }
        }

        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(success);
        }

        if (!ZVal.isTrue(success)) {
            env.callMethod(this, "fail", TraversableContainsOnly.class, other, description);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "contains only values of type \""
                        + toStringR(toObjectR(this).accessProp(this, env).name("type").value(), env)
                        + "\"");
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\Constraint\\TraversableContainsOnly";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\TraversableContainsOnly")
                    .setLookup(
                            TraversableContainsOnly.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("constraint", "exporter", "type")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/TraversableContainsOnly.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
