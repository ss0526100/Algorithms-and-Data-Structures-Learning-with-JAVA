import java.util.Scanner;
public class practice_02_04 {
    static int maxOf(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i])max=a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("get max of height");
        System.out.print("people count>>");
        int num=sc.nextInt();
        
        int[] height=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("heigth["+i+"] : ");
            height[i]=sc.nextInt();
        }

        System.out.println("maximum is "+maxOf(height));
    }
}
