package practice.classroom;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        // data type
        // []
        // name

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        // [0] = 1
        // [1] = 2
        // [2] = 3
        // ...

        int firstNumber = numbers[0];
        System.out.println(firstNumber);

        int[] arrayOfNumbers = new int[3];
        arrayOfNumbers[0] = 3;
        arrayOfNumbers[1] = 5;
        arrayOfNumbers[2] = 6;

        System.out.println(Arrays.toString(arrayOfNumbers));

        String[] names = {"Nikita", "John", "Andrew", "Marcus"};
        String[] emptyArray = new String[4];
        emptyArray[0] = "Nikolay";
        emptyArray[1] = "Max";
        emptyArray[2] = "Janis";
        emptyArray[3] = "Armand";
        System.out.println(Arrays.toString(emptyArray));

        boolean[] booleanArray = {true, false, false, true};
        boolean isAutumn = booleanArray[0];
        boolean isHotOutside = booleanArray[1];
        System.out.printf("Outside is quite hot: %s", isAutumn);


    }
}
