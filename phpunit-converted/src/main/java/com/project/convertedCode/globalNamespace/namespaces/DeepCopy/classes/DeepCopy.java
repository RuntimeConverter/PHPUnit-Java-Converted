package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Exception.classes.CloneException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplDoublyLinkedList;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.namespaces.Spl.classes.SplDoublyLinkedListFilter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.modules.standard.other.function_call_user_func;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.namespaces.Date.classes.DateIntervalFilter;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.modules.standard.other.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeMatcher.classes.TypeMatcher;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Reflection.classes.ReflectionHelper;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.modules.standard.other.function_is_object;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/DeepCopy.php

*/

public class DeepCopy extends RuntimeClassBase {

    public Object hashMap = ZVal.newArray();

    public Object filters = ZVal.newArray();

    public Object typeFilters = ZVal.newArray();

    public Object skipUncloneable = false;

    public Object useCloneMethod = null;

    public DeepCopy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DeepCopy.class) {
            this.__construct(env, args);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "useCloneMethod",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object useCloneMethod = assignParameter(args, 0, null);
        if (ZVal.isNull(useCloneMethod)) {
            useCloneMethod = false;
        }
        toObjectR(this).accessProp(this, env).name("useCloneMethod").set(useCloneMethod);
        env.callMethod(
                this,
                "addTypeFilter",
                DeepCopy.class,
                new DateIntervalFilter(env),
                new TypeMatcher(env, "DateInterval"));
        env.callMethod(
                this,
                "addTypeFilter",
                DeepCopy.class,
                new SplDoublyLinkedListFilter(env, this),
                new TypeMatcher(env, "SplDoublyLinkedList"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "skipUncloneable",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object skipUncloneable(RuntimeEnv env, Object... args) {
        Object skipUncloneable = assignParameter(args, 0, null);
        if (ZVal.isNull(skipUncloneable)) {
            skipUncloneable = true;
        }
        toObjectR(this).accessProp(this, env).name("skipUncloneable").set(skipUncloneable);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    public Object copy(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        toObjectR(this).accessProp(this, env).name("hashMap").set(ZVal.newArray());
        return ZVal.assign(env.callMethod(this, "recursiveCopy", DeepCopy.class, _object));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "DeepCopy\\Filter\\Filter")
    @ConvertedParameter(index = 1, name = "matcher", typeHint = "DeepCopy\\Matcher\\Matcher")
    public Object addFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, null);
        Object matcher = assignParameter(args, 1, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("filters").value(),
                ZVal.newArray(new ZPair("matcher", matcher), new ZPair("filter", filter)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "DeepCopy\\TypeFilter\\TypeFilter")
    @ConvertedParameter(
        index = 1,
        name = "matcher",
        typeHint = "DeepCopy\\TypeMatcher\\TypeMatcher"
    )
    public Object addTypeFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, null);
        Object matcher = assignParameter(args, 1, null);
        ZVal.addToArray(
                toObjectR(this).accessProp(this, env).name("typeFilters").value(),
                ZVal.newArray(new ZPair("matcher", matcher), new ZPair("filter", filter)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    private Object recursiveCopy(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, null);
        Object filter = null;
        if (ZVal.isTrue(
                filter =
                        env.callMethod(
                                this,
                                "getFirstMatchedTypeFilter",
                                DeepCopy.class,
                                toObjectR(this).accessProp(this, env).name("typeFilters").value(),
                                var))) {
            return ZVal.assign(env.callMethod(filter, "apply", DeepCopy.class, var));
        }

        if (NamespaceGlobal.is_resource.env(env).call(var).getBool()) {
            return ZVal.assign(var);
        }

        if (function_is_array.f.env(env).call(var).getBool()) {
            return ZVal.assign(env.callMethod(this, "copyArray", DeepCopy.class, var));
        }

        if (!function_is_object.f.env(env).call(var).getBool()) {
            return ZVal.assign(var);
        }

        return ZVal.assign(env.callMethod(this, "copyObject", DeepCopy.class, var));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    private Object copyArray(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, null);
        if (ZVal.isNull(array)) {
            array = ZVal.newArray();
        }
        Object value = null;
        Object key = null;
        for (ZPair zpairResult11 : ZVal.getIterable(array, env, false)) {
            key = ZVal.assign(zpairResult11.getKey());
            value = ZVal.assign(zpairResult11.getValue());
            ZVal.putArrayElement(
                    array, key, env.callMethod(this, "recursiveCopy", DeepCopy.class, value));
        }

        return ZVal.assign(array);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    private Object copyObject(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        Object reflectedObject = null;
        Object isCloneable = null;
        Object newObject = null;
        Object property = null;
        Object objectHash = null;
        objectHash = NamespaceGlobal.spl_object_hash.env(env).call(_object).value();
        if (ZVal.isset(
                ZVal.getElement(
                        toObjectR(this).accessProp(this, env).name("hashMap").value(),
                        objectHash))) {
            return ZVal.assign(
                    ZVal.getElement(
                            toObjectR(this).accessProp(this, env).name("hashMap").value(),
                            objectHash));
        }

        reflectedObject = new ReflectionObject(env, _object);
        isCloneable = env.callMethod(reflectedObject, "isCloneable", DeepCopy.class);
        if (ZVal.strictEqualityCheck(false, "===", isCloneable)) {
            if (toObjectR(this).accessProp(this, env).name("skipUncloneable").getBool()) {
                ZVal.putArrayElement(
                        toObjectR(this).accessProp(this, env).name("hashMap").value(),
                        objectHash,
                        _object);
                return ZVal.assign(_object);
            }

            throw ZVal.getException(
                    env,
                    new CloneException(
                            env,
                            NamespaceGlobal.sprintf
                                    .env(env)
                                    .call(
                                            "The class \"%s\" is not cloneable.",
                                            env.callMethod(
                                                    reflectedObject, "getName", DeepCopy.class))
                                    .value()));
        }

        newObject = ZVal.assign(((RuntimeClassInterface) _object).phpClone());
        ZVal.putArrayElement(
                toObjectR(this).accessProp(this, env).name("hashMap").value(),
                objectHash,
                newObject);
        if (ZVal.toBool(toObjectR(this).accessProp(this, env).name("useCloneMethod").value())
                && ZVal.toBool(
                        env.callMethod(reflectedObject, "hasMethod", DeepCopy.class, "__clone"))) {
            return ZVal.assign(newObject);
        }

        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                newObject, DateTimeInterface.class, "DateTimeInterface"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(newObject, DateTimeZone.class, "DateTimeZone"))) {
            return ZVal.assign(newObject);
        }

        for (ZPair zpairResult12 :
                ZVal.getIterable(
                        ReflectionHelper.runtimeStaticObject.getProperties(env, reflectedObject),
                        env,
                        true)) {
            property = ZVal.assign(zpairResult12.getValue());
            env.callMethod(this, "copyObjectProperty", DeepCopy.class, newObject, property);
        }

        return ZVal.assign(newObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "property", typeHint = "ReflectionProperty")
    private Object copyObjectProperty(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, null);
        Object property = assignParameter(args, 1, null);
        Object filter = null;
        Object item = ZVal.newArray();
        Object propertyValue = null;
        Object matcher = null;
        if (ZVal.isTrue(env.callMethod(property, "isStatic", DeepCopy.class))) {
            return null;
        }

        for (ZPair zpairResult13 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("filters").value(), env, true)) {
            item = ZVal.assign(zpairResult13.getValue());
            matcher = ZVal.assign(ZVal.getElement(item, "matcher"));
            filter = ZVal.assign(ZVal.getElement(item, "filter"));
            if (ZVal.isTrue(
                    env.callMethod(
                            matcher,
                            "matches",
                            DeepCopy.class,
                            _object,
                            env.callMethod(property, "getName", DeepCopy.class)))) {
                env.callMethod(
                        filter,
                        "apply",
                        DeepCopy.class,
                        _object,
                        env.callMethod(property, "getName", DeepCopy.class),
                        new Closure(env) {
                            @Override
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _object = assignParameter(args, 0, null);
                                return ZVal.assign(
                                        env.callMethod(
                                                this, "recursiveCopy", DeepCopy.class, _object));
                            }
                        });
                return null;
            }
        }

        env.callMethod(property, "setAccessible", DeepCopy.class, true);
        propertyValue = env.callMethod(property, "getValue", DeepCopy.class, _object);
        env.callMethod(
                property,
                "setValue",
                DeepCopy.class,
                _object,
                env.callMethod(this, "recursiveCopy", DeepCopy.class, propertyValue));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filterRecords", typeHint = "array")
    @ConvertedParameter(index = 1, name = "var")
    private Object getFirstMatchedTypeFilter(RuntimeEnv env, Object... args) {
        Object filterRecords = assignParameter(args, 0, null);
        Object var = assignParameter(args, 1, null);
        Object matched = ZVal.newArray();
        matched =
                env.callMethod(
                        this,
                        "first",
                        DeepCopy.class,
                        filterRecords,
                        new Closure(env) {
                            @Override
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object record = assignParameter(args, 0, null);
                                if (ZVal.isNull(record)) {
                                    record = ZVal.newArray();
                                }
                                Object var = null;
                                Object matcher = null;
                                var = this.contextReferences.getCapturedValue("var");
                                matcher = ZVal.assign(ZVal.getElement(record, "matcher"));
                                return ZVal.assign(
                                        env.callMethod(matcher, "matches", DeepCopy.class, var));
                            }
                        }.use("var", var));
        return ZVal.assign(
                ZVal.isset(matched) ? ZVal.getElement(matched, "filter") : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elements", typeHint = "array")
    @ConvertedParameter(index = 1, name = "predicate", typeHint = "callable")
    private Object first(RuntimeEnv env, Object... args) {
        Object elements = assignParameter(args, 0, null);
        Object predicate = assignParameter(args, 1, null);
        Object element = null;
        for (ZPair zpairResult14 : ZVal.getIterable(elements, env, true)) {
            element = ZVal.assign(zpairResult14.getValue());
            if (function_call_user_func.f.env(env).call(predicate, element).getBool()) {
                return ZVal.assign(element);
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    public static final Object CONST_class = "DeepCopy\\DeepCopy";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {}

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\DeepCopy")
                    .setLookup(DeepCopy.class, java.lang.invoke.MethodHandles.lookup())
                    .setLocalProperties(
                            "filters",
                            "hashMap",
                            "skipUncloneable",
                            "typeFilters",
                            "useCloneMethod")
                    .setFilename("vendor/myclabs/deep-copy/src/DeepCopy/DeepCopy.php")
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
