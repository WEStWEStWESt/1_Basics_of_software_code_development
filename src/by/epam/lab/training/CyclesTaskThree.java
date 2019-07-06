package by.epam.lab.training;

import static java.lang.Math.pow;

public class CyclesTaskThree {

    /*
       Basics_of_software_code_development

      3. Найти сумму квадратов первых ста чисел.
    */

    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += pow(i, 2);
        }
        System.out.println("SUM of squares of the first hundred numbers: " + sum);
    }

}
