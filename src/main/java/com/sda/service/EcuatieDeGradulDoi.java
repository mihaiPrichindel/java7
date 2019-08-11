/*package com.sda.service;

import java.util.Scanner;

public class EcuatieDeGradulDoi {


    public static void main(String[] args) {
        System.out.println("Introduceti datele ecuatie: a, b si c");
        double a, b, c, x1, x2, delta, radicalDelta;
        Scanner sc = new Scanner(System.in);
        System.out.print(" a = ");
        a = sc.nextDouble();
        sc = new Scanner(System.in);
        System.out.print(" b = ");
        b = sc.nextDouble();
        System.out.print(" c = ");
        sc = new Scanner(System.in);
        c = sc.nextDouble();
        System.out.println("Ecutia introdusa este " + a + (" * X^2 + " + b + " X + " + c + " = 0"));
        if(a == 0) {
            System.out.println("Datele introduse nu sunt specifice unei ecuatii de gradul 2 - \"a = 0\"");
            if(b==0) {
                System.out.println("Datele introduse nu sunt specifice nici unei ecuatii de gradul 1 - \"b = 0\"");
                if(c!=0) {
                    System.out.println("Datele introduse sunt total gresite: \"a = 0\", \"b = 0\" si \"c = " + c + "\" " +
                            "este diferit de 0 - nonsens");
                } else {
                    System.out.println("Datele introduse nu sunt specifice unei ecuatii de gradul 2!");
                }
            } else {
                System.out.println("Datele introduse sunt specifice unei ecuatii de gradul 1 cu solutia x=" + (-c/b));
            }
        } else if(b==0) {
            System.out.println("Ecuatia are 2 solutii egale X1=X2 = " + (Math.sqrt(-c/a)));
        } else {
            delta = (b*b-4*a*c);
            if (delta < 0) {
                System.out.println("Ecuatia nu are solutii in domeniul numerelor reale");
            } else if (delta == 0) {
                System.out.println("Delta = 0 - cele 2 solutii sunt egale - X1=X2 = " + (-b /(2*a)));
            } else {
                radicalDelta = Math.sqrt(delta);
                System.out.println("X1 = " + (-b + radicalDelta)/(2*a));
                System.out.println("X2 = " + (-b - radicalDelta)/(2*a));
            }
        }
    }
}*/

