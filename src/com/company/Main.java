package com.company;

public class Main {

    public static void main(String[] args) {

        // Q1 assignment
        showName();

        // Q2 assignment
        sum();

        // Q3 assignment
        div();

        // Q4 assignment
        first();
        second();
        third();
        fourth();
    }

    public static void showName() {
        System.out.println("Hello\nVlad");
    }

    public static void sum() {
        int x = 2;
        int y = 5;
        int sum = x + y;
        System.out.println(sum);
    }

    public static void div() {
        float a = 100.5f;
        float b = 17.5f;
        float div = a / b;
        System.out.println(div);
    }

    public static void first() {
        int x = -5;
        int y = 8;
        int z = 6;
        int result = x + y * z;
        System.out.println(result);
    }

    public static void second() {
        int x = 55;
        int y = 9;
        int result = (x + y) % y;
        System.out.println(result);
    }

    public static void third() {
        float w = 20f;
        float x = -3f;
        float y = 5f;
        float z = 8f;
        float result = w + x * y / z;
        System.out.println(result);
    }

    public static void fourth() {
        int v = 5;
        int w = 15;
        int x = 3;
        int y = 2;
        int z = 8;
        int result = v + w / x * y - z % x;
        System.out.println(result);
    }
}

