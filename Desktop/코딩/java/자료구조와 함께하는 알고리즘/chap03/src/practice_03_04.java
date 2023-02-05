public class practice_03_04 {
    static int binSearch(int[] a,int key){
        int pl=0;
        int pr=a.length-1;
        int pc;
        do{
            pc=(pl+pr)/2;
            if(a[pc]==key)return pc;
            if(a[pc]>key)pr=pc-1;
            if(a[pc]<key)pl=pc+1;
        }while(pl<=pr);
        return -1;
    }
    public static void main(String[] args) {
        int[] x={0,2,4,6,8,10,15,17,32,43,52};
        int key=17;
        int idx=binSearch(x,key);
        if(idx==-1)System.out.println(key+" doesn't exist in the x");
        else System.out.println(key+" is in the x["+idx+"]");
    }
}
