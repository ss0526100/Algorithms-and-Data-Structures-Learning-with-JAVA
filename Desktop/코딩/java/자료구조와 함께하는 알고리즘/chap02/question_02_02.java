import java.util.Scanner;
public class question_02_02 {
    static void swap(int[] a, int idx1, int idx2){
        int t=a[idx1];a[idx1]=a[idx2];a[idx2]=t;
    }
    static void reverse(int[] a){
        System.out.println();
        for(int i=0;i<a.length/2;i++){
            System.out.println("exchange a["+i+"] and a["+(a.length-1-i)+"]");
            swap(a,i,a.length-1-i);
            printArray(a);
        }
        System.out.println();
    }
    static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("cnt : ");
        int cnt=sc.nextInt();

        int[] x=new int[cnt];
        
        for(int i=0;i<cnt;i++){
            System.out.print("a["+i+"] : ");
            x[i]=sc.nextInt();
        }

        reverse(x);

        System.out.println("array is sorted reverse");
        for(int i=0;i<cnt;i++){
            System.out.println("x["+i+"]="+x[i]);
        }
    }
}
