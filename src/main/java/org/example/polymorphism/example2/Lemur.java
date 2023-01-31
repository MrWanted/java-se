package org.example.polymorphism.example2;

public class Lemur extends Primate implements HasTail{
    public int age = 18;
    @Override
    public boolean isTailStriped() {
        return false;
    }
}
