package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
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
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilterIterator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-file-iterator/src/Iterator.php

*/

public class File_Iterator extends FilterIterator {

    public Object suffixes = ZVal.newArray();

    public Object prefixes = ZVal.newArray();

    public Object exclude = ZVal.newArray();

    public Object basepath = null;

    public File_Iterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File_Iterator.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "Iterator")
    @ConvertedParameter(
        index = 1,
        name = "suffixes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "prefixes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "exclude",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "basepath",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, null);
        Object suffixes = assignParameter(args, 1, null);
        if (ZVal.isNull(suffixes)) {
            suffixes = ZVal.newArray();
        }
        Object prefixes = assignParameter(args, 2, null);
        if (ZVal.isNull(prefixes)) {
            prefixes = ZVal.newArray();
        }
        Object exclude = assignParameter(args, 3, null);
        if (ZVal.isNull(exclude)) {
            exclude = ZVal.newArray();
        }
        Object basepath = assignParameter(args, 4, null);
        if (ZVal.isNull(basepath)) {
            basepath = ZVal.getNull();
        }
        ReferenceContainer _exclude = new BasicReferenceContainer(null);
        exclude =
                CRArrayF.array_filter
                        .env(env)
                        .call(CRArrayF.array_map.env(env).call("realpath", exclude).value())
                        .value();
        if (ZVal.strictNotEqualityCheck(basepath, "!==", ZVal.getNull())) {
            basepath = NamespaceGlobal.realpath.env(env).call(basepath).value();
        }

        if (ZVal.strictEqualityCheck(basepath, "===", false)) {
            basepath = ZVal.getNull();

        } else {
            for (ZPair zpairResult214 : ZVal.getIterable(exclude, env, true)) {
                _exclude = zpairResult214;
                _exclude.setObject(
                        NamespaceGlobal.str_replace
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call(basepath, "", _exclude.getObject())
                                .value());
            }
        }

        toObjectR(this).accessProp(this, env).name("prefixes").set(prefixes);
        toObjectR(this).accessProp(this, env).name("suffixes").set(suffixes);
        toObjectR(this).accessProp(this, env).name("exclude").set(exclude);
        toObjectR(this).accessProp(this, env).name("basepath").set(basepath);
        super.converterRuntimeCallExtended(env, "__construct", Object.class, null, iterator);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object current = null;
        Object filename = null;
        Object realpath = null;
        current =
                env.callMethod(
                        env.callMethod(this, "getInnerIterator", File_Iterator.class),
                        "current",
                        File_Iterator.class);
        filename = env.callMethod(current, "getFilename", File_Iterator.class);
        realpath = env.callMethod(current, "getRealPath", File_Iterator.class);
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("basepath").value(),
                "!==",
                ZVal.getNull())) {
            realpath =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    toObjectR(this).accessProp(this, env).name("basepath").value(),
                                    "",
                                    realpath)
                            .value();
        }

        if (NamespaceGlobal.preg_match
                .env(env)
                .addReferneceArgs(new RuntimeArgsWithReferences())
                .call("=/\\.[^/]*/=", realpath)
                .getBool()) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                env.callMethod(
                                                        this,
                                                        "acceptPath",
                                                        File_Iterator.class,
                                                        realpath))
                                        && ZVal.toBool(
                                                env.callMethod(
                                                        this,
                                                        "acceptPrefix",
                                                        File_Iterator.class,
                                                        filename)))
                        && ZVal.toBool(
                                env.callMethod(
                                        this, "acceptSuffix", File_Iterator.class, filename)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object acceptPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, null);
        Object exclude = null;
        for (ZPair zpairResult215 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("exclude").value(), env, true)) {
            exclude = ZVal.assign(zpairResult215.getValue());
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strpos.env(env).call(path, exclude).value(), "===", 0)) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    protected Object acceptPrefix(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "acceptSubString",
                        File_Iterator.class,
                        filename,
                        toObjectR(this).accessProp(this, env).name("prefixes").value(),
                        CONST_PREFIX));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    protected Object acceptSuffix(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, null);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "acceptSubString",
                        File_Iterator.class,
                        filename,
                        toObjectR(this).accessProp(this, env).name("suffixes").value(),
                        CONST_SUFFIX));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    @ConvertedParameter(index = 1, name = "subStrings", typeHint = "array")
    @ConvertedParameter(index = 2, name = "type")
    protected Object acceptSubString(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object filename = assignParameter(args, 0, null);
        Object subStrings = assignParameter(args, 1, null);
        Object type = assignParameter(args, 2, null);
        Object string = null;
        Object matched = null;
        if (ZVal.isEmpty(subStrings)) {
            return ZVal.assign(true);
        }

        matched = false;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult216 : ZVal.getIterable(subStrings, env, true)) {
            string = ZVal.assign(zpairResult216.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.equalityCheck(type, CONST_PREFIX))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    NamespaceGlobal.strpos
                                                            .env(env)
                                                            .call(filename, string)
                                                            .value(),
                                                    "===",
                                                    0)))
                    || ZVal.toBool(
                            ZVal.toBool(ZVal.equalityCheck(type, CONST_SUFFIX))
                                    && ZVal.toBool(
                                            ZVal.equalityCheck(
                                                    NamespaceGlobal.substr
                                                            .env(env)
                                                            .call(
                                                                    filename,
                                                                    ZVal.multiply(
                                                                            -1,
                                                                            NamespaceGlobal.strlen
                                                                                    .env(env)
                                                                                    .call(string)
                                                                                    .value()))
                                                            .value(),
                                                    string)))) {
                matched = true;
                break;
            }
        }

        return ZVal.assign(matched);
    }

    public static final Object CONST_PREFIX = 0;

    public static final Object CONST_SUFFIX = 1;

    public static final Object CONST_class = "File_Iterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FilterIterator.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("File_Iterator")
                    .setLookup(File_Iterator.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("basepath", "exclude", "prefixes", "suffixes")
                    .setFilename("vendor/phpunit/php-file-iterator/src/Iterator.php")
                    .addInterface("OuterIterator")
                    .addInterface("Traversable")
                    .addInterface("Iterator")
                    .addExtendsClass("FilterIterator")
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
