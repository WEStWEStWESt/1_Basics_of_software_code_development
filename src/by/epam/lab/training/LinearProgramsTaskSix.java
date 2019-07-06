package by.epam.lab.training;

import java.util.Scanner;

public class LinearProgramsTaskSix {

    /*
    Basics_of_software_code_development.

    6. Для данной области составить линейную программу,
    которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае:
    */

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a coordinate X: ");
            int x = scanner.nextInt();
            System.out.print("Input a coordinate Y: ");
            int y = scanner.nextInt();

            boolean flag = true;

            if ((x >= -2 && x <= 2) && (y >= 0 && y <= 4)
                    || ((x >= -4 && x <= 4) && (y <= 0 && y >= -3))) {
                System.out.println(flag);
            } else {
                flag = false;
                System.out.println(flag);
            }
        }
    }

}
