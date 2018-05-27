package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Directory;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/Builder.php

*/

public final class Builder extends RuntimeClassBase {

    public Builder(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    public Object build(RuntimeEnv env, Object... args) {
        Object coverage = assignParameter(args, 0, null);
        Object root = null;
        Object commonPath = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        files.setObject(env.callMethod(coverage, "getData", Builder.class));
        commonPath =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, files),
                        "reducePaths",
                        Builder.class,
                        files.getObject());
        root = new Directory(env, commonPath, ZVal.getNull());
        env.callMethod(
                this,
                "addItems",
                Builder.class,
                root,
                env.callMethod(this, "buildDirectoryStructure", Builder.class, files.getObject()),
                env.callMethod(coverage, "getTests", Builder.class),
                env.callMethod(coverage, "getCacheTokens", Builder.class));
        return ZVal.assign(root);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "root",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\Directory"
    )
    @ConvertedParameter(index = 1, name = "items", typeHint = "array")
    @ConvertedParameter(index = 2, name = "tests", typeHint = "array")
    @ConvertedParameter(index = 3, name = "cacheTokens", typeHint = "bool")
    private Object addItems(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, null);
        Object items = assignParameter(args, 1, null);
        Object tests = assignParameter(args, 2, null);
        Object cacheTokens = assignParameter(args, 3, null);
        Object value = null;
        Object key = null;
        Object child = null;
        for (ZPair zpairResult124 : ZVal.getIterable(items, env, false)) {
            key = ZVal.assign(zpairResult124.getKey());
            value = ZVal.assign(zpairResult124.getValue());
            if (ZVal.equalityCheck(NamespaceGlobal.substr.env(env).call(key, -2).value(), "/f")) {
                key = NamespaceGlobal.substr.env(env).call(key, 0, -2).value();
                if (NamespaceGlobal.file_exists
                        .env(env)
                        .call(
                                toStringR(env.callMethod(root, "getPath", Builder.class), env)
                                        + toStringR("/", env)
                                        + toStringR(key, env))
                        .getBool()) {
                    env.callMethod(root, "addFile", Builder.class, key, value, tests, cacheTokens);
                }

            } else {
                child = env.callMethod(root, "addDirectory", Builder.class, key);
                env.callMethod(this, "addItems", Builder.class, child, value, tests, cacheTokens);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    private Object buildDirectoryStructure(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, null);
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object path = ZVal.newArray();
        ReferenceContainer pointer = new BasicReferenceContainer(ZVal.newArray());
        Object file = null;
        Object max = null;
        Object i = null;
        Object type = null;
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult125 : ZVal.getIterable(files, env, false)) {
            path = ZVal.assign(zpairResult125.getKey());
            file = ZVal.assign(zpairResult125.getValue());
            path = NamespaceGlobal.explode.env(env).call("/", path).value();
            pointer = result;
            max = CRArrayF.count.env(env).call(path).value();
            for (i = 0; ZVal.isLessThan(i, '<', max); i = ZVal.increment(i)) {
                type = "";
                if (ZVal.equalityCheck(i, ZVal.subtract(max, 1))) {
                    type = "/f";
                }

                pointer =
                        new ArrayDimensionReference(
                                pointer.getObject(),
                                toStringR(ZVal.getElement(path, i), env) + toStringR(type, env));
            }

            pointer.setObject(ZVal.assign(file));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    private Object reducePaths(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer files = assignParameterRef(runtimePassByReferenceArgs, args, 0, null);
        if (ZVal.isNull(files)) {
            files.setObject(ZVal.newArray());
        }
        Object original = ZVal.newArray();
        Object max = null;
        Object paths = ZVal.newArray();
        Object commonPath = null;
        Object i = null;
        Object done = null;
        if (ZVal.isEmpty(files.getObject())) {
            return ".";
        }

        commonPath = "";
        paths = CRArrayF.array_keys.env(env).call(files.getObject()).value();
        if (ZVal.strictEqualityCheck(
                CRArrayF.count.env(env).call(files.getObject()).value(), "===", 1)) {
            commonPath =
                    toStringR(
                                    NamespaceGlobal.dirname
                                            .env(env)
                                            .call(ZVal.getElement(paths, 0))
                                            .value(),
                                    env)
                            + "/";
            ZVal.putArrayElement(
                    files.getObject(),
                    NamespaceGlobal.basename.env(env).call(ZVal.getElement(paths, 0)).value(),
                    ZVal.getElement(files.getObject(), ZVal.getElement(paths, 0)));
            ZVal.unsetArrayElement(files.getObject(), ZVal.getElement(paths, 0));
            return ZVal.assign(commonPath);
        }

        max = CRArrayF.count.env(env).call(paths).value();
        runtimeConverterBreakCount = 0;
        for (i = 0; ZVal.isLessThan(i, '<', max); i = ZVal.increment(i)) {
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strpos
                            .env(env)
                            .call(ZVal.getElement(paths, i), "phar://")
                            .value(),
                    "===",
                    0)) {
                ZVal.putArrayElement(
                        paths,
                        i,
                        NamespaceGlobal.substr.env(env).call(ZVal.getElement(paths, i), 7).value());
                ZVal.putArrayElement(
                        paths,
                        i,
                        NamespaceGlobal.str_replace
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call("/", "/", ZVal.getElement(paths, i))
                                .value());
            }

            ZVal.putArrayElement(
                    paths,
                    i,
                    NamespaceGlobal.explode.env(env).call("/", ZVal.getElement(paths, i)).value());
            if (ZVal.isEmpty(ZVal.getElementRecursive(paths, i, 0))) {
                ZVal.setElementRecursive(paths, "/", i, 0);
            }
        }

        done = false;
        max = CRArrayF.count.env(env).call(paths).value();
        runtimeConverterBreakCount = 0;
        while (!ZVal.isTrue(done)) {
            runtimeConverterBreakCount = 0;
            for (i = 0; ZVal.isLessThan(i, '<', ZVal.subtract(max, 1)); i = ZVal.increment(i)) {
                if (ZVal.toBool(
                                ZVal.toBool(!ZVal.isset(ZVal.getElementRecursive(paths, i, 0)))
                                        || ZVal.toBool(
                                                !ZVal.isset(
                                                        ZVal.getElementRecursive(
                                                                paths, ZVal.add(i, 1), 0))))
                        || ZVal.toBool(
                                ZVal.notEqualityCheck(
                                        ZVal.getElementRecursive(paths, i, 0),
                                        ZVal.getElementRecursive(paths, ZVal.add(i, 1), 0)))) {
                    done = true;
                    break;
                }
            }

            if (!ZVal.isTrue(done)) {
                commonPath =
                        toStringR(commonPath, env)
                                + toStringR(ZVal.getElementRecursive(paths, 0, 0), env);
                if (ZVal.notEqualityCheck(ZVal.getElementRecursive(paths, 0, 0), "/")) {
                    commonPath = toStringR(commonPath, env) + toStringR("/", env);
                }

                runtimeConverterBreakCount = 0;
                for (i = 0; ZVal.isLessThan(i, '<', max); i = ZVal.increment(i)) {
                    CRArrayF.array_shift.env(env).call(ZVal.getElement(paths, i));
                }
            }
        }

        original = CRArrayF.array_keys.env(env).call(files.getObject()).value();
        max = CRArrayF.count.env(env).call(original).value();
        runtimeConverterBreakCount = 0;
        for (i = 0; ZVal.isLessThan(i, '<', max); i = ZVal.increment(i)) {
            ZVal.putArrayElement(
                    files.getObject(),
                    NamespaceGlobal.implode.env(env).call("/", ZVal.getElement(paths, i)).value(),
                    ZVal.getElement(files.getObject(), ZVal.getElement(original, i)));
            ZVal.unsetArrayElement(files.getObject(), ZVal.getElement(original, i));
        }

        CRArrayF.ksort.env(env).call(files.getObject());
        return ZVal.assign(NamespaceGlobal.substr.env(env).call(commonPath, 0, -1).value());
    }

    public Object reducePaths(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\Builder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\Builder")
                    .setLookup(Builder.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/Builder.php")
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
