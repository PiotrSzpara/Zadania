package com.kodilla;

class Calculator {
    private final int a;
    private final int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void addNumbers() {
        System.out.println("a + b = " + (a + b));
    }
    public void subNumbers() {
        System.out.println("a - b = " + (a - b));
    }
}
class Aplication
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator(12,6);
        calculator.addNumbers();
        calculator.subNumbers();
    }
}
