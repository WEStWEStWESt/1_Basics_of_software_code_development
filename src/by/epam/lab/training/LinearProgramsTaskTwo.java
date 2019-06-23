package by.epam.lab.training;

import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LinearProgramsTaskTwo {
    /*
    Basics_of_software_code_development.

    2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    ((b + √(b^2 + 4ac))/2a)− a^3*c + b^(−2).
    */

    public static void main(String[] args) {

        int a = generatePositiveNumber();
        int b = generatePositiveNumber();
        int c = generatePositiveNumber();

        double result = (b + (sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - (pow(a, 3) * c) + (pow(b, -2));

        System.out.println("Task Two expression result: " + result);
    }

    private static int generatePositiveNumber() {
        return (new Random().nextInt(10) + 1);
    }

}
