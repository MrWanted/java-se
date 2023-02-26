package org.example.designpatterns.singleton;


public class SingletonTest {
    public static void main(String[] args) {
        DoubleCheckLockingSingleton singleton = DoubleCheckLockingSingleton.getInstance();
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

        DoubleCheckLockingSingleton singleton2 = DoubleCheckLockingSingleton.getInstance();
        System.out.println(singleton.getValue());

    }

    private static void singleton1Test() {
        Singleton singleton = Singleton.INSTANCE;
        singleton.setValue(2);
        System.out.println(singleton.getValue());

        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton2.getValue());
    }

    private static void enumTest() {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.setValue(2);
        System.out.println(singleton.getValue());

        EnumSingleton anotherSingleton = EnumSingleton.INSTANCE;
        System.out.println(anotherSingleton.getValue()); // output: 2
    }
}
