package org.example.singleton;

import java.io.Serializable;

/**
 * Method 2: Singleton With Public Static Factory Method
 */
public class StaticFactoryMethodSingleton implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final StaticFactoryMethodSingleton INSTANCE = new StaticFactoryMethodSingleton();
    private StaticFactoryMethodSingleton(){}
    public static StaticFactoryMethodSingleton getInstance(){
        return INSTANCE;
    }

}
