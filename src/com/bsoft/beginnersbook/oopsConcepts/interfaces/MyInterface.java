package com.bsoft.beginnersbook.oopsConcepts.interfaces;

public interface MyInterface {
    /* compiler will treat them as:
     * public abstract void method1();
     * public abstract void method2();
     */

    public void method1();
    public void method2();
}

class Demo implements MyInterface{
    /* This class must have to implement both the abstract methods
     * else you will get compilation error
     */

    public void method1(){
        System.out.println("Implementation of method 1");
    }

    public void method2(){
        System.out.println("Implementation of method 2");
    }

    public static void main(String[] args) {
        MyInterface obj = new Demo();
        obj.method1();
        obj.method2();
    }
}
