import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        int result=0, r;
        System.out.println("enter a integer");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        while(num>0){
            r=num%10;
            num=num/10;
            result=result+(r*r*r);
        }
        if(result==temp){
            System.out.println("this one is armstrong");
        }
        else{
            System.out.println("this one is not armstrong");
        }
    sc.close();
    }
}
