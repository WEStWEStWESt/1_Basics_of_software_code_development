package by.epam.lab.training;

import static java.lang.Math.pow;

public class CyclesTaskFour {

     /*
       Basics_of_software_code_development

      4. Составить программу нахождения произведения квадратов первых двухсот чисел.
    */

    public static void main(String[] args) {
        long product = 1;
        for (int i = 1; i <= 200; i++) {
            product *= pow(i, 2);
        }
        System.out.println("PRODUCTS of squares of the first two hundred numbers: " + product);
    }

}
