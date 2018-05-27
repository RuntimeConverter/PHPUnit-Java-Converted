package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveDirectoryIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.File_Iterator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.AppendIterator;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-file-iterator/src/Factory.php

*/

public class File_Iterator_Factory extends RuntimeClassBase {

    public File_Iterator_Factory(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths")
    @ConvertedParameter(index = 1, name = "suffixes")
    @ConvertedParameter(index = 2, name = "prefixes")
    @ConvertedParameter(
        index = 3,
        name = "exclude",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getFileIterator(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, null);
        Object suffixes = assignParameter(args, 1, null);
        if (ZVal.isNull(suffixes)) {
            suffixes = "";
        }
        Object prefixes = assignParameter(args, 2, null);
        if (ZVal.isNull(prefixes)) {
            prefixes = "";
        }
        Object exclude = assignParameter(args, 3, null);
        if (ZVal.isNull(exclude)) {
            exclude = ZVal.newArray();
        }
        Object path = null;
        Object iterator = null;
        if (function_is_string.f.env(env).call(paths).getBool()) {
            paths = ZVal.newArray(new ZPair(0, paths));
        }

        paths =
                env.callMethod(
                        this,
                        "getPathsAfterResolvingWildcards",
                        File_Iterator_Factory.class,
                        paths);
        exclude =
                env.callMethod(
                        this,
                        "getPathsAfterResolvingWildcards",
                        File_Iterator_Factory.class,
                        exclude);
        if (function_is_string.f.env(env).call(prefixes).getBool()) {
            if (ZVal.notEqualityCheck(prefixes, "")) {
                prefixes = ZVal.newArray(new ZPair(0, prefixes));

            } else {
                prefixes = ZVal.newArray();
            }
        }

        if (function_is_string.f.env(env).call(suffixes).getBool()) {
            if (ZVal.notEqualityCheck(suffixes, "")) {
                suffixes = ZVal.newArray(new ZPair(0, suffixes));

            } else {
                suffixes = ZVal.newArray();
            }
        }

        iterator = new AppendIterator(env);
        for (ZPair zpairResult212 : ZVal.getIterable(paths, env, true)) {
            path = ZVal.assign(zpairResult212.getValue());
            if (NamespaceGlobal.is_dir.env(env).call(path).getBool()) {
                env.callMethod(
                        iterator,
                        "append",
                        File_Iterator_Factory.class,
                        new File_Iterator(
                                env,
                                new RecursiveIteratorIterator(
                                        env, new RecursiveDirectoryIterator(env, path, 512)),
                                suffixes,
                                prefixes,
                                exclude,
                                path));
            }
        }

        return ZVal.assign(iterator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths", typeHint = "array")
    protected Object getPathsAfterResolvingWildcards(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, null);
        Object path = null;
        Object _paths = ZVal.newArray();
        Object locals = null;
        _paths = ZVal.newArray();
        for (ZPair zpairResult213 : ZVal.getIterable(paths, env, true)) {
            path = ZVal.assign(zpairResult213.getValue());
            if (ZVal.isTrue(locals = NamespaceGlobal.glob.env(env).call(path, 8192).value())) {
                _paths =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        _paths,
                                        CRArrayF.array_map
                                                .env(env)
                                                .call("realpath", locals)
                                                .value())
                                .value();

            } else {
                ZVal.addToArray(_paths, NamespaceGlobal.realpath.env(env).call(path).value());
            }
        }

        return ZVal.assign(_paths);
    }

    public static final Object CONST_class = "File_Iterator_Factory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("File_Iterator_Factory")
                    .setLookup(File_Iterator_Factory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-file-iterator/src/Factory.php")
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
