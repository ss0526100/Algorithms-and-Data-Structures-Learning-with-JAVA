public class practice_02_10 {
    public static void main(String[] args) {
        int cnt=0;
        int ptr=0;
        int[] prime=new int[500];

        prime[ptr++]=2;
        for(int n=3;n<=1000;n+=2){
            int i;
            for(i=1;i<ptr;i++){
                cnt++;
                if(n%prime[i]==0)break;
            }
            if(i==ptr){
                prime[ptr++]=n;
                System.out.println(n);
            }
        }
        System.out.println(cnt);
    }
}
