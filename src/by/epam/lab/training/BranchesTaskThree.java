package by.epam.lab.training;

import java.util.Scanner;

public class BranchesTaskThree {

    /*
    Basics_of_software_code_development.

    3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    Определить, будут ли они расположены на одной прямой.
    */

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a coordinate x1: ");
            double x1 = scanner.nextDouble();
            System.out.print("Input a coordinate y1: ");
            double y1 = scanner.nextDouble();
            System.out.print("Input a coordinate x2: ");
            double x2 = scanner.nextDouble();
            System.out.print("Input a coordinate y2: ");
            double y2 = scanner.nextDouble();
            System.out.print("Input a coordinate x3: ");
            double x3 = scanner.nextDouble();
            System.out.print("Input a coordinate y3: ");
            double y3 = scanner.nextDouble();
            System.out.println("\n---------------------");

            double resultOne = (x1 - x3) / (x2 - x3);
            double resultTwo = (y1 - y3) / (y2 - y3);

            if (resultOne == resultTwo) System.out.println("Points lie on the line");
            else System.out.println("Points don't lie on the line");

        }
    }

}
