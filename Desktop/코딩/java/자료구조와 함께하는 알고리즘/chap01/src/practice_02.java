import java.util.Scanner;
public class practice_02 {
    static int med3(int a, int b, int c){
        if(a>=b){
            if(b>=c)return b;
            else if(c>=a)return a;
            else return c;
        }
        else{
            if(b>c){
                if(a>c)return a;
                else return c;
            }
            else{
                return b;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(med3(a,b,c));
    }
}
