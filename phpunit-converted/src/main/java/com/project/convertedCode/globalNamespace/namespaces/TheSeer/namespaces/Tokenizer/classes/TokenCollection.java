package com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.Token;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.other.function_get_class;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.modules.standard.other.function_is_int;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.TokenCollectionException;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/theseer/tokenizer/src/TokenCollection.php

*/

public class TokenCollection extends RuntimeClassBase implements ArrayAccess, Iterator, Countable {

    public Object tokens = ZVal.newArray();

    public Object pos = null;

    public TokenCollection(RuntimeEnv env, Object... args) {
        super(env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token", typeHint = "TheSeer\\Tokenizer\\Token")
    public Object addToken(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, null);
        ZVal.addToArray(toObjectR(this).accessProp(this, env).name("tokens").value(), token);
        return null;
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.current
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("tokens").value())
                        .value());
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.key
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("tokens").value())
                        .value());
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        CRArrayF.next.env(env).call(toObjectR(this).accessProp(this, env).name("tokens").value());
        toObjectR(this)
                .accessProp(this, env)
                .name("pos")
                .set(ZVal.increment(toObjectR(this).accessProp(this, env).name("pos").value()));
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(
                        env.callMethod(this, "count", TokenCollection.class),
                        '>',
                        toObjectR(this).accessProp(this, env).name("pos").value()));
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        CRArrayF.reset.env(env).call(toObjectR(this).accessProp(this, env).name("tokens").value());
        toObjectR(this).accessProp(this, env).name("pos").set(0);
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                CRArrayF.count
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("tokens").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isset(
                        ZVal.getElement(
                                toObjectR(this).accessProp(this, env).name("tokens").value(),
                                offset)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, null);
        if (!ZVal.isTrue(env.callMethod(this, "offsetExists", TokenCollection.class, offset))) {
            throw ZVal.getException(
                    env,
                    new TokenCollectionException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call("No Token at offest %s", offset)
                                    .value()));
        }

        return ZVal.assign(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("tokens").value(), offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, null);
        Object value = assignParameter(args, 1, null);
        Object type = null;
        if (!function_is_int.f.env(env).call(offset).getBool()) {
            type = NamespaceGlobal.gettype.env(env).call(offset).value();
            throw ZVal.getException(
                    env,
                    new TokenCollectionException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Offset must be of type integer, %s given",
                                            ZVal.strictEqualityCheck(type, "===", "object")
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(value)
                                                            .value()
                                                    : type)
                                    .value()));
        }

        if (!ZVal.isTrue(ZVal.checkInstanceType(value, Token.class, "TheSeer\\Tokenizer\\Token"))) {
            type = NamespaceGlobal.gettype.env(env).call(value).value();
            throw ZVal.getException(
                    env,
                    new TokenCollectionException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "Value must be of type %s, %s given",
                                            Token.CONST_class,
                                            ZVal.strictEqualityCheck(type, "===", "object")
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(value)
                                                            .value()
                                                    : type)
                                    .value()));
        }

        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("tokens").value(), offset, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, null);
        ZVal.unsetArrayElement(
                toObjectR(this).accessProp(this, env).name("tokens").value(), offset);
        return null;
    }

    public static final Object CONST_class = "TheSeer\\Tokenizer\\TokenCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("TheSeer\\Tokenizer\\TokenCollection")
                    .setLookup(TokenCollection.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties("pos", "tokens")
                    .setFilename("vendor/theseer/tokenizer/src/TokenCollection.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
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
