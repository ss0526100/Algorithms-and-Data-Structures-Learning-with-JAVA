public class practice_02_11 {
    public static void main(String[] args) {
        int eratos[]=new int[33];
        int tosCnt=0;
        int cnt=0;
        eratos[tosCnt++]=2;
        for(int n=3;n<Math.sqrt(1000);n+=2){
            int i;
            for(i=0;i<tosCnt;i++){
                cnt+=2;
                if(n%eratos[i]==0)break;
            }
            if(i==tosCnt){
                System.out.println(n);
                eratos[tosCnt++]=n;
            }
        }
        cnt++;
        for(int n=(int)Math.sqrt(1000);n<1000;n++){
            int i;
            for(i=0;i<tosCnt;i++){
                cnt++;
                if(n%eratos[i]==0)break;
            }
            if(i==tosCnt)System.out.println(n);
        }
        System.out.println(cnt);
    }
}
