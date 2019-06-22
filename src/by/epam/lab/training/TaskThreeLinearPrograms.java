package by.epam.lab.training;

import java.util.Random;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class TaskThreeLinearPrograms {
    /*
        Basics_of_software_code_development.

        3. Вычислить значение выражения по формуле
        (все переменные принимают действительные значения):
        */
    public static void main(String[] args) {

        int x = generatePositiveNumber();
        int y = generatePositiveNumber();

        double result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

        System.out.println("Task Three expression result: " + result);
    }

    private static int generatePositiveNumber() {
        return (new Random().nextInt(10) + 1);
    }

}
