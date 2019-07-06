package by.epam.lab.training;

import java.util.Scanner;

public class BranchesTaskOne {

    /*
    Basics_of_software_code_development.

    1. Даны два угла треугольника (в градусах).
    Определить, существует ли такой треугольник, и если да,
    то будет ли он прямоугольным.
    */

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input angel A: ");
            double angleA = scanner.nextDouble();
            System.out.print("Input angel B: ");
            double angleB = scanner.nextDouble();

            if (angleA > 0 && angleB > 0 && (angleA + angleB) < 180) {
                System.out.println("The triangle exists.");
                if (angleA == 90 || angleB == 90 || (angleA + angleB) == 90) {
                    System.out.println("The triangle is rectangular.");
                } else {
                    System.out.println("The triangle isn't rectangular!");
                }
            } else {
                System.out.println("The triangle doesn't exist!");
            }
        }
    }

}
