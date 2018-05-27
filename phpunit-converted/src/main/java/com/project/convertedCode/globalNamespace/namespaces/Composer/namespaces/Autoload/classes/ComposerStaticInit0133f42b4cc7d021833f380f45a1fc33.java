package com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.Project;
import com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes.ClassLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/autoload_static.php

*/

public class ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33 extends RuntimeClassBase {

    public ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33(RuntimeEnv env, Object... args) {
        super(env);
    }

    public static final Object CONST_class =
            "Composer\\Autoload\\ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "loader",
            typeHint = "Composer\\Autoload\\ClassLoader"
        )
        public Object getInitializer(RuntimeEnv env, Object... args) {
            Object loader = assignParameter(args, 0, null);
            return ZVal.assign(
                    Closure.runtimeStaticObject.bind(
                            env,
                            new Closure(env) {
                                @Override
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object loader = null;
                                    loader = this.contextReferences.getCapturedValue("loader");
                                    toObjectR(loader)
                                            .accessProp(this, env)
                                            .name("prefixLengthsPsr4")
                                            .set(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Composer
                                                                            .namespaces
                                                                            .Autoload
                                                                            .classes
                                                                            .ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .prefixLengthsPsr4);
                                    toObjectR(loader)
                                            .accessProp(this, env)
                                            .name("prefixDirsPsr4")
                                            .set(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Composer
                                                                            .namespaces
                                                                            .Autoload
                                                                            .classes
                                                                            .ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .prefixDirsPsr4);
                                    toObjectR(loader)
                                            .accessProp(this, env)
                                            .name("prefixesPsr0")
                                            .set(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Composer
                                                                            .namespaces
                                                                            .Autoload
                                                                            .classes
                                                                            .ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .prefixesPsr0);
                                    toObjectR(loader)
                                            .accessProp(this, env)
                                            .name("classMap")
                                            .set(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Composer
                                                                            .namespaces
                                                                            .Autoload
                                                                            .classes
                                                                            .ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .classMap);
                                    return null;
                                }
                            }.use("loader", loader),
                            ZVal.getNull(),
                            ClassLoader.CONST_class));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object files =
                ZVal.newArray(
                        new ZPair(
                                "6124b4c8570aa390c21fafd04a26c69f",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/myclabs/deep-copy/src/DeepCopy/deep_copy.php"));

        public Object prefixLengthsPsr4 =
                ZVal.newArray(
                        new ZPair("p", ZVal.newArray(new ZPair("phpDocumentor\\Reflection\\", 25))),
                        new ZPair("W", ZVal.newArray(new ZPair("Webmozart\\Assert\\", 17))),
                        new ZPair(
                                "D",
                                ZVal.newArray(
                                        new ZPair("Doctrine\\Instantiator\\", 22),
                                        new ZPair("DeepCopy\\", 9))));

        public Object prefixDirsPsr4 =
                ZVal.newArray(
                        new ZPair(
                                "phpDocumentor\\Reflection\\",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toStringR(
                                                                Project
                                                                        .addRootFilesystemPrefixStatic(
                                                                                "/vendor/composer"))
                                                        + "/.."
                                                        + "/phpdocumentor/reflection-common/src"),
                                        new ZPair(
                                                1,
                                                toStringR(
                                                                Project
                                                                        .addRootFilesystemPrefixStatic(
                                                                                "/vendor/composer"))
                                                        + "/.."
                                                        + "/phpdocumentor/reflection-docblock/src"),
                                        new ZPair(
                                                2,
                                                toStringR(
                                                                Project
                                                                        .addRootFilesystemPrefixStatic(
                                                                                "/vendor/composer"))
                                                        + "/.."
                                                        + "/phpdocumentor/type-resolver/src"))),
                        new ZPair(
                                "Webmozart\\Assert\\",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toStringR(
                                                                Project
                                                                        .addRootFilesystemPrefixStatic(
                                                                                "/vendor/composer"))
                                                        + "/.."
                                                        + "/webmozart/assert/src"))),
                        new ZPair(
                                "Doctrine\\Instantiator\\",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toStringR(
                                                                Project
                                                                        .addRootFilesystemPrefixStatic(
                                                                                "/vendor/composer"))
                                                        + "/.."
                                                        + "/doctrine/instantiator/src/Doctrine/Instantiator"))),
                        new ZPair(
                                "DeepCopy\\",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toStringR(
                                                                Project
                                                                        .addRootFilesystemPrefixStatic(
                                                                                "/vendor/composer"))
                                                        + "/.."
                                                        + "/myclabs/deep-copy/src/DeepCopy"))));

        public Object prefixesPsr0 =
                ZVal.newArray(
                        new ZPair(
                                "P",
                                ZVal.newArray(
                                        new ZPair(
                                                "Prophecy\\",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                0,
                                                                toStringR(
                                                                                Project
                                                                                        .addRootFilesystemPrefixStatic(
                                                                                                "/vendor/composer"))
                                                                        + "/.."
                                                                        + "/phpspec/prophecy/src"))))));

        public Object classMap =
                ZVal.newArray(
                        new ZPair(
                                "Email",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/../.."
                                        + "/src/Email.php"),
                        new ZPair(
                                "File_Iterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-file-iterator/src/Iterator.php"),
                        new ZPair(
                                "File_Iterator_Facade",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-file-iterator/src/Facade.php"),
                        new ZPair(
                                "File_Iterator_Factory",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-file-iterator/src/Factory.php"),
                        new ZPair(
                                "MockTestObj",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/../.."
                                        + "/src/MockTestObj.php"),
                        new ZPair(
                                "PHPUnit\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Exception.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Assert",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Assert.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\AssertionFailedError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/AssertionFailedError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\CodeCoverageException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/CodeCoverageException.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\ArrayHasKey",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/ArrayHasKey.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\ArraySubset",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/ArraySubset.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\Attribute",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/Attribute.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\Callback",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/Callback.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\ClassHasAttribute",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/ClassHasAttribute.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\ClassHasStaticAttribute",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/ClassHasStaticAttribute.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\Composite",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/Composite.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\Constraint",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/Constraint.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\Count",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/Count.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\DirectoryExists",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/DirectoryExists.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/Exception.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\ExceptionCode",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/ExceptionCode.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\ExceptionMessage",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/ExceptionMessage.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\ExceptionMessageRegularExpression",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/ExceptionMessageRegularExpression.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\FileExists",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/FileExists.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\GreaterThan",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/GreaterThan.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsAnything",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsAnything.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsEmpty",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsEmpty.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsEqual",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsEqual.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsFalse",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsFalse.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsFinite",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsFinite.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsIdentical",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsIdentical.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsInfinite",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsInfinite.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsInstanceOf",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsInstanceOf.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsJson",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsJson.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsNan",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsNan.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsNull",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsNull.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsReadable",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsReadable.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsTrue",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsTrue.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsType",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsType.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\IsWritable",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/IsWritable.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\JsonMatches",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/JsonMatches.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\JsonMatchesErrorMessageProvider",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/JsonMatchesErrorMessageProvider.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\LessThan",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/LessThan.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\LogicalAnd",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/LogicalAnd.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\LogicalNot",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/LogicalNot.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\LogicalOr",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/LogicalOr.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\LogicalXor",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/LogicalXor.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\ObjectHasAttribute",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/ObjectHasAttribute.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\RegularExpression",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/RegularExpression.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\SameSize",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/SameSize.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\StringContains",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/StringContains.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\StringEndsWith",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/StringEndsWith.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\StringMatchesFormatDescription",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/StringMatchesFormatDescription.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\StringStartsWith",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/StringStartsWith.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\TraversableContains",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/TraversableContains.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Constraint\\TraversableContainsOnly",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Constraint/TraversableContainsOnly.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\CoveredCodeNotExecutedException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/CoveredCodeNotExecutedException.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\DataProviderTestSuite",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/DataProviderTestSuite.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Error\\Deprecated",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Error/Deprecated.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Error\\Error",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Error/Error.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Error\\Notice",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Error/Notice.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Error\\Warning",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Error/Warning.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Exception.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\ExceptionWrapper",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/ExceptionWrapper.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\ExpectationFailedException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/ExpectationFailedException.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\IncompleteTest",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/IncompleteTest.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\IncompleteTestCase",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/IncompleteTestCase.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\IncompleteTestError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/IncompleteTestError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\InvalidCoversTargetException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/InvalidCoversTargetException.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MissingCoversAnnotationException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/MissingCoversAnnotationException.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\BadMethodCallException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Exception/BadMethodCallException.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Builder\\Identity",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Builder/Identity.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Builder\\InvocationMocker",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Builder/InvocationMocker.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Builder\\Match",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Builder/Match.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Builder\\MethodNameMatch",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Builder/MethodNameMatch.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Builder\\NamespaceMatch",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Builder/NamespaceMatch.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Builder\\ParametersMatch",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Builder/ParametersMatch.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Builder\\Stub",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Builder/Stub.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Exception/Exception.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Generator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Generator.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Invocation",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Invocation/Invocation.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\InvocationMocker",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/InvocationMocker.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Invocation\\ObjectInvocation",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Invocation/ObjectInvocation.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Invocation\\StaticInvocation",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Invocation/StaticInvocation.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Invokable",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Invokable.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\AnyInvokedCount",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/AnyInvokedCount.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\AnyParameters",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/AnyParameters.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\ConsecutiveParameters",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/ConsecutiveParameters.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\DeferredError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/DeferredError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/Invocation.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtIndex",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtIndex.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtLeastCount",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtLeastCount.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtLeastOnce",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtLeastOnce.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtMostCount",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtMostCount.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedCount",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedCount.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedRecorder",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedRecorder.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\MethodName",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/MethodName.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\Parameters",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/Parameters.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Matcher\\StatelessInvocation",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Matcher/StatelessInvocation.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\MockBuilder",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/MockBuilder.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\MockObject",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/ForwardCompatibility/MockObject.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\RuntimeException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Exception/RuntimeException.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\ConsecutiveCalls",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/ConsecutiveCalls.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/Exception.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\MatcherCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/MatcherCollection.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\ReturnArgument",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/ReturnArgument.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\ReturnCallback",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/ReturnCallback.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\ReturnReference",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/ReturnReference.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\ReturnSelf",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/ReturnSelf.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\ReturnStub",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/ReturnStub.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Stub\\ReturnValueMap",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Stub/ReturnValueMap.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\MockObject\\Verifiable",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/Verifiable.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\OutputError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/OutputError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\RiskyTest",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/RiskyTest.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\RiskyTestError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/RiskyTestError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\SelfDescribing",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/SelfDescribing.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\SkippedTest",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/SkippedTest.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\SkippedTestCase",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/SkippedTestCase.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\SkippedTestError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/SkippedTestError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\SkippedTestSuiteError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/SkippedTestSuiteError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\SyntheticError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/SyntheticError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Test",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Test.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\TestCase",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/TestCase.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\TestFailure",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/TestFailure.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\TestListener",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/TestListener.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\TestListenerDefaultImplementation",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/TestListenerDefaultImplementation.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\TestResult",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/TestResult.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\TestSuite",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/TestSuite.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\TestSuiteIterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/TestSuiteIterator.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\UnintentionallyCoveredCodeError",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/UnintentionallyCoveredCodeError.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\Warning",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/Warning.php"),
                        new ZPair(
                                "PHPUnit\\Framework\\WarningTestCase",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Framework/WarningTestCase.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\AfterIncompleteTestHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/AfterIncompleteTestHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\AfterLastTestHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/AfterLastTestHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\AfterRiskyTestHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/AfterRiskyTestHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\AfterSkippedTestHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/AfterSkippedTestHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\AfterSuccessfulTestHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/AfterSuccessfulTestHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\AfterTestErrorHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/AfterTestErrorHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\AfterTestFailureHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/AfterTestFailureHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\AfterTestWarningHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/AfterTestWarningHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\BaseTestRunner",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/BaseTestRunner.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\BeforeFirstTestHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/BeforeFirstTestHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\BeforeTestHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/BeforeTestHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Exception.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\Filter\\ExcludeGroupFilterIterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Filter/ExcludeGroupFilterIterator.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\Filter\\Factory",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Filter/Factory.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\Filter\\GroupFilterIterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Filter/GroupFilterIterator.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\Filter\\IncludeGroupFilterIterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Filter/IncludeGroupFilterIterator.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\Filter\\NameFilterIterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Filter/NameFilterIterator.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\Hook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/Hook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\PhptTestCase",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/PhptTestCase.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\StandardTestSuiteLoader",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/StandardTestSuiteLoader.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\TestHook",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/TestHook.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\TestListenerAdapter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Hook/TestListenerAdapter.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\TestSuiteLoader",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/TestSuiteLoader.php"),
                        new ZPair(
                                "PHPUnit\\Runner\\Version",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Runner/Version.php"),
                        new ZPair(
                                "PHPUnit\\TextUI\\Command",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/TextUI/Command.php"),
                        new ZPair(
                                "PHPUnit\\TextUI\\ResultPrinter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/TextUI/ResultPrinter.php"),
                        new ZPair(
                                "PHPUnit\\TextUI\\TestRunner",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/TextUI/TestRunner.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Blacklist",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Blacklist.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Configuration",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Configuration.php"),
                        new ZPair(
                                "PHPUnit\\Util\\ConfigurationGenerator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/ConfigurationGenerator.php"),
                        new ZPair(
                                "PHPUnit\\Util\\ErrorHandler",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/ErrorHandler.php"),
                        new ZPair(
                                "PHPUnit\\Util\\FileLoader",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/FileLoader.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Filesystem",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Filesystem.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Filter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Filter.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Getopt",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Getopt.php"),
                        new ZPair(
                                "PHPUnit\\Util\\GlobalState",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/GlobalState.php"),
                        new ZPair(
                                "PHPUnit\\Util\\InvalidArgumentHelper",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/InvalidArgumentHelper.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Json",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Json.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Log\\JUnit",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Log/JUnit.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Log\\TeamCity",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Log/TeamCity.php"),
                        new ZPair(
                                "PHPUnit\\Util\\PHP\\AbstractPhpProcess",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/PHP/AbstractPhpProcess.php"),
                        new ZPair(
                                "PHPUnit\\Util\\PHP\\DefaultPhpProcess",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/PHP/DefaultPhpProcess.php"),
                        new ZPair(
                                "PHPUnit\\Util\\PHP\\WindowsPhpProcess",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/PHP/WindowsPhpProcess.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Printer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Printer.php"),
                        new ZPair(
                                "PHPUnit\\Util\\RegularExpression",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/RegularExpression.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Test",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Test.php"),
                        new ZPair(
                                "PHPUnit\\Util\\TestDox\\CliTestDoxPrinter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/TestDox/CliTestDoxPrinter.php"),
                        new ZPair(
                                "PHPUnit\\Util\\TestDox\\HtmlResultPrinter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/TestDox/HtmlResultPrinter.php"),
                        new ZPair(
                                "PHPUnit\\Util\\TestDox\\NamePrettifier",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/TestDox/NamePrettifier.php"),
                        new ZPair(
                                "PHPUnit\\Util\\TestDox\\ResultPrinter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/TestDox/ResultPrinter.php"),
                        new ZPair(
                                "PHPUnit\\Util\\TestDox\\TestResult",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/TestDox/TestResult.php"),
                        new ZPair(
                                "PHPUnit\\Util\\TestDox\\TextResultPrinter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/TestDox/TextResultPrinter.php"),
                        new ZPair(
                                "PHPUnit\\Util\\TestDox\\XmlResultPrinter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/TestDox/XmlResultPrinter.php"),
                        new ZPair(
                                "PHPUnit\\Util\\TextTestListRenderer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/TextTestListRenderer.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Type",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Type.php"),
                        new ZPair(
                                "PHPUnit\\Util\\Xml",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/Xml.php"),
                        new ZPair(
                                "PHPUnit\\Util\\XmlTestListRenderer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit/src/Util/XmlTestListRenderer.php"),
                        new ZPair(
                                "PHPUnit_Framework_MockObject_MockObject",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/phpunit-mock-objects/src/MockObject.php"),
                        new ZPair(
                                "PHP_Token",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_TokenWithScope",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_TokenWithScopeAndVisibility",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ABSTRACT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_AMPERSAND",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_AND_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ARRAY",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ARRAY_CAST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_AS",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_AT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_BACKTICK",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_BAD_CHARACTER",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_BOOLEAN_AND",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_BOOLEAN_OR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_BOOL_CAST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_BREAK",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CALLABLE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CARET",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CASE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CATCH",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CHARACTER",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CLASS",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CLASS_C",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CLASS_NAME_CONSTANT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CLONE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CLOSE_BRACKET",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CLOSE_CURLY",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CLOSE_SQUARE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CLOSE_TAG",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_COALESCE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_COLON",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_COMMA",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_COMMENT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CONCAT_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CONST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CONSTANT_ENCAPSED_STRING",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CONTINUE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_CURLY_OPEN",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DEC",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DECLARE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DEFAULT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DIR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DIV",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DIV_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DNUMBER",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DO",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DOC_COMMENT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DOLLAR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DOLLAR_OPEN_CURLY_BRACES",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DOT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DOUBLE_ARROW",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DOUBLE_CAST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DOUBLE_COLON",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_DOUBLE_QUOTES",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ECHO",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ELLIPSIS",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ELSE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ELSEIF",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_EMPTY",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ENCAPSED_AND_WHITESPACE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ENDDECLARE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ENDFOR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ENDFOREACH",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ENDIF",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ENDSWITCH",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ENDWHILE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_END_HEREDOC",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_EVAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_EXCLAMATION_MARK",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_EXIT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_EXTENDS",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_FILE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_FINAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_FINALLY",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_FOR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_FOREACH",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_FUNCTION",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_FUNC_C",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_GLOBAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_GOTO",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_GT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_HALT_COMPILER",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_IF",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_IMPLEMENTS",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_INC",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_INCLUDE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_INCLUDE_ONCE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_INLINE_HTML",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_INSTANCEOF",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_INSTEADOF",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_INTERFACE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_INT_CAST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_ISSET",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_IS_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_IS_GREATER_OR_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_IS_IDENTICAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_IS_NOT_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_IS_NOT_IDENTICAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_IS_SMALLER_OR_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_Includes",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_LINE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_LIST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_LNUMBER",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_LOGICAL_AND",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_LOGICAL_OR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_LOGICAL_XOR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_LT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_METHOD_C",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_MINUS",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_MINUS_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_MOD_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_MULT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_MUL_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_NAMESPACE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_NEW",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_NS_C",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_NS_SEPARATOR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_NUM_STRING",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_OBJECT_CAST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_OBJECT_OPERATOR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_OPEN_BRACKET",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_OPEN_CURLY",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_OPEN_SQUARE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_OPEN_TAG",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_OPEN_TAG_WITH_ECHO",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_OR_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PAAMAYIM_NEKUDOTAYIM",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PERCENT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PIPE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PLUS",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PLUS_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_POW",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_POW_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PRINT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PRIVATE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PROTECTED",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_PUBLIC",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_QUESTION_MARK",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_REQUIRE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_REQUIRE_ONCE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_RETURN",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_SEMICOLON",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_SL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_SL_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_SPACESHIP",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_SR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_SR_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_START_HEREDOC",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_STATIC",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_STRING",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_STRING_CAST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_STRING_VARNAME",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_SWITCH",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_Stream",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token/Stream.php"),
                        new ZPair(
                                "PHP_Token_Stream_CachingFactory",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token/Stream/CachingFactory.php"),
                        new ZPair(
                                "PHP_Token_THROW",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_TILDE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_TRAIT",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_TRAIT_C",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_TRY",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_UNSET",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_UNSET_CAST",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_USE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_USE_FUNCTION",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_VAR",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_VARIABLE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_WHILE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_WHITESPACE",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_XOR_EQUAL",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_YIELD",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PHP_Token_YIELD_FROM",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-token-stream/src/Token.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Application",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Application.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ApplicationName",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/ApplicationName.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Author",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Author.php"),
                        new ZPair(
                                "PharIo\\Manifest\\AuthorCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/AuthorCollection.php"),
                        new ZPair(
                                "PharIo\\Manifest\\AuthorCollectionIterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/AuthorCollectionIterator.php"),
                        new ZPair(
                                "PharIo\\Manifest\\AuthorElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/AuthorElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\AuthorElementCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/AuthorElementCollection.php"),
                        new ZPair(
                                "PharIo\\Manifest\\BundledComponent",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/BundledComponent.php"),
                        new ZPair(
                                "PharIo\\Manifest\\BundledComponentCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/BundledComponentCollection.php"),
                        new ZPair(
                                "PharIo\\Manifest\\BundledComponentCollectionIterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/BundledComponentCollectionIterator.php"),
                        new ZPair(
                                "PharIo\\Manifest\\BundlesElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/BundlesElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ComponentElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ComponentElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ComponentElementCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ComponentElementCollection.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ContainsElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ContainsElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\CopyrightElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/CopyrightElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\CopyrightInformation",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/CopyrightInformation.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ElementCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ElementCollection.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Email",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Email.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/exceptions/Exception.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ExtElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ExtElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ExtElementCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ExtElementCollection.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Extension",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Extension.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ExtensionElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ExtensionElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\InvalidApplicationNameException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/exceptions/InvalidApplicationNameException.php"),
                        new ZPair(
                                "PharIo\\Manifest\\InvalidEmailException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/exceptions/InvalidEmailException.php"),
                        new ZPair(
                                "PharIo\\Manifest\\InvalidUrlException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/exceptions/InvalidUrlException.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Library",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Library.php"),
                        new ZPair(
                                "PharIo\\Manifest\\License",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/License.php"),
                        new ZPair(
                                "PharIo\\Manifest\\LicenseElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/LicenseElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Manifest",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Manifest.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestDocument",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ManifestDocument.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestDocumentException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/exceptions/ManifestDocumentException.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestDocumentLoadingException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ManifestDocumentLoadingException.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestDocumentMapper",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/ManifestDocumentMapper.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestDocumentMapperException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/exceptions/ManifestDocumentMapperException.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/ManifestElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestElementException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/exceptions/ManifestElementException.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestLoader",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/ManifestLoader.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestLoaderException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/exceptions/ManifestLoaderException.php"),
                        new ZPair(
                                "PharIo\\Manifest\\ManifestSerializer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/ManifestSerializer.php"),
                        new ZPair(
                                "PharIo\\Manifest\\PhpElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/PhpElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\PhpExtensionRequirement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/PhpExtensionRequirement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\PhpVersionRequirement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/PhpVersionRequirement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Requirement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Requirement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\RequirementCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/RequirementCollection.php"),
                        new ZPair(
                                "PharIo\\Manifest\\RequirementCollectionIterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/RequirementCollectionIterator.php"),
                        new ZPair(
                                "PharIo\\Manifest\\RequiresElement",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/xml/RequiresElement.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Type",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Type.php"),
                        new ZPair(
                                "PharIo\\Manifest\\Url",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/manifest/src/values/Url.php"),
                        new ZPair(
                                "PharIo\\Version\\AbstractVersionConstraint",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/AbstractVersionConstraint.php"),
                        new ZPair(
                                "PharIo\\Version\\AndVersionConstraintGroup",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/AndVersionConstraintGroup.php"),
                        new ZPair(
                                "PharIo\\Version\\AnyVersionConstraint",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/AnyVersionConstraint.php"),
                        new ZPair(
                                "PharIo\\Version\\ExactVersionConstraint",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/ExactVersionConstraint.php"),
                        new ZPair(
                                "PharIo\\Version\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/Exception.php"),
                        new ZPair(
                                "PharIo\\Version\\GreaterThanOrEqualToVersionConstraint",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/GreaterThanOrEqualToVersionConstraint.php"),
                        new ZPair(
                                "PharIo\\Version\\InvalidVersionException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/InvalidVersionException.php"),
                        new ZPair(
                                "PharIo\\Version\\OrVersionConstraintGroup",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/OrVersionConstraintGroup.php"),
                        new ZPair(
                                "PharIo\\Version\\PreReleaseSuffix",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/PreReleaseSuffix.php"),
                        new ZPair(
                                "PharIo\\Version\\SpecificMajorAndMinorVersionConstraint",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/SpecificMajorAndMinorVersionConstraint.php"),
                        new ZPair(
                                "PharIo\\Version\\SpecificMajorVersionConstraint",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/SpecificMajorVersionConstraint.php"),
                        new ZPair(
                                "PharIo\\Version\\UnsupportedVersionConstraintException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/UnsupportedVersionConstraintException.php"),
                        new ZPair(
                                "PharIo\\Version\\Version",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/Version.php"),
                        new ZPair(
                                "PharIo\\Version\\VersionConstraint",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/VersionConstraint.php"),
                        new ZPair(
                                "PharIo\\Version\\VersionConstraintParser",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/VersionConstraintParser.php"),
                        new ZPair(
                                "PharIo\\Version\\VersionConstraintValue",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/VersionConstraintValue.php"),
                        new ZPair(
                                "PharIo\\Version\\VersionNumber",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phar-io/version/src/VersionNumber.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\CodeCoverage",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/CodeCoverage.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\CoveredCodeNotExecutedException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Exception/CoveredCodeNotExecutedException.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Driver\\Driver",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Driver/Driver.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Driver\\PHPDBG",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Driver/PHPDBG.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Driver\\Xdebug",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Driver/Xdebug.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Exception/Exception.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Filter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Filter.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\InvalidArgumentException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Exception/InvalidArgumentException.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\MissingCoversAnnotationException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Exception/MissingCoversAnnotationException.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Node/AbstractNode.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Node\\Builder",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Node/Builder.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Node\\Directory",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Node/Directory.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Node\\File",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Node/File.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Node\\Iterator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Node/Iterator.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Clover",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Clover.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Crap4j",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Crap4j.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Html\\Dashboard",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Html/Renderer/Dashboard.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Html\\Directory",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Html/Renderer/Directory.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Html\\Facade",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Html/Facade.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Html\\File",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Html/Renderer/File.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Html/Renderer.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\PHP",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/PHP.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Text",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Text.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\BuildInformation",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/BuildInformation.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Coverage",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Coverage.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Directory",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Directory.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Facade",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Facade.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\File",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/File.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Method",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Method.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Node",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Node.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Project",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Project.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Report",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Report.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Source",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Source.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Tests",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Tests.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Totals",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Totals.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Unit",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Report/Xml/Unit.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\RuntimeException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Exception/RuntimeException.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\UnintentionallyCoveredCodeException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Exception/UnintentionallyCoveredCodeException.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Util",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Util.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeCoverage\\Version",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-code-coverage/src/Version.php"),
                        new ZPair(
                                "SebastianBergmann\\CodeUnitReverseLookup\\Wizard",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/code-unit-reverse-lookup/src/Wizard.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\ArrayComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/ArrayComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\Comparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/Comparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\ComparisonFailure",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/ComparisonFailure.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\DOMNodeComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/DOMNodeComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\DateTimeComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/DateTimeComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\DoubleComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/DoubleComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\ExceptionComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/ExceptionComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\Factory",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/Factory.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\MockObjectComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/MockObjectComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\NumericComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/NumericComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\ObjectComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/ObjectComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\ResourceComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/ResourceComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\ScalarComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/ScalarComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\SplObjectStorageComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/SplObjectStorageComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Comparator\\TypeComparator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/comparator/src/TypeComparator.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Chunk",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Chunk.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\ConfigurationException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Exception/ConfigurationException.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Diff",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Diff.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Differ",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Differ.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Exception/Exception.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\InvalidArgumentException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Exception/InvalidArgumentException.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Line",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Line.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/LongestCommonSubsequenceCalculator.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\MemoryEfficientLongestCommonSubsequenceCalculator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/MemoryEfficientLongestCommonSubsequenceCalculator.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Output\\AbstractChunkOutputBuilder",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Output/AbstractChunkOutputBuilder.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Output\\DiffOnlyOutputBuilder",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Output/DiffOnlyOutputBuilder.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Output/DiffOutputBuilderInterface.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Output\\StrictUnifiedDiffOutputBuilder",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Output/StrictUnifiedDiffOutputBuilder.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Output\\UnifiedDiffOutputBuilder",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Output/UnifiedDiffOutputBuilder.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\Parser",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/Parser.php"),
                        new ZPair(
                                "SebastianBergmann\\Diff\\TimeEfficientLongestCommonSubsequenceCalculator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/diff/src/TimeEfficientLongestCommonSubsequenceCalculator.php"),
                        new ZPair(
                                "SebastianBergmann\\Environment\\Console",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/environment/src/Console.php"),
                        new ZPair(
                                "SebastianBergmann\\Environment\\OperatingSystem",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/environment/src/OperatingSystem.php"),
                        new ZPair(
                                "SebastianBergmann\\Environment\\Runtime",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/environment/src/Runtime.php"),
                        new ZPair(
                                "SebastianBergmann\\Exporter\\Exporter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/exporter/src/Exporter.php"),
                        new ZPair(
                                "SebastianBergmann\\GlobalState\\Blacklist",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/global-state/src/Blacklist.php"),
                        new ZPair(
                                "SebastianBergmann\\GlobalState\\CodeExporter",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/global-state/src/CodeExporter.php"),
                        new ZPair(
                                "SebastianBergmann\\GlobalState\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/global-state/src/exceptions/Exception.php"),
                        new ZPair(
                                "SebastianBergmann\\GlobalState\\Restorer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/global-state/src/Restorer.php"),
                        new ZPair(
                                "SebastianBergmann\\GlobalState\\RuntimeException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/global-state/src/exceptions/RuntimeException.php"),
                        new ZPair(
                                "SebastianBergmann\\GlobalState\\Snapshot",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/global-state/src/Snapshot.php"),
                        new ZPair(
                                "SebastianBergmann\\ObjectEnumerator\\Enumerator",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/object-enumerator/src/Enumerator.php"),
                        new ZPair(
                                "SebastianBergmann\\ObjectEnumerator\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/object-enumerator/src/Exception.php"),
                        new ZPair(
                                "SebastianBergmann\\ObjectEnumerator\\InvalidArgumentException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/object-enumerator/src/InvalidArgumentException.php"),
                        new ZPair(
                                "SebastianBergmann\\ObjectReflector\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/object-reflector/src/Exception.php"),
                        new ZPair(
                                "SebastianBergmann\\ObjectReflector\\InvalidArgumentException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/object-reflector/src/InvalidArgumentException.php"),
                        new ZPair(
                                "SebastianBergmann\\ObjectReflector\\ObjectReflector",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/object-reflector/src/ObjectReflector.php"),
                        new ZPair(
                                "SebastianBergmann\\RecursionContext\\Context",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/recursion-context/src/Context.php"),
                        new ZPair(
                                "SebastianBergmann\\RecursionContext\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/recursion-context/src/Exception.php"),
                        new ZPair(
                                "SebastianBergmann\\RecursionContext\\InvalidArgumentException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/recursion-context/src/InvalidArgumentException.php"),
                        new ZPair(
                                "SebastianBergmann\\ResourceOperations\\ResourceOperations",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/resource-operations/src/ResourceOperations.php"),
                        new ZPair(
                                "SebastianBergmann\\Timer\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-timer/src/Exception.php"),
                        new ZPair(
                                "SebastianBergmann\\Timer\\RuntimeException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-timer/src/RuntimeException.php"),
                        new ZPair(
                                "SebastianBergmann\\Timer\\Timer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-timer/src/Timer.php"),
                        new ZPair(
                                "SebastianBergmann\\Version",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/sebastian/version/src/Version.php"),
                        new ZPair(
                                "Text_Template",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/phpunit/php-text-template/src/Template.php"),
                        new ZPair(
                                "TheSeer\\Tokenizer\\Exception",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/theseer/tokenizer/src/Exception.php"),
                        new ZPair(
                                "TheSeer\\Tokenizer\\NamespaceUri",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/theseer/tokenizer/src/NamespaceUri.php"),
                        new ZPair(
                                "TheSeer\\Tokenizer\\NamespaceUriException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/theseer/tokenizer/src/NamespaceUriException.php"),
                        new ZPair(
                                "TheSeer\\Tokenizer\\Token",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/theseer/tokenizer/src/Token.php"),
                        new ZPair(
                                "TheSeer\\Tokenizer\\TokenCollection",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/theseer/tokenizer/src/TokenCollection.php"),
                        new ZPair(
                                "TheSeer\\Tokenizer\\TokenCollectionException",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/theseer/tokenizer/src/TokenCollectionException.php"),
                        new ZPair(
                                "TheSeer\\Tokenizer\\Tokenizer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/theseer/tokenizer/src/Tokenizer.php"),
                        new ZPair(
                                "TheSeer\\Tokenizer\\XMLSerializer",
                                toStringR(Project.addRootFilesystemPrefixStatic("/vendor/composer"))
                                        + "/.."
                                        + "/theseer/tokenizer/src/XMLSerializer.php"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Composer\\Autoload\\ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33")
                    .setLookup(
                            ComposerStaticInit0133f42b4cc7d021833f380f45a1fc33.class,
                            java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/composer/autoload_static.php")
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
