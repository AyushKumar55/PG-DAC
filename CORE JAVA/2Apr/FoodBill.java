/*
Display food menu to user. User will select items from menu along with the quantity.
(eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill )
Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10), display total bill & exit.
*/

import java.util.Scanner;

class FoodBill{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int totalBill = 0;
        int quantity = 0;
        int choice = 0;
        System.out.println("VANAKAM VANAKAM!!!PLEASE CHECK OUR MENU");
        System.out.println("PRESS 1 for CHAI = 12");
        System.out.println("PRESS 2 for COFFEE = 15");
        System.out.println("PRESS 3 for VADAPAV = 15");
        System.out.println("PRESS 4 for IDLI-SAMBHAR = 30");
        System.out.println("PRESS 5 for WADA SAMBHAR = 40");
        System.out.println("PRESS 6 for IDLI WADA SAMBHAR = 40");
        System.out.println("PRESS 7 for MASALA DOSA = 40");
        System.out.println("PRESS 8 for CUT DOSA = 45");
        System.out.println("PRESS 9 for ONION UTTAPA = 45");
        System.out.println("PRESS 10 for GENERATE BILL");
        do{
            System.out.println("KEEP CHOOSING UNTIL YOU ARE FULL");
            choice = sc.nextInt();
            switch(choice){
            case 1:
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(12 * quantity);
                break;
            case 2: 
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(15 * quantity);
                break;
            case 3:
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(15 * quantity);
                break;
            case 4: 
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(30 * quantity);
                break;
            case 5:
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(40 * quantity);
                break;
            case 6: 
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(40 * quantity);
                break;
            case 7:
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(40 * quantity);
                break; 
            case 8:
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(45 * quantity);
                break;
            case 9:
                System.out.println("Quantity?");
                quantity = sc.nextInt();
                totalBill = totalBill+(45 * quantity);
                break;
            case 10: System.out.println("YOUR TOTAL BILL = "+totalBill+"ONLY"+"\nWE ACCEPT CASH AND UPI ONLY\nTHANK YOU !!!");
                break;
            default:
                System.out.println("INVALID CHOICE");
            }
        }while(choice!=10); 
    sc.close();
    }
}