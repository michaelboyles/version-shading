package com.example.app;

import three.ten.org.apache.commons.lang3.ClassUtils;
import three.ten.org.apache.commons.lang3.mutable.MutableBoolean;

// An example of using the same class from two versions of the same library.
//
// This version imports one version of the class, and fully qualifies the other. Not my recommendation, but perhaps
// in small enough doses and with appropriate comments it would be alright.
public class FullyQualifyOnce {
    public static void main(String[] args) {
        // Static method invocations =======
        // 3.10
        ClassUtils.getAllInterfaces(Integer.class);
        // 3.9
        three.nine.org.apache.commons.lang3.ClassUtils.getAllInterfaces(Integer.class);

        // Instantiating a class ===========
        // 3.10
        MutableBoolean threeTenBoolean = new MutableBoolean();
        threeTenBoolean.setTrue();
        // 3.9
        three.nine.org.apache.commons.lang3.mutable.MutableBoolean threeNineBoolean =
            new three.nine.org.apache.commons.lang3.mutable.MutableBoolean();
        threeNineBoolean.setFalse();
    }
}
