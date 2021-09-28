package practice;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveType {
    public static void main(String[] args) {

        // Double primitive type practice
        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMaxValue);

        double doubleValue = 1337.13;
        System.out.println(doubleValue);

        // Float primitive type practice

        float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMaxValue);

        float floatValue = 1000.1f;

        // Long primitive type practice

        // Int primitive type practice
        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int firstVariable = 200;
        int secondVariable = 400;

        System.out.println(Integer.max(firstVariable, secondVariable));
        System.out.println(Integer.max(1, 2));
        System.out.println(Integer.compare(400, 400));

        // Method call
        printHelloWorld();

        // String

        String myName = "Nikita";
        String lastName = "Milka";

        System.out.println(myName + " " + lastName);
        System.out.printf("%s %s\n", myName, lastName);

        String nameAndUserName = String.format("%s %s\n", myName, lastName);
        System.out.println(nameAndUserName);

        // Boolean

        boolean isStudent = false;

        int x = 1;
        double y = 2.0;

        List<Object> listOfGrades = new ArrayList<>();
        listOfGrades.add(8);
        listOfGrades.add(6);
        listOfGrades.add(4);
        listOfGrades.add("Hello World");
        System.out.println("Test");




    }

    // Method declaration
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }
}
