import java.util.Scanner;

public class ResizeArray {

    public static int[] resizeArray(int[] arr, int initialSize, int newSize) {
        // Creating a new Array
        int[] newArr = new int[newSize];

        // Copy old array into new array
        for (int i = 0; i < initialSize; i++) {
            newArr[i] = arr[i];
        }

        // Returning newArray wih old elements and increased size
        return newArr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter initial size of array");
            int initialSize = sc.nextInt();
            int[] arr = new int[initialSize];

            System.out.println("Enter numbers");
            for (int i = 0; i < initialSize; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter new size of array for storing more numbers");
            int newSize = sc.nextInt();

            arr = resizeArray(arr, initialSize, newSize);

            System.out.println(
                    "Array resized to " + newSize + "\nYou may now enter " + (newSize - initialSize) + " more numbers");
            for (int i = initialSize; i < newSize; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Array elements after adding more numbers");
            for (int i = 0; i < newSize; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}