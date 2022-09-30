
import java.util.*;
import java.util.Scanner;

public class querie{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("total number of cases : ");
        int t = sc.nextInt();

        System.out.print("faverite prime ingredient : ");
        int p = sc.nextInt();

        System.out.println("enter dishes :");
        int d = sc.nextInt();
        
        int[] m=new int[t];
        // ArrayList<Integer> m = new ArrayList<Integer>();
        System.out.println("enter flavors :");

        ArrayList<Integer> list = new ArrayList<Integer>();
        // int[] list=new int[];
        
        for(int i=0; i<t;i++){
            m[i]=sc.nextInt();
            // m.add(sc.nextLine()); 
        }

        for(int i=d; i<m.length; i++){
            if(m[i]%2==0){
                list.add(m[i]);
                
            }
        }
        for(int i=0; i<m.length; i++){
            for(int j=0; j<list.size(); j++){
                if(list[i] > m[i]){
                    int temp = m[i];
                    m[i] = list[i];
                    list[i] = temp;
                }
            }
        }

        for(int i=0; i<m.length; i++){
            // int sum += m[i];
            Collections.swap(m,m[i],list[i]);
        }
        sc.close();
    }
}