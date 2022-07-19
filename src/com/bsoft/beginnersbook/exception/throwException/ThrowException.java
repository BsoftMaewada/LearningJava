package com.bsoft.beginnersbook.exception.throwException;

public class ThrowException {
    static void checkEligibility(int stuage, int stuweight){
        if(stuage < 12 && stuweight < 40){
            throw new ArithmeticException("Student is not eligible for registration.");
        }
        else {
            System.out.println("Student Entry is valid!!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Registration process!!");
        checkEligibility(10, 30);
        System.out.println("Have a nice day...");
    }
}
