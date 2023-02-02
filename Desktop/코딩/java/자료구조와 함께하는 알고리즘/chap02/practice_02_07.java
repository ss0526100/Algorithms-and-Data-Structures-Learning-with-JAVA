import java.util.Scanner;
public class practice_02_07 {
    static boolean equals(int[] a, int[] b){
        if(a.length!=b.length)return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("array a cnt>>");
        int aCnt=sc.nextInt();
        int[] a=new int[aCnt];

        for(int i=0;i<aCnt;i++){
            System.out.print("a["+i+"] : ");
            a[i]=sc.nextInt();
        }

        System.out.print("array b cnt>>");
        int bCnt=sc.nextInt();
        int[] b=new int[bCnt];

        for(int i=0;i<bCnt;i++){
            System.out.print("b["+i+"] : ");
            b[i]=sc.nextInt();
        }

        System.out.println("array a and b is "+(equals(a, b)?"same":"different"));
    }
}

