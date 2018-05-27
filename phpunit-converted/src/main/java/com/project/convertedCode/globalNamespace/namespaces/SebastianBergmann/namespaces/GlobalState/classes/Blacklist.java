package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/global-state/src/Blacklist.php

*/

public class Blacklist extends RuntimeClassBase {

    public Object globalVariables = ZVal.newArray();

    public Object classes = ZVal.newArray();

    public Object classNamePrefixes = ZVal.newArray();

    public Object parentClasses = ZVal.newArray();

    public Object interfaces = ZVal.newArray();

    public Object staticAttributes = ZVal.newArray();

    public Blacklist(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variableName", typeHint = "string")
    public Object addGlobalVariable(RuntimeEnv env, Object... args) {
        Object variableName = assignParameter(args, 0, null);
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("globalVariables").value(),
                variableName,
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    public Object addClass(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("classes").value(), className);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    public Object addSubclassesOf(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("parentClasses").value(), className);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interfaceName", typeHint = "string")
    public Object addImplementorsOf(RuntimeEnv env, Object... args) {
        Object interfaceName = assignParameter(args, 0, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("interfaces").value(), interfaceName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classNamePrefix", typeHint = "string")
    public Object addClassNamePrefix(RuntimeEnv env, Object... args) {
        Object classNamePrefix = assignParameter(args, 0, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("classNamePrefixes").value(),
                classNamePrefix);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
    public Object addStaticAttribute(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object attributeName = assignParameter(args, 1, null);
        if (!ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("staticAttributes").value(),
                        className))) {
            ZVal.putArrayElement(
                    toObjectR(this).accessProp(this, env).name("staticAttributes").value(),
                    className,
                    ZVal.newArray());
        }

        ZVal.setElementRecursive(
                toObjectR(this).accessProp(this, env).name("staticAttributes").value(),
                true,
                className,
                attributeName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variableName", typeHint = "string")
    public Object isGlobalVariableBlacklisted(RuntimeEnv env, Object... args) {
        Object variableName = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("globalVariables")
                                        .value(),
                                variableName)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
    public Object isStaticAttributeBlacklisted(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, null);
        Object attributeName = assignParameter(args, 1, null);
        Object prefix = null;
        Object type = null;
        Object _pClass = null;
        if (CRArrayF.in_array
                .env(env)
                .call(className, toObjectR(this).accessProp(this, env).name("classes").value())
                .getBool()) {
            return ZVal.assign(true);
        }

        for (ZPair zpairResult461 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("classNamePrefixes").value(),
                        env,
                        true)) {
            prefix = ZVal.assign(zpairResult461.getValue());
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strpos.env(env).call(className, prefix).value(), "===", 0)) {
                return ZVal.assign(true);
            }
        }

        _pClass = new ReflectionClass(env, className);
        for (ZPair zpairResult462 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("parentClasses").value(),
                        env,
                        true)) {
            type = ZVal.assign(zpairResult462.getValue());
            if (ZVal.isTrue(env.callMethod(_pClass, "isSubclassOf", Blacklist.class, type))) {
                return ZVal.assign(true);
            }
        }

        for (ZPair zpairResult463 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("interfaces").value(),
                        env,
                        true)) {
            type = ZVal.assign(zpairResult463.getValue());
            if (ZVal.isTrue(
                    env.callMethod(_pClass, "implementsInterface", Blacklist.class, type))) {
                return ZVal.assign(true);
            }
        }

        if (ZVal.isset(
                ZVal.getElementRecursive(
                        toObjectR(this).accessProp(this, env).name("staticAttributes").value(),
                        className,
                        attributeName))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "SebastianBergmann\\GlobalState\\Blacklist";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\GlobalState\\Blacklist")
                    .setLookup(Blacklist.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "classNamePrefixes",
                            "classes",
                            "globalVariables",
                            "interfaces",
                            "parentClasses",
                            "staticAttributes")
                    .setFilename("vendor/sebastian/global-state/src/Blacklist.php")
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
