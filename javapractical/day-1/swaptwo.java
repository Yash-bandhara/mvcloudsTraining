
//Swap two numbers without using thrid variable

import java.util.Scanner;

public class swaptwo {
    public static void main(String args[]){
        System.out.println("enter two different values: ");
        Scanner sc = new Scanner(System.in);  
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("before swapping ->" + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("after swapping ->" + x + " " + y);
    }
}
