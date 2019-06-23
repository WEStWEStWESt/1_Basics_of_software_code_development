package by.epam.lab.training;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinearProgramsTaskFour {
    /*
        Basics_of_software_code_development.

        4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        Поменять местами дробную и целую части числа и вывести полученное значение числа.
        */

    private static final Random random = new Random();
    private static final double MIN = 100.0;
    private static final double MAX = 999.0;

    public static void main(String[] args) {

        String strOriginal = Double.toString(generateFloatPointNumber());
        System.out.println("double(orig): " + strOriginal);

        Pattern pattern = Pattern.compile("^[\\d]{3}(.)[\\d]{3}");
        Matcher matcher = pattern.matcher(strOriginal);

        if (matcher.find()) {

            StringBuilder sb = new StringBuilder();
            String strTemp = strOriginal.substring(matcher.start(), matcher.end());
            System.out.println("double(temp): " + strTemp);

            String[] arrOfStr = strTemp.split("\\.");
            sb.append(arrOfStr[1]).append(".").append(arrOfStr[0]);

            System.out.println("\nTask Four result: " + sb);
        }
    }

    private static double generateFloatPointNumber() {
        return (random.nextDouble() * ((MAX - MIN) + 1) + MIN);
    }

}
