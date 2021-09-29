package com.programming;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'a' in ax^2+bx=c :");
        double a = sc.nextInt();
        System.out.println("Enter the value of 'b' in ax^2+bx=c :");
        double b = sc.nextInt();
        System.out.println("Enter the value of 'c' in ax^2+bx=c :");
        double c = sc.nextInt();

//        double delta = (Math.pow(a,2)) - 4*(a)*(c);
        double delta = (Math.pow(a,2)) -(-1)* 4*(a)*(c);
        double roots1 =(-b + (Math.sqrt(delta)) / (2*a));
        double roots2 =(-b - (Math.sqrt(delta)) / (2*a));

        System.out.println("The roots of the equation ax^2+bx=c are " + roots1 + " & " + roots2);

    }
//
//    public static void rootCalc(int a,int b,int c) {
//        double delta = (Math.pow(a,2)) - 4*(a)*(c);
//        double roots1 =(-b + (Math.sqrt(delta)) / (2*a));
//        double roots2 =(-b - (Math.sqrt(delta)) / (2*a));
//
//        System.out.println("The roots of the equation ax^2+bx=c are " + roots1 + " & " + roots2);
//    }
}
