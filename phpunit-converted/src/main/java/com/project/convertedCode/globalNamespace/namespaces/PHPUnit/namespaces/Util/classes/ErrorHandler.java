package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Warning;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Notice;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Deprecated;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/ErrorHandler.php

*/

public final class ErrorHandler extends RuntimeClassBase {

    public ErrorHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\ErrorHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        public Object getErrorStack(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Util
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class)
                            .errorStack);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "errorNumber", typeHint = "int")
        @ConvertedParameter(index = 1, name = "errorString", typeHint = "string")
        @ConvertedParameter(index = 2, name = "errorFile", typeHint = "string")
        @ConvertedParameter(index = 3, name = "errorLine", typeHint = "int")
        public Object handleError(RuntimeEnv env, Object... args) {
            Object errorNumber = assignParameter(args, 0, null);
            Object errorString = assignParameter(args, 1, null);
            Object errorFile = assignParameter(args, 2, null);
            Object errorLine = assignParameter(args, 3, null);
            Object exception = null;
            Object trace = null;
            Object frame = ZVal.newArray();
            if (!ZVal.isTrue(
                    ZVal.toLong(errorNumber)
                            & ZVal.toLong(
                                    NamespaceGlobal.error_reporting.env(env).call().value()))) {
                return ZVal.assign(false);
            }

            ZVal.addToArray(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Util
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class)
                            .errorStack,
                    ZVal.newArray(
                            new ZPair(0, errorNumber),
                            new ZPair(1, errorString),
                            new ZPair(2, errorFile),
                            new ZPair(3, errorLine)));
            trace = NamespaceGlobal.debug_backtrace.env(env).call().value();
            CRArrayF.array_shift.env(env).call(trace);
            for (ZPair zpairResult379 : ZVal.getIterable(trace, env, true)) {
                frame = ZVal.assign(zpairResult379.getValue());
                if (ZVal.strictEqualityCheck(
                        ZVal.getElement(frame, "function"), "===", "__toString")) {
                    return ZVal.assign(false);
                }
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 8))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(errorNumber, "===", 1024)))
                    || ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 2048))) {
                if (ZVal.strictNotEqualityCheck(
                        env.getRequestStaticProperties(Notice.RequestStaticProperties.class)
                                .enabled,
                        "!==",
                        true)) {
                    return ZVal.assign(false);
                }

                exception = ZVal.assign(Notice.CONST_class);

            } else if (ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 2))
                    || ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 512))) {
                if (ZVal.strictNotEqualityCheck(
                        env.getRequestStaticProperties(Warning.RequestStaticProperties.class)
                                .enabled,
                        "!==",
                        true)) {
                    return ZVal.assign(false);
                }

                exception = ZVal.assign(Warning.CONST_class);

            } else if (ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 8192))
                    || ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 16384))) {
                if (ZVal.strictNotEqualityCheck(
                        env.getRequestStaticProperties(Deprecated.RequestStaticProperties.class)
                                .enabled,
                        "!==",
                        true)) {
                    return ZVal.assign(false);
                }

                exception = ZVal.assign(Deprecated.CONST_class);

            } else {
                exception = ZVal.assign(Error.CONST_class);
            }

            throw ZVal.getException(
                    env, env.createNew(exception, errorString, errorNumber, errorFile, errorLine));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "severity")
        public Object handleErrorOnce(RuntimeEnv env, Object... args) {
            Object severity = assignParameter(args, 0, null);
            if (ZVal.isNull(severity)) {
                severity = 2;
            }
            Object terminator = null;
            terminator =
                    new Closure(env) {
                        @Override
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            ReferenceContainer expired = new BasicReferenceContainer(null);
                            expired = env.getInlineStatic(4, false);
                            if (!ZVal.isTrue(expired.getObject())) {
                                expired.setObject(true);
                                return ZVal.assign(
                                        NamespaceGlobal.restore_error_handler
                                                .env(env)
                                                .call()
                                                .value());
                            }

                            return null;
                        }
                    };
            function_set_error_handler
                    .f
                    .env(env)
                    .call(
                            new Closure(env) {
                                @Override
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object errorNumber = assignParameter(args, 0, null);
                                    Object errorString = assignParameter(args, 1, null);
                                    Object severity = null;
                                    severity = this.contextReferences.getCapturedValue("severity");
                                    if (ZVal.strictEqualityCheck(errorNumber, "===", severity)) {
                                        return null;
                                    }

                                    return ZVal.assign(false);
                                }
                            }.use("severity", severity));
            return ZVal.assign(terminator);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object errorStack = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\ErrorHandler")
                    .setLookup(ErrorHandler.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/ErrorHandler.php")
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
