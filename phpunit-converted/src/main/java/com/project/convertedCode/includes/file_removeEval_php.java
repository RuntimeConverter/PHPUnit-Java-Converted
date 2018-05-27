package com.project.convertedCode.includes;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 removeEval.php

*/

public class file_removeEval_php implements RuntimeIncludable {

    public static final file_removeEval_php instance = new file_removeEval_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope19 scope = new Scope19();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope19 scope)
            throws IncludeEventException {
        scope.files = ZVal.newArray();
        ZVal.addToArray(
                scope.files,
                toStringR(env.addRootFilesystemPrefix("/"), env)
                        + "/vendor/phpunit/phpunit-mock-objects/src/Generator.php");
        ZVal.addToArray(
                scope.files,
                toStringR(env.addRootFilesystemPrefix("/"), env)
                        + "/vendor/phpunit/phpunit/tests/_files/FatalTest.php");
        ZVal.addToArray(
                scope.files,
                toStringR(env.addRootFilesystemPrefix("/"), env)
                        + "/vendor/phpunit/phpunit/src/Util/PHP/eval-stdin.php");
        ZVal.addToArray(
                scope.files,
                toStringR(env.addRootFilesystemPrefix("/"), env)
                        + "/vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassCreator.php");
        ZVal.addToArray(
                scope.files,
                toStringR(env.addRootFilesystemPrefix("/"), env)
                        + "/vendor/phpspec/prophecy/src/Prophecy/Prophecy/MethodProphecy.php");
        ZVal.addToArray(
                scope.files,
                toStringR(env.addRootFilesystemPrefix("/"), env)
                        + "/vendor/phpunit/phpunit/src/Framework/TestCase.php");
        scope.old = "eval(";
        scope._pNew = "eval222(";
        scope.a = ZVal.assign(ZVal.getElement(scope.argv, 1));
        if (ZVal.equalityCheck(scope.a, "on")) {
            scope.search = ZVal.assign(scope._pNew);
            scope.replace = ZVal.assign(scope.old);

        } else {
            if (ZVal.equalityCheck(scope.a, "off")) {
                scope.search = ZVal.assign(scope.old);
                scope.replace = ZVal.assign(scope._pNew);

            } else {
                env.echo("arg1 should be on/off (was " + toStringR(scope.a, env) + ")\n");
                env.exit();
            }
        }

        for (ZPair zpairResult2 : ZVal.getIterable(scope.files, env, true)) {
            scope.file = ZVal.assign(zpairResult2.getValue());
            scope.contents = function_file_get_contents.f.env(env).call(scope.file).value();
            if (!ZVal.isTrue(scope.contents)) {
                env.echo("no contents " + toStringR(scope.file, env));
                env.exit();
            }

            scope.contents =
                    NamespaceGlobal.str_replace
                            .env(env)
                            .addReferneceArgs(new RuntimeArgsWithReferences())
                            .call(scope.search, scope.replace, scope.contents)
                            .value();
            if (!ZVal.isTrue(scope.contents)) {
                env.echo("no contents v2 " + toStringR(scope.file, env));
                env.exit();
            }

            NamespaceGlobal.file_put_contents.env(env).call(scope.file, scope.contents);
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/").setFile("/removeEval.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope19 implements UpdateRuntimeScopeInterface {

        Object _pNew;
        Object a;
        Object search;
        Object file;
        Object contents;
        Object old;
        Object replace;
        Object files;
        Object argv;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("new", this._pNew);
            stack.setVariable("a", this.a);
            stack.setVariable("search", this.search);
            stack.setVariable("file", this.file);
            stack.setVariable("contents", this.contents);
            stack.setVariable("old", this.old);
            stack.setVariable("replace", this.replace);
            stack.setVariable("files", this.files);
            stack.setVariable("argv", this.argv);
        }

        public void updateScope(RuntimeStack stack) {

            this._pNew = stack.getVariable("new");
            this.a = stack.getVariable("a");
            this.search = stack.getVariable("search");
            this.file = stack.getVariable("file");
            this.contents = stack.getVariable("contents");
            this.old = stack.getVariable("old");
            this.replace = stack.getVariable("replace");
            this.files = stack.getVariable("files");
            this.argv = stack.getVariable("argv");
        }
    }
}
