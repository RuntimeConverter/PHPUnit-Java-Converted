package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.RegularExpression;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/ExceptionMessageRegularExpression.php

*/

public class ExceptionMessageRegularExpression extends Constraint {

    public Object expectedMessageRegExp = null;

    public ExceptionMessageRegularExpression(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionMessageRegularExpression.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, null);
        super.__construct(env);
        toObjectR(this).accessProp(this, env).name("expectedMessageRegExp").set(expected);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "exception message matches ";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object match = null;
        match =
                RegularExpression.runtimeStaticObject.safeMatch(
                        env,
                        toObjectR(this).accessProp(this, env).name("expectedMessageRegExp").value(),
                        env.callMethod(
                                other, "getMessage", ExceptionMessageRegularExpression.class));
        if (ZVal.strictEqualityCheck(match, "===", false)) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            "Invalid expected exception message regex given: '"
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("expectedMessageRegExp")
                                                    .value(),
                                            env)
                                    + "'"));
        }

        return ZVal.assign(ZVal.strictEqualityCheck(match, "===", 1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "exception message '%s' matches '%s'",
                                env.callMethod(
                                        other,
                                        "getMessage",
                                        ExceptionMessageRegularExpression.class),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("expectedMessageRegExp")
                                        .value())
                        .value());
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\Constraint\\ExceptionMessageRegularExpression";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\ExceptionMessageRegularExpression")
                    .setLookup(
                            ExceptionMessageRegularExpression.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("expectedMessageRegExp", "exporter")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/ExceptionMessageRegularExpression.php")
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
