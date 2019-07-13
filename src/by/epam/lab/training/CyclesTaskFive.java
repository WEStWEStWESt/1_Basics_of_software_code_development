package by.epam.lab.training;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class CyclesTaskFive {

    /*
      Basics_of_software_code_development

     5. Даны числовой ряд и некоторое число е.
        Найти сумму тех членов ряда, модуль которых больше или равен
        заданному е. Общий член ряда имеет вид: An = (1/2^n) + (1/3^n)
     */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number E: ");
            double e = scanner.nextDouble();
            double a = 0;
            double sum = 0;

            for (int n = -2; n <= 2; n++) {
                a = 1 / pow(2, n) + 1 / pow(3, n);
                if (abs(a) >= e) {
                    sum += a;
                }
            }
            if (sum == 0) {
                System.out.println("Relevant values are not exists!");
            } else {
                System.out.println("sum = " + sum);
            }
        }
    }

}
