package org.example.singleton;

/**
 * Method 3: Singleton With Lazy Initialization
 */
public class DoubleCheckLockingSingleton {
    private static DoubleCheckLockingSingleton INSTANCE = null;

    private DoubleCheckLockingSingleton() {}

    public static DoubleCheckLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }

    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
