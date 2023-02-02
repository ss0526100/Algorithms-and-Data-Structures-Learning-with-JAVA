import java.util.Random;
public class question_02_01 {
    static int maxOf(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i])max=a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Random rand=new Random();
        int num=1+rand.nextInt(1000);
        
        int[] height=new int[num];
        for(int i=0;i<num;i++){
            height[i]=100+rand.nextInt(90);
        }

        System.out.println("maximum is "+maxOf(height));
    }
}
