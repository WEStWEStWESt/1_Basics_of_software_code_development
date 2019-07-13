package by.epam.lab.training;

import java.util.Scanner;

public class CyclesTaskSeven {

    /*
     Basics_of_software_code_development

     7. Для каждого натурального числа в промежутке от m до n вывести все делители,
     кроме единицы и самого числа. m и n вводятся с клавиатуры.*/

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a natural number M: ");
            int m = scanner.nextInt();
            System.out.print("Input a natural number N: ");
            int n = scanner.nextInt();

            for (int i = m; i <= n; i++) {
                System.out.print(i + " -> ");
                for (int j = m; j <= n; j++) {
                    if (j != 1 && j != i) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }

}
