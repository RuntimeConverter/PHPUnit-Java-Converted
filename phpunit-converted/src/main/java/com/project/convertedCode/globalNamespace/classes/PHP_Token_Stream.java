package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.OutOfBoundsException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLASS;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeInterfaces.SeekableIterator;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token/Stream.php

*/

public class PHP_Token_Stream extends RuntimeClassBase
        implements ArrayAccess, Countable, SeekableIterator {

    public Object filename = null;

    public Object tokens = ZVal.newArray();

    public Object position = 0;

    public Object linesOfCode =
            ZVal.newArray(new ZPair("loc", 0), new ZPair("cloc", 0), new ZPair("ncloc", 0));

    public Object classes = null;

    public Object functions = null;

    public Object includes = null;

    public Object interfaces = null;

    public Object traits = null;

    public Object lineToFunctionMap = ZVal.newArray();

    public PHP_Token_Stream(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_Stream.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sourceCode")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sourceCode = assignParameter(args, 0, null);
        if (NamespaceGlobal.is_file.env(env).call(sourceCode).getBool()) {
            toObjectR(this).accessProp(this, env).name("filename").set(sourceCode);
            sourceCode = function_file_get_contents.f.env(env).call(sourceCode).value();
        }

        env.callMethod(this, "scan", PHP_Token_Stream.class, sourceCode);
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("tokens").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object buffer = null;
        Object token = null;
        buffer = "";
        for (ZPair zpairResult219 : ZVal.getIterable(this, env, true)) {
            token = ZVal.assign(zpairResult219.getValue());
            buffer = toStringR(buffer, env) + toStringR(token, env);
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    public Object getFilename(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("filename").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sourceCode")
    protected Object scan(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object sourceCode = assignParameter(args, 0, null);
        Object tokenClass = null;
        Object line = null;
        Object i = null;
        Object skip = null;
        Object token = ZVal.newArray();
        Object lastNonWhitespaceTokenWasDoubleColon = null;
        Object name = null;
        Object tokens = ZVal.newArray();
        Object id = null;
        Object text = null;
        Object lines = null;
        Object numTokens = null;
        id = 0;
        line = 1;
        tokens = NamespaceGlobal.token_get_all.env(env).call(sourceCode).value();
        numTokens = CRArrayF.count.env(env).call(tokens).value();
        lastNonWhitespaceTokenWasDoubleColon = false;
        runtimeConverterBreakCount = 0;
        for (i = 0; ZVal.isLessThan(i, '<', numTokens); i = ZVal.increment(i)) {
            token = ZVal.assign(ZVal.getElement(tokens, i));
            skip = 0;
            if (function_is_array.f.env(env).call(token).getBool()) {
                name =
                        NamespaceGlobal.substr
                                .env(env)
                                .call(
                                        NamespaceGlobal.token_name
                                                .env(env)
                                                .call(ZVal.getElement(token, 0))
                                                .value(),
                                        2)
                                .value();
                text = ZVal.assign(ZVal.getElement(token, 1));
                if (ZVal.toBool(lastNonWhitespaceTokenWasDoubleColon)
                        && ZVal.toBool(ZVal.equalityCheck(name, "CLASS"))) {
                    name = "CLASS_NAME_CONSTANT";

                } else if (ZVal.toBool(
                                ZVal.toBool(ZVal.equalityCheck(name, "USE"))
                                        && ZVal.toBool(
                                                ZVal.isset(
                                                        ZVal.getElementRecursive(
                                                                tokens, ZVal.add(i, 2), 0))))
                        && ZVal.toBool(
                                ZVal.equalityCheck(
                                        ZVal.getElementRecursive(tokens, ZVal.add(i, 2), 0),
                                        346))) {
                    name = "USE_FUNCTION";
                    text =
                            toStringR(text, env)
                                    + toStringR(
                                            ZVal.getElementRecursive(tokens, ZVal.add(i, 1), 1),
                                            env)
                                    + toStringR(
                                            ZVal.getElementRecursive(tokens, ZVal.add(i, 2), 1),
                                            env);
                    skip = 2;
                }

                tokenClass = "PHP_Token_" + toStringR(name, env);

            } else {
                text = ZVal.assign(token);
                tokenClass =
                        ZVal.assign(
                                ZVal.getElement(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .classes
                                                                .PHP_Token_Stream
                                                                .RequestStaticProperties
                                                                .class)
                                                .customTokens,
                                        token));
            }

            ZVal.addToArray(
                    toObjectR(this).accessProp(this, env).name("tokens").value(),
                    env.createNew(
                            tokenClass, text, line, this, ((long) (id = ZVal.increment(id)) - 1)));
            lines = NamespaceGlobal.substr_count.env(env).call(text, "\n").value();
            line = ZAssignment.add("+=", line, lines);
            if (ZVal.equalityCheck(tokenClass, "PHP_Token_HALT_COMPILER")) {
                break;

            } else if (ZVal.toBool(ZVal.equalityCheck(tokenClass, "PHP_Token_COMMENT"))
                    || ZVal.toBool(ZVal.equalityCheck(tokenClass, "PHP_Token_DOC_COMMENT"))) {
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
                                ZVal.add(lines, 1)));
            }

            if (ZVal.equalityCheck(name, "DOUBLE_COLON")) {
                lastNonWhitespaceTokenWasDoubleColon = true;

            } else if (ZVal.notEqualityCheck(name, "WHITESPACE")) {
                lastNonWhitespaceTokenWasDoubleColon = false;
            }

            i = ZAssignment.add("+=", i, skip);
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                "loc",
                NamespaceGlobal.substr_count.env(env).call(sourceCode, "\n").value());
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                "ncloc",
                ZVal.subtract(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                                "loc"),
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("linesOfCode").value(),
                                "cloc")));
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("tokens").value())
                        .value());
    }

    @ConvertedMethod
    public Object tokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("tokens").value());
    }

    @ConvertedMethod
    public Object getClasses(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("classes").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("classes").value());
        }

        env.callMethod(this, "parse", PHP_Token_Stream.class);
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("classes").value());
    }

    @ConvertedMethod
    public Object getFunctions(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("functions").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("functions").value());
        }

        env.callMethod(this, "parse", PHP_Token_Stream.class);
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("functions").value());
    }

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("interfaces").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("interfaces").value());
        }

        env.callMethod(this, "parse", PHP_Token_Stream.class);
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("interfaces").value());
    }

    @ConvertedMethod
    public Object getTraits(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("traits").value(),
                "!==",
                ZVal.getNull())) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("traits").value());
        }

        env.callMethod(this, "parse", PHP_Token_Stream.class);
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("traits").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "categorize",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "category",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getIncludes(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object categorize = assignParameter(args, 0, null);
        if (ZVal.isNull(categorize)) {
            categorize = false;
        }
        Object category = assignParameter(args, 1, null);
        if (ZVal.isNull(category)) {
            category = ZVal.getNull();
        }
        Object includes = null;
        Object token = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("includes").value(),
                "===",
                ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("includes")
                    .set(
                            ZVal.newArray(
                                    new ZPair("require_once", ZVal.newArray()),
                                    new ZPair("require", ZVal.newArray()),
                                    new ZPair("include_once", ZVal.newArray()),
                                    new ZPair("include", ZVal.newArray())));
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult220 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("tokens").value(),
                            env,
                            true)) {
                token = ZVal.assign(zpairResult220.getValue());
                switch (toStringR(function_get_class.f.env(env).call(token).value())) {
                    case "PHP_Token_REQUIRE_ONCE":
                    case "PHP_Token_REQUIRE":
                    case "PHP_Token_INCLUDE_ONCE":
                    case "PHP_Token_INCLUDE":
                        ZVal.setElementRecursive(
                                toObjectR(this).accessProp(this, env).name("includes").value(),
                                env.callMethod(token, "getName", PHP_Token_Stream.class),
                                env.callMethod(token, "getType", PHP_Token_Stream.class),
                                ZVal.addToArray);
                        break;
                }
                ;
            }
        }

        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("includes").value(),
                        category))) {
            includes =
                    ZVal.assign(
                            ZVal.getElement(
                                    toObjectR(this).accessProp(this, env).name("includes").value(),
                                    category));

        } else if (ZVal.strictEqualityCheck(categorize, "===", false)) {
            includes =
                    CRArrayF.array_merge
                            .env(env)
                            .call(
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("includes")
                                                    .value(),
                                            "require_once"),
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("includes")
                                                    .value(),
                                            "require"),
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("includes")
                                                    .value(),
                                            "include_once"),
                                    ZVal.getElement(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("includes")
                                                    .value(),
                                            "include"))
                            .value();

        } else {
            includes = ZVal.assign(toObjectR(this).accessProp(this, env).name("includes").value());
        }

        return ZVal.assign(includes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object getFunctionForLine(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, null);
        env.callMethod(this, "parse", PHP_Token_Stream.class);
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("lineToFunctionMap").value(),
                        line))) {
            return ZVal.assign(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("lineToFunctionMap").value(),
                            line));
        }

        return null;
    }

    @ConvertedMethod
    protected Object parse(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object tmp = ZVal.newArray();
        Object interfaceEndLine = null;
        Object classEndLine = ZVal.newArray();
        Object name = null;
        Object trait = null;
        Object _pInterface = null;
        Object _pClass = ZVal.newArray();
        Object traitEndLine = null;
        Object token = null;
        toObjectR(this).accessProp(this, env).name("interfaces").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("classes").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("traits").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("functions").set(ZVal.newArray());
        _pClass = ZVal.newArray();
        classEndLine = ZVal.newArray();
        trait = false;
        traitEndLine = false;
        _pInterface = false;
        interfaceEndLine = false;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult221 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("tokens").value(), env, true)) {
            token = ZVal.assign(zpairResult221.getValue());
            switch (toStringR(function_get_class.f.env(env).call(token).value())) {
                case "PHP_Token_HALT_COMPILER":
                    return null;
                case "PHP_Token_INTERFACE":
                    _pInterface = env.callMethod(token, "getName", PHP_Token_Stream.class);
                    interfaceEndLine = env.callMethod(token, "getEndLine", PHP_Token_Stream.class);
                    ZVal.putArrayElement(
                            toObjectR(this).accessProp(this, env).name("interfaces").value(),
                            _pInterface,
                            ZVal.newArray(
                                    new ZPair("methods", ZVal.newArray()),
                                    new ZPair(
                                            "parent",
                                            env.callMethod(
                                                    token, "getParent", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "keywords",
                                            env.callMethod(
                                                    token, "getKeywords", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "docblock",
                                            env.callMethod(
                                                    token, "getDocblock", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "startLine",
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)),
                                    new ZPair("endLine", interfaceEndLine),
                                    new ZPair(
                                            "package",
                                            env.callMethod(
                                                    token, "getPackage", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "file",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("filename")
                                                    .value())));
                    break;
                case "PHP_Token_CLASS":
                case "PHP_Token_TRAIT":
                    tmp =
                            ZVal.newArray(
                                    new ZPair("methods", ZVal.newArray()),
                                    new ZPair(
                                            "parent",
                                            env.callMethod(
                                                    token, "getParent", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "interfaces",
                                            env.callMethod(
                                                    token,
                                                    "getInterfaces",
                                                    PHP_Token_Stream.class)),
                                    new ZPair(
                                            "keywords",
                                            env.callMethod(
                                                    token, "getKeywords", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "docblock",
                                            env.callMethod(
                                                    token, "getDocblock", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "startLine",
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "endLine",
                                            env.callMethod(
                                                    token, "getEndLine", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "package",
                                            env.callMethod(
                                                    token, "getPackage", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "file",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("filename")
                                                    .value()));
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    token, PHP_Token_CLASS.class, "PHP_Token_CLASS"))) {
                        ZVal.addToArray(
                                _pClass, env.callMethod(token, "getName", PHP_Token_Stream.class));
                        ZVal.addToArray(
                                classEndLine,
                                env.callMethod(token, "getEndLine", PHP_Token_Stream.class));
                        ZVal.putArrayElement(
                                toObjectR(this).accessProp(this, env).name("classes").value(),
                                ZVal.getElement(
                                        _pClass,
                                        ZVal.subtract(
                                                CRArrayF.count.env(env).call(_pClass).value(), 1)),
                                tmp);

                    } else {
                        trait = env.callMethod(token, "getName", PHP_Token_Stream.class);
                        traitEndLine = env.callMethod(token, "getEndLine", PHP_Token_Stream.class);
                        ZVal.putArrayElement(
                                toObjectR(this).accessProp(this, env).name("traits").value(),
                                trait,
                                tmp);
                    }

                    break;
                case "PHP_Token_FUNCTION":
                    name = env.callMethod(token, "getName", PHP_Token_Stream.class);
                    tmp =
                            ZVal.newArray(
                                    new ZPair(
                                            "docblock",
                                            env.callMethod(
                                                    token, "getDocblock", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "keywords",
                                            env.callMethod(
                                                    token, "getKeywords", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "visibility",
                                            env.callMethod(
                                                    token,
                                                    "getVisibility",
                                                    PHP_Token_Stream.class)),
                                    new ZPair(
                                            "signature",
                                            env.callMethod(
                                                    token, "getSignature", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "startLine",
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "endLine",
                                            env.callMethod(
                                                    token, "getEndLine", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "ccn",
                                            env.callMethod(
                                                    token, "getCCN", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "file",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("filename")
                                                    .value()));
                    if (ZVal.toBool(
                                    ZVal.toBool(ZVal.isEmpty(_pClass))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(trait, "===", false)))
                            && ZVal.toBool(ZVal.strictEqualityCheck(_pInterface, "===", false))) {
                        ZVal.putArrayElement(
                                toObjectR(this).accessProp(this, env).name("functions").value(),
                                name,
                                tmp);
                        env.callMethod(
                                this,
                                "addFunctionToMap",
                                PHP_Token_Stream.class,
                                name,
                                ZVal.getElement(tmp, "startLine"),
                                ZVal.getElement(tmp, "endLine"));

                    } else if (!ZVal.isEmpty(_pClass)) {
                        ZVal.setElementRecursive(
                                toObjectR(this).accessProp(this, env).name("classes").value(),
                                tmp,
                                ZVal.getElement(
                                        _pClass,
                                        ZVal.subtract(
                                                CRArrayF.count.env(env).call(_pClass).value(), 1)),
                                "methods",
                                name);
                        env.callMethod(
                                this,
                                "addFunctionToMap",
                                PHP_Token_Stream.class,
                                toStringR(
                                                ZVal.getElement(
                                                        _pClass,
                                                        ZVal.subtract(
                                                                CRArrayF.count
                                                                        .env(env)
                                                                        .call(_pClass)
                                                                        .value(),
                                                                1)),
                                                env)
                                        + "::"
                                        + toStringR(name, env),
                                ZVal.getElement(tmp, "startLine"),
                                ZVal.getElement(tmp, "endLine"));

                    } else if (ZVal.strictNotEqualityCheck(trait, "!==", false)) {
                        ZVal.setElementRecursive(
                                toObjectR(this).accessProp(this, env).name("traits").value(),
                                tmp,
                                trait,
                                "methods",
                                name);
                        env.callMethod(
                                this,
                                "addFunctionToMap",
                                PHP_Token_Stream.class,
                                toStringR(trait, env) + "::" + toStringR(name, env),
                                ZVal.getElement(tmp, "startLine"),
                                ZVal.getElement(tmp, "endLine"));

                    } else {
                        ZVal.setElementRecursive(
                                toObjectR(this).accessProp(this, env).name("interfaces").value(),
                                tmp,
                                _pInterface,
                                "methods",
                                name);
                    }

                    break;
                case "PHP_Token_CLOSE_CURLY":
                    if (ZVal.toBool(!ZVal.isEmpty(classEndLine))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            ZVal.getElement(
                                                    classEndLine,
                                                    ZVal.subtract(
                                                            CRArrayF.count
                                                                    .env(env)
                                                                    .call(classEndLine)
                                                                    .value(),
                                                            1)),
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)))) {
                        CRArrayF.array_pop.env(env).call(classEndLine);
                        CRArrayF.array_pop.env(env).call(_pClass);

                    } else if (ZVal.toBool(ZVal.strictNotEqualityCheck(traitEndLine, "!==", false))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            traitEndLine,
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)))) {
                        trait = false;
                        traitEndLine = false;

                    } else if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(interfaceEndLine, "!==", false))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            interfaceEndLine,
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)))) {
                        _pInterface = false;
                        interfaceEndLine = false;
                    }

                    break;
            }
            ;
        }

        return null;
    }

    @ConvertedMethod
    public Object getLinesOfCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("linesOfCode").value());
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("position").set(0);
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tokens").value(),
                                toObjectR(this).accessProp(this, env).name("position").value())));
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("position").value());
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("tokens").value(),
                        toObjectR(this).accessProp(this, env).name("position").value()));
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("position")
                .set(
                        ZVal.increment(
                                toObjectR(this).accessProp(this, env).name("position").value()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tokens").value(),
                                offset)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, null);
        if (!ZVal.isTrue(env.callMethod(this, "offsetExists", PHP_Token_Stream.class, offset))) {
            throw ZVal.getException(
                    env,
                    new OutOfBoundsException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("No token at position \"%s\"", offset)
                                    .value()));
        }

        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("tokens").value(), offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, null);
        Object value = assignParameter(args, 1, null);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("tokens").value(), offset, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, null);
        if (!ZVal.isTrue(env.callMethod(this, "offsetExists", PHP_Token_Stream.class, offset))) {
            throw ZVal.getException(
                    env,
                    new OutOfBoundsException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("No token at position \"%s\"", offset)
                                    .value()));
        }

        ZVal.unsetArrayElement(
                toObjectR(this).accessProp(this, env).name("tokens").value(), offset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "position")
    public Object seek(RuntimeEnv env, Object... args) {
        Object position = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("position").set(position);
        if (!ZVal.isTrue(env.callMethod(this, "valid", PHP_Token_Stream.class))) {
            throw ZVal.getException(
                    env,
                    new OutOfBoundsException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "No token at position \"%s\"",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("position")
                                                    .value())
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "startLine")
    @ConvertedParameter(index = 2, name = "endLine")
    private Object addFunctionToMap(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object startLine = assignParameter(args, 1, null);
        Object endLine = assignParameter(args, 2, null);
        Object line = null;
        for (line = ZVal.assign(startLine);
                ZVal.isLessThanOrEqualTo(line, "<=", endLine);
                line = ZVal.increment(line)) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("lineToFunctionMap").value(),
                    line,
                    name);
        }

        return null;
    }

    public static final Object CONST_class = "PHP_Token_Stream";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object customTokens =
                ZVal.newArray(
                        new ZPair("(", "PHP_Token_OPEN_BRACKET"),
                        new ZPair(")", "PHP_Token_CLOSE_BRACKET"),
                        new ZPair("[", "PHP_Token_OPEN_SQUARE"),
                        new ZPair("]", "PHP_Token_CLOSE_SQUARE"),
                        new ZPair("{", "PHP_Token_OPEN_CURLY"),
                        new ZPair("}", "PHP_Token_CLOSE_CURLY"),
                        new ZPair(";", "PHP_Token_SEMICOLON"),
                        new ZPair(".", "PHP_Token_DOT"),
                        new ZPair(",", "PHP_Token_COMMA"),
                        new ZPair("=", "PHP_Token_EQUAL"),
                        new ZPair("<", "PHP_Token_LT"),
                        new ZPair(">", "PHP_Token_GT"),
                        new ZPair("+", "PHP_Token_PLUS"),
                        new ZPair("-", "PHP_Token_MINUS"),
                        new ZPair("*", "PHP_Token_MULT"),
                        new ZPair("/", "PHP_Token_DIV"),
                        new ZPair("?", "PHP_Token_QUESTION_MARK"),
                        new ZPair("!", "PHP_Token_EXCLAMATION_MARK"),
                        new ZPair(":", "PHP_Token_COLON"),
                        new ZPair("\"", "PHP_Token_DOUBLE_QUOTES"),
                        new ZPair("@", "PHP_Token_AT"),
                        new ZPair("&", "PHP_Token_AMPERSAND"),
                        new ZPair("%", "PHP_Token_PERCENT"),
                        new ZPair("|", "PHP_Token_PIPE"),
                        new ZPair("$", "PHP_Token_DOLLAR"),
                        new ZPair("^", "PHP_Token_CARET"),
                        new ZPair("~", "PHP_Token_TILDE"),
                        new ZPair("`", "PHP_Token_BACKTICK"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_Stream")
                    .setLookup(PHP_Token_Stream.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "classes",
                            "filename",
                            "functions",
                            "includes",
                            "interfaces",
                            "lineToFunctionMap",
                            "linesOfCode",
                            "position",
                            "tokens",
                            "traits")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token/Stream.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Countable")
                    .addInterface("SeekableIterator")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
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
