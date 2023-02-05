import java.util.Scanner;
public class question_03_01 {
    static int seqSearchSen(int[]a,int n, int key){
        int i=0;
        for(i=0;i<=n;i++){
            if(a[i]==key)break;
        }
        return i==n?-1:i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Num : ");
        int n=sc.nextInt();
        int[] x=new int[n+1];
        for(int i=0;i<x.length-1;i++){
            System.out.print("x["+i+"] : ");
            x[i]=sc.nextInt();
        }
        System.out.print("search target : ");
        int key=sc.nextInt();
        x[n]=key;
        int idx=seqSearchSen(x,n, key);
        if(idx==-1)System.out.println(key+" doesn't exist in the x");
        else System.out.println(key+" is in the x["+idx+"]");
    }
}
