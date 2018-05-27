package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.RegularExpression;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveFilterIterator;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Filter/NameFilterIterator.php

*/

public class NameFilterIterator extends RecursiveFilterIterator {

    public Object filter = null;

    public Object filterMin = null;

    public Object filterMax = null;

    public NameFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NameFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "RecursiveIterator")
    @ConvertedParameter(index = 1, name = "filter", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, null);
        Object filter = assignParameter(args, 1, null);
        super.converterRuntimeCallExtended(env, "__construct", Object.class, null, iterator);
        env.callMethod(this, "setFilter", NameFilterIterator.class, filter);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object set = null;
        Object test = null;
        Object tmp = ZVal.newArray();
        Object name = null;
        Object accepted = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        test =
                env.callMethod(
                        env.callMethod(this, "getInnerIterator", NameFilterIterator.class),
                        "current",
                        NameFilterIterator.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestSuite.class, "PHPUnit\\Framework\\TestSuite"))) {
            return ZVal.assign(true);
        }

        tmp = Test.runtimeStaticObject.describe(env, test);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, WarningTestCase.class, "PHPUnit\\Framework\\WarningTestCase"))) {
            name = env.callMethod(test, "getMessage", NameFilterIterator.class);

        } else {
            if (ZVal.notEqualityCheck(ZVal.getElement(tmp, 0), "")) {
                name = NamespaceGlobal.implode.env(env).call("::", tmp).value();

            } else {
                name = ZVal.assign(ZVal.getElement(tmp, 1));
            }
        }

        accepted =
                NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                toObjectR(this).accessProp(this, env).name("filter").value(),
                                name,
                                matches.getObject())
                        .value();
        if (ZVal.toBool(accepted)
                && ZVal.toBool(
                        ZVal.isset(
                                toObjectR(this).accessProp(this, env).name("filterMax").value()))) {
            set = CRArrayF.end.env(env).call(matches.getObject()).value();
            accepted =
                    ZVal.toBool(
                                    ZVal.isGreaterThanOrEqualTo(
                                            set,
                                            ">=",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("filterMin")
                                                    .value()))
                            && ZVal.toBool(
                                    ZVal.isLessThanOrEqualTo(
                                            set,
                                            "<=",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("filterMax")
                                                    .value()));
        }

        return ZVal.assign(accepted);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "string")
    protected Object setFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, null);
        ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
        if (ZVal.strictEqualityCheck(
                RegularExpression.runtimeStaticObject.safeMatch(env, filter, ""), "===", false)) {
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^(.*?)#(\\d+)(?:-(\\d+))?$/", filter, matches.getObject())
                    .getBool()) {
                if (ZVal.toBool(ZVal.isset(ZVal.getElement(matches.getObject(), 3)))
                        && ZVal.toBool(
                                ZVal.isLessThan(
                                        ZVal.getElement(matches.getObject(), 2),
                                        '<',
                                        ZVal.getElement(matches.getObject(), 3)))) {
                    filter =
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "%s.*with data set #(\\d+)$",
                                            ZVal.getElement(matches.getObject(), 1))
                                    .value();
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("filterMin")
                            .set(ZVal.getElement(matches.getObject(), 2));
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("filterMax")
                            .set(ZVal.getElement(matches.getObject(), 3));

                } else {
                    filter =
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "%s.*with data set #%s$",
                                            ZVal.getElement(matches.getObject(), 1),
                                            ZVal.getElement(matches.getObject(), 2))
                                    .value();
                }

            } else if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^(.*?)@(.+)$/", filter, matches.getObject())
                    .getBool()) {
                filter =
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "%s.*with data set \"%s\"$",
                                        ZVal.getElement(matches.getObject(), 1),
                                        ZVal.getElement(matches.getObject(), 2))
                                .value();
            }

            filter =
                    NamespaceGlobal.sprintf
                            .env(env)
                            .call(
                                    "/%s/",
                                    NamespaceGlobal.str_replace
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call("/", "\\/", filter)
                                            .value())
                            .value();
        }

        toObjectR(this).accessProp(this, env).name("filter").set(filter);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\Filter\\NameFilterIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends RecursiveFilterIterator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\Filter\\NameFilterIterator")
                    .setLookup(NameFilterIterator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("filter", "filterMax", "filterMin")
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Filter/NameFilterIterator.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addInterface("OuterIterator")
                    .addInterface("RecursiveIterator")
                    .addExtendsClass("RecursiveFilterIterator")
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
