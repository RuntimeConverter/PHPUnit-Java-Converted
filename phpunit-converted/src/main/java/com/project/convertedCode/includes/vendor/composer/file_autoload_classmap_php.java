package com.project.convertedCode.includes.vendor.composer;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/autoload_classmap.php

*/

public class file_autoload_classmap_php implements RuntimeIncludable {

    public static final file_autoload_classmap_php instance = new file_autoload_classmap_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope26 scope = new Scope26();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope26 scope)
            throws IncludeEventException {
        scope.vendorDir =
                NamespaceGlobal.dirname
                        .env(env)
                        .call(
                                NamespaceGlobal.dirname
                                        .env(env)
                                        .call(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/composer/autoload_classmap.php"))
                                        .value())
                        .value();
        scope.baseDir = NamespaceGlobal.dirname.env(env).call(scope.vendorDir).value();
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "Email", toStringR(scope.baseDir, env) + "/src/Email.php"),
                                new ZPair(
                                        "File_Iterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-file-iterator/src/Iterator.php"),
                                new ZPair(
                                        "File_Iterator_Facade",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-file-iterator/src/Facade.php"),
                                new ZPair(
                                        "File_Iterator_Factory",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-file-iterator/src/Factory.php"),
                                new ZPair(
                                        "MockTestObj",
                                        toStringR(scope.baseDir, env) + "/src/MockTestObj.php"),
                                new ZPair(
                                        "PHPUnit\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Exception.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Assert",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Assert.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\AssertionFailedError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/AssertionFailedError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\CodeCoverageException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/CodeCoverageException.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\ArrayHasKey",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/ArrayHasKey.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\ArraySubset",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/ArraySubset.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\Attribute",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/Attribute.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\Callback",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/Callback.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\ClassHasAttribute",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/ClassHasAttribute.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\ClassHasStaticAttribute",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/ClassHasStaticAttribute.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\Composite",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/Composite.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\Constraint",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/Constraint.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\Count",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/Count.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\DirectoryExists",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/DirectoryExists.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/Exception.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\ExceptionCode",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/ExceptionCode.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\ExceptionMessage",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/ExceptionMessage.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\ExceptionMessageRegularExpression",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/ExceptionMessageRegularExpression.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\FileExists",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/FileExists.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\GreaterThan",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/GreaterThan.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsAnything",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsAnything.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsEmpty",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsEmpty.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsEqual",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsEqual.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsFalse",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsFalse.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsFinite",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsFinite.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsIdentical",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsIdentical.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsInfinite",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsInfinite.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsInstanceOf",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsInstanceOf.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsJson",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsJson.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsNan",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsNan.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsNull",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsNull.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsReadable",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsReadable.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsTrue",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsTrue.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsType",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsType.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\IsWritable",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/IsWritable.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\JsonMatches",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/JsonMatches.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\JsonMatchesErrorMessageProvider",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/JsonMatchesErrorMessageProvider.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\LessThan",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/LessThan.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\LogicalAnd",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/LogicalAnd.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\LogicalNot",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/LogicalNot.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\LogicalOr",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/LogicalOr.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\LogicalXor",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/LogicalXor.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\ObjectHasAttribute",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/ObjectHasAttribute.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\RegularExpression",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/RegularExpression.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\SameSize",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/SameSize.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\StringContains",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/StringContains.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\StringEndsWith",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/StringEndsWith.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\StringMatchesFormatDescription",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/StringMatchesFormatDescription.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\StringStartsWith",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/StringStartsWith.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\TraversableContains",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/TraversableContains.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Constraint\\TraversableContainsOnly",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Constraint/TraversableContainsOnly.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\CoveredCodeNotExecutedException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/CoveredCodeNotExecutedException.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\DataProviderTestSuite",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/DataProviderTestSuite.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Error\\Deprecated",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Error/Deprecated.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Error\\Error",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Error/Error.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Error\\Notice",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Error/Notice.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Error\\Warning",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Error/Warning.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Exception.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\ExceptionWrapper",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/ExceptionWrapper.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\ExpectationFailedException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/ExpectationFailedException.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\IncompleteTest",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/IncompleteTest.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\IncompleteTestCase",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/IncompleteTestCase.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\IncompleteTestError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/IncompleteTestError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\InvalidCoversTargetException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/InvalidCoversTargetException.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MissingCoversAnnotationException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/MissingCoversAnnotationException.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\BadMethodCallException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Exception/BadMethodCallException.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Builder\\Identity",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Builder/Identity.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Builder\\InvocationMocker",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Builder/InvocationMocker.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Builder\\Match",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Builder/Match.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Builder\\MethodNameMatch",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Builder/MethodNameMatch.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Builder\\NamespaceMatch",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Builder/NamespaceMatch.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Builder\\ParametersMatch",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Builder/ParametersMatch.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Builder\\Stub",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Builder/Stub.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Exception/Exception.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Generator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Generator.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Invocation",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Invocation/Invocation.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\InvocationMocker",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/InvocationMocker.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Invocation\\ObjectInvocation",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Invocation/ObjectInvocation.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Invocation\\StaticInvocation",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Invocation/StaticInvocation.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Invokable",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Invokable.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\AnyInvokedCount",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/AnyInvokedCount.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\AnyParameters",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/AnyParameters.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\ConsecutiveParameters",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/ConsecutiveParameters.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\DeferredError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/DeferredError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/Invocation.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtIndex",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtIndex.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtLeastCount",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtLeastCount.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtLeastOnce",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtLeastOnce.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtMostCount",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedAtMostCount.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedCount",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedCount.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedRecorder",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/InvokedRecorder.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\MethodName",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/MethodName.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\Parameters",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/Parameters.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Matcher\\StatelessInvocation",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Matcher/StatelessInvocation.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\MockBuilder",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/MockBuilder.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\MockObject",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/ForwardCompatibility/MockObject.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\RuntimeException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Exception/RuntimeException.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\ConsecutiveCalls",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/ConsecutiveCalls.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/Exception.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\MatcherCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/MatcherCollection.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\ReturnArgument",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/ReturnArgument.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\ReturnCallback",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/ReturnCallback.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\ReturnReference",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/ReturnReference.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\ReturnSelf",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/ReturnSelf.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\ReturnStub",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/ReturnStub.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Stub\\ReturnValueMap",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Stub/ReturnValueMap.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\MockObject\\Verifiable",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/Verifiable.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\OutputError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/OutputError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\RiskyTest",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/RiskyTest.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\RiskyTestError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/RiskyTestError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\SelfDescribing",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/SelfDescribing.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\SkippedTest",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/SkippedTest.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\SkippedTestCase",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/SkippedTestCase.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\SkippedTestError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/SkippedTestError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\SkippedTestSuiteError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/SkippedTestSuiteError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\SyntheticError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/SyntheticError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Test",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Test.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\TestCase",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/TestCase.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\TestFailure",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/TestFailure.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\TestListener",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/TestListener.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\TestListenerDefaultImplementation",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/TestListenerDefaultImplementation.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\TestResult",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/TestResult.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\TestSuite",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/TestSuite.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\TestSuiteIterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/TestSuiteIterator.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\UnintentionallyCoveredCodeError",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/UnintentionallyCoveredCodeError.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\Warning",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/Warning.php"),
                                new ZPair(
                                        "PHPUnit\\Framework\\WarningTestCase",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Framework/WarningTestCase.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\AfterIncompleteTestHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/AfterIncompleteTestHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\AfterLastTestHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/AfterLastTestHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\AfterRiskyTestHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/AfterRiskyTestHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\AfterSkippedTestHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/AfterSkippedTestHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\AfterSuccessfulTestHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/AfterSuccessfulTestHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\AfterTestErrorHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/AfterTestErrorHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\AfterTestFailureHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/AfterTestFailureHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\AfterTestWarningHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/AfterTestWarningHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\BaseTestRunner",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/BaseTestRunner.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\BeforeFirstTestHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/BeforeFirstTestHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\BeforeTestHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/BeforeTestHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Exception.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\Filter\\ExcludeGroupFilterIterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Filter/ExcludeGroupFilterIterator.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\Filter\\Factory",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Filter/Factory.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\Filter\\GroupFilterIterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Filter/GroupFilterIterator.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\Filter\\IncludeGroupFilterIterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Filter/IncludeGroupFilterIterator.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\Filter\\NameFilterIterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Filter/NameFilterIterator.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\Hook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/Hook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\PhptTestCase",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/PhptTestCase.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\StandardTestSuiteLoader",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/StandardTestSuiteLoader.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\TestHook",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/TestHook.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\TestListenerAdapter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Hook/TestListenerAdapter.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\TestSuiteLoader",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/TestSuiteLoader.php"),
                                new ZPair(
                                        "PHPUnit\\Runner\\Version",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Runner/Version.php"),
                                new ZPair(
                                        "PHPUnit\\TextUI\\Command",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/TextUI/Command.php"),
                                new ZPair(
                                        "PHPUnit\\TextUI\\ResultPrinter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/TextUI/ResultPrinter.php"),
                                new ZPair(
                                        "PHPUnit\\TextUI\\TestRunner",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/TextUI/TestRunner.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Blacklist",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Blacklist.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Configuration",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Configuration.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\ConfigurationGenerator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/ConfigurationGenerator.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\ErrorHandler",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/ErrorHandler.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\FileLoader",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/FileLoader.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Filesystem",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Filesystem.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Filter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Filter.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Getopt",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Getopt.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\GlobalState",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/GlobalState.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\InvalidArgumentHelper",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/InvalidArgumentHelper.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Json",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Json.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Log\\JUnit",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Log/JUnit.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Log\\TeamCity",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Log/TeamCity.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\PHP\\AbstractPhpProcess",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/PHP/AbstractPhpProcess.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\PHP\\DefaultPhpProcess",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/PHP/DefaultPhpProcess.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\PHP\\WindowsPhpProcess",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/PHP/WindowsPhpProcess.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Printer",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Printer.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\RegularExpression",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/RegularExpression.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Test",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Test.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\TestDox\\CliTestDoxPrinter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/TestDox/CliTestDoxPrinter.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\TestDox\\HtmlResultPrinter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/TestDox/HtmlResultPrinter.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\TestDox\\NamePrettifier",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/TestDox/NamePrettifier.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\TestDox\\ResultPrinter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/TestDox/ResultPrinter.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\TestDox\\TestResult",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/TestDox/TestResult.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\TestDox\\TextResultPrinter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/TestDox/TextResultPrinter.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\TestDox\\XmlResultPrinter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/TestDox/XmlResultPrinter.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\TextTestListRenderer",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/TextTestListRenderer.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Type",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Type.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\Xml",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/Xml.php"),
                                new ZPair(
                                        "PHPUnit\\Util\\XmlTestListRenderer",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit/src/Util/XmlTestListRenderer.php"),
                                new ZPair(
                                        "PHPUnit_Framework_MockObject_MockObject",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/phpunit-mock-objects/src/MockObject.php"),
                                new ZPair(
                                        "PHP_Token",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_TokenWithScope",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_TokenWithScopeAndVisibility",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ABSTRACT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_AMPERSAND",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_AND_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ARRAY",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ARRAY_CAST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_AS",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_AT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_BACKTICK",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_BAD_CHARACTER",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_BOOLEAN_AND",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_BOOLEAN_OR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_BOOL_CAST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_BREAK",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CALLABLE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CARET",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CASE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CATCH",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CHARACTER",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CLASS",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CLASS_C",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CLASS_NAME_CONSTANT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CLONE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CLOSE_BRACKET",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CLOSE_CURLY",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CLOSE_SQUARE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CLOSE_TAG",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_COALESCE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_COLON",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_COMMA",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_COMMENT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CONCAT_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CONST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CONSTANT_ENCAPSED_STRING",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CONTINUE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_CURLY_OPEN",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DEC",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DECLARE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DEFAULT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DIR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DIV",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DIV_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DNUMBER",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DO",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DOC_COMMENT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DOLLAR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DOLLAR_OPEN_CURLY_BRACES",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DOT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DOUBLE_ARROW",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DOUBLE_CAST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DOUBLE_COLON",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_DOUBLE_QUOTES",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ECHO",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ELLIPSIS",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ELSE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ELSEIF",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_EMPTY",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ENCAPSED_AND_WHITESPACE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ENDDECLARE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ENDFOR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ENDFOREACH",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ENDIF",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ENDSWITCH",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ENDWHILE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_END_HEREDOC",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_EVAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_EXCLAMATION_MARK",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_EXIT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_EXTENDS",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_FILE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_FINAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_FINALLY",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_FOR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_FOREACH",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_FUNCTION",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_FUNC_C",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_GLOBAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_GOTO",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_GT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_HALT_COMPILER",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_IF",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_IMPLEMENTS",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_INC",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_INCLUDE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_INCLUDE_ONCE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_INLINE_HTML",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_INSTANCEOF",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_INSTEADOF",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_INTERFACE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_INT_CAST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_ISSET",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_IS_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_IS_GREATER_OR_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_IS_IDENTICAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_IS_NOT_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_IS_NOT_IDENTICAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_IS_SMALLER_OR_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_Includes",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_LINE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_LIST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_LNUMBER",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_LOGICAL_AND",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_LOGICAL_OR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_LOGICAL_XOR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_LT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_METHOD_C",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_MINUS",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_MINUS_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_MOD_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_MULT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_MUL_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_NAMESPACE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_NEW",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_NS_C",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_NS_SEPARATOR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_NUM_STRING",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_OBJECT_CAST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_OBJECT_OPERATOR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_OPEN_BRACKET",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_OPEN_CURLY",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_OPEN_SQUARE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_OPEN_TAG",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_OPEN_TAG_WITH_ECHO",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_OR_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PAAMAYIM_NEKUDOTAYIM",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PERCENT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PIPE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PLUS",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PLUS_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_POW",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_POW_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PRINT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PRIVATE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PROTECTED",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_PUBLIC",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_QUESTION_MARK",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_REQUIRE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_REQUIRE_ONCE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_RETURN",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_SEMICOLON",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_SL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_SL_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_SPACESHIP",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_SR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_SR_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_START_HEREDOC",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_STATIC",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_STRING",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_STRING_CAST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_STRING_VARNAME",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_SWITCH",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_Stream",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token/Stream.php"),
                                new ZPair(
                                        "PHP_Token_Stream_CachingFactory",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token/Stream/CachingFactory.php"),
                                new ZPair(
                                        "PHP_Token_THROW",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_TILDE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_TRAIT",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_TRAIT_C",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_TRY",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_UNSET",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_UNSET_CAST",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_USE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_USE_FUNCTION",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_VAR",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_VARIABLE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_WHILE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_WHITESPACE",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_XOR_EQUAL",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_YIELD",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PHP_Token_YIELD_FROM",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-token-stream/src/Token.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Application",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Application.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ApplicationName",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/ApplicationName.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Author",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Author.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\AuthorCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/AuthorCollection.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\AuthorCollectionIterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/AuthorCollectionIterator.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\AuthorElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/AuthorElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\AuthorElementCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/AuthorElementCollection.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\BundledComponent",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/BundledComponent.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\BundledComponentCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/BundledComponentCollection.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\BundledComponentCollectionIterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/BundledComponentCollectionIterator.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\BundlesElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/BundlesElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ComponentElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ComponentElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ComponentElementCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ComponentElementCollection.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ContainsElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ContainsElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\CopyrightElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/CopyrightElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\CopyrightInformation",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/CopyrightInformation.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ElementCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ElementCollection.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Email",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Email.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/exceptions/Exception.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ExtElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ExtElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ExtElementCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ExtElementCollection.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Extension",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Extension.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ExtensionElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ExtensionElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\InvalidApplicationNameException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/exceptions/InvalidApplicationNameException.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\InvalidEmailException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/exceptions/InvalidEmailException.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\InvalidUrlException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/exceptions/InvalidUrlException.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Library",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Library.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\License",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/License.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\LicenseElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/LicenseElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Manifest",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Manifest.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestDocument",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ManifestDocument.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestDocumentException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/exceptions/ManifestDocumentException.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestDocumentLoadingException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ManifestDocumentLoadingException.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestDocumentMapper",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/ManifestDocumentMapper.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestDocumentMapperException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/exceptions/ManifestDocumentMapperException.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/ManifestElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestElementException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/exceptions/ManifestElementException.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestLoader",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/ManifestLoader.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestLoaderException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/exceptions/ManifestLoaderException.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\ManifestSerializer",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/ManifestSerializer.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\PhpElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/PhpElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\PhpExtensionRequirement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/PhpExtensionRequirement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\PhpVersionRequirement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/PhpVersionRequirement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Requirement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Requirement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\RequirementCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/RequirementCollection.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\RequirementCollectionIterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/RequirementCollectionIterator.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\RequiresElement",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/xml/RequiresElement.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Type",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Type.php"),
                                new ZPair(
                                        "PharIo\\Manifest\\Url",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/manifest/src/values/Url.php"),
                                new ZPair(
                                        "PharIo\\Version\\AbstractVersionConstraint",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/AbstractVersionConstraint.php"),
                                new ZPair(
                                        "PharIo\\Version\\AndVersionConstraintGroup",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/AndVersionConstraintGroup.php"),
                                new ZPair(
                                        "PharIo\\Version\\AnyVersionConstraint",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/AnyVersionConstraint.php"),
                                new ZPair(
                                        "PharIo\\Version\\ExactVersionConstraint",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/ExactVersionConstraint.php"),
                                new ZPair(
                                        "PharIo\\Version\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/Exception.php"),
                                new ZPair(
                                        "PharIo\\Version\\GreaterThanOrEqualToVersionConstraint",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/GreaterThanOrEqualToVersionConstraint.php"),
                                new ZPair(
                                        "PharIo\\Version\\InvalidVersionException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/InvalidVersionException.php"),
                                new ZPair(
                                        "PharIo\\Version\\OrVersionConstraintGroup",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/OrVersionConstraintGroup.php"),
                                new ZPair(
                                        "PharIo\\Version\\PreReleaseSuffix",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/PreReleaseSuffix.php"),
                                new ZPair(
                                        "PharIo\\Version\\SpecificMajorAndMinorVersionConstraint",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/SpecificMajorAndMinorVersionConstraint.php"),
                                new ZPair(
                                        "PharIo\\Version\\SpecificMajorVersionConstraint",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/SpecificMajorVersionConstraint.php"),
                                new ZPair(
                                        "PharIo\\Version\\UnsupportedVersionConstraintException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/UnsupportedVersionConstraintException.php"),
                                new ZPair(
                                        "PharIo\\Version\\Version",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/Version.php"),
                                new ZPair(
                                        "PharIo\\Version\\VersionConstraint",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/VersionConstraint.php"),
                                new ZPair(
                                        "PharIo\\Version\\VersionConstraintParser",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/VersionConstraintParser.php"),
                                new ZPair(
                                        "PharIo\\Version\\VersionConstraintValue",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/VersionConstraintValue.php"),
                                new ZPair(
                                        "PharIo\\Version\\VersionNumber",
                                        toStringR(scope.vendorDir, env)
                                                + "/phar-io/version/src/VersionNumber.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\CodeCoverage",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/CodeCoverage.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\CoveredCodeNotExecutedException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Exception/CoveredCodeNotExecutedException.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Driver\\Driver",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Driver/Driver.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Driver\\PHPDBG",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Driver/PHPDBG.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Driver\\Xdebug",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Driver/Xdebug.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Exception/Exception.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Filter",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Filter.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\InvalidArgumentException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Exception/InvalidArgumentException.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\MissingCoversAnnotationException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Exception/MissingCoversAnnotationException.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Node/AbstractNode.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Node\\Builder",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Node/Builder.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Node\\Directory",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Node/Directory.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Node\\File",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Node/File.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Node\\Iterator",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Node/Iterator.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Clover",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Clover.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Crap4j",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Crap4j.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Html\\Dashboard",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Html/Renderer/Dashboard.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Html\\Directory",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Html/Renderer/Directory.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Html\\Facade",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Html/Facade.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Html\\File",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Html/Renderer/File.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Html/Renderer.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\PHP",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/PHP.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Text",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Text.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\BuildInformation",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/BuildInformation.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Coverage",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Coverage.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Directory",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Directory.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Facade",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Facade.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\File",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/File.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Method",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Method.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Node",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Node.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Project",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Project.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Report",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Report.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Source",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Source.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Tests",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Tests.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Totals",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Totals.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Unit",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Report/Xml/Unit.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\RuntimeException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Exception/RuntimeException.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\UnintentionallyCoveredCodeException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Exception/UnintentionallyCoveredCodeException.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Util",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Util.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeCoverage\\Version",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-code-coverage/src/Version.php"),
                                new ZPair(
                                        "SebastianBergmann\\CodeUnitReverseLookup\\Wizard",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/code-unit-reverse-lookup/src/Wizard.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\ArrayComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/ArrayComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\Comparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/Comparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\ComparisonFailure",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/ComparisonFailure.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\DOMNodeComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/DOMNodeComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\DateTimeComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/DateTimeComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\DoubleComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/DoubleComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\ExceptionComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/ExceptionComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\Factory",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/Factory.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\MockObjectComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/MockObjectComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\NumericComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/NumericComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\ObjectComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/ObjectComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\ResourceComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/ResourceComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\ScalarComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/ScalarComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\SplObjectStorageComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/SplObjectStorageComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Comparator\\TypeComparator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/comparator/src/TypeComparator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Chunk",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Chunk.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\ConfigurationException",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Exception/ConfigurationException.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Diff",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Diff.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Differ",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Differ.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Exception/Exception.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\InvalidArgumentException",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Exception/InvalidArgumentException.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Line",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Line.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/LongestCommonSubsequenceCalculator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\MemoryEfficientLongestCommonSubsequenceCalculator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/MemoryEfficientLongestCommonSubsequenceCalculator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Output\\AbstractChunkOutputBuilder",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Output/AbstractChunkOutputBuilder.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Output\\DiffOnlyOutputBuilder",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Output/DiffOnlyOutputBuilder.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Output/DiffOutputBuilderInterface.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Output\\StrictUnifiedDiffOutputBuilder",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Output/StrictUnifiedDiffOutputBuilder.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Output\\UnifiedDiffOutputBuilder",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Output/UnifiedDiffOutputBuilder.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\Parser",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/Parser.php"),
                                new ZPair(
                                        "SebastianBergmann\\Diff\\TimeEfficientLongestCommonSubsequenceCalculator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/diff/src/TimeEfficientLongestCommonSubsequenceCalculator.php"),
                                new ZPair(
                                        "SebastianBergmann\\Environment\\Console",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/environment/src/Console.php"),
                                new ZPair(
                                        "SebastianBergmann\\Environment\\OperatingSystem",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/environment/src/OperatingSystem.php"),
                                new ZPair(
                                        "SebastianBergmann\\Environment\\Runtime",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/environment/src/Runtime.php"),
                                new ZPair(
                                        "SebastianBergmann\\Exporter\\Exporter",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/exporter/src/Exporter.php"),
                                new ZPair(
                                        "SebastianBergmann\\GlobalState\\Blacklist",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/global-state/src/Blacklist.php"),
                                new ZPair(
                                        "SebastianBergmann\\GlobalState\\CodeExporter",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/global-state/src/CodeExporter.php"),
                                new ZPair(
                                        "SebastianBergmann\\GlobalState\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/global-state/src/exceptions/Exception.php"),
                                new ZPair(
                                        "SebastianBergmann\\GlobalState\\Restorer",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/global-state/src/Restorer.php"),
                                new ZPair(
                                        "SebastianBergmann\\GlobalState\\RuntimeException",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/global-state/src/exceptions/RuntimeException.php"),
                                new ZPair(
                                        "SebastianBergmann\\GlobalState\\Snapshot",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/global-state/src/Snapshot.php"),
                                new ZPair(
                                        "SebastianBergmann\\ObjectEnumerator\\Enumerator",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/object-enumerator/src/Enumerator.php"),
                                new ZPair(
                                        "SebastianBergmann\\ObjectEnumerator\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/object-enumerator/src/Exception.php"),
                                new ZPair(
                                        "SebastianBergmann\\ObjectEnumerator\\InvalidArgumentException",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/object-enumerator/src/InvalidArgumentException.php"),
                                new ZPair(
                                        "SebastianBergmann\\ObjectReflector\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/object-reflector/src/Exception.php"),
                                new ZPair(
                                        "SebastianBergmann\\ObjectReflector\\InvalidArgumentException",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/object-reflector/src/InvalidArgumentException.php"),
                                new ZPair(
                                        "SebastianBergmann\\ObjectReflector\\ObjectReflector",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/object-reflector/src/ObjectReflector.php"),
                                new ZPair(
                                        "SebastianBergmann\\RecursionContext\\Context",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/recursion-context/src/Context.php"),
                                new ZPair(
                                        "SebastianBergmann\\RecursionContext\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/recursion-context/src/Exception.php"),
                                new ZPair(
                                        "SebastianBergmann\\RecursionContext\\InvalidArgumentException",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/recursion-context/src/InvalidArgumentException.php"),
                                new ZPair(
                                        "SebastianBergmann\\ResourceOperations\\ResourceOperations",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/resource-operations/src/ResourceOperations.php"),
                                new ZPair(
                                        "SebastianBergmann\\Timer\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-timer/src/Exception.php"),
                                new ZPair(
                                        "SebastianBergmann\\Timer\\RuntimeException",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-timer/src/RuntimeException.php"),
                                new ZPair(
                                        "SebastianBergmann\\Timer\\Timer",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-timer/src/Timer.php"),
                                new ZPair(
                                        "SebastianBergmann\\Version",
                                        toStringR(scope.vendorDir, env)
                                                + "/sebastian/version/src/Version.php"),
                                new ZPair(
                                        "Text_Template",
                                        toStringR(scope.vendorDir, env)
                                                + "/phpunit/php-text-template/src/Template.php"),
                                new ZPair(
                                        "TheSeer\\Tokenizer\\Exception",
                                        toStringR(scope.vendorDir, env)
                                                + "/theseer/tokenizer/src/Exception.php"),
                                new ZPair(
                                        "TheSeer\\Tokenizer\\NamespaceUri",
                                        toStringR(scope.vendorDir, env)
                                                + "/theseer/tokenizer/src/NamespaceUri.php"),
                                new ZPair(
                                        "TheSeer\\Tokenizer\\NamespaceUriException",
                                        toStringR(scope.vendorDir, env)
                                                + "/theseer/tokenizer/src/NamespaceUriException.php"),
                                new ZPair(
                                        "TheSeer\\Tokenizer\\Token",
                                        toStringR(scope.vendorDir, env)
                                                + "/theseer/tokenizer/src/Token.php"),
                                new ZPair(
                                        "TheSeer\\Tokenizer\\TokenCollection",
                                        toStringR(scope.vendorDir, env)
                                                + "/theseer/tokenizer/src/TokenCollection.php"),
                                new ZPair(
                                        "TheSeer\\Tokenizer\\TokenCollectionException",
                                        toStringR(scope.vendorDir, env)
                                                + "/theseer/tokenizer/src/TokenCollectionException.php"),
                                new ZPair(
                                        "TheSeer\\Tokenizer\\Tokenizer",
                                        toStringR(scope.vendorDir, env)
                                                + "/theseer/tokenizer/src/Tokenizer.php"),
                                new ZPair(
                                        "TheSeer\\Tokenizer\\XMLSerializer",
                                        toStringR(scope.vendorDir, env)
                                                + "/theseer/tokenizer/src/XMLSerializer.php"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/composer")
                    .setFile("/vendor/composer/autoload_classmap.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope26 implements UpdateRuntimeScopeInterface {

        Object vendorDir;
        Object baseDir;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("vendorDir", this.vendorDir);
            stack.setVariable("baseDir", this.baseDir);
        }

        public void updateScope(RuntimeStack stack) {

            this.vendorDir = stack.getVariable("vendorDir");
            this.baseDir = stack.getVariable("baseDir");
        }
    }
}
