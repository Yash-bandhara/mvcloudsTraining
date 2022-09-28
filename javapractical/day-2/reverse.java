
// reverse each words from the string

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        System.out.println("enter a string: ");
        Scanner sc = new Scanner(System.in);
        String b = "";
        String str = sc.nextLine();
        String a[] = str.split(" ");
        
        for(int i = a.length-1;i>=0; i--){
            b = b + a[i] + " ";
        }
        System.out.println(b);
        sc.close();
    }
    
}
