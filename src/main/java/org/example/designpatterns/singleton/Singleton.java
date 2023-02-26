package org.example.designpatterns.singleton;

import java.io.Serializable;

/**
 * Method 1: Singleton With Public Static Final Field
 */
public class Singleton implements Serializable {
    public static final Singleton INSTANCE = new Singleton();
    private Singleton(){}

    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * readResolve method to preserve singleton property
     * The readResolve() method is automatically called during deserialization and can be used to ensure that the same
     * Singleton instance is returned.
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
