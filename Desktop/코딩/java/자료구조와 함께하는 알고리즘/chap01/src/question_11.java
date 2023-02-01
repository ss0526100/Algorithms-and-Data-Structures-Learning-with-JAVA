import java.util.Scanner;
public class question_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=1;
        while(target>=10){
            target/=10;
            ans++;
        }
        System.out.println(ans);
    }
}
