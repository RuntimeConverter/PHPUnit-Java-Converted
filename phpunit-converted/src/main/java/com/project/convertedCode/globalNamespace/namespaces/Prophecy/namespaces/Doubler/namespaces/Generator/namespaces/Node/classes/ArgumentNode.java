package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/ArgumentNode.php

*/

public class ArgumentNode extends RuntimeClassBase {

    public Object name = null;

    public Object typeHint = null;

    public Object _pDefault = null;

    public Object optional = false;

    public Object byReference = false;

    public Object isVariadic = false;

    public Object isNullable = false;

    public ArgumentNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgumentNode.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("name").set(name);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getTypeHint(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("typeHint").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "typeHint",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setTypeHint(RuntimeEnv env, Object... args) {
        Object typeHint = assignParameter(args, 0, null);
        if (ZVal.isNull(typeHint)) {
            typeHint = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("typeHint").set(typeHint);
        return null;
    }

    @ConvertedMethod
    public Object hasDefault(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this, "isOptional", ArgumentNode.class))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(this, "isVariadic", ArgumentNode.class))));
    }

    @ConvertedMethod
    public Object getDefault(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("default").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setDefault(RuntimeEnv env, Object... args) {
        Object _pDefault = assignParameter(args, 0, null);
        if (ZVal.isNull(_pDefault)) {
            _pDefault = ZVal.getNull();
        }
        toObjectR(this).accessProp(this, env).name("optional").set(true);
        toObjectR(this).accessProp(this, env).name("default").set(_pDefault);
        return null;
    }

    @ConvertedMethod
    public Object isOptional(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("optional").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "byReference",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setAsPassedByReference(RuntimeEnv env, Object... args) {
        Object byReference = assignParameter(args, 0, null);
        if (ZVal.isNull(byReference)) {
            byReference = true;
        }
        toObjectR(this).accessProp(this, env).name("byReference").set(byReference);
        return null;
    }

    @ConvertedMethod
    public Object isPassedByReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("byReference").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "isVariadic",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setAsVariadic(RuntimeEnv env, Object... args) {
        Object isVariadic = assignParameter(args, 0, null);
        if (ZVal.isNull(isVariadic)) {
            isVariadic = true;
        }
        toObjectR(this).accessProp(this, env).name("isVariadic").set(isVariadic);
        return null;
    }

    @ConvertedMethod
    public Object isVariadic(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("isVariadic").value());
    }

    @ConvertedMethod
    public Object isNullable(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("isNullable").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "isNullable",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setAsNullable(RuntimeEnv env, Object... args) {
        Object isNullable = assignParameter(args, 0, null);
        if (ZVal.isNull(isNullable)) {
            isNullable = true;
        }
        toObjectR(this).accessProp(this, env).name("isNullable").set(isNullable);
        return null;
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\Node\\ArgumentNode";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\Node\\ArgumentNode")
                    .setLookup(ArgumentNode.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "byReference",
                            "default",
                            "isNullable",
                            "isVariadic",
                            "name",
                            "optional",
                            "typeHint")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/ArgumentNode.php")
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
