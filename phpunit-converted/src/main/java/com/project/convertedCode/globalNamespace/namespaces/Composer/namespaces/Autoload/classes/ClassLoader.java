package com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.functions.includeFile;
import com.runtimeconverter.runtime.modules.standard.stream.function_stream_resolve_include_path;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func_array;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/ClassLoader.php

*/

public class ClassLoader extends RuntimeClassBase {

    public Object prefixLengthsPsr4 = ZVal.newArray();

    public Object prefixDirsPsr4 = ZVal.newArray();

    public Object fallbackDirsPsr4 = ZVal.newArray();

    public Object prefixesPsr0 = ZVal.newArray();

    public Object fallbackDirsPsr0 = ZVal.newArray();

    public Object useIncludePath = false;

    public Object classMap = ZVal.newArray();

    public Object classMapAuthoritative = false;

    public Object missingClasses = ZVal.newArray();

    public Object apcuPrefix = null;

    public ClassLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getPrefixes(RuntimeEnv env, Object... args) {
        if (!ZVal.isEmpty(toObjectR(this).accessProp(this, env).name("prefixesPsr0").value())) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .call(
                                    "array_merge",
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("prefixesPsr0")
                                            .value())
                            .value());
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object getPrefixesPsr4(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("prefixDirsPsr4").value());
    }

    @ConvertedMethod
    public Object getFallbackDirs(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("fallbackDirsPsr0").value());
    }

    @ConvertedMethod
    public Object getFallbackDirsPsr4(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("fallbackDirsPsr4").value());
    }

    @ConvertedMethod
    public Object getClassMap(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("classMap").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classMap", typeHint = "array")
    public Object addClassMap(RuntimeEnv env, Object... args) {
        Object classMap = assignParameter(args, 0, null);
        if (toObjectR(this).accessProp(this, env).name("classMap").getBool()) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("classMap")
                    .set(
                            CRArrayF.array_merge
                                    .env(env)
                                    .call(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("classMap")
                                                    .value(),
                                            classMap)
                                    .value());

        } else {
            toObjectR(this).accessProp(this, env).name("classMap").set(classMap);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "paths")
    @ConvertedParameter(
        index = 2,
        name = "prepend",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, null);
        if (ZVal.isNull(prefix)) {
            prefix = ZVal.newArray();
        }
        Object paths = assignParameter(args, 1, null);
        Object prepend = assignParameter(args, 2, null);
        if (ZVal.isNull(prepend)) {
            prepend = false;
        }
        Object first = null;
        if (!ZVal.isTrue(prefix)) {
            if (ZVal.isTrue(prepend)) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("fallbackDirsPsr0")
                        .set(
                                CRArrayF.array_merge
                                        .env(env)
                                        .call(
                                                ZVal.toArray(paths),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("fallbackDirsPsr0")
                                                        .value())
                                        .value());

            } else {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("fallbackDirsPsr0")
                        .set(
                                CRArrayF.array_merge
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("fallbackDirsPsr0")
                                                        .value(),
                                                ZVal.toArray(paths))
                                        .value());
            }

            return null;
        }

        first = ZVal.assign(ZVal.getElement(prefix, 0));
        if (!ZVal.isset(
                ZVal.getElementRecursive(
                        toObjectR(this).accessProp(this, env).name("prefixesPsr0").value(),
                        first,
                        prefix))) {
            ZVal.setElementRecursive(
                    toObjectR(this).accessProp(this, env).name("prefixesPsr0").value(),
                    ZVal.toArray(paths),
                    first,
                    prefix);
            return null;
        }

        if (ZVal.isTrue(prepend)) {
            ZVal.setElementRecursive(
                    toObjectR(this).accessProp(this, env).name("prefixesPsr0").value(),
                    CRArrayF.array_merge
                            .env(env)
                            .call(
                                    ZVal.toArray(paths),
                                    ZVal.getElementRecursive(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("prefixesPsr0")
                                                    .value(),
                                            first,
                                            prefix))
                            .value(),
                    first,
                    prefix);

        } else {
            ZVal.setElementRecursive(
                    toObjectR(this).accessProp(this, env).name("prefixesPsr0").value(),
                    CRArrayF.array_merge
                            .env(env)
                            .call(
                                    ZVal.getElementRecursive(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("prefixesPsr0")
                                                    .value(),
                                            first,
                                            prefix),
                                    ZVal.toArray(paths))
                            .value(),
                    first,
                    prefix);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "paths")
    @ConvertedParameter(
        index = 2,
        name = "prepend",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object addPsr4(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, null);
        if (ZVal.isNull(prefix)) {
            prefix = ZVal.newArray();
        }
        Object paths = assignParameter(args, 1, null);
        Object prepend = assignParameter(args, 2, null);
        if (ZVal.isNull(prepend)) {
            prepend = false;
        }
        Object length = null;
        if (!ZVal.isTrue(prefix)) {
            if (ZVal.isTrue(prepend)) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("fallbackDirsPsr4")
                        .set(
                                CRArrayF.array_merge
                                        .env(env)
                                        .call(
                                                ZVal.toArray(paths),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("fallbackDirsPsr4")
                                                        .value())
                                        .value());

            } else {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("fallbackDirsPsr4")
                        .set(
                                CRArrayF.array_merge
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("fallbackDirsPsr4")
                                                        .value(),
                                                ZVal.toArray(paths))
                                        .value());
            }

        } else if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("prefixDirsPsr4").value(),
                        prefix))) {
            length = NamespaceGlobal.strlen.env(env).call(prefix).value();
            if (ZVal.strictNotEqualityCheck(
                    "\\", "!==", ZVal.getElement(prefix, ZVal.subtract(length, 1)))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "A non-empty PSR-4 prefix must end with a namespace separator."));
            }

            ZVal.setElementRecursive(
                    toObjectR(this).accessProp(this, env).name("prefixLengthsPsr4").value(),
                    length,
                    ZVal.getElement(prefix, 0),
                    prefix);
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("prefixDirsPsr4").value(),
                    prefix,
                    ZVal.toArray(paths));

        } else if (ZVal.isTrue(prepend)) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("prefixDirsPsr4").value(),
                    prefix,
                    CRArrayF.array_merge
                            .env(env)
                            .call(
                                    ZVal.toArray(paths),
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("prefixDirsPsr4")
                                                    .value(),
                                            prefix))
                            .value());

        } else {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("prefixDirsPsr4").value(),
                    prefix,
                    CRArrayF.array_merge
                            .env(env)
                            .call(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("prefixDirsPsr4")
                                                    .value(),
                                            prefix),
                                    ZVal.toArray(paths))
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "paths")
    public Object set(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, null);
        if (ZVal.isNull(prefix)) {
            prefix = ZVal.newArray();
        }
        Object paths = assignParameter(args, 1, null);
        if (!ZVal.isTrue(prefix)) {
            toObjectR(this).accessProp(this, env).name("fallbackDirsPsr0").set(ZVal.toArray(paths));

        } else {
            ZVal.setElementRecursive(
                    toObjectR(this).accessProp(this, env).name("prefixesPsr0").value(),
                    ZVal.toArray(paths),
                    ZVal.getElement(prefix, 0),
                    prefix);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "paths")
    public Object setPsr4(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, null);
        if (ZVal.isNull(prefix)) {
            prefix = ZVal.newArray();
        }
        Object paths = assignParameter(args, 1, null);
        Object length = null;
        if (!ZVal.isTrue(prefix)) {
            toObjectR(this).accessProp(this, env).name("fallbackDirsPsr4").set(ZVal.toArray(paths));

        } else {
            length = NamespaceGlobal.strlen.env(env).call(prefix).value();
            if (ZVal.strictNotEqualityCheck(
                    "\\", "!==", ZVal.getElement(prefix, ZVal.subtract(length, 1)))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "A non-empty PSR-4 prefix must end with a namespace separator."));
            }

            ZVal.setElementRecursive(
                    toObjectR(this).accessProp(this, env).name("prefixLengthsPsr4").value(),
                    length,
                    ZVal.getElement(prefix, 0),
                    prefix);
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("prefixDirsPsr4").value(),
                    prefix,
                    ZVal.toArray(paths));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useIncludePath")
    public Object setUseIncludePath(RuntimeEnv env, Object... args) {
        Object useIncludePath = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("useIncludePath").set(useIncludePath);
        return null;
    }

    @ConvertedMethod
    public Object getUseIncludePath(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("useIncludePath").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classMapAuthoritative")
    public Object setClassMapAuthoritative(RuntimeEnv env, Object... args) {
        Object classMapAuthoritative = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("classMapAuthoritative")
                .set(classMapAuthoritative);
        return null;
    }

    @ConvertedMethod
    public Object isClassMapAuthoritative(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("classMapAuthoritative").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "apcuPrefix")
    public Object setApcuPrefix(RuntimeEnv env, Object... args) {
        Object apcuPrefix = assignParameter(args, 0, null);
        toObjectR(this)
                .accessProp(this, env)
                .name("apcuPrefix")
                .set(
                        ZVal.toBool(
                                                NamespaceGlobal.function_exists
                                                        .env(env)
                                                        .call("apcu_fetch")
                                                        .value())
                                        && ZVal.toBool(
                                                NamespaceGlobal.ini_get
                                                        .env(env)
                                                        .call("apc.enabled")
                                                        .value())
                                ? apcuPrefix
                                : ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    public Object getApcuPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("apcuPrefix").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prepend",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object register(RuntimeEnv env, Object... args) {
        Object prepend = assignParameter(args, 0, null);
        if (ZVal.isNull(prepend)) {
            prepend = false;
        }
        NamespaceGlobal.spl_autoload_register
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "loadClass")), true, prepend);
        return null;
    }

    @ConvertedMethod
    public Object unregister(RuntimeEnv env, Object... args) {
        NamespaceGlobal.spl_autoload_unregister
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "loadClass")));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object loadClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        Object file = null;
        if (ZVal.isTrue(file = env.callMethod(this, "findFile", ClassLoader.class, _pClass))) {
            includeFile.f.env(env).call(file);
            return ZVal.assign(true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object findFile(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        ReferenceContainer hit = new BasicReferenceContainer(null);
        Object file = null;
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("classMap").value(), _pClass))) {
            return ZVal.assign(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("classMap").value(),
                            _pClass));
        }

        if (ZVal.toBool(toObjectR(this).accessProp(this, env).name("classMapAuthoritative").value())
                || ZVal.toBool(
                        ZVal.isset(
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("missingClasses")
                                                .value(),
                                        _pClass)))) {
            return ZVal.assign(false);
        }

        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                toObjectR(this).accessProp(this, env).name("apcuPrefix").value())) {
            file =
                    NamespaceGlobal.apcu_fetch
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences().add(1, hit))
                            .call(
                                    toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("apcuPrefix")
                                                            .value(),
                                                    env)
                                            + toStringR(_pClass, env),
                                    hit.getObject())
                            .value();
            if (ZVal.isTrue(hit.getObject())) {
                return ZVal.assign(file);
            }
        }

        file = env.callMethod(this, "findFileWithExtension", ClassLoader.class, _pClass, ".php");
        if (ZVal.toBool(ZVal.strictEqualityCheck(false, "===", file))
                && ZVal.toBool(function_defined.f.env(env).call("HHVM_VERSION").value())) {
            file = env.callMethod(this, "findFileWithExtension", ClassLoader.class, _pClass, ".hh");
        }

        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                toObjectR(this).accessProp(this, env).name("apcuPrefix").value())) {
            NamespaceGlobal.apcu_add
                    .env(env)
                    .call(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("apcuPrefix")
                                                    .value(),
                                            env)
                                    + toStringR(_pClass, env),
                            file);
        }

        if (ZVal.strictEqualityCheck(false, "===", file)) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("missingClasses").value(),
                    _pClass,
                    true);
        }

        return ZVal.assign(file);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "ext")
    private Object findFileWithExtension(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        if (ZVal.isNull(_pClass)) {
            _pClass = ZVal.newArray();
        }
        Object ext = assignParameter(args, 1, null);
        Object pathEnd = null;
        Object prefix = null;
        Object dirs = null;
        Object logicalPathPsr4 = null;
        Object dir = null;
        Object lastPos = null;
        Object logicalPathPsr0 = null;
        Object search = null;
        Object file = null;
        Object pos = null;
        Object subPath = null;
        Object first = null;
        logicalPathPsr4 =
                toStringR(NamespaceGlobal.strtr.env(env).call(_pClass, "\\", "/").value(), env)
                        + toStringR(ext, env);
        first = ZVal.assign(ZVal.getElement(_pClass, 0));
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("prefixLengthsPsr4").value(),
                        first))) {
            subPath = ZVal.assign(_pClass);
            while (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    lastPos = NamespaceGlobal.strrpos.env(env).call(subPath, "\\").value())) {
                subPath = NamespaceGlobal.substr.env(env).call(subPath, 0, lastPos).value();
                search = toStringR(subPath, env) + "\\";
                if (ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("prefixDirsPsr4")
                                        .value(),
                                search))) {
                    pathEnd =
                            toStringR("/", env)
                                    + toStringR(
                                            NamespaceGlobal.substr
                                                    .env(env)
                                                    .call(logicalPathPsr4, ZVal.add(lastPos, 1))
                                                    .value(),
                                            env);
                    for (ZPair zpairResult3 :
                            ZVal.getIterable(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("prefixDirsPsr4")
                                                    .value(),
                                            search),
                                    env,
                                    true)) {
                        dir = ZVal.assign(zpairResult3.getValue());
                        if (NamespaceGlobal.file_exists
                                .env(env)
                                .call(file = toStringR(dir, env) + toStringR(pathEnd, env))
                                .getBool()) {
                            return ZVal.assign(file);
                        }
                    }
                }
            }
        }

        for (ZPair zpairResult4 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("fallbackDirsPsr4").value(),
                        env,
                        true)) {
            dir = ZVal.assign(zpairResult4.getValue());
            if (NamespaceGlobal.file_exists
                    .env(env)
                    .call(
                            file =
                                    toStringR(dir, env)
                                            + toStringR("/", env)
                                            + toStringR(logicalPathPsr4, env))
                    .getBool()) {
                return ZVal.assign(file);
            }
        }

        if (ZVal.strictNotEqualityCheck(
                false, "!==", pos = NamespaceGlobal.strrpos.env(env).call(_pClass, "\\").value())) {
            logicalPathPsr0 =
                    toStringR(
                                    NamespaceGlobal.substr
                                            .env(env)
                                            .call(logicalPathPsr4, 0, ZVal.add(pos, 1))
                                            .value(),
                                    env)
                            + toStringR(
                                    NamespaceGlobal.strtr
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.substr
                                                            .env(env)
                                                            .call(logicalPathPsr4, ZVal.add(pos, 1))
                                                            .value(),
                                                    "_",
                                                    "/")
                                            .value(),
                                    env);

        } else {
            logicalPathPsr0 =
                    toStringR(NamespaceGlobal.strtr.env(env).call(_pClass, "_", "/").value(), env)
                            + toStringR(ext, env);
        }

        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("prefixesPsr0").value(),
                        first))) {
            for (ZPair zpairResult5 :
                    ZVal.getIterable(
                            ZVal.getElement(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("prefixesPsr0")
                                            .value(),
                                    first),
                            env,
                            false)) {
                prefix = ZVal.assign(zpairResult5.getKey());
                dirs = ZVal.assign(zpairResult5.getValue());
                if (ZVal.strictEqualityCheck(
                        0, "===", NamespaceGlobal.strpos.env(env).call(_pClass, prefix).value())) {
                    for (ZPair zpairResult6 : ZVal.getIterable(dirs, env, true)) {
                        dir = ZVal.assign(zpairResult6.getValue());
                        if (NamespaceGlobal.file_exists
                                .env(env)
                                .call(
                                        file =
                                                toStringR(dir, env)
                                                        + toStringR("/", env)
                                                        + toStringR(logicalPathPsr0, env))
                                .getBool()) {
                            return ZVal.assign(file);
                        }
                    }
                }
            }
        }

        for (ZPair zpairResult7 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("fallbackDirsPsr0").value(),
                        env,
                        true)) {
            dir = ZVal.assign(zpairResult7.getValue());
            if (NamespaceGlobal.file_exists
                    .env(env)
                    .call(
                            file =
                                    toStringR(dir, env)
                                            + toStringR("/", env)
                                            + toStringR(logicalPathPsr0, env))
                    .getBool()) {
                return ZVal.assign(file);
            }
        }

        if (ZVal.toBool(toObjectR(this).accessProp(this, env).name("useIncludePath").value())
                && ZVal.toBool(
                        file =
                                function_stream_resolve_include_path
                                        .f
                                        .env(env)
                                        .call(logicalPathPsr0)
                                        .value())) {
            return ZVal.assign(file);
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Composer\\Autoload\\ClassLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Composer\\Autoload\\ClassLoader")
                    .setLookup(ClassLoader.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "apcuPrefix",
                            "classMap",
                            "classMapAuthoritative",
                            "fallbackDirsPsr0",
                            "fallbackDirsPsr4",
                            "missingClasses",
                            "prefixDirsPsr4",
                            "prefixLengthsPsr4",
                            "prefixesPsr0",
                            "useIncludePath")
                    .setFilename("vendor/composer/ClassLoader.php")
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
