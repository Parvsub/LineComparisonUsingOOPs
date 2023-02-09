package com.linecomparisonusingOOPs;

import java.util.Scanner;

public class LengthusingOOPs {
    static double Length = 0;

    double Length(double x1, double x2, double y1, double y2) {
        Length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) + (y2 - y1));
        return Length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of x for co-ordinate point 1 and point 2:");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        System.out.println("Enter value of y for co-ordinate point 1 and point 2:");
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        LengthusingOOPs length = new LengthusingOOPs();
        length.Length(x1, x2, y1, y2);
        System.out.println("Length of a line: " + Length);
    }
}
