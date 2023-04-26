package Bridgelabz.Day7;

import java.util.Scanner;

public class LineCompare {
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
        String sumofLine1= String.valueOf(sum1);
        String sumofLine2= String.valueOf(sum2);
        if (sumofLine1.equals(sumofLine1)){
            System.out.println("Both line are equal");
        }
    }
}