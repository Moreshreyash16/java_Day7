package Bridgelabz.Day7;

import java.util.Scanner;

public class LineCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x1 and y1");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("Enter value of x2 and y2");
        int x2=sc.nextInt(),y2=sc.nextInt();
        double x,y;
        x=(x2-x1)*(x2-x1);
        y=(y2-y1)*(y2-y1);
        double sum= Math.sqrt(x+y);
        System.out.println(sum);
    }
}
