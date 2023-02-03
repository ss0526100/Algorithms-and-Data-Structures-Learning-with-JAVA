import java.util.Scanner;
public class question_02_06 {
    static int cardConv(int x, int r, char[] d){
        int digits=0;
        String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++]=dchar.charAt(x%r);
            x/=r;
        }while(x!=0);
        reverse(d);
        return digits;
    }
    static void swap(char[] a, int idx1, int idx2){
        char t=a[idx1];a[idx1]=a[idx2];a[idx2]=t;
    }
    static void reverse(char[] a){
        for(int i=0;i<a.length/2;i++){
            swap(a,i,a.length-1-i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no,cd,dno,retry;
        char[] cno=new char[32];

        System.out.println("radix change decimal");
        do{
            do{
                System.out.print("non-negative integer target>>");
                no=sc.nextInt();
            }while(no<0);

            do{
                System.out.print("what base n exchange?(2~36)>> ");
                cd=sc.nextInt();
            }while(cd<2||cd>36);

            dno=cardConv(no, cd, cno);

            System.out.print("base"+cd+" is ");
            for(int i=0;i<cno.length;i++){
                System.out.print(cno[i]);
            }
            System.out.println();
            System.out.print("One more time?(1.yes/2.no)>>");
            retry=sc.nextInt();
        }while(retry==1);
    }
}
