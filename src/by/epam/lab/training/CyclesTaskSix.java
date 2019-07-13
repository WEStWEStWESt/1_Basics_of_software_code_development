package by.epam.lab.training;

public class CyclesTaskSix {

    /*
    Basics_of_software_code_development

    6. Вывести на экран соответствия между символами и
       их численными обозначениями в памяти компьютера.*/

    public static void main(String[] args) {
        for (int i = 32; i <= 127; i++) {
            if (i % 30 == 0) {
                System.out.println("\n");
            }
            char c = (char) i;
            System.out.print(c + " ");
        }
    }

}
