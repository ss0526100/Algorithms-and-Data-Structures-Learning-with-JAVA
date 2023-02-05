import java.io.OutputStream;
import java.util.Scanner;
public class practice_03_02 {
    static int seqSearch(int[]a, int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Num : ");
        int n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0;i<x.length;i++){
            System.out.print("x["+i+"] : ");
            x[i]=sc.nextInt();
        }
        System.out.print("search target : ");
        int key=sc.nextInt();

        int idx=seqSearch(x, key);
        if(idx==-1)System.out.println(key+" doesn't exist in the x");
        else System.out.println(key+" is in the x["+idx+"]");
    }
}
