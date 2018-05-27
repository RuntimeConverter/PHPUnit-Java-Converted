package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/ExceptionWrapper.php

*/

public class ExceptionWrapper extends Exception {

    public Object className = null;

    public Object previous = null;

    public ExceptionWrapper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionWrapper.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object t = assignParameter(args, 0, null);
        super.__construct(
                env,
                env.callMethod(t, "getMessage", ExceptionWrapper.class),
                ZVal.toLong(env.callMethod(t, "getCode", ExceptionWrapper.class)));
        env.callMethod(this, "setOriginalException", ExceptionWrapper.class, t);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object trace = null;
        Object string = null;
        string = TestFailure.runtimeStaticObject.exceptionToString(env, this);
        if (ZVal.isTrue(trace = Filter.runtimeStaticObject.getFilteredStacktrace(env, this))) {
            string = toStringR(string, env) + "\n" + toStringR(trace, env);
        }

        if (toObjectR(this).accessProp(this, env).name("previous").getBool()) {
            string =
                    toStringR(string, env)
                            + "\nCaused by\n"
                            + toStringR(
                                    toObjectR(this).accessProp(this, env).name("previous").value(),
                                    env);
        }

        return ZVal.assign(string);
    }

    @ConvertedMethod
    public Object getClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("className").value());
    }

    @ConvertedMethod
    public Object getPreviousWrapped(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("previous").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    public Object setClassName(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("className").set(className);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
    public Object setOriginalException(RuntimeEnv env, Object... args) {
        Object t = assignParameter(args, 0, null);
        Object call = null;
        Object i = null;
        env.callMethod(this, "originalException", ExceptionWrapper.class, t);
        toObjectR(this)
                .accessProp(this, env)
                .name("className")
                .set(function_get_class.f.env(env).call(t).value());
        toObjectR(this)
                .accessProp(this, env)
                .name("file")
                .set(env.callMethod(t, "getFile", ExceptionWrapper.class));
        toObjectR(this)
                .accessProp(this, env)
                .name("line")
                .set(env.callMethod(t, "getLine", ExceptionWrapper.class));
        toObjectR(this)
                .accessProp(this, env)
                .name("serializableTrace")
                .set(env.callMethod(t, "getTrace", ExceptionWrapper.class));
        for (ZPair zpairResult268 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("serializableTrace").value(),
                        env,
                        false)) {
            i = ZVal.assign(zpairResult268.getKey());
            call = ZVal.assign(zpairResult268.getValue());
            ZVal.unsetElementRecursive(
                    toObjectR(this).accessProp(this, env).name("serializableTrace").value(),
                    i,
                    "args");
        }

        if (ZVal.isTrue(env.callMethod(t, "getPrevious", ExceptionWrapper.class))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("previous")
                    .set(
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .classes
                                    .ExceptionWrapper(
                                    env, env.callMethod(t, "getPrevious", ExceptionWrapper.class)));
        }

        return null;
    }

    @ConvertedMethod
    public Object getOriginalException(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "originalException", ExceptionWrapper.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exceptionToStore",
        typeHint = "Throwable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object originalException(RuntimeEnv env, Object... args) {
        Object exceptionToStore = assignParameter(args, 0, null);
        if (ZVal.isNull(exceptionToStore)) {
            exceptionToStore = ZVal.getNull();
        }
        Object instanceId = null;
        ReferenceContainer originalExceptions = new BasicReferenceContainer(ZVal.newArray());
        originalExceptions = env.getInlineStatic(2, null);
        instanceId = NamespaceGlobal.spl_object_hash.env(env).call(this).value();
        if (ZVal.isTrue(exceptionToStore)) {
            ZVal.putArrayElement(originalExceptions.getObject(), instanceId, exceptionToStore);
        }

        return ZVal.assign(
                ZVal.isTrue(ZVal.getElement(originalExceptions.getObject(), instanceId))
                        ? ZVal.getElement(originalExceptions.getObject(), instanceId)
                        : ZVal.getNull());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\ExceptionWrapper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Exception.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\ExceptionWrapper")
                    .setLookup(ExceptionWrapper.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("className", "previous", "serializableTrace")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/ExceptionWrapper.php")
                    .addInterface("Exception")
                    .addInterface("Throwable")
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
