package org.example.concepts.oop.classesobjects;

//nest classes (a class within a class)

public class InnerClzExm {

    public int x = 5;
    public int y = 100;
    public String outerClzVar;

    // If you don't want outside objects to access the inner class, declare the
    // class as private
    public class InnerClass {

        public int x = 10;

        // a method inside a inner clz
        public int myNormalInnerMethod() {
            return y;
        }
    }

    // An inner class can also be static, which means that you can access it without
    // creating an object of the outer class

    public static class StaticInnerClz {
        public int x = 15;

        // a method inside a inner clz
        public int myStaticInnerMethod() {

            // y is a non static var, so to access it we need an instance of a outer class
            // || make y static (public static y = 5;)
            InnerClzExm myOuterClass = new InnerClzExm();
            return myOuterClass.y;

        }

        public void myStaticMethodTwo() {
            InnerClzExm myOuterClass = new InnerClzExm();
            System.out.println("myStaticMethodTwo " + myOuterClass.y);
        }
    }

}

/*
 * In app java
 * 
 * //1
 * // InnerClzExm newOuterObj = new InnerClzExm();
 * // System.out.println(newOuterObj.x);
 * 
 * // InnerClzExm.InnerClass myInnerClz = newOuterObj.new InnerClass();
 * // System.out.println(myInnerClz.x);
 * 
 * 
 * //2 my (dont use with #1)
 * // calling static innner clz without an object of outerclass
 * // InnerClzExm.StaticInnerClz staticInnerClzObj = new
 * InnerClzExm.StaticInnerClz();
 * 
 * // inner clz values can be overridden too. if they arent final or private
 * // staticInnerClzObj.x = 20;
 * // System.out.println(staticInnerClzObj.x);
 * // staticInnerClzObj.myStaticInnerMethod();
 * // staticInnerClzObj.myStaticMethodTwo();
 * 
 * 
 * //3 chat gpt, same to 2 
 * // Create an instance of the outer class to access non-static inner class and its methods
        InnerClzExm outerClass = new InnerClzExm();
        
        // Demonstrate non-static inner class
        InnerClzExm.InnerClass innerClassInstance = outerClass.new InnerClass();
        System.out.println("Non-static Inner Class - myNormalInnerMethod: " + innerClassInstance.myNormalInnerMethod());

        // Demonstrate static inner class
        // Access static inner class directly (without outer class instance)
        InnerClzExm.StaticInnerClz staticInnerClassInstance = new InnerClzExm.StaticInnerClz();
        
        // Demonstrate static inner class method 1
        System.out.println("Static Inner Class - myStaticInnerMethod: " + staticInnerClassInstance.myStaticInnerMethod());

        // Demonstrate static inner class method 2
        staticInnerClassInstance.myStaticMethodTwo();
 * 
 * 
 * 
 */
