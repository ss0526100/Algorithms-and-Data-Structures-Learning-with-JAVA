import java.util.Scanner;
public class question_02_10 {
    final static int VMAX=21;
    static class PhyscData{
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height,double vision){
            this.name=name;
            this.height=height;
            this.vision=vision;
        }
    }
    static double aveHeight(PhyscData[] dat){
        double sum=0;
        for(int i=0;i<dat.length;i++){
            sum+=dat[i].height;
        }
        return sum/dat.length;
    }
    static void distVision(PhyscData[] dat, int[] dist){
        dist[0]=0;
        for(int i=0;i<dat.length;i++){
            if(dat[i].vision>=0&&dat[i].vision<=VMAX/10)dist[(int)(dat[i].vision*10)]++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PhyscData[] x={
            new PhyscData("1", 162, 0.3),
            new PhyscData("2", 173, 0.7),
            new PhyscData("3", 175, 2.0),
            new PhyscData("4", 171, 1.5),
            new PhyscData("5", 168, 0.4),
            new PhyscData("6", 174, 1.2),
            new PhyscData("7", 169, 0.8),
        };
        int[] vdist=new int[VMAX];
        System.out.println("OPhysical test listO");
        System.out.println("name    hei   vision");
        System.out.println("--------------------");
        for(int i=0;i<x.length;i++){
            System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
        }
        System.out.printf("\naverage height:%5.1f cm",aveHeight(x));
        distVision(x, vdist);
        System.out.println("\nvision distribution");
        for(int i=0;i<VMAX;i++){
            System.out.printf("%3.1f~ :",i/10.0);
            for(int j=0;j<vdist[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
