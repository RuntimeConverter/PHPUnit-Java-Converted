package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Composite;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/Attribute.php

*/

public class Attribute extends Composite {

    public Object attributeName = null;

    public Attribute(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Attribute.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "constraint",
        typeHint = "PHPUnit\\Framework\\Constraint\\Constraint"
    )
    @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object constraint = assignParameter(args, 0, null);
        Object attributeName = assignParameter(args, 1, null);
        super.__construct(env, constraint);
        toObjectR(this).accessProp(this, env).name("attributeName").set(attributeName);
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
        Object other = assignParameter(args, 0, null);
        Object description = assignParameter(args, 1, null);
        if (ZVal.isNull(description)) {
            description = "";
        }
        Object returnResult = assignParameter(args, 2, null);
        if (ZVal.isNull(returnResult)) {
            returnResult = false;
        }
        return ZVal.assign(
                super.evaluate(
                        env,
                        Assert.runtimeStaticObject.readAttribute(
                                env,
                                other,
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("attributeName")
                                        .value()),
                        description,
                        returnResult));
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "attribute \""
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("attributeName").value(),
                                env)
                        + "\" "
                        + toStringR(
                                env.callMethod(
                                        env.callMethod(this, "innerConstraint", Attribute.class),
                                        "toString",
                                        Attribute.class),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(env.callMethod(this, "toString", Attribute.class));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\Attribute";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Composite.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\Attribute")
                    .setLookup(Attribute.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("attributeName", "exporter", "innerConstraint")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/Attribute.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Composite")
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
