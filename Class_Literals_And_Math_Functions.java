/* Exercise #01: Mr. Calvin paints pictures and sells them at art shows he charges $56.25 for a large
   painting and $25.80 for a small painting. Last month he sold six large and three small
   paintings how much did he earn. Note: change the amount in rupees and print the result. */

// Source code:
package earning;

public class Earning {

    public static void main(String[] args) {
        double Lp = 56.25;
        double Sp = 25.80;
        System.out.println("Mr.calvin charges $56.25 for a large Painting and $25.80 for a small painting !");
        System.out.println("Last month he sold six large and three small"
                + " paintings how much did he earn?");
        System.out.println("Last month total price he earned in dollar is:" + (6 * (Lp) + 3 * (Sp)));
        System.out.println("Last month total price he earned in Rs is:" + (6 * (Lp) + 3 * (Sp)) * 100);
    }
}

/* Exercise #02: Write a program which takes two numbers as input from user and calculate sum
 And difference of both numbers. */

// Source code:
package addandsub;

import java.util.Scanner;
public class AddandSub {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter first no:");
        a = sc.nextInt();
        System.out.println("Eneter Second no:");
        b = sc.nextInt();
        System.out.println("Value of thier Addition is:" + (a + b));
        System.out.println("Value of thier Subtraction is:" + (a - b));
    }
}

/* Exercise #03: Find more function of Math class and write a program to demonstrate all Math function in
 Java. */

// Source code:
package mathfunctions;
public class MathFunctions {

    public static void main(String[] args) {
        double a = Math.PI;
        System.out.println("Absolute value of -3 is:" + Math.abs(-3));
        System.out.println("Max value from 2 & 3 is:" + Math.max(2, 3));
        System.out.println("Min value from 4 & 5is:" + Math.min(4, 5));
        System.out.println("Round of the decimal number of 25.6789 is:" + Math.round(25.6789));
        System.out.println("Square root of 100 is:" + Math.sqrt(100));
        System.out.println("Cube root of 27 is:" + Math.cbrt(27));
        System.out.println("Value of 3 to the raised power 6 is:" + Math.pow(3, 6));
        System.out.println("Logarithm of 6 is: " + Math.log(6));
        System.out.println("The log of 56 to the base 10 is: " + Math.log10(56));
        System.out.println("The log of 5+1 is: " + Math.log1p(5));
        System.out.println("Sine value of 30 is: " + Math.sin(30));
        System.out.println(" Arc Sine value of 0.5 is: " + Math.asin(0.5));
        System.out.println("Hyperbolic Cosine value of a is: " + Math.cosh(45));
        System.out.println("Value of 45 degree in radians is: " + Math.toRadians(45));
        System.out.println("Value of pi radians in degrees is:" + Math.toDegrees(a));
    }
}

/* Exercise #04: Write a program to solve quadratic equation using Math function. */

// Source code:
package quadeq;

import java.util.Scanner;
public class QuadEq {

    public static void main(String[] args) {
        int a, b, c;
        double d, e, f, g;
        Scanner sc = new Scanner(System.in);
        System.out.print("Plz Enter First Coefficient:");
        a = sc.nextInt();
        System.out.print("Plz Enter Second Coefficient:");
        b = sc.nextInt();
        System.out.print("Plz Enter Constant Value:");
        c = sc.nextInt();
        d = ((b * b) - 4 * (a * c));
        e = Math.pow(d, 0.5);
        f = (-b + e) / 2 * a;
        System.out.println("First root of equation is:" + f);
        g = (-b - e) / 2 * a;
        System.out.println("Second root of equation is:" + g);
    }
}

/* Exercise #05: Take a three-digit number from user, separate each digit of the number and sum them
 For example: 123 =1+2+3= 6. */

// Source code:
package addition;

import java.util.Scanner;
public class Addition {

    public static void main(String[] args) {
        int a, no1, no2, no3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Plz enter your number:");
        a = sc.nextInt();
        no1 = a / 100;
        no2 = (a % 100) / 10;
        no3 = a % 10;
        System.out.printf("%d+%d+%d will be %d\n", no1, no2, no3, no1 + no2 + no3);
    }
}
