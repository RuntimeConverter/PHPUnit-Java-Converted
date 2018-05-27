package com.project.convertedCode.globalNamespace.classes;

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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.File_Iterator_Factory;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-file-iterator/src/Facade.php

*/

public class File_Iterator_Facade extends RuntimeClassBase {

    public File_Iterator_Facade(RuntimeEnv env, Object... args) {
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
    @ConvertedParameter(
        index = 4,
        name = "commonPath",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getFilesAsArray(RuntimeEnv env, Object... args) {
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
        Object commonPath = assignParameter(args, 4, null);
        if (ZVal.isNull(commonPath)) {
            commonPath = false;
        }
        Object factory = null;
        Object path = null;
        Object iterator = null;
        Object file = null;
        Object files = ZVal.newArray();
        if (function_is_string.f.env(env).call(paths).getBool()) {
            paths = ZVal.newArray(new ZPair(0, paths));
        }

        factory = new File_Iterator_Factory(env);
        iterator =
                env.callMethod(
                        factory,
                        "getFileIterator",
                        File_Iterator_Facade.class,
                        paths,
                        suffixes,
                        prefixes,
                        exclude);
        files = ZVal.newArray();
        for (ZPair zpairResult209 : ZVal.getIterable(iterator, env, true)) {
            file = ZVal.assign(zpairResult209.getValue());
            file = env.callMethod(file, "getRealPath", File_Iterator_Facade.class);
            if (ZVal.isTrue(file)) {
                ZVal.addToArray(files, file);
            }
        }

        for (ZPair zpairResult210 : ZVal.getIterable(paths, env, true)) {
            path = ZVal.assign(zpairResult210.getValue());
            if (NamespaceGlobal.is_file.env(env).call(path).getBool()) {
                ZVal.addToArray(files, NamespaceGlobal.realpath.env(env).call(path).value());
            }
        }

        files = CRArrayF.array_unique.env(env).call(files).value();
        CRArrayF.sort.env(env).call(files);
        if (ZVal.isTrue(commonPath)) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "commonPath",
                                    env.callMethod(
                                            this,
                                            "getCommonPath",
                                            File_Iterator_Facade.class,
                                            files)),
                            new ZPair("files", files)));

        } else {
            return ZVal.assign(files);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    protected Object getCommonPath(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object files = assignParameter(args, 0, null);
        if (ZVal.isNull(files)) {
            files = ZVal.newArray();
        }
        Object _files = ZVal.newArray();
        Object file = null;
        Object common = null;
        Object _fileParts = ZVal.newArray();
        Object count = null;
        Object i = null;
        Object j = null;
        Object done = null;
        count = CRArrayF.count.env(env).call(files).value();
        if (ZVal.equalityCheck(count, 0)) {
            return "";
        }

        if (ZVal.equalityCheck(count, 1)) {
            return ZVal.assign(
                    toStringR(
                                    NamespaceGlobal.dirname
                                            .env(env)
                                            .call(ZVal.getElement(files, 0))
                                            .value(),
                                    env)
                            + toStringR("/", env));
        }

        _files = ZVal.newArray();
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult211 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult211.getValue());
            ZVal.addToArray(
                    _files, _fileParts = NamespaceGlobal.explode.env(env).call("/", file).value());
            if (ZVal.isEmpty(ZVal.getElement(_fileParts, 0))) {
                ZVal.putArrayElement(_fileParts, 0, "/");
            }
        }

        common = "";
        done = false;
        j = 0;
        count = ZVal.decrement(count);
        runtimeConverterBreakCount = 0;
        while (!ZVal.isTrue(done)) {
            runtimeConverterBreakCount = 0;
            for (i = 0; ZVal.isLessThan(i, '<', count); i = ZVal.increment(i)) {
                if (ZVal.notEqualityCheck(
                        ZVal.getElementRecursive(_files, i, j),
                        ZVal.getElementRecursive(_files, ZVal.add(i, 1), j))) {
                    done = true;
                    break;
                }
            }

            if (!ZVal.isTrue(done)) {
                common =
                        toStringR(common, env)
                                + toStringR(ZVal.getElementRecursive(_files, 0, j), env);
                if (ZVal.isGreaterThan(j, '>', 0)) {
                    common = toStringR(common, env) + toStringR("/", env);
                }
            }

            j = ZVal.increment(j);
        }

        return ZVal.assign(toStringR("/", env) + toStringR(common, env));
    }

    public static final Object CONST_class = "File_Iterator_Facade";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("File_Iterator_Facade")
                    .setLookup(File_Iterator_Facade.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-file-iterator/src/Facade.php")
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
