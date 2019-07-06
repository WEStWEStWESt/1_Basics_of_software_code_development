package by.epam.lab.training;

import java.util.Scanner;

public class BranchesTaskTwo {

    /*
    Basics_of_software_code_development.

    2. Найти max{min(a, b), min(c, d)}.
    */

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number A: ");
            int a = scanner.nextInt();
            System.out.print("Input a number B: ");
            int b = scanner.nextInt();
            System.out.print("Input a number C: ");
            int c = scanner.nextInt();
            System.out.print("Input a number D: ");
            int d = scanner.nextInt();
            System.out.println("\n---------------------");

            int minAB = 0;
            int minCD = 0;

            if (a < b || a == b) minAB = a;
            else minAB = b;

            if (c < d || c == d) minCD = c;
            else minCD = d;

            System.out.println("MIN of A,B numbers: " + minAB
                    + "\nMIN of C,D numbers: " + minCD);

            if (minAB > minCD) {
                System.out.println("MAX of min numbers: " + minAB);
            } else {
                System.out.println("MAX of min numbers: " + minCD);
            }
        }
    }

}
