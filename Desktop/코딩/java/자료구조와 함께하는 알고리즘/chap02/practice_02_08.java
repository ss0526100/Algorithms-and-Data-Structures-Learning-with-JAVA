import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.Scanner;
public class practice_02_08 {
    static int cardConvR(int x, int r, char[] d){
        int digits=0;
        String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++]=dchar.charAt(x%r);
            x/=r;
        }while(x!=0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no,cd,dno,retry;
        char[] cno=new char[32];

        System.out.println("numerical change decimal");
        do{
            do{
                System.out.print("non-negative integer target>>");
                no=sc.nextInt();
            }while(no<0);

            do{
                System.out.print("what base n exchange?(2~36)>> ");
                cd=sc.nextInt();
            }while(cd<2||cd>36);

            dno=cardConvR(no, cd, cno);

            System.out.println();
        }
    }
}
