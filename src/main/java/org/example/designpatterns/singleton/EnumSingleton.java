package org.example.designpatterns.singleton;
/***
 * Since enums are inherently serializable, we don't need to implement it with a serializable interface.
 * The reflection problem is also not there.
 * You don't need to worry about thread safety, lazy initialization, or other issues that can arise with other
 * Singleton implementations. The enum approach is guaranteed to provide a single instance of the class,
 * and is safe to use in a multithreaded environment.
 */
public enum EnumSingleton {
    INSTANCE;
    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
