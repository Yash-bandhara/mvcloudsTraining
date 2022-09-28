
//find the second larest intger from the list

public class scndlarge {
    public static int getscndlarge(int[] a, int t){ //t means total
        int temp;
        for(int i = 0; i < t; i++){
            for(int j = i+1; j < t; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[t - 2];
    }
    public static void main(String args[]){
        int a[] = {98, 32, 72, 94, 75, 73, 92, 36, 28, 34};
        System.out.println("second largest number is: "+ getscndlarge(a,10));
    }
}
