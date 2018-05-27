package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes.Doubler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/CachedDoubler.php

*/

public class CachedDoubler extends Doubler {

    public Object classes = ZVal.newArray();

    public CachedDoubler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CachedDoubler.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "patch",
        typeHint = "Prophecy\\Doubler\\ClassPatch\\ClassPatchInterface"
    )
    public Object registerClassPatch(RuntimeEnv env, Object... args) {
        Object patch = assignParameter(args, 0, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("classes").value(), ZVal.newArray());
        super.registerClassPatch(env, patch);
        return null;
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
        Object classId = null;
        classId = env.callMethod(this, "generateClassId", CachedDoubler.class, _pClass, interfaces);
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("classes").value(), classId))) {
            return ZVal.assign(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("classes").value(),
                            classId));
        }

        return ZVal.assign(
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("classes").value(),
                        classId,
                        super.createDoubleClass(env, _pClass, interfaces)));
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
    private Object generateClassId(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, null);
        if (ZVal.isNull(_pClass)) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, null);
        Object parts = ZVal.newArray();
        Object _pInterface = null;
        parts = ZVal.newArray();
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pClass)) {
            ZVal.addToArray(parts, env.callMethod(_pClass, "getName", CachedDoubler.class));
        }

        for (ZPair zpairResult52 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult52.getValue());
            ZVal.addToArray(parts, env.callMethod(_pInterface, "getName", CachedDoubler.class));
        }

        CRArrayF.sort.env(env).call(parts);
        return ZVal.assign(
                NamespaceGlobal.md5
                        .env(env)
                        .call(NamespaceGlobal.implode.env(env).call("", parts).value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\CachedDoubler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Doubler.RuntimeStaticCompanion {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\CachedDoubler")
                    .setLookup(CachedDoubler.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "classes", "creator", "instantiator", "mirror", "namer", "patches")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Doubler/CachedDoubler.php")
                    .addExtendsClass("Prophecy\\Doubler\\Doubler")
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
