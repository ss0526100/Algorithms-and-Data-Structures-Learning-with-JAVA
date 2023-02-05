public class question_03_02 {
    static int seqSearch(int[]a, int key){
        System.out.print("   |");
        for(int i=0;i<a.length;i++){
            System.out.printf("%3d",i);
        }
        System.out.println();
        System.out.println("---+"+"---".repeat(a.length));
        for(int i=0;i<a.length;i++){
            System.out.print("   |");
            System.out.print(" ".repeat(i*3)+"  *\n");
            System.out.printf("%3d|",i);
            printArr(a);
            if(a[i]==key)return i;
            System.out.println("   |");
        }
        return -1;
    }
    static void printArr(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.printf("%3d",a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] x={0,2,4,6,8,10,15,17,32,43,52};
        int key=32;
        System.out.print("search target : "+key+"\n");

        int idx=seqSearch(x, key);
        if(idx==-1)System.out.println(key+" doesn't exist in the x");
        else System.out.println(key+" is in the x["+idx+"]");
    }
}
