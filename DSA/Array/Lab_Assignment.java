import java.util.Scanner;

public class Lab_Assignment {

    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int secondMax(int[] arr){
        arr = sort(arr);
        return arr[arr.length-2];
    }

    public static int minElement(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int secondMin(int[] arr){
        arr = sort(arr);
        return arr[1];
    }

    public static int sumEvenElements(int[] arr){
        int sumeven = 0;
        for(int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 0)
                    sumeven += arr[i];

        }
        return sumeven;
    }

    public static int sumOddElements(int[] arr){
        int sumodd = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                sumodd += arr[i];
        }
        return sumodd;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array");
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            boolean exit = false;

            do{
                System.out.println("Press\n" +
                        "1. Maximum Element\n" +
                        "2. Minimum Elmenet\n" +
                        "3. 2nd Max Element\n" +
                        "4. 2nd Min Element\n" +
                        "5. Sum of all Even Elements\n" +
                        "6. Sum of all Odd Elements\n" +
                        "7. Exit");

                switch(sc.nextInt()){
                    case 1:
                        int max = maxElement(arr);
                        System.out.println("Maximum Element = "+max);
                        break;

                    case 2:
                        int min = minElement(arr);
                        System.out.println("Minimum Element = "+min);
                        break;

                    case 3:
                        int secMax = secondMax(arr);
                        System.out.println("2nd Maximum element = "+secMax);
                        break;

                    case 4:
                        int secMin = secondMin(arr);
                        System.out.println("2nd Minimum element = "+secMin);
                        break;

                    case 5:
                        int sumEven = sumEvenElements(arr);
                        System.out.println("Sum of all even elements: "+sumEven);
                        break;

                    case 6:
                        int sumOdd = sumOddElements(arr);
                        System.out.println("Sum of all odd elements: "+sumOdd);
                        break;

                    case 7:
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }
            while(!exit);
        }
    }
}