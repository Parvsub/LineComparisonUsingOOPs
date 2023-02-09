package com.linecomparisonusingOOPs;

import java.util.Scanner;

public class EqualitylinesComparemethod {
        void length(double x1, double x2, double y1, double y2, double x3, double x4, double y3, double y4) {
            double Length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            double Length2 = Math.sqrt((x3 - x4) * (x3 - x4) + (y4 - y3) * (y4 - y3));
            System.out.println("Length1:" + Length1);
            System.out.println("Length2:" + Length2);
            System.out.println(Double.compare(Length1, Length2));
        }
        public static void main(String[] args) {
            EqualityoftwolinesOOPs equality = new EqualityoftwolinesOOPs();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter value of x and y for co-ordinate (x1,x2) (y1,y2) and (x3,x4) (y3,y4)");
            double x1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double x4 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            double y4 = scanner.nextDouble();
            equality.length(x1, x2, y1, y2,x3, x4, y3, y4);
        }
    }


