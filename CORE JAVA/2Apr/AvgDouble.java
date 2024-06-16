/*
Accept 2 double values from User (using Scanner). Check data type. 
If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.
Hint : Method of Scanner to use : hasNextDouble , nextDouble 
*/

import java.util.Scanner;

class AvgDouble{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        double d1,d2,avg;
        System.out.println ("Enter 2 numbers of type double");
        boolean exit = false;
        while(!exit){  //Continue until exit = true
            if (sc.hasNextDouble()){ //Checks if the input given is double
                d1 = sc.nextDouble();
                if (sc.hasNextDouble()){
                    d2 = sc.nextDouble();
                    System.out.println("Average of the numbers = "+(d1+d2)/2);
                    exit = true;
                }
            }
            else {
                System.out.println("Please enter only double numbers !!!");
                exit=true;
            }
        }
        sc.close();
    }
}