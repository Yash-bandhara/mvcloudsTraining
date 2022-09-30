
//check the list contain just odd numbers or not

import java.util.*;
public class oddcount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of list");
        int n = sc.nextInt();
        System.out.println("enter element");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        for(int i:arr){
            if(i%2==0){
            System.out.println("list conatians only odd elements");
            }
       
            else{
                System.out.println("list doesn't conatians only odd elements");
            }
        }
        sc.close();
    }
}
