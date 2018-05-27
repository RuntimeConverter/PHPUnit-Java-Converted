package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.Dashboard;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.File;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Facade.php

*/

public final class Facade extends RuntimeClassBase {

    public Object templatePath = null;

    public Object generator = null;

    public Object lowUpperBound = null;

    public Object highLowerBound = null;

    public Facade(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Facade.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "lowUpperBound",
        typeHint = "int",
        defaultValue = "50",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "highLowerBound",
        typeHint = "int",
        defaultValue = "90",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "generator", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lowUpperBound = assignParameter(args, 0, null);
        if (ZVal.isNull(lowUpperBound)) {
            lowUpperBound = 50;
        }
        Object highLowerBound = assignParameter(args, 1, null);
        if (ZVal.isNull(highLowerBound)) {
            highLowerBound = 90;
        }
        Object generator = assignParameter(args, 2, null);
        if (ZVal.isNull(generator)) {
            generator = "";
        }
        toObjectR(this).accessProp(this, env).name("generator").set(generator);
        toObjectR(this).accessProp(this, env).name("highLowerBound").set(highLowerBound);
        toObjectR(this).accessProp(this, env).name("lowUpperBound").set(lowUpperBound);
        toObjectR(this)
                .accessProp(this, env)
                .name("templatePath")
                .set(
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/phpunit/php-code-coverage/src/Report/Html"),
                                        env)
                                + "/Renderer/Template/");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    @ConvertedParameter(index = 1, name = "target", typeHint = "string")
    public Object process(RuntimeEnv env, Object... args) {
        Object coverage = assignParameter(args, 0, null);
        Object target = assignParameter(args, 1, null);
        Object date = null;
        Object node = null;
        Object file = null;
        Object _SERVER = env.getGlobal("_SERVER");
        Object report = null;
        Object id = null;
        Object dir = null;
        Object directory = null;
        Object dashboard = null;
        target = env.callMethod(this, "getDirectory", Facade.class, target);
        report = env.callMethod(coverage, "getReport", Facade.class);
        if (!ZVal.isset(ZVal.getElement(_SERVER, "REQUEST_TIME"))) {
            ZVal.putArrayElement(
                    _SERVER, "REQUEST_TIME", NamespaceGlobal.time.env(env).call().value());
        }

        date =
                NamespaceGlobal.date
                        .env(env)
                        .call("D M j G:i:s T Y", ZVal.getElement(_SERVER, "REQUEST_TIME"))
                        .value();
        dashboard =
                new Dashboard(
                        env,
                        toObjectR(this).accessProp(this, env).name("templatePath").value(),
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        date,
                        toObjectR(this).accessProp(this, env).name("lowUpperBound").value(),
                        toObjectR(this).accessProp(this, env).name("highLowerBound").value());
        directory =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .SebastianBergmann
                        .namespaces
                        .CodeCoverage
                        .namespaces
                        .Report
                        .namespaces
                        .Html
                        .classes
                        .Directory(
                        env,
                        toObjectR(this).accessProp(this, env).name("templatePath").value(),
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        date,
                        toObjectR(this).accessProp(this, env).name("lowUpperBound").value(),
                        toObjectR(this).accessProp(this, env).name("highLowerBound").value());
        file =
                new File(
                        env,
                        toObjectR(this).accessProp(this, env).name("templatePath").value(),
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        date,
                        toObjectR(this).accessProp(this, env).name("lowUpperBound").value(),
                        toObjectR(this).accessProp(this, env).name("highLowerBound").value());
        env.callMethod(
                directory, "render", Facade.class, report, toStringR(target, env) + "index.html");
        env.callMethod(
                dashboard,
                "render",
                Facade.class,
                report,
                toStringR(target, env) + "dashboard.html");
        for (ZPair zpairResult173 : ZVal.getIterable(report, env, true)) {
            node = ZVal.assign(zpairResult173.getValue());
            id = env.callMethod(node, "getId", Facade.class);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            node,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .namespaces
                                    .Node
                                    .classes
                                    .Directory
                                    .class,
                            "SebastianBergmann\\CodeCoverage\\Node\\Directory"))) {
                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        NamespaceGlobal.mkdir
                                                .env(env)
                                                .call(
                                                        toStringR(target, env) + toStringR(id, env),
                                                        511,
                                                        true)
                                                .value()))
                        && ZVal.toBool(
                                !NamespaceGlobal.is_dir
                                        .env(env)
                                        .call(toStringR(target, env) + toStringR(id, env))
                                        .getBool())) {
                    throw ZVal.getException(
                            env,
                            new com.runtimeconverter
                                    .runtime
                                    .nativeClasses
                                    .spl
                                    .exceptions
                                    .RuntimeException(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "Directory \"%s\" was not created",
                                                    toStringR(target, env) + toStringR(id, env))
                                            .value()));
                }

                env.callMethod(
                        directory,
                        "render",
                        Facade.class,
                        node,
                        toStringR(target, env) + toStringR(id, env) + "/index.html");
                env.callMethod(
                        dashboard,
                        "render",
                        Facade.class,
                        node,
                        toStringR(target, env) + toStringR(id, env) + "/dashboard.html");

            } else {
                dir =
                        NamespaceGlobal.dirname
                                .env(env)
                                .call(toStringR(target, env) + toStringR(id, env))
                                .value();
                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        NamespaceGlobal.mkdir
                                                .env(env)
                                                .call(dir, 511, true)
                                                .value()))
                        && ZVal.toBool(!NamespaceGlobal.is_dir.env(env).call(dir).getBool())) {
                    throw ZVal.getException(
                            env,
                            new com.runtimeconverter
                                    .runtime
                                    .nativeClasses
                                    .spl
                                    .exceptions
                                    .RuntimeException(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call("Directory \"%s\" was not created", dir)
                                            .value()));
                }

                env.callMethod(
                        file,
                        "render",
                        Facade.class,
                        node,
                        toStringR(target, env) + toStringR(id, env) + ".html");
            }
        }

        env.callMethod(this, "copyFiles", Facade.class, target);
        return env.returnWithGlobals(null, "_SERVER", _SERVER);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target", typeHint = "string")
    private Object copyFiles(RuntimeEnv env, Object... args) {
        Object target = assignParameter(args, 0, null);
        Object dir = null;
        dir = env.callMethod(this, "getDirectory", Facade.class, toStringR(target, env) + ".css");
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        toStringR(dir, env) + "bootstrap.min.css",
                        NamespaceGlobal.str_replace
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call(
                                        "url(../fonts/",
                                        "url(../.fonts/",
                                        function_file_get_contents
                                                .f
                                                .env(env)
                                                .call(
                                                        toStringR(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name(
                                                                                        "templatePath")
                                                                                .value(),
                                                                        env)
                                                                + "css/bootstrap.min.css")
                                                .value())
                                .value());
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "css/nv.d3.min.css",
                        toStringR(dir, env) + "nv.d3.min.css");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "css/style.css",
                        toStringR(dir, env) + "style.css");
        dir = env.callMethod(this, "getDirectory", Facade.class, toStringR(target, env) + ".fonts");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "fonts/glyphicons-halflings-regular.eot",
                        toStringR(dir, env) + "glyphicons-halflings-regular.eot");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "fonts/glyphicons-halflings-regular.svg",
                        toStringR(dir, env) + "glyphicons-halflings-regular.svg");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "fonts/glyphicons-halflings-regular.ttf",
                        toStringR(dir, env) + "glyphicons-halflings-regular.ttf");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "fonts/glyphicons-halflings-regular.woff",
                        toStringR(dir, env) + "glyphicons-halflings-regular.woff");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "fonts/glyphicons-halflings-regular.woff2",
                        toStringR(dir, env) + "glyphicons-halflings-regular.woff2");
        dir = env.callMethod(this, "getDirectory", Facade.class, toStringR(target, env) + ".js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "js/bootstrap.min.js",
                        toStringR(dir, env) + "bootstrap.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "js/d3.min.js",
                        toStringR(dir, env) + "d3.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "js/holder.min.js",
                        toStringR(dir, env) + "holder.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "js/html5shiv.min.js",
                        toStringR(dir, env) + "html5shiv.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "js/jquery.min.js",
                        toStringR(dir, env) + "jquery.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "js/nv.d3.min.js",
                        toStringR(dir, env) + "nv.d3.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "js/respond.min.js",
                        toStringR(dir, env) + "respond.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "js/file.js",
                        toStringR(dir, env) + "file.js");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    private Object getDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, null);
        if (ZVal.notEqualityCheck(
                NamespaceGlobal.substr.env(env).call(directory, -1, 1).value(), "/")) {
            directory = toStringR(directory, env) + toStringR("/", env);
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                NamespaceGlobal.mkdir.env(env).call(directory, 511, true).value()))
                && ZVal.toBool(!NamespaceGlobal.is_dir.env(env).call(directory).getBool())) {
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .SebastianBergmann
                            .namespaces
                            .CodeCoverage
                            .classes
                            .RuntimeException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Directory \"%s\" does not exist.", directory)
                                    .value()));
        }

        return ZVal.assign(directory);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Html\\Facade";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\Facade")
                    .setLookup(Facade.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "generator", "highLowerBound", "lowUpperBound", "templatePath")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Html/Facade.php")
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
