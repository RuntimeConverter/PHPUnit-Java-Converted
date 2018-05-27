package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.ResultPrinter;
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

 vendor/phpunit/phpunit/src/Util/TestDox/TextResultPrinter.php

*/

public class TextResultPrinter extends ResultPrinter {

    public TextResultPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TextResultPrinter.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    protected Object startClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(
                this,
                "write",
                TextResultPrinter.class,
                toStringR(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("currentTestClassPrettified")
                                        .value(),
                                env)
                        + "\n");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "success",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object onTest(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object success = assignParameter(args, 1, null);
        if (ZVal.isNull(success)) {
            success = true;
        }
        if (ZVal.isTrue(success)) {
            env.callMethod(this, "write", TextResultPrinter.class, " [x] ");

        } else {
            env.callMethod(this, "write", TextResultPrinter.class, " [ ] ");
        }

        env.callMethod(this, "write", TextResultPrinter.class, toStringR(name, env) + "\n");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    protected Object endClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        env.callMethod(this, "write", TextResultPrinter.class, "\n");
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\TextResultPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ResultPrinter.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\TextResultPrinter")
                    .setLookup(TextResultPrinter.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "autoFlush",
                            "currentTestClassPrettified",
                            "currentTestMethodPrettified",
                            "excludeGroups",
                            "failed",
                            "groups",
                            "incomplete",
                            "out",
                            "outTarget",
                            "prettifier",
                            "risky",
                            "skipped",
                            "successful",
                            "testClass",
                            "testStatus",
                            "tests",
                            "warned")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/TextResultPrinter.php")
                    .addInterface("TestListener")
                    .addExtendsClass("PHPUnit\\Util\\TestDox\\ResultPrinter")
                    .addExtendsClass("PHPUnit\\Util\\Printer")
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
