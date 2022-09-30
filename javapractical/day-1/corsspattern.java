
import java.util.Scanner;

public class corsspattern {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int r = sc.nextInt();
        for(int i = 1; i<=r; i++){
            for(int j = 1; j<=r; j++){
                if(j==1 || j==r || i==j || i+j==r+1)
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
