import java.util.Scanner;
public class question_15 {
    static void triangleLB(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    static void triangleLU(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    static void triangleRU(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<i)System.out.printf(" ");
                else System.out.printf("*");
            }
            System.out.println();
        }
    }
    static void triangleRB(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i-1)System.out.printf(" ");
                else System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRU(n);
        System.out.println();
        triangleRB(n);
    }
}
