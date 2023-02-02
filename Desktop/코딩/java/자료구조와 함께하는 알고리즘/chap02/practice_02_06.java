import java.util.Scanner;
public class practice_02_06 {
    static void swap(int[] a, int idx1, int idx2){
        int t=a[idx1];a[idx1]=a[idx2];a[idx2]=t;
    }
    static void reverse(int[] a){
        for(int i=0;i<a.length/2;i++){
            swap(a,i,a.length-1-i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("cnt : ");
        int cnt=sc.nextInt();

        int[] x=new int[cnt];
        
        for(int i=0;i<cnt;i++){
            System.out.print("x["+i+"] : ");
            x[i]=sc.nextInt();
        }

        reverse(x);

        System.out.println("array is sorted reverse");
        for(int i=0;i<cnt;i++){
            System.out.println("x["+i+"]="+x[i]);
        }
    }
}
