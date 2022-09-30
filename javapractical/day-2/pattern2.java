import java.util.Scanner;
public class pattern2
{
    public static void main(String args[]) 
    {
        int i, j;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        for(i=0; i<=rows; i++){
            for(j=i; j<rows; j++){
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
        // space = 1;
        for(i=rows-1; i>=0; i--){
            for(j=rows; j>i; j--){
                System.out.print(" ");
            }
            for(int k=(2*i-1); k>=1; k--){
                if(k%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(i-1);
                }
            }

            System.out.println("");
        }
    }
}