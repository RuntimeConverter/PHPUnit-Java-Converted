package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token/Stream/CachingFactory.php

*/

public class PHP_Token_Stream_CachingFactory extends RuntimeClassBase {

    public PHP_Token_Stream_CachingFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHP_Token_Stream_CachingFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename")
        public Object get(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, null);
            if (!ZVal.isset(
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .PHP_Token_Stream_CachingFactory
                                                    .RequestStaticProperties
                                                    .class)
                                    .cache,
                            filename))) {
                ZVal.putArrayElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .PHP_Token_Stream_CachingFactory
                                                .RequestStaticProperties
                                                .class)
                                .cache,
                        filename,
                        new PHP_Token_Stream(env, filename));
            }

            return ZVal.assign(
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .PHP_Token_Stream_CachingFactory
                                                    .RequestStaticProperties
                                                    .class)
                                    .cache,
                            filename));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "filename",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object clear(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, null);
            if (ZVal.isNull(filename)) {
                filename = ZVal.getNull();
            }
            if (function_is_string.f.env(env).call(filename).getBool()) {
                ZVal.unsetArrayElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .PHP_Token_Stream_CachingFactory
                                                .RequestStaticProperties
                                                .class)
                                .cache,
                        filename);

            } else {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .PHP_Token_Stream_CachingFactory
                                                .RequestStaticProperties
                                                .class)
                                .cache =
                        ZVal.newArray();
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cache = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_Stream_CachingFactory")
                    .setLookup(
                            PHP_Token_Stream_CachingFactory.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/php-token-stream/src/Token/Stream/CachingFactory.php")
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
