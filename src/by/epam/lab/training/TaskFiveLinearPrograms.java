package by.epam.lab.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFiveLinearPrograms {
    /*
    Basics_of_software_code_development.

    5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc.*/

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number >0: ");
            int inputSeconds = scanner.nextInt();

            if (inputSeconds > 0) {
                int hours = inputSeconds / 3600;
                int minutes = (inputSeconds - hours * 3600) / 60;
                int seconds = inputSeconds - (hours * 3600 + minutes * 60);

                System.out.format("%02d" + "ч " + "%02d" + "мин " + "%02d" + "с.", hours, minutes, seconds);

            } else {
                System.out.println("Input error.");
            }
        } catch (InputMismatchException e) {
            throw new Exception("Invalid number format: " + e.getMessage());
        }
    }

}
