package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-text-template/src/Template.php

*/

public class Text_Template extends RuntimeClassBase {

    public Object template = "";

    public Object openDelimiter = "{";

    public Object closeDelimiter = "}";

    public Object values = ZVal.newArray();

    public Text_Template(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Text_Template.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "openDelimiter")
    @ConvertedParameter(index = 2, name = "closeDelimiter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, null);
        if (ZVal.isNull(file)) {
            file = "";
        }
        Object openDelimiter = assignParameter(args, 1, null);
        if (ZVal.isNull(openDelimiter)) {
            openDelimiter = "{";
        }
        Object closeDelimiter = assignParameter(args, 2, null);
        if (ZVal.isNull(closeDelimiter)) {
            closeDelimiter = "}";
        }
        env.callMethod(this, "setFile", Text_Template.class, file);
        toObjectR(this).accessProp(this, env).name("openDelimiter").set(openDelimiter);
        toObjectR(this).accessProp(this, env).name("closeDelimiter").set(closeDelimiter);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object setFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, null);
        Object distFile = null;
        distFile = toStringR(file, env) + ".dist";
        if (NamespaceGlobal.file_exists.env(env).call(file).getBool()) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("template")
                    .set(function_file_get_contents.f.env(env).call(file).value());

        } else {
            if (NamespaceGlobal.file_exists.env(env).call(distFile).getBool()) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("template")
                        .set(function_file_get_contents.f.env(env).call(distFile).value());

            } else {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(env, "Template file could not be loaded."));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "merge",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setVar(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, null);
        Object merge = assignParameter(args, 1, null);
        if (ZVal.isNull(merge)) {
            merge = true;
        }
        if (ZVal.toBool(!ZVal.isTrue(merge))
                || ZVal.toBool(
                        ZVal.isEmpty(
                                toObjectR(this).accessProp(this, env).name("values").value()))) {
            toObjectR(this).accessProp(this, env).name("values").set(values);

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("values")
                    .set(
                            CRArrayF.array_merge
                                    .env(env)
                                    .call(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("values")
                                                    .value(),
                                            values)
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    public Object render(RuntimeEnv env, Object... args) {
        Object keys = ZVal.newArray();
        Object value = null;
        Object key = null;
        keys = ZVal.newArray();
        for (ZPair zpairResult217 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("values").value(), env, false)) {
            key = ZVal.assign(zpairResult217.getKey());
            value = ZVal.assign(zpairResult217.getValue());
            ZVal.addToArray(
                    keys,
                    toStringR(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("openDelimiter")
                                            .value(),
                                    env)
                            + toStringR(key, env)
                            + toStringR(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("closeDelimiter")
                                            .value(),
                                    env));
        }

        return ZVal.assign(
                NamespaceGlobal.str_replace
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call(
                                keys,
                                toObjectR(this).accessProp(this, env).name("values").value(),
                                toObjectR(this).accessProp(this, env).name("template").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    public Object renderTo(RuntimeEnv env, Object... args) {
        Object target = assignParameter(args, 0, null);
        Object fp = null;
        Object error = ZVal.newArray();
        fp = NamespaceGlobal.fopen.env(env).call(target, "wt").value();
        if (ZVal.isTrue(fp)) {
            NamespaceGlobal.fwrite
                    .env(env)
                    .call(fp, env.callMethod(this, "render", Text_Template.class));
            NamespaceGlobal.fclose.env(env).call(fp);

        } else {
            error = NamespaceGlobal.error_get_last.env(env).call().value();
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Could not write to %s: %s",
                                            target,
                                            NamespaceGlobal.substr
                                                    .env(env)
                                                    .call(
                                                            ZVal.getElement(error, "message"),
                                                            ZVal.add(
                                                                    NamespaceGlobal.strpos
                                                                            .env(env)
                                                                            .call(
                                                                                    ZVal.getElement(
                                                                                            error,
                                                                                            "message"),
                                                                                    ":")
                                                                            .value(),
                                                                    2))
                                                    .value())
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class = "Text_Template";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Text_Template")
                    .setLookup(Text_Template.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("closeDelimiter", "openDelimiter", "template", "values")
                    .setFilename("vendor/phpunit/php-text-template/src/Template.php")
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
