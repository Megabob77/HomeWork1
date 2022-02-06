package Exercise;

import java.util.Scanner;

public class Rectangle {

    public double areaCalculator;

    {
        double side1 = 2;
        double side2 = 3;
        System.out.println(side1 + side2);
    }

    public double perimeterCalculator;

    {
        double side1 = 2;
        double side2 = 3;
        System.out.println((side1 + side2) * 2);
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ширину: ");
        double side1 = Double.parseDouble(console.next());
        System.out.println("Введите длинну: ");
        double side2 = Double.parseDouble(console.next());
        System.out.println();


        System.out.println("Площадь: " + side1 * side2);
        System.out.println();
        System.out.println("Периметр : " + (side1 + side2) * 2);
    }
}






