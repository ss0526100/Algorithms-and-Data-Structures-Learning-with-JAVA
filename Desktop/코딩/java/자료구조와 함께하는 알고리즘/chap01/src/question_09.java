import java.util.Scanner;
public class question_09 {
    static int sumof(int a, int b){
        int sum=0;
        if(a>b){
            int tmp=a;
            b=a;
            a=b;
        }
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sumof(a, b));
    }
}
