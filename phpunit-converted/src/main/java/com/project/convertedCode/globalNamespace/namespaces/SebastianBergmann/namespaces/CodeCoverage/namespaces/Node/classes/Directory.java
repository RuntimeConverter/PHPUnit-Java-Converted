package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.AbstractNode;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Iterator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.File;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/Directory.php

*/

public final class Directory extends AbstractNode implements IteratorAggregate {

    public Object children = ZVal.newArray();

    public Object directories = ZVal.newArray();

    public Object files = ZVal.newArray();

    public Object classes = null;

    public Object traits = null;

    public Object functions = null;

    public Object linesOfCode = null;

    public Object numFiles = -1;

    public Object numExecutableLines = -1;

    public Object numExecutedLines = -1;

    public Object numClasses = -1;

    public Object numTestedClasses = -1;

    public Object numTraits = -1;

    public Object numTestedTraits = -1;

    public Object numMethods = -1;

    public Object numTestedMethods = -1;

    public Object numFunctions = -1;

    public Object numTestedFunctions = -1;

    public Directory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Directory.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numFiles").value(), "===", -1)) {
            toObjectR(this).accessProp(this, env).name("numFiles").set(0);
            for (ZPair zpairResult126 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult126.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numFiles")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numFiles")
                                                .value(),
                                        CRArrayF.count.env(env).call(child).value()));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numFiles").value());
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new RecursiveIteratorIterator(env, new Iterator(env, this), 1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object addDirectory(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object directory = null;
        directory =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .SebastianBergmann
                        .namespaces
                        .CodeCoverage
                        .namespaces
                        .Node
                        .classes
                        .Directory(env, name, this);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("children").value(), directory);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("directories").value(),
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("children").value(),
                        ZVal.subtract(
                                CRArrayF.count
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("children")
                                                        .value())
                                        .value(),
                                1)));
        return ZVal.assign(directory);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "coverageData", typeHint = "array")
    @ConvertedParameter(index = 2, name = "testData", typeHint = "array")
    @ConvertedParameter(index = 3, name = "cacheTokens", typeHint = "bool")
    public Object addFile(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object coverageData = assignParameter(args, 1, null);
        Object testData = assignParameter(args, 2, null);
        Object cacheTokens = assignParameter(args, 3, null);
        Object file = null;
        file = new File(env, name, this, coverageData, testData, cacheTokens);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("children").value(), file);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("files").value(),
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("children").value(),
                        ZVal.subtract(
                                CRArrayF.count
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("children")
                                                        .value())
                                        .value(),
                                1)));
        toObjectR(this).accessProp(this, env).name("numExecutableLines").set(-1);
        toObjectR(this).accessProp(this, env).name("numExecutedLines").set(-1);
        return ZVal.assign(file);
    }

    @ConvertedMethod
    public Object getDirectories(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("directories").value());
    }

    @ConvertedMethod
    public Object getFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("files").value());
    }

    @ConvertedMethod
    public Object getChildNodes(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("children").value());
    }

    @ConvertedMethod
    public Object getClasses(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("classes").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("classes").set(ZVal.newArray());
            for (ZPair zpairResult127 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult127.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("classes")
                        .set(
                                CRArrayF.array_merge
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("classes")
                                                        .value(),
                                                env.callMethod(
                                                        child, "getClasses", Directory.class))
                                        .value());
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("classes").value());
    }

    @ConvertedMethod
    public Object getTraits(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("traits").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("traits").set(ZVal.newArray());
            for (ZPair zpairResult128 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult128.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("traits")
                        .set(
                                CRArrayF.array_merge
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("traits")
                                                        .value(),
                                                env.callMethod(child, "getTraits", Directory.class))
                                        .value());
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("traits").value());
    }

    @ConvertedMethod
    public Object getFunctions(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("functions").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("functions").set(ZVal.newArray());
            for (ZPair zpairResult129 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult129.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("functions")
                        .set(
                                CRArrayF.array_merge
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("functions")
                                                        .value(),
                                                env.callMethod(
                                                        child, "getFunctions", Directory.class))
                                        .value());
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("functions").value());
    }

    @ConvertedMethod
    public Object getLinesOfCode(RuntimeEnv env, Object... args) {
        Object linesOfCode = ZVal.newArray();
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("linesOfCode")
                    .set(
                            ZVal.newArray(
                                    new ZPair("loc", 0),
                                    new ZPair("cloc", 0),
                                    new ZPair("ncloc", 0)));
            for (ZPair zpairResult130 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult130.getValue());
                linesOfCode = env.callMethod(child, "getLinesOfCode", Directory.class);
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                        "loc",
                        ZAssignment.add(
                                "+=",
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("linesOfCode")
                                                .value(),
                                        "loc"),
                                ZVal.getElement(linesOfCode, "loc")));
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                        "cloc",
                        ZAssignment.add(
                                "+=",
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("linesOfCode")
                                                .value(),
                                        "cloc"),
                                ZVal.getElement(linesOfCode, "cloc")));
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                        "ncloc",
                        ZAssignment.add(
                                "+=",
                                ZVal.getElement(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("linesOfCode")
                                                .value(),
                                        "ncloc"),
                                ZVal.getElement(linesOfCode, "ncloc")));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("linesOfCode").value());
    }

    @ConvertedMethod
    public Object getNumExecutableLines(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numExecutableLines").value(),
                "===",
                -1)) {
            toObjectR(this).accessProp(this, env).name("numExecutableLines").set(0);
            for (ZPair zpairResult131 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult131.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numExecutableLines")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numExecutableLines")
                                                .value(),
                                        env.callMethod(
                                                child, "getNumExecutableLines", Directory.class)));
            }
        }

        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("numExecutableLines").value());
    }

    @ConvertedMethod
    public Object getNumExecutedLines(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numExecutedLines").value(),
                "===",
                -1)) {
            toObjectR(this).accessProp(this, env).name("numExecutedLines").set(0);
            for (ZPair zpairResult132 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult132.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numExecutedLines")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numExecutedLines")
                                                .value(),
                                        env.callMethod(
                                                child, "getNumExecutedLines", Directory.class)));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numExecutedLines").value());
    }

    @ConvertedMethod
    public Object getNumClasses(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numClasses").value(), "===", -1)) {
            toObjectR(this).accessProp(this, env).name("numClasses").set(0);
            for (ZPair zpairResult133 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult133.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numClasses")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numClasses")
                                                .value(),
                                        env.callMethod(child, "getNumClasses", Directory.class)));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numClasses").value());
    }

    @ConvertedMethod
    public Object getNumTestedClasses(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numTestedClasses").value(),
                "===",
                -1)) {
            toObjectR(this).accessProp(this, env).name("numTestedClasses").set(0);
            for (ZPair zpairResult134 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult134.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numTestedClasses")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numTestedClasses")
                                                .value(),
                                        env.callMethod(
                                                child, "getNumTestedClasses", Directory.class)));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numTestedClasses").value());
    }

    @ConvertedMethod
    public Object getNumTraits(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numTraits").value(), "===", -1)) {
            toObjectR(this).accessProp(this, env).name("numTraits").set(0);
            for (ZPair zpairResult135 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult135.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numTraits")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numTraits")
                                                .value(),
                                        env.callMethod(child, "getNumTraits", Directory.class)));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numTraits").value());
    }

    @ConvertedMethod
    public Object getNumTestedTraits(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numTestedTraits").value(), "===", -1)) {
            toObjectR(this).accessProp(this, env).name("numTestedTraits").set(0);
            for (ZPair zpairResult136 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult136.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numTestedTraits")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numTestedTraits")
                                                .value(),
                                        env.callMethod(
                                                child, "getNumTestedTraits", Directory.class)));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numTestedTraits").value());
    }

    @ConvertedMethod
    public Object getNumMethods(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numMethods").value(), "===", -1)) {
            toObjectR(this).accessProp(this, env).name("numMethods").set(0);
            for (ZPair zpairResult137 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult137.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numMethods")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numMethods")
                                                .value(),
                                        env.callMethod(child, "getNumMethods", Directory.class)));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numMethods").value());
    }

    @ConvertedMethod
    public Object getNumTestedMethods(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numTestedMethods").value(),
                "===",
                -1)) {
            toObjectR(this).accessProp(this, env).name("numTestedMethods").set(0);
            for (ZPair zpairResult138 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult138.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numTestedMethods")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numTestedMethods")
                                                .value(),
                                        env.callMethod(
                                                child, "getNumTestedMethods", Directory.class)));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numTestedMethods").value());
    }

    @ConvertedMethod
    public Object getNumFunctions(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numFunctions").value(), "===", -1)) {
            toObjectR(this).accessProp(this, env).name("numFunctions").set(0);
            for (ZPair zpairResult139 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult139.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numFunctions")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numFunctions")
                                                .value(),
                                        env.callMethod(child, "getNumFunctions", Directory.class)));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numFunctions").value());
    }

    @ConvertedMethod
    public Object getNumTestedFunctions(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numTestedFunctions").value(),
                "===",
                -1)) {
            toObjectR(this).accessProp(this, env).name("numTestedFunctions").set(0);
            for (ZPair zpairResult140 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("children").value(),
                            env,
                            true)) {
                child = ZVal.assign(zpairResult140.getValue());
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numTestedFunctions")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numTestedFunctions")
                                                .value(),
                                        env.callMethod(
                                                child, "getNumTestedFunctions", Directory.class)));
            }
        }

        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("numTestedFunctions").value());
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\Directory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractNode.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\Directory")
                    .setLookup(Directory.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "children",
                            "classes",
                            "directories",
                            "files",
                            "functions",
                            "id",
                            "linesOfCode",
                            "name",
                            "numClasses",
                            "numExecutableLines",
                            "numExecutedLines",
                            "numFiles",
                            "numFunctions",
                            "numMethods",
                            "numTestedClasses",
                            "numTestedFunctions",
                            "numTestedMethods",
                            "numTestedTraits",
                            "numTraits",
                            "parent",
                            "path",
                            "pathArray",
                            "traits")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/Directory.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\Node\\AbstractNode")
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
