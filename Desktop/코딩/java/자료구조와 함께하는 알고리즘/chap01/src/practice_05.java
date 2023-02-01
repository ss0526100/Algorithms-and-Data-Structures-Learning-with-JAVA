import java.util.Scanner;
public class practice_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            n=sc.nextInt();
        }while(n<=0);
        int sum=0;
        sum=(1+n)*n/2;
        System.out.println(sum);
    }   
}
