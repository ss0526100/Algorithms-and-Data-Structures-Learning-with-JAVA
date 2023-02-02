public class question_02_05 {
    static void copy(int[] a,int []b){
        for(int i=0;i<a.length;i++){
            a[a.length-1-i]=b[i];
        }
    }
    static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={10,516,54,45,1};
        int[] a=new int[arr.length];

        copy(a,arr);
        System.out.print("a : ");
        printArray(a);

        System.out.print("b : ");
        printArray(arr);
    }
}
