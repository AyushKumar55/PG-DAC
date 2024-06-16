import java.util.Scanner;

class TestPoint{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter x-y coordinates of first point");
        Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());

        System.out.println("Enter x-y coordinates of second point");
        Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());

        System.out.println("Point 1 "+p1.show());
        System.out.println("Point 2 "+p2.show());;

        if(p1.isEqual(p2))
            System.out.println("SAME");
        else{
            System.out.println("DIFFERENT");
            double distance=p1.calculateDistance(p2);
            System.out.printf("Distance between both points = %.2f", distance);
        }
        sc.close();
    }
}