package com.example.app;

// An example of using the same class from two versions of the same library.
//
// This version isolates the imports behind a facade specific to each version of the library. It could  be a significant
// amount of manual effort to create the facades, depending on how many classes and methods are invoked, but this
// method does the best job of separating the janky aspects of the application from the
public record DependencyInjection(CommonsLangFacade commonsLangFacade) {
    public static void main(String[] args) {
        new DependencyInjection(new CommonsLangThreeTenFacade()).printInterfaces(Integer.class);
        new DependencyInjection(new CommonsLangThreeNineFacade()).printInterfaces(Double.class);
    }

    void printInterfaces(Class<?> clazz) {
        System.out.println(
            commonsLangFacade.getAllInterfaces(clazz)
        );
    }
}
