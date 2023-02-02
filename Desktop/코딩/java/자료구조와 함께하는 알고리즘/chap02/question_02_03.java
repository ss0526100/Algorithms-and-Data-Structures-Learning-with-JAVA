import java.util.Scanner;
public class question_02_03 {
    static int sumOf(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={10,516,54,45,1};
        System.out.println(sumOf(arr));
    }
}
