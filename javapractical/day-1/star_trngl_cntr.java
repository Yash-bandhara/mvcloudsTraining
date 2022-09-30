
//triangle center

import java.util.Scanner;
public class star_trngl_cntr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int rows = sc.nextInt();
        for(int i=0; i<=rows; i++){
            for(int j=i; j<rows; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                if(k==1 || k == (2*i-1) || i==rows && k%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
