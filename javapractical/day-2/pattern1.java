//triangle center

import java.util.Scanner;
public class pattern1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int rows = sc.nextInt();
        for(int i=0; i<=rows; i++){
            for(int j=i; j<rows; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                if(k%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(i-1);
                }
            }

           
            System.out.println("");
        }
        int i,j;
        int space = 1;
        for (j = 1; j <= rows - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (rows - j) - 1; i++) 
            {
                if(space%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
