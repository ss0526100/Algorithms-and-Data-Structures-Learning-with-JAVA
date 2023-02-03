import java.util.Scanner;
public class question_02_08 {
    static int mdays[][]={{31,28,31,30,31,30,31,31,30,31,30,31},{31,29,31,30,31,30,31,31,30,31,30,31}};
    static boolean isLeap(int year){
        return year%4==0&&year%100!=0||year%400==0;
    }
    static int dayOfYear(int y, int m, int d){
        int days=d;
        int i=1;
        while(i<m){
            days+=mdays[isLeap(y)?1:0][i-1];
            i++;
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int retry;

        System.out.println("Returns the number of elapsed days in the year");
        do{
            System.out.print("Year : ");int year=sc.nextInt();
            System.out.print("Month : ");int month=sc.nextInt();
            System.out.print("Day : ");int day=sc.nextInt();

            System.out.println("It is "+dayOfYear(year, month, day)+"th day of the year");

            System.out.print("Retry?(1.yes / 0.no)");
            retry=sc.nextInt();
        }while(retry==1);
    }
}
