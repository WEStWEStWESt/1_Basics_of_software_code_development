package by.epam.lab.training;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class CyclesTaskTwo {

    /*
    Basics_of_software_code_development

     2. Вычислить значения функции на отрезке [а,b] c шагом h: */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number A: ");
            int a = scanner.nextInt();
            System.out.print("Input a number B: ");
            int b = scanner.nextInt();
            System.out.print("Input a range H: ");
            int h = scanner.nextInt();

            int length = (int) sqrt(pow(a, 2) + pow(b, 2));

            if (a == b || h == 0) {
                System.out.println("Incorrect number! The program will be closed.");
            }

            if (h <= length) {
                handleResults(a, b, h, length);
            } else {
                System.out.print("Returns the one value because the range H is bigger than the segment length: ");
                handleResults(a, b, ++length, length);
            }
        }
    }

    private static int getX(int x) {
        return x < 0 ? x : -x;
    }

    private static void handleResults(int a, int b, int h, int length) {
        int count = 0;
        for (int i = a; a > b ? i >= length : i <= length; i = a > b ? i - h : i + h) {
            System.out.println("y" + ++count + " = " + (i <= 2 ? getX(i) : i));
        }
    }

}
