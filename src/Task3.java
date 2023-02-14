import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    static int i;
    static int count;
    static int[] array;


    public static void main(String[] args) {
        enterLengthOfArray();
        enterValueOfArray();
        multiplesOfThree();
    }

    private static void enterLengthOfArray() {
        System.out.print("Enter the length of the array: ");
        count = scanner.nextInt();
    }

    private static void enterValueOfArray() {
        array = new int[count];
        System.out.println("Enter array:");
        for (i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(array));
    }

    private static void multiplesOfThree() {
        int k = 0;
        for (i = 0; i < count; i++) {
            if (array[i] % 3 == 0 && array[i] != 0) {
                System.out.print("[" + array[i] + "] ");
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No elements in the array that are multiples of 3");
        } else {
            System.out.print("- array elements are multiples of 3");
        }
    }
}
