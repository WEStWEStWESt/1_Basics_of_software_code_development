package by.epam.lab.training;

import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TaskTwoLinearPrograms {

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
