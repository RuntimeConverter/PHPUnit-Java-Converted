package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Getopt.php

*/

public final class Getopt extends RuntimeClassBase {

    public Getopt(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Getopt";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args", typeHint = "array")
        @ConvertedParameter(index = 1, name = "short_options", typeHint = "string")
        @ConvertedParameter(
            index = 2,
            name = "long_options",
            typeHint = "array",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object getopt(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            int runtimeConverterContinueCount;
            ReferenceContainer ___args =
                    new BasicReferenceContainer(assignParameter(args, 0, null));
            if (ZVal.isNull(___args)) {
                ___args.setObject(ZVal.newArray());
            }
            Object short_options = assignParameter(args, 1, null);
            Object long_options = assignParameter(args, 2, null);
            if (ZVal.isNull(long_options)) {
                long_options = ZVal.getNull();
            }
            ReferenceContainer opts = new BasicReferenceContainer(null);
            Object arg = ZVal.newArray();
            Object i = null;
            Object non_opts = ZVal.newArray();
            if (ZVal.isEmpty(___args.getObject())) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, ZVal.newArray()), new ZPair(1, ZVal.newArray())));
            }

            opts.setObject(ZVal.newArray());
            non_opts = ZVal.newArray();
            if (ZVal.isTrue(long_options)) {
                CRArrayF.sort.env(env).call(long_options);
            }

            if (ZVal.toBool(ZVal.isset(ZVal.getElementRecursive(___args.getObject(), 0, 0)))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    ZVal.getElementRecursive(___args.getObject(), 0, 0),
                                    "!==",
                                    "-"))) {
                CRArrayF.array_shift.env(env).call(___args.getObject());
            }

            CRArrayF.reset.env(env).call(___args.getObject());
            ___args.setObject(
                    CRArrayF.array_map.env(env).call("trim", ___args.getObject()).value());
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            while (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    arg = CRArrayF.current.env(env).call(___args.getObject()).value())) {
                i = CRArrayF.key.env(env).call(___args.getObject()).value();
                CRArrayF.next.env(env).call(___args.getObject());
                if (ZVal.strictEqualityCheck(arg, "===", "")) {
                    continue;
                }

                if (ZVal.strictEqualityCheck(arg, "===", "--")) {
                    non_opts =
                            CRArrayF.array_merge
                                    .env(env)
                                    .call(
                                            non_opts,
                                            CRArrayF.array_slice
                                                    .env(env)
                                                    .call(___args.getObject(), ZVal.add(i, 1))
                                                    .value())
                                    .value();
                    break;
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getElement(arg, 0), "!==", "-"))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.isGreaterThan(
                                                                        NamespaceGlobal.strlen
                                                                                .env(env)
                                                                                .call(arg)
                                                                                .value(),
                                                                        '>',
                                                                        1))
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        ZVal.getElement(arg, 1),
                                                                        "===",
                                                                        "-")))
                                        && ZVal.toBool(!ZVal.isTrue(long_options)))) {
                    ZVal.addToArray(non_opts, ZVal.getElement(___args.getObject(), i));
                    continue;
                }

                if (ZVal.toBool(
                                ZVal.isGreaterThan(
                                        NamespaceGlobal.strlen.env(env).call(arg).value(), '>', 1))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(ZVal.getElement(arg, 1), "===", "-"))) {
                    runtimeStaticObject.parseLongOption(
                            env,
                            new RuntimeArgsWithReferences().add(2, opts).add(3, ___args),
                            NamespaceGlobal.substr.env(env).call(arg, 2).value(),
                            long_options,
                            opts.getObject(),
                            ___args.getObject());

                } else {
                    runtimeStaticObject.parseShortOption(
                            env,
                            new RuntimeArgsWithReferences().add(2, opts).add(3, ___args),
                            NamespaceGlobal.substr.env(env).call(arg, 1).value(),
                            short_options,
                            opts.getObject(),
                            ___args.getObject());
                }
            }

            return ZVal.assign(
                    ZVal.newArray(new ZPair(0, opts.getObject()), new ZPair(1, non_opts)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "arg", typeHint = "string")
        @ConvertedParameter(index = 1, name = "short_options", typeHint = "string")
        @ConvertedParameter(index = 2, name = "opts", typeHint = "array")
        @ConvertedParameter(index = 3, name = "args", typeHint = "array")
        private Object parseShortOption(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            int runtimeConverterBreakCount;
            Object arg = assignParameter(args, 0, null);
            if (ZVal.isNull(arg)) {
                arg = ZVal.newArray();
            }
            Object short_options = assignParameter(args, 1, null);
            ReferenceContainer opts = assignParameterRef(runtimePassByReferenceArgs, args, 2, null);
            if (ZVal.isNull(opts)) {
                opts.setObject(ZVal.newArray());
            }
            ReferenceContainer ___args =
                    assignParameterRef(runtimePassByReferenceArgs, args, 3, null);
            Object opt = null;
            Object argLen = null;
            Object i = null;
            Object opt_arg = null;
            Object spec = ZVal.newArray();
            argLen = NamespaceGlobal.strlen.env(env).call(arg).value();
            runtimeConverterBreakCount = 0;
            for (i = 0; ZVal.isLessThan(i, '<', argLen); i = ZVal.increment(i)) {
                opt = ZVal.assign(ZVal.getElement(arg, i));
                opt_arg = ZVal.getNull();
                if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getElement(arg, i), "===", ":"))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        spec =
                                                NamespaceGlobal.strstr
                                                        .env(env)
                                                        .call(short_options, opt)
                                                        .value(),
                                        "===",
                                        false))) {
                    throw ZVal.getException(
                            env,
                            new Exception(env, "unrecognized option -- " + toStringR(opt, env)));
                }

                if (ZVal.toBool(
                                ZVal.isGreaterThan(
                                        NamespaceGlobal.strlen.env(env).call(spec).value(), '>', 1))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(ZVal.getElement(spec, 1), "===", ":"))) {
                    if (ZVal.isLessThan(ZVal.add(i, 1), '<', argLen)) {
                        ZVal.addToArray(
                                opts.getObject(),
                                ZVal.newArray(
                                        new ZPair(0, opt),
                                        new ZPair(
                                                1,
                                                NamespaceGlobal.substr
                                                        .env(env)
                                                        .call(arg, ZVal.add(i, 1))
                                                        .value())));
                        break;
                    }

                    if (!ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            NamespaceGlobal.strlen.env(env).call(spec).value(),
                                            '>',
                                            2))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            ZVal.getElement(spec, 2), "===", ":"))) {
                        if (ZVal.strictEqualityCheck(
                                false,
                                "===",
                                opt_arg =
                                        CRArrayF.current
                                                .env(env)
                                                .call(___args.getObject())
                                                .value())) {
                            throw ZVal.getException(
                                    env,
                                    new Exception(
                                            env,
                                            "option requires an argument -- "
                                                    + toStringR(opt, env)));
                        }

                        CRArrayF.next.env(env).call(___args.getObject());
                    }
                }

                ZVal.addToArray(
                        opts.getObject(), ZVal.newArray(new ZPair(0, opt), new ZPair(1, opt_arg)));
            }

            return null;
        }

        public Object parseShortOption(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "arg", typeHint = "string")
        @ConvertedParameter(index = 1, name = "long_options", typeHint = "array")
        @ConvertedParameter(index = 2, name = "opts", typeHint = "array")
        @ConvertedParameter(index = 3, name = "args", typeHint = "array")
        private Object parseLongOption(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            int runtimeConverterContinueCount;
            Object arg = assignParameter(args, 0, null);
            Object long_options = assignParameter(args, 1, null);
            if (ZVal.isNull(long_options)) {
                long_options = ZVal.newArray();
            }
            ReferenceContainer opts = assignParameterRef(runtimePassByReferenceArgs, args, 2, null);
            if (ZVal.isNull(opts)) {
                opts.setObject(ZVal.newArray());
            }
            ReferenceContainer ___args =
                    assignParameterRef(runtimePassByReferenceArgs, args, 3, null);
            Object count = null;
            Object opt_len = null;
            Object i = null;
            Object opt_arg = null;
            Object list = ZVal.newArray();
            Object full_option = null;
            Object long_opt = null;
            Object opt = ZVal.newArray();
            Object opt_rest = null;
            Object opt_start = null;
            count = CRArrayF.count.env(env).call(long_options).value();
            list = NamespaceGlobal.explode.env(env).call("=", arg).value();
            opt = ZVal.assign(ZVal.getElement(list, 0));
            opt_arg = ZVal.getNull();
            if (ZVal.isGreaterThan(CRArrayF.count.env(env).call(list).value(), '>', 1)) {
                opt_arg = ZVal.assign(ZVal.getElement(list, 1));
            }

            opt_len = NamespaceGlobal.strlen.env(env).call(opt).value();
            runtimeConverterContinueCount = 0;
            for (i = 0; ZVal.isLessThan(i, '<', count); i = ZVal.increment(i)) {
                long_opt = ZVal.assign(ZVal.getElement(long_options, i));
                opt_start = NamespaceGlobal.substr.env(env).call(long_opt, 0, opt_len).value();
                if (ZVal.strictNotEqualityCheck(opt_start, "!==", opt)) {
                    continue;
                }

                opt_rest = NamespaceGlobal.substr.env(env).call(long_opt, opt_len).value();
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictNotEqualityCheck(
                                                                        opt_rest, "!==", ""))
                                                        && ZVal.toBool(
                                                                ZVal.isLessThan(
                                                                        ZVal.add(i, 1),
                                                                        '<',
                                                                        count)))
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        ZVal.getElement(opt, 0), "!==", "=")))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.strpos
                                                .env(env)
                                                .call(
                                                        ZVal.getElement(
                                                                long_options, ZVal.add(i, 1)),
                                                        opt)
                                                .value(),
                                        "===",
                                        0))) {
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env, "option --" + toStringR(opt, env) + " is ambiguous"));
                }

                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.substr.env(env).call(long_opt, -1).value(), "===", "=")) {
                    if (ZVal.strictNotEqualityCheck(
                            NamespaceGlobal.substr.env(env).call(long_opt, -2).value(),
                            "!==",
                            "==")) {
                        if (!NamespaceGlobal.strlen.env(env).call(opt_arg).getBool()) {
                            if (ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    opt_arg =
                                            CRArrayF.current
                                                    .env(env)
                                                    .call(___args.getObject())
                                                    .value())) {
                                throw ZVal.getException(
                                        env,
                                        new Exception(
                                                env,
                                                "option --"
                                                        + toStringR(opt, env)
                                                        + " requires an argument"));
                            }

                            CRArrayF.next.env(env).call(___args.getObject());
                        }
                    }

                } else if (ZVal.isTrue(opt_arg)) {
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    "option --"
                                            + toStringR(opt, env)
                                            + " doesn't allow an argument"));
                }

                full_option =
                        "--"
                                + toStringR(
                                        NamespaceGlobal.preg_replace
                                                .env(env)
                                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                                .call("/={1,2}$/", "", long_opt)
                                                .value(),
                                        env);
                ZVal.addToArray(
                        opts.getObject(),
                        ZVal.newArray(new ZPair(0, full_option), new ZPair(1, opt_arg)));
                return null;
            }

            throw ZVal.getException(
                    env, new Exception(env, "unrecognized option --" + toStringR(opt, env)));
        }

        public Object parseLongOption(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Getopt")
                    .setLookup(Getopt.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Getopt.php")
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
