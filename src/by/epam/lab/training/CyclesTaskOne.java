package by.epam.lab.training;

import java.util.Scanner;

public class CyclesTaskOne {
    /*
    Basics_of_software_code_development

    1. Напишите программу, где пользователь вводит любое целое положительное число,
       а программа суммирует все числа от 1 до введенного пользователем числа.*/

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a positive integer number: ");
            int number = scanner.nextInt();
            int result = 0;

            if (number > 0) {
                for (int i = 0; i <= number; i++) {
                    result += i;
                }
                System.out.println(result);
            } else {
                System.out.println("Incorrect number! The program will be closed.");
            }
        }
    }

}
