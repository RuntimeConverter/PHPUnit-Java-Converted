package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalOr;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalAnd;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/LogicalNot.php

*/

public class LogicalNot extends Constraint {

    public Object constraint = null;

    public LogicalNot(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogicalNot.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constraint")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object constraint = assignParameter(args, 0, null);
        super.__construct(env);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        constraint,
                        Constraint.class,
                        "PHPUnit\\Framework\\Constraint\\Constraint"))) {
            constraint = new IsEqual(env, constraint);
        }

        toObjectR(this).accessProp(this, env).name("constraint").set(constraint);
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
        Object success = null;
        success =
                !ZVal.isTrue(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("constraint").value(),
                                "evaluate",
                                LogicalNot.class,
                                other,
                                description,
                                true));
        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(success);
        }

        if (!ZVal.isTrue(success)) {
            env.callMethod(this, "fail", LogicalNot.class, other, description);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        SwitchEnumType14 switchVariable14 =
                ZVal.getEnum(
                        function_get_class
                                .f
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("constraint")
                                                .value())
                                .value(),
                        SwitchEnumType14.DEFAULT_CASE,
                        SwitchEnumType14.DYNAMIC_TYPE_89,
                        LogicalAnd.CONST_class,
                        SwitchEnumType14.DYNAMIC_TYPE_90,
                        CONST_class,
                        SwitchEnumType14.DYNAMIC_TYPE_91,
                        LogicalOr.CONST_class);
        switch (switchVariable14) {
            case DYNAMIC_TYPE_89:
            case DYNAMIC_TYPE_90:
            case DYNAMIC_TYPE_91:
                return ZVal.assign(
                        "not( "
                                + toStringR(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("constraint")
                                                        .value(),
                                                "toString",
                                                LogicalNot.class),
                                        env)
                                + " )");
            case DEFAULT_CASE:
                return ZVal.assign(
                        runtimeStaticObject.negate(
                                env,
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("constraint")
                                                .value(),
                                        "toString",
                                        LogicalNot.class)));
        }
        ;
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("constraint").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        SwitchEnumType15 switchVariable15 =
                ZVal.getEnum(
                        function_get_class
                                .f
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("constraint")
                                                .value())
                                .value(),
                        SwitchEnumType15.DEFAULT_CASE,
                        SwitchEnumType15.DYNAMIC_TYPE_92,
                        LogicalAnd.CONST_class,
                        SwitchEnumType15.DYNAMIC_TYPE_93,
                        CONST_class,
                        SwitchEnumType15.DYNAMIC_TYPE_94,
                        LogicalOr.CONST_class);
        switch (switchVariable15) {
            case DYNAMIC_TYPE_92:
            case DYNAMIC_TYPE_93:
            case DYNAMIC_TYPE_94:
                return ZVal.assign(
                        "not( "
                                + toStringR(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("constraint")
                                                        .value(),
                                                "failureDescription",
                                                LogicalNot.class,
                                                other),
                                        env)
                                + " )");
            case DEFAULT_CASE:
                return ZVal.assign(
                        runtimeStaticObject.negate(
                                env,
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("constraint")
                                                .value(),
                                        "failureDescription",
                                        LogicalNot.class,
                                        other)));
        }
        ;
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\LogicalNot";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string", typeHint = "string")
        public Object negate(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, null);
            Object negatives = null;
            Object positives = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Object negatedString = null;
            Object nonInput = null;
            positives =
                    ZVal.newArray(
                            new ZPair(0, "contains "),
                            new ZPair(1, "exists"),
                            new ZPair(2, "has "),
                            new ZPair(3, "is "),
                            new ZPair(4, "are "),
                            new ZPair(5, "matches "),
                            new ZPair(6, "starts with "),
                            new ZPair(7, "ends with "),
                            new ZPair(8, "reference "),
                            new ZPair(9, "not not "));
            negatives =
                    ZVal.newArray(
                            new ZPair(0, "does not contain "),
                            new ZPair(1, "does not exist"),
                            new ZPair(2, "does not have "),
                            new ZPair(3, "is not "),
                            new ZPair(4, "are not "),
                            new ZPair(5, "does not match "),
                            new ZPair(6, "starts not with "),
                            new ZPair(7, "ends not with "),
                            new ZPair(8, "don't reference "),
                            new ZPair(9, "not "));
            NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/('[\\w\\W]*')([\\w\\W]*)(\"[\\w\\W]*\")/i",
                            string,
                            matches.getObject());
            if (ZVal.isGreaterThan(
                    CRArrayF.count.env(env).call(matches.getObject()).value(), '>', 0)) {
                nonInput = ZVal.assign(ZVal.getElement(matches.getObject(), 2));
                negatedString =
                        NamespaceGlobal.str_replace
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call(
                                        nonInput,
                                        NamespaceGlobal.str_replace
                                                .env(env)
                                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                                .call(positives, negatives, nonInput)
                                                .value(),
                                        string)
                                .value();

            } else {
                negatedString =
                        NamespaceGlobal.str_replace
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call(positives, negatives, string)
                                .value();
            }

            return ZVal.assign(negatedString);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\LogicalNot")
                    .setLookup(LogicalNot.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("constraint", "exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/LogicalNot.php")
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

    private enum SwitchEnumType14 {
        DYNAMIC_TYPE_89,
        DYNAMIC_TYPE_90,
        DYNAMIC_TYPE_91,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType15 {
        DYNAMIC_TYPE_92,
        DYNAMIC_TYPE_93,
        DYNAMIC_TYPE_94,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
