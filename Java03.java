import java.util.*;

public class Java03 {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("첫 번쨰 시간을 입력하세요: ");
        String firstTime=scanner.nextLine();
        System.out.print("두 번쨰 시간을 입력하세요: ");
        String secondTime=scanner.nextLine();
        int hour1=Integer.parseInt(firstTime.substring(0,2));
        int minute1=Integer.parseInt(firstTime.substring(3,5));
        int second1=Integer.parseInt(firstTime.substring(6,8));
        int hour2=Integer.parseInt(secondTime.substring(0,2));
        int minute2=Integer.parseInt(secondTime.substring(3,5));
        int second2=Integer.parseInt(secondTime.substring(6,8));
        int a=0;
        int b=0;
        int c=0;
        if(second2>=second1) {
            c = second2 - second1;
        }
        if(second2<second1){
            c=second2+60-second1;
            minute2=minute2-1;
        }
        if(minute2>=minute1) {
            b = minute2 - minute1;
        }
        if(minute2<minute1){
            c=minute2+60-minute1;
            hour2-=1;
        }
        if(hour2>=hour1) {
             a = hour2 - hour1;
        }

        System.out.println(a+":"+b+":"+c);
    }
}
