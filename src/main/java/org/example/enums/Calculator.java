package org.example.enums;

public enum Calculator {
    PLUS{public double apply(double x, double y){return  x + y;}},
    MINUS{public double apply(double x, double y){return  x - y;}},
    TIMES{public double apply(double x, double y){return  x * y;}},
    DIVIDE{public double apply(double x, double y){return  x / y;}};
    public abstract double apply(double x, double y);
}
