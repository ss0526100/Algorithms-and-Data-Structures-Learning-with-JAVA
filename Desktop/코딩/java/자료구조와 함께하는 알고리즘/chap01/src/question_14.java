import java.util.Scanner;
public class question_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
