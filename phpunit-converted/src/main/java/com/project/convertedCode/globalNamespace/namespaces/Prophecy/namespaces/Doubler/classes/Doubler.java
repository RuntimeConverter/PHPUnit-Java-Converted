package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes.NameGenerator;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes.Instantiator;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes.ClassMirror;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes.ClassCreator;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Doubler.php

*/

public class Doubler extends RuntimeClassBase {

    public Object mirror = null;

    public Object creator = null;

    public Object namer = null;

    public Object patches = ZVal.newArray();

    public Object instantiator = null;

    public Doubler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Doubler.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mirror",
        typeHint = "Prophecy\\Doubler\\Generator\\ClassMirror",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "creator",
        typeHint = "Prophecy\\Doubler\\Generator\\ClassCreator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "namer",
        typeHint = "Prophecy\\Doubler\\NameGenerator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mirror = assignParameter(args, 0, null);
        if (ZVal.isNull(mirror)) {
            mirror = ZVal.getNull();
        }
        Object creator = assignParameter(args, 1, null);
        if (ZVal.isNull(creator)) {
            creator = ZVal.getNull();
        }
        Object namer = assignParameter(args, 2, null);
        if (ZVal.isNull(namer)) {
            namer = ZVal.getNull();
        }
        toObjectR(this)
                .accessProp(this, env)
                .name("mirror")
                .set(ZVal.isTrue(mirror) ? mirror : new ClassMirror(env));
        toObjectR(this)
                .accessProp(this, env)
                .name("creator")
                .set(ZVal.isTrue(creator) ? creator : new ClassCreator(env));
        toObjectR(this)
                .accessProp(this, env)
                .name("namer")
                .set(ZVal.isTrue(namer) ? namer : new NameGenerator(env));
        return null;
    }

    @ConvertedMethod
    public Object getClassPatches(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("patches").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "patch",
        typeHint = "Prophecy\\Doubler\\ClassPatch\\ClassPatchInterface"
    )
    public Object registerClassPatch(RuntimeEnv env, Object... args) {
        Object patch = assignParameter(args, 0, null);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("patches").value(), patch);
        CRArrayF.usort
                .env(env)
                .call(
                        toObjectR(this).accessProp(this, env).name("patches").value(),
                        new Closure(env) {
                            @Override
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object patch1 = assignParameter(args, 0, null);
                                Object patch2 = assignParameter(args, 1, null);
                                return ZVal.assign(
                                        ZVal.subtract(
                                                env.callMethod(
                                                        patch2, "getPriority", Doubler.class),
                                                env.callMethod(
                                                        patch1, "getPriority", Doubler.class)));
                            }
                        })
                .value();
        return null;
    }

    @ConvertedMethod(name = "double")
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "args",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object _pDouble(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        if (ZVal.isNull(_pClass)) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, null);
        Object ___args = assignParameter(args, 2, null);
        if (ZVal.isNull(___args)) {
            ___args = ZVal.getNull();
        }
        Object classname = null;
        Object reflection = null;
        Object constructor = null;
        Object _pInterface = null;
        for (ZPair zpairResult60 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult60.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            _pInterface, ReflectionClass.class, "ReflectionClass"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                NamespaceGlobal.sprintf
                                        .env(env)
                                        .call(
                                                "[ReflectionClass $interface1 [, ReflectionClass $interface2]] array expected as\n"
                                                        + "a second argument to `Doubler::double(...)`, but got %s.",
                                                function_is_object
                                                                .f
                                                                .env(env)
                                                                .call(_pInterface)
                                                                .getBool()
                                                        ? toStringR(
                                                                        function_get_class
                                                                                .f
                                                                                .env(env)
                                                                                .call(_pInterface)
                                                                                .value(),
                                                                        env)
                                                                + " class"
                                                        : NamespaceGlobal.gettype
                                                                .env(env)
                                                                .call(_pInterface)
                                                                .value())
                                        .value()));
            }
        }

        classname = env.callMethod(this, "createDoubleClass", Doubler.class, _pClass, interfaces);
        reflection = new ReflectionClass(env, classname);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", ___args)) {
            return ZVal.assign(
                    env.callMethod(reflection, "newInstanceArgs", Doubler.class, ___args));
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                constructor =
                                        env.callMethod(
                                                reflection, "getConstructor", Doubler.class)))
                || ZVal.toBool(
                        ZVal.toBool(env.callMethod(constructor, "isPublic", Doubler.class))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        constructor, "isFinal", Doubler.class))))) {
            return ZVal.assign(env.callMethod(reflection, "newInstance", Doubler.class));
        }

        if (!toObjectR(this).accessProp(this, env).name("instantiator").getBool()) {
            toObjectR(this).accessProp(this, env).name("instantiator").set(new Instantiator(env));
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("instantiator").value(),
                        "instantiate",
                        Doubler.class,
                        classname));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    protected Object createDoubleClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        if (ZVal.isNull(_pClass)) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, null);
        Object patch = null;
        Object node = null;
        Object name = null;
        name =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("namer").value(),
                        "name",
                        Doubler.class,
                        _pClass,
                        interfaces);
        node =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("mirror").value(),
                        "reflect",
                        Doubler.class,
                        _pClass,
                        interfaces);
        for (ZPair zpairResult61 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("patches").value(), env, true)) {
            patch = ZVal.assign(zpairResult61.getValue());
            if (ZVal.isTrue(env.callMethod(patch, "supports", Doubler.class, node))) {
                env.callMethod(patch, "apply", Doubler.class, node);
            }
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("creator").value(),
                "create",
                Doubler.class,
                name,
                node);
        return ZVal.assign(name);
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Doubler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Doubler")
                    .setLookup(Doubler.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("creator", "instantiator", "mirror", "namer", "patches")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Doubler/Doubler.php")
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
