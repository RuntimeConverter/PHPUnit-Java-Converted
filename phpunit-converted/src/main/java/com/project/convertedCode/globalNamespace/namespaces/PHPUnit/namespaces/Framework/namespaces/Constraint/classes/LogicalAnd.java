package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/LogicalAnd.php

*/

public class LogicalAnd extends Constraint {

    public Object constraints = ZVal.newArray();

    public LogicalAnd(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogicalAnd.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constraints", typeHint = "array")
    public Object setConstraints(RuntimeEnv env, Object... args) {
        Object constraints = assignParameter(args, 0, null);
        Object constraint = null;
        toObjectR(this).accessProp(this, env).name("constraints").set(ZVal.newArray());
        for (ZPair zpairResult250 : ZVal.getIterable(constraints, env, true)) {
            constraint = ZVal.assign(zpairResult250.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            constraint,
                            Constraint.class,
                            "PHPUnit\\Framework\\Constraint\\Constraint"))) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                "All parameters to "
                                        + toStringR("LogicalAnd", env)
                                        + " must be a constraint object."));
            }

            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("constraints").value(), constraint);
        }

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
        Object success = null;
        Object constraint = null;
        success = true;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult251 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("constraints").value(),
                        env,
                        true)) {
            constraint = ZVal.assign(zpairResult251.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            constraint, "evaluate", LogicalAnd.class, other, description, true))) {
                success = false;
                break;
            }
        }

        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(success);
        }

        if (!ZVal.isTrue(success)) {
            env.callMethod(this, "fail", LogicalAnd.class, other, description);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object constraint = null;
        Object text = null;
        Object key = null;
        text = "";
        for (ZPair zpairResult252 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("constraints").value(),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult252.getKey());
            constraint = ZVal.assign(zpairResult252.getValue());
            if (ZVal.isGreaterThan(key, '>', 0)) {
                text = toStringR(text, env) + " and ";
            }

            text =
                    toStringR(text, env)
                            + toStringR(
                                    env.callMethod(constraint, "toString", LogicalAnd.class), env);
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        Object count = null;
        Object constraint = null;
        count = 0;
        for (ZPair zpairResult253 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("constraints").value(),
                        env,
                        true)) {
            constraint = ZVal.assign(zpairResult253.getValue());
            count = ZAssignment.add("+=", count, CRArrayF.count.env(env).call(constraint).value());
        }

        return ZVal.assign(count);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\LogicalAnd";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "constraints",
            typeHint = "PHPUnit\\Framework\\Constraint\\Constraint"
        )
        public Object fromConstraints(RuntimeEnv env, Object... args) {
            Object constraints = assignParameter(args, 0, null);
            Object constraint = null;
            constraint =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .namespaces
                            .Constraint
                            .classes
                            .LogicalAnd(env);
            toObjectR(constraint)
                    .accessProp(this, env)
                    .name("constraints")
                    .set(CRArrayF.array_values.env(env).call(constraints).value());
            return ZVal.assign(constraint);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\LogicalAnd")
                    .setLookup(LogicalAnd.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("constraints", "exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/LogicalAnd.php")
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
