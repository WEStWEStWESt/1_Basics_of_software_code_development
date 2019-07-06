package by.epam.lab.training;

import java.util.Scanner;

public class LinearProgramsTaskOne {

    /*
    Basics_of_software_code_development.

    1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
    */

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number А: ");
            int a = scanner.nextInt();
            System.out.print("Input a number B: ");
            int b = scanner.nextInt();
            System.out.print("Input a number C: ");
            int c = scanner.nextInt();

            double z = ((a - 3.0) * b / 2.0) + c;
            System.out.println("Task One expression result: " + z);
        }
    }

}
