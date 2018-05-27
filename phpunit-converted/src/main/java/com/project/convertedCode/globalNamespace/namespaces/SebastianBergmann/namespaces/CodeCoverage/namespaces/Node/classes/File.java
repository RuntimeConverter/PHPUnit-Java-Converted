package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.AbstractNode;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream_CachingFactory;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import java.lang.Math;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/File.php

*/

public final class File extends AbstractNode {

    public Object coverageData = null;

    public Object testData = null;

    public Object numExecutableLines = 0;

    public Object numExecutedLines = 0;

    public Object classes = ZVal.newArray();

    public Object traits = ZVal.newArray();

    public Object functions = ZVal.newArray();

    public Object linesOfCode = ZVal.newArray();

    public Object numClasses = null;

    public Object numTestedClasses = 0;

    public Object numTraits = null;

    public Object numTestedTraits = 0;

    public Object numMethods = null;

    public Object numTestedMethods = null;

    public Object numTestedFunctions = null;

    public Object startLines = ZVal.newArray();

    public Object endLines = ZVal.newArray();

    public Object cacheTokens = null;

    public File(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "parent",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    @ConvertedParameter(index = 2, name = "coverageData", typeHint = "array")
    @ConvertedParameter(index = 3, name = "testData", typeHint = "array")
    @ConvertedParameter(index = 4, name = "cacheTokens", typeHint = "bool")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object parent = assignParameter(args, 1, null);
        Object coverageData = assignParameter(args, 2, null);
        Object testData = assignParameter(args, 3, null);
        Object cacheTokens = assignParameter(args, 4, null);
        super.__construct(env, name, parent);
        toObjectR(this).accessProp(this, env).name("coverageData").set(coverageData);
        toObjectR(this).accessProp(this, env).name("testData").set(testData);
        toObjectR(this).accessProp(this, env).name("cacheTokens").set(cacheTokens);
        env.callMethod(this, "calculateStatistics", File.class);
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return 1;
    }

