package com.project.convertedCode.globalNamespace.namespaces.Prophecy.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.IdenticalValueToken;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.AnyValuesToken;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ApproximateValueToken;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.AnyValueToken;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ObjectStateToken;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ArrayEntryToken;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.LogicalAndToken;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.StringContainsToken;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.LogicalNotToken;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ExactValueToken;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TypeToken;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ArrayEveryEntryToken;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.CallbackToken;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ArrayCountToken;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument.php

*/

public class Argument extends RuntimeClassBase {

    public Argument(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "Prophecy\\Argument";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object exact(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(new ExactValueToken(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        public Object type(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, null);
            return ZVal.assign(new TypeToken(env, type));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "methodName")
        @ConvertedParameter(index = 1, name = "value")
        public Object which(RuntimeEnv env, Object... args) {
            Object methodName = assignParameter(args, 0, null);
            Object value = assignParameter(args, 1, null);
            return ZVal.assign(new ObjectStateToken(env, methodName, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object that(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, null);
            return ZVal.assign(new CallbackToken(env, callback));
        }

        @ConvertedMethod
        public Object any(RuntimeEnv env, Object... args) {
            return ZVal.assign(new AnyValueToken(env));
        }

        @ConvertedMethod
        public Object cetera(RuntimeEnv env, Object... args) {
            return ZVal.assign(new AnyValuesToken(env));
        }

        @ConvertedMethod
        public Object allOf(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    new LogicalAndToken(
                            env, NamespaceGlobal.func_get_args.env(env).call().value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object size(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(new ArrayCountToken(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        @ConvertedParameter(index = 1, name = "value")
        public Object withEntry(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, null);
            Object value = assignParameter(args, 1, null);
            return ZVal.assign(new ArrayEntryToken(env, key, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object withEveryEntry(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(new ArrayEveryEntryToken(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object containing(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(new ArrayEntryToken(env, runtimeStaticObject.any(env), value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        public Object withKey(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, null);
            return ZVal.assign(new ArrayEntryToken(env, key, runtimeStaticObject.any(env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object not(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(new LogicalNotToken(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object containingString(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(new StringContainsToken(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object is(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            return ZVal.assign(new IdenticalValueToken(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "precision",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object approximate(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, null);
            Object precision = assignParameter(args, 1, null);
            if (ZVal.isNull(precision)) {
                precision = 0;
            }
            return ZVal.assign(new ApproximateValueToken(env, value, precision));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Argument")
                    .setLookup(Argument.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Argument.php")
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
