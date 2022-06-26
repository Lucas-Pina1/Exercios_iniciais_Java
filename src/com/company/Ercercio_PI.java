package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Ercercio_PI {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double PI = 3.14159;

        double area = PI * raio * raio;

        System.out.printf("AREA DO CIRCULO = %.4f%n", area);

        sc.close();
    }
}
