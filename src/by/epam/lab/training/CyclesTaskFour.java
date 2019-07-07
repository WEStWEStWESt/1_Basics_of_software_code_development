package by.epam.lab.training;

import java.math.BigInteger;

public class CyclesTaskFour {

     /*
       Basics_of_software_code_development

      4. Составить программу нахождения произведения квадратов первых двухсот чисел.
    */

    public static void main(String[] args) {
        BigInteger product = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.longValue() <= 200; i = i.add(BigInteger.ONE)) {
            product = product.multiply(i.pow(2));
        }
        System.out.println("PRODUCTS of squares of the first two hundred numbers: " + product);
    }

}
