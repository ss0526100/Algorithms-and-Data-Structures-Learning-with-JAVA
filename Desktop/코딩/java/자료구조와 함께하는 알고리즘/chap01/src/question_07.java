import java.util.Scanner;
public class question_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ans="";
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i==1)ans=ans.concat(Integer.toString(i));
            else ans=ans.concat("+").concat(Integer.toString(i));
            sum+=i;
        }
        ans=ans.concat("=").concat(Integer.toString(sum));
        System.out.println(ans);
    }
}
