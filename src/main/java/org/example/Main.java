package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BigDecimal currentBalance, withdrawalAmount;

        currentBalance = new BigDecimal("1000");
        withdrawalAmount = new BigDecimal("901");

        System.out.println(withdrawalAmount.compareTo(currentBalance.multiply(BigDecimal.valueOf(0.9))));
    }
}