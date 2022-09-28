
//check the list contain just odd numbers or not

import java.util.*;
public class oddcount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of list");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        if(isListOdd(arr)){
            System.out.println("list conatians only odd elements");
        }
        else{
            System.out.println("list doesn't conatians only odd elements");
        }
    }
    static boolean isListOdd(List<Integer> arr)
    {
        for(int i:arr){
            if(i%2 == 0)
                return false;
        }
        return true;
    }
    
}
