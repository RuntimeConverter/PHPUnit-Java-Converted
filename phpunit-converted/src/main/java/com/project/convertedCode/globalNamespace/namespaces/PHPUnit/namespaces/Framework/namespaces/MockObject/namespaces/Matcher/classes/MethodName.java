package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.StatelessInvocation;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.InvalidArgumentHelper;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit-mock-objects/src/Matcher/MethodName.php

*/

public class MethodName extends StatelessInvocation {

    public Object constraint = null;

    public MethodName(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodName.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constraint")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object constraint = assignParameter(args, 0, null);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        constraint,
                        Constraint.class,
                        "PHPUnit\\Framework\\Constraint\\Constraint"))) {
            if (!function_is_string.f.env(env).call(constraint).getBool()) {
                throw ZVal.getException(
                        env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
            }

            constraint = new IsEqual(env, constraint, 0, 10, false, true);
        }

        toObjectR(this).accessProp(this, env).name("constraint").set(constraint);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "method name "
                        + toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("constraint")
                                                .value(),
                                        "toString",
                                        MethodName.class),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, null);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("constraint").value(),
                        "evaluate",
                        MethodName.class,
                        env.callMethod(invocation, "getMethodName", MethodName.class),
                        "",
                        true));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Matcher\\MethodName";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StatelessInvocation.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\MethodName")
                    .setLookup(MethodName.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("constraint")
                    .setFilename("vendor/phpunit/phpunit-mock-objects/src/Matcher/MethodName.php")
                    .addInterface("Invocation")
                    .addInterface("SelfDescribing")
                    .addInterface("Verifiable")
                    .addExtendsClass("PHPUnit\\Framework\\MockObject\\Matcher\\StatelessInvocation")
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
