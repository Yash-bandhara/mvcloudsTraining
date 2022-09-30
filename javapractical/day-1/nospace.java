
//erase the white spaces in the string

import java.util.Scanner;

public class nospace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter something with space");
        String a = sc.nextLine();
        String b = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ')
                b = b + a.charAt(i);
            else
                continue;
        }
        System.out.print(b);
        sc.close();
    }
}
