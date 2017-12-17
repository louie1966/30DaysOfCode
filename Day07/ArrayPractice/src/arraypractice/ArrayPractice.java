package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int Item = array[i];
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(Item);
        }
        System.out.println("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String Item = array[i];
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(Item);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        // index:  0  1  2  3  4
        // array: {0, 5, 3, 2, 1} --> length 5

        // Random objects from Array
        // Math.abs(rand.nextInt) % intArray1.length;
        
        // index:    0       1      2
        // array: {"Bob", "Bobby", "Max"} --> length 3
        // Declaring, Allocating and Initializing
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 2, 9, 1, 2};

        String[] shoppingList = {"bananas", "apples", "pears"};
        // index:   0  1  2  3
        // array: {10, 6, 5, 10} --> length 4
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        // Print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        // Custom print out arrays 
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3));
        System.out.println();

        // Sorting wil detroy initial sort
        Arrays.sort(intArray3);
        printArray(intArray3);

        // Print string array
        printArray(shoppingList);

        // Special for loop: foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}
