package by.epam.lab.training;

import java.util.Scanner;

public class BranchesTaskFour {

    /*
    Basics_of_software_code_development

    4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    Определить, пройдет ли кирпич через отверстие.*/

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input 1st hole size A: ");
            double a = scanner.nextDouble();
            System.out.print("Input 2nd hole size B: ");
            double b = scanner.nextDouble();
            System.out.print("Input side size X: ");
            double x = scanner.nextDouble();
            System.out.print("Input side size Y: ");
            double y = scanner.nextDouble();
            System.out.print("Input side size Z: ");
            double z = scanner.nextDouble();
            System.out.println("\n---------------------");

            if (a > 0 && b > 0 && x > 0 && y > 0 && z > 0) {
                if ((a > x && a > y && a > z) && (b > x && b > y && b > z)) {
                    System.out.println("Block fit in the hole.");
                } else {
                    System.out.println("Block won't fit in the hole.");
                }
            } else {
                System.out.println("Incorrect input!\nThe program will be closed!");
            }
        }
    }

}
