package by.epam.lab.training;

import java.util.Scanner;

import static java.lang.Math.abs;

public class CyclesTaskTwo {

    /*
    Basics_of_software_code_development

     2. Вычислить значения функции на отрезке [а,b] c шагом h:
           x, x>2;
     y = {
          -x, x<=2
     */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number A: ");
            int a = scanner.nextInt();
            System.out.print("Input a number B: ");
            int b = scanner.nextInt();
            System.out.print("Input a range H: ");
            int h = scanner.nextInt();

            if (a == b || h == 0) {
                System.out.println("Incorrect number! The program will be closed.");
            }

            int length = abs(a - b) + 1;
            int count = 0;

            if (a < b) {
                if (h <= length) {
                    for (int i = a; i <= b; i += h) {
                        handleResults(++count, i);
                    }
                } else {
                    System.out.print("Returns the one value because the range H is bigger than the segment length: ");
                    handleResults(++count, a);
                }
            }

            if (a > b) {
                if (h <= length) {
                    for (int i = b; i <= a; i += h) {
                        handleResults(++count, i);
                    }
                } else {
                    System.out.print("Returns the one value because the range H is bigger than the segment length: ");
                    handleResults(++count, b);
                }
            }
        }
    }

    private static void handleResults(int c, int i) {
        System.out.println("y" + c + " = " + (i <= 2 ? getX(i) : i));
    }

    private static int getX(int x) {
        return x < 0 ? x : -x;
    }

}
