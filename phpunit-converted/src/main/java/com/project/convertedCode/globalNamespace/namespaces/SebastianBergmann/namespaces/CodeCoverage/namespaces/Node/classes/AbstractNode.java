package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Util;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/AbstractNode.php

*/

public abstract class AbstractNode extends RuntimeClassBase implements Countable {

    public Object name = null;

    public Object path = null;

    public Object pathArray = null;

    public Object parent = null;

    public Object id = null;

    public AbstractNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractNode.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "parent",
        typeHint = "self",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, null);
        Object parent = assignParameter(args, 1, null);
        if (ZVal.isNull(parent)) {
            parent = ZVal.getNull();
        }
        if (ZVal.equalityCheck(NamespaceGlobal.substr.env(env).call(name, -1).value(), "/")) {
            name = NamespaceGlobal.substr.env(env).call(name, 0, -1).value();
        }

        toObjectR(this).accessProp(this, env).name("name").set(name);
        toObjectR(this).accessProp(this, env).name("parent").set(parent);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        Object parent = null;
        Object parentId = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("id").value(), "===", ZVal.getNull())) {
            parent = env.callMethod(this, "getParent", AbstractNode.class);
            if (ZVal.strictEqualityCheck(parent, "===", ZVal.getNull())) {
                toObjectR(this).accessProp(this, env).name("id").set("index");

            } else {
                parentId = env.callMethod(parent, "getId", AbstractNode.class);
                if (ZVal.strictEqualityCheck(parentId, "===", "index")) {
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("id")
                            .set(
                                    NamespaceGlobal.str_replace
                                            .env(env)
                                            .addReferneceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    ":",
                                                    "_",
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())
                                            .value());

                } else {
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("id")
                            .set(
                                    toStringR(parentId, env)
                                            + "/"
                                            + toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    env));
                }
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value());
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("path").value(),
                "===",
                ZVal.getNull())) {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("parent")
                                                            .value(),
                                                    "===",
                                                    ZVal.getNull()))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("parent")
                                                                    .value(),
                                                            "getPath",
                                                            AbstractNode.class),
                                                    "===",
                                                    ZVal.getNull())))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("parent")
                                                    .value(),
                                            "getPath",
                                            AbstractNode.class),
                                    "===",
                                    false))) {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("path")
                        .set(toObjectR(this).accessProp(this, env).name("name").value());

            } else {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("path")
                        .set(
                                toStringR(
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("parent")
                                                                .value(),
                                                        "getPath",
                                                        AbstractNode.class),
                                                env)
                                        + "/"
                                        + toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                env));
            }
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("path").value());
    }

    @ConvertedMethod
    public Object getPathAsArray(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("pathArray").value(),
                "===",
                ZVal.getNull())) {
            if (ZVal.strictEqualityCheck(
                    toObjectR(this).accessProp(this, env).name("parent").value(),
                    "===",
                    ZVal.getNull())) {
                toObjectR(this).accessProp(this, env).name("pathArray").set(ZVal.newArray());

            } else {
                toObjectR(this)
                        .accessProp(this, env)
                        .name("pathArray")
                        .set(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("parent")
                                                .value(),
                                        "getPathAsArray",
                                        AbstractNode.class));
            }

            ZVal.addToArray(toObjectR(this).accessProp(this, env).name("pathArray").value(), this);
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("pathArray").value());
    }

    @ConvertedMethod
    public Object getParent(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("parent").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedClassesPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, null);
        if (ZVal.isNull(asString)) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedClasses", AbstractNode.class),
                        env.callMethod(this, "getNumClasses", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedTraitsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, null);
        if (ZVal.isNull(asString)) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedTraits", AbstractNode.class),
                        env.callMethod(this, "getNumTraits", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedClassesAndTraitsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, null);
        if (ZVal.isNull(asString)) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedClassesAndTraits", AbstractNode.class),
                        env.callMethod(this, "getNumClassesAndTraits", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedFunctionsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, null);
        if (ZVal.isNull(asString)) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedFunctions", AbstractNode.class),
                        env.callMethod(this, "getNumFunctions", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedMethodsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, null);
        if (ZVal.isNull(asString)) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedMethods", AbstractNode.class),
                        env.callMethod(this, "getNumMethods", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedFunctionsAndMethodsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, null);
        if (ZVal.isNull(asString)) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedFunctionsAndMethods", AbstractNode.class),
                        env.callMethod(this, "getNumFunctionsAndMethods", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getLineExecutedPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, null);
        if (ZVal.isNull(asString)) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumExecutedLines", AbstractNode.class),
                        env.callMethod(this, "getNumExecutableLines", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    public Object getNumClassesAndTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        env.callMethod(this, "getNumClasses", AbstractNode.class),
                        env.callMethod(this, "getNumTraits", AbstractNode.class)));
    }

    @ConvertedMethod
    public Object getNumTestedClassesAndTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        env.callMethod(this, "getNumTestedClasses", AbstractNode.class),
                        env.callMethod(this, "getNumTestedTraits", AbstractNode.class)));
    }

    @ConvertedMethod
    public Object getClassesAndTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.array_merge
                        .env(env)
                        .call(
                                env.callMethod(this, "getClasses", AbstractNode.class),
                                env.callMethod(this, "getTraits", AbstractNode.class))
                        .value());
    }

    @ConvertedMethod
    public Object getNumFunctionsAndMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        env.callMethod(this, "getNumFunctions", AbstractNode.class),
                        env.callMethod(this, "getNumMethods", AbstractNode.class)));
    }

    @ConvertedMethod
    public Object getNumTestedFunctionsAndMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        env.callMethod(this, "getNumTestedFunctions", AbstractNode.class),
                        env.callMethod(this, "getNumTestedMethods", AbstractNode.class)));
    }

    @ConvertedMethod
    public Object getFunctionsAndMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.array_merge
                        .env(env)
                        .call(
                                env.callMethod(this, "getFunctions", AbstractNode.class),
                                env.callMethod(this, "getMethods", AbstractNode.class))
                        .value());
    }

    @ConvertedMethod
    public abstract Object getClasses(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getTraits(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getFunctions(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getLinesOfCode(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumExecutableLines(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumExecutedLines(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumClasses(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumTestedClasses(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumTraits(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumTestedTraits(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumMethods(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumTestedMethods(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumFunctions(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public abstract Object getNumTestedFunctions(RuntimeEnv env, Object... args);

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\AbstractNode")
                    .setLookup(AbstractNode.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("id", "name", "parent", "path", "pathArray")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/AbstractNode.php")
                    .addInterface("Countable")
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
