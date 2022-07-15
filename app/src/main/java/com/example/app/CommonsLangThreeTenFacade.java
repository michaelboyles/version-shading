package com.example.app;

import three.ten.org.apache.commons.lang3.ClassUtils;

import java.util.List;

/**
 * A facade delegating to Apache Commons Lang 3.10
 */
public class CommonsLangThreeTenFacade implements CommonsLangFacade {
    @Override
    public List<Class<?>> getAllInterfaces(Class<?> cls) {
        return ClassUtils.getAllInterfaces(cls);
    }
}
