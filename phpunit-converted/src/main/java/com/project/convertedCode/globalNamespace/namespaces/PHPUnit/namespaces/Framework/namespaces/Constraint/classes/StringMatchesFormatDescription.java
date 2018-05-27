package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.RegularExpression;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/StringMatchesFormatDescription.php

*/

public class StringMatchesFormatDescription extends RegularExpression {

    public Object string = null;

    public StringMatchesFormatDescription(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringMatchesFormatDescription.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, null);
        super.__construct(
                env,
                env.callMethod(
                        this,
                        "createPatternFromFormat",
                        StringMatchesFormatDescription.class,
                        env.callMethod(
                                this,
                                "convertNewlines",
                                StringMatchesFormatDescription.class,
                                string)));
        toObjectR(this).accessProp(this, env).name("string").set(string);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return ZVal.assign(
                super.matches(
                        env,
                        env.callMethod(
                                this,
                                "convertNewlines",
                                StringMatchesFormatDescription.class,
                                other)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        return "string matches format description";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object additionalFailureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, null);
        Object line = null;
        Object index = null;
        Object from = ZVal.newArray();
        Object to = ZVal.newArray();
        Object differ = null;
        from =
                NamespaceGlobal.explode
                        .env(env)
                        .call("\n", toObjectR(this).accessProp(this, env).name("string").value())
                        .value();
        to =
                NamespaceGlobal.explode
                        .env(env)
                        .call(
                                "\n",
                                env.callMethod(
                                        this,
                                        "convertNewlines",
                                        StringMatchesFormatDescription.class,
                                        other))
                        .value();
        for (ZPair zpairResult262 : ZVal.getIterable(from, env, false)) {
            index = ZVal.assign(zpairResult262.getKey());
            line = ZVal.assign(zpairResult262.getValue());
            if (ZVal.toBool(ZVal.isset(ZVal.getElement(to, index)))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(line, "!==", ZVal.getElement(to, index)))) {
                line =
                        env.callMethod(
                                this,
                                "createPatternFromFormat",
                                StringMatchesFormatDescription.class,
                                line);
                if (ZVal.isGreaterThan(
                        NamespaceGlobal.preg_match
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call(line, ZVal.getElement(to, index))
                                .value(),
                        '>',
                        0)) {
                    ZVal.putArrayElement(from, index, ZVal.getElement(to, index));
                }
            }
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("string")
                .set(NamespaceGlobal.implode.env(env).call("\n", from).value());
        other = NamespaceGlobal.implode.env(env).call("\n", to).value();
        differ = new Differ(env, "--- Expected\n+++ Actual\n");
        return ZVal.assign(
                env.callMethod(
                        differ,
                        "diff",
                        StringMatchesFormatDescription.class,
                        toObjectR(this).accessProp(this, env).name("string").value(),
                        other));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    private Object createPatternFromFormat(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, null);
        string =
                NamespaceGlobal.preg_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, "/(?<!%)%e/"),
                                        new ZPair(1, "/(?<!%)%s/"),
                                        new ZPair(2, "/(?<!%)%S/"),
                                        new ZPair(3, "/(?<!%)%a/"),
                                        new ZPair(4, "/(?<!%)%A/"),
                                        new ZPair(5, "/(?<!%)%w/"),
                                        new ZPair(6, "/(?<!%)%i/"),
                                        new ZPair(7, "/(?<!%)%d/"),
                                        new ZPair(8, "/(?<!%)%x/"),
                                        new ZPair(9, "/(?<!%)%f/"),
                                        new ZPair(10, "/(?<!%)%c/")),
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                NamespaceGlobal.str_replace
                                                        .env(env)
                                                        .addReferneceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(
                                                                "\\",
                                                                "\\\\",
                                                                "\\" + toStringR("/", env))
                                                        .value()),
                                        new ZPair(1, "[^\\r\\n]+"),
                                        new ZPair(2, "[^\\r\\n]*"),
                                        new ZPair(3, ".+"),
                                        new ZPair(4, ".*"),
                                        new ZPair(5, "\\s*"),
                                        new ZPair(6, "[+-]?\\d+"),
                                        new ZPair(7, "\\d+"),
                                        new ZPair(8, "[0-9a-fA-F]+"),
                                        new ZPair(9, "[+-]?\\.?\\d+\\.?\\d*(?:[Ee][+-]?\\d+)?"),
                                        new ZPair(10, ".")),
                                NamespaceGlobal.preg_quote.env(env).call(string, "/").value())
                        .value();
        string =
                NamespaceGlobal.str_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call("%%", "%", string)
                        .value();
        return ZVal.assign("/^" + toStringR(string, env) + "$/s");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    private Object convertNewlines(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.preg_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call("/\\r\\n/", "\n", text)
                        .value());
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\Constraint\\StringMatchesFormatDescription";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RegularExpression.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\StringMatchesFormatDescription")
                    .setLookup(
                            StringMatchesFormatDescription.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("exporter", "pattern", "string")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/StringMatchesFormatDescription.php")
                    .addInterface("Countable")
                    .addInterface("SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\RegularExpression")
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
