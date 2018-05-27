package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeMatcher.classes;

import com.runtimeconverter.runtime.modules.standard.other.function_is_a;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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

 vendor/myclabs/deep-copy/src/DeepCopy/TypeMatcher/TypeMatcher.php

*/

public class TypeMatcher extends RuntimeClassBase {

    public Object type = null;

    public TypeMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TypeMatcher.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("type").set(type);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element")
    public Object matches(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, null);
        return ZVal.assign(
                function_is_object.f.env(env).call(element).getBool()
                        ? function_is_a
                                .f
                                .env(env)
                                .call(
                                        element,
                                        toObjectR(this).accessProp(this, env).name("type").value())
                                .value()
                        : ZVal.strictEqualityCheck(
                                NamespaceGlobal.gettype.env(env).call(element).value(),
                                "===",
                                toObjectR(this).accessProp(this, env).name("type").value()));
    }

    public static final Object CONST_class = "DeepCopy\\TypeMatcher\\TypeMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\TypeMatcher\\TypeMatcher")
                    .setLookup(TypeMatcher.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("type")
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/TypeMatcher/TypeMatcher.php")
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
