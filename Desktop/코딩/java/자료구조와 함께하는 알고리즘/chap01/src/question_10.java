import java.util.Scanner;
public class question_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b<a){
            System.out.println("please input bigger than a");
            b=sc.nextInt();
        }
        System.out.println("b-a = "+(b-a));
    }
}
