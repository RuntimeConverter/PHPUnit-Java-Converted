package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.OperatingSystem;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionConstraintParser;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Warning;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.modules.standard.other.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.InvalidCoversTargetException;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.modules.standard.other.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.runtimeconverter.runtime.modules.standard.other.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.CodeCoverageException;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_numeric;
import com.runtimeconverter.runtime.modules.standard.constants.function_defined;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Test.php

*/

public final class Test extends RuntimeClassBase {

    public Test(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_UNKNOWN = -1;

    public static final Object CONST_SMALL = 0;

    public static final Object CONST_MEDIUM = 1;

    public static final Object CONST_LARGE = 2;

    public static final Object CONST_REGEX_DATA_PROVIDER =
            "/@dataProvider\\s+([a-zA-Z0-9._:-\\\\x7f-\\xff]+)/";

    public static final Object CONST_REGEX_TEST_WITH = "/@testWith\\s+/";

    public static final Object CONST_REGEX_EXPECTED_EXCEPTION =
            "(@expectedException\\s+([:.\\w\\\\x7f-\\xff]+)(?:[\\t ]+(\\S*))?(?:[\\t ]+(\\S*))?\\s*$)m";

    public static final Object CONST_REGEX_REQUIRES_VERSION =
            "/@requires\\s+(?P<name>PHP(?:Unit)?)\\s+(?P<operator>[<>=!]{0,2})\\s*(?P<version>[\\d\\.-]+(dev|(RC|alpha|beta)[\\d\\.])?)[ \\t]*\\r?$/m";

    public static final Object CONST_REGEX_REQUIRES_VERSION_CONSTRAINT =
            "/@requires\\s+(?P<name>PHP(?:Unit)?)\\s+(?P<constraint>[\\d\\t -.|~^]+)[ \\t]*\\r?$/m";

    public static final Object CONST_REGEX_REQUIRES_OS =
            "/@requires\\s+(?P<name>OS(?:FAMILY)?)\\s+(?P<value>.+?)[ \\t]*\\r?$/m";

    public static final Object CONST_REGEX_REQUIRES_SETTING =
            "/@requires\\s+(?P<name>setting)\\s+(?P<setting>([^ ]+?))\\s*(?P<value>[\\w\\.-]+[\\w\\.]?)?[ \\t]*\\r?$/m";

    public static final Object CONST_REGEX_REQUIRES =
            "/@requires\\s+(?P<name>function|extension)\\s+(?P<value>([^ ]+?))\\s*(?P<operator>[<>=!]{0,2})\\s*(?P<version>[\\d\\.-]+[\\d\\.]?)?[ \\t]*\\r?$/m";

    public static final Object CONST_class = "PHPUnit\\Util\\Test";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
        public Object describe(RuntimeEnv env, Object... args) {
            Object test = assignParameter(args, 0, null);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, function_get_class.f.env(env).call(test).value()),
                                new ZPair(1, env.callMethod(test, "getName", Test.class))));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test, SelfDescribing.class, "PHPUnit\\Framework\\SelfDescribing"))) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, ""),
                                new ZPair(1, env.callMethod(test, "toString", Test.class))));
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, ""),
                            new ZPair(1, function_get_class.f.env(env).call(test).value())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
        public Object describeAsString(RuntimeEnv env, Object... args) {
            Object test = assignParameter(args, 0, null);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test, SelfDescribing.class, "PHPUnit\\Framework\\SelfDescribing"))) {
                return ZVal.assign(env.callMethod(test, "toString", Test.class));
            }

            return ZVal.assign(function_get_class.f.env(env).call(test).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getLinesToBeCovered(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object annotations = ZVal.newArray();
            annotations =
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
            if (ZVal.toBool(
                            ZVal.isset(
                                    ZVal.getElementRecursive(
                                            annotations, "class", "coversNothing")))
                    || ZVal.toBool(
                            ZVal.isset(
                                    ZVal.getElementRecursive(
                                            annotations, "method", "coversNothing")))) {
                return ZVal.assign(false);
            }

            return ZVal.assign(
                    runtimeStaticObject.getLinesToBeCoveredOrUsed(
                            env, className, methodName, "covers"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getLinesToBeUsed(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            return ZVal.assign(
                    runtimeStaticObject.getLinesToBeCoveredOrUsed(
                            env, className, methodName, "uses"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getRequirements(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object reflector = null;
            Object e = null;
            Object docComment = null;
            Object count = null;
            Object name = null;
            Object i = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Object versionConstraintParser = null;
            Object requires = ZVal.newArray();
            reflector = new ReflectionClass(env, className);
            docComment = env.callMethod(reflector, "getDocComment", Test.class);
            reflector = new ReflectionMethod(env, className, methodName);
            docComment =
                    toStringR(docComment, env)
                            + "\n"
                            + toStringR(
                                    env.callMethod(reflector, "getDocComment", Test.class), env);
            requires = ZVal.newArray();
            if (ZVal.isTrue(
                    count =
                            NamespaceGlobal.preg_match_all
                                    .env(env)
                                    .addReferneceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(CONST_REGEX_REQUIRES_OS, docComment, matches.getObject())
                                    .value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult396 :
                        ZVal.getIterable(
                                CRArrayF.range.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult396.getValue());
                    ZVal.putArrayElement(
                            requires,
                            ZVal.getElementRecursive(matches.getObject(), "name", i),
                            ZVal.getElementRecursive(matches.getObject(), "value", i));
                }
            }

            if (ZVal.isTrue(
                    count =
                            NamespaceGlobal.preg_match_all
                                    .env(env)
                                    .addReferneceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(
                                            CONST_REGEX_REQUIRES_VERSION,
                                            docComment,
                                            matches.getObject())
                                    .value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult397 :
                        ZVal.getIterable(
                                CRArrayF.range.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult397.getValue());
                    ZVal.putArrayElement(
                            requires,
                            ZVal.getElementRecursive(matches.getObject(), "name", i),
                            ZVal.newArray(
                                    new ZPair(
                                            "version",
                                            ZVal.getElementRecursive(
                                                    matches.getObject(), "version", i)),
                                    new ZPair(
                                            "operator",
                                            ZVal.getElementRecursive(
                                                    matches.getObject(), "operator", i))));
                }
            }

            if (ZVal.isTrue(
                    count =
                            NamespaceGlobal.preg_match_all
                                    .env(env)
                                    .addReferneceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(
                                            CONST_REGEX_REQUIRES_VERSION_CONSTRAINT,
                                            docComment,
                                            matches.getObject())
                                    .value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult398 :
                        ZVal.getIterable(
                                CRArrayF.range.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult398.getValue());
                    if (!ZVal.isEmpty(
                            ZVal.getElement(
                                    requires,
                                    ZVal.getElementRecursive(matches.getObject(), "name", i)))) {
                        continue;
                    }

                    try {
                        versionConstraintParser = new VersionConstraintParser(env);
                        ZVal.putArrayElement(
                                requires,
                                toStringR(
                                                ZVal.getElementRecursive(
                                                        matches.getObject(), "name", i),
                                                env)
                                        + "_constraint",
                                ZVal.newArray(
                                        new ZPair(
                                                "constraint",
                                                env.callMethod(
                                                        versionConstraintParser,
                                                        "parse",
                                                        Test.class,
                                                        NamespaceGlobal.trim
                                                                .env(env)
                                                                .call(
                                                                        ZVal.getElementRecursive(
                                                                                matches.getObject(),
                                                                                "constraint",
                                                                                i))
                                                                .value()))));
                    } catch (ConvertedException convertedException62) {
                        if (convertedException62.instanceOf(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PharIo
                                        .namespaces
                                        .Version
                                        .classes
                                        .Exception
                                        .class,
                                "PharIo\\Version\\Exception")) {
                            e = convertedException62.getObject();
                            throw ZVal.getException(
                                    env,
                                    new Warning(
                                            env,
                                            env.callMethod(e, "getMessage", Test.class),
                                            env.callMethod(e, "getCode", Test.class),
                                            e));
                        } else {
                            throw convertedException62;
                        }
                    }
                }
            }

            if (ZVal.isTrue(
                    count =
                            NamespaceGlobal.preg_match_all
                                    .env(env)
                                    .addReferneceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(
                                            CONST_REGEX_REQUIRES_SETTING,
                                            docComment,
                                            matches.getObject())
                                    .value())) {
                ZVal.putArrayElement(requires, "setting", ZVal.newArray());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult399 :
                        ZVal.getIterable(
                                CRArrayF.range.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult399.getValue());
                    ZVal.setElementRecursive(
                            requires,
                            ZVal.getElementRecursive(matches.getObject(), "value", i),
                            "setting",
                            ZVal.getElementRecursive(matches.getObject(), "setting", i));
                }
            }

            if (ZVal.isTrue(
                    count =
                            NamespaceGlobal.preg_match_all
                                    .env(env)
                                    .addReferneceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(CONST_REGEX_REQUIRES, docComment, matches.getObject())
                                    .value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult400 :
                        ZVal.getIterable(
                                CRArrayF.range.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult400.getValue());
                    name =
                            toStringR(ZVal.getElementRecursive(matches.getObject(), "name", i), env)
                                    + "s";
                    if (!ZVal.isset(ZVal.getElement(requires, name))) {
                        ZVal.putArrayElement(requires, name, ZVal.newArray());
                    }

                    ZVal.setElementRecursive(
                            requires,
                            ZVal.getElementRecursive(matches.getObject(), "value", i),
                            name,
                            ZVal.addToArray);
                    if (ZVal.toBool(ZVal.strictNotEqualityCheck(name, "!==", "extensions"))
                            || ZVal.toBool(
                                    ZVal.isEmpty(
                                            ZVal.getElementRecursive(
                                                    matches.getObject(), "version", i)))) {
                        continue;
                    }

                    ZVal.setElementRecursive(
                            requires,
                            ZVal.newArray(
                                    new ZPair(
                                            "version",
                                            ZVal.getElementRecursive(
                                                    matches.getObject(), "version", i)),
                                    new ZPair(
                                            "operator",
                                            ZVal.getElementRecursive(
                                                    matches.getObject(), "operator", i))),
                            "extension_versions",
                            ZVal.getElementRecursive(matches.getObject(), "value", i));
                }
            }

            return ZVal.assign(requires);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getMissingRequirements(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object extension = null;
            Object phpunitVersion = null;
            Object version = null;
            Object required = ZVal.newArray();
            Object operator = null;
            Object requiredOsPattern = null;
            Object actualVersion = null;
            Object setting = null;
            Object pieces = ZVal.newArray();
            Object function = null;
            Object missing = ZVal.newArray();
            Object value = null;
            required = runtimeStaticObject.getRequirements(env, className, methodName);
            missing = ZVal.newArray();
            if (!ZVal.isEmpty(ZVal.getElement(required, "PHP"))) {
                operator =
                        ZVal.assign(
                                ZVal.isEmpty(ZVal.getElementRecursive(required, "PHP", "operator"))
                                        ? ">="
                                        : ZVal.getElementRecursive(required, "PHP", "operator"));
                if (!NamespaceGlobal.version_compare
                        .env(env)
                        .call(
                                "7.1.16",
                                ZVal.getElementRecursive(required, "PHP", "version"),
                                operator)
                        .getBool()) {
                    ZVal.addToArray(
                            missing,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "PHP %s %s is required.",
                                            operator,
                                            ZVal.getElementRecursive(required, "PHP", "version"))
                                    .value());
                }

            } else if (!ZVal.isEmpty(ZVal.getElement(required, "PHP_constraint"))) {
                version =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PharIo
                                .namespaces
                                .Version
                                .classes
                                .Version(
                                env, runtimeStaticObject.sanitizeVersionNumber(env, "7.1.16"));
                if (!ZVal.isTrue(
                        env.callMethod(
                                ZVal.getElementRecursive(required, "PHP_constraint", "constraint"),
                                "complies",
                                Test.class,
                                version))) {
                    ZVal.addToArray(
                            missing,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "PHP version does not match the required constraint %s.",
                                            env.callMethod(
                                                    ZVal.getElementRecursive(
                                                            required,
                                                            "PHP_constraint",
                                                            "constraint"),
                                                    "asString",
                                                    Test.class))
                                    .value());
                }
            }

            if (!ZVal.isEmpty(ZVal.getElement(required, "PHPUnit"))) {
                phpunitVersion =
                        com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces
                                .Runner.classes.Version.runtimeStaticObject.id(env);
                operator =
                        ZVal.assign(
                                ZVal.isEmpty(
                                                ZVal.getElementRecursive(
                                                        required, "PHPUnit", "operator"))
                                        ? ">="
                                        : ZVal.getElementRecursive(
                                                required, "PHPUnit", "operator"));
                if (!NamespaceGlobal.version_compare
                        .env(env)
                        .call(
                                phpunitVersion,
                                ZVal.getElementRecursive(required, "PHPUnit", "version"),
                                operator)
                        .getBool()) {
                    ZVal.addToArray(
                            missing,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "PHPUnit %s %s is required.",
                                            operator,
                                            ZVal.getElementRecursive(
                                                    required, "PHPUnit", "version"))
                                    .value());
                }

            } else if (!ZVal.isEmpty(ZVal.getElement(required, "PHPUnit_constraint"))) {
                phpunitVersion =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PharIo
                                .namespaces
                                .Version
                                .classes
                                .Version(
                                env,
                                runtimeStaticObject.sanitizeVersionNumber(
                                        env,
                                        com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                                .namespaces.Runner.classes.Version
                                                .runtimeStaticObject.id(env)));
                if (!ZVal.isTrue(
                        env.callMethod(
                                ZVal.getElementRecursive(
                                        required, "PHPUnit_constraint", "constraint"),
                                "complies",
                                Test.class,
                                phpunitVersion))) {
                    ZVal.addToArray(
                            missing,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "PHPUnit version does not match the required constraint %s.",
                                            env.callMethod(
                                                    ZVal.getElementRecursive(
                                                            required,
                                                            "PHPUnit_constraint",
                                                            "constraint"),
                                                    "asString",
                                                    Test.class))
                                    .value());
                }
            }

            if (ZVal.toBool(!ZVal.isEmpty(ZVal.getElement(required, "OSFAMILY")))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    ZVal.getElement(required, "OSFAMILY"),
                                    "!==",
                                    env.callMethod(
                                            new OperatingSystem(env), "getFamily", Test.class)))) {
                ZVal.addToArray(
                        missing,
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "Operating system %s is required.",
                                        ZVal.getElement(required, "OSFAMILY"))
                                .value());
            }

            if (!ZVal.isEmpty(ZVal.getElement(required, "OS"))) {
                requiredOsPattern =
                        NamespaceGlobal.sprintf
                                .env(env)
                                .call(
                                        "/%s/i",
                                        NamespaceGlobal.addcslashes
                                                .env(env)
                                                .call(ZVal.getElement(required, "OS"), "/")
                                                .value())
                                .value();
                if (!NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences())
                        .call(requiredOsPattern, "Linux")
                        .getBool()) {
                    ZVal.addToArray(
                            missing,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Operating system matching %s is required.",
                                            requiredOsPattern)
                                    .value());
                }
            }

            if (!ZVal.isEmpty(ZVal.getElement(required, "functions"))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult401 :
                        ZVal.getIterable(ZVal.getElement(required, "functions"), env, true)) {
                    function = ZVal.assign(zpairResult401.getValue());
                    pieces = NamespaceGlobal.explode.env(env).call("::", function).value();
                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            CRArrayF.count.env(env).call(pieces).value(), "===", 2))
                            && ZVal.toBool(
                                    function_method_exists
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.getElement(pieces, 0),
                                                    ZVal.getElement(pieces, 1))
                                            .value())) {
                        continue;
                    }

                    if (NamespaceGlobal.function_exists.env(env).call(function).getBool()) {
                        continue;
                    }

                    ZVal.addToArray(
                            missing,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("Function %s is required.", function)
                                    .value());
                }
            }

            if (!ZVal.isEmpty(ZVal.getElement(required, "setting"))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult402 :
                        ZVal.getIterable(ZVal.getElement(required, "setting"), env, false)) {
                    setting = ZVal.assign(zpairResult402.getKey());
                    value = ZVal.assign(zpairResult402.getValue());
                    if (ZVal.notEqualityCheck(
                            NamespaceGlobal.ini_get.env(env).call(setting).value(), value)) {
                        ZVal.addToArray(
                                missing,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Setting \"%s\" must be \"%s\".", setting, value)
                                        .value());
                    }
                }
            }

            if (!ZVal.isEmpty(ZVal.getElement(required, "extensions"))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult403 :
                        ZVal.getIterable(ZVal.getElement(required, "extensions"), env, true)) {
                    extension = ZVal.assign(zpairResult403.getValue());
                    if (ZVal.isset(
                            ZVal.getElementRecursive(required, "extension_versions", extension))) {
                        continue;
                    }

                    if (!NamespaceGlobal.extension_loaded.env(env).call(extension).getBool()) {
                        ZVal.addToArray(
                                missing,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call("Extension %s is required.", extension)
                                        .value());
                    }
                }
            }

            if (!ZVal.isEmpty(ZVal.getElement(required, "extension_versions"))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult404 :
                        ZVal.getIterable(
                                ZVal.getElement(required, "extension_versions"), env, false)) {
                    extension = ZVal.assign(zpairResult404.getKey());
                    required = ZVal.assign(zpairResult404.getValue());
                    actualVersion = NamespaceGlobal.phpversion.env(env).call(extension).value();
                    operator =
                            ZVal.assign(
                                    ZVal.isEmpty(ZVal.getElement(required, "operator"))
                                            ? ">="
                                            : ZVal.getElement(required, "operator"));
                    if (ZVal.toBool(ZVal.strictEqualityCheck(actualVersion, "===", false))
                            || ZVal.toBool(
                                    !NamespaceGlobal.version_compare
                                            .env(env)
                                            .call(
                                                    actualVersion,
                                                    ZVal.getElement(required, "version"),
                                                    operator)
                                            .getBool())) {
                        ZVal.addToArray(
                                missing,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "Extension %s %s %s is required.",
                                                extension,
                                                operator,
                                                ZVal.getElement(required, "version"))
                                        .value());
                    }
                }
            }

            return ZVal.assign(missing);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object getExpectedException(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object code = null;
            Object messageRegExp = null;
            Object reflector = null;
            Object docComment = null;
            Object annotations = ZVal.newArray();
            Object message = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Object _pClass = null;
            reflector = new ReflectionMethod(env, className, methodName);
            docComment = env.callMethod(reflector, "getDocComment", Test.class);
            docComment = NamespaceGlobal.substr.env(env).call(docComment, 3, -2).value();
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(CONST_REGEX_EXPECTED_EXCEPTION, docComment, matches.getObject())
                    .getBool()) {
                annotations =
                        runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
                _pClass = ZVal.assign(ZVal.getElement(matches.getObject(), 1));
                code = ZVal.getNull();
                message = "";
                messageRegExp = "";
                if (ZVal.isset(ZVal.getElement(matches.getObject(), 2))) {
                    message =
                            NamespaceGlobal.trim
                                    .env(env)
                                    .call(ZVal.getElement(matches.getObject(), 2))
                                    .value();

                } else if (ZVal.isset(
                        ZVal.getElementRecursive(
                                annotations, "method", "expectedExceptionMessage"))) {
                    message =
                            runtimeStaticObject.parseAnnotationContent(
                                    env,
                                    ZVal.getElementRecursive(
                                            annotations, "method", "expectedExceptionMessage", 0));
                }

                if (ZVal.isset(
                        ZVal.getElementRecursive(
                                annotations, "method", "expectedExceptionMessageRegExp"))) {
                    messageRegExp =
                            runtimeStaticObject.parseAnnotationContent(
                                    env,
                                    ZVal.getElementRecursive(
                                            annotations,
                                            "method",
                                            "expectedExceptionMessageRegExp",
                                            0));
                }

                if (ZVal.isset(ZVal.getElement(matches.getObject(), 3))) {
                    code = ZVal.assign(ZVal.getElement(matches.getObject(), 3));

                } else if (ZVal.isset(
                        ZVal.getElementRecursive(annotations, "method", "expectedExceptionCode"))) {
                    code =
                            runtimeStaticObject.parseAnnotationContent(
                                    env,
                                    ZVal.getElementRecursive(
                                            annotations, "method", "expectedExceptionCode", 0));
                }

                if (function_is_numeric.f.env(env).call(code).getBool()) {
                    code = ZVal.assign(ZVal.toLong(code));

                } else if (ZVal.toBool(function_is_string.f.env(env).call(code).value())
                        && ZVal.toBool(function_defined.f.env(env).call(code).value())) {
                    code =
                            ZVal.assign(
                                    ZVal.toLong(function_constant.f.env(env).call(code).value()));
                }

                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair("class", _pClass),
                                new ZPair("code", code),
                                new ZPair("message", message),
                                new ZPair("message_regex", messageRegExp)));
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getProvidedData(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object data = null;
            Object reflector = null;
            Object docComment = null;
            Object value = null;
            Object key = null;
            reflector = new ReflectionMethod(env, className, methodName);
            docComment = env.callMethod(reflector, "getDocComment", Test.class);
            data =
                    runtimeStaticObject.getDataFromDataProviderAnnotation(
                            env, docComment, className, methodName);
            if (ZVal.strictEqualityCheck(data, "===", ZVal.getNull())) {
                data = runtimeStaticObject.getDataFromTestWithAnnotation(env, docComment);
            }

            if (ZVal.toBool(function_is_array.f.env(env).call(data).value())
                    && ZVal.toBool(ZVal.isEmpty(data))) {
                throw ZVal.getException(env, new SkippedTestError(env));
            }

            if (ZVal.strictNotEqualityCheck(data, "!==", ZVal.getNull())) {
                for (ZPair zpairResult405 : ZVal.getIterable(data, env, false)) {
                    key = ZVal.assign(zpairResult405.getKey());
                    value = ZVal.assign(zpairResult405.getValue());
                    if (!function_is_array.f.env(env).call(value).getBool()) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Data set %s is invalid.",
                                                        function_is_int
                                                                        .f
                                                                        .env(env)
                                                                        .call(key)
                                                                        .getBool()
                                                                ? "#" + toStringR(key, env)
                                                                : "\"" + toStringR(key, env) + "\"")
                                                .value()));
                    }
                }
            }

            return ZVal.assign(data);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docComment", typeHint = "string")
        public Object getDataFromTestWithAnnotation(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object docComment = assignParameter(args, 0, null);
            Object candidateRow = ZVal.newArray();
            Object annotationContent = null;
            Object offset = null;
            Object data = ZVal.newArray();
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Object dataSet = null;
            docComment = runtimeStaticObject.cleanUpMultiLineAnnotation(env, docComment);
            if (NamespaceGlobal.preg_match
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(CONST_REGEX_TEST_WITH, docComment, matches.getObject(), 256)
                    .getBool()) {
                offset =
                        ZVal.add(
                                NamespaceGlobal.strlen
                                        .env(env)
                                        .call(ZVal.getElementRecursive(matches.getObject(), 0, 0))
                                        .value(),
                                ZVal.getElementRecursive(matches.getObject(), 0, 1));
                annotationContent =
                        NamespaceGlobal.substr.env(env).call(docComment, offset).value();
                data = ZVal.newArray();
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult406 :
                        ZVal.getIterable(
                                NamespaceGlobal.explode
                                        .env(env)
                                        .call("\n", annotationContent)
                                        .value(),
                                env,
                                true)) {
                    candidateRow = ZVal.assign(zpairResult406.getValue());
                    candidateRow = NamespaceGlobal.trim.env(env).call(candidateRow).value();
                    if (ZVal.strictNotEqualityCheck(ZVal.getElement(candidateRow, 0), "!==", "[")) {
                        break;
                    }

                    dataSet = NamespaceGlobal.json_decode.env(env).call(candidateRow, true).value();
                    if (ZVal.strictNotEqualityCheck(
                            NamespaceGlobal.json_last_error.env(env).call().value(), "!==", 0)) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        "The data set for the @testWith annotation cannot be parsed: "
                                                + toStringR(
                                                        NamespaceGlobal.json_last_error_msg
                                                                .env(env)
                                                                .call()
                                                                .value(),
                                                        env)));
                    }

                    ZVal.addToArray(data, dataSet);
                }

                if (!ZVal.isTrue(data)) {
                    throw ZVal.getException(
                            env,
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .classes
                                    .Exception(
                                    env,
                                    "The data set for the @testWith annotation cannot be parsed."));
                }

                return ZVal.assign(data);
            }

            return ZVal.assign(ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object parseTestMethodAnnotations(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            if (ZVal.isNull(methodName)) {
                methodName = "";
            }
            Object traits = null;
            Object cacheKey = null;
            Object method = null;
            Object e = null;
            Object annotations = null;
            Object trait = null;
            Object _pClass = null;
            if (!ZVal.isset(
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Test
                                                    .RequestStaticProperties
                                                    .class)
                                    .annotationCache,
                            className))) {
                _pClass = new ReflectionClass(env, className);
                traits = env.callMethod(_pClass, "getTraits", Test.class);
                annotations = ZVal.newArray();
                for (ZPair zpairResult407 : ZVal.getIterable(traits, env, true)) {
                    trait = ZVal.assign(zpairResult407.getValue());
                    annotations =
                            CRArrayF.array_merge
                                    .env(env)
                                    .call(
                                            annotations,
                                            runtimeStaticObject.parseAnnotations(
                                                    env,
                                                    env.callMethod(
                                                            trait, "getDocComment", Test.class)))
                                    .value();
                }

                ZVal.putArrayElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Util
                                                .classes
                                                .Test
                                                .RequestStaticProperties
                                                .class)
                                .annotationCache,
                        className,
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        annotations,
                                        runtimeStaticObject.parseAnnotations(
                                                env,
                                                env.callMethod(
                                                        _pClass, "getDocComment", Test.class)))
                                .value());
            }

            cacheKey = toStringR(className, env) + "::" + toStringR(methodName, env);
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(methodName, "!==", ZVal.getNull()))
                    && ZVal.toBool(
                            !ZVal.isset(
                                    ZVal.getElement(
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .annotationCache,
                                            cacheKey)))) {
                try {
                    method = new ReflectionMethod(env, className, methodName);
                    annotations =
                            runtimeStaticObject.parseAnnotations(
                                    env, env.callMethod(method, "getDocComment", Test.class));
                } catch (ConvertedException convertedException63) {
                    if (convertedException63.instanceOf(
                            ReflectionException.class, "ReflectionException")) {
                        e = convertedException63.getObject();
                        annotations = ZVal.newArray();
                    } else {
                        throw convertedException63;
                    }
                }

                ZVal.putArrayElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Util
                                                .classes
                                                .Test
                                                .RequestStaticProperties
                                                .class)
                                .annotationCache,
                        cacheKey,
                        annotations);
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "class",
                                    ZVal.getElement(
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .annotationCache,
                                            className)),
                            new ZPair(
                                    "method",
                                    ZVal.strictNotEqualityCheck(methodName, "!==", ZVal.getNull())
                                            ? ZVal.getElement(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .PHPUnit
                                                                            .namespaces
                                                                            .Util
                                                                            .classes
                                                                            .Test
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .annotationCache,
                                                    cacheKey)
                                            : ZVal.newArray())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getInlineAnnotations(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object endLine = null;
            Object methodLines = null;
            Object code = null;
            Object method = null;
            Object line = null;
            Object startLine = null;
            Object annotations = ZVal.newArray();
            Object lineNumber = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            method = new ReflectionMethod(env, className, methodName);
            code =
                    NamespaceGlobal.file
                            .env(env)
                            .call(env.callMethod(method, "getFileName", Test.class))
                            .value();
            lineNumber = env.callMethod(method, "getStartLine", Test.class);
            startLine = ZVal.subtract(env.callMethod(method, "getStartLine", Test.class), 1);
            endLine = ZVal.subtract(env.callMethod(method, "getEndLine", Test.class), 1);
            methodLines =
                    CRArrayF.array_slice
                            .env(env)
                            .call(code, startLine, ZVal.add(ZVal.subtract(endLine, startLine), 1))
                            .value();
            annotations = ZVal.newArray();
            for (ZPair zpairResult408 : ZVal.getIterable(methodLines, env, true)) {
                line = ZVal.assign(zpairResult408.getValue());
                if (NamespaceGlobal.preg_match
                        .env(env)
                        .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                "#/\\*\\*?\\s*@(?P<name>[A-Za-z_-]+)(?:[ \\t]+(?P<value>.*?))?[ \\t]*\\r?\\*/$#m",
                                line,
                                matches.getObject())
                        .getBool()) {
                    ZVal.putArrayElement(
                            annotations,
                            NamespaceGlobal.strtolower
                                    .env(env)
                                    .call(ZVal.getElement(matches.getObject(), "name"))
                                    .value(),
                            ZVal.newArray(
                                    new ZPair("line", lineNumber),
                                    new ZPair(
                                            "value",
                                            ZVal.getElement(matches.getObject(), "value"))));
                }

                lineNumber = ZVal.increment(lineNumber);
            }

            return ZVal.assign(annotations);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docBlock", typeHint = "string")
        public Object parseAnnotations(RuntimeEnv env, Object... args) {
            Object docBlock = assignParameter(args, 0, null);
            Object numMatches = null;
            Object annotations = ZVal.newArray();
            Object i = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            annotations = ZVal.newArray();
            docBlock = NamespaceGlobal.substr.env(env).call(docBlock, 3, -2).value();
            if (NamespaceGlobal.preg_match_all
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/@(?P<name>[A-Za-z_-]+)(?:[ \\t]+(?P<value>.*?))?[ \\t]*\\r?$/m",
                            docBlock,
                            matches.getObject())
                    .getBool()) {
                numMatches =
                        CRArrayF.count
                                .env(env)
                                .call(ZVal.getElement(matches.getObject(), 0))
                                .value();
                for (i = 0; ZVal.isLessThan(i, '<', numMatches); i = ZVal.increment(i)) {
                    ZVal.setElementRecursive(
                            annotations,
                            toStringR(
                                    ZVal.getElementRecursive(matches.getObject(), "value", i), env),
                            ZVal.getElementRecursive(matches.getObject(), "name", i),
                            ZVal.addToArray);
                }
            }

            return ZVal.assign(annotations);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getBackupSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "backupGlobals",
                                    runtimeStaticObject.getBooleanAnnotationSetting(
                                            env, className, methodName, "backupGlobals")),
                            new ZPair(
                                    "backupStaticAttributes",
                                    runtimeStaticObject.getBooleanAnnotationSetting(
                                            env,
                                            className,
                                            methodName,
                                            "backupStaticAttributes"))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getDependencies(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object annotations = ZVal.newArray();
            Object dependencies = null;
            annotations =
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
            dependencies = ZVal.newArray();
            if (ZVal.isset(ZVal.getElementRecursive(annotations, "class", "depends"))) {
                dependencies =
                        ZVal.assign(ZVal.getElementRecursive(annotations, "class", "depends"));
            }

            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", "depends"))) {
                dependencies =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        dependencies,
                                        ZVal.getElementRecursive(annotations, "method", "depends"))
                                .value();
            }

            return ZVal.assign(CRArrayF.array_unique.env(env).call(dependencies).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object getErrorHandlerSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            return ZVal.assign(
                    runtimeStaticObject.getBooleanAnnotationSetting(
                            env, className, methodName, "errorHandler"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object getGroups(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            if (ZVal.isNull(methodName)) {
                methodName = "";
            }
            Object size = null;
            Object annotations = ZVal.newArray();
            Object groups = ZVal.newArray();
            Object element = null;
            annotations =
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
            groups = ZVal.newArray();
            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", "author"))) {
                groups = ZVal.assign(ZVal.getElementRecursive(annotations, "method", "author"));

            } else if (ZVal.isset(ZVal.getElementRecursive(annotations, "class", "author"))) {
                groups = ZVal.assign(ZVal.getElementRecursive(annotations, "class", "author"));
            }

            if (ZVal.isset(ZVal.getElementRecursive(annotations, "class", "group"))) {
                groups =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        groups,
                                        ZVal.getElementRecursive(annotations, "class", "group"))
                                .value();
            }

            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", "group"))) {
                groups =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        groups,
                                        ZVal.getElementRecursive(annotations, "method", "group"))
                                .value();
            }

            if (ZVal.isset(ZVal.getElementRecursive(annotations, "class", "ticket"))) {
                groups =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        groups,
                                        ZVal.getElementRecursive(annotations, "class", "ticket"))
                                .value();
            }

            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", "ticket"))) {
                groups =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        groups,
                                        ZVal.getElementRecursive(annotations, "method", "ticket"))
                                .value();
            }

            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult409 :
                    ZVal.getIterable(
                            ZVal.newArray(new ZPair(0, "method"), new ZPair(1, "class")),
                            env,
                            true)) {
                element = ZVal.assign(zpairResult409.getValue());
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult410 :
                        ZVal.getIterable(
                                ZVal.newArray(
                                        new ZPair(0, "small"),
                                        new ZPair(1, "medium"),
                                        new ZPair(2, "large")),
                                env,
                                true)) {
                    size = ZVal.assign(zpairResult410.getValue());
                    if (ZVal.isset(ZVal.getElementRecursive(annotations, element, size))) {
                        ZVal.addToArray(groups, size);
                        runtimeConverterBreakCount = 2;
                        runtimeConverterBreakCount--;
                        break;
                    }
                }
            }

            return ZVal.assign(CRArrayF.array_unique.env(env).call(groups).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object getSize(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object groups = ZVal.newArray();
            groups =
                    CRArrayF.array_flip
                            .env(env)
                            .call(runtimeStaticObject.getGroups(env, className, methodName))
                            .value();
            if (ZVal.isset(ZVal.getElement(groups, "large"))) {
                return ZVal.assign(CONST_LARGE);
            }

            if (ZVal.isset(ZVal.getElement(groups, "medium"))) {
                return ZVal.assign(CONST_MEDIUM);
            }

            if (ZVal.isset(ZVal.getElement(groups, "small"))) {
                return ZVal.assign(CONST_SMALL);
            }

            return ZVal.assign(CONST_UNKNOWN);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getProcessIsolationSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object annotations = ZVal.newArray();
            annotations =
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.isset(
                                            ZVal.getElementRecursive(
                                                    annotations,
                                                    "class",
                                                    "runTestsInSeparateProcesses")))
                            || ZVal.toBool(
                                    ZVal.isset(
                                            ZVal.getElementRecursive(
                                                    annotations,
                                                    "method",
                                                    "runInSeparateProcess"))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getClassProcessIsolationSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object annotations = ZVal.newArray();
            annotations =
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
            return ZVal.assign(
                    ZVal.isset(
                            ZVal.getElementRecursive(
                                    annotations, "class", "runClassInSeparateProcess")));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getPreserveGlobalStateSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            return ZVal.assign(
                    runtimeStaticObject.getBooleanAnnotationSetting(
                            env, className, methodName, "preserveGlobalState"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        public Object getHookMethods(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object method = null;
            Object e = null;
            Object _pClass = null;
            if (!function_class_exists.f.env(env).call(className, false).getBool()) {
                return ZVal.assign(runtimeStaticObject.emptyHookMethodsArray(env));
            }

            if (!ZVal.isset(
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Test
                                                    .RequestStaticProperties
                                                    .class)
                                    .hookMethods,
                            className))) {
                ZVal.putArrayElement(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Util
                                                .classes
                                                .Test
                                                .RequestStaticProperties
                                                .class)
                                .hookMethods,
                        className,
                        runtimeStaticObject.emptyHookMethodsArray(env));
                try {
                    _pClass = new ReflectionClass(env, className);
                    for (ZPair zpairResult411 :
                            ZVal.getIterable(
                                    env.callMethod(_pClass, "getMethods", Test.class), env, true)) {
                        method = ZVal.assign(zpairResult411.getValue());
                        if (ZVal.isTrue(runtimeStaticObject.isBeforeClassMethod(env, method))) {
                            CRArrayF.array_unshift
                                    .env(env)
                                    .call(
                                            ZVal.getElementRecursive(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .PHPUnit
                                                                            .namespaces
                                                                            .Util
                                                                            .classes
                                                                            .Test
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .hookMethods,
                                                    className,
                                                    "beforeClass"),
                                            env.callMethod(method, "getName", Test.class));
                        }

                        if (ZVal.isTrue(runtimeStaticObject.isBeforeMethod(env, method))) {
                            CRArrayF.array_unshift
                                    .env(env)
                                    .call(
                                            ZVal.getElementRecursive(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .PHPUnit
                                                                            .namespaces
                                                                            .Util
                                                                            .classes
                                                                            .Test
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .hookMethods,
                                                    className,
                                                    "before"),
                                            env.callMethod(method, "getName", Test.class));
                        }

                        if (ZVal.isTrue(runtimeStaticObject.isAfterMethod(env, method))) {
                            ZVal.setElementRecursive(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .PHPUnit
                                                            .namespaces
                                                            .Util
                                                            .classes
                                                            .Test
                                                            .RequestStaticProperties
                                                            .class)
                                            .hookMethods,
                                    env.callMethod(method, "getName", Test.class),
                                    className,
                                    "after",
                                    ZVal.addToArray);
                        }

                        if (ZVal.isTrue(runtimeStaticObject.isAfterClassMethod(env, method))) {
                            ZVal.setElementRecursive(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .PHPUnit
                                                            .namespaces
                                                            .Util
                                                            .classes
                                                            .Test
                                                            .RequestStaticProperties
                                                            .class)
                                            .hookMethods,
                                    env.callMethod(method, "getName", Test.class),
                                    className,
                                    "afterClass",
                                    ZVal.addToArray);
                        }
                    }

                } catch (ConvertedException convertedException64) {
                    if (convertedException64.instanceOf(
                            ReflectionException.class, "ReflectionException")) {
                        e = convertedException64.getObject();
                    } else {
                        throw convertedException64;
                    }
                }
            }

            return ZVal.assign(
                    ZVal.getElement(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Test
                                                    .RequestStaticProperties
                                                    .class)
                                    .hookMethods,
                            className));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "mode", typeHint = "string")
        private Object getLinesToBeCoveredOrUsed(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object mode = assignParameter(args, 2, null);
            Object annotations = ZVal.newArray();
            Object codeList = null;
            Object list = null;
            Object classShortcut = null;
            Object element = ZVal.newArray();
            annotations =
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
            classShortcut = ZVal.getNull();
            if (!ZVal.isEmpty(
                    ZVal.getElementRecursive(
                            annotations, "class", toStringR(mode, env) + "DefaultClass"))) {
                if (ZVal.isGreaterThan(
                        CRArrayF.count
                                .env(env)
                                .call(
                                        ZVal.getElementRecursive(
                                                annotations,
                                                "class",
                                                toStringR(mode, env) + "DefaultClass"))
                                .value(),
                        '>',
                        1)) {
                    throw ZVal.getException(
                            env,
                            new CodeCoverageException(
                                    env,
                                    NamespaceGlobal.sprintf
                                            .env(env)
                                            .call(
                                                    "More than one @%sClass annotation in class or interface \"%s\".",
                                                    mode, className)
                                            .value()));
                }

                classShortcut =
                        ZVal.assign(
                                ZVal.getElementRecursive(
                                        annotations,
                                        "class",
                                        toStringR(mode, env) + "DefaultClass",
                                        0));
            }

            list = ZVal.newArray();
            if (ZVal.isset(ZVal.getElementRecursive(annotations, "class", mode))) {
                list = ZVal.assign(ZVal.getElementRecursive(annotations, "class", mode));
            }

            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", mode))) {
                list =
                        CRArrayF.array_merge
                                .env(env)
                                .call(list, ZVal.getElementRecursive(annotations, "method", mode))
                                .value();
            }

            codeList = ZVal.newArray();
            for (ZPair zpairResult412 :
                    ZVal.getIterable(
                            CRArrayF.array_unique.env(env).call(list).value(), env, true)) {
                element = ZVal.assign(zpairResult412.getValue());
                if (ZVal.toBool(classShortcut)
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.strncmp
                                                .env(env)
                                                .call(element, "::", 2)
                                                .value(),
                                        "===",
                                        0))) {
                    element = toStringR(classShortcut, env) + toStringR(element, env);
                }

                element =
                        NamespaceGlobal.preg_replace
                                .env(env)
                                .addReferneceArgs(new RuntimeArgsWithReferences())
                                .call("/[\\s()]+$/", "", element)
                                .value();
                element = NamespaceGlobal.explode.env(env).call(" ", element).value();
                element = ZVal.assign(ZVal.getElement(element, 0));
                codeList =
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        codeList,
                                        runtimeStaticObject.resolveElementToReflectionObjects(
                                                env, element))
                                .value();
            }

            return ZVal.assign(runtimeStaticObject.resolveReflectionObjectsToLines(env, codeList));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message", typeHint = "string")
        private Object parseAnnotationContent(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, null);
            if (ZVal.toBool(function_defined.f.env(env).call(message).value())
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    NamespaceGlobal.strpos
                                                            .env(env)
                                                            .call(message, "::")
                                                            .value(),
                                                    "!==",
                                                    false))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    ZVal.add(
                                                            NamespaceGlobal.substr_count
                                                                    .env(env)
                                                                    .call(message, "::")
                                                                    .value(),
                                                            1),
                                                    "===",
                                                    2)))) {
                message = function_constant.f.env(env).call(message).value();
            }

            return ZVal.assign(message);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docComment", typeHint = "string")
        @ConvertedParameter(index = 1, name = "className", typeHint = "string")
        @ConvertedParameter(index = 2, name = "methodName", typeHint = "string")
        private Object getDataFromDataProviderAnnotation(RuntimeEnv env, Object... args) {
            Object docComment = assignParameter(args, 0, null);
            Object className = assignParameter(args, 1, null);
            Object methodName = assignParameter(args, 2, null);
            Object data = ZVal.newArray();
            Object match = null;
            Object dataProviderClassName = null;
            Object origData = null;
            Object leaf = null;
            Object dataProviderMethod = null;
            ReferenceContainer matches = new BasicReferenceContainer(ZVal.newArray());
            Object result = null;
            Object dataProviderClass = null;
            Object dataProviderMethodNameNamespace = null;
            Object dataProviderMethodName = null;
            Object value = null;
            Object key = null;
            Object _object = null;
            if (NamespaceGlobal.preg_match_all
                    .env(env)
                    .addReferneceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(CONST_REGEX_DATA_PROVIDER, docComment, matches.getObject())
                    .getBool()) {
                result = ZVal.newArray();
                for (ZPair zpairResult413 :
                        ZVal.getIterable(ZVal.getElement(matches.getObject(), 1), env, true)) {
                    match = ZVal.assign(zpairResult413.getValue());
                    dataProviderMethodNameNamespace =
                            NamespaceGlobal.explode.env(env).call("\\", match).value();
                    leaf =
                            NamespaceGlobal.explode
                                    .env(env)
                                    .call(
                                            "::",
                                            CRArrayF.array_pop
                                                    .env(env)
                                                    .call(dataProviderMethodNameNamespace)
                                                    .value())
                                    .value();
                    dataProviderMethodName = CRArrayF.array_pop.env(env).call(leaf).value();
                    if (ZVal.isEmpty(dataProviderMethodNameNamespace)) {
                        dataProviderMethodNameNamespace = "";

                    } else {
                        dataProviderMethodNameNamespace =
                                toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("\\", dataProviderMethodNameNamespace)
                                                        .value(),
                                                env)
                                        + "\\";
                    }

                    if (ZVal.isEmpty(leaf)) {
                        dataProviderClassName = ZVal.assign(className);

                    } else {
                        dataProviderClassName =
                                toStringR(dataProviderMethodNameNamespace, env)
                                        + toStringR(
                                                CRArrayF.array_pop.env(env).call(leaf).value(),
                                                env);
                    }

                    dataProviderClass = new ReflectionClass(env, dataProviderClassName);
                    dataProviderMethod =
                            env.callMethod(
                                    dataProviderClass,
                                    "getMethod",
                                    Test.class,
                                    dataProviderMethodName);
                    if (ZVal.isTrue(env.callMethod(dataProviderMethod, "isStatic", Test.class))) {
                        _object = ZVal.getNull();

                    } else {
                        _object = env.callMethod(dataProviderClass, "newInstance", Test.class);
                    }

                    if (ZVal.strictEqualityCheck(
                            env.callMethod(dataProviderMethod, "getNumberOfParameters", Test.class),
                            "===",
                            0)) {
                        data = env.callMethod(dataProviderMethod, "invoke", Test.class, _object);

                    } else {
                        data =
                                env.callMethod(
                                        dataProviderMethod,
                                        "invoke",
                                        Test.class,
                                        _object,
                                        methodName);
                    }

                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(data, Traversable.class, "Traversable"))) {
                        origData = ZVal.assign(data);
                        data = ZVal.newArray();
                        for (ZPair zpairResult414 : ZVal.getIterable(origData, env, false)) {
                            key = ZVal.assign(zpairResult414.getKey());
                            value = ZVal.assign(zpairResult414.getValue());
                            if (function_is_int.f.env(env).call(key).getBool()) {
                                ZVal.addToArray(data, value);

                            } else {
                                ZVal.putArrayElement(data, key, value);
                            }
                        }
                    }

                    if (function_is_array.f.env(env).call(data).getBool()) {
                        result = CRArrayF.array_merge.env(env).call(result, data).value();
                    }
                }

                return ZVal.assign(result);
            }

            return ZVal.assign(ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docComment", typeHint = "string")
        private Object cleanUpMultiLineAnnotation(RuntimeEnv env, Object... args) {
            Object docComment = assignParameter(args, 0, null);
            docComment =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call("\r\n", "\n", docComment)
                            .value();
            docComment =
                    NamespaceGlobal.preg_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call("/" + "\\n" + "\\s*" + "\\*" + "\\s?" + "/", "\n", docComment)
                            .value();
            docComment = NamespaceGlobal.substr.env(env).call(docComment, 0, -1).value();
            docComment = NamespaceGlobal.rtrim.env(env).call(docComment, "\n").value();
            return ZVal.assign(docComment);
        }

        @ConvertedMethod
        private Object emptyHookMethodsArray(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "beforeClass", ZVal.newArray(new ZPair(0, "setUpBeforeClass"))),
                            new ZPair("before", ZVal.newArray(new ZPair(0, "setUp"))),
                            new ZPair("after", ZVal.newArray(new ZPair(0, "tearDown"))),
                            new ZPair(
                                    "afterClass",
                                    ZVal.newArray(new ZPair(0, "tearDownAfterClass")))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        @ConvertedParameter(index = 2, name = "settingName", typeHint = "string")
        private Object getBooleanAnnotationSetting(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, null);
            Object methodName = assignParameter(args, 1, null);
            Object settingName = assignParameter(args, 2, null);
            Object annotations = ZVal.newArray();
            annotations =
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
            if (ZVal.isset(ZVal.getElementRecursive(annotations, "class", settingName))) {
                if (ZVal.strictEqualityCheck(
                        ZVal.getElementRecursive(annotations, "class", settingName, 0),
                        "===",
                        "enabled")) {
                    return ZVal.assign(true);
                }

                if (ZVal.strictEqualityCheck(
                        ZVal.getElementRecursive(annotations, "class", settingName, 0),
                        "===",
                        "disabled")) {
                    return ZVal.assign(false);
                }
            }

            if (ZVal.isset(ZVal.getElementRecursive(annotations, "method", settingName))) {
                if (ZVal.strictEqualityCheck(
                        ZVal.getElementRecursive(annotations, "method", settingName, 0),
                        "===",
                        "enabled")) {
                    return ZVal.assign(true);
                }

                if (ZVal.strictEqualityCheck(
                        ZVal.getElementRecursive(annotations, "method", settingName, 0),
                        "===",
                        "disabled")) {
                    return ZVal.assign(false);
                }
            }

            return ZVal.assign(ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "element", typeHint = "string")
        private Object resolveElementToReflectionObjects(RuntimeEnv env, Object... args) {
            Object element = assignParameter(args, 0, null);
            Object inverse = null;
            Object visibility = null;
            Object method = null;
            Object methods = null;
            Object codeToCoverList = ZVal.newArray();
            Object classes = null;
            Object methodName = ZVal.newArray();
            Object className = null;
            Object runtimeTempArrayResult15 = null;
            Object _pClass = null;
            Object extended = null;
            codeToCoverList = ZVal.newArray();
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    NamespaceGlobal.strpos.env(env).call(element, "\\").value(),
                                    "!==",
                                    false))
                    && ZVal.toBool(
                            NamespaceGlobal.function_exists.env(env).call(element).value())) {
                ZVal.addToArray(codeToCoverList, new ReflectionFunction(env, element));

            } else if (ZVal.strictNotEqualityCheck(
                    NamespaceGlobal.strpos.env(env).call(element, "::").value(), "!==", false)) {
                ZVal.list(
                        runtimeTempArrayResult15 =
                                NamespaceGlobal.explode.env(env).call("::", element).value(),
                        (className = ZVal.assign(ZVal.getElement(runtimeTempArrayResult15, 0))),
                        (methodName = ZVal.assign(ZVal.getElement(runtimeTempArrayResult15, 1))));
                if (ZVal.toBool(ZVal.isset(ZVal.getElement(methodName, 0)))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        ZVal.getElement(methodName, 0), "===", "<"))) {
                    classes = ZVal.newArray(new ZPair(0, className));
                    for (ZPair zpairResult415 : ZVal.getIterable(classes, env, true)) {
                        className = ZVal.assign(zpairResult415.getValue());
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        !function_class_exists
                                                                .f
                                                                .env(env)
                                                                .call(className)
                                                                .getBool())
                                                && ZVal.toBool(
                                                        !NamespaceGlobal.interface_exists
                                                                .env(env)
                                                                .call(className)
                                                                .getBool()))
                                && ZVal.toBool(
                                        !NamespaceGlobal.trait_exists
                                                .env(env)
                                                .call(className)
                                                .getBool())) {
                            throw ZVal.getException(
                                    env,
                                    new InvalidCoversTargetException(
                                            env,
                                            NamespaceGlobal.sprintf
                                                    .env(env)
                                                    .call(
                                                            "Trying to @cover or @use not existing class or "
                                                                    + "interface \"%s\".",
                                                            className)
                                                    .value()));
                        }

                        _pClass = new ReflectionClass(env, className);
                        methods = env.callMethod(_pClass, "getMethods", Test.class);
                        inverse =
                                ZVal.toBool(ZVal.isset(ZVal.getElement(methodName, 1)))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        ZVal.getElement(methodName, 1),
                                                        "===",
                                                        "!"));
                        visibility = "isPublic";
                        if (NamespaceGlobal.strpos
                                .env(env)
                                .call(methodName, "protected")
                                .getBool()) {
                            visibility = "isProtected";

                        } else if (NamespaceGlobal.strpos
                                .env(env)
                                .call(methodName, "private")
                                .getBool()) {
                            visibility = "isPrivate";
                        }

                        for (ZPair zpairResult416 : ZVal.getIterable(methods, env, true)) {
                            method = ZVal.assign(zpairResult416.getValue());
                            if (ZVal.toBool(inverse)
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            method,
                                                            toStringR(visibility, env),
                                                            Test.class)))) {
                                ZVal.addToArray(codeToCoverList, method);

                            } else if (ZVal.toBool(!ZVal.isTrue(inverse))
                                    && ZVal.toBool(
                                            env.callMethod(
                                                    method,
                                                    toStringR(visibility, env),
                                                    Test.class))) {
                                ZVal.addToArray(codeToCoverList, method);
                            }
                        }
                    }

                } else {
                    classes = ZVal.newArray(new ZPair(0, className));
                    for (ZPair zpairResult417 : ZVal.getIterable(classes, env, true)) {
                        className = ZVal.assign(zpairResult417.getValue());
                        if (ZVal.toBool(ZVal.strictEqualityCheck(className, "===", ""))
                                && ZVal.toBool(
                                        NamespaceGlobal.function_exists
                                                .env(env)
                                                .call(methodName)
                                                .value())) {
                            ZVal.addToArray(
                                    codeToCoverList, new ReflectionFunction(env, methodName));

                        } else {
                            if (!ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.toBool(
                                                                            function_class_exists
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(className)
                                                                                    .value())
                                                                    || ZVal.toBool(
                                                                            NamespaceGlobal
                                                                                    .interface_exists
                                                                                    .env(env)
                                                                                    .call(className)
                                                                                    .value()))
                                                    || ZVal.toBool(
                                                            NamespaceGlobal.trait_exists
                                                                    .env(env)
                                                                    .call(className)
                                                                    .value()))
                                    && ZVal.toBool(
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(className, methodName)
                                                    .value())) {
                                throw ZVal.getException(
                                        env,
                                        new InvalidCoversTargetException(
                                                env,
                                                NamespaceGlobal.sprintf
                                                        .env(env)
                                                        .call(
                                                                "Trying to @cover or @use not existing method \"%s::%s\".",
                                                                className, methodName)
                                                        .value()));
                            }

                            ZVal.addToArray(
                                    codeToCoverList,
                                    new ReflectionMethod(env, className, methodName));
                        }
                    }
                }

            } else {
                extended = false;
                if (ZVal.strictNotEqualityCheck(
                        NamespaceGlobal.strpos.env(env).call(element, "<extended>").value(),
                        "!==",
                        false)) {
                    element =
                            NamespaceGlobal.str_replace
                                    .env(env)
                                    .addReferneceArgs(new RuntimeArgsWithReferences())
                                    .call("<extended>", "", element)
                                    .value();
                    extended = true;
                }

                classes = ZVal.newArray(new ZPair(0, element));
                if (ZVal.isTrue(extended)) {
                    classes =
                            CRArrayF.array_merge
                                    .env(env)
                                    .call(
                                            classes,
                                            NamespaceGlobal.class_implements
                                                    .env(env)
                                                    .call(element)
                                                    .value(),
                                            NamespaceGlobal.class_parents
                                                    .env(env)
                                                    .call(element)
                                                    .value())
                                    .value();
                }

                for (ZPair zpairResult418 : ZVal.getIterable(classes, env, true)) {
                    className = ZVal.assign(zpairResult418.getValue());
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    !function_class_exists
                                                            .f
                                                            .env(env)
                                                            .call(className)
                                                            .getBool())
                                            && ZVal.toBool(
                                                    !NamespaceGlobal.interface_exists
                                                            .env(env)
                                                            .call(className)
                                                            .getBool()))
                            && ZVal.toBool(
                                    !NamespaceGlobal.trait_exists
                                            .env(env)
                                            .call(className)
                                            .getBool())) {
                        throw ZVal.getException(
                                env,
                                new InvalidCoversTargetException(
                                        env,
                                        NamespaceGlobal.sprintf
                                                .env(env)
                                                .call(
                                                        "Trying to @cover or @use not existing class or "
                                                                + "interface \"%s\".",
                                                        className)
                                                .value()));
                    }

                    ZVal.addToArray(codeToCoverList, new ReflectionClass(env, className));
                }
            }

            return ZVal.assign(codeToCoverList);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflectors", typeHint = "array")
        private Object resolveReflectionObjectsToLines(RuntimeEnv env, Object... args) {
            Object reflectors = assignParameter(args, 0, null);
            Object result = ZVal.newArray();
            Object lineNumbers = null;
            Object filename = null;
            Object reflector = null;
            result = ZVal.newArray();
            for (ZPair zpairResult419 : ZVal.getIterable(reflectors, env, true)) {
                reflector = ZVal.assign(zpairResult419.getValue());
                filename = env.callMethod(reflector, "getFileName", Test.class);
                if (!ZVal.isset(ZVal.getElement(result, filename))) {
                    ZVal.putArrayElement(result, filename, ZVal.newArray());
                }

                ZVal.putArrayElement(
                        result,
                        filename,
                        CRArrayF.array_merge
                                .env(env)
                                .call(
                                        ZVal.getElement(result, filename),
                                        CRArrayF.range
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                reflector,
                                                                "getStartLine",
                                                                Test.class),
                                                        env.callMethod(
                                                                reflector,
                                                                "getEndLine",
                                                                Test.class))
                                                .value())
                                .value());
            }

            for (ZPair zpairResult420 : ZVal.getIterable(result, env, false)) {
                filename = ZVal.assign(zpairResult420.getKey());
                lineNumbers = ZVal.assign(zpairResult420.getValue());
                ZVal.putArrayElement(
                        result,
                        filename,
                        CRArrayF.array_keys
                                .env(env)
                                .call(CRArrayF.array_flip.env(env).call(lineNumbers).value())
                                .value());
            }

            return ZVal.assign(result);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        private Object isBeforeClassMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, null);
            return ZVal.assign(
                    ZVal.toBool(env.callMethod(method, "isStatic", Test.class))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            NamespaceGlobal.strpos
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    method,
                                                                    "getDocComment",
                                                                    Test.class),
                                                            "@beforeClass")
                                                    .value(),
                                            "!==",
                                            false)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        private Object isBeforeMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, null);
            return ZVal.assign(
                    ZVal.isGreaterThan(
                            NamespaceGlobal.preg_match
                                    .env(env)
                                    .addReferneceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            "/@before\\b/",
                                            env.callMethod(method, "getDocComment", Test.class))
                                    .value(),
                            '>',
                            0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        private Object isAfterClassMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, null);
            return ZVal.assign(
                    ZVal.toBool(env.callMethod(method, "isStatic", Test.class))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            NamespaceGlobal.strpos
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    method,
                                                                    "getDocComment",
                                                                    Test.class),
                                                            "@afterClass")
                                                    .value(),
                                            "!==",
                                            false)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        private Object isAfterMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, null);
            return ZVal.assign(
                    ZVal.isGreaterThan(
                            NamespaceGlobal.preg_match
                                    .env(env)
                                    .addReferneceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            "/@after\\b/",
                                            env.callMethod(method, "getDocComment", Test.class))
                                    .value(),
                            '>',
                            0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "version", typeHint = "string")
        private Object sanitizeVersionNumber(RuntimeEnv env, Object... args) {
            Object version = assignParameter(args, 0, null);
            return ZVal.assign(
                    NamespaceGlobal.preg_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call("/^(\\d+\\.\\d+(?:.\\d+)?).*$/", "$1", version)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object annotationCache = ZVal.newArray();

        public Object hookMethods = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Test")
                    .setLookup(Test.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Test.php")
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
