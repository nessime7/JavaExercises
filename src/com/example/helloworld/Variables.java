package com.example.helloworld;

public class Variables {
    public static void main (String[] args) {
        String name = "John";
        System.out.println(name);
    }
}

class Variables1 {
    public static void main (String[] args) {
        int myNum = 15;
        System.out.println(myNum);
    }
}

class Variables2 {
    public static void main (String[] args) {
        int myNum;
        myNum = 15;
        System.out.println(myNum);
    }
}

class Variables3 {
    public static void main (String[] args) {
        int myNum = 15;
                myNum = 20; //myNum is now 20
        System.out.println(myNum);
    }
}

class Variables4 {
    public static void main (String [] args) {
        final int myNum = 15;
       // myNum = 15; //will generate an error when 20: cannot assign a value to final variable
    }
}

class Variables5 {
    public static void main (String [] args) {
        String name = "John";
        System.out.println("Hello" + name);
    }
}

