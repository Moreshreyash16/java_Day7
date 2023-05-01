package Bridgelabz.Day7;

import java.util.Scanner;

public class LineCompare {
    public static void compare(double L1, double L2){
        if (L1==L2){
            System.out.println("Line1: " + L1 + " Line2: " + L2);
            System.out.println("Both line are equal");

        } else if (L1>L2) {
            System.out.println("Line1: " + L1 + " Line2: " + L2);
            System.out.println("Line1 is greater");
        }
        else{
            System.out.println("Line1: " + L1 + " Line2: " + L2);
            System.out.println("Line2 is greater");
        }
    }
    public static void main(String[] args) {
        double sum1=0 , sum2=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2 ; i++) {
            System.out.println("Enter the value for Line "+ i);
            System.out.println("Enter value of x1 and y1");
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            System.out.println("Enter value of x2 and y2");
            int x2 = sc.nextInt(), y2 = sc.nextInt();
            double x, y;
            x = (x2 - x1) * (x2 - x1);
            y = (y2 - y1) * (y2 - y1);
            if (i==1) {
                sum1 = Math.sqrt(x + y);
            }
            else{
                sum2 = Math.sqrt(x + y);
            }
        }
//        String sumofLine1= String.valueOf(sum1);
//        String sumofLine2= String.valueOf(sum2);
        compare(sum1,sum2);
    }
}
