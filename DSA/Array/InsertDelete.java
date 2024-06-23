
import java.util.Scanner;

public class InsertDelete {

    public static int deleteElement(int[] arr, int size, int index) {

        // Shifting the array elements from right to left at index
        for (int i = index; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size = size - 1;
        System.out.println("Array after deletion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Size of array after deletion " + size);
        return size;
    }

    public static int insertElement(int[] arr, int size, int pos, int newNum) {

        int[] newArr = new int[size + 1];
        // Shifting the array elements from left to right
        for (int i = size - 1; i >= 0; i--) {
            if (i == pos - 1) {
                newArr[i + 1] = arr[i];
                newArr[i] = newNum;
            } else if (i > pos - 1)
                newArr[i + 1] = arr[i];
            else {
                newArr[i] = arr[i];
            }
        }
        size = size + 1;
        System.out.println("Array after insertion");
        for (int i = 0; i < size; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        System.out.println("Size of array after insertion " + size);
        return size;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter initial size of array:");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter numbers:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int index = 0;

            boolean exit = false;
            do {
                System.out.println("PRESS:" +
                        "\n1 INSERT ELEMENT" +
                        "\n2 DELETE ELEMENT" +
                        "\n3 EXIT");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Enter the index at which element to be inserted");
                        index = sc.nextInt();
                        if (index > size) {
                            System.out.println("Index out of bounds");
                            break;
                        }
                        System.out.println("Enter the new element");
                        int newNum = sc.nextInt();
                        size = insertElement(arr, size, index, newNum);
                        break;

                    case 2:
                        if (size == 0) {
                            System.out.println("Array is empty");
                            break;
                        }
                        System.out.println("Enter the index of the element for deletion:");
                        index = sc.nextInt();
                        size = deleteElement(arr, size, index);
                        break;

                    case 3:
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            } while (!exit);
        }
    }
}