package com.example.app;

// An example of using the same class from two versions of the same library.
//
// This version fully qualifies both versions and imports neither. It's verbose, but perhaps that's the price we pay for
// doing this weird crap.
public class FullyQualifyAll {
    public static void main(String[] args) {
        // Static method invocations =======
        // 3.10
        three.ten.org.apache.commons.lang3.ClassUtils.getAllInterfaces(Integer.class);
        // 3.9
        three.nine.org.apache.commons.lang3.ClassUtils.getAllInterfaces(Integer.class);

        // Instantiating a class ===========
        // 3.10
        three.ten.org.apache.commons.lang3.mutable.MutableBoolean threeTenBoolean =
            new three.ten.org.apache.commons.lang3.mutable.MutableBoolean();
        threeTenBoolean.setTrue();
        // 3.9
        three.nine.org.apache.commons.lang3.mutable.MutableBoolean threeNineBoolean =
            new three.nine.org.apache.commons.lang3.mutable.MutableBoolean();
        threeNineBoolean.setFalse();
    }
}
