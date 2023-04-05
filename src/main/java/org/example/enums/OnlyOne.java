package org.example.enums;

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b){
        System.out.println("Constructing");
    }
}
