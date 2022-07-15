package com.example.app;

import java.util.List;

/**
 * A facade for Apache Commons Lang. Since multiple versions of this library are included, this can be used to
 * select between which version is desirable in a given context.
 */
public interface CommonsLangFacade {
    List<Class<?>> getAllInterfaces(Class<?> cls);

    // Expose any other required methods...
}
