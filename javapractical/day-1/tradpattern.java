
//swastik pattern

import java.util.Scanner;

public class tradpattern {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int r = sc.nextInt();
        for(int i = 1; i<=r; i++){
            for(int j = 1; j<=r; j++){
                if(i==(r+1)/2 || j==(r+1)/2 || (j==1 && i<=(r+1)/2) || (j==r && i>=(r+1)/2) || (i==1 && j>=(r+1)/2) || (i==r && j<=(r+1)/2))
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
