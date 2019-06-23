package by.epam.lab.training;

import java.util.Scanner;

import static java.lang.Math.pow;

public class BranchesTaskFive {
    /*
    Basics_of_software_code_development

    5. Вычислить значение функции: F(x)... */

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input value X: ");
            double x = scanner.nextDouble();

            double result = 0;

            if (x <= 3) {
                result = pow(x, 2) - 3 * x + 9;
            } else {
                result = 1 / (pow(x, 3) + 6);
            }
            System.out.println("Function result: " + result);
        }
    }

}
