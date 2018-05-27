package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ClassPatchInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/KeywordPatch.php

*/

public class KeywordPatch extends RuntimeClassBase implements ClassPatchInterface {

    public KeywordPatch(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, null);
        Object methodNames = null;
        Object methodsToRemove = null;
        Object methodName = null;
        methodNames =
                CRArrayF.array_keys
                        .env(env)
                        .call(env.callMethod(node, "getMethods", KeywordPatch.class))
                        .value();
        methodsToRemove =
                CRArrayF.array_intersect
                        .env(env)
                        .call(methodNames, env.callMethod(this, "getKeywords", KeywordPatch.class))
                        .value();
        for (ZPair zpairResult54 : ZVal.getIterable(methodsToRemove, env, true)) {
            methodName = ZVal.assign(zpairResult54.getValue());
            env.callMethod(node, "removeMethod", KeywordPatch.class, methodName);
        }

        return null;
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        return 49;
    }

    @ConvertedMethod
    private Object getKeywords(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThanOrEqualTo(70116, ">=", 70000)) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, "__halt_compiler")));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, "__halt_compiler"),
                        new ZPair(1, "abstract"),
                        new ZPair(2, "and"),
                        new ZPair(3, "array"),
                        new ZPair(4, "as"),
                        new ZPair(5, "break"),
                        new ZPair(6, "callable"),
                        new ZPair(7, "case"),
                        new ZPair(8, "catch"),
                        new ZPair(9, "class"),
                        new ZPair(10, "clone"),
                        new ZPair(11, "const"),
                        new ZPair(12, "continue"),
                        new ZPair(13, "declare"),
                        new ZPair(14, "default"),
                        new ZPair(15, "die"),
                        new ZPair(16, "do"),
                        new ZPair(17, "echo"),
                        new ZPair(18, "else"),
                        new ZPair(19, "elseif"),
                        new ZPair(20, "empty"),
                        new ZPair(21, "enddeclare"),
                        new ZPair(22, "endfor"),
                        new ZPair(23, "endforeach"),
                        new ZPair(24, "endif"),
                        new ZPair(25, "endswitch"),
                        new ZPair(26, "endwhile"),
                        new ZPair(27, "eval"),
                        new ZPair(28, "exit"),
                        new ZPair(29, "extends"),
                        new ZPair(30, "final"),
                        new ZPair(31, "finally"),
                        new ZPair(32, "for"),
                        new ZPair(33, "foreach"),
                        new ZPair(34, "function"),
                        new ZPair(35, "global"),
                        new ZPair(36, "goto"),
                        new ZPair(37, "if"),
                        new ZPair(38, "implements"),
                        new ZPair(39, "include"),
                        new ZPair(40, "include_once"),
                        new ZPair(41, "instanceof"),
                        new ZPair(42, "insteadof"),
                        new ZPair(43, "interface"),
                        new ZPair(44, "isset"),
                        new ZPair(45, "list"),
                        new ZPair(46, "namespace"),
                        new ZPair(47, "new"),
                        new ZPair(48, "or"),
                        new ZPair(49, "print"),
                        new ZPair(50, "private"),
                        new ZPair(51, "protected"),
                        new ZPair(52, "public"),
                        new ZPair(53, "require"),
                        new ZPair(54, "require_once"),
                        new ZPair(55, "return"),
                        new ZPair(56, "static"),
                        new ZPair(57, "switch"),
                        new ZPair(58, "throw"),
                        new ZPair(59, "trait"),
                        new ZPair(60, "try"),
                        new ZPair(61, "unset"),
                        new ZPair(62, "use"),
                        new ZPair(63, "var"),
                        new ZPair(64, "while"),
                        new ZPair(65, "xor"),
                        new ZPair(66, "yield")));
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\ClassPatch\\KeywordPatch";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\ClassPatch\\KeywordPatch")
                    .setLookup(KeywordPatch.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/KeywordPatch.php")
                    .addInterface("ClassPatchInterface")
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