    @ConvertedMethod
    public Object getCoverageData(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("coverageData").value());
    }

    @ConvertedMethod
    public Object getTestData(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("testData").value());
    }

    @ConvertedMethod
    public Object getClasses(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("classes").value());
    }

    @ConvertedMethod
    public Object getTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("traits").value());
    }

    @ConvertedMethod
    public Object getFunctions(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("functions").value());
    }

    @ConvertedMethod
    public Object getLinesOfCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("linesOfCode").value());
    }

    @ConvertedMethod
    public Object getNumExecutableLines(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("numExecutableLines").value());
    }

    @ConvertedMethod
    public Object getNumExecutedLines(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numExecutedLines").value());
    }

    @ConvertedMethod
    public Object getNumClasses(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object method = ZVal.newArray();
        Object _pClass = ZVal.newArray();
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numClasses").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("numClasses").set(0);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult141 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("classes").value(),
                            env,
                            true)) {
                _pClass = ZVal.assign(zpairResult141.getValue());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult142 :
                        ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, true)) {
                    method = ZVal.assign(zpairResult142.getValue());
                    if (ZVal.isGreaterThan(ZVal.getElement(method, "executableLines"), '>', 0)) {
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("numClasses")
                                .set(
                                        ZVal.increment(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("numClasses")
                                                        .value()));
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numClasses").value());
    }

    @ConvertedMethod
    public Object getNumTestedClasses(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numTestedClasses").value());
    }

    @ConvertedMethod
    public Object getNumTraits(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object method = ZVal.newArray();
        Object trait = ZVal.newArray();
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numTraits").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("numTraits").set(0);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult143 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("traits").value(),
                            env,
                            true)) {
                trait = ZVal.assign(zpairResult143.getValue());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult144 :
                        ZVal.getIterable(ZVal.getElement(trait, "methods"), env, true)) {
                    method = ZVal.assign(zpairResult144.getValue());
                    if (ZVal.isGreaterThan(ZVal.getElement(method, "executableLines"), '>', 0)) {
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("numTraits")
                                .set(
                                        ZVal.increment(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("numTraits")
                                                        .value()));
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numTraits").value());
    }

    @ConvertedMethod
    public Object getNumTestedTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numTestedTraits").value());
    }

    @ConvertedMethod
    public Object getNumMethods(RuntimeEnv env, Object... args) {
        Object method = ZVal.newArray();
        Object trait = ZVal.newArray();
        Object _pClass = ZVal.newArray();
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numMethods").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("numMethods").set(0);
            for (ZPair zpairResult145 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("classes").value(),
                            env,
                            true)) {
                _pClass = ZVal.assign(zpairResult145.getValue());
                for (ZPair zpairResult146 :
                        ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, true)) {
                    method = ZVal.assign(zpairResult146.getValue());
                    if (ZVal.isGreaterThan(ZVal.getElement(method, "executableLines"), '>', 0)) {
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("numMethods")
                                .set(
                                        ZVal.increment(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("numMethods")
                                                        .value()));
                    }
                }
            }

            for (ZPair zpairResult147 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("traits").value(),
                            env,
                            true)) {
                trait = ZVal.assign(zpairResult147.getValue());
                for (ZPair zpairResult148 :
                        ZVal.getIterable(ZVal.getElement(trait, "methods"), env, true)) {
                    method = ZVal.assign(zpairResult148.getValue());
                    if (ZVal.isGreaterThan(ZVal.getElement(method, "executableLines"), '>', 0)) {
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("numMethods")
                                .set(
                                        ZVal.increment(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("numMethods")
                                                        .value()));
                    }
                }
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numMethods").value());
    }

    @ConvertedMethod
    public Object getNumTestedMethods(RuntimeEnv env, Object... args) {
        Object method = ZVal.newArray();
        Object trait = ZVal.newArray();
        Object _pClass = ZVal.newArray();
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numTestedMethods").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("numTestedMethods").set(0);
            for (ZPair zpairResult149 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("classes").value(),
                            env,
                            true)) {
                _pClass = ZVal.assign(zpairResult149.getValue());
                for (ZPair zpairResult150 :
                        ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, true)) {
                    method = ZVal.assign(zpairResult150.getValue());
                    if (ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            ZVal.getElement(method, "executableLines"), '>', 0))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(ZVal.getElement(method, "coverage"), 100))) {
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("numTestedMethods")
                                .set(
                                        ZVal.increment(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("numTestedMethods")
                                                        .value()));
                    }
                }
            }

            for (ZPair zpairResult151 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("traits").value(),
                            env,
                            true)) {
                trait = ZVal.assign(zpairResult151.getValue());
                for (ZPair zpairResult152 :
                        ZVal.getIterable(ZVal.getElement(trait, "methods"), env, true)) {
                    method = ZVal.assign(zpairResult152.getValue());
                    if (ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            ZVal.getElement(method, "executableLines"), '>', 0))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(ZVal.getElement(method, "coverage"), 100))) {
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("numTestedMethods")
                                .set(
                                        ZVal.increment(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("numTestedMethods")
                                                        .value()));
                    }
                }
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("numTestedMethods").value());
    }

    @ConvertedMethod
    public Object getNumFunctions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("functions").value())
                        .value());
    }

    @ConvertedMethod
    public Object getNumTestedFunctions(RuntimeEnv env, Object... args) {
        Object function = ZVal.newArray();
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("numTestedFunctions").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this).accessProp(this, env).name("numTestedFunctions").set(0);
            for (ZPair zpairResult153 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("functions").value(),
                            env,
                            true)) {
                function = ZVal.assign(zpairResult153.getValue());
                if (ZVal.toBool(
                                ZVal.isGreaterThan(
                                        ZVal.getElement(function, "executableLines"), '>', 0))
                        && ZVal.toBool(
                                ZVal.equalityCheck(ZVal.getElement(function, "coverage"), 100))) {
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("numTestedFunctions")
                            .set(
                                    ZVal.increment(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("numTestedFunctions")
                                                    .value()));
                }
            }
        }

        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("numTestedFunctions").value());
    }

    @ConvertedMethod
    private Object calculateStatistics(RuntimeEnv env, Object... args) {
        ReferenceContainer currentClass = new BasicReferenceContainer(ZVal.newArray());
        ReferenceContainer currentTrait = new BasicReferenceContainer(ZVal.newArray());
        ReferenceContainer method = new BasicReferenceContainer(ZVal.newArray());
        Object functionStack = ZVal.newArray();
        ReferenceContainer currentFunction = new BasicReferenceContainer(ZVal.newArray());
        ReferenceContainer function = new BasicReferenceContainer(ZVal.newArray());
        Object classStack = ZVal.newArray();
        ReferenceContainer trait = new BasicReferenceContainer(ZVal.newArray());
        Object tokens = null;
        Object lineNumber = null;
        ReferenceContainer currentMethod = new BasicReferenceContainer(ZVal.newArray());
        ReferenceContainer _pClass = new BasicReferenceContainer(ZVal.newArray());
        Object key = null;
        classStack = ZVal.assign(functionStack = ZVal.newArray());
        if (toObjectR(this).accessProp(this, env).name("cacheTokens").getBool()) {
            tokens =
                    PHP_Token_Stream_CachingFactory.runtimeStaticObject.get(
                            env, env.callMethod(this, "getPath", File.class));

        } else {
            tokens = new PHP_Token_Stream(env, env.callMethod(this, "getPath", File.class));
        }

        env.callMethod(this, "processClasses", File.class, tokens);
        env.callMethod(this, "processTraits", File.class, tokens);
        env.callMethod(this, "processFunctions", File.class, tokens);
        toObjectR(this)
                .accessProp(this, env)
                .name("linesOfCode")
                .set(env.callMethod(tokens, "getLinesOfCode", File.class));
        tokens = null;
        for (lineNumber = 1;
                ZVal.isLessThanOrEqualTo(
                        lineNumber,
                        "<=",
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                                "loc"));
                lineNumber = ZVal.increment(lineNumber)) {
            if (ZVal.isset(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("startLines").value(),
                            lineNumber))) {
                if (ZVal.isset(
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("startLines").value(),
                                lineNumber,
                                "className"))) {
                    if (ZVal.isset(currentClass.getObject())) {
                        ZVal.addToArray(classStack, currentClass.getObject());
                    }

                    currentClass =
                            new ArrayDimensionReference(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("startLines")
                                            .value(),
                                    lineNumber);

                } else if (ZVal.isset(
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("startLines").value(),
                                lineNumber,
                                "traitName"))) {
                    currentTrait =
                            new ArrayDimensionReference(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("startLines")
                                            .value(),
                                    lineNumber);

                } else if (ZVal.isset(
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("startLines").value(),
                                lineNumber,
                                "methodName"))) {
                    currentMethod =
                            new ArrayDimensionReference(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("startLines")
                                            .value(),
                                    lineNumber);

                } else if (ZVal.isset(
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("startLines").value(),
                                lineNumber,
                                "functionName"))) {
                    if (ZVal.isset(currentFunction.getObject())) {
                        ZVal.addToArray(functionStack, currentFunction.getObject());
                    }

                    currentFunction =
                            new ArrayDimensionReference(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("startLines")
                                            .value(),
                                    lineNumber);
                }
            }

            if (ZVal.isset(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("coverageData").value(),
                            lineNumber))) {
                if (ZVal.isset(currentClass.getObject())) {
                    ZVal.putArrayElement(
                            currentClass.getObject(),
                            "executableLines",
                            ZVal.increment(
                                    ZVal.getElement(currentClass.getObject(), "executableLines")));
                }

                if (ZVal.isset(currentTrait.getObject())) {
                    ZVal.putArrayElement(
                            currentTrait.getObject(),
                            "executableLines",
                            ZVal.increment(
                                    ZVal.getElement(currentTrait.getObject(), "executableLines")));
                }

                if (ZVal.isset(currentMethod.getObject())) {
                    ZVal.putArrayElement(
                            currentMethod.getObject(),
                            "executableLines",
                            ZVal.increment(
                                    ZVal.getElement(currentMethod.getObject(), "executableLines")));
                }

                if (ZVal.isset(currentFunction.getObject())) {
                    ZVal.putArrayElement(
                            currentFunction.getObject(),
                            "executableLines",
                            ZVal.increment(
                                    ZVal.getElement(
                                            currentFunction.getObject(), "executableLines")));
                }

                toObjectR(this)
                        .accessProp(this, env)
                        .name("numExecutableLines")
                        .set(
                                ZVal.increment(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numExecutableLines")
                                                .value()));
                if (ZVal.isGreaterThan(
                        CRArrayF.count
                                .env(env)
                                .call(
                                        ZVal.getElement(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("coverageData")
                                                        .value(),
                                                lineNumber))
                                .value(),
                        '>',
                        0)) {
                    if (ZVal.isset(currentClass.getObject())) {
                        ZVal.putArrayElement(
                                currentClass.getObject(),
                                "executedLines",
                                ZVal.increment(
                                        ZVal.getElement(
                                                currentClass.getObject(), "executedLines")));
                    }

                    if (ZVal.isset(currentTrait.getObject())) {
                        ZVal.putArrayElement(
                                currentTrait.getObject(),
                                "executedLines",
                                ZVal.increment(
                                        ZVal.getElement(
                                                currentTrait.getObject(), "executedLines")));
                    }

                    if (ZVal.isset(currentMethod.getObject())) {
                        ZVal.putArrayElement(
                                currentMethod.getObject(),
                                "executedLines",
                                ZVal.increment(
                                        ZVal.getElement(
                                                currentMethod.getObject(), "executedLines")));
                    }

                    if (ZVal.isset(currentFunction.getObject())) {
                        ZVal.putArrayElement(
                                currentFunction.getObject(),
                                "executedLines",
                                ZVal.increment(
                                        ZVal.getElement(
                                                currentFunction.getObject(), "executedLines")));
                    }

                    toObjectR(this)
                            .accessProp(this, env)
                            .name("numExecutedLines")
                            .set(
                                    ZVal.increment(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("numExecutedLines")
                                                    .value()));
                }
            }

            if (ZVal.isset(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("endLines").value(),
                            lineNumber))) {
                if (ZVal.isset(
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("endLines").value(),
                                lineNumber,
                                "className"))) {
                    currentClass.setObject(null);
                    if (ZVal.isTrue(classStack)) {
                        CRArrayF.end.env(env).call(classStack);
                        key = CRArrayF.key.env(env).call(classStack).value();
                        currentClass = new ArrayDimensionReference(classStack, key);
                        ZVal.unsetArrayElement(classStack, key);
                    }

                } else if (ZVal.isset(
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("endLines").value(),
                                lineNumber,
                                "traitName"))) {
                    currentTrait.setObject(null);

                } else if (ZVal.isset(
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("endLines").value(),
                                lineNumber,
                                "methodName"))) {
                    currentMethod.setObject(null);

                } else if (ZVal.isset(
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("endLines").value(),
                                lineNumber,
                                "functionName"))) {
                    currentFunction.setObject(null);
                    if (ZVal.isTrue(functionStack)) {
                        CRArrayF.end.env(env).call(functionStack);
                        key = CRArrayF.key.env(env).call(functionStack).value();
                        currentFunction = new ArrayDimensionReference(functionStack, key);
                        ZVal.unsetArrayElement(functionStack, key);
                    }
                }
            }
        }

        for (ZPair zpairResult154 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("traits").value(), env, true)) {
            trait = zpairResult154;
            for (ZPair zpairResult155 :
                    ZVal.getIterable(ZVal.getElement(trait.getObject(), "methods"), env, true)) {
                method = zpairResult155;
                if (ZVal.isGreaterThan(
                        ZVal.getElement(method.getObject(), "executableLines"), '>', 0)) {
                    ZVal.putArrayElement(
                            method.getObject(),
                            "coverage",
                            ZVal.multiply(
                                    ZVal.divide(
                                            ZVal.getElement(method.getObject(), "executedLines"),
                                            ZVal.getElement(method.getObject(), "executableLines")),
                                    100));

                } else {
                    ZVal.putArrayElement(method.getObject(), "coverage", 100);
                }

                ZVal.putArrayElement(
                        method.getObject(),
                        "crap",
                        env.callMethod(
                                this,
                                "crap",
                                File.class,
                                ZVal.getElement(method.getObject(), "ccn"),
                                ZVal.getElement(method.getObject(), "coverage")));
                ZVal.putArrayElement(
                        trait.getObject(),
                        "ccn",
                        ZAssignment.add(
                                "+=",
                                ZVal.getElement(trait.getObject(), "ccn"),
                                ZVal.getElement(method.getObject(), "ccn")));
            }

            if (ZVal.isGreaterThan(ZVal.getElement(trait.getObject(), "executableLines"), '>', 0)) {
                ZVal.putArrayElement(
                        trait.getObject(),
                        "coverage",
                        ZVal.multiply(
                                ZVal.divide(
                                        ZVal.getElement(trait.getObject(), "executedLines"),
                                        ZVal.getElement(trait.getObject(), "executableLines")),
                                100));
                if (ZVal.equalityCheck(ZVal.getElement(trait.getObject(), "coverage"), 100)) {
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("numTestedClasses")
                            .set(
                                    ZVal.increment(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("numTestedClasses")
                                                    .value()));
                }

            } else {
                ZVal.putArrayElement(trait.getObject(), "coverage", 100);
            }

            ZVal.putArrayElement(
                    trait.getObject(),
                    "crap",
                    env.callMethod(
                            this,
                            "crap",
                            File.class,
                            ZVal.getElement(trait.getObject(), "ccn"),
                            ZVal.getElement(trait.getObject(), "coverage")));
        }

        for (ZPair zpairResult156 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("classes").value(), env, true)) {
            _pClass = zpairResult156;
            for (ZPair zpairResult157 :
                    ZVal.getIterable(ZVal.getElement(_pClass.getObject(), "methods"), env, true)) {
                method = zpairResult157;
                if (ZVal.isGreaterThan(
                        ZVal.getElement(method.getObject(), "executableLines"), '>', 0)) {
                    ZVal.putArrayElement(
                            method.getObject(),
                            "coverage",
                            ZVal.multiply(
                                    ZVal.divide(
                                            ZVal.getElement(method.getObject(), "executedLines"),
                                            ZVal.getElement(method.getObject(), "executableLines")),
                                    100));

                } else {
                    ZVal.putArrayElement(method.getObject(), "coverage", 100);
                }

                ZVal.putArrayElement(
                        method.getObject(),
                        "crap",
                        env.callMethod(
                                this,
                                "crap",
                                File.class,
                                ZVal.getElement(method.getObject(), "ccn"),
                                ZVal.getElement(method.getObject(), "coverage")));
                ZVal.putArrayElement(
                        _pClass.getObject(),
                        "ccn",
                        ZAssignment.add(
                                "+=",
                                ZVal.getElement(_pClass.getObject(), "ccn"),
                                ZVal.getElement(method.getObject(), "ccn")));
            }

            if (ZVal.isGreaterThan(
                    ZVal.getElement(_pClass.getObject(), "executableLines"), '>', 0)) {
                ZVal.putArrayElement(
                        _pClass.getObject(),
                        "coverage",
                        ZVal.multiply(
                                ZVal.divide(
                                        ZVal.getElement(_pClass.getObject(), "executedLines"),
                                        ZVal.getElement(_pClass.getObject(), "executableLines")),
                                100));
                if (ZVal.equalityCheck(ZVal.getElement(_pClass.getObject(), "coverage"), 100)) {
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("numTestedClasses")
                            .set(
                                    ZVal.increment(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("numTestedClasses")
                                                    .value()));
                }

            } else {
                ZVal.putArrayElement(_pClass.getObject(), "coverage", 100);
            }

            ZVal.putArrayElement(
                    _pClass.getObject(),
                    "crap",
                    env.callMethod(
                            this,
                            "crap",
                            File.class,
                            ZVal.getElement(_pClass.getObject(), "ccn"),
                            ZVal.getElement(_pClass.getObject(), "coverage")));
        }

        for (ZPair zpairResult158 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("functions").value(),
                        env,
                        true)) {
            function = zpairResult158;
            if (ZVal.isGreaterThan(
                    ZVal.getElement(function.getObject(), "executableLines"), '>', 0)) {
                ZVal.putArrayElement(
                        function.getObject(),
                        "coverage",
                        ZVal.multiply(
                                ZVal.divide(
                                        ZVal.getElement(function.getObject(), "executedLines"),
                                        ZVal.getElement(function.getObject(), "executableLines")),
                                100));

            } else {
                ZVal.putArrayElement(function.getObject(), "coverage", 100);
            }

            if (ZVal.equalityCheck(ZVal.getElement(function.getObject(), "coverage"), 100)) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("numTestedFunctions")
                        .set(
                                ZVal.increment(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("numTestedFunctions")
                                                .value()));
            }

            ZVal.putArrayElement(
                    function.getObject(),
                    "crap",
                    env.callMethod(
                            this,
                            "crap",
                            File.class,
                            ZVal.getElement(function.getObject(), "ccn"),
                            ZVal.getElement(function.getObject(), "coverage")));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "PHP_Token_Stream")
    private Object processClasses(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        Object method = ZVal.newArray();
        Object classes = null;
        Object link = null;
        Object methodName = null;
        Object className = null;
        Object _pClass = ZVal.newArray();
        classes = env.callMethod(tokens, "getClasses", File.class);
        link = toStringR(env.callMethod(this, "getId", File.class), env) + ".html#";
        for (ZPair zpairResult159 : ZVal.getIterable(classes, env, false)) {
            className = ZVal.assign(zpairResult159.getKey());
            _pClass = ZVal.assign(zpairResult159.getValue());
            if (!ZVal.isEmpty(ZVal.getElementRecursive(_pClass, "package", "namespace"))) {
                className =
                        toStringR(ZVal.getElementRecursive(_pClass, "package", "namespace"), env)
                                + "\\"
                                + toStringR(className, env);
            }

            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("classes").value(),
                    className,
                    ZVal.newArray(
                            new ZPair("className", className),
                            new ZPair("methods", ZVal.newArray()),
                            new ZPair("startLine", ZVal.getElement(_pClass, "startLine")),
                            new ZPair("executableLines", 0),
                            new ZPair("executedLines", 0),
                            new ZPair("ccn", 0),
                            new ZPair("coverage", 0),
                            new ZPair("crap", 0),
                            new ZPair("package", ZVal.getElement(_pClass, "package")),
                            new ZPair(
                                    "link",
                                    toStringR(link, env)
                                            + toStringR(
                                                    ZVal.getElement(_pClass, "startLine"), env))));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("startLines").value(),
                    ZVal.getElement(_pClass, "startLine"),
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("classes").value(),
                            className));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("endLines").value(),
                    ZVal.getElement(_pClass, "endLine"),
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("classes").value(),
                            className));
            for (ZPair zpairResult160 :
                    ZVal.getIterable(ZVal.getElement(_pClass, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult160.getKey());
                method = ZVal.assign(zpairResult160.getValue());
                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("classes").value(),
                        env.callMethod(this, "newMethod", File.class, methodName, method, link),
                        className,
                        "methods",
                        methodName);
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("startLines").value(),
                        ZVal.getElement(method, "startLine"),
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("classes").value(),
                                className,
                                "methods",
                                methodName));
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("endLines").value(),
                        ZVal.getElement(method, "endLine"),
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("classes").value(),
                                className,
                                "methods",
                                methodName));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "PHP_Token_Stream")
    private Object processTraits(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        Object traitName = null;
        Object traits = null;
        Object method = ZVal.newArray();
        Object link = null;
        Object trait = ZVal.newArray();
        Object methodName = null;
        traits = env.callMethod(tokens, "getTraits", File.class);
        link = toStringR(env.callMethod(this, "getId", File.class), env) + ".html#";
        for (ZPair zpairResult161 : ZVal.getIterable(traits, env, false)) {
            traitName = ZVal.assign(zpairResult161.getKey());
            trait = ZVal.assign(zpairResult161.getValue());
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("traits").value(),
                    traitName,
                    ZVal.newArray(
                            new ZPair("traitName", traitName),
                            new ZPair("methods", ZVal.newArray()),
                            new ZPair("startLine", ZVal.getElement(trait, "startLine")),
                            new ZPair("executableLines", 0),
                            new ZPair("executedLines", 0),
                            new ZPair("ccn", 0),
                            new ZPair("coverage", 0),
                            new ZPair("crap", 0),
                            new ZPair("package", ZVal.getElement(trait, "package")),
                            new ZPair(
                                    "link",
                                    toStringR(link, env)
                                            + toStringR(
                                                    ZVal.getElement(trait, "startLine"), env))));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("startLines").value(),
                    ZVal.getElement(trait, "startLine"),
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("traits").value(),
                            traitName));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("endLines").value(),
                    ZVal.getElement(trait, "endLine"),
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("traits").value(),
                            traitName));
            for (ZPair zpairResult162 :
                    ZVal.getIterable(ZVal.getElement(trait, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult162.getKey());
                method = ZVal.assign(zpairResult162.getValue());
                ZVal.setElementRecursive(
                        toObjectR(this).accessProp(this, env).name("traits").value(),
                        env.callMethod(this, "newMethod", File.class, methodName, method, link),
                        traitName,
                        "methods",
                        methodName);
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("startLines").value(),
                        ZVal.getElement(method, "startLine"),
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("traits").value(),
                                traitName,
                                "methods",
                                methodName));
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("endLines").value(),
                        ZVal.getElement(method, "endLine"),
                        ZVal.getElementRecursive(
                                toObjectR(this).accessProp(this, env).name("traits").value(),
                                traitName,
                                "methods",
                                methodName));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "PHP_Token_Stream")
    private Object processFunctions(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, null);
        Object functions = null;
        Object functionName = null;
        Object function = ZVal.newArray();
        Object link = null;
        functions = env.callMethod(tokens, "getFunctions", File.class);
        link = toStringR(env.callMethod(this, "getId", File.class), env) + ".html#";
        for (ZPair zpairResult163 : ZVal.getIterable(functions, env, false)) {
            functionName = ZVal.assign(zpairResult163.getKey());
            function = ZVal.assign(zpairResult163.getValue());
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("functions").value(),
                    functionName,
                    ZVal.newArray(
                            new ZPair("functionName", functionName),
                            new ZPair("signature", ZVal.getElement(function, "signature")),
                            new ZPair("startLine", ZVal.getElement(function, "startLine")),
                            new ZPair("executableLines", 0),
                            new ZPair("executedLines", 0),
                            new ZPair("ccn", ZVal.getElement(function, "ccn")),
                            new ZPair("coverage", 0),
                            new ZPair("crap", 0),
                            new ZPair(
                                    "link",
                                    toStringR(link, env)
                                            + toStringR(
                                                    ZVal.getElement(function, "startLine"), env))));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("startLines").value(),
                    ZVal.getElement(function, "startLine"),
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("functions").value(),
                            functionName));
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("endLines").value(),
                    ZVal.getElement(function, "endLine"),
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("functions").value(),
                            functionName));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ccn", typeHint = "int")
    @ConvertedParameter(index = 1, name = "coverage", typeHint = "float")
    private Object crap(RuntimeEnv env, Object... args) {
        Object ccn = assignParameter(args, 0, null);
        Object coverage = assignParameter(args, 1, null);
        if (ZVal.strictEqualityCheck(coverage, "===", 0)) {
            return ZVal.assign(
                    toStringR(ZVal.add(Math.pow(ZVal.toDouble(ccn), ZVal.toDouble(2)), ccn), env));
        }

        if (ZVal.isGreaterThanOrEqualTo(coverage, ">=", 95)) {
            return ZVal.assign(toStringR(ccn, env));
        }

        return ZVal.assign(
                NamespaceGlobal.sprintf
                        .env(env)
                        .call(
                                "%01.2F",
                                ZVal.add(
                                        ZVal.multiply(
                                                Math.pow(ZVal.toDouble(ccn), ZVal.toDouble(2)),
                                                Math.pow(
                                                        ZVal.toDouble(
                                                                ZVal.subtract(
                                                                        1,
                                                                        ZVal.divide(
                                                                                coverage, 100))),
                                                        ZVal.toDouble(3))),
                                        ccn))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "method", typeHint = "array")
    @ConvertedParameter(index = 2, name = "link", typeHint = "string")
    private Object newMethod(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, null);
        Object method = assignParameter(args, 1, null);
        if (ZVal.isNull(method)) {
            method = ZVal.newArray();
        }
        Object link = assignParameter(args, 2, null);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("methodName", methodName),
                        new ZPair("visibility", ZVal.getElement(method, "visibility")),
                        new ZPair("signature", ZVal.getElement(method, "signature")),
                        new ZPair("startLine", ZVal.getElement(method, "startLine")),
                        new ZPair("endLine", ZVal.getElement(method, "endLine")),
                        new ZPair("executableLines", 0),
                        new ZPair("executedLines", 0),
                        new ZPair("ccn", ZVal.getElement(method, "ccn")),
                        new ZPair("coverage", 0),
                        new ZPair("crap", 0),
                        new ZPair(
                                "link",
                                toStringR(link, env)
                                        + toStringR(ZVal.getElement(method, "startLine"), env))));
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractNode.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\File")
                    .setLookup(File.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "cacheTokens",
                            "classes",
                            "coverageData",
                            "endLines",
                            "functions",
                            "id",
                            "linesOfCode",
                            "name",
                            "numClasses",
                            "numExecutableLines",
                            "numExecutedLines",
                            "numMethods",
                            "numTestedClasses",
                            "numTestedFunctions",
                            "numTestedMethods",
                            "numTestedTraits",
                            "numTraits",
                            "parent",
                            "path",
                            "pathArray",
                            "startLines",
                            "testData",
                            "traits")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/File.php")
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
