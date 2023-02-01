import java.util.Scanner;
public class question_17 {
    static void spira(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<n*2;j++){
                if(j>n-i&&j<n+i)System.out.printf("%d",i%10);
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        spira(n);
    }
}
