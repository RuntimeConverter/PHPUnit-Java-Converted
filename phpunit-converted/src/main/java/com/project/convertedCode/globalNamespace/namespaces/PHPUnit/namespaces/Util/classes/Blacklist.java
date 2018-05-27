package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Diff;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes.Instantiator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes.Exporter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Comparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Invoker.classes.Invoker;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.classes.Version;
import com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes.ClassLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes.Context;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.project.convertedCode.globalNamespace.classes.PHP_Token;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.classes.DeepCopy;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.CodeCoverage;
import com.project.convertedCode.globalNamespace.classes.File_Iterator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Snapshot;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.DocBlock;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Generator;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.classes.Prophet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Blacklist.php

*/

public final class Blacklist extends RuntimeClassBase {

    public Blacklist(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    public Object getBlacklistedDirectories(RuntimeEnv env, Object... args) {
        env.callMethod(this, "initialize", Blacklist.class);
        return ZVal.assign(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Util
                                        .classes
                                        .Blacklist
                                        .RequestStaticProperties
                                        .class)
                        .directories);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "string")
    public Object isBlacklisted(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, null);
        Object directory = null;
        if (function_defined.f.env(env).call("PHPUNIT_TESTSUITE").getBool()) {
            return ZVal.assign(false);
        }

        env.callMethod(this, "initialize", Blacklist.class);
        for (ZPair zpairResult353 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Util
                                                .classes
                                                .Blacklist
                                                .RequestStaticProperties
                                                .class)
                                .directories,
                        env,
                        true)) {
            directory = ZVal.assign(zpairResult353.getValue());
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strpos.env(env).call(file, directory).value(), "===", 0)) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    private Object initialize(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object parent = null;
        Object reflector = null;
        Object i = null;
        Object className = null;
        Object directory = null;
        if (ZVal.strictEqualityCheck(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Util
                                        .classes
                                        .Blacklist
                                        .RequestStaticProperties
                                        .class)
                        .directories,
                "===",
                ZVal.getNull())) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Util
                                            .classes
                                            .Blacklist
                                            .RequestStaticProperties
                                            .class)
                            .directories =
                    ZVal.newArray();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult354 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Blacklist
                                                    .RequestStaticProperties
                                                    .class)
                                    .blacklistedClassNames,
                            env,
                            false)) {
                className = ZVal.assign(zpairResult354.getKey());
                parent = ZVal.assign(zpairResult354.getValue());
                if (!function_class_exists.f.env(env).call(className).getBool()) {
                    continue;
                }

                reflector = new ReflectionClass(env, className);
                directory = env.callMethod(reflector, "getFileName", Blacklist.class);
                runtimeConverterContinueCount = 0;
                for (i = 0; ZVal.isLessThan(i, '<', parent); i = ZVal.increment(i)) {
                    directory = NamespaceGlobal.dirname.env(env).call(directory).value();
                }

                ZVal.addToArray(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Util
                                                .classes
                                                .Blacklist
                                                .RequestStaticProperties
                                                .class)
                                .directories,
                        directory);
            }

            if (ZVal.strictEqualityCheck("/", "===", "\\")) {
                ZVal.addToArray(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Util
                                                .classes
                                                .Blacklist
                                                .RequestStaticProperties
                                                .class)
                                .directories,
                        toStringR(NamespaceGlobal.sys_get_temp_dir.env(env).call().value(), env)
                                + "\\PHP");
            }
        }

        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Blacklist";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object blacklistedClassNames =
                ZVal.newArray(
                        new ZPair(File_Iterator.CONST_class, 1),
                        new ZPair(Timer.CONST_class, 1),
                        new ZPair(PHP_Token.CONST_class, 1),
                        new ZPair(TestCase.CONST_class, 2),
                        new ZPair("PHPUnit\\DbUnit\\TestCase", 2),
                        new ZPair(Generator.CONST_class, 1),
                        new ZPair(Text_Template.CONST_class, 1),
                        new ZPair("Symfony\\Component\\Yaml\\Yaml", 1),
                        new ZPair(CodeCoverage.CONST_class, 1),
                        new ZPair(Diff.CONST_class, 1),
                        new ZPair(Runtime.CONST_class, 1),
                        new ZPair(Comparator.CONST_class, 1),
                        new ZPair(Exporter.CONST_class, 1),
                        new ZPair(Snapshot.CONST_class, 1),
                        new ZPair(Invoker.CONST_class, 1),
                        new ZPair(Context.CONST_class, 1),
                        new ZPair(Version.CONST_class, 1),
                        new ZPair(ClassLoader.CONST_class, 1),
                        new ZPair(Instantiator.CONST_class, 1),
                        new ZPair(DocBlock.CONST_class, 1),
                        new ZPair(Prophet.CONST_class, 1),
                        new ZPair(DeepCopy.CONST_class, 1));

        public Object directories = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Blacklist")
                    .setLookup(Blacklist.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Blacklist.php")
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
