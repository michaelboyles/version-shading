package com.example.app;

import three.nine.org.apache.commons.lang3.ClassUtils;

import java.util.List;

/**
 * A facade delegating to Apache Commons Lang 3.9
 */
public class CommonsLangThreeNineFacade implements CommonsLangFacade {
    @Override
    public List<Class<?>> getAllInterfaces(Class<?> cls) {
        return ClassUtils.getAllInterfaces(cls);
    }
}
