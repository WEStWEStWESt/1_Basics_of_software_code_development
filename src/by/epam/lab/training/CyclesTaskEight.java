package by.epam.lab.training;

import java.util.Scanner;

public class CyclesTaskEight {

     /*
      Basics_of_software_code_development

     8. Даны два числа. Определить цифры,
        входящие в запись как первого так и второго числа.*/

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the 1st number: ");
            String first = scanner.nextLine();
            System.out.print("Input the 2nd number: ");
            String second = scanner.nextLine();

            int flag = 0;
            System.out.print("Matches: ");

            for (int i = 0; i < first.length(); i++) {
                for (int j = 0; j < second.length(); j++) {
                    char charInSecond = second.charAt(j);

                    if (first.charAt(i) == charInSecond) {
                        System.out.print(first.charAt(i) + " ");
                        second = second.replaceAll(String.valueOf(charInSecond), "").trim();
                        flag++;
                    }
                }
            }

            if (flag == 0) {
                System.out.println("nothing found.");
            }
        }
    }

}
